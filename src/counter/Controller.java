package counter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller implements CounterListener {

    Counter counter = new Counter();

    @FXML
    private Label currentCount;

    public void initialize () {
        currentCount.setText("" + counter.getCount());
        counter.addCounterListener(this);
    }

    public void incrementCounter () {
        counter.incrementCount();
    }

    public void decrementCounter () {
        counter.decrementCount();
    }

    public void counterChanged(Counter counterThatChanged) {
        currentCount.setText("" + counterThatChanged.getCount());
    }
}
