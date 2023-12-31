
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
import java.util.List;


public class Grupo24maga {

    public static void main(String[] args) {
    //   Connection conn = Conexion.getConexion();
    //   Alumno alumno = new Alumno(38564621,"Hernandez","Susana",LocalDate.of(1994, 3, 12),true);
    //para guardarlo en la base de datos
    //AlumnoData alu=new AlumnoData();
    //   alu.guardarAlumno(alumno);
       
       //Modificar alumno
     // Alumno alumno = new Alumno(1,38564621,"Sanchez","Juliana",LocalDate.of(1994, 3, 12),true);
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
  // Materia materia = new Materia(1,"Musica", 2020, true);
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
  // Guardar inscripción
//   Alumno alumno = new Alumno(1,38564621,"Sanchez","Juliana",LocalDate.of(1994, 3, 12),true);
//   Materia materia = new Materia(1,"Musica", 2020, true);
//   Inscripcion inscripcion = new Inscripcion(alumno, materia, 8);
//   InscripcionData insc = new InscripcionData();
//   insc.guardarInscripcion(inscripcion); 
  
   //Obtener inscripciones
   /*InscripcionData insc_d = new InscripcionData();
    List<Inscripcion> inscripciones = insc_d.obtenerInscripciones();

        for (Inscripcion insc : inscripciones) {
           
            System.out.println("idInscripción: "+insc.getIdInscripcion());
            System.out.println("Nota: " + insc.getNota());
            System.out.println("idAlumno: " + insc.getAlumno().getIdAlumno());
            System.out.println("idMateria: "+insc.getMateria().getIdMateria());
           
        } */
   
    //Obtener inscripciones por Alumno
  /*  InscripcionData insc_d = new InscripcionData();
    List<Inscripcion> inscripciones = insc_d.obtenerInscripcionesPorAlumno(1);
        for (Inscripcion insc : inscripciones) {
           
            System.out.println("idInscripción: "+insc.getIdInscripcion());
            System.out.println("Nota: " + insc.getNota());
            System.out.println("idAlumno: " + insc.getAlumno().getIdAlumno());
            System.out.println("idMateria: "+insc.getMateria().getIdMateria());
           
        } */
    //Obtener Materias Cursadas
    /*  InscripcionData insc_d = new InscripcionData();
        List<Materia> materias = insc_d.obtenerMateriasCursadas(1);
        for (Materia m : materias) {
           
            System.out.println("idMateria: "+m.getIdMateria());
            System.out.println("Nombre: "+m.getNombre());
            System.out.println("Año: "+m.getAnioMateria());
        } */
    //Obtener Materias NO Cursadas
       /* InscripcionData insc_d = new InscripcionData();
        List<Materia> materiasNoCursadas = insc_d.obtenerMateriasNoCursadas(1);
        for (Materia m : materiasNoCursadas) {
            System.out.println("Nombre: "+m.getNombre());
        }  */
       
    //Borrar inscripción materia Alumno   
    /*InscripcionData insc = new InscripcionData();
      insc.borrarInscripcionMateriaAlumno(1, 1);  */
    
    //Actualizar nota
    /*InscripcionData insc_d = new InscripcionData();
      insc_d.actualizarNota(1, 1, 10); */
    
    //Obtener alumnos
    InscripcionData insc_d = new InscripcionData();
    List<Alumno> alumno = insc_d.obtenerAlumnosXMateria(4);
        for (Alumno alu : alumno) {
            System.out.println("Apellido: "+alu.getApellido()+" "+alu.getNombre());
        }
    }    
}
