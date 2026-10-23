# API REST - Biblioteca

## Descripción de la API
API REST desarrollada en Spring Boot para la gestión integral de una biblioteca. Permite administrar el catálogo de libros, control de inventario/stock y operaciones básicas del sistema de biblioteca bajo una arquitectura limpia y buenas prácticas REST. No incluye sistema de autenticación (login), enfocándose en la lógica de negocio y el manejo de errores.

---

## Tecnologías Utilizadas
* **Java 17+**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **H2 Database** (Base de datos en memoria para pruebas locales)
* **Gradle** (Gestor de dependencias)
* **Jakarta Validation** (Validaciones de entradas)

---

## Pasos de Instalación y Ejecución

Seguir estos pasos para clonar y ejecutar el proyecto en el entorno local:

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/4multiple8/Biblioteca.git](https://github.com/4multiple8/Biblioteca.git)
   cd Biblioteca

   Compilar y ejecutar la aplicacion:

   ./gradlew bootRun

   Verificar el funcionamiento:
   La API se ejecutará por defecto en el puerto 8080:

   http://localhost:8080

   Propiedades:

   spring.application.name=libreria-api
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   spring.h2.console.enabled=true
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

   Método,Endpoint,Descripción

   GET,/api/books,Lista todos los libros registrados.

   GET,  /api/books/  {id},Obtiene los detalles de un libro por su ID.

   POST,  /api/books,  Registra un nuevo libro en el sistema.

   PUT,  /api/books/  {id},Actualiza la información de un libro existente.

   DELETE,  /api/books/  {id},Elimina un libro del sistema.


Ejemplos:

Registrar un libro nuevo
{
  "title": "Cien años de soledad",
  "isbn": "978-0307474728",
  "stock": 10
}

Listar todos los libros
[
  {
    "id": 1,
    "title": "Cien años de soledad",
    "isbn": "978-0307474728",
    "stock": 10
  }
]

