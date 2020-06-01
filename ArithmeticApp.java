import java.util.*;

public class ArithmeticApp{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()){
        String lineOne = sc.nextLine();
        String[] numericStrings = lineOne.split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String num : numericStrings){
            nums.add(Integer.parseInt(num));
        }
        if (!sc.hasNextLine()){
            System.err.println("No next line for this scenario");
            sc.close();
            return;
        }
        String lineTwo = sc.nextLine();
        String[] targetMethod = lineTwo.split(" ");
        if (targetMethod.length != 2){
            System.err.println("Invalid input for scenario, trying to use next scenario.");
            continue;
        }
        int target = Integer.parseInt(targetMethod[0]);
        String method = targetMethod[1];
        System.out.println(nums);
        System.out.println("target: " + target + ", method: " + method);

        if (method.equals("L")){
            // ToDo: calculate left to right method gets called here
           // System.out.println("@@@@@@L -> R@@@@@@@");
           // System.out.println("Nums length " + nums.size());
           // System.out.println("Nums zero " + nums.get(0));
            String result = Arithmetic.leftToRight(nums, "", target);
            System.out.println(result);
            
        } else if (method.equals("N")) {
            // ToDo: calculate normal method gets called here
            System.out.println("Normal");

        } else {
            System.err.println("Invalid method \"" + method +"\". Trying next Scenario");
            continue;
        }
    }
    sc.close();
    }
}
