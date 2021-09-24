@BrincTest
Feature: Регистрация пользователя не успешная (Негатив тест)
  Scenario: Открыть сайт, получить ошибку при регистрации ввода почты и закрыть браузер
    Given OpenBrowser |SignUpNegative
    And Open page Brink DEV |SignUpNegative
    And Enter User |SignUpNegative
    And Enter Pass |SignUpNegative
    And Click botton OK |SignUpNegative
    When Click botton Profile |SignUpNegative
    And  Click botton Hier registrieren |SignUpNegative
    And  Enter notvalid Benutzername (E-Mail) |SignUpNegative
    And  Enter Passwort |SignUpNegative
    And  Enter Passwort wiederholen |SignUpNegative
    And  Click botton Registrieren |SignUpNegative
    Then Account not create successfully browser closed |SignUpNegative