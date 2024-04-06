Feature: BRC practice

  @practice
  Scenario: TC01 Kullanici gecerli bilgilerle giris testi yapar
    Given kullanici "brcURL" anasayfasinda
    And kullanici 2 saniye bekler
    Then login yazisina tiklar
    And kullanici 2 saniye bekler
    Then gecersiz username girer
    And kullanici 2 saniye bekler
    Then gecersiz password girer
    And kullanici 2 saniye bekler
    Then login butonuna tiklar
    And kullanici 2 saniye bekler
    Then sayfaya giris yapilmadigini test eder
    And sayfayi kapatir
