FROM  openjdk:9-jre
ADD target/dublin_rest_demo.jar .
EXPOSE 8080 8000
CMD java -jar dublin_rest_demo.jar