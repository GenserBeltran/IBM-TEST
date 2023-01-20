package ibm.test.jdbc.datos;

import ibm.test.jdbc.domain.ProveedorDTO;

import java.sql.SQLException;
import java.util.List;

public interface ProveedoresDao {

    public List<ProveedorDTO> selectId(ProveedorDTO proveedorDTO) throws SQLException;



}