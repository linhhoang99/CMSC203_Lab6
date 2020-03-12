import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	
	GradeBook gradeBook1;
	GradeBook gradeBook2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		gradeBook1 = new GradeBook(5);
		gradeBook1.addScore(88.8);
		gradeBook1.addScore(99.9);
		
		gradeBook2 = new GradeBook(5);
		gradeBook2.addScore(100);
		gradeBook2.addScore(79.7);
		gradeBook2.addScore(90.3);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeBook1 = null;
		gradeBook2 = null;
		
	}

	@Test
	void testAddScore() {
		assertTrue(gradeBook1.toString().equals("88.8 99.9 "));
		assertTrue(gradeBook2.toString().equals("100.0 79.7 90.3 "));
		
		
		assertEquals(gradeBook1.getScoreSize(), 2);
		assertEquals(gradeBook2.getScoreSize(), 3);
		
	}

	@Test
	void testSum() {
		assertEquals(gradeBook1.sum(), 188.7);
		assertEquals(gradeBook2.sum(), 270 );
	}
		

	@Test
	void testMinimum() {
		assertEquals(gradeBook1.minimum(), 88.8);
		assertEquals(gradeBook2.minimum(), 79.7);
	}

	@Test
	void testFinalScore() {
		assertEquals(gradeBook1.finalScore(), 99.9, 0.1);
		assertEquals(gradeBook2.finalScore(), 190.3);

	}

	

}
