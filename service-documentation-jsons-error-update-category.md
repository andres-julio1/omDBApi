# Sección detallada por cada error
### [Volver a la tabla de endpoints `updateCategory`](service-documentation-endpoints-update-category.md#tabla-error--update-category)
---

### Casos de error en `updateCategory`

## Error 1: Campos obligatorios faltantes
<a name="request-campos-obligatorios-faltantes-update-category"></a>
### Request - campos - obligatorios - faltantes

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
### Response - campos - obligatorios - faltantes

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
