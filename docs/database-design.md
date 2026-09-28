# 🗄️ Modelo de Base de Datos - Restaurante

```mermaid
erDiagram
    USUARIOS ||--o{ PEDIDOS : "atiende / registra"
    USUARIOS ||--o{ FACTURAS : "procesa cobro"
    CATEGORIAS ||--o{ PRODUCTOS : "clasifica"
    PEDIDOS ||--o{ DETALLE_PEDIDOS : "contiene"
    PRODUCTOS ||--o{ DETALLE_PEDIDOS : "es parte de"
    PEDIDOS ||--o| FACTURAS : "genera"

    USUARIOS {
        int id_usuario PK
        string nombre
        string email
        string password
        string rol "ADMIN | MESERO | CAJERO | CLIENTE"
        boolean estado
    }

    CATEGORIAS {
        int id_categoria PK
        string nombre "Entradas | Platos Fuertes | Bebidas | Postres"
    }

    PRODUCTOS {
        int id_producto PK
        int id_categoria FK
        string nombre
        string descripcion
        decimal precio
        string imagen_url
        boolean disponible
    }

    PEDIDOS {
        int id_pedido PK
        int id_usuario_mesero FK
        int numero_mesa
        datetime fecha_hora
        string estado "PENDIENTE | EN_PREPARACION | ENTREGADO | PAGADO"
        decimal total
    }

    DETALLE_PEDIDOS {
        int id_detalle PK
        int id_pedido FK
        int id_producto FK
        int cantidad
        decimal precio_unitario
        decimal subtotal
    }

    FACTURAS {
        int id_factura PK
        int id_pedido FK
        int id_usuario_cajero FK
        datetime fecha_pago
        decimal subtotal
        decimal iva
        decimal total_pagado
        string metodo_pago "EFECTIVO | TARJETA | TRANSFERENCIA"
    }