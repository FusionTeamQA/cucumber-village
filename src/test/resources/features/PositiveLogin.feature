@BrincTest
Feature: Успешный логин
  Scenario: Открыть сайт, успешно авторизироваться
    Given OpenBrowser |LoginPositive
    And Open page Brink DEV |LoginPositive
    And Enter User |LoginPositive
    And Enter Pass |LoginPositive
    And Click botton OK |LoginPositive
    When Click botton Profile |LoginPositive
    And  Enter Benutzername (E-Mail) |LoginPositive
    And  Enter Passwort |LoginPositive
    And  Click botton Registrieren |LoginPositive
    Then Account login successfully and browser closed |LoginPositive