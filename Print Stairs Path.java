import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al = path(n);
		System.out.println(al);
	}
	public static ArrayList<String> path(int n){
	    if(n==0){
	        ArrayList<String> al = new ArrayList<String>();
	        al.add(" ");
	        return al;
	    }
	    else if(n<0){
	        ArrayList<String> al = new ArrayList<String>();
	        return al;
	    }
	    
	    ArrayList<String> al1 = path(n-1);
	    ArrayList<String> al2 = path(n-2);
	    ArrayList<String> al3 = new ArrayList<>();
	    
	    for(String s : al1){
	        al3.add("1"+s);
	    }
	    for(String s : al2){
	        al3.add("2"+s);
	    }
	    return al3;
	}
	
}
