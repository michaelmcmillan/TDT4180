package counter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller implements CounterListener {

    Counter counter = new Counter();

    @FXML
    private Label currentCount;

    public void initialize () {
        this.updateView(counter);
        counter.addCounterListener(this);
    }

    public void incrementCounter () {
        counter.incrementCount();
    }

    public void decrementCounter () {
        counter.decrementCount();
    }

    public void updateView (Counter counter) {
        currentCount.setText("" + counter.getCount());
    }

    public void counterChanged(Counter counterThatChanged) {
        this.updateView(counterThatChanged);
    }
}
