package com.lms;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.util.List;


// import org.junit.jupiter.api.MethodOrderer;
// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Test;

// import org.junit.jupiter.api.TestMethodOrder;
// import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.test.context.SpringBootTest;

// import com.lms.models.Book;
// import com.lms.repository.Bookrepo;


@SpringBootTest
// @TestMethodOrder(MethodOrderer.MethodName.class)
class LmsApplicationTests {
    
	// @Autowired
	// private Bookrepo bookrepo;
  
	

	// @Test
	// @Order(1)
	// public void testCreate(){
	// 	Book b = new Book();
	// 	b.setAuthorName("Jim");
	// 	b.setBookName("C# Book");
	// 	b.setId(4);
	// 	bookrepo.save(b);
	// 	assertNotNull(bookrepo.findById(4).get());
	// }

	// @Test
	// @Order(2)
	// public void testGetAll(){
	// 	List<Book> list = bookrepo.findAll();
	// 	assertTrue(list.size()>0);
	// }

	// @Test
	// @Order(3)
	// public void testGetOne(){
	// 	Book b = bookrepo.findById(4).get();
	// 	assertEquals("C# Book", b.getBookName());

	// }

	// @Test
	// @Order(4)
	// public void testUpdate(){
	// 	Book b =bookrepo.findById(4).get();
	// 	b.setAuthorName("Lucifer");
	// 	b.setBookName("Devil");
	// 	bookrepo.save(b);
	// 	assertEquals("Lucifer", b.getAuthorName());
	// }


	// @Test
	// @Order(5)
	// public void testDelete(){
	// 	bookrepo.deleteById(4);
	// 	assertFalse(bookrepo.existsById(4));
	// }









}
