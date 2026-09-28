# 📋 Product Backlog Priorizado - Restaurante

**Visión del Producto:** Proporcionar un sistema centralizado que optimice la atención al cliente, acelere el procesamiento de comandas y facilite la facturación en caja.

---

## 🏆 Épicas y Features

### Épica 01: Gestión de Usuarios y Autenticación (EP-01)
* **FT-01.1:** Registro y autenticación de usuarios.
* **FT-01.2:** Administración y mantenimiento CRUD de usuarios (Admin/Backend).

### Épica 02: Gestión del Menú Digital y Catálogo (EP-02)
* **FT-02.1:** Visualización y filtrado de productos por categorías.
* **FT-02.2:** Administración del estado de disponibilidad de platillos.

### Épica 03: Toma de Pedidos y Comanda / Carrito (EP-03)
* **FT-03.1:** Selección de platos, modificación de cantidades y cálculo de subtotal.
* **FT-03.2:** Confirmación y envío del pedido a cocina con número de mesa.

### Épica 04: Módulo de Caja y Facturación (EP-04)
* **FT-04.1:** Consulta de pedidos pendientes de cobro por mesa.
* **FT-04.2:** Generación de factura con impuestos (IVA/Propina) y métodos de pago.

---

## 📊 Matriz del Product Backlog

| ID | Tipo | Descripción | Prioridad | Puntos | Estado |
| :--- | :--- | :--- | :--- | :---: | :--- |
| **US-01** | Historia | Registrar nuevos usuarios en el sistema | Alta | 3 | Listo |
| **US-02** | Historia | Autenticar usuario con correo y contraseña | Alta | 3 | Listo |
| **US-03** | Historia | Consultar usuario por ID (Backend Java) | Alta | 2 | Sprint 1 |
| **US-04** | Historia | Actualizar datos de un usuario (Backend Java) | Alta | 3 | Sprint 1 |
| **US-05** | Historia | Eliminar un usuario del sistema (Backend Java) | Media | 2 | Sprint 1 |
| **US-06** | Historia | Consultar cantidad total de usuarios en Array | Media | 1 | Sprint 1 |
| **US-07** | Historia | Menú interactivo por consola `menuUser()` | Alta | 3 | Sprint 1 |
| **US-08** | Historia | Visualizar el menú digital organizado por categorías | Alta | 5 | Sprint 1 |
| **US-09** | Historia | Filtrar platillos por categoría (Entradas, Fuertes, Bebidas) | Media | 3 | Pendiente |
| **US-10** | Historia | Agregar y quitar platillos al pedido (Carrito) | Alta | 5 | Sprint 1 |
| **US-11** | Historia | Modificar cantidades e incrementar/decrementar total | Alta | 3 | Sprint 1 |
| **US-12** | Historia | Confirmar comanda asignando un número de mesa | Alta | 3 | Pendiente |
| **US-13** | Historia | Consultar comandas activas en la interfaz de caja | Alta | 5 | Pendiente |
| **US-14** | Historia | Generar comprobante/factura calculando IVA y total | Alta | 5 | Pendiente |
| **US-15** | Historia | Diseñar interfaz responsive (1920px, 786px, 460px) | Alta | 5 | Sprint 1 |