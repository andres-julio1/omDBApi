## Ejemplo de transacción exitosa - Endpoint: Crear categoría (createBrand)

**URL:**  
`http://localhost:8080/api/v1/brands`

| **Servicio** | **Funcionalidad** | **Request válido** | **Response exitoso** |
|--------------|-------------------|--------------------|----------------------|
| `svc-rewards-co-createbrand` | `POST /api/v1/brands` | [Ver JSON Request](#request-createbrand) | [Ver JSON Response](#response-createbrand) |

---

### 📤 Request - createBrand
```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
  "logo": "https://bills-assets.s3.amazonaws.com/iconos/logo_bills.svg",
  "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
  "fyf": {
    "active": false
  },
  "priority": 5,
  "score": 80,
  "createdBy": "ajppepe"
}
```
### 📥 Response - createBrand
```json
{
  "code": "200",
  "message": "SUCCESS",
  "messageId": "peace757",
  "data": {
    "id": "6846e88c4ee0585b0fbde85f",
    "merchantId": "23015",
    "name": "Nike",
    "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
    "logo": "https://bills-assets.s3.amazonaws.com/iconos/logo_bills.svg",
    "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
    "benefits": null,
    "fyf": {
      "active": false,
      "numbers": null
    },
    "priority": 5,
    "score": 80.0,
    "creationDate": "2025-06-09T08:58:35.296917Z",
    "modificationDate": "2025-06-09T08:58:35.296917Z",
    "createdBy": "ajppepe",
    "categories": null,
    "tags": null
  }
}
```

