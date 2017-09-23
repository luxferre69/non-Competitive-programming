package com.lmbm.learning.programming;



import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public List<Test> listaCadenas; 
	String nombre;
	String apellido;
	String mail;
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.fill();
		test.ver();
		
		//System.out.println("Borrar");
//		test.delete();
//		System.out.println("Elemento borrado");
//		test.ver();
		System.out.println("Actualizar");
		test.update();
		System.out.println("elemento actualizado");
		test.ver();
		
	}
	
	
	public void fill(){
		
		listaCadenas = new ArrayList<Test>();
		
		Test test1 = new Test();
		
		test1.setNombre("Luis");
		test1.setApellido("BM");
		test1.setMail("mail@mail.com");
		
		listaCadenas.add(test1);
		
		Test test2 = new Test();
		
		test2.setNombre("marina");
		test2.setApellido("murillo");
		test2.setMail("luzma@mail.com");
		
		listaCadenas.add(test2);
	}
	
	public void ver(){
		for (Test test : listaCadenas) {
			System.out.println(test.getNombre());
			System.out.println(test.getApellido());
			System.out.println(test.getMail());
		}
	}
	
	public void delete(){
		for (Test test : listaCadenas) {
			if (test.getMail().equals("mail@mail.com")) {
				listaCadenas.remove(test);
			}
		}
	}
	
	public void update(){
		for (Test test : listaCadenas) {
			if (test.getMail().equals("mail@mail.com")) {
				test.setMail("lmbm6@unicomfa");
				listaCadenas.set(0, test);
			}
		}
	}


	public List<Test> getListaCadenas() {
		return listaCadenas;
	}


	public void setListaCadenas(List<Test> listaCadenas) {
		this.listaCadenas = listaCadenas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}

}
