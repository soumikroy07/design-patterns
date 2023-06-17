package LLD.ObserverPattern;

import java.io.File;

public class LogOpenListener implements EventListener{
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }


    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log "+log+" : someone has performed "+eventType+
                "Operation with the following file : "+log.getName());
    }
}
