package com.sinochem.finance.hsy;

import com.sinochem.finance.hsy.mapper.TStorageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StorageGtsFescarExampleApplicationTests {

    @Autowired
    private TStorageMapper tStorageMapper;

    @Test
    public void contextLoads() {
        tStorageMapper.decreaseStorage("C201901140001",2);
    }

}

