package haifa.jb.myapplication;

/**
 * Created by Android on 3/5/2018.
 */

public class PersonalPizza extends Pizza{

    @Override
    public void slicePizza(int numOfSlices) {
        if(numOfSlices>4)
        {
            System.out.println("slice PersonalPizza to"+ numOfSlices+" is not ok");
            return; //in this way we dont need to write the "else" statement after the "if" block
        }

        System.out.println("slice PersonalPizza to"+ numOfSlices+" is ok");
    }
}