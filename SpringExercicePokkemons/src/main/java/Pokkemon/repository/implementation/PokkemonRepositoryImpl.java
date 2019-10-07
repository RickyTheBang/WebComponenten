package Pokkemon.repository.implementation;

import Pokkemon.model.PokkemonType;
import Pokkemon.repository.PokkemonRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
@Repository("pokkemonRepository")
public class PokkemonRepositoryImpl implements PokkemonRepository {
    EntityManagerFactory emf;






    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf){
        this.emf = emf;
        }

    @Override
    public void CreatePokkemonType(PokkemonType pokemonType) {
        EntityManager em = emf.createEntityManager ();
        EntityTransaction tx =em.getTransaction ();

        pokemonType.setBaseAttack (10);
        pokemonType.setBaseDefense (20);
        pokemonType.setBaseHitPoints (50);
        pokemonType.setBeschrijving ("Heavy");
        pokemonType.setTypeName ("Diglet");

        tx.begin ();
        em.persist (pokemonType);
        tx.commit ();


    }



    }




