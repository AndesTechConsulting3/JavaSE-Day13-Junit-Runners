package org.andestech.learning.rfb18.g3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class App2Test
{

    @Test
    public void runner3Test()
    {
        assertTrue( "Важный тест",1!=2 );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void runner4Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
