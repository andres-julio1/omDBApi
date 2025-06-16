# Sección detallada de la actualización de estado

### [Volver a la tabla de endpoint `updateStateCategories`](service-documentation-endpoints-update-state-category.md#table-update-state-categories)

### Detalle técnico del endpoint updateStateCategories

Este documento describe en detalle el funcionamiento del endpoint **`updateStateCategories`**, utilizado para actualizar el estado de la categoría en el sistema. A continuación se presentan la estructura del request y response JSON.

**URL:**

```http
PUT http://localhost:8080/api/v1/categories/state
```

Descripción:
Este endpoint permite actualizar el estado de una categoría existente utilizando un identificador lógico, como el **`categoryId`** actual de la categoría. A través de este servicio, es posible habilitar **(`active`: `true`)** o deshabilitar **(`active`: `false`)** una categoría registrada en el sistema.

---

<a name="request-update-state-categories"></a>

### Request - updateStateCategories

**Body:**

```json
{
  "categoryId": "6843456b315d83253265dba1",
  "active": false
}
```

---

<a name="response-update-state-categories"></a>

### Response - updateStateCategories

**Response code:**  
`200 OK`

```json
{
  "code": "200",
  "message": "SUCCESS",
  "messageId": "peace757",
  "data": {
    "id": "6843456b315d83253265dba1",
    "name": "Comida Nueva",
    "image": "https://cdn.example.com/logos/nuevaImage.svg",
    "creationDate": "2025-06-09T09:06:45.681093Z",
    "modificationDate": "2025-06-09T09:06:45.681093Z",
    "createdBy": "Juan Julio",
    "priority": 0,
    "active": false
  }
}
```

---
