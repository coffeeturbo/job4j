package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Pepsi", 19);
        products[4] = new Product("Tea", 192);

        Shop shop = new Shop();
        products = shop.delete(products, 1);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    /**
     * удаляем значение из ячейки с индексом index
     * @param products
     * @param index
     * @return
     */
    public Product[] delete(Product[] products, int index) {
        System.out.println("Удаляем значение из ячейки с индексом index");

        for (int i = index - 1; i < products.length; i++) {
            products[i] = (products.length > i + 1) ? products[i + 1] : null;
        }
        return products;
    }
}
