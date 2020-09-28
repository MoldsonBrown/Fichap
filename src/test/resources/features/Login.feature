Feature: As a potential client i want to interact with the login functionality

  Scenario Outline: Invalid Login
    Given The fichap app is loaded correctly
    When The user does login process with '<email>' and '<password>'
    Then The modal message is '<message>'

    @Login
    Examples:
      | email                              | password | message                                     |
      | automation@gmail.com               | 123456   | El usuario o la contraseña son incorrectos. |
      | automation2@gmail.com              | 123456   | El usuario o la contraseña son incorrectos. |

  Scenario Outline: Valid Login
    Given The fichap app is loaded correctly
    When The user does login process with '<email>' and '<password>'
    Then The Homepage is displayed

    @Login
    Examples:
      | email                              | password |
      | nelson.ceballos@crowdaronline.com  | ZDTGgP   |





