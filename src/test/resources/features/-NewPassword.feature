Feature: As a potential client i want to change my password for security purposes

  Scenario Outline: Change Password
    Given The user does login process with: '<email>', '<password>'
    When The user changes the password with '<newPassword>' and '<newPasswordConfirmation>'
    Then The modal message is '<message>'

    @Demo @ChangePassword
    #si se ejecuta este feature primero, no hará falta actualizar las contraseñas en los demás features.
        Examples:
      | email                             | password    | newPassword    | newPasswordConfirmation  | message                       |
      | nelson.ceballos@crowdaronline.com | 123458      | 123459         |  123459                  | Cambio de contraseña exitoso! |