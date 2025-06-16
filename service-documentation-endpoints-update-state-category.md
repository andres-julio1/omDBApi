# 4. Documentación de servicios (endpoints)

En esta sección se describen ejemplos de actualización de estados exitosa y los principales casos de error para el endpoint **`updateStateCategories`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

## 4.1 Actualizar estado de la categoría endpoint (`updateStateCategories`)

## Tabla de encabezados Requeridos (Headers):

| **Header**     | **Valor**          | **Obligatorio** | **Descripción**                               |
| -------------- | ------------------ | --------------- | --------------------------------------------- |
| `Content-Type` | `application/json` | Sí              | Indica el tipo de contenido enviado           |
| `messageId`    | `peace757`         | Sí              | Identificador único para rastrear la petición |

---

<a name="table-update-state-categories"></a>

## Tabla de endponit updateStateCategories

| **Servicio**                      | **Funcionalidad**       | **Request válido**                                                                                           | **Response exitoso**                                                                                           |
| --------------------------------- | ----------------------- | ------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------- |
| `svc-virtualstore-co-manager-pdn` | `updateStateCategories` | [Ver JSON Request](service-documentation-jsons-r-r-update-state-category.md#request-update-state-categories) | [Ver JSON Response](service-documentation-jsons-r-r-update-state-category.md#response-update-state-categories) |

---

<a name="table-error-update-state-categories"></a>

### 4.2 Casos de error en `updateStateCategories`

| **Tipo de error**               | **Breve descripción**                                                       | **Request inválido**                                                                                                                       | **Response de error esperado**                                                                                                               |
| ------------------------------- | --------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `Campos obligatorios faltantes` | El request no incluye campos obligatorios (ej. **`categoryId` o `active`**) | [Ver JSON Request](service-documentation-jsons-error-update-state-category.md#request-campos-obligatorios-faltantes-update-state-category) | [Ver JSON Response](service-documentation-jsons-error-update-state-category.md#response-campos-obligatorios-faltantes-update-state-category) |
| `Campos vacíos`                 | El campo **`categoryId`** está vacío o es nulo                              | [Ver JSON Request](service-documentation-jsons-error-update-state-category.md#request-campos-vacíos-update-state-categories)               | [Ver JSON Response](service-documentation-jsons-error-update-state-category.md#response-campos-vacíos-update-state-categories)               |
| `Categoría no encontrada`       | La categoría enviada no existe en el sistema                                | [Ver JSON Request](service-documentation-jsons-error-update-state-category.md#request-categoría-no-encontrada-update-state-categories)     | [Ver JSON Response](service-documentation-jsons-error-update-state-category.md#response-categoría-no-encontrada-update-state-categories)     |
| `Campos inválidos`              | El header **`Content-Type`** no es **`application/json`**                   | [Ver JSON Request](service-documentation-jsons-error-update-state-category.md#request-campos-inválidos-update-state-categories)            | [Ver JSON Response](service-documentation-jsons-error-update-state-category.md#response-campos-inválidos-update-state-categories)            |
| `Error inesperado del servidor` | Fallo interno no controlado                                                 | [Ver JSON Request](service-documentation-jsons-error-update-state-category.md#request-error-interno-update-state-categories)               | [Ver JSON Response](service-documentation-jsons-error-update-state-category.md#response-error-interno-update-state-categories)               |

---
