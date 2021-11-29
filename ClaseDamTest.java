
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

/**
 * The test class ClaseDamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseDamTest
{
    public Alumno alumno1;
    public Alumno alumno2;
    public Alumno alumno3;
    public Alumno alumno4;
    public Alumno alumno5;
    public ClaseDam clase1 = new ClaseDam(30);
    
    /**
     * Default constructor for test class ClaseDamTest
     */
    public ClaseDamTest()
    {
        alumno1 = new Alumno("Hermenegildo", "2345", 33);
        alumno2 = new Alumno("Segismundo", "2346", 22);
        alumno3 = new Alumno("Inés", "2347", 19);
        alumno4 = new Alumno("Valeria", "2348", 25);
        alumno5 = new Alumno("Waluigi", "2349", 32);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        clase1.matricularAlumno(alumno1);
        clase1.matricularAlumno(alumno2);
        clase1.matricularAlumno(alumno3);
        clase1.matricularAlumno(alumno4);
        clase1.matricularAlumno(alumno5);
    }
}
