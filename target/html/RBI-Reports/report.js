$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("scenarios/A-BaseLine/01Leads.feature");
formatter.feature({
  "line": 1,
  "name": "Scenarios based on registration",
  "description": "",
  "id": "scenarios-based-on-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 287589,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "We will register a new user to the webshop application",
  "description": "",
  "id": "scenarios-based-on-registration;we-will-register-a-new-user-to-the-webshop-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@BaseLine"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open the browser and access webshop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on \"Register\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am on the \"Register\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I set the Gender field to \"Male\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fill the \"First name:\" field with \"Tamas\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close driver",
  "keyword": "And "
});
formatter.match({
  "location": "userRegistration.navigateToSalesforce()"
});
formatter.result({
  "duration": 12345724419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 12
    }
  ],
  "location": "userRegistration.clickOnLink(String)"
});
formatter.result({
  "duration": 2062184078,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 13
    }
  ],
  "location": "userRegistration.checkPageTitle(String)"
});
formatter.result({
  "duration": 486159413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Male",
      "offset": 27
    }
  ],
  "location": "userRegistration.setRadioButton(String)"
});
formatter.result({
  "duration": 488076948,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First name:",
      "offset": 12
    },
    {
      "val": "Tamas",
      "offset": 37
    }
  ],
  "location": "userRegistration.fillInputField(String,String)"
});
formatter.result({
  "duration": 622257185,
  "status": "passed"
});
formatter.match({
  "location": "userRegistration.closeBrowser()"
});
formatter.result({
  "duration": 1016412274,
  "status": "passed"
});
});