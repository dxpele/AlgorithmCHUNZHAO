{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset134 STSongti-SC-Regular;\f1\froman\fcharset0 Times-Roman;\f2\fmodern\fcharset0 Courier;
\f3\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;\red57\green57\blue57;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c28627\c28627\c28627;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl480\qj\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //\'b7\'bd\'b7\'a8\'d2\'bb\'a3\'ba\'b1\'a9\'c1\'a6\'c6\'a5\'c5\'e4
\f1  
\f0 \'a3\'a8
\f1 Brute Force
\f0 \'a3\'a9
\f1  O(n3)\
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 public class Solution \{\
\
\
    public String longestPalindrome(String s) \{\
        int len = s.length();\
        if (len < 2) \{\
            return s;\
        \}\
\
\
        int maxLen = 1;\
        int begin = 0;\
        // s.charAt(i) 
\f3 \'c3\'bf\'b4\'ce\'b6\'bc\'bb\'e1\'bc\'ec\'b2\'e9\'ca\'fd\'d7\'e9\'cf\'c2\'b1\'ea\'d4\'bd\'bd\'e7\'a3\'ac\'d2\'f2\'b4\'cb\'cf\'c8\'d7\'aa\'bb\'bb\'b3\'c9\'d7\'d6\'b7\'fb\'ca\'fd\'d7\'e9
\f2 \
        char[] charArray = s.toCharArray();\
\
\
        // 
\f3 \'c3\'b6\'be\'d9\'cb\'f9\'d3\'d0\'b3\'a4\'b6\'c8\'b4\'f3\'d3\'da
\f2  1 
\f3 \'b5\'c4\'d7\'d3\'b4\'ae
\f2  charArray[i..j]\
        for (int i = 0; i < len - 1; i++) \{\
            for (int j = i + 1; j < len; j++) \{\
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) \{\
                    maxLen = j - i + 1;\
                    begin = i;\
                \}\
            \}\
        \}\
        return s.substring(begin, begin + maxLen);\
    \}\
\
\
    /**\
     * 
\f3 \'d1\'e9\'d6\'a4\'d7\'d3\'b4\'ae
\f2  s[left..right] 
\f3 \'ca\'c7\'b7\'f1\'ce\'aa\'bb\'d8\'ce\'c4\'b4\'ae
\f2 \
     */\
    private boolean validPalindromic(char[] charArray, int left, int right) \{\
        while (left < right) \{\
            if (charArray[left] != charArray[right]) \{\
                return false;\
            \}\
            left++;\
            right--;\
        \}\
        return true;\
    \
\pard\pardeftab720\sl480\qj\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \strokec2 //\'b7\'bd\'b7\'a8\'b6\'fe\'a3\'ba\'b6\'af\'cc\'ac\'b9\'e6\'bb\'ae
\f1 \'a0 O(n2)\
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 public class Solution \{\
\
\
    public String longestPalindrome(String s) \{\
        // 
\f3 \'cc\'d8\'c5\'d0
\f2 \
        int len = s.length();\
        if (len < 2) \{\
            return s;\
        \}\
\
\
        int maxLen = 1;\
        int begin = 0;\
\
\
        // dp[i][j] 
\f3 \'b1\'ed\'ca\'be
\f2  s[i, j] 
\f3 \'ca\'c7\'b7\'f1\'ca\'c7\'bb\'d8\'ce\'c4\'b4\'ae
\f2 \
        boolean[][] dp = new boolean[len][len];\
        char[] charArray = s.toCharArray();\
\
\
        for (int i = 0; i < len; i++) \{\
            dp[i][i] = true;\
        \}\
        for (int j = 1; j < len; j++) \{\
            for (int i = 0; i < j; i++) \{\
                if (charArray[i] != charArray[j]) \{\
                    dp[i][j] = false;\
                \} else \{\
                    if (j - i < 3) \{\
                        dp[i][j] = true;\
                    \} else \{\
                        dp[i][j] = dp[i + 1][j - 1];\
                    \}\
                \}\
\
\
                // 
\f3 \'d6\'bb\'d2\'aa
\f2  dp[i][j] == true 
\f3 \'b3\'c9\'c1\'a2\'a3\'ac\'be\'cd\'b1\'ed\'ca\'be\'d7\'d3\'b4\'ae
\f2  s[i..j] 
\f3 \'ca\'c7\'bb\'d8\'ce\'c4\'a3\'ac\'b4\'cb\'ca\'b1\'bc\'c7\'c2\'bc\'bb\'d8\'ce\'c4\'b3\'a4\'b6\'c8\'ba\'cd\'c6\'f0\'ca\'bc\'ce\'bb\'d6\'c3
\f2 \
                if (dp[i][j] && j - i + 1 > maxLen) \{\
                    maxLen = j - i + 1;\
                    begin = i;\
                \}\
            \}\
        \}\
        return s.substring(begin, begin + maxLen);\
   \
\pard\pardeftab720\sl480\qj\partightenfactor0

\f0\fs29\fsmilli14667 \cf2 \strokec2 //\'b7\'bd\'b7\'a8\'c8\'fd\'a3\'ba\'d6\'d0\'d0\'c4\'c0\'a9\'c9\'a2\'b7\'a8
\f1 \
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 public class Solution \{\
\
\
    public String longestPalindrome(String s) \{\
        int len = s.length();\
        if (len < 2) \{\
            return s;\
        \}\
        int maxLen = 1;\
        String res = s.substring(0, 1);\
        // 
\f3 \'d6\'d0\'d0\'c4\'ce\'bb\'d6\'c3\'c3\'b6\'be\'d9\'b5\'bd
\f2  len - 2 
\f3 \'bc\'b4\'bf\'c9
\f2 \
        for (int i = 0; i < len - 1; i++) \{\
            String oddStr = centerSpread(s, i, i);\
            String evenStr = centerSpread(s, i, i + 1);\
            String maxLenStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;\
            if (maxLenStr.length() > maxLen) \{\
                maxLen = maxLenStr.length();\
                res = maxLenStr;\
            \}\
        \}\
        return res;\
    \}\
\
\
    private String centerSpread(String s, int left, int right) \{\
        // left = right 
\f3 \'b5\'c4\'ca\'b1\'ba\'f2\'a3\'ac\'b4\'cb\'ca\'b1\'bb\'d8\'ce\'c4\'d6\'d0\'d0\'c4\'ca\'c7\'d2\'bb\'b8\'f6\'d7\'d6\'b7\'fb\'a3\'ac\'bb\'d8\'ce\'c4\'b4\'ae\'b5\'c4\'b3\'a4\'b6\'c8\'ca\'c7\'c6\'e6\'ca\'fd
\f2 \
        // right = left + 1 
\f3 \'b5\'c4\'ca\'b1\'ba\'f2\'a3\'ac\'b4\'cb\'ca\'b1\'bb\'d8\'ce\'c4\'d6\'d0\'d0\'c4\'ca\'c7\'d2\'bb\'b8\'f6\'bf\'d5\'cf\'b6\'a3\'ac\'bb\'d8\'ce\'c4\'b4\'ae\'b5\'c4\'b3\'a4\'b6\'c8\'ca\'c7\'c5\'bc\'ca\'fd
\f2 \
        int len = s.length();\
        int i = left;\
        int j = right;\
        while (i >= 0 && j < len) \{\
            if (s.charAt(i) == s.charAt(j)) \{\
                i--;\
                j++;\
            \} else \{\
                break;\
            \}\
        \}\
        // 
\f3 \'d5\'e2\'c0\'ef\'d2\'aa\'d0\'a1\'d0\'c4\'a3\'ac\'cc\'f8\'b3\'f6
\f2  while 
\f3 \'d1\'ad\'bb\'b7\'ca\'b1\'a3\'ac\'c7\'a1\'ba\'c3\'c2\'fa\'d7\'e3
\f2  s.charAt(i) != s.charAt(j)
\f3 \'a3\'ac\'d2\'f2\'b4\'cb\'b2\'bb\'c4\'dc\'c8\'a1
\f2  i
\f3 \'a3\'ac\'b2\'bb\'c4\'dc\'c8\'a1
\f2  j\
        return s.substring(i + 1, j);\
    \}\
}