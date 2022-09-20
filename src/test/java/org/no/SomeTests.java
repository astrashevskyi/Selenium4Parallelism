package org.no;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//@Execution(ExecutionMode.SAME_THREAD)
public class SomeTests {
    private WebDriver driver;

    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupEach() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDownEach() {
        System.out.println("test finished");
        driver.quit();
    }

    @Test
    public void test1() {
        System.out.println("test 1 started");
        driver.get("http://gooogle.com");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    @Execution(ExecutionMode.SAME_THREAD)
    public void test2(int value) {
        System.out.println("test 2 started");
        System.out.println("Printing some value: " + value);
        driver.get("http://gooogle.com");
    }

    @Test
    public void test3() {
        System.out.println("test 3 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test4() {
        System.out.println("test 4 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test5() {
        System.out.println("test 5 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test6() {
        System.out.println("test 6 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test7() {
        System.out.println("test 7 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test8() {
        System.out.println("test 8 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test9() {
        System.out.println("test 9 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test10() {
        System.out.println("test 10 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test11() {
        System.out.println("test 11 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test12() {
        System.out.println("test 12 started");
        driver.get("http://gooogle.com");
    }

    @Test
    public void test13() {
        System.out.println("test 13 started");
        driver.get("http://gooogle.com");
    }
}
