package com.kolmakova.config;

import com.kolmakova.algorithmization.AlgorithmizationLoader;
import com.kolmakova.basics.BasicsLoader;

public class ApplicationRunner {

    public static void start() {
        BasicsLoader.Start();
        AlgorithmizationLoader.start();
    }
}
