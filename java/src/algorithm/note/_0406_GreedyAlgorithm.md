# Greedy Algorithm 贪心算法
 经典应用:霍夫曼编码（Huffman Coding）、Prim 和 Kruskal 
 最小生成树算法、还有 Dijkstra 单源最短路径算法。
 
 ## 如何理解“贪心算法”？
 寻求局部最优解。(适用于当前选择不影响大部分后续选择)
 
 在满足限制条件下，只考虑当前最优的步骤，而不顾全大局。
 ## 实战题目
 1. 分糖果
 
    每个糖果的大小不等，这 m 个糖果的大小分别是 s1，s2，s3，……，sm。
    除此之外，每个孩子对糖果大小的需求也是不一样的，
    只有糖果的大小大于等于孩子的对糖果大小的需求的时候， 孩子才得到满足。
    假设这 n 个孩子对糖果大小的需求分别是 g1，g2，g3，……，gn。
    
    我的问题是，如何分配糖果，能尽可能满足最多数量的孩子？
    
    思路:每次找出对糖果大小需求最小的孩子满足他。
 
 
 2. 钱币找零
    这个问题在我们的日常生活中更加普遍。假设我们有 1 元、2 元、5 元、10 元、20 元、50 元、100 元这些面额的纸币，
    它们的张数分别是 c1、c2、c5、c10、c20、c50、c100。
    我们现在要用这些钱来支付 K 元，最少要用多少张纸币呢？
    在生活中，我们肯定是先用面值最大的来支付，如果不够，就继续用更小一点面值的，
    以此类推，最后剩下的用 1 元来补齐。
    
    思路:每次满足支付剩余款的最大面值。()
 
 3. 区间覆盖
    
    假设我们有 n 个区间，区间的起始端点和结束端点分别是
    [l1, r1]，[l2, r2]，[l3, r3]，……，[ln, rn]。
    
    我们从这 n 个区间中选出一部分区间，这部分区间满足两两不相交
    （端点相交的情况不算相交），最多能选出多少个区间呢？
    
      思路:每次使右边最小的区间。
      
 ### 霍夫曼编码
    霍夫曼编码不仅会考察文本中有多少个不同字符，
    还会考察每个字符出现的频率，根据频率的不同，
    选择不同长度的编码。
    霍夫曼编码试图用这种不等长的编码方法，来进一步增加压缩的效率。
    如何给不同频率的字符选择不同长度的编码呢？
    根据贪心的思想，我们可以把出现频率比较多的字符，用稍微短一些的编码；
    出现频率比较少的字符，用稍微长一些的编码。
    对于等长的编码来说，我们解压缩起来很简单。
    为了避免解压缩过程中的歧义，霍夫曼编码要求各个字符的编码之间，
    不会出现某个编码是另一个编码前缀的情况
 
 ## 练习
 1.在一个非负整数 a 中，我们希望从中移除 k 个数字，
 让剩下的数字值最小，如何选择移除哪 k 个数字呢？
 
   每次从最高位开始,如高位大，移除，若高位小，则右移比较两位，直到高位大于低位。
 
 2.假设有 n 个人等待被服务，但是服务窗口只有一个，每个人需要被服务的时间长度是不同的，
 如何安排被服务的先后顺序，才能让这 n 个人总的等待时间最短？
  
   每次服务 服务时间最短的人。
 