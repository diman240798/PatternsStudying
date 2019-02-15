package mvc;

import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewInfo implements Initializable {

    public ProgressBar infoProgressBar;

    public void inrcreaseBeat() {
        double current = infoProgressBar.getProgress();
        infoProgressBar.setProgress(current + 0.1);
    }

    public void decreaseBeat() {
        double current = infoProgressBar.getProgress();
        infoProgressBar.setProgress(current - 0.1);
    }

    public void setBeat(double beat) {
        if (beat < 0 || beat > 1)
            throw new RuntimeException("Error: can't set such beat");
        infoProgressBar.setProgress(beat);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
