package me.dio.academia.digital.repository;

public interface MatriculaRepository {

    List<Matricula> findByAlunoBairro(String bairro);
}
