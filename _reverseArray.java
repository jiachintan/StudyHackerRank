import java.util.ArrayList;
import java.util.List;

public class _reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(2);
		input.add(1);
		System.out.print(reverseArray(input));
	}
	
	public static List<Integer> reverseArray(List<Integer> a) {
		    // Write your code here
	    List<Integer> ans = new ArrayList<Integer>();

	    for(int i = a.size() -1; i >= 0; i--){
	        ans.add(a.get(i));
	    }

	    return ans;
	}

}
