
package grupo24maga;

import grupo24maga.AccesoADatos.AlumnoData;
import grupo24maga.AccesoADatos.Conexion;
import grupo24maga.Entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;


public class Grupo24maga {

    public static void main(String[] args) {
    //   Connection conn = Conexion.getConexion();
    //   Alumno alumno = new Alumno(38564621,"Hernandez","Susana",LocalDate.of(1994, 3, 12),true);
    //para guardarlo en la base de datos
    //AlumnoData alu=new AlumnoData();
    //   alu.guardarAlumno(alumno);
       
       //Modificar alumno
      /* Alumno alumno = new Alumno(1,38564621,"Sanchez","Juliana",LocalDate.of(1994, 3, 12),true);
       AlumnoData alu=new AlumnoData();
       alu.modificarAlumno(alumno);*/
      
      //Eliminar alumno
     /* Alumno alumno = new Alumno(1,38564621,"Sanchez","Juliana",LocalDate.of(1994, 3, 12),true);
      AlumnoData alu=new AlumnoData();
      alu.eliminarAlumno(1); */
      
      //Buscar alumno
      AlumnoData alu = new AlumnoData();
      Alumno alumnoEncontrado =  alu.buscarAlumno(1);
      if(alumnoEncontrado !=null){
      System.out.println("dni"+alumnoEncontrado.getDni());
      System.out.println("apellido"+alumnoEncontrado.getApellido());
      System.out.println("nombre"+alumnoEncontrado.getNombre());
      }
    }
    
}
