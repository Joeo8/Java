package Joeo8.Filter;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 22:53
 * Description: No Description
 */
public class FileFilter implements java.io.FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory()|| pathname.getName().toLowerCase().endsWith(".java");
    }
}
