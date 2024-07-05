package oht.club.controller.board.notification.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationListRequest {

    private String title;

    private String content;

    private String createdAt;

}
