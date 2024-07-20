Feature: Search and Place the order for items

@OffersPage
Scenario Outline: Search experience for product search in both home and offers page
Given user is on Greencart landing page  
When user searched with shortName <Vegetables_Names> and extracted actual name of product
Then user searched for <Vegetables_Names> shortName in offers page
And validate item name in offers page matches with Landing page

Examples:
|Vegetables_Names|
|Tom|
|Beet|