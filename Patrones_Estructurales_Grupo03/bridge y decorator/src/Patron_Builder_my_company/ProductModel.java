package Patron_Builder_my_company;


// Clase ProductModel que representa el producto
public class ProductModel {
    private int productID;
    private String productName;
    private String productModel;
    private String productPicture;
    private double unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private boolean discontinued;

    //PREGUNTA !!!!!! Nº2  AUTOINCREMENTO ----------------------------------------------------------------------
    private static int nextProductID = 1; // Variable estática para almacenar el próximo ID de producto

    private static int generateProductID() {
        return nextProductID++; // Devuelve el valor actual de nextProductID y luego incrementa su valor en 1
    }

    //----------------------------------------------------------------------------------------------------------

    // Constructor privado para evitar la creación directa de instancias de ProductModel
    private ProductModel() {
    }

    // Clase Builder para construir objetos ProductModel
    public static class Builder {
        private int productID;
        private String productName;
        private String productModel;
        private String productPicture;
        private double unitPrice;
        private int unitsInStock;
        private int unitsOnOrder;
        private int reorderLevel;
        private boolean discontinued;


        public Builder(int productID, String productName, String productModel) {
            this.productID = productID;
            this.productName = productName;
            this.productModel = productModel;
        }

        public Builder withProductPicture(String productPicture) {
            this.productPicture = productPicture;
            return this;
        }

        public Builder withUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder withUnitsInStock(int unitsInStock) {
            this.unitsInStock = unitsInStock;
            return this;
        }

        public Builder withUnitsOnOrder(int unitsOnOrder) {
            this.unitsOnOrder = unitsOnOrder;
            return this;
        }

        public Builder withReorderLevel(int reorderLevel) {
            this.reorderLevel = reorderLevel;
            return this;
        }

        public Builder withDiscontinued(boolean discontinued) {
            this.discontinued = discontinued;
            return this;
        }


        public ProductModel build() {
            ProductModel product = new ProductModel();
            product.productID = this.productID;
            product.productName = this.productName;
            product.productModel = this.productModel;
            product.productPicture = this.productPicture;
            product.unitPrice = this.unitPrice;
            product.unitsInStock = this.unitsInStock;
            product.unitsOnOrder = this.unitsOnOrder;
            product.reorderLevel = this.reorderLevel;
            product.discontinued = this.discontinued;
            return product;

        }
    }

    // Métodos getter para cada atributo

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public int getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }
}