{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class LRUCache \{\
    // key -> Node(key, val)\
    private HashMap<Integer, Node> map;\
    // Node(k1, v1) <-> Node(k2, v2)...\
    private LinkedList<Node> cache;\
    // 
\f1 \'d7\'ee\'b4\'f3\'c8\'dd\'c1\'bf
\f0 \
    private int cap;\
    \
    public LRUCache(int capacity) \{\
        this.cap = capacity;\
        map = new HashMap<>();\
        cache = new LinkedList<Node>();\
    \}\
    \
    public int get(int key) \{\
        if (!map.containsKey(key))\
            return -1;\
        int val = map.get(key).val;\
        // 
\f1 \'c0\'fb\'d3\'c3
\f0  put 
\f1 \'b7\'bd\'b7\'a8\'b0\'d1\'b8\'c3\'ca\'fd\'be\'dd\'cc\'e1\'c7\'b0
\f0 \
        put(key, val);\
        return val;\
    \}\
    \
    public void put(int key, int val) \{\
        // 
\f1 \'cf\'c8\'b0\'d1\'d0\'c2\'bd\'da\'b5\'e3
\f0  x 
\f1 \'d7\'f6\'b3\'f6\'c0\'b4
\f0 \
        Node x = new Node(key, val);\
        \
        if (map.containsKey(key)) \{\
            // 
\f1 \'c9\'be\'b3\'fd\'be\'c9\'b5\'c4\'bd\'da\'b5\'e3\'a3\'ac\'d0\'c2\'b5\'c4\'b2\'e5\'b5\'bd\'cd\'b7\'b2\'bf
\f0 \
            cache.remove(map.get(key));\
            cache.addFirst(x);\
            // 
\f1 \'b8\'fc\'d0\'c2
\f0  map 
\f1 \'d6\'d0\'b6\'d4\'d3\'a6\'b5\'c4\'ca\'fd\'be\'dd
\f0 \
            map.put(key, x);\
        \} else \{\
            if (cap == cache.size()) \{\
                // 
\f1 \'c9\'be\'b3\'fd\'c1\'b4\'b1\'ed\'d7\'ee\'ba\'f3\'d2\'bb\'b8\'f6\'ca\'fd\'be\'dd
\f0 \
                Node last = cache.removeLast();\
                map.remove(last.key);\
            \}\
            // 
\f1 \'d6\'b1\'bd\'d3\'cc\'ed\'bc\'d3\'b5\'bd\'cd\'b7\'b2\'bf
\f0 \
            cache.addFirst(x);\
            map.put(key, x);\
        \}\
    \}\
\}\
class Node \{\
    public int key, val;\
    public Node next, prev;\
    public Node(int k, int v) \{\
        this.key = k;\
        this.val = v;\
    \}\
\}\
\
\
/**\
 * Your LRUCache object will be instantiated and called as such:\
 * LRUCache obj = new LRUCache(capacity);\
 * int param_1 = obj.get(key);\
 * obj.put(key,value);\
 */\
}