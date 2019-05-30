package in.theforloop.problems;

import in.theforloop.binaryTree.BinaryTree;
import in.theforloop.util.Butils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Shubham
 */
public class MaximumWidthTest {

    @Test
    public void testMaxWidthWithoutVoidNodeInBetween() {
        BinaryTree binaryTree = Butils.createDummyBtree1();
        MaximumWidth maximumWidth = new MaximumWidth();
        Integer width = maximumWidth.maxWidthMap(binaryTree.getRoot());
        Assert.assertEquals(Butils.getExpectedDummyBtreeMaxWidth1(),width);
    }
    @Test
    public void testMaxWidthWithVoidNodeInBetween() {
        BinaryTree binaryTree = Butils.createDummyBtree2();
        MaximumWidth maximumWidth = new MaximumWidth();
        Integer width = maximumWidth.maxWidthMapWithVoid(binaryTree.getRoot());
        Assert.assertEquals(Butils.getExpectedDummyBtreeMaxWidth2(),width);
    }
}