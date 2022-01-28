package fr.cnam.pa.inf330;

import org.junit.jupiter.api.*;

public class UnExempleDeTUTest {

  @BeforeAll
  static void initAll() {
    System.out.println("beforeAll");
  }
 
  @BeforeEach
  void init() {
    System.out.println("beforeEach");
  }
 
  @AfterEach
  void tearDown() {
    System.out.println("afterEach");
  }
 
  @AfterAll
  static void tearDownAll() {
    System.out.println("afterAll");
  }
 
  @Test
  void test1() {
    System.out.println("\texécution du test1!");
    Assertions.assertTrue(true);
  }
 
  @Test 
  void test2() {
    System.out.println("exécution du test2!");
    Assertions.assertTrue(true);
  }
}