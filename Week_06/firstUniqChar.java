{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class Solution \{\
    public int firstUniqChar(String s) \{\
        int[] f=new int[26];\
        for(int i=0;i<s.length();i++) \{\
            f[s.charAt(i)-'a']++;\
        \}\
        for(int i=0;i<s.length();i++) \{\
            if(f[s.charAt(i)-'a']==1) \{\
                return i;\
            \}\
        \}\
        return -1;\
    \}\
\}\
}