package poly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.dto.EmpDTO;
import poly.service.IEmpService;

@Controller
public class EmpController {
	@Resource(name = "EmpService")
	IEmpService empService;
	
	private Logger log = Logger.getLogger(this.getClass());
	
@RequestMapping(value="emp/empList")
	public String empList(ModelMap model) {
	log.info("empList 시작!");
	List<EmpDTO> rList = empService.getEmpList();
	
	if(rList == null) {
		rList = new ArrayList<>();
	}
	model.addAttribute("rList", rList);
	for(EmpDTO e : rList) {
		log.info("ename : "+ e.getEname());
		log.info("empno : " +e.getEmpno());
	}
	log.info("empList시작");
		return "/emp/empList";
	}



@RequestMapping(value="emp/managerList")
	public String managerList(ModelMap model) {
	log.info("managerList 시작!");
	List<EmpDTO> rList = empService.getManagerList();
	
	if(rList == null) {
		rList = new ArrayList<>();
	}
	model.addAttribute("rList", rList);
	for(EmpDTO e : rList) {
		log.info("ename : "+ e.getEname());
		log.info("empno : " +e.getEmpno());
	}
	log.info("managerList시작");
		return "/emp/empList";
	}






}
