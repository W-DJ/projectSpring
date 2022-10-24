package pack.spring.bbs;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BBSController {

	@RequestMapping(value = "/NotWrite", method = RequestMethod.GET)
	public ModelAndView ServiceMain() {
		return new ModelAndView("BBS/NotWrite");
	}
	// 모델과 뷰를 연결하는 컨트롤러 완성

	@Autowired
	BBSService bbsService;

	@RequestMapping(value = "/NotWrite", method = RequestMethod.POST)
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
		
		ModelAndView mav = new ModelAndView();
		
		String aName = this.bbsService.writeNot(map);
		//this는 모델앤뷰 객체 지칭.
		
		if (aName == null) {
			mav.setViewName("redirect:/NotWrite");
			//페이지 전환되며 다시 실행
		} else {
			mav.setViewName("redirect:/detail?aName=" + aName);
			//디테일 페이지로 이동
		}
		return mav;
	}

}
