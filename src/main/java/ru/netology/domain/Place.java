package ru.netology.domain;

public class Place {
    private int id;           // Идентификатор места
    private String title;     // Название места
    private int latitude;     // Географическая широта, заданная в градусах (от -90 до 90).
    private int longitude;    // Географическая широта, заданная в градусах (от -90 до 90)
    private int created;      // Дата создания места в Unixtime
    private String icon;      // Иконка места, URL изображения
    private int checkins;     // Число отметок в этом месте.
    private int updated;      // Дата обновления места в Unixtime
    private int type;         // Тип места
    private int country;      // Идентификатор страны
    private int city;         // Идентификатор города
    private String address;   // Адрес места


}
