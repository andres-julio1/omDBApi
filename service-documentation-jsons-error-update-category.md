# Sección detallada por cada error

### [Volver a la tabla de endpoints `updateCategory`](service-documentation-endpoints-update-category.md#table-error-update-category)

---

### Casos de error en `updateCategory`

## Error 1: Campos obligatorios faltantes

<a name="request-campos-obligatorios-faltantes-update-category"></a>

### Request - campos - obligatorios - faltantes(`updateCategory`)

**Body:**

```json
{
  "params": [
    {
      "field": "name",
      "value": "Nueva"
    }
  ]
}
```

---

<a name="response-campos-obligatorios-faltantes-update-category"></a>

### Response - campos - obligatorios - faltantes(`updateCategory`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "category",
      "message": "El campo category es obligatorio."
    },
    {
      "field": "params",
      "message": "El campo params es obligatorio."
    }
  ]
}
```

---

## Error 2: JSON mal formado

<a name="request-json-mal-formado-update-category"></a>

### Request - JSON - mal - formado (`updateCategory`)

**Body:**

```json
{
  "category": "Comida",
  "params": [
    {
      "field": "name",
      "value": "Comida Nueva"
    },
    {
      "field": "iamge",
      "value": "nuevaImage.svg"
    }
  ]


```

---

<a name="response-json-mal-formado-update-category"></a>

### Response - JSON - mal - formado (`updateCategory`)

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

## Error 3: Params vacío o mal formado

<a name="request-params-vacío-update-category"></a>

### Request - params - vacío (`updateCategory`)

**Body:**

```json
{
  "params": [
    {
      "field": "null",
      "value": "Nueva"
    }
  ]
}
```

---

<a name="response-params-vacío-update-category"></a>

### Response - params - vacío (`updateCategory`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "params[0].field",
      "message": "El campo field no puede ser nulo o vacío."
    }
  ]
}
```

---

## Error 4: Campo duplicado

<a name="request-campo-duplicado-update-category"></a>

### Request - campo - duplicado (`updateCategory`)

**Body:**

```json
{
  "category": "Comida",
  "params": [
    {
      "field": "name",
      "value": "Cmonida Nueva"
    },
    {
      "field": "name",
      "value": "Comida Fria"
    }
  ]
}
```

---

<a name="response-campo-duplicado-update-category"></a>

### Response - campo - duplicado (`updateCategory`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "params",
      "message": "El campo 'name' está duplicado en los parámetros."
    }
  ]
}
```

---

## Error 5: Campo no permitido

<a name="request-campo-no-permitido-update-category"></a>

### Request - campo - no - permitido (`updateCategory`)

**Body:**

```json
{
  "category": "Comida",
  "params": [
    {
      "field": "id",
      "value": "123"
    }
  ]
}
```

---

<a name="response-campo-no-permitido-update-category"></a>

### Response - campo - no - permitido (`updateCategory`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "params[0].field",
      "message": "El campo 'id' no está permitido para ser actualizado."
    }
  ]
}
```

---

## Error 6: Categoría no encontrada

<a name="request-categoría-no-encontrada-update-category"></a>

### Response - categoría -no - encontrada (`updateCategory`)

**Body:**

```json
{
  "category": "Inexistente",
  "params": [
    {
      "field": "name",
      "value": "Cmonida Nueva"
    }
  ]
}
```

---
<a name="response-categoría-no-encontrada-update-category"></a>

### Request - categoría -no - encontrada (`updateCategory`)

**Response code:**  
`404 NOT_FOUND`

```json
{
  "code": "404",
  "message": "CATEGORY_NOT_FOUND",
  "errors": [
    {
      "field": "category",
      "message": "La categoría 'Inexistente' no fue encontrada."
    }
  ]
}
```
---
