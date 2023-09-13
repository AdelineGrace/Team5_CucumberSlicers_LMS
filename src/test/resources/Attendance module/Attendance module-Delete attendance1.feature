Feature: Delete Attendance Validation

  Background: Admin clicks row level delete button after landing to manage attendance page

  Scenario: Validate accept in alert
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Success message and selected attendance details are deleted from the data table

  Scenario: Validate reject in alert
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected attendance page and selected attendance details are not deleted from the data table
