Reto BLUETAB
Este proyecto es un reto de automatización web de la página https://www.developsense.com/triangle utilizando herramientas y tecnologías como Selenium, Serenity, Cucumber, e Intellij.

Tecnologías y Herramientas
OCR: Librería para obtener el texto a imágenes
Selenium WebDriver: Para la automatización de pruebas de interacción con el navegador.
Cucumber: Para realizar pruebas basadas en comportamiento (BDD).
Serenity BDD: Para gestionar las pruebas automatizadas y generar reportes detallados.
JUnit 5: Framework de pruebas para la ejecución y gestión de las pruebas.
Maven: Gestión de dependencias y construcción del proyecto.
Requisitos
Asegúrate de tener las siguientes herramientas instaladas antes de ejecutar el proyecto:

Java 11 o superior.
Maven para manejar las dependencias del proyecto.
Un navegador (Chrome, Firefox, Edge)
Aqua debe estar configurado para gestionar las pruebas (si aún no lo has hecho, revisa la documentación de Aqua para su configuración).
Instalación
Clona este repositorio a tu máquina local:

```bash
git clone https://github.com/leorelax/bluetab
```bash
Ejecución de las Pruebas
Para ejecutar las pruebas, simplemente usa el siguiente comando de Maven:

mvn clean verify -Dcucumber.filter.tags=@triangulo  
```bash

## Reportes

**Serenity** Los reportes estarán disponibles en el directorio `target/site/serenity/`. Para visualizar el reporte, abre el archivo `index.html` en tu navegador.
