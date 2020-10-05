Feature: As a potential client i want to change my password for security purposes

  Scenario Outline: Change Password
    Given The user does login process with: '<email>', '<password>'
    When The user changes the password with '<newPassword>' and '<newPasswordConfirmation>'
    Then The modal message is '<message>'

    @Demo @ChangePassword
    #si se ejecuta este feature primero (mvn clean test), no hará falta actualizar las passwords de los demás features.
        Examples:
      | email                             | password    | newPassword    | newPasswordConfirmation  | message                       |
      | nelson.ceballos@crowdaronline.com | 123458      | 123459         |  123459                  | Cambio de contraseña exitoso! |