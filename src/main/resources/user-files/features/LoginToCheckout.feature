# Created by prateekl at 15/06/19
Feature: LoginToCheckout

  Scenario Outline: Verify user journey from login till checkouts
    When User log in using <emailAddress> and <password>
    And User went to cult page
    Then User selects pack <packId>, subscription start date <startDate> and creates order
    Examples:
    |emailAddress|password|packId|startDate|
    |prateek@hotstar.com|2b8b88f77e10b8007efc29e440c7fc4513708b19f7a2d78091a95a10d3e2c160|35|2019-06-21|
