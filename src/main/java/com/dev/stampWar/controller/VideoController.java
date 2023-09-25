package com.dev.stampWar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/video")
@Controller
public class VideoController {

	@RequestMapping("/videoOne")
	public String videoOne() {
		
		return "front/video/videoOne";
	}
	
	@RequestMapping("/videoTwo")
	public String videoTwo() {
		
		return "front/video/videoTwo";
	}
	
	@RequestMapping("/videoThree")
	public String videoThree() {
		
		return "front/video/videoThree";
	}
	
	@RequestMapping("/videoFour")
	public String videoFour() {
		
		return "front/video/videoFour";
	}
	
	@RequestMapping("/videoFive")
	public String videoFive() {
		
		return "front/video/videoFive";
	}
	
	@RequestMapping("/videoSeven")
	public String videoSeven() {
		
		return "front/video/videoSeven";
	}
}
