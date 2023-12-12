# spring-boot-test
Microservicio simple que sube con la siguiente instruccion: mvn spring-boot
Abre en el puerto: 8080, pero esta configuracion puede ser cambiada en el fichero: application.properties

Las opciones de acceso mediante curl seria asi: curl -s http://localhost:8080/ms/test?input=Nice
Retornando un Json con la siguiente forma:

![image](https://github.com/samuelngarciar/spring-boot-test/assets/84947793/8cdf2076-9429-4e0e-952d-894d82a03c8b)


Si se quiere correr en Docker
#### 1 Compilar el docker en la carpeta donde esta el fichero: Dockerfile<br>
docker build -t spring/boot/microservice .<br>
#### 2 Verificar la compilacion<br>
docker images<br>
#### 3 Correr el ms en background en el puerto 8081<br>
docker run -d -p 8081:8080 spring/boot/microservice:latest<br>
#### 4 Probar<br>
curl http://localhost:8081/ms/test?input=Nice | jq '.'<br>
![image](https://github.com/samuelngarciar/spring-boot-test/assets/84947793/3a766789-0089-4d1c-a838-07ef0d773d7f)

