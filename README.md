Article Reference:

https://itnext.io/continuous-spring-boot-deployment-in-kubernetes-using-jib-and-skaffold-11fd3c71d941

Enable Kubernetes on Docker Desktop and follow below links:
To Enable Kubernetes Dashboard:
https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/#what-s-next
Kubernetes Dashboard Authentication:
https://www.replex.io/blog/how-to-install-access-and-add-heapster-metrics-to-the-kubernetes-dashboard

Kubernetes Dashboard:
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0/aio/deploy/recommended.yaml

kubectl proxy

Kubernetes Dashboard will be available at url displayed by previous command

Steps:
Install Docker Desktop
Go to settings and enable Kubernetes and check all the checkboxes

Install chocolatey https://chocolatey.org/docs/installation

Install skaffold choco install -y scaffold

GCP Commands:
-	Install Google Cloud SDK
-	Go to GCP. Go to GKE and create a cluster
-	gcloud auth login
-	gcloud container clusters get-credentials cluster-1 --zone us-east1-b --project employee-service-deployment


Skaffold Command:
skaffold dev --trigger notify

Application URL:
http://localhost:8081/awesome/john


