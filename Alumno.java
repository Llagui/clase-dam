public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        if(nombreCompleto.length() < 3){
            System.out.println("¡ERROR! Nombre muy corto");
        }
        if(numeroMatriculaAlumno.length() < 4){
            System.out.println("¡ERROR! Nº de matricula muy corto");
        }
        edad = edadAlumno;
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * obtenemos detalles del alumno
     */
    public String getDetalles() {
        return nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os";
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en la cuenta de Github en formato de 7 caracateres
     */
    public void getNombreUsuarioGithub() {
        boolean error1 = false;
        boolean error2 = false;
        
        if (nombre.length() < 3){
            error1 = true;
        }
        
        if (numeroMatricula.length() < 4){
            error2 = true;
        }
        
        if(error1 == true){
            if(error2 == false){
                System.out.println(nombre.substring(0, nombre.length()) + numeroMatricula.substring(0, 4));
            }
            if(error2 == true){
                System.out.println(nombre.substring(0, nombre.length()) + numeroMatricula.substring(0, numeroMatricula.length()));
            }
        }
        else{
            if(error2 == false){
                System.out.println(nombre.substring(0, 3) + numeroMatricula.substring(0, 4));
            }
            if(error2 == true){
                System.out.println(nombre.substring(0, 3) + numeroMatricula.substring(0, numeroMatricula.length()));
            }
        }
    }
}
