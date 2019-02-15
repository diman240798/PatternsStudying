package mvc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
    private BeatController controller;

    public Label controllerReportLabel;
    public TextField controllerBeatScreen;

    public ViewController(BeatController  controller) {
        this.controller = controller;
    }


    void onIncreaseBeat() {
        controller.increaseBeat();
    }

    void onDecreaseBeat() {
        controller.decreaseBeat();
    }

    public void report(String report) {
        controllerReportLabel.setText(report);
    }

    public void onSetClicked(ActionEvent actionEvent) {
        String beatText = controllerBeatScreen.getText();
        controller.setBeat(beatText);
    }

    public void onDecrease(ActionEvent actionEvent) {
        onDecreaseBeat();
    }

    public void onIncrease(ActionEvent actionEvent) {
        onIncreaseBeat();
    }
}
