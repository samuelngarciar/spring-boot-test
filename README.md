# spring-boot-test
Microservicio para realizar pruebas que que es invocado mediante GET y recibe un parametro llamado input<br>
Hay 2 formas de iniciar el microservicio:
- (Opcion: 1) Usando Java JDK 8 o mayor & Maven 3.6.3 o mayor
- (Opcion: 2) Usando Docker
#### Nota
Predeterminadamente abre el; puerto: 8080, pero esta configuracion puede ser cambiada en el fichero: application.properties

### Usando - Java JDK 8 o mayor & Maven 3.6.3 o mayor
#### 1 Correr el microservicio en primer plano con mvn
mvn spring-boot:run
#### 2 Probar
curl -s http://localhost:8080/ms/test?input=Nice
Retornando un Json con la siguiente forma:

![image](https://github.com/samuelngarciar/spring-boot-test/assets/84947793/8cdf2076-9429-4e0e-952d-894d82a03c8b)


### Usando - Docker
#### 1 Compilar el docker en la carpeta donde esta el fichero: Dockerfile<br>
docker build -t spring/boot/microservice .<br>
#### 2 Verificar la compilacion<br>
docker images<br>
#### 3 Correr el ms en background en el puerto 8081<br>
docker run -d -p 8081:8080 spring/boot/microservice:latest<br>
#### 4 Probar<br>
curl http://localhost:8081/ms/test?input=Nice | jq '.'<br>
![image](https://github.com/samuelngarciar/spring-boot-test/assets/84947793/3a766789-0089-4d1c-a838-07ef0d773d7f)

