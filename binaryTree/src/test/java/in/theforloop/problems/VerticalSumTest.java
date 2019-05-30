package in.theforloop.problems;

import in.theforloop.binaryTree.BinaryTree;
import in.theforloop.util.Butils;
import org.junit.Assert;
import org.junit.Test;
import java.util.Map;


/**
 * @author Shubham
 */
public class VerticalSumTest {

    @Test
    public void testVerticalSum(){
        BinaryTree binaryTree = Butils.createDummyBtree1();
        VerticalSum verticalSum = new VerticalSum();
        Map<Integer,Integer> verticalSumMap = verticalSum.getVerticalSum(binaryTree.getRoot(),0);
        Map<Integer,Integer> verticalSumMapExpected = Butils.getExpectedDummyBtreeVerticalSum1();
        verticalSumMap.forEach((key,value)->{
            Assert.assertEquals(verticalSumMapExpected.get(key),value);
        });
    }

}