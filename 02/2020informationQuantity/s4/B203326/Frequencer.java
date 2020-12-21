package s4.B203326; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID. 
import java.lang.*;
import s4.specification.*;

/*
interface FrequencerInterface {  // This interface provides the design for frequency counter.
    void setTarget(byte[] target);  // set the data to search.
    void setSpace(byte[] space);  // set the data to be searched target from.
    int frequency(); // It return -1, when TARGET is not set or TARGET's length is zero
                     // Otherwise, it return 0, when SPACE is not set or Space's length is zero
                     // Otherwise, get the frequency of TAGET in SPACE
    int subByteFrequency(int start, int end);
    // get the frequency of subByte of taget, i.e. target[start], taget[start+1], ... , target[end-1].
    // For the incorrect value of START or END, the behavior is undefined.
}
*/


public class Frequencer implements FrequencerInterface {
    // Code to Test, *warning: This code contains intentional problem*
    byte[] myTarget;
    byte[] mySpace;

    @Override
    public void setTarget(byte[] target) {
        myTarget = target;//検索するデータ
    }
    @Override
    public void setSpace(byte[] space) {
        mySpace = space;//検索されるデータ
    }

    @Override
    public int frequency() {//現れた頻度を返す
        int targetLength = myTarget.length;
        int spaceLength = mySpace.length;
        int count = 0;
        // System.out.println("spaceLength = "+spaceLength); //spaceLengthは検索される文字列の文字数
        // System.out.println("targetLength = "+targetLength); //targetLengthは検索する文字の文字数
        for(int start = 0; start < spaceLength; start++) { // Is it OK? (テストケース3ではstartは0~9)
            boolean abort = false;
            for(int i = 0; i < targetLength; i++) { //テストケース3ではiは0~1(ループ2周)
                if(myTarget[i] != mySpace[start+i]) { //ココ！！！！最後の要素の次の要素にアクセスしているからエラーが起こる
                    abort = true;
                    break;
                }
            }
            if(abort == false){
                count++; 
            }
        }
        // System.out.println("deb2"); //ここまで来ないからループ内でエラーが発生している
        return count;
    }

    // I know that here is a potential problem in the declaration.
    @Override
    public int subByteFrequency(int start, int length) {
        // Not yet implemented, but it is not currently used by anyone.
        return -1;
    }

    public static void main(String[] args) {
        Frequencer myObject;
        int freq;
        try {
            System.out.println("checking my Frequencer");
            myObject = new Frequencer();
            myObject.setSpace("Hik".getBytes()); //検索対象のデータを設定(HiHだとエラーが発生)
            myObject.setTarget("Hi".getBytes()); //検索するデータを設定
            // System.out.println("deb1");
            freq = myObject.frequency(); //頻度をカウントする
            // System.out.println("deb3");
            System.out.print("\"HH\" in \"HHHHHHHH\" appears " + freq + " times. ");
            if(4 == freq){ 
                System.out.println("OK"); 
            }else{
                System.out.println("WRONG"); 
            }
        }
        catch(Exception e) {
            System.out.println("Exception occurred: STOP");
        }
    }
}
