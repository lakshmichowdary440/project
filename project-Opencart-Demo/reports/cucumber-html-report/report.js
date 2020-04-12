$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Project/project.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 24,
  "name": "To check with valid credentails",
  "description": "",
  "id": "title-of-your-feature;to-check-with-valid-credentails",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@tc01_RegisterandLogin"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user creates a new account",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and clicks",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;to-check-with-valid-credentails;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31,
      "id": "title-of-your-feature;to-check-with-valid-credentails;;1"
    },
    {
      "cells": [
        "lakshmichowdary440a@gmail.com",
        "Glucky@196"
      ],
      "line": 32,
      "id": "title-of-your-feature;to-check-with-valid-credentails;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "To check with valid credentails",
  "description": "",
  "id": "title-of-your-feature;to-check-with-valid-credentails;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@tc01_RegisterandLogin"
    },
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user creates a new account",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the user enters \"lakshmichowdary440a@gmail.com\" and \"Glucky@196\" and clicks",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterAndLogin.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 32172785300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterAndLogin.the_user_creates_a_new_account()"
});
formatter.result({
  "duration": 10448626400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lakshmichowdary440a@gmail.com",
      "offset": 17
    },
    {
      "val": "Glucky@196",
      "offset": 53
    }
  ],
  "location": "RegisterAndLogin.the_user_enters_and_and_clicks(String,String)"
});
formatter.result({
  "duration": 10134816900,
  "status": "passed"
});
});