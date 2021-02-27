import OnTaskListener.OnTaskDoneListener;
import OnTaskListener.OnTaskErrorListener;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        try{
            Worker.getInstance(doneListener, errorListener).start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
