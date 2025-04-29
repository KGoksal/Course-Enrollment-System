-- insert_courses.sql

-- Insert some sample courses into the courses table
INSERT INTO public.courses (id, "name", description)
VALUES
  (nextval('courses_id_seq'::regclass), 'Comprehensive Software Project', 'Learn HTML, CSS, and JavaScript'),
  (nextval('courses_id_seq'::regclass), 'Python Basics', 'Introduction to Python programming'),
  (nextval('courses_id_seq'::regclass), 'DevOps Essentials', 'Learn CI/CD, Docker, Kubernetes');
