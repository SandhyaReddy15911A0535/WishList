import { Component, OnInit } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';



class Product{
productId:number;
productName:String;
productQuantity:number;
productPrice:number;
productDescription:String;
productRating:number;
categoryId:number;
merchantId:number;
productStatus:number;
}
class WishList{
  wishListId:number;
  productId:Product;
  customerId:number
}

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})

export class ProductsComponent implements OnInit {
  private headers = new HttpHeaders({ 'Content-type': 'application/json' });
  private options = { headers: this.headers }

  products: Product[]=[];
  product:Product
  list:WishList[]=[];
  

  constructor(private httpClient: HttpClient) { }
  

  ngOnInit() {

    
      this.httpClient.get<Product[]>( 'http://localhost:1111/getAll' ,this.options).subscribe(
        (response) => {
          console.log(response)
          this.products = response
        },
  
        (error) => {
          console.log(error)
          alert("Failed to fetch details");
        });
  }

  clickOnWishlist(id:number)
  {

    this.product=this.products[id]
    this.httpClient.post<Product[]>( 'http://localhost:1111/addProduct',JSON.stringify(this.product),this.options).subscribe(
        (response) => {
          console.log(response)
          alert("successfully added to ur wishlist")
        },
  
        (error) => {
          console.log(error)
          alert("Failed to add the products");
        });
  }
  myList()
  {
    this.httpClient.get<WishList[]>( 'http://localhost:1111/getWishList', this.options).subscribe(
        (response) => {
          console.log(response)
          
          this.list = response
        },
  
        (error) => {
          console.log(error)
          alert("Failed to fetch details");
        });
  }
  

}
