package com.stackroute.unittest.pe2;

import org.junit.Assert;
import org.junit.Test;

public class FileExtensionTest {
    FileExtension fileExtension = new FileExtension();
    @Test
    public void fileExtension(){
        assertEquals("FileDemo.txt", fileExtension.fileList());
    }
}
