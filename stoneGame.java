import java.util.Random;
import java.util.Scanner;

public class stoneGame {
    public static void stoneGame() {
        var sc = new Scanner(System.in);
        var forCounter = 0;
        int stoneCounter = 25;
        String[] player = {"A", "B"};
        String who="";


        System.out.println("""
                ------------------------------
                石取りゲームを開始します。
                ------------------------------
                １度に取れる石の数：3個
                ------------------------------
                残り:25個
                ●●●●●●●●●●●●●●●●●●●●●●●●●
                """);


        for (var i = 0; stoneCounter >= 0; i++) {
            if (forCounter % 2 == 0) {
                who = player[0];
            } else {
                who = player[1];
            }

            System.out.println("------------------------------");
            System.out.println("プレイヤー" + who + "の番");
            System.out.println("石の数を入力してください。（1〜3まで入力可能です。）");


            var input = sc.nextInt();
            stoneCounter -= input;

            if(stoneCounter>0) {
                for (var j = 0; j < stoneCounter; j++) {
                    System.out.print("●");

                }
                System.out.println("");
                forCounter++;
            }else {
                break;
            }




        }
        forCounter++;
        if (forCounter % 2 == 0) {
            who = player[0];
        } else {
            who = player[1];
        }
        System.out.println("勝者：プレイヤー"+who);
    }

    }






