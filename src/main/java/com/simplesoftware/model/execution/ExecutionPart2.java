package com.simplesoftware.model.execution;

import com.simplesoftware.model.entities.Aluno;
import com.simplesoftware.model.entities.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart2 {

    public static void main(String[] args) {

        //Criar um gerenciador de entidades com o banco de dados especificado no arquivo persistence.xml
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Criar instancias para serem adicionadas ao banco de dados
        Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
        Aluno alunoParaAdicionar = new Aluno("Daniel", 29, estadoParaAdicionar);
        Aluno alunoParaAdicionar2 = new Aluno("Juca", 40, estadoParaAdicionar);

        //iniciar uma transacao para adicionar as instancias ao banco de dados
        entityManager.getTransaction().begin();

        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(alunoParaAdicionar);
        entityManager.persist(alunoParaAdicionar2);

        entityManager.getTransaction().commit();

        //Resgatar instancias no banco de dados
        Estado estadoEncontrado = entityManager.find(Estado.class, 1);
        Aluno alunoEncontrado = entityManager.find(Aluno.class, 1);
        System.out.println(estadoEncontrado);
        System.out.println(alunoEncontrado);

        //Alterar uma entidade
        entityManager.getTransaction().begin();

        alunoEncontrado.setNome("Karen");
        alunoEncontrado.setIdade(20);

        entityManager.getTransaction().commit();

        //Remover uma entidade
        entityManager.getTransaction().begin();

        entityManager.remove(alunoEncontrado);

        entityManager.getTransaction().commit();

        //Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
        entityManager.close();
        entityManagerFactory.close();

    }

}
