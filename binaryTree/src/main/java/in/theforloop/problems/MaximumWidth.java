package in.theforloop.problems;

import in.theforloop.binaryTree.BNode;
import in.theforloop.binaryTree.Data;

import java.util.*;

/**
 * @author Shubham
 */
public class MaximumWidth {
    public Integer maxWidthMap(BNode root){
        Queue<BNode> levelNodeQueue = new LinkedList<>();
        levelNodeQueue.add(root);
        Integer maxWidth = 0;
        while (!levelNodeQueue.isEmpty()){
            Integer count = levelNodeQueue.size();
            if(maxWidth <count){
                maxWidth = count;
            }
            while (count-- > 0){
                BNode node = levelNodeQueue.remove();
                if(node.getLeft() != null) {
                    levelNodeQueue.add(node.getLeft());
                }
                if(node.getRight() != null) {
                    levelNodeQueue.add(node.getRight());
                }
            }
        }
        return maxWidth;
    }
    public Integer maxWidthMapWithVoid(BNode root){
        Queue<BNode> levelNodeQueue = new LinkedList<>();
        Queue<Integer> levelNodeQueueNumber = new LinkedList<>();
        levelNodeQueue.add(root);
        levelNodeQueueNumber.add(1);
        Integer maxWidth = 1;
        while (!levelNodeQueue.isEmpty()){
            Integer count = levelNodeQueue.size();
            Integer extremeLeftChildNumber = 1;
            Integer extremeRightChildNumber = 1 ;
            while (count-- > 0){
                BNode node = levelNodeQueue.remove();
                Integer parentNumber = levelNodeQueueNumber.remove();
                if(node.getLeft() != null) {
                    levelNodeQueue.add(node.getLeft());
                    extremeRightChildNumber = getLeftChildNumber(parentNumber);
                    levelNodeQueueNumber.add(extremeRightChildNumber);
                }
                if(node.getRight() != null) {
                    levelNodeQueue.add(node.getRight());
                    extremeRightChildNumber = getRightChildNumber(parentNumber);
                    levelNodeQueueNumber.add(extremeRightChildNumber);
                }
            }
            if (!levelNodeQueueNumber.isEmpty()) {
                extremeLeftChildNumber = levelNodeQueueNumber.element();
            }
            Integer width = getCurrentWidth(extremeLeftChildNumber,extremeRightChildNumber);
            if(maxWidth <width){
                maxWidth = width;
            }
        }
        return maxWidth;
    }
    private Integer getLeftChildNumber(Integer parentNumber){
        return  parentNumber<<1;
    }
    private Integer getRightChildNumber(Integer parentNumber){
        return  (parentNumber<<1)+1;
    }
    private Integer getCurrentWidth(Integer extremeLeftChildNumber,Integer extremeRightChildNumber){
      return extremeRightChildNumber - extremeLeftChildNumber +1;
    }
}
