package Patron_Builder_my_company;

public class ProductSqlQueryBuilder {

    //NOTA: queryBuilder es un objeto de la clase StringBuilder que se utiliza para construir la consulta SQL gradualmente.
    public static String insertProduct(ProductModel product) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("Nuevo Producto("); // Inicio de la consulta SQL: INSERT INTO products (
        queryBuilder.append("Nombre , Modelo, Imagen, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued"); // Lista de columnas
        queryBuilder.append(") VALUES ("); // Valores a insertar
        queryBuilder.append("'" + product.getProductName() + "', "); // Valor de ProductName
        queryBuilder.append("'" + product.getProductModel() + "', ");
        queryBuilder.append("'" + product.getProductPicture() + "', ");
        queryBuilder.append(product.getUnitPrice() + ", ");
        queryBuilder.append(product.getUnitsInStock() + ", ");
        queryBuilder.append(product.getUnitsOnOrder() + ", ");
        queryBuilder.append(product.getReorderLevel() + ", ");
        queryBuilder.append(product.isDiscontinued() ? 1 : 0); // Valor de Discontinued (convertido a 1 o 0)
        queryBuilder.append(")"); // Fin de la consulta SQL: )

        return queryBuilder.toString(); // Devuelve la consulta SQL generada como una cadena de texto
    }
    //PARA LA PREGUNTA D ------------------------------------
    public static String updateProduct(ProductModel product) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("UPDATE products SET "); // Inicio de la consulta SQL: UPDATE products SET

        // Establecer los valores a actualizar
        queryBuilder.append("ProductName = '" + product.getProductName() + "', "); // Valor de ProductName
        queryBuilder.append("ProductModel = '" + product.getProductModel() + "', ");
        queryBuilder.append("ProductPicture = '" + product.getProductPicture() + "', ");
        queryBuilder.append("UnitPrice = " + product.getUnitPrice() + ", ");
        queryBuilder.append("UnitsInStock = " + product.getUnitsInStock() + ", ");
        queryBuilder.append("UnitsOnOrder = " + product.getUnitsOnOrder() + ", ");
        queryBuilder.append("ReorderLevel = " + product.getReorderLevel() + ", ");
        queryBuilder.append("Discontinued = " + (product.isDiscontinued() ? 1 : 0)); // Valor de Discontinued (convertido a 1 o 0)

        queryBuilder.append(" WHERE ProductID = " + product.getProductID()); // Condición WHERE

        return queryBuilder.toString(); // Devuelve la consulta SQL generada como una cadena de texto
    }

    //PARA LA ULTIMA E------------------------------------------------------------

    public static String deleteProduct(int productID) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("DELETE FROM products"); // Inicio de la consulta SQL: DELETE
        queryBuilder.append(" WHERE ProductID = " + productID); // Condición WHERE: ProductID = <productID>

        return queryBuilder.toString(); // Devuelve la consulta SQL generada como una cadena de texto
    }


}
