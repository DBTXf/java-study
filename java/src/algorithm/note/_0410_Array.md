# 数组
数组（Array）是一种线性表数据结构。
它用一组连续的内存空间，来存储一组具有相同类型的数据。

## 如何实现随机访问？
### 1.第一是线性表（Linear List）。

顾名思义，线性表就是数据排成像一条线一样的结构。每个线性表上的数据最多只有前和后两个方向。

其实除了数组，链表、队列、栈等也是线性表结构。

非线性表
比如二叉树、堆、图等。之所以叫非线性，是因为，在非线性表中，数据之间并不是简单的前后关系。

###2.第二个是连续的内存空间和相同类型的数据。

计算机会给每个内存单元分配一个地址，计算机通过地址来访问内存中的数据。
当计算机需要随机访问数组中的某个元素时，它会首先通过寻址公式，计算出该元素存储的内存地址。

## 低效的“插入”和“删除”

### 插入操作。
假设数组的长度为 n，现在，如果我们需要将一个数据插入到数组中的第 k 个位置。为了把第 k 个位置腾出来，给新来的数据，我们需要将第 k～n 这部分的元素都顺序地往后挪一位。

### 插入操作

跟插入数据类似，如果我们要删除第 k 个位置的数据，为了内存的连续性，也需要搬移数据，不然中间就会出现空洞，内存就不连续了。

实际上，在某些特殊场景下，我们并不一定非得追求数组中数据的连续性。如果我们将多次删除操作集中在一起执行，删除的效率是不是会提高很多呢？

## 警惕数组的访问越界问题

## 容器能否完全替代数组？
 业务开发可以，底层开发不可以。
 
 一维数组
a[k]_address = base_address + k * type_size

二维数组
对于 m * n 的数组，a [ i ][ j ] (i < m,j < n)的地址为：

address = base_address + ( i * n + j) * type_size