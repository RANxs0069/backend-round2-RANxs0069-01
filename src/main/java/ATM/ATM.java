package ATM;

import javax.swing.*;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = 0;
        while(true){
            System.out.println("----------主菜单----------");
            System.out.println("查询余额请按1");
            System.out.println("存款请按2");
            System.out.println("取款请按3");
            System.out.println("退出请按4");

            if(!sc.hasNextInt()){
                System.out.println("请输入合法选项！");
                sc.next();
                continue;
            }

            int i = sc.nextInt();

            switch(i){
                case 1:
                    System.out.println("您的余额是" + money);
                    continue;
                case 2:
                    System.out.println("请输入存款数");

                    if(!sc.hasNextLong()) {
                        System.out.println("请输入数字！");
                        sc.next();
                        continue;
                    }

                    long dep = sc.nextLong();

                    if(dep < 0){
                        System.out.println("请输入正数");
                        continue;
                    }
                    money = money + dep;
                    System.out.println("您的余额是" + money);
                    continue;
                case 3:
                    System.out.println("请输入取款数");

                    if(!sc.hasNextLong()) {
                        System.out.println("请输入数字！");
                        sc.next();
                        continue;
                    }

                    long withdraw = sc.nextLong();

                    if(withdraw < 0) {
                        System.out.println("请输入正数");
                        continue;
                    }

                    if(withdraw <= money){
                        money = money - withdraw;
                        System.out.println("您的余额是" + money);
                    }else{
                        System.out.println("您的余额不足，无法取款！");
                        System.out.println("您的余额是" + money);
                    }
                    continue;
                case 4:
                    System.out.println("感谢使用！再见！");
                    return;
                default:
                    System.out.println("请输入合法的选项！");
            }

        }
    }


}
