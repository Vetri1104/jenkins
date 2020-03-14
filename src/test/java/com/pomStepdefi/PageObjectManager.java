package com.pomStepdefi;

public class PageObjectManager {
	
	private loginPage login;
	private selectHotel selHotel;
	private searchHotel searcHotel;
    private bookHotel bookHotel;
    
    
	public loginPage getLogin() {
	      System.out.println(login);
		
		return (login==null)? login=new loginPage():login;
		
	}
	public selectHotel getSelHotel() {
		return (selHotel==null)? selHotel=new selectHotel():selHotel;
	}
	public searchHotel getSearcHotel() {
		return (searcHotel==null)? searcHotel=new searchHotel():searcHotel;
	}
	public bookHotel getBookHotel() {
		return (bookHotel==null)? bookHotel=new bookHotel():bookHotel;
	}
    
   
}
