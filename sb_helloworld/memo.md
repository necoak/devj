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
