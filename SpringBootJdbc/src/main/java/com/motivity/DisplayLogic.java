package com.motivity;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DisplayLogic {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void display() {

		List pirate = jdbcTemplate.queryForList("select * from pirates");

		Iterator it = pirate.iterator();

		while (it.hasNext()) {
			Map<String, String> m = (Map<String, String>) it.next();
			Object[] s = m.values().toArray();

			for (Object value : s)
				System.out.print(value + " ");

			System.out.println();

		}

//		List al=getAllPirates();

	}
	/*
	 * public List getAllPirates(){ return
	 * jdbcTemplate.query("select * from pirates",new ResultSetExtractor<List>(){
	 * 
	 * public List<String> extractData(ResultSet rs) throws SQLException,
	 * DataAccessException { List<String> li=new ArrayList<String>();
	 * 
	 * while(rs.next()) { System.out.print(rs.getString(1)+" ");
	 * System.out.print(rs.getString(2)+" "); System.out.print(rs.getString(3)+" ");
	 * System.out.print(rs.getString(4)+" "); System.out.print(rs.getString(5)+" ");
	 * System.out.println(); } return li; } }); }
	 */
}