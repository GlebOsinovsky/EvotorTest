**Evotor UI Test Automation** 

Установка и исполнение 🧑🏻‍💻

Пожалуйста, установите все зависимости из файла POM
убедитесь, что у вас есть:
JDK11
Maven 11

Скомпилируйте и выполните тесты с помощью команды mvn clean test (конфигурация testng xml уже установлена в настройках сборки)

EvotorBaseTest:


Условие:

Откройте https://market.evotor.ru/store/apps/e7e1a9af-d0ad-4dec-97ce-8b27805c145d


Steps:

1.Нажмите на кнопку корзины на карточке "Базовая подписка"
    Ожидаемый результат: товар добавлен в корзину

2.Нажмите на значок корзины в верхней части страницы
    Ожидаемый результат: Появляется диалоговое окно в котором указан добавленный товар

