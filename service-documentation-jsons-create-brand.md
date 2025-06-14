# Sección detallada de creación

### Detalle técnico del endpoint createBrand

Este documento describe en detalle el funcionamiento del endpoint createBrand, utilizado para registrar nuevas categorías en el sistema. A continuación se presentan la estructura del request y response JSON, junto con los posibles errores que pueden ocurrir durante su ejecución.

### [Volver a la tabla de endpoints (`createBrand`)](service-documentation-endpoints-create-brand.md)

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
    "numbers": ["1234567891", "1239567896"]
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

---

# Sección detallada por cada error

---

## Error 1: Campos obligatorios faltantes

### Request - campos - obligatorios - faltantes

**Body:**

```json
{
  "name": "",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 1,
  "score": 50,
  "createdBy": "afpernett"
}
```

---

### Response - campos - obligatorios - faltantes

**Response code:**  
`400 BAD_REQUEST`

**Response body:**

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "merchantId",
      "message": "El campo merchantId es obligatorio."
    },
    {
      "field": "name",
      "message": "El campo name es obligatorio."
    }
  ]
}
```

---

## Error 2: Formato inválido

### Request - formato - inválido

**Body:**

```json
{
  "merchantId": "23016",
  "name": "Tennis",
  "description": "Test",
  "logo": "no-es-una-url",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 1,
  "score": 50,
  "createdBy": "afpernett"
}
```

---

### Response - formato - inválido

**Response code:**  
`400 BAD_REQUEST`

**Response body:**

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "logo",
      "message": "El campo logo debe ser una URL válida."
    }
  ]
}
```

---

## Error 3: Longitud de campo inválido

### Request - longitud - inválida

**Body:**

```json
{
  "merchantId": "23017",
  "name": "Leo",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": -1,
  "score": 50,
  "createdBy": "afpernett"
}
```

---

### Response - longitud - inválida

**Response code:**  
`400 BAD_REQUEST`

**Response body:**

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "priority",
      "message": "El campo priority debe ser un número positivo, con rango (0-15)."
    }
  ]
}
```

---

## Error 4: Estructura inválida en objetos

### Request - objeto - inválido

**Body:**

```json
{
  "merchantId": "23018",
  "name": "Koaj",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": "Información sobre Friends and Family",
  "priority": 1,
  "score": 50,
  "createdBy": "afpernett"
}
```

---

### Response - objeto - inválido

**Response code:**  
`400 BAD_REQUEST`

**Response body:**

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "fyf",
      "message": "El campo fyf debe ser un objeto con propiedades válidas."
    }
  ]
}
```

---

## Error 5: Valor inválido

### Request - valor - inválido

**Body:**

```json
{
  "merchantId": "23010",
  "name": "Calzatodo",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 0,
  "score": "ochenta",
  "createdBy": "afpernett"
}
```

---

### Response - valor - inválido

**Response code:**  
`400 BAD_REQUEST`

**Response body:**

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "score",
      "message": "El campo score debe ser de tipo numérico."
    }
  ]
}
```

---

## Error 6: JSON mal formado

### Request - JSON - inválido

**Body:**

```json
{
  "merchantId": "23015",
  "name": "Flashy",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 0,
  "score": 8,
  "createdBy": "afpernett"

```

---

### Response - JSON - inválido

**Response code:**  
`400 BAD_REQUEST`

**Response body:**

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": null,
      "message": "Formato JSON inválido."
    }
  ]
}
```

---

## Error 7: Marca duplicada

### Request - merchantId - duplicado

**Body:**

```json
{
  "merchantId": "23017",
  "name": "Leo",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 0,
  "score": 80,
  "createdBy": "afpernett"
}
```

---

### Response - merchantId - duplicado

**Response code:**  
`409 CONFLICT`

**Response body:**

```json
{
  "code": "409",
  "message": "CONFLICT",
  "errors": [
    {
      "field": "merchantId",
      "message": "Ya existe una marca con el merchantId especificado."
    },
    {
      "field": "name",
      "message": "Ya existe una marca con el nombre especificado."
    }
  ]
}
```

---

## Error 8: Error inesperado del servidor

### Request - error - interno

**Body:**

```json
{
  "merchantId": "23055",
  "name": "Citybags",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 0,
  "score": 80,
  "createdBy": "afpernett"
}
```

---

### Response - error - interno

**Response code:**  
`500 INTERNAL_SERVER_ERROR`

**Response body:**

```json
{
  "code": "500",
  "message": "INTERNAL_SERVER_ERROR",
  "errors": [
    {
      "field": null,
      "message": "Ha ocurrido un error inesperado. Intente nuevamente más tarde."
    }
  ]
}
```

---

### [Volver a la tabla de endpoints (`createBrand`)](service-documentation-endpoints-create-brand.md)

---
