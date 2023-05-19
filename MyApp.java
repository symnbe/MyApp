// public class MyApp {
  
//   public static void main(String[] args) {
    
//     String msg = "Hello World Again!";
    
//     System.out.println(msg);
//   }
  
// }
    // 変数
    // 型　変数名
    // String msg;
    // msg = "Hello World Again!";
    
    //データ型
    //-------------------------------------------------------------------------------
    //文字　char a = 't'; 文字の場合はシングルクォーテーション
    //-------------------------------------------------------------------------------
    //整数　byte short int long(右に行くにつれて大きくなる（大体はintを使えばOK）)
    //→　int x = 10;
    // 注意！！　long y = 11111111L;(longを使用する場合は最後にLをつける)
    //--------------------------------------------------------------------------------
    // 浮動小数点数　float double(大体はより大きい桁数を扱うことのできるdoubleを使用！！)
    //double d = 32.195;
    //注意！！　float f = 42.195F;(floatを使用する場合は数値の最後にFをつける)
    //---------------------------------------------------------------------------------
    //論理値
    //boolean flag = true; or false;
    //-------------------------------------------------------------------------------
    //特殊文字
    // 改行 \n
    // タブ \t
    //----------------------------------------------------------------------------------
    //型の変換を行う場合は（希望型）型とする
    //-----------------------------------------------------------------------------------
    //条件分岐（短縮しない書き方はRailsに似ている）
    //条件演算子の短縮した書き方→　（例）String msg = score > 80 ? "Great!!" : "so so ...";
    //                                               スコアが80以上だったら？Great!! 他は so so...
    //----------------------------------------------------------------------------------------------
    
// public class MyApp {
//       public static void main(String[] args) {
//         //if
//         int score = 95;
//         if (score > 80) {
//           System.out.println("Great!!");
//         } else if (score > 60) {
//           System.out.println("Good!!");
//         } else {
//           System.out.println("so so...");
//         }
        
//     }
// }
    //-----------------------------------------------------------------------------------
    //条件分岐（短縮しない書き方はRailsに似ている）
    //条件演算子の短縮した書き方→　（例）String msg = score > 80 ? "Great!!" : "so so ...";
    //                                               スコアが80以上だったら？Great!! 他は so so...↓
    //----------------------------------------------------------------------------------------------
    
    // public class MyApp {
      
      
    //   public static void main(String[] args) {
        
    //     int score = 50;
    //     String msg = score > 80 ? "Great!!" : "so so...";
    //     System.out.println(msg);
        
    //   }
      
    // }
    //---------------------------------------------------------------------------------------------------
    //switch 文による条件分岐
    // public class MyApp {
      
    //   public static void main(String[] args) {
        
    //     String signal = "pink";
    //     switch (signal) {
          
    //       case "red":
    //       System.out.println("Stop!!");
    //       break;
    //       case "blue":
    //       case "green":
    //       System.out.println("Go!!");
    //       break;
    //       case "yellow":
    //       System.out.println("caution!!");
    //       break;
    //       default:
    //       System.out.println("wrong signal...");
    //       break;
          
    //     }
        
    //   }
      
    // }
    //------------------------------------------------------------------------------------------------------------
    
    //while で繰り返し処理する方法
    // public class MyApp {
      
    //   public static void main(String[] args) {
        
    //     int i = 9;
    //.  whileの場合は前処理の為int i =１０の場合なにも表示されない
    //     while(i < 10) {
    //       System.out.println(i);
    //       i++;
    //     }
    //.  do whileの場合は後処理の為int i = 10の場合１０が表示される
    //     do {
    //       System.out.println(i);
    //       i++;
    //     } while(i < 10);
        
    //   }
      
    // }
    //-----------------------------------------------------------------------------------------------------------------
    
    //for で繰り返し処理する方法
     public class MyApp {
         
         public static void main(String[] args) {
             
             for(int i = 0; i < 10; i++) {
             System.out.println(i);
                 
             }
             
             
         }
         
     }