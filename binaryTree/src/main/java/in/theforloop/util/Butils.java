package in.theforloop.util;

import in.theforloop.binaryTree.BNode;
import in.theforloop.binaryTree.BinaryTree;
import in.theforloop.binaryTree.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham
 */
public class Butils {

    public static BinaryTree createDummyBtree1(){
        BinaryTree binaryTree = new BinaryTree();

        //Level 0
        binaryTree.setRoot(new BNode(new Data(1)));

        //Level 1
        binaryTree.getRoot().setLeft(new BNode(new Data(2)));
        binaryTree.getRoot().setRight(new BNode(new Data(3)));

        //Level 2
        binaryTree.getRoot().getLeft().setLeft(new BNode(new Data(4)));
        binaryTree.getRoot().getLeft().setRight(new BNode(new Data(5)));
        binaryTree.getRoot().getRight().setLeft(new BNode(new Data(7)));
        binaryTree.getRoot().getRight().setRight(new BNode(new Data(6)));

        return binaryTree;
    }
    public static BinaryTree createDummyBtree2(){
        BinaryTree binaryTree = new BinaryTree();

        //Level 0
        binaryTree.setRoot(new BNode(new Data(1)));

        //Level 1
        binaryTree.getRoot().setLeft(new BNode(new Data(2)));
        binaryTree.getRoot().setRight(new BNode(new Data(3)));

        //Level 2
        binaryTree.getRoot().getLeft().setLeft(new BNode(new Data(4)));
        binaryTree.getRoot().getLeft().setRight(new BNode(new Data(5)));
        binaryTree.getRoot().getRight().setLeft(new BNode(new Data(7)));
        binaryTree.getRoot().getRight().setRight(new BNode(new Data(6)));

        //Level 3
        binaryTree.getRoot().getLeft().getLeft().setLeft(new BNode(new Data(7)));
        binaryTree.getRoot().getRight().getRight().setRight(new BNode(new Data(8)));

        return binaryTree;
    }
    public static Map<Integer,Integer> getExpectedDummyBtreeVerticalSum1(){
        Map<Integer,Integer> verticalSumMap = new HashMap<>();
        verticalSumMap.put(-2,4);
        verticalSumMap.put(-1,2);
        verticalSumMap.put(0,13);
        verticalSumMap.put(1,3);
        verticalSumMap.put(2,6);
        return verticalSumMap;
    }
    public static Integer getExpectedDummyBtreeMaxWidth1(){
        return 4;
    }
    public static Integer getExpectedDummyBtreeMaxWidth2(){
        return 8;
    }
}
