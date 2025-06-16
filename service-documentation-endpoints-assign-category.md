# 4. Documentación de servicios (endpoints)

En esta sección se describen ejemplos de asignación exitosa y los principales casos de error para el endpoint **`assignCategories`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

## 4.1 Asignar categorías a las marcas endpoint (`assignCategories`)

## Tabla de encabezados Requeridos (Headers)

| **Header**     | **Valor**          | **Obligatorio** | **Descripción**                               |
| -------------- | ------------------ | --------------- | --------------------------------------------- |
| `Content-Type` | `application/json` | Sí              | Indica el tipo de contenido enviado           |
| `messageId`    | `peace757`         | Sí              | Identificador único para rastrear la petición |

---

<a name="table-assign-categories"></a>

## Tabla de endpoint assignCategories

| **Servicio**                       | **Funcionalidad**  | **Request válido**                                                                              | **Response exitoso**                                                                              |
| ---------------------------------- | ------------------ | ----------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `svc-virtualstore-co-manager-pdn ` | `assignCategories` | [Ver JSON Request](service-documentation-json-r-r-assign-category.md#request-assign-categories) | [Ver JSON Response](service-documentation-json-r-r-assign-category.md#response-assign-categories) |

---

<a name="table-error-assign-categories"></a>

## 4.2 Casos de error en `assignCategories`

| **Tipo de error**               | **Breve descripción**                                         | **Request inválido**                                                                                                            | **Response de error esperado**                                                                                                    |
| ------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `JSON mal formado`              | JSON que no respeta la sintaxis(ej. comillas, llaves, etc.)   | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-json-mal-formado-assign-categories)              | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-json-mal-formado-assign-categories)              |
| `Campos obligatorios faltantes` | El request no incluye campos obligatorios (ej. **`brandId`**) | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-campos-obligatorios-faltantes-assign-categories) | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-campos-obligatorios-faltantes-assign-categories) |
| `Campos vacíos`                 | El request contiene campos vacíos o nulos                     | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-campos-vacíos-assign-categories)                 | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-campos-vacíos-assign-categories)                 |
| `Marca no encontrada`           | El **`brandId`** no corresponde a ninguna marca registrada    | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-marca-no-encontrada-assign-categories)           | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-marca-no-encontrada-assign-categories)           |
| `Categoría inexistente`         | Una o más categorías especificadas no existen                 | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-categoría-inexistente-assign-categories)         | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-categoría-inexistente-assign-categories)         |
| `Categoría ya asignada`         | Alguna de las categorías ya está asociada a la marca          | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-categoría-ya-asignada-assign-categories)         | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-categoría-ya-asignada-assign-categories)         |
| `Error interno del servidor`    | Fallo interno no controlado                                   | [Ver JSON Request](service-documentation-json-error-assign-category.md#request-error-interno-assign-categories)                 | [Ver JSON Response](service-documentation-json-error-assign-category.md#response-error-interno-assign-categories)                 |

---
