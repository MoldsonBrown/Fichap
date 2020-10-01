Feature: As a potential client i want to interact with the login functionality

  Scenario Outline: Invalid Login
    Given The fichap app is loaded correctly
    When The user does login process with '<email>' and '<password>'
    Then The modal message is '<message>'

    @Demo
    Examples:
      | email                              | password | message                                     |
      | loginerror@crowdaronline.com       | 123456   | El usuario o la contraseña son incorrectos. |

  Scenario Outline: Valid Login
    Given The fichap app is loaded correctly
    When The user logs in with '<email>' and '<password>'
    Then The Homepage is displayed

    @Demo
    Examples:
      | email                              | password |
      | nelson.ceballos@crowdaronline.com  | ZDTGgP   |