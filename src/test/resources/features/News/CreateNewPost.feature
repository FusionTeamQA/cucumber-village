@VillageTest
Feature: Создать новый пост|NewsCreatePost
  Scenario: Авторизироваться, открыть Главную страницу, заполнить форму создания поста, отправить
    Given Auth|NewsCreatePost
    And Open stage|NewsCreatePost
    And Click Neuer Beitrag|NewsCreatePost
    When Open form Neuer Beitrag|NewsCreatePost
    And Enter Titel der Nachricht|NewsCreatePost
    And Enter Nachricht|NewsCreatePost
    And Click button Posten|NewsCreatePost
    Then Form send Successful|NewsCreatePost
    And Close Browser|NewsCreatePost