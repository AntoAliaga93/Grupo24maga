
package grupo24maga.AccesoADatos;

import grupo24maga.Entidades.Alumno;
import grupo24maga.Entidades.Inscripcion;
import grupo24maga.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class InscripcionData {
    private Connection con = null;
    MateriaData matData;
    AlumnoData aluData;
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion insc){
        String sql= "INSERT INTO inscripcion(nota, idAlumno, idMateria) "
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Inscripcion guardada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
    }
    
    //Obtener inscripciones 
     public List <Inscripcion> obtenerInscripciones(){
       List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
    
       String sql = "SELECT * FROM inscripcion ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion); 
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones");
        }
        return inscripciones;
    }
    
    //Obtener inscripciones por alumno 
     public List <Inscripcion> obtenerInscripcionesPorAlumno(int id){
     List<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
     String sql = "SELECT * FROM inscripcion i "
             + " WHERE i.idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getInt("nota"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripciones.add(inscripcion); 
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al obtener inscripciones");
        }
        return inscripciones;
    }
    public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
        
        String sql = "SELECT i.idMateria, nombre, año FROM inscripcion i, materia m "
                + "WHERE i.idMateria = m.idMateria AND i.idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las materias cursadas");
        }
        return materias;
    } 
    public List <Materia> obtenerMateriasNoCursadas(int id){
       //Lista completa de materias activas
       MateriaData matD = new MateriaData();
       List<Materia> materiasActivas = matD.listarMaterias();
       
       //Materias cursadas
       List<Materia> materiasCursadas = obtenerMateriasCursadas(id);
       List<Materia> materiasNoCursadas = new ArrayList<>();
       
       for (Materia materia : materiasActivas) {
           boolean cursadas = false;
            for (Materia cursada : materiasCursadas) {
               if(materia.getIdMateria()== cursada.getIdMateria()){
                   cursadas = true;
                   break;
               }
           }
            if (!cursadas) {
            materiasNoCursadas.add(materia);
            }
        }
        return materiasNoCursadas;
    }
   
    public void borrarInscripcionMateriaAlumno (int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2,idMateria);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Inscripción eliminada");
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error al acceder a la tabla inscripcion");
        }
    }
   
    public void actualizarNota(int idAlumno, int idMateria, int nota){
       String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Nota modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder  a la tabla inscripción");
        }
    }
}
