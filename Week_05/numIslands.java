{\rtf1\ansi\ansicpg936\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Bold;\f1\froman\fcharset0 Times-Roman;\f2\fmodern\fcharset0 Courier;
\f3\fnil\fcharset134 PingFangSC-Regular;\f4\fnil\fcharset134 STSongti-SC-Bold;}
{\colortbl;\red255\green255\blue255;\red57\green57\blue57;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c28627\c28627\c28627;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl480\partightenfactor0

\f0\b\fs29\fsmilli14667 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 //1.DFS
\f1\b0 \
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 class Solution \{\
    private static final int[][] DIRECTIONS = \{\{-1, 0\}, \{0, -1\}, \{1, 0\}, \{0, 1\}\};\
    private boolean[][] visited;\
    private int rows;\
    private int cols;\
    private char[][] grid;\
\
\
    public int numIslands(char[][] grid) \{\
        rows = grid.length;\
        if (rows == 0) \{\
            return 0;\
        \}\
        cols = grid[0].length;\
\
\
        this.grid = grid;\
        visited = new boolean[rows][cols];\
        int count = 0;\
        for (int i = 0; i < rows; i++) \{\
            for (int j = 0; j < cols; j++) \{\
                // 
\f3 \'c8\'e7\'b9\'fb\'ca\'c7\'b5\'ba\'d3\'ec\'d6\'d0\'b5\'c4\'d2\'bb\'b8\'f6\'b5\'e3\'a3\'ac\'b2\'a2\'c7\'d2\'c3\'bb\'d3\'d0\'b1\'bb\'b7\'c3\'ce\'ca\'b9\'fd\'a3\'ac\'be\'cd\'bd\'f8\'d0\'d0\'c9\'ee\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa
\f2 \
                if (!visited[i][j] && grid[i][j] == '1') \{\
                    dfs(i, j);\
                    count++;\
                \}\
            \}\
        \}\
        return count;\
    \}\
\
\
    /**\
     * 
\f3 \'b4\'d3\'d7\'f8\'b1\'ea\'ce\'aa
\f2  (i, j) 
\f3 \'b5\'c4\'b5\'e3\'bf\'aa\'ca\'bc\'bd\'f8\'d0\'d0\'c9\'ee\'b6\'c8\'d3\'c5\'cf\'c8\'b1\'e9\'c0\'fa
\f2 \
     *\
     * @param i\
     * @param j\
     */\
    private void dfs(int i, int j) \{\
        visited[i][j] = true;\
        for (int k = 0; k < 4; k++) \{\
            int newX = i + DIRECTIONS[k][0];\
            int newY = j + DIRECTIONS[k][1];\
            // 
\f3 \'c8\'e7\'b9\'fb\'b2\'bb\'d4\'bd\'bd\'e7\'a1\'a2\'bb\'b9\'ca\'c7\'c2\'bd\'b5\'d8\'a1\'a2\'c3\'bb\'d3\'d0\'b1\'bb\'b7\'c3\'ce\'ca\'b9\'fd
\f2 \
            if (inArea(newX, newY) && grid[newX][newY] == '1' && !visited[newX][newY]) \{\
                dfs(newX, newY);\
            \}\
        \}\
    \}\
\
\
    /**\
     * 
\f3 \'b7\'e2\'d7\'b0\'b3\'c9
\f2  inArea 
\f3 \'b7\'bd\'b7\'a8\'d3\'ef\'d2\'e5\'b8\'fc\'c7\'e5\'ce\'fa
\f2 \
     *\
     * @param x\
     * @param y\
     * @return\
     */\
    private boolean inArea(int x, int y) \{\
        return x >= 0 && x < rows && y >= 0 && y < cols;\
    \
\pard\pardeftab720\sl480\partightenfactor0

\f0\b\fs29\fsmilli14667 \cf2 \strokec2 //2.BFS
\f1\b0 \
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 class Solution \{\
    private final static int[][] DIRECTIONS = \{\{-1, 0\}, \{0, -1\}, \{1, 0\}, \{0, 1\}\};\
    private int rows;\
    private int cols;\
    private char[][] grid;\
    private boolean[][] visited;\
\
\
    public int numIslands(char[][] grid) \{\
        rows = grid.length;\
        if (rows == 0) \{\
            return 0;\
        \}\
        cols = grid[0].length;\
        this.grid = grid;\
        visited = new boolean[rows][cols];\
\
\
        int count = 0;\
        for (int i = 0; i < rows; i++) \{\
            for (int j = 0; j < cols; j++) \{\
                if (!visited[i][j] && grid[i][j] == '1') \{\
                    bfs(i, j);\
                    count++;\
                \}\
            \}\
        \}\
        return count;\
    \}\
\
\
    private void bfs(int i, int j) \{\
        Queue<Integer> queue = new LinkedList<>();\
        queue.offer(i * cols + j);\
        // 
\f3 \'d7\'a2\'d2\'e2\'a3\'ba\'d5\'e2\'c0\'ef\'d2\'aa\'b1\'ea\'bc\'c7\'c9\'cf\'d2\'d1\'be\'ad\'b7\'c3\'ce\'ca\'b9\'fd
\f2 \
        visited[i][j] = true;\
        while (!queue.isEmpty()) \{\
            int cur = queue.poll();\
            int curX = cur / cols;\
            int curY = cur % cols;\
            for (int k = 0; k < 4; k++) \{\
                int newX = curX + DIRECTIONS[k][0];\
                int newY = curY + DIRECTIONS[k][1];\
                if (inArea(newX, newY) && grid[newX][newY] == '1' && !visited[newX][newY]) \{\
                    queue.offer(newX * cols + newY);\
                    // 
\f3 \'cc\'d8\'b1\'f0\'d7\'a2\'d2\'e2\'a3\'ba\'d4\'da\'b7\'c5\'c8\'eb\'b6\'d3\'c1\'d0\'d2\'d4\'ba\'f3\'a3\'ac\'d2\'aa\'c2\'ed\'c9\'cf\'b1\'ea\'bc\'c7\'b3\'c9\'d2\'d1\'be\'ad\'b7\'c3\'ce\'ca\'b9\'fd\'a3\'ac\'d3\'ef\'d2\'e5\'d2\'b2\'ca\'c7\'ca\'ae\'b7\'d6\'c7\'e5\'b3\'fe\'b5\'c4\'a3\'ba\'b7\'b4\'d5\'fd\'d6\'bb\'d2\'aa\'bd\'f8\'c8\'eb\'c1\'cb\'b6\'d3\'c1\'d0\'a3\'ac\'b3\'d9\'d4\'e7\'b6\'bc\'bb\'e1\'b1\'e9\'c0\'fa\'b5\'bd\'cb\'fc
\f2 \
                    // 
\f3 \'b6\'f8\'b2\'bb\'ca\'c7\'d4\'da\'b3\'f6\'b6\'d3\'c1\'d0\'b5\'c4\'ca\'b1\'ba\'f2\'d4\'d9\'b1\'ea\'bc\'c7\'a3\'ac\'c8\'e7\'b9\'fb\'ca\'c7\'b3\'f6\'b6\'d3\'c1\'d0\'b5\'c4\'ca\'b1\'ba\'f2\'d4\'d9\'b1\'ea\'bc\'c7\'a3\'ac\'bb\'e1\'d4\'ec\'b3\'c9\'ba\'dc\'b6\'e0\'d6\'d8\'b8\'b4\'b5\'c4\'bd\'e1\'b5\'e3\'bd\'f8\'c8\'eb\'b6\'d3\'c1\'d0\'a3\'ac\'d4\'ec\'b3\'c9\'d6\'d8\'b8\'b4\'b5\'c4\'b2\'d9\'d7\'f7\'a3\'ac\'d5\'e2\'be\'e4\'bb\'b0\'c8\'e7\'b9\'fb\'c4\'e3\'c3\'bb\'d3\'d0\'d0\'b4\'b6\'d4\'b5\'d8\'b7\'bd\'a3\'ac\'b4\'fa\'c2\'eb\'bb\'e1\'d1\'cf\'d6\'d8\'b3\'ac\'ca\'b1\'b5\'c4
\f2 \
                    visited[newX][newY] = true;\
                \}\
            \}\
        \}\
    \}\
\
\
    private boolean inArea(int x, int y) \{\
        return x >= 0 && x < rows && y >= 0 && y < cols;\
    \
\pard\pardeftab720\sl480\partightenfactor0

\f0\b\fs29\fsmilli14667 \cf2 \strokec2 //3.
\f4 \'b2\'a2\'b2\'e9\'bc\'af
\f1\b0 \
\pard\pardeftab720\partightenfactor0

\f2\fs24 \cf3 \strokec3 class Solution \{\
    public int numIslands(char[][] grid) \{\
        int rows = grid.length;\
        if (rows == 0) \{\
            return 0;\
        \}\
        int cols = grid[0].length;\
\
\
        int size = rows * cols;\
        // 
\f3 \'c1\'bd\'b8\'f6\'b7\'bd\'cf\'f2\'b5\'c4\'b7\'bd\'cf\'f2\'cf\'f2\'c1\'bf\'a3\'a8\'c0\'ed\'bd\'e2\'ce\'aa\'cf\'f2\'cf\'c2\'ba\'cd\'cf\'f2\'d3\'d2\'b5\'c4\'d7\'f8\'b1\'ea\'c6\'ab\'d2\'c6\'a3\'a9
\f2 \
        int[][] directions = \{\{1, 0\}, \{0, 1\}\};\
        // +1 
\f3 \'ca\'c7\'c8\'cf\'ce\'aa\'d0\'e9\'c4\'e2\'b5\'c4\'cb\'ae\'d3\'f2
\f2 \
        UnionFind unionFind = new UnionFind(size + 1);\
\
\
        for (int i = 0; i < rows; i++) \{\
            for (int j = 0; j < cols; j++) \{\
\
\
                if (grid[i][j] == '1') \{\
                    for (int[] direction : directions) \{\
                        int newX = i + direction[0];\
                        int newY = j + direction[1];\
                        if (newX < rows && newY < cols && grid[newX][newY] == '1') \{\
                            unionFind.union(cols * i + j, cols * newX + newY);\
                        \}\
                    \}\
                \} else \{\
                    // 
\f3 \'c8\'e7\'b9\'fb\'b2\'bb\'ca\'c7\'c2\'bd\'b5\'d8\'a3\'ac\'cb\'f9\'d3\'d0\'b5\'c4\'cb\'ae\'d3\'f2\'ba\'cd\'d2\'bb\'b8\'f6\'d0\'e9\'c4\'e2\'b5\'c4\'cb\'ae\'d3\'f2\'c1\'ac\'bd\'d3
\f2 \
                    unionFind.union(cols * i + j, size);\
                \}\
            \}\
        \}\
\
\
        // 
\f3 \'bc\'f5\'c8\'a5\'c4\'c7\'b8\'f6\'d2\'bb\'bf\'aa\'ca\'bc\'b6\'e0\'c9\'e8\'d6\'c3\'b5\'c4\'d0\'e9\'c4\'e2\'b5\'c4\'cb\'ae\'d3\'f2
\f2 \
        return unionFind.count - 1;\
    \}\
\
\
    class UnionFind \{\
        \
        private int[] parent;\
        private int count;\
\
\
        public UnionFind(int n) \{\
            this.count = n;\
            parent = new int[n];\
            for (int i = 0; i < n; i++) \{\
                parent[i] = i;\
            \}\
        \}\
\
\
        /**\
         * 
\f3 \'b7\'b5\'bb\'d8\'cb\'f7\'d2\'fd\'ce\'aa
\f2  p 
\f3 \'b5\'c4\'d4\'aa\'cb\'d8\'b5\'c4\'b8\'f9\'bd\'e1\'b5\'e3
\f2 \
         *\
         * @param p\
         * @return\
         */\
        public int find(int p) \{\
            // 
\f3 \'d4\'da
\f2  find 
\f3 \'b5\'c4\'ca\'b1\'ba\'f2\'d6\'b4\'d0\'d0\'c2\'b7\'be\'b6\'d1\'b9\'cb\'f5
\f2 \
            while (p != parent[p]) \{\
                // 
\f3 \'c1\'bd\'b2\'bd\'d2\'bb\'cc\'f8\'cd\'ea\'b3\'c9\'c2\'b7\'be\'b6\'d1\'b9\'cb\'f5\'a3\'ac\'d5\'e2\'c0\'ef\'ca\'c7\'a1\'b8\'b8\'f4\'b4\'fa\'d1\'b9\'cb\'f5\'a1\'b9
\f2 \
                // 
\f3 \'cb\'b5\'c3\'f7\'a3\'ba\'a1\'b8\'b8\'f4\'b4\'fa\'d1\'b9\'cb\'f5\'a1\'b9\'ba\'cd\'a1\'b8\'b0\'b4\'d6\'c8\'ba\'cf\'b2\'a2\'a1\'b9\'d1\'a1\'d4\'f1\'d2\'bb\'b8\'f6\'ca\'b5\'cf\'d6\'bc\'b4\'bf\'c9\'a3\'ac\'a1\'b8\'b8\'f4\'b4\'fa\'d1\'b9\'cb\'f5\'a1\'b9\'b5\'c4\'b4\'fa\'c2\'eb\'c1\'bf\'c9\'d9\'a3\'ac\'cb\'f9\'d2\'d4\'d1\'a1\'cb\'fc
\f2 \
                parent[p] = parent[parent[p]];\
                p = parent[p];\
            \}\
            return p;\
        \}\
\
\
        public boolean connected(int p, int q) \{\
            int pRoot = find(p);\
            int qRoot = find(q);\
            return pRoot == qRoot;\
        \}\
\
\
        public void union(int p, int q) \{\
            int pRoot = find(p);\
            int qRoot = find(q);\
            if (pRoot == qRoot) \{\
                return;\
            \}\
            parent[qRoot] = pRoot;\
            // 
\f3 \'c3\'bf\'b4\'ce
\f2  union 
\f3 \'d2\'d4\'ba\'f3\'a3\'ac\'c1\'ac\'cd\'a8\'b7\'d6\'c1\'bf\'bc\'f5
\f2  1\
            count--;\
        \
}