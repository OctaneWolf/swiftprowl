package com.octanewolf.swiftprowl.cucumberHelpers;

import com.octanewolf.swiftprowl.script.OWexception;
import com.octanewolf.swiftprowl.script.Pattern;
import com.octanewolf.swiftprowl.script.Screen;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;

public class commonUtils {

        public static void run(String command) throws OWexception {
            Screen s = new Screen();
            try {
                if (Objects.equals(command, "")) {
                    throw new OWexception("No command was given");
                } else {
                    if (System.getProperty("os.name").toLowerCase().contains("win"))
                        Runtime.getRuntime().exec("cmd /c start " + command);
                    else if (System.getProperty("os.name").toLowerCase().contains("mac"))
                        Runtime.getRuntime().exec("open " + command);
                    else if (System.getProperty("os.name").toLowerCase().contains("nix"))
                        Runtime.getRuntime().exec("xdg-open " + command);
                };
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static String getAbsP(String path) {
            Screen s = new Screen();
            return Paths.get(path).toAbsolutePath().toString();
        }
        public static Pattern setPattern(String path, double similarity) {
            Screen s = new Screen();
            return new Pattern(getAbsP(path)).similar(Double.parseDouble(similarity+"f"));
        };
        public static Screen getScreen() {
            Screen s = new Screen();
            return s;
        }
}
