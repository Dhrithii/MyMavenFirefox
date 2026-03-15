package com.example;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Running Selenium App01...");
        Process p1 = Runtime.getRuntime().exec(
                "mvn -f ../MyMavenSeleniumApp01 exec:java -Dexec.mainClass=com.example.App");
        p1.waitFor();

        Thread.sleep(15000);

        System.out.println("Running Selenium App02...");
        Process p2 = Runtime.getRuntime().exec(
                "mvn -f ../MyMavenSeleniumApp02 exec:java -Dexec.mainClass=com.example.App");
        p2.waitFor();

        Thread.sleep(15000);

        System.out.println("Running Selenium App03...");
        Process p3 = Runtime.getRuntime().exec(
                "mvn -f ../MyMavenSeleniumApp03 exec:java -Dexec.mainClass=com.example.App");
        p3.waitFor();

        System.out.println("All Selenium programs executed.");
    }
}
