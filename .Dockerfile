FROM openjdk:19
COPY wso2is-7.1.0 /usr/src/myapp
WORKDIR /usr/src/myapp
CMD ["sh", "/usr/src/myapp/bin/wso2server.sh"]