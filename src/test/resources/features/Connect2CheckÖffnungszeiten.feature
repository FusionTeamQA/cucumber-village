#@VillageTest
Feature: Открыть Leben page, создать запись для коннекшена 2 - проверить юзером 2 коннекшен
  Scenario:  Авторизоваться, открыть Leben, перейти на вкладку Öffnungszeiten, заполнить форму
    выбрав 2 коннекшен, разлогиниться, зайти под юзером 2 коннекшена - проверить создание записи
    Given Open leben|Öffnungszeitenconnect2
    And Open Öffnungszeiten|Öffnungszeitenconnect2
    And create form from 2 connect|Öffnungszeitenconnect2
    And send form|Öffnungszeitenconnect2
    When logout|Öffnungszeitenconnect2
    And login for user 2 connect|Öffnungszeitenconnect2
    And Open laben stage|Öffnungszeitenconnect2
    And Open Öffnungszeitens|Öffnungszeitenconnect2
    Then Record is correct true|Öffnungszeitenconnect2
    And Close Browser|Öffnungszeitenconnect2