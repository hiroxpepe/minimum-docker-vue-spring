# minimum Docker Vue.js Spring MVC
A minimum Docker Vue.js Spring MVC project.

## Overview
It's a minimum project using Vue.js and  Spring MVC running on Docker. It will help you to understand the structure of those simply.

## What tools to use.

+ Docker, Docker Compose

```sh
$ docker --version
Docker version 20.10.5, build 55c4c88
```
```sh
$ docker-compose --version
docker-compose version 1.28.5, build c4eb3a1f
```

+ JDK, Maven

```sh
$ java -version
java version "1.8.0_202"
Java(TM) SE Runtime Environment (build 1.8.0_202-b08)
Java HotSpot(TM) 64-Bit Server VM (build 25.202-b08, mixed mode)
```
```sh
$ mvn -version
Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-05T04:00:29+09:00)
```

## How to build.

```sh
$ cd Path_to_this_README.md
$ mvn install
```

## How to run.

```sh
$ cd Path_to_this_README.md
$ docker-compose up -d
```

+ check if it can access and click the button.  
http://localhost:8880/index.html

## License
[Apache License.](https://www.apache.org/licenses/LICENSE-2.0)
