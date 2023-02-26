package java1.Collection.Mapp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<>();
        System.out.println("m1="+m1);
        //1.put()添加
        String put = m1.put("姓名", "小盛");
        System.out.println("m1="+m1);
        put = m1.put("年龄", "30");
        System.out.println("m1="+m1);
        //put() 修改
        put = m1.put("年龄", "29");
        System.out.println("m1="+m1);
        //2.get() 根据key获取value
        String age = m1.get("年龄");
        System.out.println("age:"+age);
        //3.ccontainsKey() 是否包含key
        boolean age_k = m1.containsKey("年龄");
        System.out.println("age_b:"+age_k);
        //4.containsValue 是否包含value
        boolean age_v = m1.containsValue("29");
        System.out.println("age_v:"+age_v);
        //5.remove
//        String age1 = m1.remove("年龄");
//        System.out.println("m1="+m1);
        //6.Set keySet() 返回key的Set视图
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        Set<String> keySet = m1.keySet();
        for (String key:keySet) {
//            System.out.println("key:"+key);
            String values = m1.get(key);
            System.out.println(key+":"+ values);
        }
        //7.Collection valueCollection 返回value的Collection视图
        Collection<String> values = m1.values();
        for (String value:values) {
            System.out.println("values:"+value);
        }
        //8.Set<Map.Entry<K,V>> entrySet()  返回每个键值对的Set视图
        Set<Map.Entry<String,String>> entries = m1.entrySet();
        for (Map.Entry<String,String> map:entries){
            System.out.println("map:"+map);
        }
    }
}
