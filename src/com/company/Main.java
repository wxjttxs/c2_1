package com.company;

//import java.util.List;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     * 打印对象
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 5 / 2);
        print(2, 5 + 2);
        print(3, 5 * 2);
        print(4, 5 - 2);
        print(5, 5 << 2);
        print(6, 5 >> 2);
        print(7, 5 & 2);
        print(8, 5 | 2);
        print(9, 5 ^ 2);
        print(10, 5 == 2);
        print(11, 5 != 2);
    }

    public static void demoControlFlow() {
        int score = 60;
        if (score > 80)
            print(1, "A");
        else if (score > 60) {

            print(2, "B");
        } else
            print(3, "C");

        String grade = "B";
        switch (grade) {
            case "A":
                print(4, "score>80");
                break;
            case "B":
                print(5, "(60,80)");
                break;
            default:
                print(6, "socre<60");

        }

        for (int i = 0; i < 4; i++) {
            if (i == 1) {
                continue;
            }
            if (i == 5) {
                break;
            }
            if (i % 2 == 1) {
                print(8, "i%2=1");
            }
            print(7, i);
        }

        String str = "hello";
        for (char c : str.toCharArray()) {
            print(9, c);
        }
        int target = 20;
        int current = 0;
        while (current < target) {
            current += 5;
            print(10, current);
        }
    }

    public static void demoString() {
        String str = "hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.charAt(6));
        print(3, str.codePointAt(1));
        print(4, str.compareTo("hello mowcoder"));
        print(5, str.compareTo("hello powcoder"));
        print(6, str.compareToIgnoreCase("Hello nowcoder"));
        print(7, str.concat("!!"));
        print(8, str.contains("hello"));
        print(9, str.endsWith("nowcoder"));
        print(10, str.startsWith("hello"));
        print(11, str.lastIndexOf('o'));
        print(12, str.toUpperCase());
        print(13, str.replace('o', 'a'));
        print(14, str.replaceAll("o|l", "a"));
        print(15, str.replaceAll("hello", "hi"));

        StringBuffer sb = new StringBuffer();
        sb.append(true);
        sb.append(1);
        sb.append(2.2);
        print(16, sb.toString());
    }

    public static void demoList() {
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            strList.add(String.valueOf(i));

        }
        print(1, strList);
        ;
        List<String> strListB = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            strListB.add(String.valueOf(i * i));

        }
        strList.addAll(strListB);

        print(2, strList);
        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1));
        print(4, strList);

        print(5, strList.get(1));
        Collections.sort(strList);
        print(6, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(7, strList);

        Collections.reverse(strList);
        print(8, strList);
        int[] array = new int[]{1, 2, 3};
        print(9, array[1]);

    }

    public static void demoSet() {
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 4; i++) {
            strSet.add(String.valueOf(i));

        }
        print(1, strSet);
        strSet.remove("1");
        print(2, strSet);
        print(3, strSet.contains("3"));
        strSet.addAll(Arrays.asList(new String[]{"A", "B", "C"}));
        print(4, strSet);

        for (String value : strSet) {
            print(5, value);
        }
        print(6, strSet.isEmpty());
        print(7, strSet.size());

    }

    public static void demoKeyValue() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + ":" + entry.getValue());

        }
        print(3, map.keySet());
        print(4, map.values());
        print(5, map.containsKey("2"));
        print(6, map.get("3"));//value
        map.replace("1", "A");
        print(7, map);
    }

    public static void demoException() {
        try {
            print(1, "hello");
            String s = null;
            s.indexOf("1");
            int a = 2;
            a = a / 0;
        } catch (NullPointerException npe) {
            print(3, "NPE");
        } catch (Exception e) {
            print(4, "Exception");
        } finally {
            print(2, "finally");
            //清理工作

        }
    }
/*    public static void demoException() throws Exception{
        print(1, "hello");
        int a = 2;
        a = a / 0;
    }*/
    public static void demoCommon(){
        Random random=new Random();
        random.setSeed(1);
        for(int i=0;i<4;i++){
            print(1,random.nextInt(100));//0~100
            print(2,random.nextDouble());//0~1
        }
        List<Integer> array= Arrays.asList(new Integer[]{1,2,3,4,5});
        print(3,array);
        Collections.shuffle(array);
        print(4,array);

        Date date=new Date();
        print(5,date);
        print(6,date.getTime());
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        print(7,df.format(date));
        print(8,DateFormat.getDateInstance(DateFormat.FULL).format(date));//默认格式

        print(9,UUID.randomUUID());
        print(10,Math.max(1,2));
        print(11,Math.ceil(3.1));
        print(12,Math.floor(1.5));
        print(13,Math.log(2.71));//e


    }

    public static void demoClass(){
        Animal animal=new Animal("Jim",1);
        animal.say();
        animal=new Human(" li",2,"USA");
        animal.say();//多态
    }

    public static void main(String[] args) {
        // write your code here
        //System.out.println("hello world");
        // print(1, "hello world");
//        demoOperation();
//        demoControlFlow();
//        demoString();
//        demoList();
//        demoSet();
//        demoKeyValue();
//        demoException();
/*        try {
                demoException();

        } catch (NullPointerException npe) {
            print(3, "NPE");
        } catch (Exception e) {
            print(4, "Exception");
        } finally {
            print(2, "finally");
            //清理工作

        }*/
//        demoCommon();
        demoClass();
    }
}
