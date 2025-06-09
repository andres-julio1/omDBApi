# 4. TROUBLESHOOTING

4.1 **Ejemplo de transacción exitosa: Crear categoría (createBrand)**
_Incluir ejemplos de transacciones exitosas o enlaces a esta información, lo ideal es entender cuál es la correcta construcción de cada request y cómo es un response correcto. En lo posible, indicar las posibles pruebas funcionales del servicio_
<br>

| **Servicio**                 | **Funcionalidad** | **Request válido**                         | **Response exitoso**                         |
| ---------------------------- | ----------------- | ------------------------------------------ | -------------------------------------------- |
| `svc-rewards-co-createbrand` | `createBrand`     | [Ver JSON Request](#request---createbrand) | [Ver JSON Response](#response---createbrand) |

---

### Request - createBrand

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
  "logo": "https://bills-assets.s3.amazonaws.com/iconos/logo_bills.svg",
  "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
  "fyf": {
    "active": false
  },
  "priority": 5,
  "score": 80,
  "createdBy": "ajppepe"
}
```
---
### Response - createBrand

```json

{
  "code": "200",
  "message": "SUCCESS",
  "messageId": "peace757",
  "data": {
    "id": "6846e88c4ee0585b0fbde85f",
    "merchantId": "23015",
    "name": "Nike",
    "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
    "logo": "https://bills-assets.s3.amazonaws.com/iconos/logo_bills.svg",
    "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
    "benefits": null,
    "fyf": {
      "active": false,
      "numbers": null
    },
    "priority": 5,
    "score": 80.0,
    "creationDate": "2025-06-09T08:58:35.296917Z",
    "modificationDate": "2025-06-09T08:58:35.296917Z",
    "createdBy": "ajppepe",
    "categories": null,
    "tags": null
  }
}
```

---
### Ejemplos de casos de error en createBrand

| **Tipo de Error**              | **Descripción**                            | **Request invalido**                                             | **Response de error esperado**                                     |
| ------------------------------ | ------------------------------------------ | ---------------------------------------------------------------- | ------------------------------------------------------------------ |
| Campos obligatorios faltantes  | El request no incluye campos obligatorios  | [Ver JSON Request](#request---campos---obligatorios---faltantes) | [Ver JSON Response](#response---campos---obligatorios---faltantes) |
| Formato inválido               | Campos con formato incorrecto              | [Ver JSON Request](#request---formato---inválido)                | [Ver JSON Response](#response---formato---inválido)                |
| Valores fuera de rango         | Valores numéricos fuera del rango esperado | [Ver JSON Request](#request---valores---fuera---de---rango)      | [Ver JSON Response](#response---valores---fuera---de---rango)      |
| Estructura inválida en objetos | Campos anidados con estructura o tipos erróneos | [Ver JSON Request](#request---estructura---inválida---en---objetos) | [Ver JSON Response](#response---estructura---inválida---en---objetos)      |

---

### Error 1: Campos obligatorios faltantes

### Request - campos - obligatorios - faltantes

```json
{
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 1,
  "score": 50.0,
  "createdBy": "ajppepe"
}
```
---

### Response - campos - obligatorios - faltantes

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "merchantId",
      "message": "El campo merchantId es obligatorio"
    },
    {
      "field": "name",
      "message": "El campo name es obligatorio"
    }
  ]
}
```
---

### Error 2: Formato inválido en URLs

### Request - formato - inválido

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "no-es-una-url",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": 1,
  "score": 50.0,
  "createdBy": "ajppepe"
}
```
---

### Response - formato - inválido

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "logo",
      "message": "El campo logo debe ser una URL válida"
    }
  ]
}
```
---

### Error 3: Valores numéricos fuera de rango

### Request - valores - fuera - de - rango

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "no-es-una-url",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": -1,
  "score": 50.0,
  "createdBy": "ajppepe"
}
```
---

### Response - valores - fuera - de - rango

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "priority",
      "message": "El campo priority debe ser un número positivo, con rango (0-15)"
    }
  ]
}
```
---

### Error 4: Estructura inválida en objetos

### Request - estructura - inválida - en - objetos

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "no-es-una-url",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": "Información sobre Friends and Family",
  "priority": -1,
  "score": 50.0,
  "createdBy": "ajppepe"
}
```
---

### Response - estructura - inválida - en - objetos

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "fyf",
      "message": "El campo fyf debe ser un objeto con propiedades válidas"
    }
  ]
}
```
---
