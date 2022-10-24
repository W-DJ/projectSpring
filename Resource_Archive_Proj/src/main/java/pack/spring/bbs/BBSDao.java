package pack.spring.bbs;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BBSDao {
			@Autowired
			SqlSessionTemplate sqlSessionTemplate;
			
			public int insertBBS(Map<String, Object> map) {
					return this.sqlSessionTemplate.insert("member.insertBBS",map);
			}
}
