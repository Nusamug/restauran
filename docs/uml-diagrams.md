# 📐 Diagramas UML del Sistema

## 1. Diagrama de Casos de Uso (Interacción de Roles)

```mermaid
graph TD
    subgraph Actores
        Cliente
        Mesero
        Cajero
        Admin
    end

    subgraph Módulos Restaurante
        CU1(Visualizar Menú)
        CU2(Gestión de Carrito/Comanda)
        CU3(Enviar Pedido a Cocina)
        CU4(Consultar Factura por Mesa)
        CU5(Procesar Cobro)
        CU6(CRUD de Usuarios)
    end

    Cliente --> CU1
    Cliente --> CU2
    Mesero --> CU1
    Mesero --> CU2
    Mesero --> CU3
    Cajero --> CU4
    Cajero --> CU5
    Admin --> CU6

    classDiagram
    class User {
        -int id
        -String name
        -String email
        -String password
        -String role
        +getId() int
        +setName(String name)
        +getRole() String
    }

    class IUserService {
        <<interface>>
        +createUser(User user)
        +updateUser(User user)
        +selectUserById(int id) User
        +deleteUser(int id) boolean
        +countUsers() int
    }

    class UserServiceImpl {
        -List~User~ userList
        +createUser(User user)
        +updateUser(User user)
        +selectUserById(int id) User
        +deleteUser(int id) boolean
        +countUsers() int
    }

    class Producto {
        +int id
        +String nombre
        +double precio
        +String categoria
    }

    class Pedido {
        +int idPedido
        +int numeroMesa
        +List~Producto~ items
        +double calcularTotal()
    }

    IUserService <|.. UserServiceImpl
    UserServiceImpl "1" *-- "many" User
    Pedido "1" o-- "many" Producto