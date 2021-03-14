{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 PingFangSC-Regular;}
{\colortbl;\red255\green255\blue255;\red184\green93\blue213;\red30\green33\blue39;\red222\green180\blue104;
\red155\green162\blue177;\red74\green80\blue93;\red81\green158\blue235;\red197\green136\blue84;\red214\green85\blue98;
\red252\green120\blue8;}
{\*\expandedcolortbl;;\csgenericrgb\c72157\c36471\c83529;\csgenericrgb\c11765\c12941\c15294;\csgenericrgb\c87059\c70588\c40784;
\csgenericrgb\c60784\c63529\c69412;\csgenericrgb\c29020\c31373\c36471;\csgenericrgb\c31765\c61961\c92157;\csgenericrgb\c77255\c53333\c32941;\csgenericrgb\c83922\c33333\c38431;
\csgenericrgb\c98824\c47059\c3137;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\fs28 \cf2 \cb3 package \cf4 test\cf5 ;\
\
\cf6 /**\
 * [
\f1 \'b1\'ed\'b4\'ef\'ca\'bd
\f0 ]\
 *\
 * \cf2 @author \cf6 : [Mr.ele]\
 * \cf2 @date \cf6 : [2021/3/13 2:54 
\f1 \'cf\'c2\'ce\'e7
\f0 ]\
 */\
\cf2 public class \cf4 test \cf5 \{\
    \cf6 //  
\f1 \'b2\'e5\'c8\'eb\'c5\'c5\'d0\'f2
\f0 \
//	
\f1 \'bb\'f9\'b1\'be\'cb\'bc\'cf\'eb\'a3\'ba\'c3\'bf\'b2\'bd\'bd\'ab\'d2\'bb\'b8\'f6\'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'bc\'cd\'c2\'bc\'a3\'ac\'b0\'b4\'c6\'e4\'b9\'d8\'bc\'fc\'c2\'eb\'d6\'b5\'b5\'c4\'b4\'f3\'d0\'a1\'b2\'e5\'c8\'eb\'c7\'b0\'c3\'e6\'d2\'d1\'be\'ad\'c5\'c5\'d0\'f2\'b5\'c4\'ce\'c4\'bc\'fe\'d6\'d0\'ca\'ca\'b5\'b1\'ce\'bb\'d6\'c3\'c9\'cf\'a3\'ac\'d6\'b1\'b5\'bd\'c8\'ab\'b2\'bf\'b2\'e5\'c8\'eb\'cd\'ea\'ce\'aa\'d6\'b9\'a1\'a3
\f0 \
//  
\f1 \'cb\'e3\'b7\'a8\'ca\'ca\'d3\'c3\'d3\'da\'c9\'d9\'c1\'bf\'ca\'fd\'be\'dd\'b5\'c4\'c5\'c5\'d0\'f2\'a3\'ac\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ce\'aa
\f0 O(n^2)
\f1 \'a1\'a3\'ca\'c7\'ce\'c8\'b6\'a8\'b5\'c4\'c5\'c5\'d0\'f2\'b7\'bd\'b7\'a8\'a1\'a3
\f0 \
    \cf2 public static void \cf7 insertionSort\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 ) \{\
        \cf2 int \cf5 tmp;\
        \cf2 for \cf5 (\cf2 int \cf5 i = \cf8 1\cf5 ; i < \cf8 array\cf5 .\cf9 length\cf5 ; i++) \{\
            tmp = \cf8 array\cf5 [i];  \cf6 //
\f1 \'bd\'ab\'b5\'b1\'c7\'b0\'ce\'bb\'d6\'c3\'b5\'c4\'ca\'fd\'b8\'f8
\f0 tmp\
            \cf2 int \cf5 j = i;\
            \cf2 for \cf5 (; j > \cf8 0 \cf5 && \cf8 array\cf5 [j - \cf8 1\cf5 ] > tmp; j--) \{\
                    \cf6 /*\
                    
\f1 \'cd\'f9\'d3\'d2\'d2\'c6\'a3\'ac\'cc\'da\'b3\'f6\'d7\'f3\'b1\'df\'b5\'c4\'ce\'bb\'d6\'c3
\f0 ,\
                    array[j-1]>tmp:
\f1 \'b4\'f3\'d3\'da\'ba\'c5\'ca\'c7\'c9\'fd\'d0\'f2\'c5\'c5\'c1\'d0\'a3\'ac\'d0\'a1\'d3\'da\'ba\'c5\'ca\'c7\'bd\'b5\'d0\'f2\'c5\'c5\'c1\'d0
\f0 \
                   */\
                \cf8 array\cf5 [j] = \cf8 array\cf5 [j - \cf8 1\cf5 ];\
            \}\
            \cf6 //
\f1 \'bd\'ab\'b5\'b1\'c7\'b0\'ce\'bb\'d6\'c3\'b5\'c4\'ca\'fd\'b2\'e5\'c8\'eb\'b5\'bd\'ba\'cf\'ca\'ca\'b5\'c4\'ce\'bb\'d6\'c3
\f0 \
            \cf8 array\cf5 [j] = tmp;\
        \}\
    \}\
\
    \cf6 //    
\f1 \'c3\'b0\'c5\'dd\'c5\'c5\'d0\'f2
\f0 \
//	  
\f1 \'bb\'f9\'b1\'be\'cb\'bc\'cf\'eb\'a3\'ba\'b3\'d6\'d0\'f8\'b1\'c8\'bd\'cf\'cf\'e0\'c1\'da\'b5\'c4\'d4\'aa\'cb\'d8\'a1\'a3\'c8\'e7\'b9\'fb\'b5\'da\'d2\'bb\'b8\'f6\'b1\'c8\'b5\'da\'b6\'fe\'b8\'f6\'b4\'f3\'a3\'ac\'be\'cd\'bd\'bb\'bb\'bb\'cb\'fb\'c3\'c7\'c1\'bd\'b8\'f6\'a1\'a3\'d6\'b1\'b5\'bd\'c3\'bb\'d3\'d0\'c8\'ce\'ba\'ce\'d2\'bb\'b6\'d4\'ca\'fd\'d7\'d6\'d0\'e8\'d2\'aa\'b1\'c8\'bd\'cf\'a1\'a3
\f0 \
//    
\f1 \'c3\'b0\'c5\'dd\'c5\'c5\'d0\'f2\'d7\'ee\'ba\'c3\'b5\'c4\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ce\'aa
\f0 O(n)
\f1 \'a1\'a3\'c3\'b0\'c5\'dd\'c5\'c5\'d0\'f2\'b5\'c4\'d7\'ee\'bb\'b5\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ce\'aa
\f0 O(n^2)
\f1 \'a1\'a3\'d2\'f2\'b4\'cb\'c3\'b0\'c5\'dd\'c5\'c5\'d0\'f2\'d7\'dc\'b5\'c4\'c6\'bd\'be\'f9\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ce\'aa
\f0 O(n^2)
\f1 \'a1\'a3
\f0 \
//    
\f1 \'cb\'e3\'b7\'a8\'ca\'ca\'d3\'c3\'d3\'da\'c9\'d9\'c1\'bf\'ca\'fd\'be\'dd\'b5\'c4\'c5\'c5\'d0\'f2\'a3\'ac\'ca\'c7\'ce\'c8\'b6\'a8\'b5\'c4\'c5\'c5\'d0\'f2\'b7\'bd\'b7\'a8\'a1\'a3
\f0 \
    \cf2 public static void \cf7 bubbleSort\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 ) \{\
        \cf2 int \cf5 tmp;\
        \cf2 boolean \cf5 flag = \cf2 false\cf5 ;  \cf6 //
\f1 \'c9\'e8\'d6\'c3\'ca\'c7\'b7\'f1\'b7\'a2\'c9\'fa\'bd\'bb\'bb\'bb\'b5\'c4\'b1\'ea\'d6\'be
\f0 \
        \cf2 for \cf5 (\cf2 int \cf5 i = \cf8 array\cf5 .\cf9 length \cf5 - \cf8 1\cf5 ; i >= \cf8 0\cf5 ; i--) \{\
            \cf2 for \cf5 (\cf2 int \cf5 j = \cf8 0\cf5 ; j < i; j++) \{          \cf6 //
\f1 \'c3\'bf\'d2\'bb\'c2\'d6\'b6\'bc\'d5\'d2\'b5\'bd\'d2\'bb\'b8\'f6\'d7\'ee\'b4\'f3\'b5\'c4\'ca\'fd\'b7\'c5\'d4\'da\'d3\'d2\'b1\'df
\f0 \
                \cf2 if \cf5 (\cf8 array\cf5 [j] > \cf8 array\cf5 [j + \cf8 1\cf5 ]) \{\
                    tmp = \cf8 array\cf5 [j];\
                    \cf8 array\cf5 [j] = \cf8 array\cf5 [j + \cf8 1\cf5 ];\
                    \cf8 array\cf5 [j + \cf8 1\cf5 ] = tmp;\
                    flag = \cf2 true\cf5 ;   \cf6 //
\f1 \'b7\'a2\'c9\'fa\'c1\'cb\'bd\'bb\'bb\'bb
\f0 \
                \cf5 \}\
            \}\
            \cf2 if \cf5 (!flag) \cf2 break\cf5 ;   \cf6 //
\f1 \'d5\'e2\'d2\'bb\'c2\'d6\'d1\'ad\'bb\'b7\'c3\'bb\'d3\'d0\'b7\'a2\'c9\'fa\'bd\'bb\'bb\'bb\'a3\'ac\'cb\'b5\'c3\'f7\'c5\'c5\'d0\'f2\'d2\'d1\'be\'ad\'cd\'ea\'b3\'c9\'a3\'ac\'cd\'cb\'b3\'f6\'d1\'ad\'bb\'b7
\f0 \
        \cf5 \}\
    \}\
\
    \cf6 //    
\f1 \'d1\'a1\'d4\'f1\'c5\'c5\'d0\'f2
\f0 \
//	  
\f1 \'bb\'f9\'b1\'be\'cb\'bc\'cf\'eb\'a3\'ba\'c3\'bf\'d2\'bb\'b4\'ce\'b4\'d3\'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'fd\'be\'dd\'d4\'aa\'cb\'d8\'d6\'d0\'d1\'a1\'b3\'f6\'d7\'ee\'d0\'a1\'a3\'a8\'bb\'f2\'d7\'ee\'b4\'f3\'a3\'a9\'b5\'c4\'d2\'bb\'b8\'f6\'d4\'aa\'cb\'d8\'a3\'ac\'b4\'e6\'b7\'c5\'d4\'da\'d0\'f2\'c1\'d0\'b5\'c4\'c6\'f0\'ca\'bc\'ce\'bb\'d6\'c3\'a3\'ac\'d6\'b1\'b5\'bd\'c8\'ab\'b2\'bf\'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'fd\'be\'dd\'d4\'aa\'cb\'d8\'c5\'c5\'cd\'ea\'a1\'a3
\f0 \
//    
\f1 \'d1\'a1\'d4\'f1\'c5\'c5\'d0\'f2\'ca\'c7\'b2\'bb\'ce\'c8\'b6\'a8\'b5\'c4\'c5\'c5\'d0\'f2\'b7\'bd\'b7\'a8\'a1\'a3\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8
\f0  O(n^2)
\f1 \'a1\'a3
\f0 \
    \cf2 public static void \cf7 selectSort\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 ) \{\
        \cf2 for \cf5 (\cf2 int \cf5 i = \cf8 0\cf5 ; i < \cf8 array\cf5 .\cf9 length \cf5 - \cf8 1\cf5 ; i++) \{\
            \cf2 int \cf5 min = \cf8 array\cf5 [i];\
            \cf2 int \cf5 minindex = i;\
            \cf2 for \cf5 (\cf2 int \cf5 j = i; j < \cf8 array\cf5 .\cf9 length\cf5 ; j++) \{\
                \cf2 if \cf5 (\cf8 array\cf5 [j] < min) \{  \cf6 //
\f1 \'d1\'a1\'d4\'f1\'b5\'b1\'c7\'b0\'d7\'ee\'d0\'a1\'b5\'c4\'ca\'fd
\f0 \
                    \cf5 min = \cf8 array\cf5 [j];\
                    minindex = j;\
                \}\
            \}\
            \cf2 if \cf5 (i != minindex) \{ \cf6 //
\f1 \'c8\'f4
\f0 i
\f1 \'b2\'bb\'ca\'c7\'b5\'b1\'c7\'b0\'d4\'aa\'cb\'d8\'d7\'ee\'d0\'a1\'b5\'c4\'a3\'ac\'d4\'f2\'ba\'cd\'d5\'d2\'b5\'bd\'b5\'c4\'c4\'c7\'b8\'f6\'d4\'aa\'cb\'d8\'bd\'bb\'bb\'bb
\f0 \
                \cf8 array\cf5 [minindex] = \cf8 array\cf5 [i];\
                \cf8 array\cf5 [i] = min;\
            \}\
        \}\
    \}\
\
    \cf6 //    
\f1 \'cf\'a3\'b6\'fb\'c5\'c5\'d0\'f2
\f0 \
//	  
\f1 \'bb\'f9\'b1\'be\'cb\'bc\'cf\'eb\'a3\'ba\'cf\'c8\'c8\'a1\'d2\'bb\'b8\'f6\'d0\'a1\'d3\'da
\f0 n
\f1 \'b5\'c4\'d5\'fb\'ca\'fd
\f0 d1
\f1 \'d7\'f7\'ce\'aa\'b5\'da\'d2\'bb\'b8\'f6\'d4\'f6\'c1\'bf\'a3\'ac\'b0\'d1\'ce\'c4\'bc\'fe\'b5\'c4\'c8\'ab\'b2\'bf\'bc\'c7\'c2\'bc\'b7\'d6\'d7\'e9\'a1\'a3\'cb\'f9\'d3\'d0\'be\'e0\'c0\'eb\'ce\'aa
\f0 d1
\f1 \'b5\'c4\'b1\'b6\'ca\'fd\'b5\'c4\'bc\'c7\'c2\'bc\'b7\'c5\'d4\'da\'cd\'ac\'d2\'bb\'b8\'f6\'d7\'e9\'d6\'d0\'a1\'a3\'cf\'c8\'d4\'da\'b8\'f7\'d7\'e9\'c4\'da\'bd\'f8\'d0\'d0\'d6\'b1\'bd\'d3\'b2\'e5\'c8\'eb\'c5\'c5\'d0\'f2\'a3\'bb\'c8\'bb\'ba\'f3\'a3\'ac\'c8\'a1\'b5\'da\'b6\'fe\'b8\'f6\'d4\'f6\'c1\'bf
\f0 d2<d1
\f1 \'d6\'d8\'b8\'b4\'c9\'cf\'ca\'f6\'b5\'c4\'b7\'d6\'d7\'e9\'ba\'cd\'c5\'c5\'d0\'f2\'a3\'ac\'d6\'b1\'d6\'c1\'cb\'f9\'c8\'a1\'b5\'c4\'d4\'f6\'c1\'bf
\f0 dt=1(dt<dt-1\'85<d2<d1)
\f1 \'a3\'ac\'bc\'b4\'cb\'f9\'d3\'d0\'bc\'c7\'c2\'bc\'b7\'c5\'d4\'da\'cd\'ac\'d2\'bb\'d7\'e9\'d6\'d0\'bd\'f8\'d0\'d0\'d6\'b1\'bd\'d3\'b2\'e5\'c8\'eb\'c5\'c5\'d0\'f2\'ce\'aa\'d6\'b9\'a1\'a3
\f0 \
//    
\f1 \'d4\'da\'ca\'b9\'d3\'c3\'d4\'f6\'c1\'bf
\f0 dk
\f1 \'b5\'c4\'d2\'bb\'cc\'cb\'c5\'c5\'d0\'f2\'d6\'ae\'ba\'f3\'a3\'ac\'b6\'d4\'d3\'da\'c3\'bf\'d2\'bb\'b8\'f6
\f0 i
\f1 \'a3\'ac\'ce\'d2\'c3\'c7\'b6\'bc\'d3\'d0
\f0 a[i]<=a[i+dk],
\f1 \'bc\'b4\'cb\'f9\'d3\'d0\'cf\'e0\'b8\'f4
\f0 dk
\f1 \'b5\'c4\'d4\'aa\'cb\'d8\'b6\'bc\'b1\'bb\'c5\'c5\'d0\'f2\'a1\'a3
\f0 \
//    
\f1 \'d4\'f6\'c1\'bf\'d0\'f2\'c1\'d0\'ce\'aa
\f0 5
\f1 \'a3\'ac
\f0 3
\f1 \'a3\'ac
\f0 1
\f1 \'a3\'ac\'c3\'bf\'d2\'bb\'cc\'cb\'c5\'c5\'d0\'f2\'d6\'ae\'ba\'f3\'a3\'ac\'cf\'e0\'b8\'f4\'b6\'d4\'d3\'a6\'d4\'f6\'c1\'bf\'b5\'c4\'d4\'aa\'cb\'d8\'b6\'bc\'b1\'bb\'c5\'c5\'d0\'f2\'c1\'cb\'a1\'a3\'b5\'b1\'d4\'f6\'c1\'bf\'ce\'aa
\f0 1
\f1 \'ca\'b1\'a3\'ac\'ca\'fd\'d7\'e9\'d4\'aa\'cb\'d8\'c8\'ab\'b2\'bf\'b1\'bb\'c5\'c5\'d0\'f2\'a1\'a3
\f0 \
//    
\f1 \'cf\'a3\'b6\'fb\'c5\'c5\'d0\'f2\'b2\'bb\'ce\'c8\'b6\'a8\'a3\'ac\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8
\f0  
\f1 \'c6\'bd\'be\'f9\'ca\'b1\'bc\'e4
\f0  O(nlogn) 
\f1 \'d7\'ee\'b2\'ee\'ca\'b1\'bc\'e4
\f0 O(n^2)\
    \cf2 public static void \cf7 shellSort\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 ) \{\
        \cf2 int \cf5 j;\
        \cf2 for \cf5 (\cf2 int \cf5 gap = \cf8 array\cf5 .\cf9 length \cf5 / \cf8 2\cf5 ; gap > \cf8 0\cf5 ; gap /= \cf8 2\cf5 ) \{\
            \cf6 //
\f1 \'b6\'a8\'d2\'e5\'d2\'bb\'b8\'f6\'d4\'f6\'b3\'a4\'d0\'f2\'c1\'d0\'a3\'ac\'bc\'b4\'b7\'d6\'b8\'ee\'ca\'fd\'d7\'e9\'b5\'c4\'d4\'f6\'c1\'bf
\f0 ,d1=N/2   dk=(d(k-1))/2\
            \cf2 for \cf5 (\cf2 int \cf5 i = gap; i < \cf8 array\cf5 .\cf9 length\cf5 ; i++) \{\
                \cf2 int \cf5 tmp = \cf8 array\cf5 [i];\
                \cf2 for \cf5 (j = i; j >= gap && tmp < \cf8 array\cf5 [j - gap]; j -= gap) \{\
                    \cf6 //
\f1 \'bd\'ab\'cf\'e0\'be\'e0\'ce\'aa
\f0 Dk
\f1 \'b5\'c4\'d4\'aa\'cb\'d8\'bd\'f8\'d0\'d0\'c5\'c5\'d0\'f2
\f0 \
                    \cf8 array\cf5 [j] = \cf8 array\cf5 [j - gap];\
                \}\
                \cf8 array\cf5 [j] = tmp;\
            \}\
        \}\
    \}\
\
    \cf6 //    
\f1 \'b6\'d1\'c5\'c5\'d0\'f2
\f0 \
//    
\f1 \'b6\'fe\'b2\'e6\'b6\'d1\'ca\'c7\'cd\'ea\'c8\'ab\'b6\'fe\'d4\'aa\'ca\'f7\'a3\'a8\'b6\'fe\'b2\'e6\'ca\'f7\'a3\'a9\'bb\'f2\'d5\'df\'ca\'c7\'bd\'fc\'cb\'c6\'cd\'ea\'c8\'ab\'b6\'fe\'d4\'aa\'ca\'f7\'a3\'a8\'b6\'fe\'b2\'e6\'ca\'f7\'a3\'a9\'a1\'a3
\f0  
\f1 \'b6\'fe\'b2\'e6\'b6\'d1\'d3\'d0\'c1\'bd\'d6\'d6\'a3\'ba\'d7\'ee\'b4\'f3\'b6\'d1\'ba\'cd\'d7\'ee\'d0\'a1\'b6\'d1\'a1\'a3
\f0  
\f1 \'b4\'f3\'b8\'f9\'b6\'d1\'a3\'ba\'b8\'b8\'bd\'e1\'b5\'e3\'b5\'c4\'bc\'fc\'d6\'b5\'d7\'dc\'ca\'c7\'b4\'f3\'d3\'da\'bb\'f2\'b5\'c8\'d3\'da\'c8\'ce\'ba\'ce\'d2\'bb\'b8\'f6\'d7\'d3\'bd\'da\'b5\'e3\'b5\'c4\'bc\'fc\'d6\'b5\'a3\'bb
\f0  
\f1 \'d0\'a1\'b8\'f9\'b6\'d1\'a3\'ba\'b8\'b8\'bd\'e1\'b5\'e3\'b5\'c4\'bc\'fc\'d6\'b5\'d7\'dc\'ca\'c7\'d0\'a1\'d3\'da\'bb\'f2\'b5\'c8\'d3\'da\'c8\'ce\'ba\'ce\'d2\'bb\'b8\'f6\'d7\'d3\'bd\'da\'b5\'e3\'b5\'c4\'bc\'fc\'d6\'b5\'a1\'a3
\f0  
\f1 \'b6\'fe\'b2\'e6\'b6\'d1\'d2\'bb\'b0\'e3\'d3\'c3\'ca\'fd\'d7\'e9\'c0\'b4\'b1\'ed\'ca\'be\'a1\'a3\'c0\'fd\'c8\'e7\'a3\'ac\'b8\'f9\'bd\'da\'b5\'e3\'d4\'da\'ca\'fd\'d7\'e9\'d6\'d0\'b5\'c4\'ce\'bb\'d6\'c3\'ca\'c7
\f0 0
\f1 \'a3\'ac\'b5\'da
\f0 n
\f1 \'b8\'f6\'ce\'bb\'d6\'c3\'b5\'c4\'d7\'d3\'bd\'da\'b5\'e3\'b7\'d6\'b1\'f0\'d4\'da
\f0 2n+1
\f1 \'ba\'cd
\f0  2n+2
\f1 \'a1\'a3\'d2\'f2\'b4\'cb\'a3\'ac\'b5\'da
\f0 0
\f1 \'b8\'f6\'ce\'bb\'d6\'c3\'b5\'c4\'d7\'d3\'bd\'da\'b5\'e3\'d4\'da
\f0 1
\f1 \'ba\'cd
\f0 2
\f1 \'a3\'ac
\f0 1
\f1 \'b5\'c4\'d7\'d3\'bd\'da\'b5\'e3\'d4\'da
\f0 3
\f1 \'ba\'cd
\f0 4
\f1 \'a1\'a3\'d2\'d4\'b4\'cb\'c0\'e0\'cd\'c6\'a1\'a3\'d5\'e2\'d6\'d6\'b4\'e6\'b4\'a2\'b7\'bd\'ca\'bd\'b1\'e3\'ec\'b6\'d1\'b0\'d5\'d2\'b8\'b8\'bd\'da\'b5\'e3\'ba\'cd\'d7\'d3\'bd\'da\'b5\'e3\'a1\'a3
\f0  
\f1 \'c0\'fd\'c8\'e7\'b3\'f5\'ca\'bc\'d2\'aa\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'fd\'d7\'e9\'ce\'aa\'a3\'ba
\f0 49, 38, 65, 97, 76, 13, 27, 49 
\f1 \'b9\'b9\'d4\'ec\'b3\'c9\'b4\'f3\'b8\'f9\'b6\'d1\'d6\'ae\'ba\'f3\'b5\'c4\'ca\'fd\'d7\'e9\'ce\'aa\'a3\'ba
\f0 97 76 65 49 49 13 27 38\
//    
\f1 \'b6\'d1\'c5\'c5\'d0\'f2\'bb\'f9\'b1\'be\'cb\'bc\'cf\'eb\'a3\'ba\'d4\'da\'c5\'c5\'d0\'f2\'b9\'fd\'b3\'cc\'d6\'d0\'a3\'ac\'bd\'ab
\f0 R[l..n]
\f1 \'bf\'b4\'b3\'c9\'ca\'c7\'d2\'bb\'bf\'c3\'cd\'ea\'c8\'ab\'b6\'fe\'b2\'e6\'ca\'f7\'b5\'c4\'cb\'b3\'d0\'f2\'b4\'e6\'b4\'a2\'bd\'e1\'b9\'b9\'a3\'ac\'c0\'fb\'d3\'c3\'cd\'ea\'c8\'ab\'b6\'fe\'b2\'e6\'ca\'f7\'d6\'d0\'cb\'ab\'c7\'d7\'bd\'e1\'b5\'e3\'ba\'cd\'ba\'a2\'d7\'d3\'bd\'e1\'b5\'e3\'d6\'ae\'bc\'e4\'b5\'c4\'c4\'da\'d4\'da\'b9\'d8\'cf\'b5\'a1\'be\'b2\'ce\'bc\'fb\'b6\'fe\'b2\'e6\'ca\'f7\'b5\'c4\'cb\'b3\'d0\'f2\'b4\'e6\'b4\'a2\'bd\'e1\'b9\'b9\'a1\'bf\'a3\'ac\'d4\'da\'b5\'b1\'c7\'b0\'ce\'de\'d0\'f2\'c7\'f8\'d6\'d0\'d1\'a1\'d4\'f1\'b9\'d8\'bc\'fc\'d7\'d6\'d7\'ee\'b4\'f3
\f0 (
\f1 \'bb\'f2\'d7\'ee\'d0\'a1
\f0 )
\f1 \'b5\'c4\'bc\'c7\'c2\'bc\'a1\'a3\'b6\'d1\'c5\'c5\'d0\'f2\'c0\'fb\'d3\'c3\'c1\'cb\'b4\'f3\'b8\'f9\'b6\'d1
\f0 (
\f1 \'bb\'f2\'d0\'a1\'b8\'f9\'b6\'d1
\f0 )
\f1 \'b6\'d1\'b6\'a5\'bc\'c7\'c2\'bc\'b5\'c4\'b9\'d8\'bc\'fc\'d7\'d6\'d7\'ee\'b4\'f3
\f0 (
\f1 \'bb\'f2\'d7\'ee\'d0\'a1
\f0 )
\f1 \'d5\'e2\'d2\'bb\'cc\'d8\'d5\'f7\'a3\'ac\'ca\'b9\'b5\'c3\'d4\'da\'b5\'b1\'c7\'b0\'ce\'de\'d0\'f2\'c7\'f8\'d6\'d0\'d1\'a1\'c8\'a1\'d7\'ee\'b4\'f3
\f0 (
\f1 \'bb\'f2\'d7\'ee\'d0\'a1
\f0 )
\f1 \'b9\'d8\'bc\'fc\'d7\'d6\'b5\'c4\'bc\'c7\'c2\'bc\'b1\'e4\'b5\'c3\'bc\'f2\'b5\'a5\'a1\'a3
\f0 \uc0\u8232 \
//    
\f1 \'b6\'d1\'c5\'c5\'d0\'f2\'ca\'c7\'d2\'bb\'d6\'d6\'d1\'a1\'d4\'f1\'c5\'c5\'d0\'f2
\f0 ,
\f1 \'c6\'e4\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ce\'aa
\f0 O(nlogn)
\f1 \'a1\'a3\'b6\'d1\'c5\'c5\'d0\'f2\'ca\'c7\'b2\'bb\'ce\'c8\'b6\'a8\'b5\'c4
\f0 \uc0\u8232 \
    /*\
     * 
\f1 \'b6\'d1\'c5\'c5\'d0\'f2
\f0 \
     * 
\f1 \'b5\'f7\'d5\'fb\'d7\'ee\'b4\'f3\'b6\'d1\'a3\'ac\'bd\'bb\'bb\'bb\'b8\'f9\'d4\'aa\'cb\'d8\'ba\'cd\'d7\'ee\'ba\'f3\'d2\'bb\'b8\'f6\'d4\'aa\'cb\'d8\'a1\'a3
\f0 \
     * 
\f1 \'b2\'ce\'ca\'fd\'cb\'b5\'c3\'f7\'a3\'ba
\f0 \
     *     a -- 
\f1 \'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'fd\'d7\'e9
\f0 \
     */\
    \cf2 public static void \cf7 heapSort\cf5 (\cf2 int\cf5 [] \cf8 a\cf5 ) \{\
        \cf2 int \cf5 n = \cf8 a\cf5 .\cf9 length\cf5 ;\
        \cf2 int \cf5 i, tmp;\
        \cf6 // 
\f1 \'b4\'d3
\f0 (n/2-1) --> 0
\f1 \'d6\'f0\'b4\'ce\'b1\'e9\'c0\'fa\'a1\'a3\'b1\'e9\'c0\'fa\'d6\'ae\'ba\'f3\'a3\'ac\'b5\'c3\'b5\'bd\'b5\'c4\'ca\'fd\'d7\'e9\'ca\'b5\'bc\'ca\'c9\'cf\'ca\'c7\'d2\'bb\'b8\'f6
\f0 (
\f1 \'d7\'ee\'b4\'f3
\f0 )
\f1 \'b6\'fe\'b2\'e6\'b6\'d1\'a1\'a3
\f0 \
        \cf2 for \cf5 (i = n / \cf8 2 \cf5 - \cf8 1\cf5 ; i >= \cf8 0\cf5 ; i--)\
            \cf7 maxHeapDown\cf5 (\cf8 a\cf5 , i, n - \cf8 1\cf5 );\
        \cf6 // 
\f1 \'b4\'d3\'d7\'ee\'ba\'f3\'d2\'bb\'b8\'f6\'d4\'aa\'cb\'d8\'bf\'aa\'ca\'bc\'b6\'d4\'d0\'f2\'c1\'d0\'bd\'f8\'d0\'d0\'b5\'f7\'d5\'fb\'a3\'ac\'b2\'bb\'b6\'cf\'b5\'c4\'cb\'f5\'d0\'a1\'b5\'f7\'d5\'fb\'b5\'c4\'b7\'b6\'ce\'a7\'d6\'b1\'b5\'bd\'b5\'da\'d2\'bb\'b8\'f6\'d4\'aa\'cb\'d8
\f0 \
        \cf2 for \cf5 (i = n - \cf8 1\cf5 ; i > \cf8 0\cf5 ; i--) \{\
            \cf6 // 
\f1 \'bd\'bb\'bb\'bb
\f0 a[0]
\f1 \'ba\'cd
\f0 a[i]
\f1 \'a1\'a3\'bd\'bb\'bb\'bb\'ba\'f3\'a3\'ac
\f0 a[i]
\f1 \'ca\'c7
\f0 a[0...i]
\f1 \'d6\'d0\'d7\'ee\'b4\'f3\'b5\'c4\'a1\'a3
\f0 \
            \cf5 tmp = \cf8 a\cf5 [\cf8 0\cf5 ];\
            \cf8 a\cf5 [\cf8 0\cf5 ] = \cf8 a\cf5 [i];\
            \cf8 a\cf5 [i] = tmp;\
            \cf6 // 
\f1 \'b5\'f7\'d5\'fb
\f0 a[0...i-1]
\f1 \'a3\'ac\'ca\'b9\'b5\'c3
\f0 a[0...i-1]
\f1 \'c8\'d4\'c8\'bb\'ca\'c7\'d2\'bb\'b8\'f6\'d7\'ee\'b4\'f3\'b6\'d1\'a1\'a3
\f0 \
            // 
\f1 \'bc\'b4\'a3\'ac\'b1\'a3\'d6\'a4
\f0 a[i-1]
\f1 \'ca\'c7
\f0 a[0...i-1]
\f1 \'d6\'d0\'b5\'c4\'d7\'ee\'b4\'f3\'d6\'b5\'a1\'a3
\f0 \
            \cf7 maxHeapDown\cf5 (\cf8 a\cf5 , \cf8 0\cf5 , i - \cf8 1\cf5 );\
        \}\
    \}\
\
    \cf6 /*\
     * 
\f1 \'d7\'a2\'a3\'ba\'ca\'fd\'d7\'e9\'ca\'b5\'cf\'d6\'b5\'c4\'b6\'d1\'d6\'d0\'a3\'ac\'b5\'da
\f0 N
\f1 \'b8\'f6\'bd\'da\'b5\'e3\'b5\'c4\'d7\'f3\'ba\'a2\'d7\'d3\'b5\'c4\'cb\'f7\'d2\'fd\'d6\'b5\'ca\'c7
\f0 (2N+1)
\f1 \'a3\'ac\'d3\'d2\'ba\'a2\'d7\'d3\'b5\'c4\'cb\'f7\'d2\'fd\'ca\'c7
\f0 (2N+2)
\f1 \'a1\'a3
\f0 \
     *     
\f1 \'c6\'e4\'d6\'d0\'a3\'ac
\f0 N
\f1 \'ce\'aa\'ca\'fd\'d7\'e9\'cf\'c2\'b1\'ea\'cb\'f7\'d2\'fd\'d6\'b5\'a3\'ac\'c8\'e7\'ca\'fd\'d7\'e9\'d6\'d0\'b5\'da
\f0 1
\f1 \'b8\'f6\'ca\'fd\'b6\'d4\'d3\'a6\'b5\'c4
\f0 N
\f1 \'ce\'aa
\f0 0
\f1 \'a1\'a3
\f0 \
     *\
     * 
\f1 \'b2\'ce\'ca\'fd\'cb\'b5\'c3\'f7\'a3\'ba
\f0 \
     *     a -- 
\f1 \'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'fd\'d7\'e9
\f0 \
     *     start -- 
\f1 \'b1\'bb\'cf\'c2\'b5\'f7\'bd\'da\'b5\'e3\'b5\'c4\'c6\'f0\'ca\'bc\'ce\'bb\'d6\'c3
\f0 (
\f1 \'d2\'bb\'b0\'e3\'ce\'aa
\f0 0
\f1 \'a3\'ac\'b1\'ed\'ca\'be\'b4\'d3\'b5\'da
\f0 1
\f1 \'b8\'f6\'bf\'aa\'ca\'bc
\f0 )\
     *     end   -- 
\f1 \'bd\'d8\'d6\'c1\'b7\'b6\'ce\'a7
\f0 (
\f1 \'d2\'bb\'b0\'e3\'ce\'aa\'ca\'fd\'d7\'e9\'d6\'d0\'d7\'ee\'ba\'f3\'d2\'bb\'b8\'f6\'d4\'aa\'cb\'d8\'b5\'c4\'cb\'f7\'d2\'fd
\f0 )\
     */\
    \cf2 public static void \cf7 maxHeapDown\cf5 (\cf2 int\cf5 [] \cf8 a\cf5 , \cf2 int \cf8 start\cf5 , \cf2 int \cf8 end\cf5 ) \{\
        \cf2 int \cf5 c = \cf8 start\cf5 ;            \cf6 // 
\f1 \'b5\'b1\'c7\'b0
\f0 (current)
\f1 \'bd\'da\'b5\'e3\'b5\'c4\'ce\'bb\'d6\'c3
\f0 \
        \cf2 int \cf5 l = \cf8 2 \cf5 * c + \cf8 1\cf5 ;        \cf6 // 
\f1 \'d7\'f3
\f0 (left)
\f1 \'ba\'a2\'d7\'d3\'b5\'c4\'ce\'bb\'d6\'c3
\f0 \
        \cf2 int \cf5 tmp = \cf8 a\cf5 [c];            \cf6 // 
\f1 \'b5\'b1\'c7\'b0
\f0 (current)
\f1 \'bd\'da\'b5\'e3\'b5\'c4\'b4\'f3\'d0\'a1
\f0 \
        \cf2 for \cf5 (; l <= \cf8 end\cf5 ; c = l, l = \cf8 2 \cf5 * l + \cf8 1\cf5 ) \{\
            \cf6 // "l"
\f1 \'ca\'c7\'d7\'f3\'ba\'a2\'d7\'d3\'a3\'ac
\f0 "l+1"
\f1 \'ca\'c7\'d3\'d2\'ba\'a2\'d7\'d3
\f0 \
            \cf2 if \cf5 (l < \cf8 end \cf5 && \cf8 a\cf5 [l] < \cf8 a\cf5 [l + \cf8 1\cf5 ])\
                l++;        \cf6 // 
\f1 \'d7\'f3\'d3\'d2\'c1\'bd\'ba\'a2\'d7\'d3\'d6\'d0\'d1\'a1\'d4\'f1\'bd\'cf\'b4\'f3\'d5\'df\'a3\'ac\'bc\'b4
\f0 m_heap[l+1]\
            \cf2 if \cf5 (tmp >= \cf8 a\cf5 [l])\
                \cf2 break\cf5 ;        \cf6 // 
\f1 \'b5\'f7\'d5\'fb\'bd\'e1\'ca\'f8
\f0 \
            \cf2 else \cf5 \{            \cf6 // 
\f1 \'bd\'bb\'bb\'bb\'d6\'b5
\f0 \
                \cf8 a\cf5 [c] = \cf8 a\cf5 [l];\
                \cf8 a\cf5 [l] = tmp;\
            \}\
        \}\
    \}\
\cf6 //    
\f1 \'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2
\f0 \
//	  
\f1 \'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'b5\'c4\'d4\'ad\'c0\'ed
\f0 \
//	  
\f1 \'bd\'ab\'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'fd\'d7\'e9\'b7\'d6\'b3\'c9\'c7\'b0\'ba\'f3\'c1\'bd\'b8\'f6\'b2\'bf\'b7\'d6\'a3\'ac\'d4\'d9\'b5\'dd\'b9\'e9\'b5\'c4\'bd\'ab\'c7\'b0\'b0\'eb\'b2\'bf\'b7\'d6\'ca\'fd\'be\'dd\'ba\'cd\'ba\'f3\'b0\'eb\'b2\'bf\'b7\'d6\'b5\'c4\'ca\'fd\'be\'dd\'b8\'f7\'d7\'d4\'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'a3\'ac\'b5\'c3\'b5\'bd\'b5\'c4\'c1\'bd\'b2\'bf\'b7\'d6\'ca\'fd\'be\'dd\'a3\'ac\'c8\'bb\'ba\'f3\'ca\'b9\'d3\'c3
\f0 merge
\f1 \'ba\'cf\'b2\'a2\'cb\'e3\'b7\'a8\'a3\'a8\'cb\'e3\'b7\'a8\'bc\'fb\'b4\'fa\'c2\'eb\'a3\'a9\'bd\'ab\'c1\'bd\'b2\'bf\'b7\'d6\'cb\'e3\'b7\'a8\'ba\'cf\'b2\'a2\'b5\'bd\'d2\'bb\'c6\'f0\'a1\'a3
\f0  
\f1 \'c0\'fd\'c8\'e7\'a3\'ba\'c8\'e7\'b9\'fb
\f0 N=1
\f1 \'a3\'bb\'c4\'c7\'c3\'b4\'d6\'bb\'d3\'d0\'d2\'bb\'b8\'f6\'ca\'fd\'be\'dd\'d2\'aa\'c5\'c5\'d0\'f2\'a3\'ac
\f0 N=2
\f1 \'a3\'ac\'d6\'bb\'d0\'e8\'d2\'aa\'b5\'f7\'d3\'c3
\f0 merge
\f1 \'ba\'af\'ca\'fd\'bd\'ab\'c7\'b0\'ba\'f3\'ba\'cf\'b2\'a2\'a3\'ac
\f0 N=4
\f1 \'a3\'ac
\f0 ........... 
\f1 \'d2\'b2\'be\'cd\'ca\'c7\'bd\'ab\'d2\'bb\'b8\'f6\'ba\'dc\'b6\'e0\'ca\'fd\'be\'dd\'b5\'c4\'ca\'fd\'d7\'e9\'b7\'d6\'b3\'c9\'c7\'b0\'ba\'f3\'c1\'bd\'b2\'bf\'b7\'d6\'a3\'ac\'c8\'bb\'ba\'f3\'b2\'bb\'b6\'cf\'b5\'dd\'b9\'e9\'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'a3\'ac\'d4\'d9\'ba\'cf\'b2\'a2\'a3\'ac\'d7\'ee\'ba\'f3\'b7\'b5\'bb\'d8\'d3\'d0\'d0\'f2\'b5\'c4\'ca\'fd\'d7\'e9\'a1\'a3
\f0 \uc0\u8232 \
//    
\f1 \'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'b5\'c4\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8
\f0 \uc0\u8232 \
//    
\f1 \'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'b5\'c4\'d7\'ee\'ba\'c3\'a1\'a2\'d7\'ee\'bb\'b5\'ba\'cd\'c6\'bd\'be\'f9\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'b6\'bc\'ca\'c7
\f0 O(nlogn)
\f1 \'a3\'ac\'b6\'f8\'bf\'d5\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ca\'c7
\f0 O(n)
\f1 \'a3\'ac\'b1\'c8\'bd\'cf\'b4\'ce\'ca\'fd\'bd\'e9\'d3\'da
\f0 (nlogn)/2
\f1 \'ba\'cd
\f0 (nlogn)-n+1
\f1 \'a3\'ac\'b8\'b3\'d6\'b5\'b2\'d9\'d7\'f7\'b5\'c4\'b4\'ce\'ca\'fd\'ca\'c7
\f0 (2nlogn)
\f1 \'a1\'a3\'d2\'f2\'b4\'cb\'bf\'c9\'d2\'d4\'bf\'b4\'b3\'f6\'a3\'ac\'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'cb\'e3\'b7\'a8\'b1\'c8\'bd\'cf\'d5\'bc\'d3\'c3\'c4\'da\'b4\'e6\'a3\'ac\'b5\'ab\'c8\'b4\'ca\'c7\'d0\'a7\'c2\'ca\'b8\'df\'c7\'d2\'ce\'c8\'b6\'a8\'b5\'c4\'c5\'c5\'d0\'f2\'cb\'e3\'b7\'a8\'a1\'a3
\f0 \uc0\u8232 \
\
    \cf2 private static void \cf7 mergeSort\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 , \cf2 int\cf5 [] \cf8 tmp\cf5 , \cf2 int \cf8 left\cf5 , \cf2 int \cf8 right\cf5 ) \{\
        \cf2 if \cf5 (\cf8 left \cf5 < \cf8 right\cf5 ) \{\
            \cf2 int \cf5 center = (\cf8 left \cf5 + \cf8 right\cf5 ) / \cf8 2\cf5 ;\cf6 //
\f1 \'c8\'a1\'ca\'fd\'d7\'e9\'b5\'c4\'d6\'d0\'b5\'e3
\f0 \
            \cf7 mergeSort\cf5 (\cf8 array\cf5 , \cf8 tmp\cf5 , \cf8 left\cf5 , center);\cf6 //
\f1 \'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'ca\'fd\'d7\'e9\'b5\'c4\'c7\'b0\'b0\'eb\'b2\'bf\'b7\'d6
\f0 \
            \cf7 mergeSort\cf5 (\cf8 array\cf5 , \cf8 tmp\cf5 , center + \cf8 1\cf5 , \cf8 right\cf5 );\cf6 //
\f1 \'b9\'e9\'b2\'a2\'c5\'c5\'d0\'f2\'ca\'fd\'d7\'e9\'b5\'c4\'ba\'f3\'b0\'eb\'b2\'bf\'b7\'d6
\f0 \
            \cf7 merge\cf5 (\cf8 array\cf5 , \cf8 tmp\cf5 , \cf8 left\cf5 , center + \cf8 1\cf5 , \cf8 right\cf5 );\cf6 //
\f1 \'bd\'ab\'ca\'fd\'d7\'e9\'b5\'c4\'c7\'b0\'ba\'f3\'b0\'eb\'b2\'bf\'b7\'d6\'ba\'cf\'b2\'a2
\f0 \
        \cf5 \}\
    \}\
\
    \cf6 /*\
     * 
\f1 \'b3\'ac\'bc\'f2\'b5\'a5\'b5\'c4\'ba\'cf\'b2\'a2\'ba\'af\'ca\'fd
\f0 \
     */\
    \cf2 private static void \cf7 merge\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 , \cf2 int\cf5 [] \cf8 tmp\cf5 , \cf2 int \cf8 leftPos\cf5 , \cf2 int \cf8 rightPos\cf5 , \cf2 int \cf8 rightEnd\cf5 ) \{\
        \cf6 // \cf10 TODO Auto-generated method stub\
        \cf2 int \cf5 leftEnd = \cf8 rightPos \cf5 - \cf8 1\cf5 ;\
        \cf2 int \cf5 tmpPos = \cf8 leftPos\cf5 ;\
        \cf2 int \cf5 numElements = \cf8 rightEnd \cf5 - \cf8 leftPos \cf5 + \cf8 1\cf5 ;\
        \cf2 while \cf5 (\cf8 leftPos \cf5 <= leftEnd && \cf8 rightPos \cf5 <= \cf8 rightEnd\cf5 ) \{\
            \cf2 if \cf5 (\cf8 array\cf5 [\cf8 leftPos\cf5 ] <= \cf8 array\cf5 [\cf8 rightPos\cf5 ]) \{\
                \cf8 tmp\cf5 [tmpPos++] = \cf8 array\cf5 [\cf8 leftPos\cf5 ++];\
            \} \cf2 else \cf5 \{\
                \cf8 tmp\cf5 [tmpPos++] = \cf8 array\cf5 [\cf8 rightPos\cf5 ++];\
            \}\
        \}\
        \cf2 while \cf5 (\cf8 leftPos \cf5 <= leftEnd) \{\
            \cf8 tmp\cf5 [tmpPos++] = \cf8 array\cf5 [\cf8 leftPos\cf5 ++];\
        \}\
        \cf2 while \cf5 (\cf8 rightPos \cf5 <= \cf8 rightEnd\cf5 ) \{\
            \cf8 tmp\cf5 [tmpPos++] = \cf8 array\cf5 [\cf8 rightPos\cf5 ++];\
        \}\
        \cf2 for \cf5 (\cf2 int \cf5 i = \cf8 0\cf5 ; i < numElements; i++, \cf8 rightEnd\cf5 --) \{\
            \cf8 array\cf5 [\cf8 rightEnd\cf5 ] = \cf8 tmp\cf5 [\cf8 rightEnd\cf5 ];\
        \}\
    \}\
\
    \cf2 public static void \cf7 mergeSort\cf5 (\cf2 int\cf5 [] \cf8 array\cf5 ) \{\
        \cf2 int\cf5 [] tmp = \cf2 new int\cf5 [\cf8 array\cf5 .\cf9 length\cf5 ];\cf6 //
\f1 \'c9\'f9\'c3\'f7\'d2\'bb\'b8\'f6\'d3\'c3\'c0\'b4\'ba\'cf\'b2\'a2\'b5\'c4\'ca\'fd\'d7\'e9
\f0 \
        \cf7 mergeSort\cf5 (\cf8 array\cf5 , tmp, \cf8 0\cf5 , \cf8 array\cf5 .\cf9 length \cf5 - \cf8 1\cf5 );\cf6 //
\f1 \'b5\'f7\'d3\'c3\'c5\'c5\'d0\'f2\'ba\'af\'ca\'fd\'a3\'ac\'b4\'ab\'c8\'eb\'ca\'fd\'d7\'d6\'b5\'c4\'c6\'f0\'b5\'e3\'ba\'cd\'d6\'d5\'b5\'e3
\f0 \
    \cf5 \}\
\
    \cf6 //	\'95	
\f1 \'bf\'ec\'cb\'d9\'c5\'c5\'d0\'f2\'d4\'ad\'c0\'ed\'a3\'ba
\f0 \
    //	\'95	
\f1 \'c8\'e7\'b9\'fb\'ca\'fd\'d7\'e9
\f0 S
\f1 \'d6\'d0\'d4\'aa\'cb\'d8\'ca\'c7
\f0 0
\f1 \'bb\'f2\'d5\'df
\f0 1
\f1 \'a3\'ac\'d4\'f2\'b7\'b5\'bb\'d8\'a3\'bb
\f0 \
    //	\'95	
\f1 \'c7\'f8\'ca\'fd\'d7\'e9
\f0 S
\f1 \'d6\'d0\'c8\'ce\'d2\'bb\'d4\'aa\'cb\'d8
\f0 v
\f1 \'a3\'ac\'b3\'c6\'d6\'ae\'ce\'aa\'ca\'e0\'c5\'a6\'d4\'aa\'a3\'bb
\f0 \
    //	\'95	
\f1 \'bd\'ab
\f0 S-\{v\}
\f1 \'a3\'a8
\f0 S
\f1 \'d6\'d0\'ca\'a3\'d3\'e0\'b5\'c4\'d4\'aa\'cb\'d8\'a3\'a9\'bb\'ae\'b7\'d6\'b3\'c9\'c1\'ac\'b8\'f6\'b2\'bb\'cf\'e0\'bd\'bb\'b5\'c4\'bc\'af\'ba\'cf\'a3\'ba
\f0 S1=\{S-\{v\}|x<=v\}
\f1 \'ba\'cd
\f0 S2=\{S-\{v\}|x>=v\};\
    //	\'95	
\f1 \'b7\'b5\'bb\'d8
\f0 \{quicksort(s1)\}
\f1 \'ba\'f3\'b8\'fa
\f0 v
\f1 \'a3\'ac\'bc\'cc\'b6\'f8\'b7\'b5\'bb\'d8
\f0 \{quicksort(S2)\}
\f1 \'a1\'a3
\f0 \
    //	\'95	
\f1 \'d1\'a1\'c8\'a1\'ca\'e0\'c5\'a6\'d4\'aa\'a3\'a8\'c8\'fd\'ca\'fd\'d6\'d0\'d6\'b5\'b7\'d6\'b8\'ee\'b7\'a8\'a3\'a9
\f0 \uc0\u8232 \
    //	\'95	
\f1 \'d2\'bb\'b0\'e3\'b5\'c4\'d7\'f6\'b7\'a8\'ca\'c7\'ca\'b9\'d3\'c3\'d7\'f3\'b6\'cb\'a1\'a2\'d3\'d2\'b6\'cb\'ba\'cd\'d6\'d0\'d0\'c4\'ce\'bb\'d6\'c3\'c9\'cf\'b5\'c4\'c8\'fd\'b8\'f6\'d4\'aa\'cb\'d8\'b5\'c4\'d6\'d0\'d6\'b5\'d7\'f7\'ce\'aa\'bb\'f9\'d4\'aa\'a1\'a3
\f0  
\f1 \'b7\'d6\'b8\'ee\'b2\'df\'c2\'d4\'a3\'ba
\f0  
\f1 \'d4\'da\'b7\'d6\'b8\'ee\'bd\'d7\'b6\'ce\'b0\'c9\'cb\'f9\'d3\'d0\'d0\'a1\'d4\'aa\'cb\'d8\'d2\'c6\'b5\'bd\'ca\'fd\'d7\'e9\'b5\'c4\'d7\'f3\'b1\'df\'a3\'ac\'b4\'f3\'d4\'aa\'cb\'d8\'d2\'c6\'b5\'bd\'ca\'fd\'d7\'e9\'d3\'d2\'b1\'df\'a1\'a3\'a3\'ac\'b4\'f3\'d0\'a1\'ca\'c7\'cf\'e0\'b6\'d4\'d3\'da\'ca\'e0\'c5\'a6\'d4\'aa\'cb\'d8\'b6\'f8\'d1\'d4\'b5\'c4\'a1\'a3
\f0  
\f1 \'b5\'b1
\f0 i
\f1 \'d4\'da
\f0 j
\f1 \'b5\'c4\'d7\'f3\'b1\'df\'ca\'b1\'a3\'ac\'bd\'ab
\f0 i
\f1 \'d3\'d2\'d2\'c6\'a3\'ac\'d2\'c6\'b9\'fd\'c4\'c4\'d0\'a9\'d0\'a1\'d3\'da\'ca\'e0\'c5\'a6\'d4\'aa\'b5\'c4\'d4\'aa\'cb\'d8\'a3\'ac\'b2\'a2\'bd\'ab
\f0 j
\f1 \'d7\'f3\'d2\'c6\'a3\'ac\'d2\'d1\'b9\'fd\'c4\'c7\'d0\'a9\'b4\'f3\'d3\'da\'ca\'e0\'c5\'a6\'d4\'aa\'b5\'c4\'d4\'aa\'cb\'d8\'a3\'ac\'b5\'b1
\f0 i
\f1 \'ba\'cd
\f0 j
\f1 \'cd\'a3\'d6\'b9\'ca\'b1\'a3\'ac
\f0 i
\f1 \'d6\'b8\'cf\'f2\'d2\'bb\'b8\'f6\'b4\'f3\'d4\'aa\'cb\'d8\'a3\'ac\'b6\'f8
\f0 j
\f1 \'d6\'b8\'cf\'f2\'d2\'bb\'b8\'f6\'d0\'a1\'d4\'aa\'cb\'d8\'a3\'ac\'c8\'e7\'b9\'fb
\f0 i
\f1 \'d4\'da
\f0 j
\f1 \'b5\'c4\'d7\'f3\'b1\'df\'a3\'ac\'c4\'c7\'c3\'b4\'bd\'ab\'d5\'e2\'c1\'bd\'b8\'f6\'d4\'aa\'cb\'d8\'bd\'bb\'bb\'bb\'a3\'ac\'c6\'e4\'d0\'a7\'b9\'fb\'ca\'c7\'b0\'d1\'d2\'bb\'b8\'f6\'b4\'f3\'d4\'aa\'cb\'d8\'cd\'c6\'cf\'f2\'d3\'d2\'b1\'df\'a3\'ac\'b6\'f8\'b0\'d1\'d0\'a1\'d4\'aa\'cb\'d8\'cd\'c6\'cf\'f2\'d7\'f3\'b1\'df\'a1\'a3\'d0\'a7\'b9\'fb\'c8\'e7\'cd\'bc\'a3\'ba
\f0 \uc0\u8232 \
    //	\'95	
\f1 \'bf\'ec\'cb\'d9\'c5\'c5\'d0\'f2\'c6\'bd\'be\'f9\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ce\'aa
\f0 O(nlogn)
\f1 \'a3\'ac\'d7\'ee\'bb\'b5\'c7\'e9\'bf\'f6\'ce\'aa
\f0 O(n^2)
\f1 \'a3\'ac
\f0 n
\f1 \'d4\'bd\'b4\'f3\'a3\'ac\'cb\'d9\'b6\'c8\'d4\'bd\'bf\'ec\'a1\'a3\'b2\'bb\'ca\'c7\'ce\'c8\'b6\'a8\'b5\'c4\'c5\'c5\'d0\'f2\'cb\'e3\'b7\'a8\'a1\'a3
\f0 \
    /*\
     * 
\f1 \'bf\'ec\'cb\'d9\'c5\'c5\'d0\'f2
\f0 \
     * 
\f1 \'c1\'bd\'b8\'f6\'b7\'bd\'cf\'f2\'a3\'ac\'d7\'f3\'b1\'df\'b5\'c4
\f0 i
\f1 \'cf\'c2\'b1\'ea\'d2\'bb\'d6\'b1\'cd\'f9\'d3\'d2\'d7\'df\'a3\'ac\'b5\'b1
\f0 a[i] <= a[center_index]
\f1 \'a3\'ac
\f0 \
     * 
\f1 \'c6\'e4\'d6\'d0
\f0 center_index
\f1 \'ca\'c7\'d6\'d0\'ca\'e0\'d4\'aa\'cb\'d8\'b5\'c4\'ca\'fd\'d7\'e9\'cf\'c2\'b1\'ea\'a3\'ac\'b6\'f8\'d3\'d2\'b1\'df\'b5\'c4
\f0 j
\f1 \'cf\'c2\'b1\'ea\'d2\'bb\'d6\'b1\'cd\'f9\'d7\'f3\'d7\'df\'a3\'ac\'b5\'b1
\f0 a[j] > a[center_index]\
     * 
\f1 \'c8\'e7\'b9\'fb
\f0 i
\f1 \'ba\'cd
\f0 j
\f1 \'b6\'bc\'d7\'df\'b2\'bb\'b6\'af\'c1\'cb\'a3\'ac
\f0 i <= j, 
\f1 \'bd\'bb\'bb\'bb
\f0 a[i]
\f1 \'ba\'cd
\f0 a[j],
\f1 \'d6\'d8\'b8\'b4\'c9\'cf\'c3\'e6\'b5\'c4\'b9\'fd\'b3\'cc\'a3\'ac\'d6\'b1\'b5\'bd
\f0 i>j\
     * 
\f1 \'bd\'bb\'bb\'bb
\f0 a[j]
\f1 \'ba\'cd
\f0 a[center_index]
\f1 \'a3\'ac\'cd\'ea\'b3\'c9\'d2\'bb\'cc\'cb\'bf\'ec\'cb\'d9\'c5\'c5\'d0\'f2
\f0 \
     * 
\f1 \'ca\'e0\'d6\'e1\'b2\'c9\'d3\'c3\'c8\'fd\'ca\'fd\'d6\'d0\'d6\'b5\'b7\'d6\'b8\'ee\'b7\'a8\'bf\'c9\'d2\'d4\'d3\'c5\'bb\'af
\f0 \
     */\
    //
\f1 \'b5\'dd\'b9\'e9\'bf\'ec\'cb\'d9\'c5\'c5\'d0\'f2
\f0 \
    \cf2 public static void \cf7 quickSort\cf5 (\cf2 int \cf8 a\cf5 []) \{\
        \cf7 qSort\cf5 (\cf8 a\cf5 , \cf8 0\cf5 , \cf8 a\cf5 .\cf9 length \cf5 - \cf8 1\cf5 );\
    \}\
\
    \cf6 //
\f1 \'b5\'dd\'b9\'e9\'c5\'c5\'d0\'f2\'a3\'ac\'c0\'fb\'d3\'c3\'c1\'bd\'c2\'b7\'bb\'ae\'b7\'d6
\f0 \
    \cf2 public static void \cf7 qSort\cf5 (\cf2 int \cf8 a\cf5 [], \cf2 int \cf8 low\cf5 , \cf2 int \cf8 high\cf5 ) \{\
        \cf2 int \cf5 pivot = \cf8 0\cf5 ;\
        \cf2 if \cf5 (\cf8 low \cf5 < \cf8 high\cf5 ) \{\
            \cf6 //
\f1 \'bd\'ab\'ca\'fd\'d7\'e9\'d2\'bb\'b7\'d6\'ce\'aa\'b6\'fe
\f0 \
            \cf5 pivot = \cf7 partition\cf5 (\cf8 a\cf5 , \cf8 low\cf5 , \cf8 high\cf5 );\
            \cf6 //
\f1 \'b6\'d4\'b5\'da\'d2\'bb\'b2\'bf\'b7\'d6\'bd\'f8\'d0\'d0\'b5\'dd\'b9\'e9\'c5\'c5\'d0\'f2
\f0 \
            \cf7 qSort\cf5 (\cf8 a\cf5 , \cf8 low\cf5 , pivot);\
            \cf6 //
\f1 \'b6\'d4\'b5\'da\'b6\'fe\'b2\'bf\'b7\'d6\'bd\'f8\'d0\'d0\'b5\'dd\'b9\'e9\'c5\'c5\'d0\'f2
\f0 \
            \cf7 qSort\cf5 (\cf8 a\cf5 , pivot + \cf8 1\cf5 , \cf8 high\cf5 );\
        \}\
    \}\
\
    \cf6 //partition
\f1 \'ba\'af\'ca\'fd\'a3\'ac\'ca\'b5\'cf\'d6\'c8\'fd\'ca\'fd\'d6\'d0\'d6\'b5\'b7\'d6\'b8\'ee\'b7\'a8
\f0 \
    \cf2 public static int \cf7 partition\cf5 (\cf2 int \cf8 a\cf5 [], \cf2 int \cf8 low\cf5 , \cf2 int \cf8 high\cf5 ) \{\
        \cf2 int \cf5 pivotkey = \cf8 a\cf5 [\cf8 low\cf5 ];   \cf6 //
\f1 \'d1\'a1\'c8\'a1\'b5\'da\'d2\'bb\'b8\'f6\'d4\'aa\'cb\'d8\'ce\'aa\'ca\'e0\'d6\'e1\'bc\'c7\'c2\'bc
\f0 \
        \cf2 while \cf5 (\cf8 low \cf5 < \cf8 high\cf5 ) \{\
            \cf6 //
\f1 \'bd\'ab\'b1\'c8\'ca\'e0\'d6\'e1\'bc\'c7\'c2\'bc\'d0\'a1\'b5\'c4\'bd\'bb\'bb\'bb\'b5\'bd\'b5\'cd\'b6\'cb
\f0 \
            \cf2 while \cf5 (\cf8 low \cf5 < \cf8 high \cf5 && \cf8 a\cf5 [\cf8 high\cf5 ] >= pivotkey) \{\
                \cf8 high\cf5 --;\
            \}\
            \cf6 //
\f1 \'b2\'c9\'d3\'c3\'cc\'e6\'bb\'bb\'b6\'f8\'b2\'bb\'ca\'c7\'bd\'bb\'bb\'bb\'b5\'c4\'b7\'bd\'ca\'bd\'b2\'d9\'d7\'f7
\f0 \
            \cf8 a\cf5 [\cf8 low\cf5 ] = \cf8 a\cf5 [\cf8 high\cf5 ];\
            \cf6 //
\f1 \'bd\'ab\'b1\'c8\'ca\'e0\'d6\'e1\'bc\'c7\'c2\'bc\'b4\'f3\'b5\'c4\'bd\'bb\'bb\'bb\'b5\'bd\'b8\'df\'b6\'cb
\f0 \
            \cf2 while \cf5 (\cf8 low \cf5 < \cf8 high \cf5 && \cf8 a\cf5 [\cf8 low\cf5 ] <= pivotkey) \{\
                \cf8 low\cf5 ++;\
            \}\
            \cf8 a\cf5 [\cf8 high\cf5 ] = \cf8 a\cf5 [\cf8 low\cf5 ];\
        \}\
        \cf6 //
\f1 \'ca\'e0\'c5\'a6\'cb\'f9\'d4\'da\'ce\'bb\'d6\'c3\'b8\'b3\'d6\'b5
\f0 \
        \cf8 a\cf5 [\cf8 low\cf5 ] = pivotkey;\
        \cf6 //
\f1 \'b7\'b5\'bb\'d8\'ca\'e0\'c5\'a6\'cb\'f9\'d4\'da\'b5\'c4\'ce\'bb\'d6\'c3
\f0 \
        \cf2 return \cf8 low\cf5 ;\
    \}\
\
    \cf6 //
\f1 \'cd\'b0\'c5\'c5\'d0\'f2
\f0 \
    //	\'95	
\f1 \'cd\'b0\'ca\'bd\'c5\'c5\'d0\'f2\'b2\'bb\'d4\'d9\'ca\'c7\'d2\'bb\'d6\'d6\'bb\'f9\'d3\'da\'b1\'c8\'bd\'cf\'b5\'c4\'c5\'c5\'d0\'f2\'b7\'bd\'b7\'a8\'a3\'ac\'cb\'fc\'ca\'c7\'d2\'bb\'d6\'d6\'b1\'c8\'bd\'cf\'c7\'c9\'c3\'ee\'b5\'c4\'c5\'c5\'d0\'f2\'b7\'bd\'ca\'bd\'a3\'ac\'b5\'ab\'d5\'e2\'d6\'d6\'c5\'c5\'d0\'f2\'b7\'bd\'ca\'bd\'d0\'e8\'d2\'aa\'b4\'fd\'c5\'c5\'d0\'f2\'b5\'c4\'d0\'f2\'c1\'d0\'c2\'fa\'d7\'e3\'d2\'d4\'cf\'c2\'c1\'bd\'b8\'f6\'cc\'d8\'d5\'f7\'a3\'ba
\f0  
\f1 \'b4\'fd\'c5\'c5\'d0\'f2\'c1\'d0\'cb\'f9\'d3\'d0\'b5\'c4\'d6\'b5\'b4\'a6\'d3\'da\'d2\'bb\'b8\'f6\'bf\'c9\'c3\'b6\'be\'d9\'b5\'c4\'b7\'b6\'ce\'a7\'d6\'ae\'c0\'e0\'a3\'bb
\f0  
\f1 \'b4\'fd\'c5\'c5\'d0\'f2\'c1\'d0\'cb\'f9\'d4\'da\'b5\'c4\'d5\'e2\'b8\'f6\'bf\'c9\'c3\'b6\'be\'d9\'b5\'c4\'b7\'b6\'ce\'a7\'b2\'bb\'d3\'a6\'b8\'c3\'cc\'ab\'b4\'f3\'a3\'ac\'b7\'f1\'d4\'f2\'c5\'c5\'d0\'f2\'bf\'aa\'cf\'fa\'cc\'ab\'b4\'f3\'a1\'a3
\f0 \
    //	\'95	
\f1 \'c5\'c5\'d0\'f2\'b5\'c4\'be\'df\'cc\'e5\'b2\'bd\'d6\'e8\'c8\'e7\'cf\'c2\'a3\'ba
\f0 \
    //  (1)
\f1 \'b6\'d4\'d3\'da\'d5\'e2\'b8\'f6\'bf\'c9\'c3\'b6\'be\'d9\'b7\'b6\'ce\'a7\'b9\'b9\'bd\'a8\'d2\'bb\'b8\'f6
\f0 buckets
\f1 \'ca\'fd\'d7\'e9\'a3\'ac\'d3\'c3\'d3\'da\'bc\'c7\'c2\'bc
\f0 \'93
\f1 \'c2\'e4\'c8\'eb
\f0 \'94
\f1 \'c3\'bf\'b8\'f6\'cd\'b0\'d6\'d0\'d4\'aa\'cb\'d8\'b5\'c4\'b8\'f6\'ca\'fd\'a3\'bb
\f0  (2)
\f1 \'bd\'ab\'a3\'a8
\f0 1
\f1 \'a3\'a9\'d6\'d0\'b5\'c3\'b5\'bd\'b5\'c4
\f0 buckets
\f1 \'ca\'fd\'d7\'e9\'d6\'d8\'d0\'c2\'bd\'f8\'d0\'d0\'bc\'c6\'cb\'e3\'a3\'ac\'b0\'b4\'c8\'e7\'cf\'c2\'b9\'ab\'ca\'bd\'d6\'d8\'d0\'c2\'bc\'c6\'cb\'e3\'a3\'ba
\f0 \
    //  buckets[i] = buckets[i] +buckets[i-1] (
\f1 \'c6\'e4\'d6\'d0
\f0 1<=i<buckets.length);\
    //	\'95	
\f1 \'cd\'b0\'ca\'bd\'c5\'c5\'d0\'f2\'ca\'c7\'d2\'bb\'d6\'d6\'b7\'c7\'b3\'a3\'d3\'c5\'d0\'e3\'b5\'c4\'c5\'c5\'d0\'f2\'cb\'e3\'b7\'a8\'a3\'ac\'ca\'b1\'bc\'e4\'d0\'a7\'c2\'ca\'bc\'ab\'b8\'df\'a3\'ac\'cb\'fc\'d6\'bb\'d2\'aa\'cd\'a8\'b9\'fd
\f0 2
\f1 \'c2\'d6\'b1\'e9\'c0\'fa\'a3\'ba\'b5\'da
\f0 1
\f1 \'c2\'d6\'b1\'e9\'c0\'fa\'b4\'fd\'c5\'c5\'ca\'fd\'be\'dd\'a3\'ac\'cd\'b3\'bc\'c6\'c3\'bf\'b8\'f6\'b4\'fd\'c5\'c5\'ca\'fd\'be\'dd
\f0 \'93
\f1 \'c2\'e4\'c8\'eb
\f0 \'94
\f1 \'b8\'f7\'cd\'b0\'d6\'d0\'b5\'c4\'b8\'f6\'ca\'fd\'a3\'ac\'b5\'da
\f0 2
\f1 \'c2\'d6\'b1\'e9\'c0\'fa
\f0 buckets
\f1 \'d3\'c3\'d3\'da\'d6\'d8\'d0\'c2\'bc\'c6\'cb\'e3
\f0 buckets
\f1 \'d6\'d0\'d4\'aa\'cb\'d8\'b5\'c4\'d6\'b5\'a3\'ac
\f0 2
\f1 \'c2\'d6\'b1\'e9\'c0\'fa\'ba\'f3\'be\'cd\'bf\'c9\'d2\'d4\'b5\'c3\'b5\'bd\'c3\'bf\'b8\'f6\'b4\'fd\'c5\'c5\'ca\'fd\'be\'dd\'d4\'da\'d3\'d0\'d0\'f2\'d0\'f2\'c1\'d0\'d6\'d0\'b5\'c4\'ce\'bb\'d6\'c3\'a3\'ac\'c8\'bb\'ba\'f3\'bd\'ab\'b8\'f7\'b8\'f6\'ca\'fd\'be\'dd\'cf\'ee\'d2\'c0\'b4\'ce\'b7\'c5\'c8\'eb\'d6\'b8\'b6\'a8\'ce\'bb\'d6\'c3\'bc\'b4\'bf\'c9\'a1\'a3
\f0 \
    //	\'95	
\f1 \'cd\'b0\'ca\'bd\'c5\'c5\'d0\'f2\'b5\'c4\'bf\'d5\'bc\'e4\'bf\'aa\'cf\'fa\'bd\'cf\'b4\'f3\'a3\'ac\'cb\'fc\'d0\'e8\'d2\'aa\'c1\'bd\'b8\'f6\'ca\'fd\'d7\'e9\'a3\'ac\'b5\'da
\f0 1
\f1 \'b8\'f6
\f0 buckets
\f1 \'ca\'fd\'d7\'e9\'d3\'c3\'d3\'da\'bc\'c7\'c2\'bc
\f0 \'93
\f1 \'c2\'e4\'c8\'eb
\f0 \'94
\f1 \'b8\'f7\'cd\'b0\'d6\'d0\'d4\'aa\'cb\'d8\'b5\'c4\'b8\'f6\'ca\'fd\'a3\'ac\'bd\'f8\'b6\'f8\'b1\'a3\'b4\'e6\'b8\'f7\'d4\'aa\'cb\'d8\'d4\'da\'d3\'d0\'d0\'f2\'d0\'f2\'c1\'d0\'d6\'d0\'b5\'c4\'ce\'bb\'d6\'c3\'a3\'ac\'b5\'da
\f0 2
\f1 \'b8\'f6\'ca\'fd\'d7\'e9\'d3\'c3\'d3\'da\'bb\'ba\'b4\'e6\'b4\'fd\'c5\'c5\'ca\'fd\'be\'dd
\f0 .\
    //	\'95	
\f1 \'cd\'b0\'ca\'bd\'c5\'c5\'d0\'f2\'ca\'c7\'ce\'c8\'b6\'a8\'b5\'c4\'a1\'a3\'c8\'e7\'b9\'fb\'b4\'fd\'c5\'c5\'d0\'f2\'ca\'fd\'be\'dd\'b5\'c4\'b7\'b6\'ce\'a7\'d4\'da
\f0 0~k
\f1 \'d6\'ae\'bc\'e4\'a3\'ac\'c4\'c7\'c3\'b4\'cb\'fc\'b5\'c4\'ca\'b1\'bc\'e4\'b8\'b4\'d4\'d3\'b6\'c8\'ca\'c7
\f0 O(k+n)
\f1 \'b5\'c4
\f0 .\
    //	\'95	
\f1 \'b5\'ab\'ca\'c7\'cb\'fc\'b5\'c4\'cf\'de\'d6\'c6\'b6\'e0\'a3\'ac\'b1\'c8\'c8\'e7\'cb\'fc\'d6\'bb\'c4\'dc\'c5\'c5\'d5\'fb\'d0\'ce\'ca\'fd\'d7\'e9\'a1\'a3\'b6\'f8\'c7\'d2\'b5\'b1
\f0 k
\f1 \'bd\'cf\'b4\'f3\'a3\'ac\'b6\'f8\'ca\'fd\'d7\'e9\'b3\'a4\'b6\'c8
\f0 n
\f1 \'bd\'cf\'d0\'a1\'a3\'ac\'bc\'b4
\f0 k>>n
\f1 \'ca\'b1\'a3\'ac\'b8\'a8\'d6\'fa\'ca\'fd\'d7\'e9
\f0 C[k+1]
\f1 \'b5\'c4\'bf\'d5\'bc\'e4\'cf\'fb\'ba\'c4\'bd\'cf\'b4\'f3\'a1\'a3\'b5\'b1\'ca\'fd\'d7\'e9\'ce\'aa\'d5\'fb\'d0\'ce\'a3\'ac\'c7\'d2
\f0 k
\f1 \'ba\'cd
\f0 n
\f1 \'bd\'d3\'bd\'fc\'ca\'b1
\f0 , 
\f1 \'bf\'c9\'d2\'d4\'d3\'c3\'b4\'cb\'b7\'bd\'b7\'a8\'c5\'c5\'d0\'f2\'a1\'a3
\f0 \
\
    //min
\f1 \'b5\'c4\'d6\'b5\'ce\'aa
\f0 0
\f1 \'a3\'ac
\f0 max
\f1 \'b5\'c4\'d6\'b5\'ce\'aa\'b4\'fd\'c5\'c5\'d0\'f2\'ca\'fd\'d7\'e9\'d6\'d0\'d7\'ee\'b4\'f3\'d6\'b5
\f0 +1\
    \cf2 public static void \cf7 bucketSort\cf5 (\cf2 int\cf5 [] \cf8 data\cf5 , \cf2 int \cf8 min\cf5 , \cf2 int \cf8 max\cf5 ) \{\
        \cf6 // 
\f1 \'bb\'ba\'b4\'e6\'ca\'fd\'d7\'e9
\f0 \
        \cf2 int\cf5 [] tmp = \cf2 new int\cf5 [\cf8 data\cf5 .\cf9 length\cf5 ];\
        \cf6 // buckets
\f1 \'d3\'c3\'d3\'da\'bc\'c7\'c2\'bc\'b4\'fd\'c5\'c5\'d0\'f2\'d4\'aa\'cb\'d8\'b5\'c4\'d0\'c5\'cf\'a2
\f0 \
        // buckets
\f1 \'ca\'fd\'d7\'e9\'b6\'a8\'d2\'e5\'c1\'cb
\f0 max-min
\f1 \'b8\'f6\'cd\'b0
\f0 \
        \cf2 int\cf5 [] buckets = \cf2 new int\cf5 [\cf8 max \cf5 - \cf8 min\cf5 ];\
        \cf6 // 
\f1 \'bc\'c6\'cb\'e3\'c3\'bf\'b8\'f6\'d4\'aa\'cb\'d8\'d4\'da\'d0\'f2\'c1\'d0\'b3\'f6\'cf\'d6\'b5\'c4\'b4\'ce\'ca\'fd
\f0 \
        \cf2 for \cf5 (\cf2 int \cf5 i = \cf8 0\cf5 ; i < \cf8 data\cf5 .\cf9 length\cf5 ; i++) \{\
            buckets[\cf8 data\cf5 [i] - \cf8 min\cf5 ]++;\
        \}\
        \cf6 // 
\f1 \'bc\'c6\'cb\'e3
\f0 \'93
\f1 \'c2\'e4\'c8\'eb
\f0 \'94
\f1 \'b8\'f7\'cd\'b0\'c4\'da\'b5\'c4\'d4\'aa\'cb\'d8\'d4\'da\'d3\'d0\'d0\'f2\'d0\'f2\'c1\'d0\'d6\'d0\'b5\'c4\'ce\'bb\'d6\'c3
\f0 \
        \cf2 for \cf5 (\cf2 int \cf5 i = \cf8 1\cf5 ; i < \cf8 max \cf5 - \cf8 min\cf5 ; i++) \{\
            buckets[i] = buckets[i] + buckets[i - \cf8 1\cf5 ];\
        \}\
        \cf6 // 
\f1 \'bd\'ab
\f0 data
\f1 \'d6\'d0\'b5\'c4\'d4\'aa\'cb\'d8\'cd\'ea\'c8\'ab\'b8\'b4\'d6\'c6\'b5\'bd
\f0 tmp
\f1 \'ca\'fd\'d7\'e9\'d6\'d0
\f0 \
        \cf4 System\cf5 .\cf7 arraycopy\cf5 (\cf8 data\cf5 , \cf8 0\cf5 , tmp, \cf8 0\cf5 , \cf8 data\cf5 .\cf9 length\cf5 );\
        \cf6 // 
\f1 \'b8\'f9\'be\'dd
\f0 buckets
\f1 \'ca\'fd\'d7\'e9\'d6\'d0\'b5\'c4\'d0\'c5\'cf\'a2\'bd\'ab\'b4\'fd\'c5\'c5\'d0\'f2\'c1\'d0\'b5\'c4\'b8\'f7\'d4\'aa\'cb\'d8\'b7\'c5\'c8\'eb\'cf\'e0\'d3\'a6\'ce\'bb\'d6\'c3
\f0 \
        \cf2 for \cf5 (\cf2 int \cf5 k = \cf8 data\cf5 .\cf9 length \cf5 - \cf8 1\cf5 ; k >= \cf8 0\cf5 ; k--) \{\
            \cf8 data\cf5 [--buckets[tmp[k] - \cf8 min\cf5 ]] = tmp[k];\
        \}\
    \}\
\
\}\
\
}