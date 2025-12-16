public class productoElectronico extends producto {

    private int garantiaMeses;

    public productoElectronico(int id, String nombre, double precio, int cantidadEnStock, int garantiaMeses) {
        super(id, nombre, precio, cantidadEnStock);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String descripcion() {
        // TODO Auto-generated method stub
        return"Electrónico (garantía: " + garantiaMeses + " meses)"; 
    }
}

