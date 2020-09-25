package poly.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static poly.util.CmmUtil.nvl;

@Controller
public class practicecontroller {

private Logger log = Logger.getLogger(this.getClass());

@RequestMapping(value="table")
public String table() {
	
	log.info(this.getClass());
	
	return "/table";
	
}

@RequestMapping(value="get")
public String get(HttpServletRequest request, ModelMap model)
		throws Exception{
	String name =nvl(request.getParameter("name"));
	log.info("name :"+name);
	model.addAttribute("name", name);//view(jsp)에 name이라는 문자열을 전달
	
	return "/get";
}

@RequestMapping("form")
public String form() {
	log.info("Form start");
	return "/form";
}
@RequestMapping(value="doPost", method = RequestMethod.POST)
public String doPost(HttpServletRequest request, ModelMap model) {
	String name =nvl(request.getParameter("name"));
	
	
	model.addAttribute("name", name);//view(jsp)에 name이라는 문자열을 전달
	
	
	return "/get";
}
}
