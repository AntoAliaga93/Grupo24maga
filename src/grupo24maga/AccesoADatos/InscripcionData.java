
package grupo24maga.AccesoADatos;

import grupo24maga.Entidades.Alumno;
import grupo24maga.Entidades.Inscripcion;
import grupo24maga.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public void guardarInscripcion(Inscripcion insc, Alumno alum, Materia mat){
        String sql= "INSERT INTO inscripcion(nota, idAlumno, idMateria) "
                + "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getNota());
            ps.setInt(2, alum.getIdAlumno());
            ps.setInt(3, mat.getIdMateria());
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
    
    
}
