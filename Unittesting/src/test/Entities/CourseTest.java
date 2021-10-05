package Unittesting.src.test.Entities;

import org.junit.Test;
import Unittesting.src.Entities.Course;
import Unittesting.src.Entities.Teacher;
import static org.junit.Assert.assertEquals;

public class CourseTest {
    @Test
    public void testCourseConstructorId() {
        Unittesting.src.Entities.Course course = new Course(123);
        assertEquals(course.getId(), 123);
    }

    @Test
    public void testCourseConstructorName() {
        Course course = new Course("Progra II");
        assertEquals(course.getName(), "Progra II");
    }

    @Test
    public void testCourseConstructorIdName() {
        Course course = new Course("Programming II", 123);
        assertEquals(course.getId(), 123);
        assertEquals(course.getName(), "Programming II");
    }

    @Test
    public void testTeacherSetter(){
        Teacher teacher = new Teacher();
        teacher.setFirstName("John");
        Course course = new Course("Programming II",1);
        course.setTeacher(teacher);
        assertEquals(course.getTeacher().getFirstName(), "John");
    }
}
