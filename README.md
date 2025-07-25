# 💱 Conversor de Monedas - Java + API

Este es un proyecto de consola en Java que permite convertir valores entre distintas monedas del mundo, utilizando datos en tiempo real desde la API [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🧰 Tecnologías utilizadas

- Java 17 o superior
- [Gson](https://github.com/google/gson) (para parsear JSON)
- HTTP Client (incluido en Java 11+)
- API: https://www.exchangerate-api.com/

---

## 🚀 Funcionalidades

- ✅ Conversión de monedas LATAM (CLP, ARS, BRL, COP, MXN)
- ✅ Conversión de monedas Europeas (EUR, GBP, CHF)
- ✅ Modo personalizado: puedes ingresar cualquier par de códigos ISO 4217
- ✅ Cálculo en tiempo real con tasas actualizadas
- ✅ Guardado opcional de resultados en archivo `.json` (con Gson)

---

## 📷 Menú de ejemplo

```
**********************************************
Bienvenido/a al conversor de moneda =]
1) USD <=> CLP
2) ARS <=> USD
3) USD <=> BRL
4) COP <=> USD
5) MXN <=> CLP
6) EUR <=> USD
7) GBP <=> EUR
8) CHF <=> EUR
9) Personalizado (por código ISO 4217)
0) Salir
**********************************************
```

---

## 🛠 Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/TU_USUARIO/conversor-moneda.git
   cd conversor-moneda
   ```

2. Asegúrate de tener [Gson](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar) descargado y añadido al classpath del proyecto.
3. Abre el proyecto en IntelliJ IDEA o cualquier otro IDE.
4. Ejecuta la clase `Principal.java`.

---

## 📡 Clave API usada

Este proyecto utiliza la API gratuita de [https://www.exchangerate-api.com](https://www.exchangerate-api.com/) con la siguiente clave pública:

```
API_KEY: 32224f8176daa590653c8537
```

> ⚠️ **Puedes reemplazarla por tu propia clave gratuita desde su sitio web.**

---

## 🧑‍💻 Autor

- 👤 Felipe Sanchez
- 📍 Chile
- 🧠 Proyecto educativo para práctica con APIs y Java

---

## ⭐ Licencia

Este proyecto está bajo licencia MIT. Puedes usarlo, modificarlo y compartirlo libremente.

---

## 🎯 Objetivo

Este proyecto fue creado con fines educativos para practicar:
- Integración de APIs REST con Java
- Manejo de `Scanner`, `HttpClient`, `Gson`
- Estructuración en múltiples clases
- Buenas prácticas y legibilidad en proyectos de consola

---

¡Gracias por revisar el proyecto!  
