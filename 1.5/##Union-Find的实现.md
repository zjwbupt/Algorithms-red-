## Union-Find的实现

##### 三种实现都基于 id[]数组的数值来判断两个 site 是否相连

### Quick-find 

如果 p 和 q 相同,则返回 true.

//如果 id[q] = id[p],那么 p 和 q 则相连. 反过来说,就是当 p 和 q 相连的时候,把他们的 id[] 值改成相同的.

```java
public int find(int p){
    return id[p];
}

public void union(int p, int q){
    int pID = find(p);
    int qID = find(q);
    
    if(pID = qID) return;
    
    //将 q 的分量重命名为 q 的名称(就是 id)
    for(int i=0; i<id.length; i++)
        if(id[i]!= pID) id[i] = pID;
    count--;
}
```

### Quick-find 分析

quick-find 对于大问题不适用,因为 union() 需要扫描整个id[] 数组

**命题F:** 在 quick-find 算法中, find() 每次调用访问数组一次, union()每次调用访问数组的次数在 (N+3)到(2N+1)之间.

**证明:** 因为 connected()会检查 id[]数组中的两个元素是否相等,会调用两次 find(). 

union()会调用两次 find()并且会循环一次整个数组来寻找 p 和 q 的 id, 并且改变他们中的1到 N-1个元素.



### Quick-Union 算法

每个 site 对应的 id 都是另一个 site 的 name, 这种连接是一种 link.

```java
private int find(int p){
    while(p!=id[p])
    	p = id[p];
    return p;
}

public void union(int p, int q){
    int pRoot = find(p);
    int qRoot = find(q);
    if(pRoot == qRoot) return;
    
    id[pRoot] = qRoot;
    
    count--;
}
```

