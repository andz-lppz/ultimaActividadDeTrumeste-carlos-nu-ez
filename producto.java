public  abstract class producto {

    private int id; 
    private String nombre; 
    private double precio; 
    private int cantidadEnstock; 

    public producto (int id, String nombre, double precio, int cantidadEnstock
    ){
        this.id = id; 
        this.nombre = nombre; 
        this.precio = precio; 
        this.cantidadEnstock = cantidadEnstock; 

        
    }

    public int getCantidadEnstock() {
        return cantidadEnstock;
    }
    public void setCantidadEnstock(int cantidadEnstock) {
        this.cantidadEnstock = cantidadEnstock;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

      @Override
    public String toString() {
        return "ID: " + id +
               ", Nombre: " + nombre +
               ", Precio: " + precio +
               ", Stock: " + cantidadEnstock; 
    }

 public abstract String descripcion();    
    
}
