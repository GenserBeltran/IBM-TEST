package ibm.test.jdbc.datos;

import ibm.test.jdbc.domain.ProveedorDTO;

import java.sql.*;
import java.util.*;
import java.util.Date;

import static ibm.test.jdbc.datos.Conexion.*;

public class ProveedoresDaoImp implements ProveedoresDao {

    private Connection connectionTransaccion;
    private static final String SQL_SELECT_ID = "SELECT id_proveedor, nombre, fecha_alta, id_cliente FROM proveedores WHERE id_cliente = ?";

    public ProveedoresDaoImp() {
    }

    public ProveedoresDaoImp(Connection connectionTransaccion) {
        this.connectionTransaccion = connectionTransaccion;
    }

    public List<ProveedorDTO> selectId(ProveedorDTO proveedorDTO) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProveedorDTO proveedor = null;
        List<ProveedorDTO> proveedores = new ArrayList<>();
        try {
            conn = this.connectionTransaccion != null ? this.connectionTransaccion : getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, proveedorDTO.getId_cliente());
            rs = stmt.executeQuery();
            while (rs.next()) {
                    proveedor = new ProveedorDTO(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getInt(4));
                    proveedores.add(proveedor);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return proveedores;
    }

}
