[⬅ Volver a la tabla de endpoints (`createCategory`)](service-documentation-endpoints-create-category-dos.md)

# Sección detallada de creación (`createCategory`)

**URL:**

```http
POST http://localhost:8080/api/v1/categories
```

---

### Request - createCategory

**Body:**

```json
{
  "name": "Ropa",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": 0,
  "active": false
}
```

---

### Response - createCategory

**Response code:**  
`200 OK`

```json
{
  "code": "200",
  "message": "SUCCESS",
  "messageId": "peace757",
  "data": {
    "id": "6846ea754ee0585b0fbde860",
    "name": "Ropa",
    "image": "https://cdn.example.com/logos/indu.png",
    "creationDate": "2025-06-09T09:06:45.681093Z",
    "modificationDate": "2025-06-09T09:06:45.681093Z",
    "createdBy": "Juan Julio",
    "priority": 0,
    "active": false
  }
}
```

---


# Sección detallada por cada error (`createCategory`)

---

## Error 1: Campos obligatorios faltantes

### Request - campos - obligatorios - faltantes

**Body:**

```json
{
  "name": "",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": 0,
  "active": false
}
```

---

### Response - campos - obligatorios - faltantes

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
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
  "name": "Calzado",
  "image": "no-es-una-url",
  "createdBy": "Juan Julio",
  "priority": 0,
  "active": false
}
```

---

### Response - formato - inválido

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "image",
      "message": "El campo image debe ser una URL válida."
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
  "name": "Ropa",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": 18,
  "active": false
}
```

---

### Response - longitud - inválida

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "priority",
      "message": "El campo priority debe ser un número con rango (0-15)."
    }
  ]
}
```

---

## Error 4: Valor inválido

### Request - valor - inválido

**Body:**

```json
{
  "name": "Comida",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": -1,
  "active": false
}
```

---

### Response - valor - inválido

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "priority",
      "message": "El campo priority no puede ser negativo, rango (0-15)."
    }
  ]
}
```

---

## Error 5: JSON mal formado

### Request - JSON - inválido

**Body:**

```json
{
  "name": "Moda",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": "0",
  "active": false
```

---

### Response - JSON - inválido

**Response code:**  
`400 BAD_REQUEST`

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

## Error 6: Categoría duplicada

### Request - nombre - duplicado

**Body:**

```json
{
  "name": "Calzado",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": 0,
  "active": false
}
```

---

### Response - nombre - duplicado

**Response code:**  
`409 CONFLICT`

```json
{
  "code": "409",
  "message": "CONFLICT",
  "errors": [
    {
      "field": "name",
      "message": "Ya existe una categoría con este nombre."
    }
  ]
}
```

---

## Error 7: Error inesperado del servidor

### Request - error - interno

**Body:**

```json
{
  "name": "Estética",
  "image": "https://cdn.example.com/logos/indu.png",
  "createdBy": "Juan Julio",
  "priority": 0,
  "active": false
}
```

---

### Response - error - interno

**Response code:**  
`500 INTERNAL_SERVER_ERROR`

```json
{
  "code": "500",
  "message": "INTERNAL_SERVER_ERROR",
  "errors": [
    {
      "field": null,
      "message": "Ha ocurrido un error inesperado. Por favor intente nuevamente más tarde."
    }
  ]
}
```

---
