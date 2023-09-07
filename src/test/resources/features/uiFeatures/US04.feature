@Dean
  Feature: Dean kayit

    Background:
      Given Kullanici anasayfaya girer
      Then  Kullanici Login  tiklar
        And Kullanici User Name girer
        And Kullanici Password girer
        And Kullanici Login butonuna tiklar
        And Kullanici Menu tiklar
        And Kullanici Dean Management tiklar
        And Kullanici Name "samet" girer
        And Kullanici  Surname "ozcelik" girer
        And Kullanici Birth Place "karaman" girer
        And Kullanici Gender tiklar
        And Kullanici Date Of Birth "01-08-1991" girer

    Scenario:  Pozitif Dean tc05

      And Kullanici  gecerli Phone numarasi girer
      And Kullanici gecerli Ssn numarasi girer
      And Kullanici Name girer
      And Kullanici gecerli Password "Ab142788." girer
      And Kullanici submit butonu tiklar
      And Kullanici Dean Saved uyarisinin görünürlügünü test eder

    Scenario: Negatif gecersiz eksik phone number tc06

      And Kullanici  gecersiz eksik "395 254 54"Phone numarasi girer
      And Kullanici gecerli Ssn numarasi girer
      And Kullanici Name girer
      And Kullanici gecerli Password "Ab142788." girer
      And Kullanici submit butonu tiklar
      And Kullanici giris yapilamadigini dogrular

    Scenario: Negatif gecersiz phone number tc07

      And Kullanici  gecersiz eksik "3954 2544 5444"Phone numarasi girer
      And Kullanici gecerli Ssn numarasi girer
      And Kullanici Name girer
      And Kullanici gecerli Password "Ab142788." girer
      And Kullanici submit butonu tiklar
      And Kullanici Please enter valid phone uyarisinin gorunurlugunu test eder

    Scenario: Negatif gecersiz eksik Ssn number tc08

      And Kullanici  gecerli Phone numarasi girer
      And Kullanici gecersiz eksik "123-8-4" Ssn numarisi girer
      And Kullanici Name girer
      And Kullanici gecerli Password "Ab142788." girer
      And Kullanici submit butonu tiklar
      And Kullanici giris yapilamadigini dogrular

    Scenario: Negatif gecersiz eksik Ssn number tc09

      And Kullanici  gecerli Phone numarasi girer
      And Kullanici gecersiz "1234-8-4777" Ssn numarisi girer
      And Kullanici Name girer
      And Kullanici gecerli Password "Ab142788." girer
      And Kullanici submit butonu tiklar
      And Kullanici Please enter valid phone uyarisinin gorunurlugunu test eder

