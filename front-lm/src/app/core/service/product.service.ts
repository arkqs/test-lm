import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AddProduct, Product } from '../type/product';

@Injectable({ providedIn: 'root' })
export class ProductService {
    private apiUrl = 'http://localhost:8080';
    constructor(private http: HttpClient) {}

    getProduits(): Observable<Product[]> {
        return this.http.get<Product[]>(`${this.apiUrl}/produits`);
    }

    addProduit(product: AddProduct): Observable<Product> {
        return this.http.post<Product>(`${this.apiUrl}/produits`, product);
    }
}
