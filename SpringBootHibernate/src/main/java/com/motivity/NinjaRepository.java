package com.motivity;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja ,Integer>{

	
//	@Modifying
//	@Transactional
//	@Query("delete from Ninja n")
//	int deleteAll();	
	
	@Modifying
	@Transactional
	@Query("Update Ninja n set n.name=?1 where n.id=?2")
	int updateName(String name,int id);
	
	@Modifying
	@Transactional
	@Query("Update Ninja n set n.village=?1 where n.id=?2")
	int updateVillage(String village,int id);
		
	
}
