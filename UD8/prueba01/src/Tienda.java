import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa el inventario de una tienda.
 * Junto con esta clase se puede manipular el inventario de la misma
 *
 * @see ProductoNuevo Esta clase crea una lista ProductoNuevo para maniobrar el inventario.q
 * @version 1.0
 * @author Mael Grandguillot
 */
public class Tienda {

    private List<ProductoNuevo> inventario;

    /**
     * Constructor de la clase Tienda.
     */
    public Tienda() {
        inventario = new ArrayList<>();
    }

    /**
     * Este metodo se usa para añadir productos al inventario de la tienda
     *
     * @param producto Producto que se desea añadir
     */
    public void agregarProducto(ProductoNuevo producto) {
        inventario.add(producto);
    }

    /**
     * Metodo que busca un producto dentro del inventario a través del nombre que se le pasa
     * comparando el nombre otorgado con cada nombre de cada producto del inventario.
     *
     * @param nombre Nombre con el que se buscara el producto
     * @return El producto encontrado o nulo en caso de no encontrarlo.
     */
    public ProductoNuevo buscarProducto(String nombre) {
        for (ProductoNuevo producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    /**
     * Metodo en el que se realiza una venta, proporcionando el nombre del producto y el
     * numero de productos. Este metodo modifica la cantidad disponible del producto.<br>
     * El metodo comprueba si el producto existe, y si existe, comprueba que la cantidad
     * no sobrepasa el stock disponible.
     *
     * @param nombre Nombre del producto que se quiere vender
     * @param cantidad La cantidad de copias del mismo producto que se desea vender
     * @return Devuelve true si el producto existe, y si no sobrepasa el stock. En caso contrario, devuelve false.
     */
    public boolean realizarVenta(String nombre, int cantidad) {
        ProductoNuevo producto = buscarProducto(nombre);
        if (producto != null && producto.getCantidadDisponible() >= cantidad) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
            return true;
        }
        return false;
    }
}