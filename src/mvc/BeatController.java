package mvc;

public class BeatController {
    ViewController view;
    BeatModel beatModel;

    public BeatController(BeatModel beatModel) {
        this.beatModel = beatModel;
    }

    public void setView(ViewController view) {
        this.view = view;
    }

    public void decreaseBeat() {
        beatModel.decreaseBeat();
    }

    public void increaseBeat() {
        beatModel.increaseBeat();
    }

    public void setBeat(String beatTxt) {
        double beat = -1;
        try {
            beat = Double.parseDouble(beatTxt);
        } catch (Exception e) {
            reportToView("Can't set such beat!!!");
            return;
        }

        if (beat < 0 || beat > 100) {
            reportToView("Can't set such beat!!!");
            return;
        }
        beat = beat / 100;
        beatModel.setBeat(beat);
    }

    private void reportToView(String report) {
        view.report(report);
    }

    public void report(String report) {
        view.report(report);
    }
}
