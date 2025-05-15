package com.example.steps;


import com.example.pages.LoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Dado("que el usuario visita la pagina")
    public void abrirPagina() {
        loginPage.abrirPagina();
    }

    @Cuando("el usuario ingresa los campos: {string}, {string}, {string}, {string}")
    public void elUsuarioIngresaLosCampos(String usuario, String ladoA, String ladoB, String ladoC) {
        loginPage.registrarDatos(usuario, ladoA, ladoB, ladoC);
    }

    @Y("el usuario presiona Check")
    public void elUsuarioPresionaCheck() {
        loginPage.clickCheck();
    }

    @Entonces("el sistema muestra el triangulo {string}")
    public void elSistemaMuestraElTriangulo( String tipoTrianguloEsperado) {
        File imagen = loginPage.capturarResultadoComoImagen();
        String textoReconocido = com.example.util.OCRUtil.extractTextFromImage(imagen);
        System.out.println("Usando OCR" + textoReconocido);
        assertTrue(textoReconocido.toLowerCase().contains(tipoTrianguloEsperado.toLowerCase()));
    }
}