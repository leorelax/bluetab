# Reto BLUETAB

Este proyecto es un reto de automatización web de la página (https://www.developsense.com/triangle) utilizando herramientas y tecnologías como **Selenium**, **Serenity**, **Cucumber** e **IntelliJ**.

---

## 🛠️ Tecnologías y Herramientas

- 🔍 **OCR (Tess4J)**: Para obtener el texto de imágenes generadas por la aplicación.
- 🌐 **Selenium WebDriver**: Para automatizar la interacción con el navegador.
- 🍃 **Cucumber**: Para definir escenarios de prueba en lenguaje natural (BDD).
- 💡 **Serenity BDD**: Para gestionar pruebas automatizadas y generar reportes visuales.
- 🧪 **JUnit 5**: Framework de pruebas para ejecutar los escenarios.
- 📦 **Maven**: Para gestión de dependencias y construcción del proyecto.

---

## ✅ Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalados:

- Java 11 o superior  
- Maven  
- Navegador (Chrome, Firefox o Edge)  
- [Tesseract OCR instalado y configurado correctamente](https://github.com/tesseract-ocr/tesseract) (usado por Tess4J)  
- **Intellij** debe estar configurado (si aplica en tu entorno, consulta la documentación correspondiente)

---

## 📥 Instalación

Clona este repositorio a tu máquina local:

```bash
git clone https://github.com/leorelax/bluetab
```bash

## Ejecución

```bash
mvn clean verify -Dcucumber.filter.tags=@triangulo  
```bash

## Reporte

Se genera el reporte en la carpeta TARGET, archivo index.html
