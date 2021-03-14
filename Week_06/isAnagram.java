{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class Solution \{\
    public boolean isAnagram(String s, String t) \{\
        if(s.length() != t.length())\
            return false;\
        int[] alpha = new int[26];\
        for(int i = 0; i< s.length(); i++) \{\
            alpha[s.charAt(i) - 'a'] ++;\
            alpha[t.charAt(i) - 'a'] --;\
        \}\
        for(int i=0;i<26;i++)\
            if(alpha[i] != 0)\
                return false;\
        return true;\
    \}\
\}\
}