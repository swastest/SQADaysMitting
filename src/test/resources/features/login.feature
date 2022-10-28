Feature: Login user
  Everybody wants to know when it's Friday

  Scenario: Login user
    When Нажать на кнопку Личный кабинет
    Then Ввести в поле логин номер телефона "9055555555"
    Then Ввести в поле пароль "1111"
    Then Нажать на кнопку Войти
    Then Проверка личного кабинета

#  Scenario: Friday is Friday
#    Given today is Friday
#    When I ask whether it's Friday yet
#    Then I should be told "TGIF"