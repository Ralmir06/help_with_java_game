Немного поправил пример от Данила

# Тезисы
Чтобы проще обмениваться кодом и правками к нему,
лучше всего использовать [Git](https://git-scm.com/) вместе с [Github](https://github.com/).
Как начать и прочая документация [тут](https://help.github.com/en) (см. "Getting Started").

А чтобы сборка проекта не зависела от IDE и для управления зависимостями,
предлагается использовать [Gradle](https://gradle.org/).
[Документация](https://docs.gradle.org/current/userguide/userguide.html).


# Без IDE
Запустить можно так (сначала перейти в папку с проектом):
```sh
./gradlew run
# или
./gradlew -PmainClass=java_game.Program1 run
```
Под Windows вместо `./gradlew` нужно использовать `gradlew.bat`

А собрать в пакет, распаковать его и запустить так:
```sh
./gradlew distZip
cd build/distributions
unzip java_game.zip
cd java_game
./bin/java_game
```

Или под Windows:
1. выполнить `gradlew.bat distZip`
1. перейти в папку build/distributions
1. распаковать java_game.zip
1. запустить `bin/java_game.bat`

# IDE
Я бы попробовал взять [NetBeans](https://netbeans.org/).
Он несколько более дружественный.
Но в любом случае, все современные Java IDE работают с gradle проектами:
* [NetBeans](https://examples.javacodegeeks.com/core-java/gradle/gradle-netbeans-example/)
* [Eclipse](https://www.eclipse.org/community/eclipse_newsletter/2018/february/buildship.php)