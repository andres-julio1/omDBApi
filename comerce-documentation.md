## 3. Diccionario de datos

## Documento DynamoDB - Comercio

## Tabla: table-rewards-co-cashback-benefit-qa

| **Nombre atributo**      | **Tipo**                 | **Breve descripción**                                          | **Posibles valores**                                             | **Ejemplo**                 |
| ------------------------ | ------------------------ | -------------------------------------------------------------- | ---------------------------------------------------------------- | --------------------------- |
| `merchantId`             | String (número en texto) | Identificador único del comercio en Nequi                      | Texto numérico entero de 5 dígitos                               | `"17088"`                   |
| `accountingAccount`      | String                   | Cuenta contable asociada al comercio                           | Código de cuenta bancaria                                        | `"BD000002COP5PAGB"`        |
| `commerceId`             | String                   | Identificador único externo del comercio                       | Número de identificación precedido por un prefijo (alfanumérico) | `"NIT_900157926"`           |
| `commissionAgreed`       | String (número en texto) | Comisión pactada, representa el %                              | Texto numérico positivo                                          | `"10"`                      |
| `commissionCashback`     | String (número en texto) | Comisión a entregar al usuario **`cashback`**, representa el % | Texto numérico positivo                                          | `"5"`                       |
| `description`            | String                   | Descripción del comercio                                       | Texto enriquecido                                                | `"Mascotas"`                |
| `documentNumber`         | String                   | Número de documento legal del comercio                         | Texto numérico, según tipo de documento                          | `"900157926"`               |
| `documentType`           | String                   | Tipo de documento legal                                        | `"NIT"`, `"CC"`, `"CE"`, etc.                                    | `"NIT"`                     |
| `name`                   | String                   | Nombre comercial visible                                       | Texto enriquecido                                                | `"Kanu Pets"`               |
| `paymentMethods`         | Array                    | Métodos de pago habilitados para el comercio                   | Lista de objetos, ver tabla detallada: `paymentMethods`          | `[{...}]`                   |
| `reverseTransactionType` | String                   | Código de transacción para reversos                            | Código definido por el sistema (alfanumérico)                    | `"X020"`                    |
| `reverseTransParticular` | String                   | Detalle de la transacción de reverso                           | Texto enriquecido                                                | `"Reverso Beneficio Nequi"` |
| `subTypeCode`            | String (número en texto) | Código de sub-tipo de transacción                              | Texto numérico entero de 5 dígitos, definido por el negocio      | `"10010"`                   |
| `transactionType`        | String                   | Tipo principal de transacción                                  | Código definido por el sistema (alfanumérico)                    | `"R008"`                    |
| `transParticular`        | String                   | Descripción del beneficio                                      | Texto enriquecido                                                | `"Beneficio Nequi"`         |
| `url`                    | String (URL)             | URL del sitio web del comercio                                 | URL válida del comercio                                          | `"https://www.kanu.pet/"`   |

---

### Estructura de métodos de pagos habilitados (`paymentMethods`)

| **Nombre Atributo**       | **Tipo**       | **Breve descripción**                                         | **Posibles Valores**               | **Ejemplo**                      |
| ------------------------- | -------------- | ------------------------------------------------------------- | ---------------------------------- | -------------------------------- |
| `identifierPaymentMethod` | Array (String) | Lista de identificadores únicos asociados a ese medio de pago | Array de texto alfanumérico        | `["identifier1", "identifier2"]` |
| `type`                    | String         | Tipo de método de pago                                        | `"PSE"`,`"PHYSICAL_CARD"`,`"APIS"` | `"PSE"`                          |

---

### Notas:

- **Texto enriquecido**: Acepta caracteres adicionales como espacios, números (0-9), tildes, puntos, comas, signos de exclamación, etc.
- El arrays **(`paymentMethods`)** contienen objetos anidados con la estructura indicada en la tabla.
- La lista **`identifierPaymentMethod`** puede estar vacía en ciertos casos, como cuando el método de pago no requiere un identificador específico (por ejemplo, **`APIS`**). Es recomendable validar este atributo antes de procesar una transacción para evitar errores.

---
