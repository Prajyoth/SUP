# SUP

A Smart University Portal web application, integrating Natural Language Processing with a university reporsitory to enable richer content searches.

How to run.

1) Clone Project
2) Run:  "mvn clean install"
3) Run:  "docker-compose up" to bring up the services.

GET
http://localhost:8080/rest/article/all

POST
http://localhost:8080/rest/article/create

{
"id":"",
"tag":["",""],
"heading":"",
"body":""
}
