FROM java:8
VOLUME  /tmp
RUN mkdir /app
ADD some-1.0.jar /app/app.jar
ADD runboot.sh  /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app/
RUN chmod u+x runboot.sh
EXPOSE 8083
CMD /app/runboot.sh

