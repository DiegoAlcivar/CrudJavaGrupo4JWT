build-image:
	@ docker build -f devops/Dockerfile -t backendgrupo4:1 .
volume:
	@ docker volume create pg_grupo4_tendecias
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml grupo4
rm:
	@ docker stack rm grupo4