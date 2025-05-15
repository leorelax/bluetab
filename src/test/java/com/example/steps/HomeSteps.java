package com.example.steps;


import com.example.pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeSteps {

    @Steps
    HomePage home;

    @Dado("que el usuario visita la pagina")
    public void abrirPagina() {
        home.abrirPagina();
    }

    @Cuando("el usuario ingresa los campos: {string}, {string}, {string}, {string}")
    public void elUsuarioIngresaLosCampos(String usuario, String ladoA, String ladoB, String ladoC) {
        home.registrarDatos(usuario, ladoA, ladoB, ladoC);
    }

    @Y("el usuario presiona Check")
    public void elUsuarioPresionaCheck() {
        home.clickCheck();
    }

    @Entonces("el sistema muestra el triangulo {string}")
    public void elSistemaMuestraElTriangulo( String tipoTrianguloEsperado) {
        File imagen = home.capturarResultadoComoImagen();
        String textoReconocido = com.example.util.OCRUtil.extractTextFromImage(imagen);
        System.out.println("Usando OCR" + textoReconocido);
        assertTrue(textoReconocido.toLowerCase().contains(tipoTrianguloEsperado.toLowerCase()));
    }
}