package org.andestech.learning.rfb18.g3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{

    @Test
    public void runner1Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void runner2Test()
    {
        assertTrue( true );
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
