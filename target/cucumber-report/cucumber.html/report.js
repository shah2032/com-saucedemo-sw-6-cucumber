$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("loginPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13438372200,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "I am on login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "User should login successful with valid credentials",
  "description": "",
  "id": "login-test;user-should-login-successful-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I enter email id in email field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I enter password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see text Products",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iEnterEmailIdInEmailField()"
});
formatter.result({
  "duration": 535938500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iEnterPasswordInPasswordField()"
});
formatter.result({
  "duration": 133385700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 186252400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iShouldSeeTextProducts()"
});
formatter.result({
  "duration": 99437500,
  "status": "passed"
});
formatter.after({
  "duration": 19794758200,
  "status": "passed"
});
});