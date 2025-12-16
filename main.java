public class main {

    public static void main(String[] args) {

        GestorProductos gestor = new GestorProductos();

        producto p1 = new productoAlimenticio(1, "Pan", 2000, 20, "2025-01-10");
        producto p2 = new productoElectronico(2, "Celular", 800000, 5, 12);

        gestor.agregarProducto(p1);
        gestor.agregarProducto(p2);

        System.out.println("=== LISTA DE PRODUCTOS ===");
        gestor.listarProductos();

        System.out.println("=== BUSCAR PRODUCTO ID 1 ===");
        producto buscado = gestor.buscarPorId(1);
        if (buscado != null) {
            System.out.println(buscado);
        }

        System.out.println("=== ACTUALIZAR PRODUCTO ID 2 ===");
        gestor.actualizarProducto(2, "Celular Samsung", 900000, 4);

        System.out.println("=== LISTA ACTUALIZADA ===");
        gestor.listarProductos();

        System.out.println("=== ELIMINAR PRODUCTO ID 1 ===");
        gestor.eliminarProducto(1);

        System.out.println("=== LISTA FINAL ===");
        gestor.listarProductos();
    }
}

