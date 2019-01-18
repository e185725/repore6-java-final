package jp.ac.uryukyu.ie.e185725;

import java.util.*;

/**
 *判定を行うクラス
 *
 * int eat //同じ位の数字が等しかった場合に+1
 * int bite //位は違うが数字が等しかった場合+1
 * int try_count //試行の回数
 */
public class Play {
    /**
     *コンストラクタ。入力を行う。
     * @param num　//桁数
     * @param list //0~9の数値が格納されている配列
     */
    public Play(int num, int[] list) {
        int[] answer;
        answer = new int[num];
        int eat = 0;
        int bite;
        int try_count = 1;

        while (eat < num) {
            eat = 0;
            bite = 0;

            System.out.println(try_count + "回目" + "あなたの数字を入力してね");
            Scanner sc_1 = new Scanner(System.in);
            int c = sc_1.nextInt();
            answer[0] = c / 100;     //3桁目
            answer[1] = c / 10 - c / 100 * 10;   //2桁目
            answer[2] = c - (c / 100 * 100 + (c / 10 - c / 100 * 10) * 10);  //一桁目

            /**
             * ここから判定を行うコード
             */
            if (c >=1000 || c< 100){
                System.out.println("無効 3桁にしてね");
                continue;
            }
            if (answer[0]== answer[1] || answer[0]==answer[2]||answer[1]==answer[2]) {
                System.out.println("無効な数字です");
                System.out.println("重複させないでね");
                continue;  //重複してた場合入力に戻る
            }
            //eat判定↓
            for (int i = 0; i < num; i++) {
                if (list[i] == answer[i])
                    eat++;
            }
            //bite判定↓
            if (list[0] == answer[1] || list[0] ==  answer[2])
                bite++;
            if (list[1] == answer[0] || list[1] == answer[2])
                bite++;
            if (list[2] == answer[0] || list[2] == answer[1])
                bite++;
            //出力↓
            System.out.println(eat+"eat");
            System.out.println(bite+ "bite" );
            try_count++;
        }
    }
}
