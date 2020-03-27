package collectionMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Address ad1=new Address();
        ad1.setCity("c1");
        ad1.setState("s1");

        Address ad2=new Address();
        ad2.setCity("c2");
        ad2.setState("s2");

        List<Address> list = new ArrayList<Address>();

        list.add(ad1);
        list.add(ad2);

        Student s=new Student();
        s.setName("abc");
        s.setAddress(list);
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("sampleapp");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();


        //Student s=em.find(Student.class,1);
        em.persist(s);
        tx.commit();
        em.close();
        emf.close();

        //System.out.println(s.getAddress().isEmpty());

    }


}
