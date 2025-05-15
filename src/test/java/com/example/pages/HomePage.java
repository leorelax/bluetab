package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;

import java.io.File;

public class HomePage extends PageObject {

    private By txtName = By.id("username");
    private By txtLadoA = By.id("SideA");
    private By txtLadoB = By.id("SideB");
    private By txtLadoC = By.id("SideC");
    private By btnButton = By.xpath("//button[@type='button']");

    public void abrirPagina() {
        open();
    }

    public void registrarDatos(String username, String a, String b, String c) {
        $(txtName).sendKeys(username);
        $(txtLadoA).sendKeys(a);
        $(txtLadoB).sendKeys(b);
        $(txtLadoC).sendKeys(c);
    }

    public void clickCheck() {
        $(btnButton).click();
    }

    public File capturarResultadoComoImagen() {
        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

        File destino = new File("capturas/resultado_completo.png");
        destino.getParentFile().mkdirs();

        try {
            java.nio.file.Files.copy(screenshot.toPath(), destino.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Screenshot completo guardado en: " + destino.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return destino;
    }


}
