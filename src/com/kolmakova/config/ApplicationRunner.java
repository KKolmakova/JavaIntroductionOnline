package com.kolmakova.config;

import com.kolmakova.algorithmization.AlgorithmizationLoader;
import com.kolmakova.basics.BasicsLoader;
import com.kolmakova.strings.StringLoader;

public class ApplicationRunner {

    public static void start() {
        BasicsLoader.Start();
        AlgorithmizationLoader.start();
        StringLoader.start();
    }
}
