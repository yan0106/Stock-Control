package gm.inventarios.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //Entidad - JPA
@Data //para los métodos Get - Lombok
@NoArgsConstructor //Genera un constructor sin argumentos - Lombok
@AllArgsConstructor //Genera un constructor con un argumento por cada campo en la clase - Lombok
@ToString //Lombok
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el valor de idProducto se generará automáticamente
    // por la base de datos, utilizando la estrategia de identidad (autoincremento)
    Integer idProducto; //propiedad de la clase Producto
    String descripcion;
    Double precio;
    Integer existencia;
}
