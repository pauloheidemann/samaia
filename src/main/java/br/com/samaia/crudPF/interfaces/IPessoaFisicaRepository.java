package br.com.samaia.crudPF.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.samaia.crudPF.bean.PessoaFisica;

@Repository
public interface IPessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {

}