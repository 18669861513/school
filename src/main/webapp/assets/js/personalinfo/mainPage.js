/**初始化主页面*/
function initMainPage(){
	$("#personalInfoHref").click(function(){
		window.location.href = staticURL+"/turnToPersonalInfoPage.htm";
	});
	
	$("#myQuestions").click(function(){
		window.location.href = staticURL+"/turnToQuestionsPage.htm";
	});
	
	$("#myCollections").click(function(){
		window.location.href = staticURL+"/turnToCollectionsPage.htm";
	});
	
	$("#mistakeCollections").click(function(){
		window.location.href = staticURL+"/turnToMistakeCollectionsPage.htm";
	});
	
	$("#feedBack").click(function(){
		window.location.href = staticURL+"/turnToFeedBackPage.htm";
	});
}

/**初始化个人信息页面*/
function initPersonalInfoPage(){
	$("#mainPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToMainPage.htm";
	});
	
	$("#userNameHref").click(function(){
		window.location.href = staticURL+"/"+"turnToUserNamePage.htm";
	});
	
	$("#passwordHref").click(function(){
		window.location.href = staticURL+"/"+"turnToPasswordPage.htm";
	});
	
	$("#sexHref").click(function(){
		window.location.href = staticURL+"/"+"turnToSexPage.htm";
	});
	
	$("#gradeHref").click(function(){
		window.location.href = staticURL+"/"+"turnToGradePage.htm";
	});
	
	$("#schoolHref").click(function(){
		window.location.href = staticURL+"/"+"turnToSchoolAreaPage.htm";
	});
}

/**初始化我的题库页面*/
function initQuestionsPage(){
	$("#mainPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToMainPage.htm";
	});
}

/**初始化我的收藏页面*/
function initCollectionsPage(){
	$("#mainPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToMainPage.htm";
	});
}

/**初始化错误集页面*/
function initMistakeCollectionPage(){
	$("#mainPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToMainPage.htm";
	});
}

/**初始化意见反馈页面*/
function initFeedBackPage(){
	$("#mainPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToMainPage.htm";
	});
}

/**初始化用户名页面*/
function initUserNamePage(){
	$("#personalInfoPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToPersonalInfoPage.htm";
	});
}

/**初始化密码页面*/
function initPasswordPage(){
	$("#personalInfoPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToPersonalInfoPage.htm";
	});
}

/**初始化性别页面*/
function initSexPage(){
	$("#personalInfoPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToPersonalInfoPage.htm";
	});
}

/**初始化年级页面*/
function initGradePage(){
	$("#personalInfoPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToPersonalInfoPage.htm";
	});
}

/**初始化年级区域页面*/
function initSchoolAreaPage(){
	$("#personalInfoPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToPersonalInfoPage.htm";
	});
	
	$(".school").click(function(){
		window.location.href = staticURL+"/"+"turnToSchoolPage.htm";
	});
}

/**初始化学校页面*/
function initSchoolPage(){
	$("#schoolAreaPageHref").click(function(){
		window.location.href = staticURL+"/"+"turnToSchoolAreaPage.htm";
	});
}