# Sección detallada por cada error

### [Volver a la tabla de endpoints `assignCategories`](service-documentation-endpoints-assign-category.md#table-error-assign-categories)

---

## Casos de error en `updateCategory`

## Error 1: JSON mal formado

<a name="request-json-mal-formado-assign-categories"></a>

### Request - JSON - mal formado (`assignCategories`)

**Body:**

```json
{
    "brandId": "17081",
    "categories": [
}
```

---

<a name="response-json-mal-formado-assign-categories"></a>

### Response - JSON - mal - formado (`assignCategories`)

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

## Error 2: Campos obligatorios faltantes

<a name="request-campos-obligatorios-faltantes-assign-categories"></a>

### Request - campos - obligatorios - faltantes (`assignCategories`)

**Body:**

```json
{
  "categories": ["6848b2c4c2451125c2f73810"]
}
```

---

<a name="response-campos-obligatorios-faltantes-assign-categories"></a>

### Response - campos - obligatorios - faltantes (`assignCategories`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "brandId",
      "message": "El brandId es obligatorio."
    }
  ]
}
```

---

## Error 3: Campos vacíos

<a name="request-campos-vacíos-assign-categories"></a>

### Request - campos - vacíos (`assignCategories`)

**Body:**

```json
{
  "brandId": "17081",
  "categories": []
}
```

---

### Response - campos - vacíos (`assignCategories`)

<a name="response-campos-vacíos-assign-categories"></a>

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "categories",
      "message": "Debe proporcionar al menos una categoría."
    }
  ]
}
```

---

## Error 4: Marca no encontrada

<a name="request-marca-no-encontrada-assign-categories"></a>

### Request - marca - no - encontrada (`assignCategories`)

**Body:**

```json
{
  "brandId": "99999",
  "categories": ["6848b2c4c2451125c2f73810"]
}
```

---

<a name="response-marca-no-encontrada-assign-categories"></a>

### Response - marca - no - encontrada (`assignCategories`)

**Response code:**  
`404 NOT_FOUND`

```json
{
  "code": "404",
  "message": "NOT_FOUND",
  "errors": [
    {
      "field": "brandId",
      "message": "Marca con ID '99999' no encontrada."
    }
  ]
}
```

---

## Error 5: Categoría inexistente

<a name="request-categoría-inexistente-assign-categories"></a>

### Request - categoría - inexistente (`assignCategories`)

**Body:**

```json
{
  "brandId": "17081",
  "categories": ["invalido123456789012345678"]
}
```

---

<a name="response-categoría-inexistente-assign-categories"></a>

### Response - categoría - inexistente (`assignCategories`)

**Response code:**  
`404 NOT_FOUND`

```json
{
  "code": "404",
  "message": "NOT_FOUND",
  "errors": [
    {
      "field": "categories",
      "message": "Una o más categorías no existen."
    }
  ]
}
```

---

## Error 6: Categoría ya asignada

<a name="request-categoría-ya-asignada-assign-categories"></a>

### Request - categoría - ya - asignada (`assignCategories`)

**Body:**

```json
{
  "brandId": "17081",
  "categories": ["6848b2c4c2451125c2f73810"]
}
```

---

<a name="response-categoría-ya-asignada-assign-categories"></a>

### Response - categoría - ya - asignada (`assignCategories`)

**Response code:**  
`409 CONFLICT`

```json
{
  "code": "409",
  "message": "CONFLICT",
  "errors": [
    {
      "field": "categories",
      "message": "La categoría ya está asociada a la marca."
    }
  ]
}
```

---

## Error 7: Error interno del servidor

<a name="request-error-interno-assign-categories"></a>

### Request - error - interno (`assignCategories`)

**Body:**

```json
{
  "brandId": "17081",
  "categories": ["6848b2c4c2451125c2f73810"]
}
```

---

<a name="response-error-interno-assign-categories"></a>

### Response - error - interno (`assignCategories`)

**Response code:**  
`500 INTERNAL_SERVER_ERROR`

```json
{
  "code": "500",
  "message": "INTERNAL_ERROR",
  "errors": [
    {
      "field": null,
      "message": "Ha ocurrido un error inesperado. Intente nuevamente más tarde."
    }
  ]
}
```

---

### [Volver a la tabla de endpoints `assignCategories`](service-documentation-endpoints-assign-category.md#table-error-assign-categories)

---
