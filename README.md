# Quarkus Compared to Spring
Projeto com foco em :
 - Demostrar algumas funcionalidades do Framework Quarkus
 - Fazer uma breve comparação do mesmo CRUD feito com Quarkus e com Spring
 
### Requisitos do sistema 

- Ter um JDK 8 instalado, indico instalar o [OpenJ9](https://www.eclipse.org/openj9/) da EclipseFoundation.
- Instalar a GraalVM 19.2.1 (Caso queira gerar a imagem nativa), para instalar e configurar corretamente siga o próprio 
tutorial na documentação do Quarkus : [Configurando a GraalVM](https://quarkus.io/guides/building-native-image#configuring-graalvm) 
- IDE de sua preferência
- Maven 
- Docker e Docker Compose instalado
- Container com PostgreSQL rodando (Para ter o mesmo, após instalar o docker e o docker compose é só executar o comando 
docker-compose up -d na raiz do projeto)

### Observação

#### -  Caso não queira ter que compilar o projeto localmente, na pasta artefatos na raiz do projeto você tera:

- quarkus-example-1.0.0-SNAPSHOT-runner : Imagem binária do projeto quarkus compilada e compátivel com a maioria das 
distros Linux, executar com `./quarkus-example-1.0.0-SNAPSHOT-runner` 

- quarkus-example-1.0.0-SNAPSHOT-runner.jar e pasta lib : Arquivo jar do projeto Quarkus para ser executado com java, 
`java -jar quarkus-example-1.0.0-SNAPSHOT-runner.jar`

- spring-example-0.0.1-SNAPSHOT.jar : Arquivo jar do projeto Spring para ser executado utilizando java, executar com 
`java -jar spring-example-0.0.1-SNAPSHOT.jar` 


