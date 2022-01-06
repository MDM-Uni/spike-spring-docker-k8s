minikube start
eval "$(minikube docker-env)"
docker build -t spiketaass/backend .
kubectl apply -f kube
minikube service backend --url