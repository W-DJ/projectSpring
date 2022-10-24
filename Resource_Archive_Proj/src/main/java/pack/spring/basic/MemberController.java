package pack.spring.basic;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView create() {
			return new ModelAndView("member/create");
	}
	//모델과 뷰를 연결하는 컨트롤러 완성
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		
		ModelAndView mav = new ModelAndView();
		
		String memberId = this.memberService.create(map);
		//this는 ModelAndView 객체를 지칭함.
		
		if(memberId == null) {
			mav.setViewName("redirect:/create");
			//페이지 전환되어 member/create 실행
		}else {
			mav.setViewName("redirect:/detail?memberId="+memberId);
		}
			return mav;
	}
	//("memberId" : "2")
	// 상세보기 시작
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String, Object> map) {
		 Map<String, Object> detailMap = this.memberService.detail(map); 
		 ModelAndView mav = new ModelAndView(); 
		 mav.addObject("data", detailMap); 
		 String no = map.get("memberId").toString(); 
		 mav.addObject("no", no); 
		 mav.setViewName("/member/detail"); 
		 return mav;
	}
	// 상세보기 끝
	
	//전체 목록 보기 시작
	@RequestMapping(value = "/list")
	public ModelAndView list(@RequestParam Map<String, Object> map) {
	 List<Map<String, Object>> list = this.memberService.list(map); 
	 //서비스에서 리스트 메서드가 실행되면 list에 저장됨. -> 모델앤 뷰 클래스로 전달
	 
	 ModelAndView mav = new ModelAndView(); 
	 mav.addObject("data", list); 
	 mav.setViewName("/member/list"); 
	 return mav;
	 //data라는 이름으로 list 지정.
	 
	 
	}
	//전체 목록 보기 끝
	
	//인덱스 페이지 시작
	@RequestMapping(value = "/")
	public ModelAndView index() {
	 ModelAndView mav = new ModelAndView(); 
	 mav.setViewName("/index"); 
	 return mav;
	}
	//인덱스 페이지 끝
}
