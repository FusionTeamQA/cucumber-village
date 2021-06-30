@StaffTest
  Feature: Поменять имя и фамилию у сотрудника, сохраниться и выйти
    Scenario: Авторизироваться, изменить и сохранить
      Given Open browser editusername
      And open page Staff DEV editusername
      And open page info sotr editusername
      When click edit bottom editusername
      And clear field first name
      And enter first name
      And clear field last name
      And enter last name
      And Click bottom Save editusername
      Then First name end Last name changed

