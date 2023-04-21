import java.util.Scanner;

public class stoneGame2 {
    public static void isitori() {
        var sc = new Scanner(System.in);
        var forCounter = 0;
        int stoneCounter = 25;
        int playerNum = 0;
        var atOnce = 3;

        int whoNum = 0;
        String who = "";


        System.out.println("""
                ------------------------------
                石取りゲームを開始します。
                ------------------------------""");

        System.out.println("初めに石の総数を決めてください(デフォルト：25個)");
        var stoneQantity = sc.nextInt();
        stoneCounter = stoneQantity;

        System.out.println("1度に取れる石の数を決められます(デフォルト:3まで)");
        atOnce = sc.nextInt();


        System.out.println("プレイヤーの人数を指定してください");
        playerNum = sc.nextInt();
        var player = new String[playerNum];

        sc.nextLine();
        for (var i = 0; i < playerNum; i++) {
            System.out.println("プレイヤー" + (i + 1) + "の名前を入力してください。");
            player[i] = sc.nextLine();
        }

            System.out.println("石の記号を指定してください。");
            String stone= sc.nextLine();



        System.out.println("残り：" + stoneCounter + "個です。");
        for (var k = 0; k < stoneCounter; k++) {
            System.out.print(stone);
        }
        System.out.println("");


        whoNum = stoneCalc(stoneCounter, whoNum, forCounter, player, atOnce, playerNum,stone);
//        var winner = whoWin(whoNum);
//        System.out.println("勝者：プレイヤー" + player[winner]);



        System.out.print("勝者は");
        for (var e : player) {
            if(e.equals(player[whoNum])){
                continue;
            }
            System.out.print(e);
            if (e != player[player.length - 1]) {  // 最後の要素以外の場合はカンマを出力
                System.out.print(",");
            }
        }
        System.out.print("です！");
    }




        public static int whoJudge ( int forCounter, int playerNum){

            if (forCounter >= playerNum) {
                forCounter = 0;
            }
            return forCounter;
        }


        // 石を減らしていって、勝者を数字で返す。
    public static int stoneCalc(int stoneCounter,int whoNum,int forCounter,String[] player,int atOnce,int playerNum,String stone){


        var sc = new Scanner(System.in);
        whoNum = whoJudge(forCounter,playerNum);
        forCounter = whoNum;

        System.out.println("------------------------------");
        System.out.println("プレイヤー" + player[whoNum] + "の番");
        System.out.println("石の数を入力してください。（1〜"+atOnce+"まで入力可能です。）");

        //入力を受け付け、一度の限界より大きい場合、訂正を求め、正しい値が入ったら、stoneCounterから減じて返す。
        var input = sc.nextInt();
        if(atOnce<input){
            stoneCounter -= atOnceJudge(atOnce);
        }else {
            stoneCounter -= input;
        }

        if (stoneCounter > 0) {
            for (var j = 0; j < stoneCounter; j++) {
                System.out.print(stone);
            }
            System.out.println("");
            forCounter++;
            return stoneCalc(stoneCounter,whoNum,forCounter,player,atOnce,playerNum,stone);

        } else {
            return whoNum;
        }



    }




    public static int atOnceJudge(int atOnce){

        System.out.println("1〜"+atOnce+"までを入力してください");
        var sc = new Scanner(System.in);
        int oneMore = sc.nextInt();
        if (oneMore>atOnce) {
            return atOnceJudge(atOnce);
        } else {
            return oneMore;
        }
    }


//    public static int whoWin(int whoNum){
//        if (whoNum==0) {
//            return 1;
//        } else {
//            return 0;
//        }
//
//    }









    }







