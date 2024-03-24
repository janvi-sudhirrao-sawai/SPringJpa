package com.project.SPringJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.SPringJpa.Entities.Members;
import com.project.SPringJpa.Repository.MembersRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class MembersController {
	@Autowired
	private MembersRepository memRepo;
	
	
@GetMapping("addmem")
public String addmembers()
{
	return "AddMembers.html";
}
@PostMapping("newmem")
public String newmember(Members obj)
{
	memRepo.save(obj);
	System.out.println(obj.getMgender());
	return "NewMember.jsp";
}
@GetMapping("allmem")
public ModelAndView allmembers()
{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("AllMembers.jsp");
	
	memRepo.findAll();
	List<Members> memlist=memRepo.findAll();
	System.out.println("number of members retrieved : "+memlist.size());
	mv.addObject("memlist",memlist);
	return mv;
	
}
@GetMapping("updatemobo")
public String updateMobile()
{
	return "UpdateMobileForm.html";
}
@PostMapping("updatephone")
public String updatephone(String mid,String mmobile)
{
	Members obj=memRepo.findByMid(mid);
    obj.setMmobile(mmobile);
	obj=memRepo.save(obj);
		return "UpdateMobile.jsp";
}
@GetMapping("findmemname")
public String findMemberName()
{
	return "FindMemberForm.html";
}
@PostMapping("Searchmid")
public ModelAndView searchMemberId(String mid,HttpSession ses)
{
	
	ModelAndView mv=new ModelAndView();
	mv.setViewName("SearchMemName.jsp");
	Members mnamelist=memRepo.findByMid(mid);
	if(mnamelist!=null) {
		ses.setAttribute("mid",mid);

	}
	else
	{
		mid="Invalied Id ";
		mnamelist=new Members();
		mnamelist.setMage(0);
		mnamelist.setMgender("Not found");
		mnamelist.setMmobile("Not found");
		mnamelist.setMjoin_year(0);
		mnamelist.setMname("Not Found");
		mnamelist.setMid("Invalied Id");
		ses.setAttribute("mid",mid);

	}
	
	
	
	mv.addObject("mnamelist",mnamelist);
	
	return mv;
	
}
@GetMapping("afterjoinmem")
public String joinyearMem()
{
	return "MemberJoinYearForm.html";
}
@PostMapping("searchjoinyear")
public ModelAndView findAfterYear(int mjoinyear,HttpSession ses)
{
	ses.setAttribute("mjoinyear", mjoinyear);
	ModelAndView mv=new ModelAndView();
	mv.setViewName("SearchAfterJoiningYear.jsp");
	List<Members> yearlist=memRepo.findByMjoinyearGreaterThan(mjoinyear);
	mv.addObject("yearlist",yearlist);
	return mv;
}
}
