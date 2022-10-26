package pack.spring.bbs;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BBSDao {
			
			@Autowired
			SqlSessionTemplate sqlSessionTemplate;
			
			//공지사항 글쓰기
			public int insert(Map<String, Object> map) {
					return this.sqlSessionTemplate.insert("bbs.insertBBS",map);
			}
			
			//공지사항 상세보기
			public Map<String, Object> selectDetail(Map<String, Object> map){
				return this.sqlSessionTemplate.selectOne("bbs.select_not_detail", map);
			}
			
			//공지사항 목록보기
			public List<Map<String, Object>> selectList(Map<String, Object> map){
				return this.sqlSessionTemplate.selectList("bbs.select_not_list", map);
			}
			
			//공지사항 수정하기(가져오기)
			public Map<String, Object> selectMod(Map<String, Object> map){
				return this.sqlSessionTemplate.selectOne("bbs.select_not_update", map);
			}
		
			
			//공지사항 수정하기(보내기)
			public int modifynot(Map<String , Object> map){
				return this.sqlSessionTemplate.update("bbs.update_not", map);
			}
			
			//공지사항 삭제하기
			public int delnot(Map<String, Object> map) {
				return this.sqlSessionTemplate.delete("bbs.delete_not", map);
			}
			
			
			
			
			
			
}
