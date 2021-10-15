Feature: Открыть вкладку Leben in Stage
  Scenario: Авторизироваться, открыть вкладку Leben in Stage
    Given Open browser|Login
    And Open stage|Login
    And Enter login|Login
    And Enter Password|Login
    And Click button Login|Login
    When Successful open home page|Login
    And Click botton Leben in Stage|OpenLeben
    And Close Browser