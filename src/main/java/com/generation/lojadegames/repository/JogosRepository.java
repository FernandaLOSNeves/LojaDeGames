package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.JogosModel;

@Repository
public interface JogosRepository extends JpaRepository <JogosModel, Long> {
	
	public List<JogosModel> findAllByNomeContainingIgnoreCase(String produto);
}

