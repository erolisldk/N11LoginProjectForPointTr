package uiStepDefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.layout.PatternLayout;

public class DynamicLogFileName {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(DynamicLogFileName.class);

        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        Configuration config = context.getConfiguration();
        LoggerConfig loggerConfig = config.getLoggerConfig(logger.getName());

        String logLevel = "INFO";
        String fileName = "erol-${date:dd-MM-yyyy_HHmmss}.txt";
        if ("ERROR".equalsIgnoreCase(logLevel)) {
            fileName = "mustafa-${date:dd-MM-yyyy_HHmmss}.txt";
        }

        // Özel bir PatternLayout oluşturun (isteğe bağlı)
        PatternLayout patternLayout = PatternLayout.newBuilder()
                .withPattern("%d{dd.MM.yyyy HH:mm:ss} %-5level %c %m%n")
                .withConfiguration(config)
                .build();

        // Yeni FileAppender'ı yapılandırın
        FileAppender fileAppender = FileAppender.newBuilder()
                .withFileName(fileName)
                .withAppend(true)
                .withName("File")
                .setLayout(patternLayout) // Özel PatternLayout kullanımı (isteğe bağlı)
                .setConfiguration(config)
                .build();

        fileAppender.start(); // FileAppender'ı başlatın
        config.addAppender(fileAppender); // Appender'ı yapılandırmaya ekleyin
        loggerConfig.addAppender(fileAppender, null, null); // LoggerConfig'a Appender'ı ekleyin

        // Loglama düzeyini ayarlayın (INFO olarak ayarlanmıştır)
        loggerConfig.setLevel(org.apache.logging.log4j.Level.INFO);

        // Yapılandırmayı güncelleyin
        context.updateLoggers();

        // Log mesajları gönderin.
        logger.info("Bu bir info mesajıdır.");
        logger.error("Bu bir hata mesajıdır.");

        // İşlem sonunda loglayıcıları kapatmayı unutmayın.
        context.stop();
    }
}