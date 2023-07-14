package Patron_Builder_my_company;

public class Main {

    public static void main(String[] args) {
        int productID = 1;

        ProductModel product1 = new ProductModel.Builder(1, "Producto 1", "Modelo 1")
                .withProductPicture("img1.jpg")
                .withUnitPrice(9.99)
                .withUnitsInStock(100)
                .build();

        ProductModel product2 = new ProductModel.Builder(2, "Producto 2", "Modelo 2")
                .withProductPicture("img2.jpg")
                .withUnitPrice(19.99)
                .withUnitsInStock(50)
                .withUnitsOnOrder(10)
                .withDiscontinued(false)
                .build();
        // Crea más objetos ProductModel utilizando la sobrecarga permitida
        ProductModel product3 = new ProductModel.Builder(3, "Producto 3", "Modelo 3")
                .withUnitPrice(14.99)
                .withUnitsInStock(200)
                .build();

        //-----------------------------------------------------------------------------------------------------------------------
        //Se utiliza un StringBuilder llamado queryBuilder para construir la consulta SQL UPDATE de forma eficiente.

        ProductModel product = new ProductModel.Builder(1, "Producto 1", "Modelo 1")
                .withProductPicture("imagen1.jpg")
                .withUnitPrice(9.99)
                .withUnitsInStock(100)
                .build();

        //esta parte del código se encarga de generar la consulta SQL UPDATE and INSERT utilizando el método updateProduct()

        String insertQuery = ProductSqlQueryBuilder.insertProduct(product);
        System.out.println("Consulta SQL INSERTAR: " + insertQuery);

        String updateQuery = ProductSqlQueryBuilder.updateProduct(product);
        System.out.println("Consulta SQL UPDATE(SUBIR): " + updateQuery);

        String deleteQuery = ProductSqlQueryBuilder.deleteProduct(productID);
        System.out.println("Consulta SQL DELETE(Eliminar): " + deleteQuery);

    }
}
