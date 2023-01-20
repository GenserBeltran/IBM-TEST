package ibm.test.jdbc.domain;

import java.util.Date;

public class ProveedorDTO {

    private int idProveedor;
    private String nombre;
    private Date fechaAlta;
    private int idCliente;

    public ProveedorDTO() {
    }

    public ProveedorDTO(int idCliente) {
        this.idCliente = idCliente;
    }

    public ProveedorDTO(int idProveedor, String nombre, Date fechaAlta, int idCliente) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.idCliente = idCliente;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getId_cliente() {
        return idCliente;
    }

    public void setId_cliente(int id_cliente) {
        this.idCliente = id_cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProveedorDTO that)) return false;
        return getIdProveedor() == that.getIdProveedor();
    }

    @Override
    public String toString() {
        return "ProveedoresDto{" +
                "idProveedor=" + idProveedor +
                ", nombre='" + nombre + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", id_cliente=" + idCliente +
                '}';
    }
}
