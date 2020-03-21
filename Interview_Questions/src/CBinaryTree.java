
public class CBinaryTree {
	CNode root;
	static int preIndex = 0;
	static int posIndex = 0;

	public static void main(String[] args) {
		
		CBinaryTree tree = new CBinaryTree();
		char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        char pos[]=new char[] {'D','E','B','F','G','C','A'};
        int len = in.length;
        CNode root = tree.buildTree(in, pre, 0, len - 1);
        CNode rootPos = tree.buildTreePoPo(pre, pos, 0, pos.length-1);
  
        // building the tree by printing in-order traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);

	}

	
	//POSTORDER --   DEB F  G C A 
	//PREORDER --    A B D ECF G 
	
//	CFG
	// DEBFGCA 
	 private CNode buildTreePoPo(char[] pre, char[] pos, int stPos, int enPos) {
		 
		 if(enPos==0||stPos>enPos)
		 {
			 return null;
		 }
		 
		 
		 CNode root = new CNode(pre[posIndex++]);
		 //posIndex++;
		 if(posIndex>=pre.length||stPos==enPos)
		 {
			 root.left=null;
			 root.right=null;
			 return root;
		 }
		 int i;
		
		
		 
		//root.right=;
		return root;
	}

	/* UTILITY FUNCTIONS */
    
    /* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
    int search(char arr[], int strt, int end, char value) 
    {
        int i;
        for (i = strt; i <= end; i++) 
        {
            if (arr[i] == value)
                return i;
        }
        return i;
    }
	private void printInorder(CNode root2) {
		// TODO Auto-generated method stub
		if(root2==null)
			
		{ 
			return;
		}
			printInorder(root2.left);
			System.out.println(root2.c);
			printInorder(root2.right);
		
		
	}

	private CNode buildTree(char in[], char pre[], int inStrt, int inEnd) {
		// TODO Auto-generated method stub
		
		if (inStrt > inEnd) 
            return null;
  
        /* Pick current node from Preorder traversal using preIndex
           and increment preIndex */
        CNode tNode = new CNode(pre[preIndex++]);
  
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return tNode;
        
        int inIndex = search(in, inStrt, inEnd, tNode.c);
        
        tNode.left=buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right=buildTree(in, pre,inIndex+1,inEnd);
  
		return tNode;
	}

}
