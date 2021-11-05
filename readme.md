RHPAM Rest call example (jBPM)
=====================================

This example leverages the PET Store public REST API:

https://petstore.swagger.io/

Highlights
-------------------------------------

- REST Workitem handler configuration

  - Deployment Descriptor `src/main/resources/META-INF/kie-deployment-descriptor.xml`
  - Configuration in the assignment panel:
      - Multiple environment handling via system property: `#{System.getProperty("service.pet.url","https://petstore.swagger.io/v2/pet/")+pet.id}`
      - Raising exception `HandleResponseErrors`
      - Defining the `ResultClass`

- Local Exception Handling

- Complex script logic delegated to Java class methods, see: `src/main/java/com/examples/script/PetProcess.java`

Pet REST Service
-------------------------------------

In case the pet is not there you can add it through this command:

Add a pet:

```sh
curl -X 'POST' 'https://petstore.swagger.io/v2/pet' \
     -H 'accept: application/json' \
     -H 'Content-Type: application/json' \
     -d '{ "id":123,
           "name": "fuffy",
           "status": "available",
           "category": {
             "name": "fish"
           },
           "photoUrls": [
             "url"
           ],
           "tags": [
             {
               "name": "red"
             }
           ]
        }'
```

Get Pet:

```sh
curl -i -X 'GET' \
     'https://petstore.swagger.io/v2/pet/123' \
     -H 'accept: application/json'
```