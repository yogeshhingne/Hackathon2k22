import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  getProducts(){
    return [
      {
        "id":1,
        "name":"watch",
        "price":1000,
        "brand":"titan"
      },
      {
        "id":2,
        "name":"laptop",
        "price":100000,
        "brand":"Dell"
      },
      {
        "id":3,
        "name":"Mobile",
        "price":10000,
        "brand":"Realme"
      }
    ]
  }

  constructor() { }
}
