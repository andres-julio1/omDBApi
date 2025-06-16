# Sección detallada de la asignación

### [Volver a la tabla de endpoints `assignCategories`](service-documentation-endpoints-assign-category.md#table-assign-categories)

### Detalle técnico del endpoint assignCategories

Este documento describe en detalle el funcionamiento del endpoint **`assignCategories`**, utilizado para asignar categorías a la marca en el sistema. A continuación se presentan la estructura del request y response JSON.

**URL:**

```http
POST http://localhost:8080/api/v1/brands/assignCategories
```

Descripción:
Este endpoint permite asignar una o más categorías a una marca existente, utilizando su identificador único **(`brandId`)** y una lista de identificadores de categorías **(`categories`)** que se desean asociar.

---

<a name="request-assign-categories"></a>

### Request - assignCategories

**Body:**

```json
{
  "brandId": "17081",
  "categories": ["6848b2c4c2451125c2f73810"]
}
```

---

<a name="response-assign-categories"></a>

### Response - assignCategories

**Response code:**  
`200 OK`

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
    "categories": [
      {
        "id": "6848b2c4c2451125c2f73810",
        "name": "Calzado"
      }
    ],
    "tags": null
  }
}
```

---
