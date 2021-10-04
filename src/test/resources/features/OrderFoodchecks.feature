@BrincTest
Feature: Успешное создание заказа с продовольственными купонами залогиненным пользователем
  Scenario: Открыть страницу дев, сделать заказ, оплатить продовольственными купонами
    Given OpenBrowser |Foodcheck
    And Open page Brink DEV |Foodcheck
    And Enter User |Foodcheck
    And Enter Pass |Foodcheck
    And Click botton OK |Foodcheck
    When Click botton Profile |Foodcheck
    And  Enter Benutzername (E-Mail) |Foodcheck
    And  Enter Passwort |Foodcheck
    And  Click botton Anmelden und weiter |Foodcheck
    And  Click botton Quick finder|Foodcheck
    And  Select category American Diner im Cinecitta|Foodcheck
    And Choose the quantity of the product " Arizona Iced Tea Blueberry“ in the size of 5 pcs|Foodcheck
    And Add an item to the cart|Foodcheck
    And Click botton cart|Foodcheck
    And Click botton checkout|Foodcheck
    And Click Continue|Foodcheck
    And Select type Foodcheck|Foodcheck
    And Check the box on "I hereby accept Egourmery's Terms and conditions and Privacy policy“|Foodcheck
    And Click on " Complete order“|Foodcheck
    Then Order complete, browser closed|Foodcheck



