$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/loginPage.feature");
formatter.feature({
  "name": "Swag Labs Landing page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify registered user able to log in with valid credetials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the brower",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_launches_the_brower()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be taken to Products page",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsPageSteps.user_should_be_taken_to_Products_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});