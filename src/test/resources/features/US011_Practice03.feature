Feature: Practice03

  Scenario Outline: TC01 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruURL" anasayfasinda
    And "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: kullanici sayfayi kapatir
    Given kullanici sayfayi kapatir
