# Sección detallada por cada error
### [Volver a la tabla de endpoints `updateCategory`](service-documentation-endpoints-update-category.md#tabla-error--update-category)
---

### Casos de error en `updateCategory`

## Error 1: Campos obligatorios faltantes

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
