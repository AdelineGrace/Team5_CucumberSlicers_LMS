Feature: Pagination in manage attendance

  Background: Logged on the LMS portal as Admin

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Data table should display 1 page  when entries available

  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Right arrow should be enabled in page one  when entries are more than 5 available

  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Left arrow should be disabled in page one  when entries are more than 5 available

  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Right arrow should be enabled in page two when entries are more than 10 available

  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Left arrow should be enabled in page two

  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then Data table should displaypage 1 when entriesavailable

  Scenario: Verify pagination controls enabled
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then entries are more than 5 in data table pagination controls enabled

  Scenario: Verify pagination controls disabled
    Given Admin is on dashboard page after Login
    When Admin clicks "attendance" button on the navigation bar
    Then entries are less than 5 in data table pagination controls disabled
