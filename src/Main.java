public class Main {

    public static void main(String[] args) {
        Node root1;

        myBSt obj=new myBSt();
        System.out.println("insertion");
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        //obj.insert(40);
        obj.inoderTraversal(obj.root);
        System.out.println();
        obj.delete(30);
        System.out.println();
        obj.inoderTraversal(obj.root);
        System.out.println();
        obj.search(10);
    }
}
