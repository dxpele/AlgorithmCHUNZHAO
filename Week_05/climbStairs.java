{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Bold;\f1\fnil\fcharset134 STSongti-SC-Bold;\f2\froman\fcharset0 Times-Roman;
\f3\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red57\green57\blue57;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c28627\c28627\c28627;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl480\partightenfactor0

\f0\b\fs29\fsmilli14667 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //1.
\f1 \'bd\'e8\'d3\'c3\'b6\'ee\'cd\'e2\'bf\'d5\'bc\'e4\'b4\'e6\'b4\'a2\'c7\'b0\'c1\'bd\'ce\'bb\'b5\'c4\'ca\'fd\'d6\'b5
\f0  O(n)
\f2\b0 \
\pard\pardeftab720\partightenfactor0

\f3\fs24 \cf3 \strokec3 class Solution \{\
    public int climbStairs(int n) \{\
       int arr[] = new int[n+2];\
       arr[0]=1;\
       arr[1]=1;\
       arr[2]=2;\
       for(int i=3;i<=n;i++)\{\
          arr[i]=arr[i-1]+arr[i-2];\
       \}\
       return arr[n];\
    \}\
\}\
//
\f0\b\fs29\fsmilli14667 \cf2 \strokec2 2.
\f1 \'b5\'dd\'b9\'e9
\f0 ,
\f1 \'c0\'fb\'d3\'c3
\f0 hashmap
\f1 \'c8\'a5\'b3\'fd\'b5\'dd\'b9\'e9\'b4\'f8\'c0\'b4\'b5\'c4\'d6\'d8\'b8\'b4\'ca\'fd\'be\'dd
\f0  O(n)
\f2\b0 \

\f3\fs24 \cf3 \strokec3 class Solution \{\
    Map<Integer, Integer> dp = new HashMap();\
    public int climbStairs(int n) \{\
        if(n<0)\
            return 0;\
        if(n==0)\
            return 1;\
        if(dp.containsKey(n))\
            return dp.get(n);\
        int steps= climbStairs(n-1)+climbStairs(n-2);\
        dp.put(n, steps);\
        return steps; \
    \}\
\}\
}