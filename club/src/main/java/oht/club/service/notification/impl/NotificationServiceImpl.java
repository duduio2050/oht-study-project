package oht.club.service.notification.impl;

import oht.club.controller.board.notification.dto.NotificationListRequest;
import oht.club.repository.notification.NotificationRepository;
import oht.club.repository.notification.entity.Notification;
import oht.club.service.notification.NotificationService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }


    @Override
    public String join(NotificationListRequest notificationListRequest){

        Notification notification = Notification.builder()
                .title(notificationListRequest.getTitle())
                .content(notificationListRequest.getContent())
                .createdAt(notificationListRequest.getCreatedAt())
                .build();

        notificationRepository.save(notification);

        return "success";

    }

}
