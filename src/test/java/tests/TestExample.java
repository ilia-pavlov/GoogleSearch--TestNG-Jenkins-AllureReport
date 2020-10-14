package tests;

import org.testng.annotations.Test;
import utilites.Log;

public class TestExample {
    @Test (groups = {"smoke"})
    public void test01() {
        Log.info("test01");
    }

    @Test (groups = {"smoke","regression"})
    public void test02() {
        Log.info("test02");
    }

    @Test (groups = {"regression"})
    public void test03() {
        Log.info("test03");
    }
}
