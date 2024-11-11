public abstract class AbstractBST<E extends Comparable<E>> implements BST<E> {

    public boolean contains(E needle){
        return find(needle) != null;
    }

    public boolean remove(E target){
        return delete(target) != null;
    }

}
