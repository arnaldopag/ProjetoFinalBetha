package com.ProjetoFinal.Repository;

import com.ProjetoFinal.Model.entity.Deposito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositoRepository extends JpaRepository<Deposito,Integer> {
}
