package oht.club.controller.board.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@Slf4j
@RequestMapping("/notification")
public class NotificationController {

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
    @PostMapping("/edit/{notificationId}")
    public void notificationDelete() {

    }
}
