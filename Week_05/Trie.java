{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class Trie \{\
\
    class TireNode \{\
        private boolean isEnd;\
        TireNode[] next;\
\
\
        public TireNode() \{\
            isEnd = false;\
            next = new TireNode[26];\
        \}\
    \}\
\
\
    private TireNode root;\
\
\
    /** Initialize your data structure here. */\
    public Trie() \{\
        root = new TireNode();\
    \}\
    \
    /** Inserts a word into the trie. */\
    public void insert(String word) \{\
        TireNode node = root;\
        for (char c : word.toCharArray()) \{\
            if (node.next[c - 'a'] == null) \{\
                node.next[c - 'a'] = new TireNode();\
            \}\
            node = node.next[c - 'a'];\
        \}\
        node.isEnd = true;\
    \}\
    \
    /** Returns if the word is in the trie. */\
    public boolean search(String word) \{\
        TireNode node = root;\
        for (char c : word.toCharArray()) \{\
            node = node.next[c - 'a'];\
            if (node == null) \{\
                return false;\
            \}\
        \}\
        return node.isEnd;\
    \}\
    \
    /** Returns if there is any word in the trie that starts with the given prefix. */\
    public boolean startsWith(String prefix) \{\
        TireNode node = root;\
        for (char c : prefix.toCharArray()) \{\
            node = node.next[c - 'a'];\
            if (node == null) \{\
                return false;\
            \}\
        \}\
        return true;\
    \}\
\}\
\
\
/**\
 * Your Trie object will be instantiated and called as such:\
 * Trie obj = new Trie();\
 * obj.insert(word);\
 * boolean param_2 = obj.search(word);\
 * boolean param_3 = obj.startsWith(prefix)\
}