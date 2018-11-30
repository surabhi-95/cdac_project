package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
