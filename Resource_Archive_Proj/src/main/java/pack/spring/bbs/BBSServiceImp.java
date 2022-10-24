package pack.spring.bbs;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class BBSServiceImp implements BBSService {

	
	@Autowired
	BBSDao bbsDao;
	
	@Override
	public String writeNot(Map<String, Object> map) {
		
		int affectRowCnt = this.bbsDao.insertBBS(map);
		if(affectRowCnt == 1) {
					return map.get("BBS_id").toString();
		}
		return null;
	}

}
