package oht.club.service.notification;

import oht.club.controller.board.notification.dto.NotificationListRequest;

import java.time.LocalDateTime;

public interface NotificationService {

    String join(NotificationListRequest notificationListRequest);

}
