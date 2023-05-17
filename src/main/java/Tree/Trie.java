package Tree;

class TrieNode{
    char data;//optional(for understanding purpose)
    TrieNode[] childTrieNode= new TrieNode[26];
    boolean isWordEndReached;// or we can have count of end of word

    TrieNode() {
        for (int i = 0; i < 26; i++)
        {childTrieNode[i]= null;}

        this.isWordEndReached=false;
    }
}

public class Trie {


    static void createTrie(TrieNode root, String key)
    {
        TrieNode currNode=root;
        for(int i=0; i < key.length();i++)
        {
            char curr=key.charAt(i);
            if(currNode.childTrieNode[curr-'a'] == null)
            {
                TrieNode newNode=new TrieNode();
                currNode.childTrieNode[curr-'a']= newNode;
            }
            currNode=currNode.childTrieNode[curr-'a'];
        }
        currNode.isWordEndReached=true;
    }

    static boolean search(TrieNode root, String key)
    {
        TrieNode currNode=root;
        for(int i=0; i < key.length();i++)
        {
            char curr=key.charAt(i);
            if(currNode.childTrieNode[curr-'a'] == null)
            { return false;}
            currNode=currNode.childTrieNode[curr-'a'];
        }
       return currNode.isWordEndReached;
    }

    static void delete(TrieNode root, String key)
    {
        TrieNode currNode=root;
        for(int i=0; i < key.length();i++)
        {
            char curr=key.charAt(i);
            if(currNode.childTrieNode[curr-'a'] == null)
            { break;}
            currNode=currNode.childTrieNode[curr-'a'];
        }
        currNode.isWordEndReached=false;
    }

    public static void main(String[] args)
    {
        TrieNode root=new TrieNode();
       String[] words={"app","apple","book"};

       for(int i =0 ; i < words.length; i++)
       {
           createTrie(root,words[i]);
       }

      boolean result= search(root,"app");
       System.out.println("result   :"+ result);
        delete(root,"app");

        boolean resultAfter= search(root,"app");
        System.out.println("resultAfter   :"+ resultAfter);
    }
}
