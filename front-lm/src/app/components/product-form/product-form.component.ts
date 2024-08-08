import { Component } from "@angular/core";
import { ProductService } from "../../core/service/product.service";
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";

@Component({
  selector: "product-form",
  templateUrl: "./product-form.component.html",
  styleUrls: ["./product-form.component.css"],
  standalone: true,
  imports: [FormsModule, CommonModule],
})
export class ProductFormComponent {
  nom: string = "";
  prix: number = 0;

  showError: boolean = false;

  constructor(private productService: ProductService) {}

  sendProduct() {
    if (
      typeof this.nom !== "string" ||
      typeof this.prix !== "number" ||
      this.nom.length === 0 ||
      this.prix < 0 ||
      (this.prix * 100) % 1 !== 0
    ) {
      this.showError = true;
      return;
    }
    this.productService
      .addProduit({
        nom: this.nom,
        prix: this.prix,
      })
      .subscribe(() => {
        window.location.reload();
      });
  }
}
