Feature: Search a Product
  Scenario: Search a Simple Product with Sucess
    Given I acess Petz homepage
    When I search"Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    Then I see a list of product "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    And I click at product "Aquário Boyu Curvo 100 187 Litros Preto Champagne"
    Then Show the Title "Aquário Boyu Curvo 100 187 Litros Preto Champagne" and price "3.199,99"