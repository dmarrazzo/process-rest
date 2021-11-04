RHPAM Rest call example
=====================================

Rest Service:

https://petstore.swagger.io/

In case the pet is not there you can add it through this command:

```sh
curl -X 'POST' 'https://petstore.swagger.io/v2/pet' \
     -H 'accept: application/json' \
     -H 'Content-Type: application/json' \
     -d '{ "id":123,
           "category": {
             "name": "fish"
           },
           "name": "fuffy",
           "photoUrls": [
             "url"
           ],
           "tags": [
             {
               "name": "red"
             }
           ],
           "status": "available"
        }'
```

Get Pet:

```sh
curl -i -X 'GET' \
     'https://petstore.swagger.io/v2/pet/123' \
     -H 'accept: application/json'
```