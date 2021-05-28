package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        iOperations = new IOperation[] {
                new EixtOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
        };
    }

    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎 "+this.name+" 进入图书管理系统");
        System.out.println("-----------普通用户菜单-----------");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("-------------------------------");

        return scanner.nextInt();
    }
}
