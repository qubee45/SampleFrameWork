@regreesion @Smoke
Feature: Walmart Search and Add to cart Functionality 

Scenario: Search for Chrismas Tree
Given Open Walmart Homepage
When Search for Chrismas Tree
And Item list should have only Chrismas Tree related products
And Add Chrismas Tree to the cart
Then Cart item should have Chrismas Tree
