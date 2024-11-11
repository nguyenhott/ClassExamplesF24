public class LinkedBST<E extends Comparable<E>> extends AbstractBST<E> {

    private class Node{

        E value;
        Node left;
        Node right;

        public Node(E v){
            value = v;
            left = null;
            right = null;
        }

        public void preorderPrint()
        {
            System.out.print(value + " ");
            if (left != null)
                left.preorderPrint();
            if (right != null)
                right.preorderPrint();
        }


        public void inorderPrint()
        {
            if (left != null)
                left.inorderPrint();
            System.out.print(value + " ");
            if (right != null)
                right.inorderPrint();
        }


        public void postorderPrint()
        {
            if (left != null)
                left.postorderPrint();
            if (right != null)
                right.postorderPrint();
            System.out.print(value + " ");
        }

        E find(E needle){
            if(needle.compareTo(value) == 0)
                return value;
            if(needle.compareTo(value) < 0)
                if(left == null)
                    return null;
                else return left.find(needle);
            else if(right == null)
                return null;
            else return right.find(needle);
        }

        boolean add (E item){
            if(item.compareTo(value) == 0)
                return false;

            if(item.compareTo(value) < 0){
                if(left == null)
                {
                    left = new Node(item);

                }
                else{
                    return left.add(item);
                }
            }
            else{
                if(right == null)
                {
                    right = new Node(item);

                }
                else
                    return right.add(item);
            }
            return true;
        }

        private Node rightmostParent(){
            if(right.right == null)
                return this;
            return right.rightmostParent();
        }

        private Node rightmost(){
            if(right == null)
                return this;
            return right.rightmost();
        }

        /*
         * remove will actually remove the node from the tree
         * */
        private Node remove(E target){
            // node has no children
            if(left == null && right == null)
                return null;
                // node has no left child
            else if(left == null)
                return right;
            else if(right == null)
                return left;
            else{ // find the right most predecessor
                // if left child does not have the right successor
                if(left.right == null){
                    value = left.value;
                    left = left.left;
                    return this;
                }
                else{
                    // go to left, and go to right as long as you can
                    /*Node rightmostParent = left.rightmostParent();
                    value = rightmostParent.right.value;
                    left.right = rightmostParent.right.left;
                    return this;*/
                    Node rightmost = left.rightmost();
                    value = rightmost.value;
                    left.right = rightmost.left;
                    return this;
                }
            }
        }

        /* delete() will traverse the tree, and find the node that has target, then
        remove the node from the tree.
        It will return the reference to the root of the subtree of that removed node
        * */
        Node delete(E target){
            //root call delete
            if(target.compareTo(value) == 0)
            {
                return this.remove(target);
            }
            if(target.compareTo(value) < 0){
                if(left != null)
                    left = left.delete(target);

            }
            if(target.compareTo(value) > 0)
            {
                if(right != null)
                    right = right.delete(target);
            }
            return this;
        }

    }

    protected Node root;

    public E findIter(E needle){
        Node current = root;
        while(current != null){
            if(needle.compareTo(current.value) == 0){
                return current.value;
            }
            if(needle.compareTo(current.value) < 0){
                current = current.left;
            }
            else
                current = current.right;
        }
        return null;
    }

    public E find(E needle){
        return root == null ? null : root.find(needle);
    }

    public boolean add(E item){
        if(root == null)
        {
            root = new Node(item);
            return true;
        }
        else{
            return root.add(item);
        }
    }

    public E delete(E target){
        E found = find(target);
        if(found != null)
            root = root.delete(found);
        return found;
    }

    public void preorderPrint()
    {
        if (root == null)
            System.out.print("empty tree");
        else
            root.preorderPrint();
        System.out.println("");
    }


    public void inorderPrint()
    {
        if (root == null)
            System.out.print("empty tree");
        else
            root.inorderPrint();
        System.out.println("");
    }


    public void postorderPrint()
    {
        if (root == null)
            System.out.print("empty tree");
        else
            root.postorderPrint();
        System.out.println("");
    }
}
