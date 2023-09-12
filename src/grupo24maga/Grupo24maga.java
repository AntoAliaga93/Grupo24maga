
package grupo24maga;

import grupo24maga.AccesoADatos.AlumnoData;
import grupo24maga.AccesoADatos.Conexion;
import grupo24maga.AccesoADatos.InscripcionData;
import grupo24maga.AccesoADatos.MateriaData;
import grupo24maga.Entidades.Alumno;
import grupo24maga.Entidades.Inscripcion;
import grupo24maga.Entidades.Materia;
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
      Alumno alumno = new Alumno(1,38564621,"Sanchez","Juliana",LocalDate.of(1994, 3, 12),true);
      // AlumnoData alu=new AlumnoData();
       //alu.modificarAlumno(alumno);*/
      
      //Eliminar alumno
     /* Alumno alumno = new Alumno(1,38564621,"Sanchez","Juliana",LocalDate.of(1994, 3, 12),true);
      AlumnoData alu=new AlumnoData();
      alu.eliminarAlumno(1); */
      
      //Buscar alumno
     /* AlumnoData alu = new AlumnoData();
      Alumno alumnoEncontrado =  alu.buscarAlumno(1);
      if(alumnoEncontrado !=null){
      System.out.println("dni"+alumnoEncontrado.getDni());
      System.out.println("apellido"+alumnoEncontrado.getApellido());
      System.out.println("nombre"+alumnoEncontrado.getNombre());
      } */
     
     //Listar alumno
    /* AlumnoData alu = new AlumnoData();
        for (Alumno alumno : alu.listarAlumnos()) {
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
        }
        */
    //---------------------------------------------------------
    //Guardar materia
   /* Materia materia = new Materia("Matemática", 2020, true);
    //para guardarlo en la base de datos
    MateriaData mat=new MateriaData();
    mat.guardarMateria(materia); */
   
   //Buscar materia
   /*MateriaData materia = new MateriaData();
   Materia materiaEncontrada =  materia.buscarMateria(1);
      if(materiaEncontrada !=null){
      System.out.println("nombre "+materiaEncontrada.getNombre());
      System.out.println("año "+materiaEncontrada.getAnioMateria());
      System.out.println("estado "+materiaEncontrada.isActivo());
      } */
   
   //Modificar materia
   Materia materia = new Materia(1,"Musica", 2020, true);
  // MateriaData mat=new MateriaData();
   //mat.modificarMateria(materia); */
  
  //Eliminar materia
  /*Materia materia = new Materia(1,"Musica", 2020, true);
  MateriaData mat=new MateriaData();
  mat.eliminarMateria(1); */
  
    //Listar materias
   /* MateriaData mat = new MateriaData();
        for (Materia materia : mat.listarMaterias()) {
            System.out.println(materia.getNombre());
            System.out.println(materia.getAnioMateria());
            System.out.println(materia.isActivo());
        } */
   //---------------------------------------------------------------------
   //Guardar inscripción
   
   Inscripcion inscripcion = new Inscripcion(alumno, materia, 8);
   InscripcionData insc = new InscripcionData();
   insc.guardarInscripcion(inscripcion, alumno, materia);
    }   
}
