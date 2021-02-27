package OnTaskListener;

@FunctionalInterface
/**
 * Данный функциональный интерфейс содержит
 * метод {@link #onError()}.
 */
public interface OnTaskErrorListener{
    /**
     * Принимает в качестве параметра
     * строку. Не возвращает результат
     * своей работы.
     * @param result параметр типа String
     */
    void onError(String result);
}
