# 4. Documentación de servicios (endpoints)

En esta sección se describen ejemplos de creación exitosa y los principales casos de error para el endpoint **`updateCategory`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

## 4.1 Actualizar categorías endpoint (`updateCategory`)

## Encabezados Requeridos (Headers):

| **Header**     | **Tipo**           | **Obligatorio** | **Descripción**                               |
| -------------- | ------------------ | --------------- | --------------------------------------------- |
| `Content-Type` | `application/json` | Sí              | Indica el tipo de contenido enviado           |
| `messageId`    | `string`           | Sí              | Identificador único para rastrear la petición |

---

| **Servicio**                      | **Funcionalidad** | **Request válido**                                                                              | **Response exitoso**                                                                              |
| --------------------------------- | ----------------- | ----------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `svc-virtualstore-co-manager-pdn` | `updateCategory`  | [Ver JSON Request](service-documentation-jsons-r-r-update-category.md#request---updateCategory) | [Ver JSON Response](service-documentation-jsons-r-r-update-category.md#response---updateCategory) |

---
