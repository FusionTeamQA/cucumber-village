@VillageTest
Feature: Создать новый пост и добавить комментарий|NewsCreatePost
  Scenario: Авторизироваться, открыть Главную страницу, заполнить форму создания поста, отправить
    добавить комментарий, нажать отправить.
    Given Auth|AddCommentNewPost
    And Open stage|AddCommentNewPost
    And Click Neuer Beitrag|AddCommentNewPost
    When Open form Neuer Beitrag|AddCommentNewPost
    And Enter Titel der Nachricht|AddCommentNewPost
    And Enter Nachricht|AddCommentNewPost
    And Click button Postens|AddCommentNewPost
    Then Form send Successful|AddCommentNewPost
    And Add comment|AddCommentNewPost
    And Click button Posten|AddCommentNewPost
    And Close Browser|AddCommentNewPost
