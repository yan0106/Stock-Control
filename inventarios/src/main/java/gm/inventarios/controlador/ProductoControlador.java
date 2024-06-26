package gm.inventarios.controlador;

import gm.inventarios.modelo.Producto;
import gm.inventarios.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8080/inventario-app  (context path)
@RequestMapping("inventario-app")
@CrossOrigin(value = "http://localhost:4200") //para permitir las peticiones del frontend desde Angular
public class ProductoControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(ProductoControlador.class);
    //para que podamos enviar información a la consola utilizando el logger de nuestra app

    @Autowired
    private ProductoServicio productoServicio; // se inyecta el servicio ProductoServicio

    //http://localhost:8080/inventario-app/productos
    @GetMapping("/productos") //método para poder obtener todos los objetos de tipo Producto. Petición de tipo GET
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.productoServicio.listarProductos();
        logger.info("Productos obtenidos:");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }
}
