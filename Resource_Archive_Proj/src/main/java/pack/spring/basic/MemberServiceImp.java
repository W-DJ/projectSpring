package pack.spring.basic;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImp implements MemberService {

	@Autowired 
	MemberDao memberDao;
//회원가입	
	@Override
	public String create(Map<String, Object> map) {
		System.out.println("1번");
		int affectRowCnt =this.memberDao.insert(map);
		if(affectRowCnt == 1) {
			return map.get("member_id").toString();
		}
		
		return null;
	}
//회원 목록 상세 보기
	@Override
	public Map<String, Object> detail(Map<String, Object> map){
	 return this.memberDao.selectDetail(map);
	}
	
//회원 목록 전체 보기	
	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) {
	return this.memberDao.selectList(map);
	}
//메인페이지	
	@Override
	public String index() {
	return null;
	}
}
