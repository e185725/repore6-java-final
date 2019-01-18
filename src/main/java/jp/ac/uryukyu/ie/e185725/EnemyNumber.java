package jp.ac.uryukyu.ie.e185725;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 答えとなる値を出力するクラス
 */
public class EnemyNumber {
    /**
     * コンストラクタ。ランダムで3桁の値を出力する
     * @param keta　　//桁数
     * @param targetArray    //0~9が格納されている配列
     */
    public  EnemyNumber(int keta, int[] targetArray) {
        shuffle(targetArray);
        for (int i = 0; i < keta; i++) {
            //System.out.print(targetArray[i]);//play時はコメントアウト
        }
        //System.out.println("");
    }

    /**
     * 配列の中の順番をランダムにするメソッド
     * @param array  //0~9の値
     * webサイトより引用しました↓
     */
    public static void shuffle(int[] array) {
        // 配列が空か１要素ならシャッフルしようがないのので、そのままreturn
        if (array.length <= 1) {
            return;
        }
        // Fisher–Yates shuffle
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
    }
}