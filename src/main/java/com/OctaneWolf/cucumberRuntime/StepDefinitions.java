package com.OctaneWolf.cucumberRuntime;

import com.OctaneWolf.swiftProwl.script.OWexception;
import io.cucumber.java.es.*;
import com.OctaneWolf.swiftProwl.script.FindFailed;
import com.OctaneWolf.swiftProwl.script.Screen;
import static com.OctaneWolf.swiftProwl.cucumberHelpers.commonUtils.*;

public class StepDefinitions {
    Screen s = new Screen();

    public StepDefinitions(){}

    @Dado("que inicio la app {string}")
    public void launch( String app) throws OWexception {run(app);}

    @Cuando("doy click en el elemento {string}")
    public void doyClickEnElElementoMouse(String var0) throws FindFailed{
        var p = setPattern("src/main/resources/com/OctaneWolf/cucumberRuntime/images/mouse.png",0.6);
        s.wait(p, 5).click();
    }

}