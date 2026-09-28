package backend;

import java.util.Scanner;

public class Main {
    private static UserServiceImpl userService = new UserServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuUser();
    }

    public static void menuUser() {
        int option = -1;

        do {
            System.out.println("\n================ MENÚ DE GESTIÓN DE USUARIOS ================");
            System.out.println("1. Registrar nuevo usuario (createUser)");
            System.out.println("2. Consultar usuario por ID (selectUserById)");
            System.out.println("3. Actualizar datos de usuario (updateUser)");
            System.out.println("4. Eliminar usuario (deleteUser)");
            System.out.println("5. Consultar total de usuarios (countUsers)");
            System.out.println("6. Listar todos los usuarios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[AVISO] Por favor ingrese un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Ingrese ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese Password: ");
                    String pass = scanner.nextLine();
                    System.out.print("Ingrese Rol (ADMIN/MESERO/CAJERO/CLIENTE): ");
                    String role = scanner.nextLine();

                    User newUser = new User(id, name, email, pass, role);
                    userService.createUser(newUser);
                    break;

                case 2:
                    System.out.print("Ingrese ID del usuario a buscar: ");
                    int searchId = Integer.parseInt(scanner.nextLine());
                    User foundUser = userService.selectUserById(searchId);
                    if (foundUser != null) {
                        System.out.println("[INFO] Usuario encontrado: " + foundUser);
                    } else {
                        System.out.println("[ERROR] No existe usuario con el ID ingresado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID del usuario a actualizar: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Ingrese nuevo Nombre: ");
                    String newName = scanner.nextLine();
                    System.out.print("Ingrese nuevo Email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Ingrese nuevo Rol: ");
                    String newRole = scanner.nextLine();

                    userService.updateUser(updateId, newName, newEmail, newRole);
                    break;

                case 4:
                    System.out.print("Ingrese ID del usuario a eliminar: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    userService.deleteUser(deleteId);
                    break;

                case 5:
                    System.out.println("[TOTAL] Total de usuarios registrados en el Array: " + userService.countUsers());
                    break;

                case 6:
                    System.out.println("\n--- Lista General de Usuarios ---");
                    for (User u : userService.getAllUsers()) {
                        System.out.println(u);
                    }
                    break;

                case 0:
                    System.out.println("[INFO] Saliendo del sistema...");
                    break;

                default:
                    System.out.println("[AVISO] Opción no válida.");
            }

        } while (option != 0);
    }
}