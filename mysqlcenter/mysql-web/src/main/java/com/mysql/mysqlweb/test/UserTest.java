package com.mysql.mysqlweb.test;
import org.junit.jupiter.api.Test;
import request.User;

/**
 * ***GOOD LUCK****
 *
 * @Author : Wukn
 * @Date : 2018/9/27
 */
public class UserTest {




    public void test01() {
        User user = new User();
        user.setName( "a" );
        user.setId( 12 );
        System.out.println(user);
    }


    @Test
    public void test03() {
        System.out.println("ss");
    }
}
