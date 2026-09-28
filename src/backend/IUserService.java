package backend;

public interface IUserService {
    void createUser(User user);
    boolean updateUser(int id, String newName, String newEmail, String newRole);
    User selectUserById(int id);
    boolean deleteUser(int id);
    int countUsers(); // Método adicional para contar el total en el array
}