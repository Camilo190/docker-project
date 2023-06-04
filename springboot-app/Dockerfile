#
# BUILD
#
# Establecer la imagen base de Maven para compilar la aplicación
FROM maven:3.8.3-openjdk-17 AS build
# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app
# Copiar el archivo pom.xml y descargar las dependencias de Maven
COPY pom.xml .
RUN mvn dependency:go-offline
# Copiar el código fuente y compilar la aplicación
COPY src ./src
RUN mvn package -DskipTests

#
# PACKAGE
#
# Crear una nueva imagen basada en la imagen de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR de la aplicación desde la fase de compilación
#al directorio de trabajo en el contenedor
COPY --from=build /app/target/my-spring-project-0.0.1-SNAPSHOT.jar .

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "my-spring-project-0.0.1-SNAPSHOT.jar"]