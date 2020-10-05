Feature: As a potential client i want to check-in and check-out

  Scenario Outline: CheckInOut
    Given The user does login process with: '<email>', '<password>'
    When The user checks in
    And The user taps on CheckOutButton
    And The total time spent is displayed
    And The user taps on FinishButton
    Then The Homepage is displayed

    @Demo @CheckInOut
    Examples:
      | email                             | password   |
      | nelson.ceballos@crowdaronline.com | 123459     |
