package com.project.SPringJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.SPringJpa.Entities.Books;
import com.project.SPringJpa.Repository.BooksRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class BooksController {
	@Autowired
	private BooksRepository bookRepo;
	
	@GetMapping("/")
	public String home() {
		
		return "index.jsp";
	}
   @GetMapping("adbook")
   public String addBook()
   {
	   return "InsertBook.html";
   }
   @PostMapping("/newbook")
   public String newbook(Books obj) {
	  
	   bookRepo.save(obj);
	   return "NewBook.jsp";
   }
   @GetMapping("/allbook")
   public ModelAndView allbook()
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("AllBooks.jsp");
	   bookRepo.findAll();
	   List<Books> booklist=bookRepo.findAll();
		System.out.println("number of books retrieved : "+booklist.size());

	   mv.addObject("booklist", booklist);
	   return mv;
	   
   }
   @GetMapping("/searchauthor")
 public String searchAuthor()
   {
     return "SearchByAuthor.html";
   }
   
   @PostMapping("/findauthor")
   public ModelAndView searchAuthor(String author ,HttpSession ses)
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("doneAuthor.jsp");
	   List<Books> autlist=bookRepo.findByAuthor(author);
	   ses.setAttribute("author", author);
	   mv.addObject("autlist", autlist);
		System.out.println("number of book retrieved : "+autlist.size());
       return mv;
   }
   @GetMapping("/delbook")
   public String delbook()
   {
	   return "DeleteBook.html";
   }
   @PostMapping("/DeleteByBookId")
   public String deleteBook(String bookid)
   {
	   Books id=bookRepo.findByBookid(bookid);
	   bookRepo.delete(id);
	   return "DeleteByBookId.jsp";
   }
   @GetMapping("/searchgenre")
   public String searchGenre()
   {
	   return "SearchGenre.html";
   }
   @PostMapping("/findgenre")
   public ModelAndView findGenre(String genre,HttpSession ses)
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("donegenre.jsp");
	  List<Books> genrelist=bookRepo.findByGenre(genre);
	   ses.setAttribute("genre", genre);
	   mv.addObject("genrelist", genrelist);
		System.out.println("number of genre retrieved : "+genrelist.size());
	   
	   return mv;
	   
   }
   @GetMapping("/lessprice")
   public String lessPrice()
   {
	   return "LessThanPrice.html";
   }
   @PostMapping("/Lessprice")
   public ModelAndView LessThanPrice(float price,HttpSession ses) {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("lessthanPrice.jsp");
	   
	   List<Books> plist=bookRepo.findByPriceLessThan(price);
	   ses.setAttribute("price", price);
	   mv.addObject("plist",plist);
	   return mv;
   }
   @GetMapping("/searchbygenlan")
   public String searchByGenLan()
   {
	   return "SearchGenLanForm.html";
   }
   @PostMapping("/Retrivegenlan")
   public ModelAndView retrivedGenLan(String genre,String language,HttpSession ses)
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("SearchByGenreAndLanguage.jsp");
	   ses.setAttribute("genre",genre);
	   ses.setAttribute("language", language);
	   List<Books> genlanlist=bookRepo.findByGenreAndLanguage(genre,language);
	   mv.addObject("genlanlist",genlanlist);
	   return mv;
   }
   @GetMapping("/searchpubyr")
   public String searchyrs() {
	   return "SearchPublishYearFor.html";
   }
   
   @PostMapping("/findByYrs")
   public ModelAndView findBypubyrs(int publicationyear,HttpSession ses)
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("SearchBypublishyear.jsp");
	   ses.setAttribute("publicationyear",publicationyear);
	   List<Books> publist=bookRepo.findByPublicationyear(publicationyear);
	   mv.addObject("publist",publist);
	   return mv;
   }
   @GetMapping("bookpage")
   public String bookPage()
   {
	   return "BookPageForm.html";
   }
   
   @PostMapping("Lesspage")
   public ModelAndView lessPage(int pages,HttpSession ses)
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("SearchBylessThanpages.jsp");
	   ses.setAttribute("pages",pages);
	   List<Books> pageList=bookRepo.findByPagesLessThan(pages);
       mv.addObject("pagelist",pageList);
	   return mv;
   }
   @GetMapping("updateprice")
   public String updatePrice()
   {
	   return "UpdatePriceForm.html";
   }
   @PostMapping("updatePrice")
   public String updatePages(String bookid,int price)
   {
	   Books obj=bookRepo.findByBookid(bookid);
       obj.setPrice(price);
	   obj=bookRepo.save(obj);
		return "UpdatePrice.jsp";

   }
}
