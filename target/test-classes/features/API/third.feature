
Feature: REST API testing
@regression @api @sanity
Scenario: To get activity using ID 
Given My API Server is up and Running
When i access "GET" REST API with url as "https://$$DOMAIN_NAME$$/api/v1/Activities/15"
Then it should give me "200" response
And response should contain below value
|id=5|

@regression @api
Scenario: Create Activity
Given My API Server is up and Running
When i access "POST" REST API with url as "https://$$DOMAIN_NAME$$/api/v1/Activities" and data from "Activities.json"
Then it should give me "200" response


@regression @api 
Scenario: Create Author
Given My API Server is up and Running
When i access "POST" REST API with url as "https://$$DOMAIN_NAME$$/api/v1/Authors" and data from "Author.json"
Then it should give me "200" response


@regression @api
Scenario: To Get Book detail
Given My API Server is up and Running
When i access "POST" REST API with url as "https://$$DOMAIN_NAME$$/api/v1/Books" and data from "Book.json"
Then it should give me "200" response

@regression @api
Scenario: To Update Book detail
Given My API Server is up and Running
When i access "PUT" REST API with url as "https://$$DOMAIN_NAME$$/api/v1/Books/5" and data from "Book_update.json" to update the record
Then it should give me "200" response
And response should get contain below value

@regression @api
Scenario: To Delete Book detail
Given My API Server is up and Running
When i DELETE Record REST API with url as "https://$$DOMAIN_NAME$$/api/v1/Books/5" 
Then it should give me "200" response
And response should get contain below value

