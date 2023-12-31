package LLD.ObserverPattern;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("open" ,file);
    }

    public void saveFile() throws Exception {
        if(this.file != null){
            events.notify("save",file);
        }else {
            throw new Exception("please open a file first");
        }
    }
}
