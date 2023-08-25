#!/bin/bash

COUNT=$1
for ((i=1;i<=$COUNT;i++));
do
    CO_PROJETO=$(echo $(shuf -i 1-4 -n 1))
    CO_CURSO=$(echo $(shuf -i 1-4 -n 1))
    curl http://localhost:8182/rest/n91/enviar/$CO_PROJETO/$CO_CURSO
done