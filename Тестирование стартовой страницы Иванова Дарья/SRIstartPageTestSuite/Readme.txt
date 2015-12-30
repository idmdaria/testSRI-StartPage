Для запуска необходимы следующие инструменты:
1. IDE для Java (Eclipse, NetBeans, IDEA)
2. Java 8
3. Стандартная внешняя библиотека JUnit 4
4. Внешняя библиотека Selenium Server Standalone 2.48.2 (приложена к проекту)


Порядок запуска проекта (для Eclipse):
1. Откройте IDE, выберите место для workspace, если оно не выбрано заранее
2. File -> Import -> General -> Existing Project into Workspace -> Next 
Выберите папку, содержащую проект. 
3. Для запуска проекта необходимо подключить внешние библиотеки. Для этого: 
	3.1 Правой кнопкой по папке проекта -> Properties -> Java Build Path -> Add Library -> User Library -> User Libraries -> New
	3.2 Создайте новую библиотеку с произвольным именем
	3.3 Выберите Add external JARs, после чего найдите в приложенной папке файл selenium-server-standalone
4. Также для запуска проекта необходимо подключить библиотеку JUnit4. Для этого:
	4.1 Правой кнопкой по папке проекта -> Properties -> Java Build Path -> Add Library -> JUnit -> JUnit4
