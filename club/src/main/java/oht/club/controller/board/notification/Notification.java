package oht.club.controller.board.notification;

import lombok.Data;

import java.time.LocalDate;


@Data
public class Notification {

    // 고유키
    private Long id;

    // 게시글 제목
    private String title;

    // 게시글 내용
    private String Content;

    // 게시물 등록일
    private LocalDate created_at;

    public Notification(Long id, String title, String content, LocalDate created_at) {
        this.id = id;
        this.title = title;
        Content = content;
        this.created_at = created_at;
    }
}
