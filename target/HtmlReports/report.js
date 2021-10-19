$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Connect2CheckÖffnungszeiten.feature");
formatter.feature({
  "name": "Открыть Leben page, создать запись для коннекшена 2 - проверить юзером 2 коннекшен",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VillageTest"
    }
  ]
});
formatter.scenario({
  "name": "Авторизоваться, открыть Leben, перейти на вкладку Öffnungszeiten, заполнить форму",
  "description": "    выбрав 2 коннекшен, разлогиниться, зайти под юзером 2 коннекшена - проверить создание записи",
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
  "name": "Open leben|Öffnungszeitenconnect2",
  "keyword": "Given "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.open_leben_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Open Öffnungszeiten|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.open_Öffnungszeiten_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "create form from 2 connect|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.create_form_from_connect_Öffnungszeitenconnect(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "send form|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.send_form_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@id\u003d\"main-container\"]/div/div[2]/h4 (tried for 30 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat org.dep.example.steps.Connect2CheckÖffnungszeiten.send_form_Öffnungszeitenconnect(Connect2CheckÖffnungszeiten.java:87)\n\tat ✽.send form|Öffnungszeitenconnect2(file:src/test/resources/features/Connect2CheckÖffnungszeiten.feature:8)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"main-container\"]/div/div[2]/h4\"}\n  (Session info: chrome\u003d94.0.4606.81)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Fusions-MacBook-Air-123.local\u0027, ip: \u0027fe80:0:0:0:c0f:e0d0:ba61:9359%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027aarch64\u0027, os.version: \u002711.6\u0027, java.version: \u002716.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.81, chrome: {chromedriverVersion: 94.0.4606.61 (418b78f5838ed..., userDataDir: /var/folders/ks/ck9trpfs5yx...}, goog:chromeOptions: {debuggerAddress: localhost:61420}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4ffb154fd36bd6114f2f799751d41b7a\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"main-container\"]/div/div[2]/h4}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\n\tat org.dep.example.steps.Connect2CheckÖffnungszeiten.send_form_Öffnungszeitenconnect(Connect2CheckÖffnungszeiten.java:87)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\n\tat io.cucumber.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:79)\n\tat io.cucumber.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:24)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\n\tat org.testng.TestRunner.run(TestRunner.java:505)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\n\tat org.testng.TestNG.run(TestNG.java:1017)\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Авторизоваться, открыть Leben, перейти на вкладку Öffnungszeiten, заполнить форму_2021-10-19_13:36:33");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "logout|Öffnungszeitenconnect2",
  "keyword": "When "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.logout_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "login for user 2 connect|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.login_for_user_connect_Öffnungszeitenconnect(Integer,Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "Open laben stage|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.open_laben_stage_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "Open Öffnungszeitens|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.open_Öffnungszeitens_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "Record is correct true|Öffnungszeitenconnect2",
  "keyword": "Then "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.record_is_correct_true_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.step({
  "name": "Close Browser|Öffnungszeitenconnect2",
  "keyword": "And "
});
formatter.match({
  "location": "Connect2CheckÖffnungszeiten.close_Browser_Öffnungszeitenconnect(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});