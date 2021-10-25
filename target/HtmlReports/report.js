$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/News/CreateNewPost.feature");
formatter.feature({
  "name": "Создать новый пост|NewsCreatePost",
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
  "description": "",
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
  "name": "Auth|NewsCreatePost",
  "keyword": "Given "
});
formatter.match({
  "location": "NewsCreatePost.auth_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open stage|NewsCreatePost",
  "keyword": "And "
});
formatter.match({
  "location": "NewsCreatePost.open_stage_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click Neuer Beitrag|NewsCreatePost",
  "keyword": "And "
});
formatter.match({
  "location": "NewsCreatePost.click_Neuer_Beitrag_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open form Neuer Beitrag|NewsCreatePost",
  "keyword": "When "
});
formatter.match({
  "location": "NewsCreatePost.open_form_Neuer_Beitrag_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter Titel der Nachricht|NewsCreatePost",
  "keyword": "And "
});
formatter.match({
  "location": "NewsCreatePost.enter_Titel_der_Nachricht_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter Nachricht|NewsCreatePost",
  "keyword": "And "
});
formatter.match({
  "location": "NewsCreatePost.enter_Nachricht_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click button Posten|NewsCreatePost",
  "keyword": "And "
});
formatter.match({
  "location": "NewsCreatePost.click_button_Posten_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Form send Successful|NewsCreatePost",
  "keyword": "Then "
});
formatter.match({
  "location": "NewsCreatePost.form_send_Successful_NewsCreatePost()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser|NewsCreatePost",
  "keyword": "And "
});
formatter.match({
  "location": "NewsCreatePost.close_Browser_NewsCreatePost()"
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