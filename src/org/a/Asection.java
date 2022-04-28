package org.a;

import org.b.Bsection;
import org.c.Csection;
import org.d.Esection;


public class Asection extends Bsection implements Csection,Esection

{
public void stu2() {
		System.out.println("static");
	 }
			
public static void main (String[]args) {
		Asection a = new Asection();
		a.stu2();
		a.studentinfo();
		a.place();
		a.stu3();
		
}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main (String[] args) 
//{
		//Scanner sc = new Scanner(System.in); 

//String s1 = sc.next();
//System.out.println("Student name is:"+s1); 
// String s2 = sc.next();
 // System.out.println("student email is:"+s2);
  
//  String s3 = sc.next();
//  System.out.println("student gender is:"+s3);
//
// long m3 = sc.nextLong();
//System.out.println("student phoneno is:"+m3);
///String s4 = sc.next();

//.out.println("student place is:"+s4);

//String s5 = sc.next();
//System.out.println("student dept is:"+s5);

//}}



