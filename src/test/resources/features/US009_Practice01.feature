Feature: Practice01

  Scenario: TC01 herokuapp adresinden delete butonu calismali
    Given Kullanici "herokuappURL" anasayfasinda
    Then add element butonuna tiklar
    And kullanici 3 saniye bekler
    And Delete butonu gorunur oluncaya dek bekler
    And Delete butonunun gorunur oldugunu test eder
    Then Delete butonuna tiklar
    And Delete butonunun gorunmedigi test
    And sayfayi kapatir