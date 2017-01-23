$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/budgetcarinsurance/config/WelcomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Welcome Page",
  "description": "As a user \r\nI need to provide my personal details \r\nSo that I can navigate to the next page",
  "id": "welcome-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Before you Begin on Welcome Page",
  "description": "",
  "id": "welcome-page;before-you-begin-on-welcome-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the Welcome page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter following values in welcome screen",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 10
    },
    {
      "cells": [
        "FirstName",
        "BGL"
      ],
      "line": 11
    },
    {
      "cells": [
        "Surname",
        "Pegasus"
      ],
      "line": 12
    },
    {
      "cells": [
        "DateOfBirthDay",
        "01"
      ],
      "line": 13
    },
    {
      "cells": [
        "DateOfBirthMonth",
        "01"
      ],
      "line": 14
    },
    {
      "cells": [
        "DateOfBirthYear",
        "1970"
      ],
      "line": 15
    },
    {
      "cells": [
        "HouseName",
        "Pegasus House"
      ],
      "line": 16
    },
    {
      "cells": [
        "PostCode",
        "PE2 6YS"
      ],
      "line": 17
    },
    {
      "cells": [
        "VehicleRegistration",
        "MV05LPU"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see error message \"Please correct errors marked with\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});