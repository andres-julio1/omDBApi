# 4. Documentación de servicios (endpoints)

En esta sección se describen ejemplos de creación exitosa y los principales casos de error para el endpoint **`createCategory`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

### 4.1 Crear categorías endpoint (`createCategory`)

| **Servicio**                | **Funcionalidad** | **Request válido**                                               | **Response exitoso**                                             |
| --------------------------- | ----------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `svc-store-co-managerjysr-` | `createCategory`  | [Ver JSON Request](create-category.md#request---createcategory)   | [Ver JSON Response](create-category.md#response---createcategory) |

---

### 4.2 Casos de error en `createCategory`

| **Tipo de error**             | **Breve descripción**                                       | **Request inválido**                                                                   | **Response de error esperado**                                                           |
| ----------------------------- | ----------------------------------------------------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| Campos obligatorios faltantes | El request no incluye campos obligatorios                   | [Ver JSON Request](create-category-error.md#request---campos---obligatorios---faltantes) | [Ver JSON Response](create-category-error.md#response---campos---obligatorios---faltantes) |
| Formato inválido              | Campos con formato incorrecto (por ejemplo, URL mal)        | [Ver JSON Request](create-category-error.md#request---formato---inválido)                | [Ver JSON Response](create-category-error.md#response---formato---inválido)                |
| Tamaño o longitud de campos   | Un campo excede el tamaño permitido o es demasiado corto    | [Ver JSON Request](create-category-error.md#request---longitud---inválida)               | [Ver JSON Response](create-category-error.md#response---longitud---inválida)               |
| Valor inválido                | Campo con valor no permitido (ej. **`priority`** negativo)  | [Ver JSON Request](create-category-error.md#request---valor---inválido)                  | [Ver JSON Response](create-category-error.md#response---valor---inválido)                  |
| JSON mal formado              | JSON que no respeta la sintaxis(ej. comillas, llaves, etc.) | [Ver JSON Request](create-category-error.md#request---JSON---inválido)                   | [Ver JSON Response](create-category-error.md#response---JSON---inválido)                   |
| Duplicidad de categoría       | El **`name`** de la categoría ya existe                     | [Ver JSON Request](create-category-error.md#request---nombre---duplicado)                | [Ver JSON Response](create-category-error.md#response---nombre---duplicado)                |
| Error inesperado del servidor | Fallo interno no controlado                                 | [Ver JSON Request](create-category-error.md#request---error---interno)                   | [Ver JSON Response](create-category-error.md#response---error---interno)                   |

---
