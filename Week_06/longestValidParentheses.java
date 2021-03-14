{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;\f1\fnil\fcharset134 STSongti-SC-Regular;\f2\fmodern\fcharset0 Courier;
}
{\colortbl;\red255\green255\blue255;\red57\green57\blue57;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c28627\c28627\c28627;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl480\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //1.
\f1 \'b3\'a3\'b9\'e6\'ca\'b9\'d3\'c3\'d5\'bb
\f0  O(n)\
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 class Solution \{\
    public int longestValidParentheses(String s) \{\
        if (s == null || s.length() == 0) return 0;\
        Deque<Integer> stack = new ArrayDeque<>();\
        stack.push(-1);\
        //System.out.println(stack);\
        int res = 0;\
        for (int i = 0; i < s.length(); i++) \{\
            if (s.charAt(i) == '(') stack.push(i);\
            else \{\
                stack.pop();\
                if (stack.isEmpty()) stack.push(i);\
                else \{\
                    res = Math.max(res, i - stack.peek());\
                \}\
            \}\
        \}\
        return res;\
    \}\
\}\
\pard\pardeftab720\sl480\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \strokec2 //2.
\f1 \'b6\'af\'cc\'ac\'b9\'e6\'bb\'ae
\f0  O(n)\
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 class Solution \{\
    public int longestValidParentheses(String s) \{\
        if (s == null || s.length() == 0) return 0;\
        int[] dp = new int[s.length()];\
        int res = 0;\
        for (int i = 0; i < s.length(); i++) \{\
            if (i > 0 && s.charAt(i) == ')') \{\
                if (s.charAt(i - 1) == '(') \{\
                    dp[i] = (i - 2 >= 0 ? dp[i - 2] + 2 : 2);\
                \} else if (s.charAt(i - 1) == ')' && i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') \{\
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);\
                \}\
            \}\
            res = Math.max(res, dp[i]);\
        \}\
        return res;\
    \}\
}