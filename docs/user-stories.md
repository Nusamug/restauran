# 📖 Fichas de Historias de Usuario

## US-03: Consultar Usuario por ID (Backend Java)
* **Como:** Administrador del restaurante.
* **Quiero:** Buscar un usuario ingresando su ID único.
* **Para:** Verificar sus datos personales y rol en el sistema.
* **Criterios de Aceptación:**
  * Dado un ID existente, el sistema retorna el objeto `User` correspondiente.
  * Si el ID no existe, muestra un mensaje de advertencia claro.
* **Prioridad:** Alta | **Estimación:** 2 Puntos

---

## US-07: Menú de Pruebas en Consola `menuUser()`
* **Como:** Desarrollador / Docente evaluador de Backend.
* **Quiero:** Interactuar con un menú por consola.
* **Para:** Ejecutar y validar en vivo los métodos de la clase `UserServiceImpl`.
* **Criterios de Aceptación:**
  * Menú numérico accesible con las opciones: Crear, Buscar por ID, Actualizar, Eliminar, Conter Usuarios y Salir.
  * Valida las entradas ingresadas por el usuario sin romperse.
* **Prioridad:** Alta | **Estimación:** 3 Puntos

---

## US-08: Visualizar Menú Digital de Productos
* **Como:** Cliente o Mesero.
* **Quiero:** Ver las tarjetas de los platos disponibles con su foto, nombre y precio.
* **Para:** Seleccionar qué platillos pedir.
* **Criterios de Aceptación:**
  * Renderizado dinámico mediante manipulación del DOM en JavaScript.
  * Muestra imagen, título, descripción y precio actualizado.
* **Prioridad:** Alta | **Estimación:** 5 Puntos

---

## US-10: Agregar y Gestionar Pedido (Carrito)
* **Como:** Mesero o Cliente.
* **Quiero:** Presionar "Agregar" en un plato para sumarlo a la lista de pedido.
* **Para:** Armar la orden completa antes de enviar a cocina.
* **Criterios de Aceptación:**
  * Muestra la lista de ítems seleccionados con botones `+` y `-`.
  * Recalcula en tiempo real el subtotal acumulado.
* **Prioridad:** Alta | **Estimación:** 5 Puntos

---

## US-15: Adaptación Responsive (3 Dispositivos)
* **Como:** Usuario desde cualquier dispositivo.
* **Quiero:** Visualizar la aplicación adaptada al tamaño de mi pantalla.
* **Para:** Operar con comodidad desde PC (1920px), Tablet (786px) o Celular (460px).
* **Criterios de Aceptación:**
  * Diseño limpio con breakpoints para 1920px, 786px y 460px sin desbordamientos horizontales.
* **Prioridad:** Alta | **Estimación:** 5 Puntos