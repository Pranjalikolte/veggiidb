package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Units;
import com.app.Repository.UnitsRepository;

@Service
public class UnitsService {
	@Autowired
	UnitsRepository unitsRepository;

	public Units saveUnits(Units units) {
		return unitsRepository.save(units);
	}

	public UnitsService(UnitsRepository unitsRepository) {
		this.unitsRepository = unitsRepository;
	}

	public List<Units> getAllUnits() {
		return unitsRepository.findAll();
	}

	public void deleteUnitsById(Long unitsId) {
		unitsRepository.deleteById(unitsId);
	}


}
