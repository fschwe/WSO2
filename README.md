# WSO2 Server

## Prerequisitos

- Docker
- WSL2 (Windows) o Linux

## Instalación

1. Clonar el repositorio localmente
2. Descargar el zip de WSO2 Identity Server 7.1.0 desde el siguiente enlace:

   [WSO2 Identity Server 7.1.0](https://wso2.com/identity-and-access-management/)

   > **Nota:** Debe usar un mail corporativo para descargar el zip.

3. Copiar dentro del repositorio el contenido del zip wso2is-7.1.0

   #### Debe quedar la siguiente estructura:

   > WSO2 [O el nombre de la carpeta que contenga el repositorio] </br>
   > ├── wso2is-7.1.0</br>
   > ├── docker-compose.yaml</br>
   > ├── README.md</br>
   > ├── .Dockerfile</br>

4. Ejecutar el siguiente comando para crear la imagen de Docker:

   ```bash
   docker-compose up -d
   ```

   O usar en caso de querer rearmar la imagen

   ```bash
   docker-compose up -d --build
   ```

   Si todo sale bien, debería ver el siguiente mensaje en la consola del docker indicando que el servidor ya se encuentra aceptando peticiones:

   ```bash
   INFO {org.wso2.identity.apps.common.internal.AppsCommonServiceStartupObserver} - My Account URL : https://localhost:9443/myaccount
   INFO {org.wso2.identity.apps.common.internal.AppsCommonServiceStartupObserver} - Console URL : https://localhost:9443/console
   ```

## Notas

Se recomienda copiar el zip directamente al WSL para que la extraccion sea mas rapida y descomplimirlo desde alli usando el siguiente comando:

```bash
unzip wso2is-7.1.0.zip -d ~/WSO2
```

En caso de que no se posea el comando unzip, se puede instalar usando el siguiente comando:

```bash
sudo apt-get install unzip
```

## Cambio de base de datos

[Documentacion cambio de base de datos por posgre](https://is.docs.wso2.com/en/latest/deploy/configure/databases/carbon-database/change-to-postgresql/)

Dentro del compose se obtiene la ultima imagen de PostgreSQL con los siguientes datos de login:

```yaml
User name: postgres
Password: secure_pass_here
```

https://flaviocopes.com/react-how-to-configure-https-localhost/

openssl req -x509 -newkey rsa:2048 -keyout keytmp.pem -out cert.pem -days 365

openssl rsa -in keytmp.pem -out key.pem
