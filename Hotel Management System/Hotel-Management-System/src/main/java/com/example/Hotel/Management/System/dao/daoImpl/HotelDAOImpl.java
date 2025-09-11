package com.example.Hotel.Management.System.dao.daoImpl;

import com.example.Hotel.Management.System.Entity.Hotel;
import com.example.Hotel.Management.System.dao.HotelDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HotelDAOImpl implements HotelDAO {

<<<<<<< Updated upstream
=======
    private final EntityManager theManager;

    @Autowired
    public HotelDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    public void save() {

    }

    @Override
    public Hotel findByID(int id) {
        return null;
    }

    @Override
    public void updateAddress(int id) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    @Transactional
    public void deleteByPhone(long phoneno) {
        Query query = theManager.createQuery("select h from Hotel h where h.phoneNo=:phno");
        query.setParameter("phno",phoneno);
        try{
            Hotel h1 = (Hotel)query.getSingleResult();

                theManager.remove(h1);
                System.out.println(h1);
                System.out.println("Record Deleted Successfully.");

        }
        catch (NoResultException noe) {
            System.out.println("No Record Found!");
        }

    }


>>>>>>> Stashed changes
}
