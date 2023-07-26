package com.octanewolf.swiftProwl.cucumberHelpers;

import com.octanewolf.swiftProwl.script.Screen;
import java.nio.file.Paths;

public class commonUtils {
        public static void run(String command) {
            Screen s = new Screen();
            try {
                Runtime.getRuntime().exec(command);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static String genSPath(String path) {
            Screen s = new Screen();
            return Paths.get(path).toAbsolutePath().toString();
        }
        public static void initOCP(){System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);}
}
