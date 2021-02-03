package lego.ast;

import java.util.ArrayDeque;
import java.util.Deque;

public class Env {
    Deque<VarTuple> stack = new ArrayDeque<>();

    void push(String vName, int vValue){
        stack.push(new VarTuple(vName, vValue));
    }

    VarTuple pop(){
        return stack.pop();
    }

    int search(String name){
        for (VarTuple v: stack){
            if (v.name.equals(name))
                return v.value;
        }
        return Integer.MIN_VALUE;
    }


    private static class VarTuple {
        public String name;
        public int value;
        public VarTuple(String name, int value){
            this.name = name;
            this.value = value;
        }
    }
}