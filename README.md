# Repostea

Web app that shows where and when fuel and electricity are cheapest in Spain, using official open data
from the Ministry (fuel prices of every petrol station) and Red Eléctrica (hourly PVPC electricity price).

Intermodular project, 2nd year of Web Application Development (DAW), IES Mutxamel.

## Architecture

- **Backend:** Spring Boot REST API organised in layers (controller, service, repository, model).
  Scheduled tasks download prices from the external APIs every 30 minutes.
- **Frontend:** Vue 3 SPA built with Vite (views, components, Pinia stores and an `api` layer).
- **Database:** PostgreSQL in production, in-memory H2 for development. Schema managed with Flyway.

The frontend never calls the external APIs directly: it only talks to our own API.

## How to run

Requirements: JDK 25, Maven 3.9+, Node 24+.

```bash
# Backend (http://localhost:8080) - uses H2, no database needed
cd backend
mvn spring-boot:run

# Frontend (http://localhost:5173)
cd frontend
npm install
npm run dev
```

Check that the API is up: `GET http://localhost:8080/api/estado`.

With Docker (production-like):

```bash
cp .env.example .env   # fill in the values
docker compose up --build
```

In IntelliJ IDEA: open the `backend` folder as a Maven project and run `ReposteaApplication`.

## Folder structure

```
repostea/
├── backend/                     Spring Boot API
│   ├── pom.xml
│   └── src/
│       ├── main/java/com/repostea/
│       │   ├── controller/      REST endpoints (receive requests, return JSON)
│       │   ├── service/         business logic (savings, alerts, data loads)
│       │   ├── repository/      Spring Data JPA repositories
│       │   ├── model/           JPA entities and enums
│       │   ├── dto/             objects sent to / received from the frontend
│       │   ├── client/          clients for the Ministry, REE and Telegram APIs
│       │   ├── scheduler/       scheduled data loads
│       │   ├── security/        JWT
│       │   ├── config/          security, CORS
│       │   └── exception/       error handling
│       ├── main/resources/      application*.yml, db/migration (Flyway)
│       └── test/                unit and integration tests
├── frontend/                    Vue 3 + Vite
│   └── src/
│       ├── views/               one view per screen
│       ├── components/          reusable components (map, charts, list)
│       ├── api/                 calls to the backend
│       ├── stores/              Pinia state (session, filters)
│       ├── router/              routes
│       └── assets/              CSS and images
├── docs/                        project documentation
├── docker-compose.yml
└── README.md
```

## Author

José Ramón Castillo Amat - 2nd DAW, IES Mutxamel (2026-2027)
