
public class GenericArrayStack <E> { //public class GenericArrayStack <E extends Customer>
    public final Integer Capacity = 100;
    E[] stack;
    Integer top;

    public GenericArrayStack(){
        //stack = new E[Capacity];
        stack = (E[]) new Object[Capacity];
        top = -1;

    }

    public void push(E i){
        if(top <= Capacity)
            stack[top+1] = i;
        top += 1;
    }

    public void pop(){
        if(top >= 0)
            top -= 1;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i <= top; i++)
            s += " " + stack[i] + " ";
        return s;
    }
}
