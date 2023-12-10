package com.OctaneWolf.cucumberRuntime;

import com.OctaneWolf.swiftProwl.script.OWexception;
import io.cucumber.java.es.*;
import com.OctaneWolf.swiftProwl.script.FindFailed;
import com.OctaneWolf.swiftProwl.script.Screen;
import com.OctaneWolf.swiftProwl.script.OCR;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static com.OctaneWolf.swiftProwl.cucumberHelpers.commonUtils.*;

public class StepDefinitions {
    Screen s = new Screen();

    public StepDefinitions(){}

    @Cuando("doy click en el elemento {string}")
    public void doyClickEnElElementoMouse(String var0) throws FindFailed, IOException {
        var p = setPattern("src/main/resources/com/OctaneWolf/cucumberRuntime/images/mouse.png",0.6);
        BufferedImage img = ImageIO.read(new File("src/main/resources/com/OctaneWolf/cucumberRuntime/images/test1.png"));
        String text = OCR.readText(img);
        System.out.print("Text: "+text);

    }

}