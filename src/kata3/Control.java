package kata3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Control {
    private String filename;

    public Control(String filename) {
        this.filename = filename;
    }
    
    public void execute() throws FileNotFoundException, IOException{
        HistogramBuilder<String> builder = new HistogramBuilder();
        builder.ubicate(MailReader.readMail(filename));
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
