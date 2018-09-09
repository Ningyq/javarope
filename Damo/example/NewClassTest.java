package com.company;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Coldwarm on 18/7/27.
 */
public class NewClassTest {
    public static void main(String[] args) {
        try {
            Constructor<File>constructor = File.class.getDeclaredConstructor(String.class);
            System.out.println("使用反射创建File对象");
            File file = constructor.newInstance("mr.txt");
            System.out.println("创建新文件");
            file.createNewFile();
            System.out.println("文件是否创建成功："+file.exists());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
