import junit.framework.TestCase;
public class StudentTest extends TestCase {
    public void testCreate(){
        final String firstStudentName = "Jane Doe";
        Student firstStudent = new Student(firstStudentName);

        assertEquals(firstStudentName, firstStudent.getName());


        final String secondStudentName = "Bloo Koo";
        Student secondStudent = new Student(secondStudentName);

        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, firstStudent.getName());


    }
}
