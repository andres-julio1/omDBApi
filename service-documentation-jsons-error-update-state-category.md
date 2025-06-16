# Sección detallada por cada error

### [Volver a la tabla de endpoints `updateStateCategories`](service-documentation-endpoints-update-state-category.md#table-error-update-state-categories)

---

## Casos de error en `updateStateCategories

## Error 1: Campos obligatorios faltantes

<a name="request-campos-obligatorios-faltantes-update-state-categories"></a>

### Request - campos - obligatorios - faltantes (`updateStateCategories`)

**Body:**

```json
{
  "categoryId": "6843456b315d83253265dba1"
}
```

---

<a name="response-campos-obligatorios-faltantes-update-state-category"></a>

### Response - campos - obligatorios - faltantes (`updateStateCategories`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "active",
      "message": "El campo 'active' es obligatorio."
    }
  ]
}
```

---

## Error 2: Campos vacíos

<a name="request-campos-vacíos-update-state-categories"></a>

### Request - campos - vacíos (`updateStateCategories`)

**Body:**

```json
{
  "categoryId": "",
  "active": true
}
```

---

<a name="response-campos-vacíos-update-state-categories"></a>

### Response - campos - vacíos (`updateStateCategories`)

**Response code:**  
`400 BAD_REQUEST`

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "categoryId",
      "message": "El campo 'categoryId' es obligatorio."
    }
  ]
}
```

---

## Error 3: Categoría no encontrada

<a name="request-categoría-no-encontrada-update-state-categories"></a>

### Request - categoría - no - encontrada (`updateStateCategories`)

**Body:**

```json
{
  "categoryId": "nonexistent-id",
  "active": false
}
```

---

<a name="response-categoría-no-encontrada-update-state-categories"></a>

### Response - categoría - no - encontrada (`updateStateCategories`)

**Response code:**  
`404 NOT_FOUND`

```json
{
  "code": "404",
  "message": "NOT_FOUND",
  "errors": [
    {
      "field": "categoryId",
      "message": "La categoría 'nonexistent-id' no fue encontrada."
    }
  ]
}
```

---

## Error 4: Campos inválidos

<a name="request-campos-inválidos-update-state-categories"></a>

### Request - campos - inválidos (`updateStateCategories`)

**Body:**

```json
curl --location --request PUT 'http://localhost:8080/api/v1/categories/state' \
--header 'Content-Type: text/plain' \
--header 'messageId: peace757' \
--data '{
  "categoryId": "6843456b315d83253265dba1",
  "active": true
}'

```

---

<a name="response-campos-inválidos-update-state-categories"></a>

### Response - campos - inválidos (`updateStateCategories`)

**Response code:**  
`415  UNSUPPORTED_MEDIA_TYPE`

```json
{
  "code": "415",
  "message": "UNSUPPORTED_MEDIA_TYPE",
  "errors": [
    {
      "field": "Content-Type",
      "message": "El tipo de contenido debe ser 'application/json'"
    }
  ]
}
```

---

## Error 5: Error inesperado del servidor

<a name="request-error-interno-update-state-categories"></a>

### Request - error - interno (`updateStateCategories`)

**Body:**

```json
{
  "categoryId": "6843456b315d83253265dba1",
  "active": false
}
```

---

<a name="response-error-interno-update-state-categories"></a>

### Response - error - interno (`updateStateCategories`)

\*Response code:\*\*  
`500 INTERNAL_SERVER_ERROR`

```json
{
  "code": "500",
  "message": "INTERNAL_SERVER_ERROR",
  "errors": [
    {
      "field": "internal",
      "message": "Ha ocurrido un error inesperado al actualizar la categoría."
    }
  ]
}
```

---
