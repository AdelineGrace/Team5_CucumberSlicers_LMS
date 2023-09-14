Feature: Delete Attendance Validation

  Background: Admin logged into LMS portal and clicks attendance button on the navigation bar

  @Attendance
  Scenario: Verify Delete attendance alert
    Given Admin is in manage attendance page
    When Admin clicks delete button in data table row level
    Then Admin should see alert

  Scenario: Verify  accept enabled in alert
    Given Admin is in manage attendance page
    When Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept

  Scenario: Verify reject enabled in alert
    Given Admin is in manage attendance page
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject
