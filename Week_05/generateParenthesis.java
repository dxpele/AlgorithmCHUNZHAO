{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset134 STSongti-SC-Bold;\f1\froman\fcharset0 Times-Bold;\f2\froman\fcharset0 Times-Roman;
\f3\fmodern\fcharset0 Courier;\f4\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;\red57\green57\blue57;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c28627\c28627\c28627;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl480\qj\partightenfactor0

\f0\b\fs29\fsmilli14667 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //\'b7\'bd\'b7\'a8\'d2\'bb\'a3\'ba
\f1 (
\f0 \'bb\'d8\'cb\'dd\'cb\'e3\'b7\'a8
\f1 )
\f0 \'c9\'ee\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa\'d6\'ae\'d7\'f6\'bc\'d3\'b7\'a8
\f1  O(n)
\f2\b0 \
\pard\pardeftab720\partightenfactor0

\f3\fs24 \cf3 \strokec3 class Solution \{\
    // 
\f4 \'d7\'f6\'bc\'d3\'b7\'a8
\f3  \
    public List<String> generateParenthesis(int n) \{\
        List<String> list = new ArrayList<String>();\
        backtrack(list, "", 0, 0, n);\
        return list;\
    \}\
    \
    public void backtrack(List<String> list, String str, int left, int right, int max)\{\
        \
        if(str.length() == max*2)\{\
            list.add(str);\
            return;\
        \}\
        \
        if(left < max)\
            backtrack(list, str+"(", left+1, right, max);\
        if(right < left)\
            backtrack(list, str+")", left, right+1, max);\
    \}\
\}\
\pard\pardeftab720\sl480\partightenfactor0

\f0\b\fs29\fsmilli14667 \cf2 \strokec2 //\'b7\'bd\'b7\'a8\'b6\'fe\'a3\'ba
\f1 (
\f0 \'bb\'d8\'cb\'dd\'cb\'e3\'b7\'a8
\f1 )
\f0 \'c9\'ee\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa\'d6\'ae\'d7\'f6\'bc\'f5\'b7\'a8
\f1 (
\f0 \'ba\'cd\'bc\'d3\'b7\'a8\'d0\'a7\'c2\'ca\'cf\'e0\'cd\'ac
\f1 ) O(n)
\f2\b0 \
\pard\pardeftab720\partightenfactor0

\f3\fs24 \cf3 \strokec3 public class Solution \{\
    // 
\f4 \'d7\'f6\'bc\'f5\'b7\'a8
\f3 \
    public List<String> generateParenthesis(int n) \{\
        List<String> res = new ArrayList<>();\
        // 
\f4 \'cc\'d8\'c5\'d0
\f3 \
        if (n == 0) \{\
            return res;\
        \}\
\
\
        // 
\f4 \'d6\'b4\'d0\'d0\'c9\'ee\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa\'a3\'ac\'cb\'d1\'cb\'f7\'bf\'c9\'c4\'dc\'b5\'c4\'bd\'e1\'b9\'fb
\f3 \
        dfs("", n, n, res);\
        return res;\
    \}\
\
\
    /**\
     * @param curStr 
\f4 \'b5\'b1\'c7\'b0\'b5\'dd\'b9\'e9\'b5\'c3\'b5\'bd\'b5\'c4\'bd\'e1\'b9\'fb
\f3 \
     * @param left   
\f4 \'d7\'f3\'c0\'a8\'ba\'c5\'bb\'b9\'d3\'d0\'bc\'b8\'b8\'f6\'bf\'c9\'d2\'d4\'ca\'b9\'d3\'c3
\f3 \
     * @param right  
\f4 \'d3\'d2\'c0\'a8\'ba\'c5\'bb\'b9\'d3\'d0\'bc\'b8\'b8\'f6\'bf\'c9\'d2\'d4\'ca\'b9\'d3\'c3
\f3 \
     * @param res    
\f4 \'bd\'e1\'b9\'fb\'bc\'af
\f3 \
     */\
    private void dfs(String curStr, int left, int right, List<String> res) \{\
        // 
\f4 \'d2\'f2\'ce\'aa\'c3\'bf\'d2\'bb\'b4\'ce\'b3\'a2\'ca\'d4\'a3\'ac\'b6\'bc\'ca\'b9\'d3\'c3\'d0\'c2\'b5\'c4\'d7\'d6\'b7\'fb\'b4\'ae\'b1\'e4\'c1\'bf\'a3\'ac\'cb\'f9\'d2\'d4\'ce\'de\'d0\'e8\'bb\'d8\'cb\'dd
\f3 \
        // 
\f4 \'d4\'da\'b5\'dd\'b9\'e9\'d6\'d5\'d6\'b9\'b5\'c4\'ca\'b1\'ba\'f2\'a3\'ac\'d6\'b1\'bd\'d3\'b0\'d1\'cb\'fc\'cc\'ed\'bc\'d3\'b5\'bd\'bd\'e1\'b9\'fb\'bc\'af\'bc\'b4\'bf\'c9\'a3\'ac\'d7\'a2\'d2\'e2\'d3\'eb\'a1\'b8\'c1\'a6\'bf\'db\'a1\'b9\'b5\'da
\f3  46 
\f4 \'cc\'e2\'a1\'a2\'b5\'da
\f3  39 
\f4 \'cc\'e2\'c7\'f8\'b7\'d6
\f3 \
        if (left == 0 && right == 0) \{\
            res.add(curStr);\
            return;\
        \}\
\
\
        // 
\f4 \'bc\'f4\'d6\'a6\'a3\'a8\'c8\'e7\'cd\'bc\'a3\'ac\'d7\'f3\'c0\'a8\'ba\'c5\'bf\'c9\'d2\'d4\'ca\'b9\'d3\'c3\'b5\'c4\'b8\'f6\'ca\'fd\'d1\'cf\'b8\'f1\'b4\'f3\'d3\'da\'d3\'d2\'c0\'a8\'ba\'c5\'bf\'c9\'d2\'d4\'ca\'b9\'d3\'c3\'b5\'c4\'b8\'f6\'ca\'fd\'a3\'ac\'b2\'c5\'bc\'f4\'d6\'a6\'a3\'ac\'d7\'a2\'d2\'e2\'d5\'e2\'b8\'f6\'cf\'b8\'bd\'da\'a3\'a9
\f3 \
        if (left > right) \{\
            return;\
        \}\
\
\
        if (left > 0) \{\
            dfs(curStr + "(", left - 1, right, res);\
        \}\
\
\
        if (right > 0) \{\
            dfs(curStr + ")", left, right - 1, res);\
        \}\
  \
}