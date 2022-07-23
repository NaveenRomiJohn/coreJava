package programs;

public class StringExample {
	public static void main(String args[]) {
		String s1 = "java";// creating string by Java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating Java string by new keyword
//		System.out.println(s1.toUpperCase());
//		System.out.println(s2.isEmpty());
//		System.out.println(s3.length());
		
		String s = "Sachin";
		s=s.concat(" Tendulkar");// concat() method appends the string at the end
//		System.out.println(s);// will print Sachin because strings are immutable objects
		
		StringBuffer sb=new StringBuffer("Hello ");  
		System.out.println(sb);
		sb.append("Java");//now original string is changed  
//		System.out.println(sb);//prints Hello Java 
		
		sb.insert(1,"Java");//now original string is changed  
//		System.out.println(sb);//prints HJavaello 
		
		sb.replace(1,3,"Java");  
//		System.out.println(sb);//prints HJavalo 
		
		sb.delete(1,3);  
//		System.out.println(sb);//prints Hlo  
		
		sb.reverse();  
//		System.out.println(sb);//prints olleH   
	}
}
