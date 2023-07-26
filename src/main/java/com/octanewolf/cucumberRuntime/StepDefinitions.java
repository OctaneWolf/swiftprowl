package com.octanewolf.cucumberRuntime;

import com.octanewolf.swiftProwl.cucumberHelpers.commonUtils;
import io.cucumber.java.es.*;
import com.octanewolf.swiftProwl.script.FindFailed;
import static com.octanewolf.swiftProwl.cucumberHelpers.commonUtils.genSPath;
import com.octanewolf.swiftProwl.script.Pattern;
import com.octanewolf.swiftProwl.script.Screen;

public class StepDefinitions {
    Screen s = new Screen();
    static {System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);}

    public StepDefinitions(){}

    @Dado("que inicio la app")
    public void launch() {
        commonUtils.run("control");}


    @Cuando("doy click en el elemento {string}")
    public void doyClickEnElElementoMouse(String var0){
        Pattern p = new Pattern(genSPath("src/main/resources/com/octanewolf/cucumberRuntime/images/mouse.png"))
                .similar(0.6f);
        try {s.wait(p, 10).click();}
        catch (FindFailed e) {e.printStackTrace();}
    }

}