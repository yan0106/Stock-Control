package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;
import java.util.List;

public interface IProductoServicio { //métodos básicos para poder recuperar datos de la db
    public List<Producto> listarProductos();
    public Producto buscarProductoPorId (Integer idProducto);
    public void guardarProducto(Producto producto); //se recibe un objeto de tipo Producto que guardamos en la db
    //si el id de este producto es igual a nulo, entonces se hace un insert
    //si es diferente de nulo, se hace un update
    //así funciona la implementación de Hibernate por default
    public void eliminarProductoPorId(Integer idProducto);
}
