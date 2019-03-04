package com.patterns.Singleton;

public class Sing {
    private Sing(){

    }

    private static Sing sing;
    private static String logFile = "This is log file. \n \n";

    public static Sing getProgrammLogger(){
        if (sing == null)
            sing = new Sing();
        return sing;
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }


}
