// 作业
public class Homework03 {
    public static void main(String[] args) {
        
        Book book = new Book("笑傲江湖", 300);
        book.info();
        book.updatePrice();
        book.info();
    }
}

/*
 编写类Book， 定义方法updatePrice，实现更改某本书的价格
 具体:如果价格>15,则更改为150，如果价格>100,更改为100，否则不变

 分析
 1. 类名 Book
 2. 属性 price，name
 3. 方法名 updatePrice
 4. 形参 ()
 5. 返回值 void
 6. 提供一个构造器
 */
class Book {
    
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        }
    }

    public void info() {
        System.out.println("书名=" + this.name + " 价格=" + this.price);
    }
}