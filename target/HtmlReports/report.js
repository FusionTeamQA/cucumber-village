$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LebenInVillage/Login.feature");
formatter.feature({
  "name": "Авторизация",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Пройти успешную авторизацию",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open browser|Login",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.open_browser_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open stage|Login",
  "keyword": "And "
});
formatter.match({
  "location": "Login.open_stage_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter login|Login",
  "keyword": "When "
});
formatter.match({
  "location": "Login.enter_login_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Enter Password|Login",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enter_Password_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Click button Login|Login",
  "keyword": "And "
});
formatter.match({
  "location": "Login.click_button_Login_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Successful open home page|Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.successful_open_home_page_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Login.close_Browser()"
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