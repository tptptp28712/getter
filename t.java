package getter;

public class t {
	public static void main(String[] args) {
        // 呼び出し（new した後で、引数へ与えられた値を元に Pokemon が生成されます）
        Pokemon pikachu = new Pokemon("動物名：ライオン","体長：2.1m","速度：80km/h");
        // 使用時
        System.out.println(pikachu.name);
        System.out.println(pikachu.category);
        System.out.println(pikachu.type);
    }

}

class Pokemon {
    // フィールド変数
    public int number;
    public String name;
    public String category;
    public String type;
    public String description;
    public Pokemon(String name, String category, String type) {
       
        this.name = name;
        this.category = category;
        this.type = type;
       
    }
}
