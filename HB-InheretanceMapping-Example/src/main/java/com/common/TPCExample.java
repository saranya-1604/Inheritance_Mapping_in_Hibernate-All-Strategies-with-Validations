package com.common;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.Tpc.Customer;
import com.Tpc.Employee;
import com.Tpc.Person;
import com.Tpcc.*;
import com.Tpsc.Customer2;
import com.Tpsc.Employee2;
import com.Tpsc.Person2;


public class TPCExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		Validator validator=validatorFactory.getValidator();
		System.out.println("------------------------------------");
//		Transaction tr=null;
		Person e1=new Person(2,"Rohan","21,Karur");
    	Customer e2=new Customer("Saranya","Karur","rohan@gamil.com",456789102,"Regular");
    	Employee e3=new Employee("Rohan","Kangeyam","Developer",80000,getPastOrFutureDate(-2));
    	Person1 e4=new Person1(3,"Saranya","43,Delhi");
    	Customer1 e5=new Customer1("Kannan","Tiruppur","saranya@gamil.com",567894321,"New");
    	Employee1 e6=new Employee1("Gandhi","Kundadam","Tester",60000,getPastOrFutureDate(-2));
    	Person2 e7=new Person2(3,"Sudiksha","55,Mumbai");
    	Customer2 e8=new Customer2("Priya","Theni","sudiksha@gamil.com",587905432,"Regular");
    	Employee2 e9=new Employee2("Pandish varan","Kerala","TL",70000,getPastOrFutureDate(-2));
    	Set<ConstraintViolation<Person>> violations=validator.validate(e1);
    	if(violations.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e1);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Person> violation: violations) {
    			System.out.println(violation.getMessage());
    			System.out.println("--------------------------");
    		}
    		
    	}
    	Set<ConstraintViolation<Customer>>violations1=validator.validate(e2);
    	if(violations1.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e2);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Customer> violation: violations1) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Employee>>violations2=validator.validate(e3);
    	if(violations2.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e3);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Employee> violation: violations2) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Person1>>violations3=validator.validate(e4);
    	if(violations3.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e4);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Person1> violation: violations3) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Customer1>>violations4=validator.validate(e5);
    	if(violations4.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e5);
    		    tr.commit();
    		    
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Customer1> violation: violations4) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Employee1>>violations5=validator.validate(e6);
    	if(violations5.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e6);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Employee1> violation: violations5) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Person2>>violations6=validator.validate(e7);
    	if(violations6.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e7);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Person2> violation: violations6) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Customer2>>violations7=validator.validate(e8);
    	if(violations7.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e8);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Customer2> violation: violations7) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
    	Set<ConstraintViolation<Employee2>>violations8=validator.validate(e9);
    	if(violations8.isEmpty()) {
    		System.out.println("Valid user data provided");
    		Transaction tr = null;
    		try (Session session = HBUtil.getSesFactory().openSession()) {
    		    tr = session.beginTransaction();
    		    session.merge(e9);
    		    tr.commit();
    		} catch (   Exception x) {
    		    if (tr != null) {
    		        tr.rollback();
    		    }
    		    x.printStackTrace();
    		}
    	}
    	else {
    		System.out.println("Invalid user data found");
    		for(ConstraintViolation<Employee2> violation: violations8) {
    			System.out.println(violation.getMessage());
    		}
    	}
    	System.out.println("-------------------------------------");
	
	
	
	
	
	
	}
	public static Date getPastOrFutureDate(int days) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE,days);
		return calendar.getTime();
	}

}
