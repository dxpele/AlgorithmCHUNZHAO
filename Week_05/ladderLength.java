{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;\f1\fmodern\fcharset0 Courier;\f2\fnil\fcharset134 PingFangSC-Regular;
\f3\fnil\fcharset134 STSongti-SC-Regular;}
{\colortbl;\red255\green255\blue255;\red57\green57\blue57;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c28627\c28627\c28627;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl480\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //1.BFS \
\pard\pardeftab720\partightenfactor0

\f1\fs24 \cf3 \strokec3 class Solution \{\
     public int ladderLength(String beginWord, String endWord, List<String> wordList) \{\
        // 
\f2 \'b5\'da
\f1  1 
\f2 \'b2\'bd\'a3\'ba\'cf\'c8\'bd\'ab
\f1  wordList 
\f2 \'b7\'c5\'b5\'bd\'b9\'fe\'cf\'a3\'b1\'ed\'c0\'ef\'a3\'ac\'b1\'e3\'d3\'da\'c5\'d0\'b6\'cf\'c4\'b3\'b8\'f6\'b5\'a5\'b4\'ca\'ca\'c7\'b7\'f1\'d4\'da
\f1  wordList 
\f2 \'c0\'ef
\f1 \
        Set<String> wordSet = new HashSet<>(wordList);\
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) \{\
            return 0;\
        \}\
        wordSet.remove(beginWord);\
        \
        // 
\f2 \'b5\'da
\f1  2 
\f2 \'b2\'bd\'a3\'ba\'cd\'bc\'b5\'c4\'b9\'e3\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa\'a3\'ac\'b1\'d8\'d0\'eb\'ca\'b9\'d3\'c3\'b6\'d3\'c1\'d0\'ba\'cd\'b1\'ed\'ca\'be\'ca\'c7\'b7\'f1\'b7\'c3\'ce\'ca\'b9\'fd\'b5\'c4
\f1  visited 
\f2 \'b9\'fe\'cf\'a3\'b1\'ed
\f1 \
        Queue<String> queue = new LinkedList<>();\
        queue.offer(beginWord);\
        Set<String> visited = new HashSet<>();\
        visited.add(beginWord);\
        \
        // 
\f2 \'b5\'da
\f1  3 
\f2 \'b2\'bd\'a3\'ba\'bf\'aa\'ca\'bc\'b9\'e3\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa\'a3\'ac\'b0\'fc\'ba\'ac\'c6\'f0\'b5\'e3\'a3\'ac\'d2\'f2\'b4\'cb\'b3\'f5\'ca\'bc\'bb\'af\'b5\'c4\'ca\'b1\'ba\'f2\'b2\'bd\'ca\'fd\'ce\'aa
\f1  1\
        int step = 1;\
        while (!queue.isEmpty()) \{\
            int currentSize = queue.size();\
            for (int i = 0; i < currentSize; i++) \{\
                // 
\f2 \'d2\'c0\'b4\'ce\'b1\'e9\'c0\'fa\'b5\'b1\'c7\'b0\'b6\'d3\'c1\'d0\'d6\'d0\'b5\'c4\'b5\'a5\'b4\'ca
\f1 \
                String currentWord = queue.poll();\
                // 
\f2 \'c8\'e7\'b9\'fb
\f1  currentWord 
\f2 \'c4\'dc\'b9\'bb\'d0\'de\'b8\'c4
\f1  1 
\f2 \'b8\'f6\'d7\'d6\'b7\'fb\'d3\'eb
\f1  endWord 
\f2 \'cf\'e0\'cd\'ac\'a3\'ac\'d4\'f2\'b7\'b5\'bb\'d8
\f1  step + 1\
                if (changeWordEveryOneLetter(currentWord, endWord, queue, visited, wordSet)) \{\
                    return step + 1;\
                \}\
            \}\
            step++;\
        \}\
        return 0;\
    \}\
\
\
    /**\
     * 
\f2 \'b3\'a2\'ca\'d4\'b6\'d4
\f1  currentWord 
\f2 \'d0\'de\'b8\'c4\'c3\'bf\'d2\'bb\'b8\'f6\'d7\'d6\'b7\'fb\'a3\'ac\'bf\'b4\'bf\'b4\'ca\'c7\'b2\'bb\'ca\'c7\'c4\'dc\'d3\'eb
\f1  endWord 
\f2 \'c6\'a5\'c5\'e4
\f1 \
     *\
     * @param currentWord\
     * @param endWord\
     * @param queue\
     * @param visited\
     * @param wordSet\
     * @return\
     */\
    private boolean changeWordEveryOneLetter(String currentWord, String endWord,\
                                             Queue<String> queue, Set<String> visited, Set<String> wordSet) \{\
        char[] charArray = currentWord.toCharArray();\
        for (int i = 0; i < endWord.length(); i++) \{\
            // 
\f2 \'cf\'c8\'b1\'a3\'b4\'e6\'a3\'ac\'c8\'bb\'ba\'f3\'bb\'d6\'b8\'b4
\f1 \
            char originChar = charArray[i];\
            for (char k = 'a'; k <= 'z'; k++) \{\
                if (k == originChar) \{\
                    continue;\
                \}\
                charArray[i] = k;\
                String nextWord = String.valueOf(charArray);\
                if (wordSet.contains(nextWord)) \{\
                    if (nextWord.equals(endWord)) \{\
                        return true;\
                    \}\
                    if (!visited.contains(nextWord)) \{\
                        queue.add(nextWord);\
                        // 
\f2 \'d7\'a2\'d2\'e2\'a3\'ba\'cc\'ed\'bc\'d3\'b5\'bd\'b6\'d3\'c1\'d0\'d2\'d4\'ba\'f3\'a3\'ac\'b1\'d8\'d0\'eb\'c2\'ed\'c9\'cf\'b1\'ea\'bc\'c7\'ce\'aa\'d2\'d1\'be\'ad\'b7\'c3\'ce\'ca
\f1 \
                        visited.add(nextWord);\
                    \}\
                \}\
            \}\
            // 
\f2 \'bb\'d6\'b8\'b4
\f1 \
            charArray[i] = originChar;\
        \}\
        return false;\
    \}\
\}\
\pard\pardeftab720\sl480\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \strokec2 //2.
\f3 \'cb\'ab\'cf\'f2
\f0 BFS\
\pard\pardeftab720\partightenfactor0

\f1\fs24 \cf3 \strokec3 class Solution \{\
    public int ladderLength(String beginWord, String endWord, List<String> wordList) \{\
        // 
\f2 \'b5\'da
\f1  1 
\f2 \'b2\'bd\'a3\'ba\'cf\'c8\'bd\'ab
\f1  wordList 
\f2 \'b7\'c5\'b5\'bd\'b9\'fe\'cf\'a3\'b1\'ed\'c0\'ef\'a3\'ac\'b1\'e3\'d3\'da\'c5\'d0\'b6\'cf\'c4\'b3\'b8\'f6\'b5\'a5\'b4\'ca\'ca\'c7\'b7\'f1\'d4\'da
\f1  wordList 
\f2 \'c0\'ef
\f1 \
        Set<String> wordSet = new HashSet<>(wordList);\
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) \{\
            return 0;\
        \}\
\
\
        // 
\f2 \'b5\'da
\f1  2 
\f2 \'b2\'bd\'a3\'ba\'d2\'d1\'be\'ad\'b7\'c3\'ce\'ca\'b9\'fd\'b5\'c4
\f1  word 
\f2 \'cc\'ed\'bc\'d3\'b5\'bd
\f1  visited 
\f2 \'b9\'fe\'cf\'a3\'b1\'ed\'c0\'ef
\f1 \
        Set<String> visited = new HashSet<>();\
        // 
\f2 \'b7\'d6\'b1\'f0\'d3\'c3\'d7\'f3\'b1\'df\'ba\'cd\'d3\'d2\'b1\'df\'c0\'a9\'c9\'a2\'b5\'c4\'b9\'fe\'cf\'a3\'b1\'ed\'b4\'fa\'cc\'e6\'b5\'a5\'cf\'f2
\f1  BFS 
\f2 \'c0\'ef\'b5\'c4\'b6\'d3\'c1\'d0\'a3\'ac\'cb\'fc\'c3\'c7\'d4\'da\'cb\'ab\'cf\'f2
\f1  BFS 
\f2 \'b5\'c4\'b9\'fd\'b3\'cc\'d6\'d0\'bd\'bb\'cc\'e6\'ca\'b9\'d3\'c3
\f1 \
        Set<String> beginVisited = new HashSet<>();\
        beginVisited.add(beginWord);\
        Set<String> endVisited = new HashSet<>();\
        endVisited.add(endWord);\
\
\
        // 
\f2 \'b5\'da
\f1  3 
\f2 \'b2\'bd\'a3\'ba\'d6\'b4\'d0\'d0\'cb\'ab\'cf\'f2
\f1  BFS
\f2 \'a3\'ac\'d7\'f3\'d3\'d2\'bd\'bb\'cc\'e6\'c0\'a9\'c9\'a2\'b5\'c4\'b2\'bd\'ca\'fd\'d6\'ae\'ba\'cd\'ce\'aa\'cb\'f9\'c7\'f3
\f1 \
        int step = 1;\
        while (!beginVisited.isEmpty() && !endVisited.isEmpty()) \{\
            // 
\f2 \'d3\'c5\'cf\'c8\'d1\'a1\'d4\'f1\'d0\'a1\'b5\'c4\'b9\'fe\'cf\'a3\'b1\'ed\'bd\'f8\'d0\'d0\'c0\'a9\'c9\'a2\'a3\'ac\'bf\'bc\'c2\'c7\'b5\'bd\'b5\'c4\'c7\'e9\'bf\'f6\'b8\'fc\'c9\'d9
\f1 \
            if (beginVisited.size() > endVisited.size()) \{\
                Set<String> temp = beginVisited;\
                beginVisited = endVisited;\
                endVisited = temp;\
            \}\
\
\
            // 
\f2 \'c2\'df\'bc\'ad\'b5\'bd\'d5\'e2\'c0\'ef\'a3\'ac\'b1\'a3\'d6\'a4
\f1  beginVisited 
\f2 \'ca\'c7\'cf\'e0\'b6\'d4\'bd\'cf\'d0\'a1\'b5\'c4\'bc\'af\'ba\'cf\'a3\'ac
\f1 nextLevelVisited 
\f2 \'d4\'da\'c0\'a9\'c9\'a2\'cd\'ea\'b3\'c9\'d2\'d4\'ba\'f3\'a3\'ac\'bb\'e1\'b3\'c9\'ce\'aa\'d0\'c2\'b5\'c4
\f1  beginVisited\
            Set<String> nextLevelVisited = new HashSet<>();\
            for (String word : beginVisited) \{\
                if (changeWordEveryOneLetter(word, endVisited, visited, wordSet, nextLevelVisited)) \{\
                    return step + 1;\
                \}\
            \}\
\
\
            // 
\f2 \'d4\'ad\'c0\'b4\'b5\'c4
\f1  beginVisited 
\f2 \'b7\'cf\'c6\'fa\'a3\'ac\'b4\'d3
\f1  nextLevelVisited 
\f2 \'bf\'aa\'ca\'bc\'d0\'c2\'b5\'c4\'cb\'ab\'cf\'f2
\f1  BFS\
            beginVisited = nextLevelVisited;\
            step++;\
        \}\
        return 0;\
    \}\
\
\
    /**\
     * 
\f2 \'b3\'a2\'ca\'d4\'b6\'d4
\f1  word 
\f2 \'d0\'de\'b8\'c4\'c3\'bf\'d2\'bb\'b8\'f6\'d7\'d6\'b7\'fb\'a3\'ac\'bf\'b4\'bf\'b4\'ca\'c7\'b2\'bb\'ca\'c7\'c4\'dc\'c2\'e4\'d4\'da
\f1  endVisited 
\f2 \'d6\'d0\'a3\'ac\'c0\'a9\'d5\'b9\'b5\'c3\'b5\'bd\'b5\'c4\'d0\'c2\'b5\'c4
\f1  word 
\f2 \'cc\'ed\'bc\'d3\'b5\'bd
\f1  nextLevelVisited 
\f2 \'c0\'ef
\f1 \
     *\
     * @param word\
     * @param endVisited\
     * @param visited\
     * @param wordSet\
     * @param nextLevelVisited\
     * @return\
     */\
    private boolean changeWordEveryOneLetter(String word, Set<String> endVisited,Set<String> visited,Set<String> wordSet,Set<String> nextLevelVisited) \{\
        char[] charArray = word.toCharArray();\
        for (int i = 0; i < word.length(); i++) \{\
            char originChar = charArray[i];\
            for (char c = 'a'; c <= 'z'; c++) \{\
                if (originChar == c) \{\
                    continue;\
                \}\
                charArray[i] = c;\
                String nextWord = String.valueOf(charArray);\
                if (wordSet.contains(nextWord)) \{\
                    if (endVisited.contains(nextWord)) \{\
                        return true;\
                    \}\
                    if (!visited.contains(nextWord)) \{\
                        nextLevelVisited.add(nextWord);\
                        visited.add(nextWord);\
                    \}\
                \}\
            \}\
            // 
\f2 \'bb\'d6\'b8\'b4\'a3\'ac\'cf\'c2\'b4\'ce\'d4\'d9\'d3\'c3
\f1 \
            charArray[i] = originChar;\
        \}\
        return false;\
   \
\pard\pardeftab720\sl480\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \strokec2 //3.
\f3 \'bc\'f2\'bd\'e0\'b0\'e6
\f0  
\f3 \'b1\'c8\'cb\'ab\'cf\'f2
\f0 bfs
\f3 \'c2\'fd\'d2\'bb\'b5\'e3
\f0 \
\pard\pardeftab720\partightenfactor0

\f1\fs24 \cf3 \strokec3 class Solution \{\
    public int ladderLength(String beginWord, String endWord, List<String> wordList) \{\
        Set<String> dict = new HashSet<>(wordList), qs = new HashSet<>(), qe = new HashSet<>(), vis = new HashSet<>();\
        qs.add(beginWord);\
        if (dict.contains(endWord)) qe.add(endWord); // all transformed words must be in dict (including endWord)\
        for (int len = 2; !qs.isEmpty(); len++) \{\
            Set<String> nq = new HashSet<>();\
            for (String w : qs) \{\
                for (int j = 0; j < w.length(); j++) \{\
                    char[] ch = w.toCharArray();\
                    for (char c = 'a'; c <= 'z'; c++) \{\
                        if (c == w.charAt(j)) continue; // beginWord and endWord not the same, so bypass itself\
                        ch[j] = c;\
                        String nb = String.valueOf(ch);\
                        if (qe.contains(nb)) return len; // meet from two ends\
                        if (dict.contains(nb) && vis.add(nb)) nq.add(nb); // not meet yet, vis is safe to use\
                    \}\
                \}\
            \}\
            qs = (nq.size() < qe.size()) ? nq : qe; // switch to small one to traverse from other end\
            qe = (qs == nq) ? qe : nq;\
        \}\
        return 0;\
    \}\
\}\
}