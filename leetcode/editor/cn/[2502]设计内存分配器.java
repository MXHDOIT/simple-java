//给你一个整数 n ，表示下标从 0 开始的内存数组的大小。所有内存单元开始都是空闲的。 
//
// 请你设计一个具备以下功能的内存分配器： 
//
// 
// 分配 一块大小为 size 的连续空闲内存单元并赋 id mID 。 
// 释放 给定 id mID 对应的所有内存单元。 
// 
//
// 注意： 
//
// 
// 多个块可以被分配到同一个 mID 。 
// 你必须释放 mID 对应的所有内存单元，即便这些内存单元被分配在不同的块中。 
// 
//
// 实现 Allocator 类： 
//
// 
// Allocator(int n) 使用一个大小为 n 的内存数组初始化 Allocator 对象。 
// int allocate(int size, int mID) 找出大小为 size 个连续空闲内存单元且位于 最左侧 的块，分配并赋 id mID 。返
//回块的第一个下标。如果不存在这样的块，返回 -1 。 
// int freeMemory(int mID) 释放 id mID 对应的所有内存单元。返回释放的内存单元数目。 
// 
//
// 
//
// 示例： 
//
// 
//输入
//["Allocator", "allocate", "allocate", "allocate", "freeMemory", "allocate", 
//"allocate", "allocate", "freeMemory", "allocate", "freeMemory"]
//[[10], [1, 1], [1, 2], [1, 3], [2], [3, 4], [1, 1], [1, 1], [1], [10, 2], [7]]
//
//输出
//[null, 0, 1, 2, 1, 3, 1, 6, 3, -1, 0]
//
//解释
//Allocator loc = new Allocator(10); // 初始化一个大小为 10 的内存数组，所有内存单元都是空闲的。
//loc.allocate(1, 1); // 最左侧的块的第一个下标是 0 。内存数组变为 [1, , , , , , , , , ]。返回 0 。
//loc.allocate(1, 2); // 最左侧的块的第一个下标是 1 。内存数组变为 [1,2, , , , , , , , ]。返回 1 。
//loc.allocate(1, 3); // 最左侧的块的第一个下标是 2 。内存数组变为 [1,2,3, , , , , , , ]。返回 2 。
//loc.freeMemory(2); // 释放 mID 为 2 的所有内存单元。内存数组变为 [1, ,3, , , , , , , ] 。返回 1 ，因
//为只有 1 个 mID 为 2 的内存单元。
//loc.allocate(3, 4); // 最左侧的块的第一个下标是 3 。内存数组变为 [1, ,3,4,4,4, , , , ]。返回 3 。
//loc.allocate(1, 1); // 最左侧的块的第一个下标是 1 。内存数组变为 [1,1,3,4,4,4, , , , ]。返回 1 。
//loc.allocate(1, 1); // 最左侧的块的第一个下标是 6 。内存数组变为 [1,1,3,4,4,4,1, , , ]。返回 6 。
//loc.freeMemory(1); // 释放 mID 为 1 的所有内存单元。内存数组变为 [ , ,3,4,4,4, , , , ] 。返回 3 ，因
//为有 3 个 mID 为 1 的内存单元。
//loc.allocate(10, 2); // 无法找出长度为 10 个连续空闲内存单元的空闲块，所有返回 -1 。
//loc.freeMemory(7); // 释放 mID 为 7 的所有内存单元。内存数组保持原状，因为不存在 mID 为 7 的内存单元。返回 0 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n, size, mID <= 1000 
// 最多调用 allocate 和 free 方法 1000 次 
// 
//
// Related Topics 设计 数组 哈希表 模拟 👍 48 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Allocator {
    Map<Integer, List<List<Integer>>> map2;
    Map<Integer, Integer> map;

    public Allocator(int n) {
        map2 = new HashMap<>(n);
        map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            map.put(i, n - i);
        }
    }

    public int allocate(int size, int mID) {
        for (int i = 0; i < map.size(); i++) {
            Integer value = map.get(i);
            if (value >= size) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < size; j++) {
                    map.put(i + j, 0);
                    list.add(i + j);
                }
                for (int j = i - 1; j >= 0; j--) {
                    if (i - j + 1 <= map.get(j)) {
                        map.put(j, i - j);
                    } else {
                        break;
                    }
                }
                List<List<Integer>> lists = map2.getOrDefault(mID, new ArrayList<>());
                lists.add(list);
                map2.put(mID,lists);
                return i;
            }
        }
        return -1;
    }

    public int freeMemory(int mID) {
        List<List<Integer>> lists = map2.get(mID);
        if (lists == null) {
            return 0;
        }
        map2.remove(mID);
        int result = 0;
        for (List<Integer> list : lists) {
            result+=list.size();
            for (int i = list.size() - 1; i >= 0; i--) {
                Integer index = list.get(i);
                if (index == map.size() - 1) {
                    map.put(index, 1);
                } else {
                    map.put(index, map.get(index + 1) + 1);
                }
            }
            Integer index = list.get(0);
            Integer startIndex = index - 1;
            while (startIndex >= 0) {
                if (index - startIndex == map.get(startIndex)) {
                    map.put(startIndex, index - startIndex + list.size());
                }
                startIndex--;
            }
        }
        return result;
    }
}
/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */
//leetcode submit region end(Prohibit modification and deletion)
