Feature: Parametre ve ConfigReader Kullanimi

  @ConfigReader
  Scenario: TC01 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "faceURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url in "facebook" oldugunu test eder
    And sayfayi kapatir


  Scenario: TC02 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "google" sayfasina gider
    Then kullanici 2 saniye bekler
    When url in "google" oldugunu test eder
    And sayfayi kapatir


  Scenario: TC03 Parametre kullaniminda ConfigReader kullanimi
    Given kullanici "amazonURL" sayfasina gider
    Then kullanici 2 saniye bekler
    When url in "amazon" oldugunu test eder
    And sayfayi kapatir