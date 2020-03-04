

public class myBSt {
    Node root;

    public myBSt() {
        root = null;
    }

    public void insert(int val) {
        Node newnode = new Node();
        newnode.data = val;
        if (root == null) {
            root = newnode;

        } else {
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (val < current.data) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newnode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }

    public void search(int val) {
        Node current = new Node();
        current = root;
        int value;

        while (true) {
            if (root == null) {
                System.out.println("underflow");

            } else {
                if (val < current.data) {
                    current = current.left;

                } else if (val > current.data) {
                    current = current.right;
                } else if (val == current.data) {
                    System.out.println("Elenemt found");
                    return;
                } else {
                    System.out.println("not found");
                }
            }
        }

    }
    public void Max()
    {
        Node current;
        Node parent;
        current=root;
        parent=null;
        while (current!=null)
        {
            parent=current;
            current=current.right;

        }
        System.out.println("Min valuve is" +parent.data);
    }
    public void Min()
    {
     Node current;
     Node parent;
     current=root;
        parent=null;
        while (current!=null)
        {
            parent=current;
            current=current.left;

        }
        System.out.println("Min valuve is" +parent.data);
    }
    public void delete(int val)
    {
    Node current=root;
    Node parent = null;
    boolean isleft= false;
    while (current.data!=val)
    {
        parent=current;
        if (val<current.data)
        {
            current=current.left;
            isleft=true;

        }
    else {
        current=current.right;
        isleft=false;

        }
    if (root==null)
        {
        return;
        }

      }
    //in the case of leaf node
    if(current.left==null && current.right== null)
    {
    if(current==root)
    {
        root=null;
    }
    else if (isleft==true)
    {
        parent.left=null;
    }
    else
    {
        parent.right=null;

    }
    }
    }
    public void inoderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        else
        {
            inoderTraversal(root.left);
            System.out.println(root.data);
            inoderTraversal(root.right);

        }
    }
    }





