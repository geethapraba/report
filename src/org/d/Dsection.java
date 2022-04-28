package org.d;


import org.b.Bsection;

public class Dsection extends Bsection{
	public void id(int id) 
	{
		System.out.println("asection student id is"+id);
	}
	public void id(int id,String name) 
	{
		System.out.println("asection student id is"+id);
		System.out.println("asection student name is "+name);
	}
	public void id(int id,String name,long phoneno ) 
	{
		System.out.println("asection student id is"+id);
		System.out.println("asection student name is "+name);
		System.out.println("asectionstudent phoneno is "+phoneno);
	}
public static void main (String[]args) {
	Dsection d = new Dsection ();
	d.id(34);
	d.id(13, "deva");
d.id(52,"thaswin",9586458659l);
d.id(15);
}}


