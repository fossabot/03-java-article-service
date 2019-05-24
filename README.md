# article-service

[![Build Status](https://travis-ci.org/becoming/03-java-article-service.svg?branch=master)](https://travis-ci.org/becoming/03-java-article-service)
[![Maintainability](https://api.codeclimate.com/v1/badges/db96a60ede90da061419/maintainability)](https://codeclimate.com/github/becoming/03-java-article-service/maintainability)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fbecoming%2F03-java-article-service.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Fbecoming%2F03-java-article-service?ref=badge_shield)
[ ![Download](https://api.bintray.com/packages/becoming/m2/article-service/images/download.svg) ](https://bintray.com/becoming/m2/article-service/_latestVersion) 
[![Gitter](https://badges.gitter.im/becoming-tech/community.svg)](https://gitter.im/becoming-tech/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

A service capable of sending notifications. It exposes a REST interface for interaction.
[Official website](https://becoming.tech)

### Learning and Docs

You can proceed on learning the materials from this repository assuming that you know already [02-java-file-service](https://github.com/becoming/02-java-file-service)

Please refer to the [Wiki section](https://github.com/becoming/03-java-article-service/wiki) of this repository for a complete guide on how to build this application step by step and learn the required technologies along the way.

[YouTube Playlist](https://www.youtube.com/playlist?list=PLPkoWZmDIKwB7NJH22gqfgHFV7YK0lJ1j)

### Setup

#### System requirements

 - Java 8
 - Maven 3.x - latest

As well, please install [this software list](https://github.com/becoming/0-java-fundamentals/blob/master/0-Apps.md), to be covered.

#### Compile and build the app

```bash
mvn clean package
```

#### Install MongoDB

Via Docker
```bash
docker run --name article-service-db -P mongo

# or control the exposed port via run command

docker run --name article-service-db -p 27017:27017 mongo
```
Or as an application, [by following official docs.](https://docs.mongodb.com/manual/installation/#mongodb-community-edition-installation-tutorials)

#### Run

Find the MongoDB's port
 - default is **27017**
 - *if run via docker* with **-P** the something like: **32768**
     - `docker ps` will give you the number
```bash
mvn spring-boot:run -Dspring.data.mongodb.port: 32768
```

### Download a build

You can download a build of this service from our [Bintray repository.](https://bintray.com/beta/#/becoming/m2/)

You can use maven as well by using the instructions from **Set me up** button, (_top right_)

## Self testing

In order to test if you learned well the things so far try to do the following apps:

1. Article categories
    - via dedicated route: /categories/
1. Article authors
    - via dedicated route: /authors/

## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fbecoming%2F03-java-article-service.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fbecoming%2F03-java-article-service?ref=badge_large)