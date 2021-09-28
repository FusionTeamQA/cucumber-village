@BrincTest
Feature: Успешное создание заказа с наличной оплатой залогиненным пользователем
  Scenario: Открыть страницу дев, сделать заказ, оплатить наличными
    Given OpenBrowser |OrderCash
    And Open page Brink DEV |OrderCash
    And Enter User |OrderCash
    And Enter Pass |OrderCash
    And Click botton OK |OrderCash
    When Click botton Profile |OrderCash
    And  Enter Benutzername (E-Mail) |OrderCash
    And  Enter Passwort |OrderCash
    And  Click botton Anmelden und weiter |OrderCash
    And  Click botton Quick finder|OrderCash
    And  Select category American Diner im Cinecitta|OrderCash
    And Choose the quantity of the product " Arizona Iced Tea Blueberry“ in the size of 5 pcs|OrderCash
    And Add an item to the cart|OrderCash
    And Click botton cart|OrderCash
    And Click botton checkout|OrderCash
    And Click Continue|OrderCash
    And Check the box on "I hereby accept Egourmery's Terms and conditions and Privacy policy“|OrderCash
    And Click on " Complete order“|OrderCash
    Then Order complete, browser closed|OrderCash



