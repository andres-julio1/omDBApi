# 4. Documentación de servicios (endpoints)

En esta sección se describen ejemplos de creación exitosa y los principales casos de error para el endpoint **`createCategory`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

### 4.1 Crear categorías endpoint (`createCategory`)

| **Servicio**                      | **Funcionalidad** | **Request válido**                                             | **Response exitoso**                                             |
| --------------------------------- | ----------------- | -------------------------------------------------------------- | ---------------------------------------------------------------  |
| `svc-virtualstore-co-manager-pdn` | `createCategory`  | [Ver JSON Request](create-category#request---createcategory)   |  [Ver JSON Response](create-category#response---createcategory)  |

---

## Sección detallada de creación

**URL:**

```http
POST http://localhost:8080/api/v1/categories
```

---

### Request - createCategory
<a name="request-createcategory"></a>
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
<a name="response-createcategory"></a>
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

### 4.2 Casos de error en `createCategory`

| **Tipo de error**             | **Breve descripción**                                       | **Request inválido**                                             | **Response de error esperado**                                     |
| ----------------------------- | ----------------------------------------------------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------ |
| Campos obligatorios faltantes | El request no incluye campos obligatorios                   | [Ver JSON Request](#request---campos---obligatorios---faltantes) | [Ver JSON Response](#response---campos---obligatorios---faltantes) |
| Formato inválido              | Campos con formato incorrecto (por ejemplo, URL mal)        | [Ver JSON Request](#request---formato---inválido)                | [Ver JSON Response](#response---formato---inválido)                |
| Tamaño o longitud de campos   | Un campo excede el tamaño permitido o es demasiado corto    | [Ver JSON Request](#request---longitud---inválida)               | [Ver JSON Response](#response---longitud---inválida)               |
| Valor inválido                | Campo con valor no permitido (ej. **`priority`** negativo)  | [Ver JSON Request](#request---valor---inválido)                  | [Ver JSON Response](#response---valor---inválido)                  |
| JSON mal formado              | JSON que no respeta la sintaxis(ej. comillas, llaves, etc.) | [Ver JSON Request](#request---JSON---inválido)                   | [Ver JSON Response](#response---JSON---inválido)                   |
| Duplicidad de categoría       | El **`name`** de la categoría ya existe                     | [Ver JSON Request](#request---nombre---duplicado)                | [Ver JSON Response](#response---nombre---duplicado)                |
| Error inesperado del servidor | Fallo interno no controlado                                 | [Ver JSON Request](#request---error---interno)                   | [Ver JSON Response](#response---error---interno)                   |

---

## Sección detallada por cada error

---

### Error 1: Campos obligatorios faltantes

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

### Error 2: Formato inválido

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

### Error 3: Longitud de campo inválido

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

### Error 4: Valor inválido

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

### Error 5: JSON mal formado

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

### Error 6: Categoría duplicada

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

### Error 7: Error inesperado del servidor

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

