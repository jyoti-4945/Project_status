package com.niit.ProjectBackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.DbConfiguration;
import com.dao.CategoryDao;
import com.dao.CategoryDaoImpl;
import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.dao.SignupDao;
import com.dao.SignupDaoImp;
import com.models.Category;
import com.models.Signup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(DbConfiguration.class,CategoryDaoImpl.class,SignupDaoImp.class,ProductDaoImpl.class);
        SignupDao signupdao= (SignupDao) context.getBean("signupDaoImp");
        ProductDao productdao=(ProductDao) context.getBean("productDaoImpl");
        //CategoryDao categorydao= (CategoryDao) context.getBean("categoryDaoImpl");
   	 
        /*Category obj1=new Category();
        obj1.setCategoryname("Samsung");
        categorydao.saveCategory(obj1);
 */}
}
