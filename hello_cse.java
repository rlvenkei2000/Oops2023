import java.util.*;
public class hello_cse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrList=new ArrayList<String>();  
		//1.Adding products in ArrayList
	      arrList.add("Box1");
	      arrList.add("Box2");
	      arrList.add("Box3");
	      arrList.add("Box4");
	      arrList.add("Box5");
	       
	      //displaying elements
	      System.out.println(arrList);
	     

	  
	      //2.Display fist and last element.
	      if (arrList != null && !arrList.isEmpty()) {
	            System.out.println("First element is: "
	                               + arrList.get(0));
	            System.out.println("Last element is: "
	                               + arrList.get(arrList.size() - 1));
	            
	        }
	      //3.Print the size of the ArrayList.
	      System.out.println("Size of the Array List:"+arrList.size());
	      
	      //4.Remove a particular product from ArrayList.
	      arrList.remove(4);
	      System.out.println(arrList);
	      
	      //5.Replace
	      arrList.set(2, "Box7");
	      System.out.println(arrList);
	  
	     
	}

}
