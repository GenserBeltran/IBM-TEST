package ibm.test.jdbc;

import ibm.test.jdbc.datos.Conexion;
import ibm.test.jdbc.datos.ProveedoresDao;
import ibm.test.jdbc.datos.ProveedoresDaoImp;
import ibm.test.jdbc.domain.ProveedorDTO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "5": {
                    File oldFichero = new File("D:\\PROGRAMACION\\AppsEntrevistas\\fichero.txt");
                    oldFichero.delete();
                    File fichero = new File("D:\\PROGRAMACION\\AppsEntrevistas", "fichero.txt");
                    FileWriter txt = null;
                    PrintWriter teclado = null;
                    try {
                        if (fichero.createNewFile()) {
                            txt = new FileWriter("D:\\PROGRAMACION\\AppsEntrevistas\\fichero.txt");
                            ;
                            teclado = new PrintWriter(txt);
                            ProveedoresDaoImp proveedoresDaoImp = new ProveedoresDaoImp();
                            ProveedorDTO proveedorDTO = new ProveedorDTO(5);
                            List<ProveedorDTO> proveedores = proveedoresDaoImp.selectId(proveedorDTO);
                            for (ProveedorDTO proveedor : proveedores) {
                                teclado.println("\n" + proveedor);
                            }
                            System.out.println("El fichero se ha creado correctamente");
                        } else {
                            System.out.println("Error al crear el fichero");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (txt != null)
                            try {
                                txt.close();

                            } catch (IOException ioe) {
                            }
                    }
                }
                break;
                case "6": {
                    File oldFichero = new File("D:\\PROGRAMACION\\AppsEntrevistas\\fichero.txt");
                    oldFichero.delete();
                    File fichero = new File("D:\\PROGRAMACION\\AppsEntrevistas", "fichero.txt");
                    FileWriter txt = null;
                    PrintWriter teclado = null;
                    try {
                        if (fichero.createNewFile()) {
                            txt = new FileWriter("D:\\PROGRAMACION\\AppsEntrevistas\\fichero.txt");
                            ;
                            teclado = new PrintWriter(txt);
                            ProveedoresDaoImp proveedoresDaoImp = new ProveedoresDaoImp();
                            ProveedorDTO proveedorDTO = new ProveedorDTO(6);
                            List<ProveedorDTO> proveedores = proveedoresDaoImp.selectId(proveedorDTO);
                            for (ProveedorDTO proveedor : proveedores) {
                                teclado.println("\n" + proveedor);
                            }
                            System.out.println("El fichero se ha creado correctamente");
                        } else {
                            System.out.println("Error al crear el fichero");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (txt != null)
                            try {
                                txt.close();
                            } catch (IOException ioe) {
                            }
                    }
                }break;
                default: {
                    System.out.println("El cliente no tiene proveedores asignados");
                }
            }
        }
    }
}
