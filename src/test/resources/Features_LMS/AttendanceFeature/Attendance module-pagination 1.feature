Feature: Pagination in manage attendance

  Background: Admin click +Add New attendance button after reaching to Manage attendance page

  Scenario: Verify next page is enabled
    Given Admin is in add attendance details popup window
    When Admin creates 6 new attendance
    Then total attendance entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)

  Scenario: verify next page is disabled
    Given Admin is in add attendance details popup window
    When Admin creates less than or equal to 5 new attendance
    Then total attendance entries  5 or below next page is disabled
