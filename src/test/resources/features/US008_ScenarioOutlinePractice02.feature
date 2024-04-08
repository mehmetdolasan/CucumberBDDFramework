Feature: Datatables sitesine 5 farkli kullanici girisi yapalim

  Scenario Outline: TC01 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "dataURL" anasayfasina gider
    Then kullanici new butonuna tiklar
    And isim bolumune "<first_name>" yazar
    And kullanici 1 saniye bekler
    And soyisim bolumune "<last_name>" yazar
    And kullanici 1 saniye bekler
    And position bolumune "<position>" yazar
    And kullanici 1 saniye bekler
    And office bolumune "<office>" yazar
    And kullanici 1 saniye bekler
    And extension bolumune "<extension>" yazar
    And kullanici 1 saniye bekler
    And start date bolumune "<startDate>" yazar
    And kullanici 1 saniye bekler
    And salary bolumune "<salary>" yazar
    And kullanici 1 saniye bekler
    And kullanici create butonuna tiklar
    And kullanici 1 saniye bekler
    When kullanici "<first_name>" ile arama yapar
    Then isim bolumunde "<first_name>" oldugunu test eder
    Examples:
      | first_name  | last_name | position        | office | extension | startDate  | salary |
      | Mehmet      | Dolasan   | QA              | Turkey | UI        | 2023-09-05 | 2000   |
      | Omer        | Kirac     | Backend         | Turkey | Mobile    | 2023-05-25 | 5000   |
      | Firat       | Dolasan   | Technic Support | Turkey | API       | 2023-01-20 | 2500   |
      | Yusuf       | Dolasan   | Frontend        | Turkey | Mobile    | 2023-02-15 | 2300   |
      | Taha Bulent | Dursun    | QA              | Turkey | API       | 2023-06-12 | 4000   |

  Scenario: Kullanici sayfayi kapatir
    When sayfayi kapatir
