package com.example.util;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class OCRUtil {

    public static String extractTextFromImage(File imageFile) {

        System.setProperty("jna.library.path", "/opt/homebrew/lib");


        Tesseract tesseract = new Tesseract();
        // Asegúrate que esta ruta sea correcta en tu sistema
        tesseract.setDatapath("/opt/homebrew/share/tessdata");
        tesseract.setLanguage("eng");
        try {
            BufferedImage image = ImageIO.read(imageFile);
            return tesseract.doOCR(image).trim();
        } catch (TesseractException | java.io.IOException e) {
            e.printStackTrace();
            return "ERROR";
        }
    }
}
