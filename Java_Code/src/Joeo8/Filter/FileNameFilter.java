package Joeo8.Filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 0:09
 * Description: No Description
 */
public class FileNameFilter {
    public static void main(String[] args) {
        File file = new File("C:\\JavaSE_Code");
        getAll(file);
    }

    public static void getAll(File file) {
        /*//使用匿名内部类实现FileNameFilter
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
            //因为FileNameFilter中有两个参数,所以将其封装成一个新的File类型进行整体操作
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/
        //使用Lambda表达式优化代码(使用条件：实现接口中也只有一个抽象方法时可以使用)
        File[] files = file.listFiles((dir, name) -> new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java"));
        for (File f : files
        ) {
            if (f.isDirectory()) {
                getAll(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
