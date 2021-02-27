package OnTaskListener;

@FunctionalInterface
/**
 * Данный функциональный интерфейс содержит
 * метод {@link #onDone()}.
 */
public interface OnTaskDoneListener {
    /**
     * Принимает в качестве параметра
     * строку. Не возвращает результат
     * своей работы.
     * @param result параметр типа String
     */
    void onDone(String result);
}
