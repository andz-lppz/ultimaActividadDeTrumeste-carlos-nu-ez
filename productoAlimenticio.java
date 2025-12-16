public class productoAlimenticio extends producto {
    private String fechaVencimiento;
    
    
    public productoAlimenticio(int id, String nombre, double precio,int cantidadEnstock, String fechaVencimiento ){
      super(id, nombre, precio, cantidadEnstock); 
      this.fechaVencimiento = fechaVencimiento; 
    }
    

    @Override
    public String descripcion() {
        // TODO Auto-generated method stub
        return "Alimenticio se vence:"+ fechaVencimiento + ")"; 
    }
}
