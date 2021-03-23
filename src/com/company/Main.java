package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        ArrayList<Stack<Integer> > stacks = new ArrayList<>(m);
        PriorityQueue<Pair> sums = new PriorityQueue<>();
        for(int i=0;i<m;++i){
            stacks.add(new Stack<>());
            sums.add(new Pair(0, i));
        }
        for(int i=0, curr = 1;i<n;++i, ++curr){
            if(curr > k) curr = 1;
            Pair least = sums.poll();
            stacks.get(least.b).push(curr);
            least.a += curr;
            sums.add(least);
        }
        for(int i=0;i<m;++i){
            int [] customers = new int[k];
            while(!stacks.get(i).empty()){
                ++ customers[stacks.get(i).pop() - 1];
            }
            for(int j=0;j<k;++j){
                System.out.print(customers[j] + " ");
            }
            System.out.println();
        }
    }
}
