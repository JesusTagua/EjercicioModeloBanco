# Proyecto de Sistema Bancario

Este proyecto es una aplicación de demostración de un sistema bancario básico implementado en Java. El objetivo principal es simular el funcionamiento de cuentas de ahorro y cuentas corrientes, así como realizar operaciones comunes como depósitos, retiros y actualizaciones de saldo.

## Estructura del Proyecto

El proyecto consta de las siguientes clases principales:

- **CuentasBancarias.java**: Clase principal que contiene el método `main` para ejecutar la aplicación. En este archivo se crean instancias de clientes y cuentas bancarias.
- **Cliente.java**: Clase que representa a un cliente del banco, con atributos como ID, nombre, dirección y teléfono.
- **Cuenta.java**: Clase abstracta que sirve como base para las clases `CuentaAhorro` y `CuentaCorriente`. Contiene métodos comunes como `ingresar`, `retirar` y `actualizarSaldo`.
- **CuentaAhorro.java**: Clase que extiende la clase `Cuenta` y representa una cuenta de ahorro bancaria. Incluye atributos específicos como interés variable y saldo mínimo.
- **CuentaCorriente.java**: Clase que extiende la clase `Cuenta` y representa una cuenta corriente bancaria. Incluye un atributo adicional para el interés fijo.

## Ejecución del Proyecto

Para ejecutar el proyecto, simplemente abre el archivo `CuentasBancarias.java` y ejecuta el método `main`. Esto generará una interfaz de usuario básica que muestra información sobre las cuentas bancarias creadas y algunos detalles sobre los clientes.

## Contribuciones

Siéntete libre de contribuir a este proyecto. Puedes hacerlo creando nuevas funcionalidades, mejorando el código existente o corrigiendo errores. Cualquier contribución es bienvenida.

## Tecnologías Utilizadas

- Java
- Swing (para la interfaz gráfica de usuario)
