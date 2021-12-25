package ru.netology.domain;

public class Post {

    private int id;
    private int ownerId;      // Идентификатор владельца стены, на которой размещена запись
    private int fromId;       // Идентификатор автора записи(от чьего имени опубликована запись)
    private int createdBy;    //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ)
    private int date;         // Время публикации записи в формате unixtime
    private String text;      // Текст записи
    private int replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;  // Идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;  // 1, если запись была создана с опцией «Только для друзей»
    private String postType;  // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private int signerId;     // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int canPin;       // Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private int canDelete;    // Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
    private int canEdit;      // Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
    private int isPinned;     // Информация о том, что запись закреплена
    private int markedAsAds;  // Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет)
    private boolean isFavorite; // true, если объект добавлен в закладки у текущего пользователя
    private int postponedId;  // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере

    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;


// + get/set на все поля

}
