# rimfrost-template-referensdata-erbjudande

Detta repository är en mall för implementation av ErbjudandeReferensdataInterface från rimfrost-framework-referensdata-interface.

## Syfte

Mallen används som utgångspunkt när en implementation av ErbjudandeReferensdataInterface ska skapas. Den används även av mallen för manuella regler för att hantera uppslag av namn på erbjudanden.

## Minimum konfiguration av utvecklingsmiljö

Projektet förväntar sig att jdk (java version 21 eller högre),
docker och maven är installerat på systemet samt att
miljövariablerna **GITHUB_ACTOR** och **GITHUB_TOKEN** är
konfigurerade.

Notera att det GITHUB-token som används förväntas ha repo-access
konfigurerad för att kunna hämta vissa projektberoenden.

## Anpassningar som behöver utföras i projektet

1) Ersätt alternativt ta bort `Template` från klass namn
2) Uppdatera CHANGELOG.md så att namn överensstämmer med namn på repository
3) Uppdatera groupId och artifactId i pom.xml 
4) Implementera TODO kommentarer i src/main/java/se/fk/rimfrost/template/referensdata/TemplateErbjudandeReferensdata.java

## Bygg projektet

`./mvnw -s settings.xml clean compile`

## Bygg och testa projektet

`./mvnw -s settings.xml clean verify`

## Bygg artefakt och installera till lokal maven cache

`./mvnw -s settings.xml clean install`

## Github workflows

Två github workflows är inkluderade i projektet, bundle-maven-lib-ci och bundle-maven-lib-release.

bundle-maven-lib-release skapar som del av sitt flöde en artefakt.
Den publiceras till försäkringskassans [repository](https://github.com/Forsakringskassan/repository).

## Exempel implementation
Se [rimfrost-referensdata-erbjudande](https://github.com/Forsakringskassan/rimfrost-referensdata-erbjudande) för ett exempel på en färdig implementation.