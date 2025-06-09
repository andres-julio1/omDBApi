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

### Ejemplos de casos de error en createBrand

| **Tipo de Error**             | **Descripción**                            | **Request invalido**                                             | **Response de error esperado**                                     |
| ----------------------------- | ------------------------------------------ | ---------------------------------------------------------------- | ------------------------------------------------------------------ |
| Campos obligatorios faltantes | El request no incluye campos obligatorios  | [Ver JSON Request](#request---campos---obligatorios---faltantes) | [Ver JSON Response](#response---campos---obligatorios---faltantes) |
| Formato inválido              | Campos con formato incorrecto              | [Ver JSON Request](#request---invalide---createbrand)            | [Ver JSON Response](#response---invalide---createbrand)            |
| Valores fuera de rango        | Valores numéricos fuera del rango esperado | [Ver JSON Request](#request---invalide---createbrand)            | [Ver JSON Response](#response---invalide---createbrand)            |

---
### Error 1: Campos obligatorios faltantes

### Request - campos - obligatorios - faltantes

```json
{
  "description": "Test",
  "logo": "https://logo",
  "cover": "https://cover",
  "fyf": { "active": false },
  "priority": 1,
  "score": 50,
  "createdBy": "ajppepe"
}
```

---

### Response - campos - obligatorios - faltantes

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "merchantId",
      "message": "El campo merchantId es obligatorio"
    },
    {
      "field": "name",
      "message": "El campo name es obligatorio"
    }
  ]
}
```

---
