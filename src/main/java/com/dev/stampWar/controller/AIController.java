package com.dev.stampWar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.stampWar.model.member.AiImageModel;
import com.dev.stampWar.model.member.AiModel;
import com.dev.stampWar.repository.AiRepository;

@Controller
@RequestMapping("/ai")
public class AIController {

	@Autowired
	AiRepository aiRepository;
	
	
	@RequestMapping("/prompt")
	public String prompt() {
		
		return "front/ai/index";
	}
	
	@RequestMapping("/start")
	public String start(
			String animal
			) {
		return "front/ai/start";
	}
	
	@RequestMapping("/reset")
	@ResponseBody
	public String reset() {
		
		StringBuffer sb = new StringBuffer();
		String msg = "처음부터 시작 해 주세요.";

		sb.append("alert('" + msg + "');");
		sb.append("location.href='/ai/prompt'");
		sb.append("</script>");
		sb.insert(0, "<script>");

		return sb.toString();
	}
	
	@RequestMapping("/processingOne")
	public String processingOne(
			@RequestParam(required = false, defaultValue = "ZERO") String animal,
			Model model
			) {
		if("ZERO".equals(animal)) {
			return "redirect:/ai/reset";
		}else {
			Optional<AiModel> ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
					"none", "none", "none", "none", "normal");
			List<AiImageModel> images = null;
			if(ai.isPresent()) {
				images = ai.get().getImages();
			}
			int ran = (int)((Math.random()*20000)%19);
			String path = "https://teriwoo0519.cafe24.com/reforce/" + images.get(ran).getPath();
			model.addAttribute("animal", animal);
			model.addAttribute("src", path);
			return "front/ai/processingOne";
		}
	}
	
	@RequestMapping("/processingTwo")
	public String processingTwo(
			@RequestParam(required = false, defaultValue = "ZERO") String animal,
			@RequestParam(required = false, defaultValue = "ZERO") String action,
			Model model
			) {
		if("ZERO".equals(animal) || "ZERO".equals(action)) {
			return "redirect:/ai/reset";
		}else {
			
			Optional<AiModel> ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
					action, "none", "none", "none", "normal");
			List<AiImageModel> images = null;
			if(ai.isPresent()) {
				images = ai.get().getImages();
			}
			int ran = (int)((Math.random()*20000)%19);
			String path = "https://teriwoo0519.cafe24.com/reforce/" + images.get(ran).getPath();
			model.addAttribute("animal", animal);
			model.addAttribute("action", action);
			model.addAttribute("src", path);
			return "front/ai/processingTwo";
		}
	}
	
	@RequestMapping("/processingThree")
	public String processingThree(
			@RequestParam(required = false, defaultValue = "ZERO") String animal,
			@RequestParam(required = false, defaultValue = "ZERO") String action,
			@RequestParam(required = false, defaultValue = "ZERO") String point,
			Model model
			) {
		if("ZERO".equals(animal) || "ZERO".equals(action) || "ZERO".equals(point)) {
			return "redirect:/ai/reset";
		}else {
			
			Optional<AiModel> ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
					action, point, "none",  "none", "normal");
			List<AiImageModel> images = null;
			if(ai.isPresent()) {
				images = ai.get().getImages();
			}
			int ran = (int)((Math.random()*20000)%19);
			String path = "https://teriwoo0519.cafe24.com/reforce/" + images.get(ran).getPath();
			model.addAttribute("animal", animal);
			model.addAttribute("action", action);
			model.addAttribute("point", point);
			model.addAttribute("src", path);
			return "front/ai/processingThree";
		}
	}
	
	@RequestMapping("/processingFour")
	public String processingFour(
			@RequestParam(required = false, defaultValue = "ZERO") String animal,
			@RequestParam(required = false, defaultValue = "ZERO") String action,
			@RequestParam(required = false, defaultValue = "ZERO") String point,
			@RequestParam(required = false, defaultValue = "ZERO") String environ,
			Model model
			) {
		if("ZERO".equals(animal) || "ZERO".equals(action) ||"ZERO".equals(point) || "ZERO".equals(environ)) {
			return "redirect:/ai/reset";
		}else {
			
			Optional<AiModel> ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
					action, point , environ, "none", "normal");
			List<AiImageModel> images = null;
			if(ai.isPresent()) {
				images = ai.get().getImages();
			}
			int ran = (int)((Math.random()*20000)%19);
			String path = "https://teriwoo0519.cafe24.com/reforce/" + images.get(ran).getPath();
			model.addAttribute("animal", animal);
			model.addAttribute("action", action);
			model.addAttribute("point", point);
			model.addAttribute("environ", environ);
			model.addAttribute("src", path);
			return "front/ai/processingFour";
		}
	}
	
	@RequestMapping("/processingFive")
	public String processingFive(
			@RequestParam(required = false, defaultValue = "ZERO") String animal,
			@RequestParam(required = false, defaultValue = "ZERO") String action,
			@RequestParam(required = false, defaultValue = "ZERO") String point,
			@RequestParam(required = false, defaultValue = "ZERO") String environ,
			@RequestParam(required = false, defaultValue = "ZERO") String prompt,
			Model model
			) {
		Optional<AiModel> ai = null;
		if("ZERO".equals(animal) || "ZERO".equals(action) ||"ZERO".equals(point) || "ZERO".equals(environ)
				|| "ZERO".equals(prompt) ) {
			return "redirect:/ai/reset";
		}else {
			if("logo".equals(prompt)) {
				ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
						action, point , environ, prompt, "normal");
			}else if("real".equals(prompt)) {
				ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
						action, point , environ, "none", prompt);
			}else if("anim".equals(prompt)) {
				ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
						action, point , environ, "none", prompt);
			}else if("pencil".equals(prompt)) {
				ai = aiRepository.findOneByAnimalAndAnimalActionAndAnimalPointAndAnimalEnvironAndAnimalStyleAndAnimalPrompt(animal,
						action, point , environ, prompt, "normal");
			}
			List<AiImageModel> images = null;
			if(ai.isPresent()) {
				images = ai.get().getImages();
			}
			int ran = (int)((Math.random()*20000)%19);
			String path = "https://teriwoo0519.cafe24.com/reforce/" + images.get(ran).getPath();
			model.addAttribute("src", path);
			return "front/ai/processingFive";
		}
	}
}
