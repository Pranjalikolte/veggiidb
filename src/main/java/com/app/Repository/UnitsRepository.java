package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.Units;

public interface UnitsRepository extends JpaRepository< Units ,Long> {
	
	Units findByUnitsName(String unitsName);


	Units save(Units units);


	Units findByUnitsId(Long unitsId);

}
