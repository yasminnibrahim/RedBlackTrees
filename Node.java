/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbtrees;

/**
 *
 * @author yasmin
 */
public class Node {
     private final int RED = 0;
    private final int BLACK = 1;
    String key = "";
            int color = BLACK;
        Node left = RBTrees.nil, right = RBTrees.nil, parent = RBTrees.nil;

        Node(String key) {
            this.key = key;
        } 
}
