package gm.inventarios.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8080/inventario-app  (context path)
@RequestMapping("inventario-app")
@CrossOrigin(value = "http://localhost:4200") //para permitir las peticiones del frontend desde Angular
public class ProductoControlador {
    private static final Logger logger =
            LoggerFactory.getLogger(ProductoControlador.class);
    //para que podamos enviar información a la consola utilizando el logger de nuestra app
}
