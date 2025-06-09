# 4. TROUBLESHOOTING

4.1 **Ejemplo de transacción exitosa: Crear categoría (createBrand)**
_Incluir ejemplos de transacciones exitosas o enlaces a esta información, lo ideal es entender cuál es la correcta construcción de cada request y cómo es un response correcto. En lo posible, indicar las posibles pruebas funcionales del servicio_
<br>

| **Servicio**                 | **Funcionalidad** | **Request válido**                         | **Response exitoso**                         |
| ---------------------------- | ----------------- | ------------------------------------------ | -------------------------------------------- |
| `svc-rewards-co-createbrand` | `createBrand`     | [Ver JSON Request](#request---createbrand) | [Ver JSON Response](#response---createbrand) |

---

### Request - createBrand

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
---
### Response - createBrand

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

---

