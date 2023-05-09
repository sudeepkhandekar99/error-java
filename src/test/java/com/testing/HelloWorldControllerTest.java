package com.testing;

import static com.testing.HelloWorldController.MESSAGE_KEY;
import static org.assertj.core.api.Assertions.assertThat;

import java.net.UnknownHostException;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldControllerTest {

    private Map<String, String> result;
    
    @InjectMocks
    private HelloWorldController controller;

    @Test
    public void responseShouldContainHelloWorldKey() throws UnknownHostException {
        result = controller.helloWorld();
        
        assertThat(result).containsKey(MESSAGE_KEY);
    }

    @Test
    public void responseShouldContainError() throws UnknownHostException {
        int[] error_ar = {1,2,3};
        int error_trigger = error_ar[4];
        result = controller.err();

        assertThat(result).containsKey(MESSAGE_KEY);
    }
    
}
