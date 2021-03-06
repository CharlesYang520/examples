package com.basic.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author joker
 * @When
 * @Description
 * @Detail
 * @date 创建时间：2019-01-18 22:21
 */
public class QsortTest
{
    private Integer[] normalTestArr = new Integer[]{1, 5, 2, 0, -1, -2, 6, 4, 3};
    private Integer[] successArray = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5, 6};

    @Test
    public void normalQsortTest()
    {
        QSort qSort=new QSort();
        qSort.qSort(normalTestArr);
        for (Integer integer : normalTestArr)
        {
            System.out.printf("%d->", integer);
        }
        Assert.assertArrayEquals(successArray,normalTestArr);
    }
}
