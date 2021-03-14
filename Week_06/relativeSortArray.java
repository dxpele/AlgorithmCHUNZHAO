{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class Solution \{\
    public int[] relativeSortArray(int[] arr1, int[] arr2) \{\
        Map<Integer, Integer> map = new HashMap<>();\
        List<Integer> list = new ArrayList<>();\
        for(int num : arr1) list.add(num);\
        for(int i = 0; i < arr2.length; i++) map.put(arr2[i], i);\
        Collections.sort(list, (x, y) -> \{\
            if(map.containsKey(x) || map.containsKey(y)) return map.getOrDefault(x, 1001) - map.getOrDefault(y, 1001);\
            return x - y;\
        \});\
        for(int i = 0; i < arr1.length; i++) arr1[i] = list.get(i);\
        return arr1;\
    \}\
\}\
}