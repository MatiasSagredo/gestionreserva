# Imagen base de Java
FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

# Directorio de trabajo
WORKDIR /app

# Copiar el JAR generado por Spring Boot
COPY target/gestion-citas-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto
EXPOSE 8080

# Comando de ejecución
ENTRYPOINT ["java", "-jar", "app.jar"]
