$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/E:/sumita/Eclipse_project/src/test/resources/features/third.feature");
formatter.feature({
  "name": "REST API testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To get activity using ID",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "My API Server is up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "apistepdef.my_API_Server_is_up_and_Running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i access \"GET\" REST API with url as \"https://$$DOMAIN_NAME$$/api/v1/Activities/15\"",
  "keyword": "When "
});
formatter.match({
  "location": "apistepdef.i_access_REST_API_with_url_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should give me \"200\" response",
  "keyword": "Then "
});
formatter.match({
  "location": "apistepdef.it_should_give_me_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should contain below value",
  "rows": [
    {
      "cells": [
        "id\u003d5"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "apistepdef.response_should_contain_below_value(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Activity",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "My API Server is up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "apistepdef.my_API_Server_is_up_and_Running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i access \"POST\" REST API with url as \"https://$$DOMAIN_NAME$$/api/v1/Activities\" and data from \"Activities.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "apistepdef.i_access_REST_API_with_url_as_and_data_from(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should give me \"200\" response",
  "keyword": "Then "
});
formatter.match({
  "location": "apistepdef.it_should_give_me_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Author",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "My API Server is up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "apistepdef.my_API_Server_is_up_and_Running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i access \"POST\" REST API with url as \"https://$$DOMAIN_NAME$$/api/v1/Authors\" and data from \"Author.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "apistepdef.i_access_REST_API_with_url_as_and_data_from(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should give me \"200\" response",
  "keyword": "Then "
});
formatter.match({
  "location": "apistepdef.it_should_give_me_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Get Book detail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "My API Server is up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "apistepdef.my_API_Server_is_up_and_Running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i access \"POST\" REST API with url as \"https://$$DOMAIN_NAME$$/api/v1/Books\" and data from \"Book.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "apistepdef.i_access_REST_API_with_url_as_and_data_from(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should give me \"200\" response",
  "keyword": "Then "
});
formatter.match({
  "location": "apistepdef.it_should_give_me_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Update Book detail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "My API Server is up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "apistepdef.my_API_Server_is_up_and_Running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i access \"PUT\" REST API with url as \"https://$$DOMAIN_NAME$$/api/v1/Books/5\" and data from \"Book_update.json\" to update the record",
  "keyword": "When "
});
formatter.match({
  "location": "apistepdef.i_access_REST_API_with_url_as_and_data_from_to_update_the_record(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should give me \"200\" response",
  "keyword": "Then "
});
formatter.match({
  "location": "apistepdef.it_should_give_me_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should get contain below value",
  "keyword": "And "
});
formatter.match({
  "location": "apistepdef.response_should_get_contain_below_value()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Delete Book detail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "My API Server is up and Running",
  "keyword": "Given "
});
formatter.match({
  "location": "apistepdef.my_API_Server_is_up_and_Running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i DELETE Record REST API with url as \"https://$$DOMAIN_NAME$$/api/v1/Books/5\"",
  "keyword": "When "
});
formatter.match({
  "location": "apistepdef.i_DELETE_Record_REST_API_with_url_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should give me \"200\" response",
  "keyword": "Then "
});
formatter.match({
  "location": "apistepdef.it_should_give_me_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should get contain below value",
  "keyword": "And "
});
formatter.match({
  "location": "apistepdef.response_should_get_contain_below_value()"
});
formatter.result({
  "status": "passed"
});
});