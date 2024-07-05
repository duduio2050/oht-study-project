package oht.club.controller.board.notification;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import oht.club.controller.board.notification.dto.NotificationListRequest;
import oht.club.service.notification.NotificationService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RequestMapping("/notification")
@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    // 공지사항 리스트
    @GetMapping
    public String notification() {
        return "notification/list";
    }

    // 공지사항 상세
    @GetMapping("/{notificationId}")
    public String notificationView(@PathVariable int notificationId, Model model) {

        return "notification/view";
    }

    // 공지사항 insert 뷰
    @GetMapping("/edit")
    public String notificationInsertView() {

        return "notification/edit";
    }

    // 공지사항 insert 뷰
    @PostMapping("/edit")
    public String notificationInsert(@RequestBody NotificationListRequest notificationListRequest) {


        log.info("title = {}, content = {}, createdAt = {}", notificationListRequest.getTitle(), notificationListRequest.getContent(), notificationListRequest.getCreatedAt());

        String createdAt = notificationListRequest.getCreatedAt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(createdAt, formatter);

//        notificationListRequest.setContent(dateTime);

        String insert = notificationService.join(notificationListRequest);

        if(insert.equalsIgnoreCase("success")){
            return "success";
        }else{
            return "fail";
        }
    }

    // 공지사항 업데이트 뷰
    @GetMapping("/edit/{notificationId}")
    public String notificationUpdateView() {

        return "notification/edit";
    }

    // 공지사항 업데이트
    @PostMapping("/edit/{notificationId}")
    public String notificationUpdate() {

        return "notification/edit";
    }

    // 공지사항 삭제
    @PostMapping("/delete/{notificationId}")
    public void notificationDelete() {
        System.out.println(123);
    }
}
