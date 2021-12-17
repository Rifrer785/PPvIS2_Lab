package Interface;

import Entities.Книга;

import java.util.List;

public interface Библиотека {
    String получитьНазваниеКниги();
    List<Книга> получитьСписокКниг();
    void добавитьКнигу(Книга книга);
    void удалитьКнигу(Книга книга);
    void получитьПользователя(Пользователь пользователь);
}
