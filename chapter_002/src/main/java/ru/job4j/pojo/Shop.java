package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        Shop shop = new Shop();
        products = shop.delete(products, 2);

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
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
            products[i + 1] = null;
        }
        return products;
    }
}
