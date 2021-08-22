package com.test.web.controller.admin.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {

	@RequestMapping("list")
	public String list() {
		List<Notice> list = service.getList();
		return "admin/board/notice/list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		return "admin/board/notice/detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "admin/board/notice/reg";
	}
}
