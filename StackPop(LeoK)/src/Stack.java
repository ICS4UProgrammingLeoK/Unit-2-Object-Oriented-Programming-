import java.util.ArrayList;

public class Stack {
		//create an array list
		private ArrayList<Integer> nums = new ArrayList<>();
		
		//adds to stack
		public void Push(int num) {
				nums.add(num);
		    }
		
		//removes from stack
		public void Pop() {
				nums.remove(nums.size() - 1);
		}
}
