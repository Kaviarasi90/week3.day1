package week3.day1.assignment;

public class Students {
	public int getStudInfo(int id) {
		System.out.println(id);
		return id;	
	}
	public void getStudInfo(String name,int id) {
		System.out.println(name+id);
		return;	
	}
	public void getStudInfo(String name,int id,String email) {
		System.out.println(name+id+email);
		return;	
	}
	
	public static void main(String[] args) {
		Students std=new Students();
		std.getStudInfo(87);
		std.getStudInfo("jk", 9609876);
		std.getStudInfo("ok", 22, "kavijk90@gmail.com");
	
	}

}
