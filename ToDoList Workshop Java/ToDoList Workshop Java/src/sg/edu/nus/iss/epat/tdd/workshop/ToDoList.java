package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;
 
public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();
 
   public void addTask(Task task) {
      // Add code here  
	   tasks.put("Task One", task);
   }
 
   public void completeTask(String description) {
      // Add code here
 
   }
 
   public boolean getStatus(String description) {
      // Add code here
	  return tasks.get(description).isComplete();
   }
 
   public Task getTask(String description) {
      // Add code here
      return null;
   }
 
   public Task removeTask(String description) {
      // Add code here
 
	   return tasks.remove(description);
   }
 
   public Collection<Task> getAllTasks() {
      return tasks.values();
   }
 
//   public Collection<Task> getCompletedTasks() {
//      // Add code here
//      return null;
//   }
 
   public boolean isEmpty() {
	      // Add code here
	    return tasks.isEmpty();
   }
 
}