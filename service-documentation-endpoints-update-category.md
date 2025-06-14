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

<a name="table-update-category"></a>

| **Servicio**                      | **Funcionalidad** | **Request válido**                                                                             | **Response exitoso**                                                                             |
| --------------------------------- | ----------------- | ---------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| `svc-virtualstore-co-manager-pdn` | `updateCategory`  | [Ver JSON Request](service-documentation-jsons-r-r-update-category.md#request-update-category) | [Ver JSON Response](service-documentation-jsons-r-r-update-category.md#response-update-category) |

---

### 4.2 Casos de error en `updateCategory`

<a name="table-error-update-category"></a>

| **Tipo de error**               | **Breve descripción**                                                     | **Request inválido**                                                                                                          | **Response de error sperado**                                                                                                    |
| ------------------------------- | ------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `Campos obligatorios faltantes` | El request no incluye campos obligatorios (ej. **`category` o `patams`**) | [Ver JSON Request](service-documentation-jsons-error-update-category.md#request-campos-obligatorios-faltantes-update-categor) | [Ver JSON Response](service-documentation-jsons-error-update-category.md#response-campos-obligatorios-faltantes-update-category) |
| `JSON mal formado`              | JSON que no respeta la sintaxis(ej. comillas, llaves, etc.)               | [Ver JSON Request](service-documentation-jsons-error-update-category.md#request-json-mal-formado-update-category)             | [Ver JSON Response](service-documentation-jsons-error-update-category.md#response-json-mal-formado-update-category)              |
| `Params vacío o mal formado`    | El array params está vacío o sus campos son nulos                         | [Ver JSON Request](service-documentation-jsons-error-update-category.md#request-params-vacío-update-category)                 | [Ver JSON Response](service-documentation-jsons-error-update-category.md#response-params-vacío-update-category)                  |
| `Campo duplicado`               | Dos objetos en **`params`** usan el mismo valor para **`field`**          | [Ver JSON Request](service-documentation-jsons-error-update-category.md#request-campo-duplicado-update-category)              | [Ver JSON Response](service-documentation-jsons-error-update-category.md#response-campo-duplicado-update-category)               |

---
