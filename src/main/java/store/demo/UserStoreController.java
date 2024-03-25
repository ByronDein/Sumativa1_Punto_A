package store.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserStoreController {
    private List<UserStore> userStores = new ArrayList<>();
    

    public UserStoreController(){
        userStores.add(new UserStore(1,"20.452.622-5", "Administrador", "Matias Sepulveda", "Americo Vespucio 5140", "945321431", "M.Alejandro@duocuc.cl", Arrays.asList( new Shopping(1, "Teclado"), new Shopping(2, "Tarjeta de Video"))));
        userStores.add(new UserStore(2,"20.123.456-7", "Cliente", "Juan Perez", "Avenida Siempre Viva 123", "945321432", "J.Perez@duocuc.cl", Arrays.asList( new Shopping(3, "Mouse"), new Shopping(4, "Procesador"))));
        userStores.add(new UserStore(3,"20.789.012-3", "Invitado", "Maria Rodriguez", "Cerrillos 456", "945321433", "M.Rodriguez@duocuc.cl", Arrays.asList( new Shopping(5, "Monitor"), new Shopping(6, "Disco Duro"))));
        userStores.add(new UserStore(4,"20.345.678-9", "Cliente", "Pedro Gonzalez", "Boulevard de los Sueños 789", "945321434", "P.Gonzalez@duocuc.cl", Arrays.asList( new Shopping(7, "Audifonos"), new Shopping(8, "RAM"))));
        userStores.add(new UserStore(5,"20.987.654-1", "Invitado", "Laura Ramirez", "Camino Real 1011", "945321435", "L.Ramirez@duocuc.cl", Arrays.asList( new Shopping(9, "Pantalla"), new Shopping(10, "Tarjeta Madre"))));
    }

    @GetMapping("/users")
    public List<UserStore> getAllUsers() {
        return userStores;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        for (UserStore userStore : userStores) {
            if (userStore.getId() == id) {
                return ResponseEntity.ok(userStore);
            }
        }
        Map<String, Object> response = new HashMap<>();
        response.put("id", "no encontrado");
        response.put("message", "No se Encontro el usuario con el id : " + id + " Por favor intente con un id diferente.");
        response.put("status", HttpStatus.NOT_FOUND);
        
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}

