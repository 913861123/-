package user;

import com.sun.corba.se.spi.ior.Identifiable;
import operation.*;

import java.util.Scanner;

public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        iOperations = new IOperation[] {
                new EixtOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
         };
    }
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎 "+this.name+" 进入图书管理系统");
        System.out.println("-----------管理员菜单-----------");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("------------------------------");
        return scanner.nextInt();
    }
}
