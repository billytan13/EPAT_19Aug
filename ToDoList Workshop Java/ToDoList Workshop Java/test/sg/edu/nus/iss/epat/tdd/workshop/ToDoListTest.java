package sg.edu.nus.iss.epat.tdd.workshop;
 
import java.util.HashMap;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
import junit.framework.TestCase;
 
public class ToDoListTest extends TestCase {
   // Define Test Fixtures
	private String s1, s2;
   public ToDoListTest() {
      super();
   }
 
   @Before
   public void setUp() throws Exception {
		s1 = "Hello Task 1";
		s2 = "Hello Task 1";
   }
 
   @After
   public void tearDown() throws Exception {
//	   System.out.println("tearDown");
   }
 
   @Test
   public void testAddTask() {
//      fail("Not implemented yet");
	   
	   ToDoList toDoListObject = new ToDoList();
	   Task taskOne = new Task("Task One", false);
	   toDoListObject.addTask(taskOne);

	   assertFalse(toDoListObject.isEmpty());
   }
 
//   @Test
   public void testGetStatus() {
	   
	   ToDoList toDoListObject = new ToDoList();
	   Task taskOne = new Task("Task One", true);
	   toDoListObject.addTask(taskOne);
 
	   assertTrue(toDoListObject.getStatus("Task One"));
   }
 
   @Test
   public void testRemoveTask() {
//      fail("Not implemented yet");
	   
	   ToDoList toDoListObject = new ToDoList();
	   Task taskOne = new Task("Task One", true);
	   toDoListObject.addTask(taskOne);
	   
	   assertEquals(toDoListObject.removeTask("Task One"), taskOne);
   }
 
//   @Test
   public void testGetCompletedTasks() {
//      fail("Not implemented yet");
 
	   ToDoList toDoListObject = new ToDoList();
 
	   Task taskOne = new Task("Task One", true);
	   Task taskTwo = new Task("Task Two", true);
   
//	   Task taskThree = new Task("Task Three", true);
//	   Task taskFour = new Task("Task Four", true);
//	   Task taskFive = new Task("Task Five", true);
// 
	   toDoListObject.addTask(taskOne);
	   toDoListObject.addTask(taskTwo);
	   
//	   toDoListObject.addTask(taskThree);
//	   toDoListObject.addTask(taskFour);
//	   toDoListObject.addTask(taskFive);
   
   
 
 
   }
}