package pack.spring.basic;

import java.util.List;
import java.util.Map;

public interface MemberService {

	String create(Map<String, Object> map); //메서드
	
	Map<String, Object> detail(Map<String, Object> map);

	
	List<Map<String, Object>> list(Map<String, Object> map);
	
	String index( );
}
