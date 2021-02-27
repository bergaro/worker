import OnTaskListener.OnTaskDoneListener;
import OnTaskListener.OnTaskErrorListener;


public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    /**
     * Создаёт экземпляр класса Worker
     * с инициализацией полей callback и errorCallback
     * @param callback реализация OnTaskDoneListener
     * @param errorCallback реализация OnTaskErrorListener
     * @return экземпляр класса Worker
     */
    public static Worker getInstance (OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        Worker worker = new Worker();
        worker.callback = callback;
        worker.errorCallback = errorCallback;
        return worker;
    }
    /**
     * Доступ к экземплярам класса Worker
     * возможен только посредством статического
     * фабричного метода
     */
    private Worker() {  }

    /**
     * С интервалом 0,1 сек произвоит итерации.
     * Общее кол-во итераций - 100
     * На 33 итерации возникает "ошибка"
     * @throws InterruptedException пробрасываемое исключение
     */
    public void start() throws InterruptedException {
        for(int i = 0; i < 100; i++) {
            Thread.sleep(100);
            if(i != 33) {
                callback.onDone("Задача " + i + " выполнена");
            } else {
                errorCallback.onError("В задаче " + i + " ОШИБКА");
            }
        }
    }

}
