package edu.pnu.dao.log;

import java.util.Map;

public interface LogDao {

	void addLog(String string, String string2, Map<String, Object> map);

}