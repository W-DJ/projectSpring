package pack.spring.bbs;

import java.util.List;
import java.util.Map;

public interface BBSService {
	// 공지사항 글쓰기
		String writeNot(Map<String, Object> map); //메서드
	// 공지사항 상세보기
		Map<String, Object> Notdetail(Map<String, Object> map);
	//공지사항 전체보기	
		List<Map<String, Object>> NotList(Map<String, Object> map);
		
}
