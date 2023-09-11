Dear QA Tester,

This README provides essential information about the Java Selenium test project.
This project consists of UI tests for two main features: N11Login and N11SearchKeyword.

Test Features
N11Login.feature (Location: src/test/resources/features/uiFeatures/N11Login.feature)
N11SearchKeyword.feature (Location: src/test/resources/features/uiFeatures/N11SearchKeyword.feature)

Test Execution
The test execution is managed through the Runner class, which runs both the Login and Search Keyword features.
You can find the Runner class here:

Runner (Location: src/test/java/runners/Runner.java)
If you wish to run a specific scenario or modify the test configuration, you can use the specific tags.
Modify the 'tags' parameter as needed and run the needed scnerioa or feature.


Screenshots: Screenshots taken during the test execution are stored in the test-output/Screenshots directory.

Login Error Log: The loginerror.txt file, which contains login-related errors, can be found in the main project folder.

Browser Configuration
If you need to change the browser for the test, you can modify the browser name in the configuration.properties file.
After making this change, please ensure that you rebuild the project before running the test using the instructions mentioned above.

Thank you for your contributions to this Selenium test project.
If you have any questions or encounter issues, please feel free to reach out for assistance.

Happy testing!

