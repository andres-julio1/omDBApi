# 4. Documentación de servicios (`endpoint`)

En esta sección se describen ejemplos de creación exitosa y los principales casos de error para el endpoint **`createBrand`**. También se proporcionan enlaces a cada tipo de request y response para facilitar las pruebas funcionales y la correcta construcción de los requests.

---

## 4.1 Crear marcas endpoint (`createBrand`)

| **Servicio**                      | **Funcionalidad** | **Request válido**                                                                    | **Response exitoso**                                                                    |
| --------------------------------- | ----------------- | ------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `svc-virtualstore-co-manager-pdn` | `createBrand`     | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---createbrand) | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---createbrand) |

---

## 4.2 Casos de error en `createBrand`

| **Tipo de error**              | **Breve descripción**                                       | **Request inválido**                                                                                        | **Response de error esperado**                                                                                |
| ------------------------------ | ----------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| Campos obligatorios faltantes  | El request no incluye campos obligatorios                   | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---campos---obligatorios---faltantes) | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---campos---obligatorios---faltantes) |
| Formato inválido               | Campos con formato incorrecto (ej. URL inválida)            | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---formato---inválido)                | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---formato---inválido)                |
| Tamaño o longitud de campos    | Un campo excede el tamaño permitido o es demasiado corto    | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---longitud---inválida)               | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---longitud---inválida)               |
| Estructura inválida en objetos | Campos anidados con estructura o tipos erróneos             | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---objeto---inválido)                 | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---objeto---inválido)                 |
| Valor inválido                 | Campo con valor no permitido (ej. **`priority`** negativo)  | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---valor---inválido)                  | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---valor---inválido)                  |
| JSON mal formado               | JSON que no respeta la sintaxis(ej. comillas, llaves, etc.) | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---JSON---inválido)                   | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---JSON---inválido)                   |
| Duplicidad de marca            | El **`merchantId`** de la marca ya existe                   | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---merchantId---duplicado)            | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---merchantId---duplicado)            |
| Error inesperado del servidor  | Fallo interno no controlado                                 | [Ver JSON Request](service-documentation-jsons-create-brand.md#request---error---interno)                   | [Ver JSON Response](service-documentation-jsons-create-brand.md#response---error---interno)                   |

---
