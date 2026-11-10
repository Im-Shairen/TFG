# Demo - Sistema de apoyo a la decisión para la contratación de servicios de albañilería

Demo del TFG del alumno de la universidad Siglo 21 Santiago Ezequiel de Martin.

## Estructura

| Carpeta    | Contenido                                              |
| ---------- | ------------------------------------------------------ |
| `backend/` | API REST en Kotlin con Spring Boot (capa de lógica)    |
| `app/`     | App Android en Kotlin (capa de presentación)           |
| `docs/`    | Documentación técnica                                  |

La base de datos MySQL se agrega en la tarea F0-04.

## Backend

Requisitos: JDK 21.

```bash
cd backend
./gradlew bootRun      # levanta la API en http://localhost:8080
./gradlew test         # corre las pruebas
```

Verificación: `GET http://localhost:8080/api/health` responde `{"status":"UP", ...}`.

## Ramas

- `main`: versión estable de la demo.
- `develop`: integración.
- `feature/<id-tarea>`: una rama por tarea del backlog, por ejemplo `feature/f0-02-backend-base`.
