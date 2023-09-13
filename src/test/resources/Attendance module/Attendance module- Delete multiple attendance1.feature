Feature: Delete multiple Attendance Validation

  Background: Admin clicks delete button under header after selecting the check box in the data table
    Admin clicks delete button under header after selecting the multiple check box in the data table


  Scenario: Verify accept alert in delete multiple attendance by selecting single checkbox
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Success message and selected attendance detail are deleted from the data table

  Scenario: Verify reject alert in delete multiple attendance by selecting single checkbox
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to attendance page and selected attendance details are not deleted from the data table

  Scenario: Verify accept alert in delete multiple attendance by selecting multiple checkbox
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Success message and validate particular attendance details are deleted from the data table

  Scenario: Verify reject alert in delete multiple attendance by selecting multiple checkbox
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to attendance page and selected attendance details are not deleted from the data table
