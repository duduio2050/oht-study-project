package oht.club.repository.notification.entity;

import oht.club.repository.notification.NotificationRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class NotificationTest {

    // 빈객체를 가져오는 어노테이션
    @Autowired
    private NotificationRepository notificationRepository;


    @Test
    public void test() {
        Notification notificationSave = Notification.builder()
                // autoincrement 라서 안넣어줘도 알아서 들어감
//                .id()
                .title("자 이제 시작이야")
                .content("내 꿈을 위한 여행")
                .createdAt("2024-07-02 11:11:11")
                .build();

        notificationRepository.save(notificationSave);

        Notification notification = notificationRepository.findById(notificationSave.getId()).get();

        // 성공
        Assertions.assertThat(notification.getId()).isEqualTo(notificationSave.getId());

        // 실패
        Assertions.assertThat(notification.getId()).isEqualTo(1231);
    }

}
