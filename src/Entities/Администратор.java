package Entities;

import Interface.Пользователь;

import java.util.List;

public class Администратор {
    private List<String> списокПрав;
    private String никнейм;
    String получитьНикнейм(){return null;};
    void задатьИмя(String имя){};
    void датьПравоПользователю(Пользователь пользователь, String право){};
    void забратьПравоУПользователя(Пользователь пользователь, String право){};
    List<String> получитьСписокПрав(){return null;};
    void добавитьКоллекцию(String право){};
    void удалитьКоллекцию(String право){};

}
