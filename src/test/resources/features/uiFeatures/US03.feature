@Contact
  Feature: Contact

    Background:
     Given Kullanici anasayfaya girer
     When Kullanici Contact butonuna tıklar


    Scenario:Pozitif Contact tc01

      And Kullanici Your name kutucuguna gecerli name "samet" girer
      And Kullanici Your email kutucuguna gecerli mail "smt@gmail.com" girer
      And Kullanici Subject kutucuguna gecerli ders "java" girer
      And Kullanici Message kutucuguna gecerli mesaj "yeni mail adresim smt40.!-@gmail.com" girer
      And Kullanici Send Message butonuna tiklar
      And Kullanici Contact Message Created Successfully uyarisini gorunurlugunu test eder


    Scenario: Negatif email tc02 ( @ ve . yok)

      And Kullanici Your name kutucuguna gecerli name "samet" girer
      And Kullanici Your email kutucuguna gecersiz mail "smtgmailcom" girer
      And Kullanici Subject kutucuguna gecerli ders "java" girer
      And Kullanici Message kutucuguna gecerli mesaj "yeni mail adresim smt40.!-@gmail.com" girer
      And Kullanici Send Message butonuna tiklar
      And Kullanici Please enter valid email uyarisinin gorunurlugunu test eder


    Scenario: Negatif email tc03 ( @ yok )

      And Kullanici Your name kutucuguna gecerli name "samet" girer
      And Kullanici Your email kutucuguna gecersiz mail "smtgmail.com" girer
      And Kullanici Subject kutucuguna gecerli ders "java" girer
      And Kullanici Message kutucuguna gecerli mesaj "yeni mail adresim smt40.!-@gmail.com" girer
      And Kullanici Send Message butonuna tiklar
      And Kullanici Please enter valid email uyarisinin gorunurlugunu test eder


    Scenario: Negatif email tc04 ( . yok)

      And Kullanici Your name kutucuguna gecerli name "samet" girer
      And Kullanici Your email kutucuguna gecersiz mail "smt@gmailcom" girer
      And Kullanici Subject kutucuguna gecerli ders "java" girer
      And Kullanici Message kutucuguna gecerli mesaj "yeni mail adresim smt40.!-@gmail.com" girer
      And Kullanici Send Message butonuna tiklar
      And Kullanici Please enter valid email uyarisinin gorunurlugunu test eder