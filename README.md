# 4. TROUBLESHOOTING

4.1 **Ejemplo de creación exitosa y casos de errores: Marcas (createBrand)**
Incluye ejemplos de creación exitosa, casos de errores y enlaces a esta información para entender la correcta construcción de cada request y cómo es un response correcto. También se indican posibles pruebas funcionales del servicio para validar su correcto funcionamiento.

---

### Ejemplo de creación de marcas (`createBrand`)

| **Servicio**                 | **Funcionalidad** | **Request válido**                         | **Response exitoso**                         |
| ---------------------------- | ----------------- | ------------------------------------------ | -------------------------------------------- |
| `svc-rewards-co-createbrand` | `createBrand`     | [Ver JSON Request](#request---createbrand) | [Ver JSON Response](#response---createbrand) |

---

### Request - createBrand

```json
{
  "merchantId": "17081",
  "name": "Nike",
  "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/merchant123-cover.svg",
  "fyf": {
    "active": false
  },
  "priority": 5,
  "score": 80,
  "createdBy": "edfearia"
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
    "merchantId": "17081",
    "name": "Nike",
    "description": "La mejor tienda online de electrónicos con ofertas exclusivas.",
    "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
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
    "createdBy": "edfearia",
    "categories": null,
    "tags": null
  }
}
```

---

### Ejemplos de casos de error (`createBrand`)

| **Tipo de Error**              | **Descripción**                                         | **Request invalido**                                                | **Response de error esperado**                                        |
| ------------------------------ | ------------------------------------------------------- | ------------------------------------------------------------------- | --------------------------------------------------------------------- |
| Campos obligatorios faltantes  | El request no incluye campos obligatorios               | [Ver JSON Request](#request---campos---obligatorios---faltantes)    | [Ver JSON Response](#response---campos---obligatorios---faltantes)    |
| Formato inválido               | Campos con formato incorrecto                           | [Ver JSON Request](#request---formato---inválido)                   | [Ver JSON Response](#response---formato---inválido)                   |
| Valores fuera de rango         | Valores numéricos fuera del rango esperado              | [Ver JSON Request](#request---valores---fuera---de---rango)         | [Ver JSON Response](#response---valores---fuera---de---rango)         |
| Estructura inválida en objetos | Campos anidados con estructura o tipos erróneos         | [Ver JSON Request](#request---estructura---inválida---en---objetos) | [Ver JSON Response](#response---estructura---inválida---en---objetos) |
| Datos incorrectos              | Campos con datos incorrectos                            | [Ver JSON Request](#request---tipo---de---dato---incorrecto)        | [Ver JSON Response](#response---tipo---de---dato---incorrecto)        |
| JSON mal formado               | JSON que no respeta la sintaxis(comillas, llaves, etc.) | [Ver JSON Request](#request---JSON---mal---formado)                 | [Ver JSON Response](#response---JSON---mal---formado)                 |
| El recurso ya existe           | Duplicado de identificador(merchantId)                  | [Ver JSON Request](#request---el---recurso---ya---existe)           | [Ver JSON Response](#response---el---recurso---ya---existe)           |
| Interno del servidor           | Cuando ocurre un error inesperado del lado del servidor | [Ver JSON Request](#request---interno---del---servidor)             | [Ver JSON Response](#response---interno---del---servidor)             |

---

### Error 1: Campos obligatorios faltantes

### Request - campos - obligatorios - faltantes

```json
{
  "name": "",
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
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
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
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
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

### Error 5: Tipo de dato incorrecto

### Request - tipo - de - dato - incorrecto

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": "1",
  "score": "ochenta",
  "createdBy": "ajppepe"
}
```

---

### Response - tipo - de - dato - incorrecto

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": "score",
      "message": "El campo score debe ser de tipo numérico"
    }
  ]
}
```

---

### Error 6: JSON mal formado

### Request - JSON - mal - formado

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": "1"
  "score": "ochenta",
  "createdBy": "ajppepe"
}
```

---

### Response - JSON - mal - formado

```json
{
  "code": "400",
  "message": "BAD_REQUEST",
  "errors": [
    {
      "field": null,
      "message": "Formato JSON inválido"
    }
  ]
}
```

---

### Error 6: El recurso ya existe

### Request - el - recurso - ya - existe

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": "1",
  "score": "80",
  "createdBy": "ajppepe"
}
```

---

### Response - el - recurso - ya - existe

```json
{
  "code": "409",
  "message": "CONFLICT",
  "errors": [
    {
      "field": "merchantId",
      "message": "Ya existe una marca con el merchantId especificado"
    }
  ]
}
```

---

### Error 6: Interno del servidor

### Request - interno - del - servidor

```json
{
  "merchantId": "23015",
  "name": "Nike",
  "description": "Test",
  "logo": "https://nequi-bills-assets.s3.amazonaws.com/iconos_aliados/logo_leonisa_bills.svg",
  "cover": "https://cdn.example.com/covers/valid.svg",
  "fyf": { "active": false },
  "priority": "1",
  "score": "80",
  "createdBy": "ajppepe"
}
```

---

### Response - interno - del - servidor

```json
{
  "code": "500",
  "message": "INTERNAL_SERVER_ERROR",
  "errors": [
    {
      "field": null,
      "message": "Ha ocurrido un error inesperado. Intente nuevamente más tarde."
    }
  ]
}
```

---
