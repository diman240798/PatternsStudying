package mvc;

public class BeatModel {
    ViewInfo view;
    BeatController beatController;

    public BeatModel(ViewInfo view) {
        this.view = view;
    }

    public void setBeatController(BeatController beatController) {
        this.beatController = beatController;
    }

    public void increaseBeat() {
        double progress = view.infoProgressBar.getProgress();
        if (progress >= 1) {
            beatController.report("Beat is max already");
            return;
        }
        view.inrcreaseBeat();
    }

    public void decreaseBeat() {
        double progress = view.infoProgressBar.getProgress();
        if (progress <= 0) {
            beatController.report("Beat is min already");
            return;
        }
        view.decreaseBeat();
    }

    public void setBeat(double beat) {
        view.setBeat(beat);
    }
}
