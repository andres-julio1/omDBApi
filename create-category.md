## Sección detallada de creación

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
