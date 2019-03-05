public class CourseSessionTest extends junit.framework.TestCase {
    public void testCreate() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
    }

    public void testEnrollStudents() {
        CourseSession session = new CourseSession("ENGL", "101");
        Student student1 = new Student("Esther Kol");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());

        Student student2 = new Student("Benny Hil");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
    }
}
