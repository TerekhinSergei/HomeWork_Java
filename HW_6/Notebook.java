public class Notebook {
    private String name;
    private int ram;
    private int ssd;
    private double diagonal;
    private String os;
    private String color;    
    private int price;

    public Notebook(String name, int ram, int ssd, double diagonal, String os, String color, int price){        
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.diagonal = diagonal;
        this.os = os;
        this.color = color;        
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Модель: %s\n  объем оперативной памяти: %d Гб\n  объем накопителя %d Гб \n  Диагональ %.1f \n  ОС %s \n  Цвет %s \n  Цена: %d \n", 
                    this.name, this.ram, this.ssd, this.diagonal, this.os, this.color, this.price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Notebook) {
            return this.name.equals(((Notebook) obj).name) && this.ram == ((Notebook) obj).ram 
                                && this.ssd == ((Notebook) obj).ssd 
                                && this.diagonal == ((Notebook) obj).diagonal 
                                && this.os.equals(((Notebook) obj).os) 
                                && this.color.equals(((Notebook) obj).color) 
                                && this.price == ((Notebook) obj).price ;
        }
        return false;        
    }

    public int getRam(){
        return this.ram;
    }
    public int getSsd(){
        return this.ssd;
    }
    public double getDiagonal(){
        return this.diagonal;
    }
    public String getOS(){
        return this.os;
    }
    public int getPrice(){
        return this.price;
    }
}
