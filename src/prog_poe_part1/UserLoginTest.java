/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_poe_part1;

/**
 *
 * @author Student
 */


import org.junit.Test;
import static org.junit.Assert.*;

public class UserLoginTest {

    UserLogin user = new UserLogin();

    @Test
    public void testValidUsername() {
        assertTrue(user.checkUserName("ab_cd"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(user.checkUserName("abcdef"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(user.checkPasswordComplexity("Abc@1234"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(user.checkPasswordComplexity("abc"));
    }
    @Test
public void testValidPhoneNumber() {
    assertTrue(user.checkCellPhoneNumber("0821234567"));
}

@Test
public void testInvalidPhoneNumber() {
    assertFalse(user.checkCellPhoneNumber("12345"));
}
}