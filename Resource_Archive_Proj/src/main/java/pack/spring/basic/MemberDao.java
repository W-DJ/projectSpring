package pack.spring.basic;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate; //필드생성 private는 사용안함(제한적)
	
	public int insert(Map<String, Object> map) {
		System.out.println("2번");
		return this.sqlSessionTemplate.insert("member.insert", map);
	}
	
	//int 는 DB에서 row의 갯수 반환 받기 때문이다
	//DAO를 호출 당할 때 이 메서드<스트링,오브젝트>를 전달하는데 map이라는 것은 오브젝트는
	//슈퍼클래스라 모든 자료형을 쓸 수 
	//있으므로 sqlSessionTemplate의 insert메서드를 실행하여 member.insert와 map을 전달한다	
	
	public Map<String, Object> selectDetail(Map<String, Object> map) {
		 return this.sqlSessionTemplate.selectOne("member.select_detail", map);
		}
	
	//복사 붙여넣기를 사용하여 올바른 결과 실행
	// => 코드 제거하고 다시 하드코딩 + 데이터 트레이싱(=데이터 체이싱 쫓아가기)
	
	public List<Map<String, Object>> selectList(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectList("member.select_list", map);
		}
	
}
