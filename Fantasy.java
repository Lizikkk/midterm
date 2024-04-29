package midterm.lizi_zarkua_1.task1;

import java.util.ArrayList;
import java.util.List;


public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName = "Lizi Zarkua";


    public String toString() {
        return "Fantasy by " + studentName;
    }


    public String getCover1() {
        return "Cover Image URL";
    }

    public String getRabbit2() {
        return "Rabbit Information";
    }


    public String methodDynamics3(String argMarket5) {
        return "Method Dynamics 3 Result";
    }


    public List<String> methodBus4(String argSort6) {
        List<String> resultList = new ArrayList<>();
        resultList.add("Item 1");
        resultList.add("Item 2");
        resultList.add("Item 3");
        return resultList;
    }
}
