# Course Enrollment System

A simple web application that allows users to browse available courses and manage their enrollments.

## Features 

- View a list of available courses
- Enroll in courses  
- View enrolled courses 
- Unenroll from courses 

## Technologies Used 

- HTML5
- CSS3
- AngularJS 1.8.2

## Project Structure

The application consists of a single HTML file that includes:

- HTML markup for the user interface
- CSS styling embedded in the `<style>` tag
- AngularJS JavaScript code embedded in the `<script>` tag

## How It Works
<img width="896" alt="Screenshot 2025-02-28 at 4 11 01 PM" src="https://github.com/user-attachments/assets/ecd5bcaf-fbed-41c4-bd51-e224231a42ac" />

The application is built using the AngularJS framework with the following components:

1. **Angular Module**: `courseApp` serves as the main module for the application.

2. **Controller**: `CourseController` manages the application's data and functionality.

3. **Data Models**:
   - `courses`: An array of course objects with name and description properties
   - `enrolledCourses`: An array to track courses the user has enrolled in

4. **Functions**:
   - `enroll(course)`: Adds a course to the enrolled courses list
   - `unenroll(course)`: Removes a course from the enrolled courses list
   - `isEnrolled(course)`: Checks if a user is already enrolled in a course
<img width="876" alt="Screenshot 2025-02-28 at 4 11 12 PM" src="https://github.com/user-attachments/assets/5d3c029e-bf2a-4561-9592-4ab0a223a879" />

## Usage

1. Open the HTML file in a web browser
2. Browse the list of available courses
3. Click "Enroll" to add a course to your enrolled courses
4. View your enrolled courses in the "Enrolled Courses" section
5. Click "Unenroll" to remove a course from your enrolled courses

## Future Improvements

- Add user authentication
- Implement course filtering and searching
- Add more course details (schedule, instructor, etc.)
- Store enrollment data in a database
- Add form validation and error handling
