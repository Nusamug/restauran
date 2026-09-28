package backend;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {
    private List<User> userList;

    public UserServiceImpl() {
        this.userList = new ArrayList<>();
        // Datos iniciales de prueba
        userList.add(new User(1, "Carlos Admin", "admin@restaurante.com", "1234", "ADMIN"));
        userList.add(new User(2, "María Mesera", "maria@restaurante.com", "1234", "MESERO"));
    }

    @Override
    public void createUser(User user) {
        userList.add(user);
        System.out.println("[OK] Usuario registrado exitosamente.");
    }

    @Override
    public boolean updateUser(int id, String newName, String newEmail, String newRole) {
        User user = selectUserById(id);
        if (user != null) {
            user.setName(newName);
            user.setEmail(newEmail);
            user.setRole(newRole);
            System.out.println("[OK] Usuario actualizado correctamente.");
            return true;
        }
        System.out.println("[ERROR] Usuario no encontrado.");
        return false;
    }

    @Override
    public User selectUserById(int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        User user = selectUserById(id);
        if (user != null) {
            userList.remove(user);
            System.out.println("[OK] Usuario eliminado exitosamente.");
            return true;
        }
        System.out.println("[ERROR] No se pudo eliminar. Usuario no encontrado.");
        return false;
    }

    @Override
    public int countUsers() {
        return userList.size();
    }

    public List<User> getAllUsers() {
        return userList;
    }
}