# Courses Management System - Technical Documentation

## 1. Project Overview
The Courses Management System is a web application built with Angular 19 that allows users to view and manage educational courses. The application follows a client-server architecture with a frontend Angular application and a backend API service.

## 2. Technology Stack

### Frontend
- **Framework**: Angular 19
- **Language**: TypeScript
- **HTTP Client**: Angular HttpClient
- **State Management**: RxJS Observables
- **Styling**: CSS

### Backend
- **API Endpoint**: http://localhost:8081/api/courses
- **Database**: PostgreSQL (based on SQL schema)

## 3. Project Structure

```
courses-app/
├── src/
│   ├── app/
│   │   ├── courses/           # Courses feature module
│   │   │   ├── course.service.ts  # Course data service
│   │   │   ├── app.component.ts   # Root component
│   │   │   ├── app.config.ts      # Application configuration
│   │   │   └── app.routes.ts      # Routing configuration
│   │   └── ...
│   └── ...
├── package.json
└── ...
```

## 4. Core Components

### 4.1 CourseService
The `CourseService` is responsible for handling all course-related data operations:
- Makes HTTP requests to the backend API
- Provides methods for CRUD operations on courses
- Uses Angular's HttpClient for API communication

### 4.2 CoursesComponent
The main component for displaying courses:
- Implements OnInit interface for initialization
- Subscribes to course data using CourseService
- Displays course information in the template

## 5. Data Model

### Course Entity
```typescript
interface Course {
  id: number;
  name: string;
  description: string;
}
```

## 6. API Endpoints

### GET /api/courses
- **Purpose**: Retrieve all courses
- **Response**: Array of Course objects
- **Example Response**:
```json
[
  {
    "id": 1,
    "name": "Comprehensive Software Project",
    "description": "Learn HTML, CSS, and JavaScript"
  },
  {
    "id": 2,
    "name": "Python Basics",
    "description": "Introduction to Python programming"
  }
]
```

## 7. Database Schema

### Courses Table
```sql
CREATE TABLE public.courses (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT
);
```

## 8. Development Setup

### Prerequisites
- Node.js (Latest LTS version)
- Angular CLI (v19.1.7 or higher)
- PostgreSQL database

### Installation Steps
1. Clone the repository
2. Install dependencies:
   ```bash
   cd courses-app
   npm install
   ```
3. Set up the database:
   - Create a PostgreSQL database
   - Run the `insert_courses.sql` script to populate initial data

### Running the Application
1. Start the development server:
   ```bash
   ng serve
   ```
2. Access the application at `http://localhost:4200`

## 9. Testing
The project includes unit tests using Jasmine and Karma:
- Run tests: `ng test`
- Test coverage: `ng test --code-coverage`

## 10. Deployment
The application can be built for production using:
```bash
ng build --configuration production
```

## 11. Future Enhancements
- User authentication and authorization
- Course enrollment functionality
- Course search and filtering
- Admin dashboard for course management
- Real-time updates using WebSocket

## 12. Contributing
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 13. License
[Specify your license here]

## 14. Contact
[Add contact information] 