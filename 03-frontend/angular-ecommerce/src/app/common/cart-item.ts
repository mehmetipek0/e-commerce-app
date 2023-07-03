import { Product } from "./product";

export class CartItem {

    id: number;   //YOU CHANGED THE TYPE OF THE ID FROM STRING TO NUMBER
    name: string;
    imageUrl: string;
    unitPrice: number;
    quantity: number;

    constructor(product: Product){
        this.id = product.id;
        this.name = product.name;
        this.imageUrl = product.imageUrl;
        this.unitPrice = product.unitPrice;

        this.quantity = 1;
    }
}
