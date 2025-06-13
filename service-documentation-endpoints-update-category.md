# 4. Documentación de servicios (endpoints)

En esta sección se describen ejemplos de creación exitosa y los principales casos de error para el endpoint **`updateCategory`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

## 4.1 Actualizar categorías endpoint (`updateCategory`)

## Tabla de encabezados Requeridos (Headers):

| **Header**     | **Tipo**           | **Obligatorio** | **Descripción**                               |
| -------------- | ------------------ | --------------- | --------------------------------------------- |
| `Content-Type` | `application/json` | Sí              | Indica el tipo de contenido enviado           |
| `messageId`    | `string`           | Sí              | Identificador único para rastrear la petición |

---

## Tabla de endponit updateCategory

| **Servicio**                      | **Funcionalidad** | **Request válido**                                                                             | **Response exitoso**                                                                             |
| --------------------------------- | ----------------- | ---------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| `svc-virtualstore-co-manager-pdn` | `updateCategory`  | [Ver JSON Request](service-documentation-jsons-r-r-update-category.md#request-update-category) | [Ver JSON Response](service-documentation-jsons-r-r-update-category.md#response-update-category) |

``

### 4.2 Casos de error en `updateCategory`

| **Tipo de error**               | **Breve descripción**                                                     | **Request inválido**                                                                                                          | **Response de error sperado**                                                                                                    |
| ------------------------------- | ------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `Campos obligatorios faltantes` | El request no incluye campos obligatorios (ej. **`category` o `patams`**) | [Ver JSON Request](service-documentation-jsons-error-update-category.md#request-campos-obligatorios-faltantes-update-categor) | [Ver JSON Response](service-documentation-jsons-error-update-category.md#response-campos-obligatorios-faltantes-update-category) |

---
