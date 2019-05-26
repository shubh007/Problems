package in.theforloop.problems;

import in.theforloop.binaryTree.BNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shubham
 */
public class VerticalSum {
    private Map<Integer,Integer> verticalSumMap = new HashMap<>();
    public Map<Integer,Integer> getVerticalSum(BNode bNode, Integer rootIndex){
        Integer sum = bNode.getData().getKey();
        if(verticalSumMap.containsKey(rootIndex)){
            sum += verticalSumMap.get(rootIndex);
        }
        verticalSumMap.put(rootIndex,sum);
        if (bNode.getLeft() !=null) {
            getVerticalSum(bNode.getLeft(), rootIndex - 1);
        }
        if(bNode.getRight() != null) {
            getVerticalSum(bNode.getRight(), rootIndex + 1);
        }
        return verticalSumMap;
    }
}
