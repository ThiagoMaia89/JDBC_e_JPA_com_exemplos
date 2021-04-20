//package com.simplesoftware.model.execution;
//
//import com.simplesoftware.model.entities.Aluno;
//import com.simplesoftware.model.entities.Estado;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class ExecutionPart1 {
//    public static void main(String[] args) {
//
//        //Criar um gerenciador de entidades com o banco de dados especificado no arquivo persistence.xml
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part1");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        //Criar instancias para serem adicionadas ao banco de dados
//        Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
//        Aluno alunoParaAdicionar = new Aluno("Daniel", 29, estadoParaAdicionar);
//
//        //iniciar uma transacao para adicionar as instancias ao banco de dados
//        entityManager.getTransaction().begin();
//        entityManager.persist(estadoParaAdicionar);
//        entityManager.persist(alunoParaAdicionar);
//        entityManager.getTransaction().commit();
//
//        //Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
//        entityManager.close();
//        entityManagerFactory.close();
//
//    }
//
//
//}
