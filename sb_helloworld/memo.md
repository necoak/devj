## Messages

`
kanek@DESKTOP-FFOH007 MINGW64 ~
$ curl -s http://localhost:8080/messages
[{"text":null},{"text":null},{"text":"Taro"}]
kanek@DESKTOP-FFOH007 MINGW64 ~
$ curl -s -X POST -H "Content-Type: application/json" -d '{"text":"Taro"}'  http://localhost:8080/messages
{"text":"Taro"}
kanek@DESKTOP-FFOH007 MINGW64 ~
$ curl -s http://localhost:8080/messages
[{"text":null},{"text":null},{"text":"Taro"},{"text":"Taro"}]
kanek@DESKTOP-FFOH007 MINGW64 ~
$ curl -s -X POST -H "Content-Type: application/json" -d '{"text":"Jiro"}'  http://localhost:8080/messages
{"text":"Jiro"}
kanek@DESKTOP-FFOH007 MINGW64 ~
$ curl -s http://localhost:8080/messages
[{"text":null},{"text":null},{"text":"Taro"},{"text":"Taro"},{"text":"Jiro"}]
kanek@DESKTOP-FFOH007 MINGW64 ~
$
`
## application.properties
最新のアプリケーションプロパティ設定のキーはこちらを参照する
https://spring.pleiades.io/spring-boot/docs/current/reference/html/application-properties.html

## SpringSecurity
SpringSecurity5.4以降は書き方が変更になっている
https://qiita.com/opengl-8080/items/c105152c9ca48509bd0c
https://qiita.com/suke_masa/items/908805dd45df08ba28d8
https://github.com/MasatoshiTada/spring-security-intro
