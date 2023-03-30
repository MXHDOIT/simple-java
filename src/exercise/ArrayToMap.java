package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

// 实现方法arrayToMap，将array转为map类型
public class ArrayToMap {
    public static void main(String[] args) {
        List<String> array = Arrays.asList(
                "eto->hosts",
                "eto->kubernetes->ssl->certs",
                "eto->kubernetes->stl",
                "root");
        Map<String, Map> mapTree = arrayToMap(array);
        System.out.println(Objects.equals(mapTree.toString(), "{eto={kubernetes={stl={}, ssl={certs={}}}, hosts={}}, root={}}"));
    }

    private static Map<String, Map> arrayToMap(List<String> array) {
        Map<String, Map> mapTree = new HashMap<>();

        for (String s : array) {
            Map<String, Map> map = stringToMap(s);
            merge(mapTree,map);
        }
        return mapTree;
    }

    /**
     * 合并两个map.
     * @param result 结果map
     * @param map 被合map
     */
    public static void merge(Map<String, Map> result, Map<String, Map> map) {
        for (Map.Entry<String, Map> entry : map.entrySet()) {
            String key = entry.getKey();
            Map value = entry.getValue();

            Map resultValue = result.get(key);
            if (resultValue == null) {
                result.put(key,value);
            }else{
                merge(resultValue,value);
            }
        }
    }

    /**
     * 将string转化为map.
     */
    private static Map<String, Map> stringToMap(String str) {
        if (str == null || str.length() == 0) {
            return new HashMap<>();
        }
        String[] split = str.split("->");
        List<String> stringList = new ArrayList<>(Arrays.asList(split));
        return stringListToMap(stringList);
    }

    /**
     * 将集合转化为map.
     */
    private static Map<String, Map> stringListToMap(List<String> stringList) {
        if (stringList == null || stringList.size() == 0) {
            return new HashMap<>();
        }
        Map<String, Map> result = new HashMap<>();
        String key = stringList.remove(0);
        Map<String, Map> value = new HashMap<>();

        if (stringList.size() > 0) {
            value = stringListToMap(stringList);
        }
        result.put(key, value);
        return result;
    }

}
