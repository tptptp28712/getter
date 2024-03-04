package getter;
import java.util.*;
public class t {
	public static void main(String[] args) {
        // 呼び出し 
 Car car = new Car();
   car.work();
  }
} 
class Car {
    // 呼び出し
  Tanku tanku = new Tanku();
  public void work(){
      // 使用時
       System.out.println(tanku.getGas());
       System.out.println(tanku.getGas2());
       System.out.println(tanku.getGas3());
  }
}
 class Tanku {
     // フィールド変数
 private String name = "動物名：ライオン";
 private String category = "体長：2.1m";
 private String type = "速度：80km/h";
 public String getGas(){
   return this.name;
 } 
 public String getGas2(){
   return this.category;
 } 
 public String getGas3(){
   return this.type;
 } 
  
 }
