
package consecionaria;


public class proveedor {
     
    
    int id_proveedor;
    String Nombre_pro;
    String Apellido_pro;
    String Cedula_pro;

    public proveedor(int id_proveedor, String Nombre_pro, String Apellido_pro, String Cedula_pro) {
        this.id_proveedor = id_proveedor;
        this.Nombre_pro = Nombre_pro;
        this.Apellido_pro = Apellido_pro;
        this.Cedula_pro = Cedula_pro;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_pro() {
        return Nombre_pro;
    }

    public void setNombre_pro(String Nombre_pro) {
        this.Nombre_pro = Nombre_pro;
    }

    public String getApellido_pro() {
        return Apellido_pro;
    }

    public void setApellido_pro(String Apellido_pro) {
        this.Apellido_pro = Apellido_pro;
    }

    public String getCedula_pro() {
        return Cedula_pro;
    }

    public void setCedula_pro(String Cedula_pro) {
        this.Cedula_pro = Cedula_pro;
    }
    
}
