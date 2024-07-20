Feature: Verify the added item details on checkout page

@CheckoutPage
Scenario Outline: Add item and validate the details on checkout page
Given user is on Greencart landing page
When user searched with shortName <Vegetables_Names> and extracted actual name of product
And Added <itemQuantity> items of the searched item to the cart
Then user proceeds to the checkout and validate the vegetable name in checkout page
And verify user has ability to apply coupon and place the order

Examples:
|Vegetables_Names|itemQuantity|
|Tom |3|