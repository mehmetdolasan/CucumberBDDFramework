Feature: Background Kullanimi

  Background: Ortak adimlar
    Given kullanici amazon sayfasina gider

  Scenario: TC01 kullanici searchbox test eder
    When kullanici Iphone aratir
    Then kullanici sonuclarin Iphone icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC02 kullanici searchbox test eder
    When kullanici Selenium aratir
    Then kullanici sonuclarin Selenium icerdigini test eder
    And kullanici sayfayi kapatir

  Scenario: TC03 kullanici searchbox test eder
    When kullanici Java aratir
    Then kullanici sonuclarin Java icerdigini test eder
    And kullanici sayfayi kapatir