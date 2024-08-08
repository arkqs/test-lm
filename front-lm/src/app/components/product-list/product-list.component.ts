import { Component, OnInit } from '@angular/core'
import { CommonModule } from '@angular/common';
import { Product } from '../../core/type/product'
import { ProductService } from '../../core/service/product.service';

@Component({
    selector: 'product-list',  
    templateUrl: './product-list.component.html',
    styleUrls: ['./product-list.component.css'],
    standalone: true,
    imports: [
        CommonModule
    ],
})
export class ProductListComponent implements OnInit {
    produits: Product[] = [];

    constructor(private productService: ProductService) {}

    ngOnInit(): void {
        this.productService.getProduits().subscribe((data: Product[]) => {
            this.produits = data
        })
    }
}