package com.personal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonalInfoController {

	@RequestMapping(value="/turnToMainPage")
	public ModelAndView turnToMainPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("mainPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToPersonalInfoPage")
	public ModelAndView turnToPersonalInfoPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("personalInfoPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToQuestionsPage")
	public ModelAndView turnToQuestionsPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("questionsPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToCollectionsPage")
	public ModelAndView turnToCollectionsPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("collectionsPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToMistakeCollectionsPage")
	public ModelAndView turnToMistakeCollectionsPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("mistakeCollectionsPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToFeedBackPage")
	public ModelAndView turnToFeedBackPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("feedBackPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToUserNamePage")
	public ModelAndView turnToUserNamePage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/personalinfo/userNamePage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToPasswordPage")
	public ModelAndView turnToPasswordPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/personalinfo/passwordPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToSexPage")
	public ModelAndView turnToSexPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/personalinfo/sexPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToGradePage")
	public ModelAndView turnToGradePage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/personalinfo/gradePage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToSchoolAreaPage")
	public ModelAndView turnToSchoolAreaPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/personalinfo/schoolAreaPage");
		return modelAndView;
	}
	
	@RequestMapping(value="/turnToSchoolPage")
	public ModelAndView turnToSchoolPage(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/personalinfo/schoolPage");
		return modelAndView;
	}
}
