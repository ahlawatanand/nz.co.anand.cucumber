$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/trello.feature");
formatter.feature({
  "line": 1,
  "name": "Trello",
  "description": "",
  "id": "trello",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Trello Invalid login",
  "description": "",
  "id": "trello;trello-invalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on trello homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Login button with \u0027username\u0027 and \u0027password\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login error message is displayed \u0027There isn\u0027t an account for this username\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TrelloLoginPageSD.user_is_on_trello_homepage()"
});
formatter.result({
  "duration": 6877800154,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 34
    },
    {
      "val": "password",
      "offset": 49
    }
  ],
  "location": "TrelloLoginPageSD.user_clicks_on_Login_button_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 2090227570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "There isn\u0027t an account for this username",
      "offset": 34
    }
  ],
  "location": "TrelloLoginPageSD.login_error_message_is_displayed(String)"
});
formatter.result({
  "duration": 690358028,
  "status": "passed"
});
});