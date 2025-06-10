# 4. TROUBLESHOOTING

4.1 **Ejemplo de creación exitosa y casos de errores: Categorias (createCategory)**
Incluye ejemplos de creación exitosa, casos de errores y enlaces a esta información para entender la correcta construcción de cada request y cómo es un response correcto. También se indican posibles pruebas funcionales del servicio para validar su correcto funcionamiento.

---

### Ejemplo de creación existosa - Endpoint: Crear categorias (createCategory)

**URL:**  
`http://localhost:8080/api/v1/categories`

| **Servicio**                      | **Funcionalidad** | **Request válido**                            | **Response exitoso**                            |
| --------------------------------- | ----------------- | --------------------------------------------- | ----------------------------------------------- |
| `svc-virtualstore-co-manager-pdn` | `createCategory`  | [Ver JSON Request](#request---createCategory) | [Ver JSON Response](#response---createCategory) |

---

### Request - createCategory

**Body**

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
