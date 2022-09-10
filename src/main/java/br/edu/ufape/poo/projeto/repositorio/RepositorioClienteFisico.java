package br.edu.ufape.poo.projeto.repositorio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.projeto.basica.ClienteFisico;



@Repository
public interface RepositorioClienteFisico extends JpaRepository<ClienteFisico, Long>{

	public List<ClienteFisico> findByCpf(String cpf);
	
	public List<ClienteFisico> findByNome(String nome);
	
	public void deleteByCpf(String cpf);
	
	

}
