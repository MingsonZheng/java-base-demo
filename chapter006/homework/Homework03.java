// ��ҵ
public class Homework03 {
    public static void main(String[] args) {
        
        Book book = new Book("Ц������", 300);
        book.info();
        book.updatePrice();
        book.info();
    }
}

/*
 ��д��Book�� ���巽��updatePrice��ʵ�ָ���ĳ����ļ۸�
 ����:����۸�>15,�����Ϊ150������۸�>100,����Ϊ100�����򲻱�

 ����
 1. ���� Book
 2. ���� price��name
 3. ������ updatePrice
 4. �β� ()
 5. ����ֵ void
 6. �ṩһ��������
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
        System.out.println("����=" + this.name + " �۸�=" + this.price);
    }
}