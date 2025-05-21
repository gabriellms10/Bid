package com.devMacario.Bid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devMacario.Bid.Entitys.Clube;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long>{

}
