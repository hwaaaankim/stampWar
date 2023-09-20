package com.dev.stampWar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.stampWar.model.EventParticipant;
import com.dev.stampWar.model.EventTwo;
import com.dev.stampWar.service.EventParticipantService;
import com.dev.stampWar.service.PartTwoService;

@Controller
@RequestMapping("/event")
public class EventController {

	@Autowired
	EventParticipantService eventParticipantService;
	
	@Autowired
	PartTwoService partTwoService;
	
	@RequestMapping("/comment")
	public String comment() {
		
		return "front/event/comment";
	}
	
	@PostMapping("/eventParticipant")
	@ResponseBody
	public String eventParicipant(EventParticipant eventParticipant) {
		eventParticipantService.eventInsert(eventParticipant);
		
		StringBuffer sb = new StringBuffer();
		String msg = "이벤트 신청이 완료 되었습니다.";

		sb.append("alert('" + msg + "');");
		sb.append("location.href='/index'");
		sb.append("</script>");
		sb.insert(0, "<script>");

		return sb.toString();
		
	}
	
	@PostMapping("/eventTwoParticipant")
	@ResponseBody
	public String eventTwoParticipant(EventTwo eventTwo) {
		partTwoService.eventInsert(eventTwo);
		
		StringBuffer sb = new StringBuffer();
		String msg = "이벤트 신청이 완료 되었습니다.";

		sb.append("alert('" + msg + "');");
		sb.append("location.href='/index'");
		sb.append("</script>");
		sb.insert(0, "<script>");

		return sb.toString();
		
	}
	
	@RequestMapping("/eventOne")
	public String eventOne() {
		
		return "front/event/eventOne";
	}
	
	@RequestMapping("/eventTwo")
	public String eventTwo() {
		
		return "front/event/eventTwo";
	}
	
	@RequestMapping("/eventOneDetail")
	public String eventThree() {
		
		return "front/event/eventOneDetail";
	}
	
	@RequestMapping("/prize")
	public String prize() {
		
		return "front/event/prize";
	}
}
