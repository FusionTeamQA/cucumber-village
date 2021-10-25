$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/News/AddCommentNewPost.feature");
formatter.feature({
  "name": "Создать новый пост и добавить комментарий|NewsCreatePost",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VillageTest"
    }
  ]
});
formatter.scenario({
  "name": "Авторизироваться, открыть Главную страницу, заполнить форму создания поста, отправить",
  "description": "    добавить комментарий, нажать отправить.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VillageTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Auth|AddCommentNewPost",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCommentNewPost.auth_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open stage|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.open_stage_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Neuer Beitrag|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.click_Neuer_Beitrag_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open form Neuer Beitrag|AddCommentNewPost",
  "keyword": "When "
});
formatter.match({
  "location": "AddCommentNewPost.open_form_Neuer_Beitrag_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter Titel der Nachricht|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.enter_Titel_der_Nachricht_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter Nachricht|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.enter_Nachricht_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click button Postens|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.click_button_Postens_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Form send Successful|AddCommentNewPost",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCommentNewPost.form_send_Successful_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Add comment|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.add_comment_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click button Posten|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.click_button_Posten_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser|AddCommentNewPost",
  "keyword": "And "
});
formatter.match({
  "location": "AddCommentNewPost.close_Browser_AddCommentNewPost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});