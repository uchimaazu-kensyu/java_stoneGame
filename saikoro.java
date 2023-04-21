import java.util.Scanner;
import java.util.Random;
public class saikoro {
    public static void saikoro() {

        var sc = new Scanner(System.in);
        var matchCounter =1;
        Random rand = new Random();


        int mySum =0;
        int opponentSum =0;
        int winCounter =0;
        int loseCounter=0;




        System.out.println("""
                ------------------------------
                サイコロゲームを開始します。
                ------------------------------
                サイコロを振る回数を指定してください。
                """);


        var input = sc.nextInt();
        sc.nextLine();
        var myContainar = new int[input];
        var opponentContainar = new int[input];
        var continueGame ="y";


        while (continueGame.equals("y")){

            System.out.println("------------------------------");
            System.out.println(matchCounter +"回目のゲーム");
            for(var i=0;i<input*2;i++) {
                int num = rand.nextInt(5) + 1;
                if(i<input){

                    myContainar[i]=num;
                }else if(i>= input){

                    opponentContainar[i-input]=num;
                }
            }



            System.out.print("あなたの出た目：");
            for(var e: myContainar){
                System.out.print(e);
                if (e != myContainar[myContainar.length - 1]) {  // 最後の要素以外の場合はカンマを出力
                    System.out.print(",");
                }
                mySum += e;
            }
            System.out.println("");
            System.out.println("合計値："+mySum);

            System.out.println("");

            System.out.print("コンピューターの出た目：");
            for(var e: opponentContainar){
                System.out.print(e);
                if (e != opponentContainar[opponentContainar.length - 1]) {  // 最後の要素以外の場合はカンマを出力
                    System.out.print(",");
                }
                opponentSum += e;
            }
            System.out.println("");
            System.out.println("合計値："+opponentSum);

            System.out.println("");

            if(mySum > opponentSum){
                System.out.println("あなたの勝ちです");
                winCounter +=1;
                System.out.println(winCounter+"勝"+loseCounter+"負です。");
            }else if(mySum < opponentSum){
                System.out.println("あなたの負けです");
                loseCounter +=1;
                System.out.println(winCounter+"勝"+loseCounter+"負です。");
            }else if(mySum == opponentSum){
                System.out.println("引き分けです");
                System.out.println(winCounter+"勝"+loseCounter+"負です。");
            }
            System.out.println("もう一度遊びますか：y or n");
            continueGame = sc.nextLine();
            matchCounter ++;



        }

















    }
}