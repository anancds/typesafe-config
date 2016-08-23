
package com.cds.learn.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;

public class App1 {

    public static void main(String[] args) {
        Config conf = ConfigFactory.load();
        System.out.println(conf);
        String bar1 = conf.getString("flyway.locations");
        System.out.println(bar1);
        System.out.println(conf.getInt("spark.context-settings.num-cpu-cores"));
        System.out.println(conf.getString("abc"));

        Config conf1 = ConfigFactory.parseFile(new File("src/main/resources/local.conf")).withFallback(conf).resolve();

        System.out.println(conf1.getString("abc"));

    }
}
