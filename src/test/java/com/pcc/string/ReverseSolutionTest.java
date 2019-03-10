package com.pcc.string;

import com.pcc.array.ReverseSolution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author peichenchen
 * @date 2019/03/03
 */
public class ReverseSolutionTest {

    @Test
    public void reverseString() {
        char[] c = {'a', 'b', 'c', 'd'};
        char[] c2 = {'a', 'b', 'c', 'd', 'e'};

        ReverseSolution reverseSolution = new ReverseSolution();
        reverseSolution.reverseString(c);
        reverseSolution.reverseString(c2);

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(c2));


        Assert.assertEquals("qwertyuioppp", reverseSolution.reverseString("pppoiuytrewq"));
        Assert.assertEquals("qwertyuiopp", reverseSolution.reverseString("ppoiuytrewq"));
        Assert.assertEquals("a", reverseSolution.reverseString("a"));
        Assert.assertEquals("ab", reverseSolution.reverseString("ba"));
    }
}