@BrincTest
Feature: Регистрация пользователя успешная
  Scenario: Открыть сайт, зарегистрировать пользователя и закрыть браузер
    Given OpenBrowser |SignUp
    And Open page Brink DEV |SignUp
    And Enter User |SignUp
    And Enter Pass |SignUp
    And Click botton OK |SignUp
    When Click botton Profile |SignUp
    And  Click botton Hier registrieren |SignUp
    And  Enter Benutzername (E-Mail) |SignUp
    And  Enter Passwort |SignUp
    And  Enter Passwort wiederholen |SignUp
    And  Click botton Registrieren |SignUp
    Then Account create successfully browser closed |SignUp