[⬅ Volver a la tabla de endpoints(`createCategory`)](README.md)
# Sección detallada de creación (`createCategory`)
**URL:** 
```http
POST http://localhost:8080/api/v1/brands
```
---

### Request - createBrand
**Body:**
```json
{
  "merchantId": "17081",
  "name": "Nike",
  "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
  "fyf": {
    "active": false,
      "numbers":[
        "1234567891",
        "1239567896"
      ]
  },
  "priority": 5,
  "score": 80,
  "createdBy": "afpernett"
}
```

---

### Response - createBrand
**Response code:**  
`200 OK`

**Response body:**
```json
{
  "code": "200",
  "message": "SUCCESS",
  "messageId": "peace757",
  "data": {
    "id": "6846e88c4ee0585b0fbde85f",
    "merchantId": "17081",
    "name": "Nike",
    "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
    "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
    "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
    "benefits": null,
    "fyf": {
      "active": false,
      "numbers": ["3134356789", "3204567890"]
    },
    "priority": 5,
    "score": 80.0,
    "creationDate": "2025-06-09T08:58:35.296917Z",
    "modificationDate": "2025-06-09T08:58:35.296917Z",
    "createdBy": "afpernett",
    "categories": null,
    "tags": null
  }
}
```


