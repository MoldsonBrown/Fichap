Feature: As a potential client i want to fill in a request with date and reason

  Scenario Outline: New request
    Given The user does login process with: '<email>', '<password>'
    When The user creates a new request with date and '<reason>'
    Then The confirmation message is '<message>'

    @Demo @Request
    Examples:
      | email                             | password   | reason | message                |
      | nelson.ceballos@crowdaronline.com | 123459     | test   | ¡Solicitud registrada! |
