package counter;

import java.util.ArrayList;

public class Counter {

    private int count = 0;
    private ArrayList<CounterListener> counterListeners = new ArrayList<CounterListener>();

    public int getCount () {
        return count;
    }

    public void incrementCount () {
        ++count;
        this.notifyCounterListeners();
    }

    public void decrementCount () {
        --count;
        this.notifyCounterListeners();
    }

    public void addCounterListener (CounterListener listener) {
        this.counterListeners.add(listener);
    }

    public void removeCounterListener (CounterListener listener) {
        this.counterListeners.remove(listener);
    }

    private void notifyCounterListeners () {
        for (CounterListener counterListener : this.counterListeners)
            counterListener.counterChanged(this);
    }
}
