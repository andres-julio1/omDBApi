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

````
