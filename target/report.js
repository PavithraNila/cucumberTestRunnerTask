$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/MobileValidation.feature");
formatter.feature({
  "name": "realme mobile validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches flipkart applications",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileValidation.user_launches_flipkart_applications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering valid credetials",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.user_login_by_entering_valid_credetials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "HardCoded Values",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@tag1"
    },
    {
      "name": "@map"
    }
  ]
});
formatter.step({
  "name": "user Search mobile",
  "keyword": "When "
});
formatter.match({
  "location": "MobileValidation.user_Search_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.user_click_on_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the mobile name",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileValidation.user_validate_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches flipkart applications",
  "keyword": "Given "
});
formatter.match({
  "location": "MobileValidation.user_launches_flipkart_applications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering valid credetials",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.user_login_by_entering_valid_credetials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Data Table values",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@map"
    },
    {
      "name": "@iphones"
    }
  ]
});
formatter.step({
  "name": "user Search mobile by one dim List",
  "rows": [
    {
      "cells": [
        "realme",
        "SAMSUNG",
        "iphones"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobileValidation.user_Search_mobile_by_one_dim_List(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the mobile name",
  "keyword": "And "
});
formatter.match({
  "location": "MobileValidation.user_click_on_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the mobile name",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileValidation.user_validate_the_mobile_name()"
});
formatter.result({
  "status": "passed"
});
});