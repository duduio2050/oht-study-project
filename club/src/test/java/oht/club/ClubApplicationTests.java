package oht.club;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClubApplicationTests {

	@Test
	void contextLoads() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");

		EntityManager entityManager = emf.createEntityManager();

		EntityTransaction tx = entityManager.getTransaction();

		tx.begin();

		try {

//			NotificationTest notification = new NotificationTest();
////            notification.setName("id_a");
//			notification.setNotificationTitle("야임마");
//			entityManager.persist(notification);

			// jpql
//            List<Member> memberList = entityManager.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(11)
//                    .getResultList();
//
//            for(Member member : memberList){
//                System.out.println("member name : " + member.getName());
//            }

//            Member member = new Member();
//            member.setId(30L);
//            member.setName("야이씨");
//            entityManager.persist(member);
//
//            entityManager.flush();

			// insert
//            Member member = new Member();
//            member.setId(3L);
//            member.setName("야이씨");
//            entityManager.persist(member);
//
//            // update
//            Member findMember = entityManager.find(Member.class, 1L);
//            System.out.println("find : " + findMember.getId());
//            System.out.println("find : " + findMember.getName());

//            findMember.setName("오레기");

			tx.commit();
		} catch (Exception e){
			tx.rollback();
		} finally {
			entityManager.close();
			emf.close();
		}

	}

}
