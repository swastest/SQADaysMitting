Feature: Login user
  Everybody wants to know when it's Friday

  #То что выполняется до теста
  Background: Открыта главная страница сайта
    Given Открыть сайт "https://liveinclean.test.itbrick.ru"

  Scenario Outline: Авторизация юзера
    When Нажать на кнопку Личный кабинет
    And Ввести в поле логин номер телефона "<login>"
    And Ввести в поле пароль "<pass>"
    And Нажать на кнопку Войти
    Then Проверка личного кабинета
    Examples:
      | login      | pass |
      | 9055555555 | 1111 |

  Scenario Outline: Негативная проверка авторизации
    When Нажать на кнопку Личный кабинет
    And Ввести в поле логин номер телефона "<login>"
    And Ввести в поле пароль "<passInvalid>"
    And Нажать на кнопку Войти
    Then Проверка ошибки "<messageError>"
    Examples:
      | login      | messageError                              | passInvalid |
      | 9055555555 | Введен неверный номер телефона или пароль | 1234        |

