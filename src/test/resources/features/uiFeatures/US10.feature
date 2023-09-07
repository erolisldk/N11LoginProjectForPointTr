Feature: Vice Dean should be able to see the Lesson list

  Background:
    Given Kullanici "url" sayfasina gider
    Then Kullanici 3 saniye bekler
    Then Kullanici Login yazisina tiklar
    Then Kullanici User Name alanina "usernameViceDean" password alanina "password" degerini girip giris yapar
    Then Kullanici 2 saniye bekler
    Then Kullanici acilan ekranda Lesson Program bolumune tiklar
    Then Kullanici 2 saniye bekler

  Scenario: Vice Dean Ders Programi pozitif test
    Then Kullanici Add Lesson Program alanindaki Select Lesson menusunun erisilebilir oldugunu dogrular
    Then Kullanici Add Lesson Program alanindaki Select Lesson menusunden JavaScript dersini secer
    Then Kullanici 2 saniye bekler
