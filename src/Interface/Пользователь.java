package Interface;

import java.util.List;

public interface Пользователь {
    List<String> получитьСписокКоллекций();
    void добавитьПрава(String право);
    void удалитьКоллекцию(String право);
}
