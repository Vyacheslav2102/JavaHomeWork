package com.pb.muzyka.hw7;

/*
Создать пакет hw7 и в нем создать перечисление (enum) Size со значениями XXS, XS, S, M, L.
Перечисление содержит метод getDescription(), возвращающий строку для XXS "Детский размер",
для остальных "Взрослый размер". Так же перечисление должно иметь метод getEuroSize()
возвращающий числовое значение (32, 34, 36, 38, 40) соответствующее каждому размеру.
Создать конструктор принимающий на вход description и euroSize.

Создать интерфейсы
- ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
- WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
Эти методы не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).

Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.

Создать классы наследники Clothes:
- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
- Skirt (юбка) реализует интерфейс WomenClothes,
- Tie (галстук) реализует интерфейс ManClothes.

Создать класс Atelier с методом main, и еще двумя статическими методами:
dressMan(Clothes[] clothes)
dressWomen(Clothes[] clothes)
на вход которых будет поступать массив, содержащий все типы одежды.
В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
Метод dressWomen выводит на консоль всю информацию о женской одежде.
Метод dressMan выводит на консоль всю информацию о мужской одежде.
В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женская.

По желанию можно использовать внутренние классы.
 */


import java.util.Collection;

public class Atelier {

    enum Size {
        XXS("Детский размер", "32"),
        XS("Подростковый размер","34"),
        S("Подростковый размер","36"),
        M("Подростковый размер","338"),
        L("Взрослый размер","40");

        private String description;
        private String euroSize;

        Size(String description, String euroSize){
            this.description = description;
            this.euroSize = euroSize;

        }
        //возвращающий строку для XXS "Детский размер",
        //для остальных "Взрослый размер".
        String getDescription(){
            return this.description;
        };

        //возвращающий числовое значение (32, 34, 36, 38, 40) соответствующее каждому размеру.
        String getEuroSize(){
            return this.euroSize;
        }

        String getAll(Size size){
            return "Тип одежды : " + size.getDescription() + " и ее европейский размер : " + getEuroSize() + " и ее стандартный размер : " + name();
        }
    }


    //Создать интерфейсы
    //- ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
    //- WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
    //Эти методы не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).

    interface ManClothes {
        void dressMan();
    }
    interface WomenClothes {
        void dressWomen();
    }

    public static abstract class Clothes {
        protected Size size;
        protected String cost;
        protected String color;
        Clothes (Size size, String cost, String color){
           this.size = size;
            this.cost = cost;
            this.color = color;
        }

        public String getSize() {
            return size.getAll(size);
        }

        public String getCost() {
            return cost;
        }

        public String getColor() {
            return color;
        }
    }

    /*
    Создать классы наследники Clothes:
    - Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
    - Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
    - Skirt (юбка) реализует интерфейс WomenClothes,
    - Tie (галстук) реализует интерфейс ManClothes.
     */
    public static class Tshirt extends Clothes implements ManClothes,WomenClothes {


        Tshirt(Size size, String cost, String color){
            super(size,cost,color);
        }




        @Override
        public void dressMan() {
            System.out.println("На мужчину одеваем фудболку стоимостью " + this.getCost() + " и цветом " + this.getColor() + " и характеристиками размера :" + "\n" + this.getSize()+ "\n");
        }

        @Override
        public void dressWomen() {
            System.out.println("На женщину одеваем фудболку стоимостью " + this.getCost() + " и цветом " + this.getColor() + " и характеристиками размера :" + "\n" + this.getSize()+ "\n");
        }
    }
    public static class Pants extends Clothes implements ManClothes,WomenClothes{

        Pants(Size size, String cost, String color) {
            super(size, cost, color);
        }

        @Override
        public void dressMan() {
            System.out.println("На мужчину одеваем штаны стоимостью " + this.getCost() + " и цветом " + this.getColor() + " и характеристиками размера :" + "\n" + this.getSize()+ "\n");
        }

        @Override
        public void dressWomen() {
            System.out.println("На женщину одеваем штаны стоимостью " + this.getCost() + " и цветом " + this.getColor() + " и характеристиками размера :" + "\n" + this.getSize()+ "\n");
        }
    }
    public static class Skirt extends Clothes implements WomenClothes {

        Skirt(Size size, String cost, String color) {
            super(size, cost, color);
        }

        @Override
        public void dressWomen() {
            System.out.println("На женщину одеваем юбку стоимостью " + this.getCost() + " и цветом " + this.getColor() + " и характеристиками размера :" + "\n" + this.getSize()+ "\n");
        }
    }
    public static class Tie extends Clothes implements ManClothes {

        Tie(Size size, String cost, String color) {
            super(size, cost, color);
        }

        @Override
        public void dressMan() {
            System.out.println("На мужчину одеваем галстук стоимостью " + this.getCost() + " и цветом " + this.getColor() + " и характеристиками размера :" + "\n" + this.getSize()+ "\n");
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new Tshirt(Size.S, "300", "синий"),
                new Tshirt(Size.M, "350", ",белый"),
                new Pants(Size.XXS, "700", "зеленый"),
                new Pants(Size.XS, "900", "сине-красный"),
                new Skirt(Size.S, "600", "черный"),
                new Tie(Size.L, "900", "белый")
                };

        dressMan(clothes);
        System.out.println("\n\n");
        dressWomen(clothes);

    }

    public static void dressMan(Clothes[] clothes){
        for (int i=0; i<clothes.length; i++){
            if(clothes[i] instanceof ManClothes){
                ((ManClothes) clothes[i]).dressMan();
            }
        }

    }
    public static void dressWomen(Clothes[] clothes){
        for (int i=0; i<clothes.length; i++){
            if(clothes[i] instanceof WomenClothes){
                ((WomenClothes) clothes[i]).dressWomen();
            }
        }
    }
}
