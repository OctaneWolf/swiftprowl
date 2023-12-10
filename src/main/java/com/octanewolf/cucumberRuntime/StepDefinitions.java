package com.octanewolf.cucumberRuntime;

import com.octanewolf.swiftprowl.script.OWexception;
import io.cucumber.java.es.*;
import com.octanewolf.swiftprowl.script.FindFailed;
import com.octanewolf.swiftprowl.script.Screen;
import com.octanewolf.swiftprowl.script.OCR;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.octanewolf.swiftprowl.cucumberHelpers.commonUtils.*;

public class StepDefinitions {
    Screen s = new Screen();

    public StepDefinitions(){}

    @Cuando("doy click en el elemento {string}")
    public void doyClickEnElElementoMouse(String var0) throws FindFailed, IOException {
        var p = setPattern("src/main/resources/com/octanewolf/cucumberRuntime/images/mouse.png",0.6);
        BufferedImage img = ImageIO.read(new File("src/main/resources/com/octanewolf/cucumberRuntime/images/test1.png"));
        String text = OCR.readText(img);
        System.out.print("Text: "+text);

    }

}