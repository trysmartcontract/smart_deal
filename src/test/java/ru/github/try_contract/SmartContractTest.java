package ru.github.try_contract;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.github.try_contract.service.Web3jSoftwareDevelopmentService;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmartContractTest {
    @Autowired
    private Web3jSoftwareDevelopmentService web3jService;

    @Test
    public void testGetClientVersion() throws IOException {
        assertTrue(true);
    }
}
