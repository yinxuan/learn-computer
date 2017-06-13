package Mora_game;

import java.util.Scanner;

/**
 * Created by s on 2017/6/13.
 */
public class Game {
    private Player player;

    public Game(Player player) {
        this.player = player;
    }
    public void start() {
        System.out.println("开始游戏");
        System.out.println(player.getName()+"进入游戏，初始积分为"+player.getScore());
        String[] arr = new String[]{"剪刀","石头","布"};
        System.out.println("请输入剪刀、石头、布其中之一，退出请输入exit");
        Scanner sc = new Scanner(System.in);

        while(true) {
            String s1 = sc.next();      //玩家的输入
            if(!filter(s1)) {
                System.out.println("您输入的命令有误，请重新输入");
                continue;
            }
            if(s1.equals("exit")) {
                break;
            }
            int count = (int)(Math.random()*3);         //0~2
            String s2 = arr[count];
            int flag = rule(s1,s2);
            System.out.println("您出的是：" + s1 + " 系统出的是" + s2);
            if(flag > 0) {
                System.out.println("恭喜" + player.getName() + "赢了，奖励10积分");
                player.setScore(player.getScore() + 10);
            }else if(flag < 0) {
                System.out.println("对不起" + player.getName() + " 输了，扣10积分");
                player.setScore(player.getScore() - 10);
            }else {
                System.out.println("打平了");
            }
            System.out.println(player);
        }
        System.out.println(player.getName()+"退出了游戏，当前积分为" + player.getScore());
    }

    //过滤输入信息的方法
    public boolean filter(String s) {
        if("剪刀".equals(s) || "石头".equals(s) || "布".equals(s) || "exit".equals(s)) {
            return true;
        }else {
            return false;
        }
    }
    //游戏规则
    public int rule(String s1,String s2) {
        if(s1.equals(s2)) {
            return 0;
        }
        if(s1.equals("剪刀")) {
            if(s2.equals("石头")) {
                return -1;
            }
            if(s2.equals("布")) {
                return 1;
            }
        }

        if(s1.equals("石头")) {
            if(s2.equals("布")) {
                return -1;
            }
            if(s2.equals("剪刀")) {
                return 1;
            }
        }

        if(s1.equals("布")) {
            if(s2.equals("剪刀")) {
                return -1;
            }
            if(s2.equals("石头")) {
                return 1;
            }
        }

        return 0;
    }

}
