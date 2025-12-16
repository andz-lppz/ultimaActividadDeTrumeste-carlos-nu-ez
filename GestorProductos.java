import java.util.ArrayList;

public class GestorProductos {

    private ArrayList<producto> listaProductos;

    public GestorProductos() {
        listaProductos = new ArrayList<>();
    }

    // 1. Registrar producto
    public void agregarProducto(producto p) {
        listaProductos.add(p);
    }

    // 2. Listar productos
    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        for (producto p : listaProductos) {
            System.out.println(p);
            System.out.println(p.descripcion());
            System.out.println("--------------------");
        }
    }

    // 3. Buscar por ID
    public producto buscarPorId(int id) {
        for (producto p : listaProductos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // 4. Actualizar producto
    public boolean actualizarProducto(int id, String nombre, double precio, int stock) {
        producto p = buscarPorId(id);
        if (p != null) {
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCantidadEnstock(stock);
            return true;
        }
        return false;
    }

    // 5. Eliminar producto
    public boolean eliminarProducto(int id) {
        producto p = buscarPorId(id);
        if (p != null) {
            listaProductos.remove(p);
            return true;
        }
        return false;
    }
}
