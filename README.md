# TP 14 : Conteneurisation avec Docker

---

### Réalisé par

**Abla MARGHOUB**

### Encadré par

**Pr. Mohamed LACHGAR**

### Module

**Techniques de Programmation Avancée**

### Établissement

**École Normale Supérieure - Université Cadi Ayyad**

---

## 1. **Objectif du TP**

L’objectif de ce TP est d’apprendre à :

* Créer une application Spring Boot simple.
* La conteneuriser avec Docker via un **Dockerfile**.
* Déployer l'application avec une base de données MySQL dans un environnement multi-conteneurs via **Docker Compose**.
* Comprendre l’orchestration, la persistance des données et l’injection dynamique de variables d’environnement.
* Vérifier le fonctionnement de l’application dans un environnement isolé et reproductible.

---

## 2. **Architecture du TP**

Ce TP se compose de deux conteneurs :

1. **spring-app** : l’application Spring Boot packagée sous forme d’image Docker.
2. **mysql-db** : un conteneur MySQL 8 avec volume pour la persistance.

Docker Compose orchestre et démarre automatiquement les deux services avec leurs configurations appropriées.

---

### 2.1 **Stack technologique**

| Technologie / Outil | Rôle dans le projet            |
| ------------------- | ------------------------------ |
| **Java 21**         | Langage de développement       |
| **Spring Boot**     | Framework back-end             |
| **Spring Web**      | Création des endpoints REST    |
| **Spring Data JPA** | Gestion de la base via ORM     |
| **MySQL 8**         | Base de données relationnelle  |
| **Lombok**          | Réduction du boilerplate       |
| **Maven**           | Build & dépendances            |
| **Docker**          | Conteneurisation de l’app      |
| **Docker Compose**  | Orchestration multi-conteneurs |

---

### 2.2 **Structure du projet**

<img width="537" height="969" alt="image" src="https://github.com/user-attachments/assets/7529e541-e4a9-47bb-9621-7afe7f32b042" />

---

## 3.  **Résultat attendu**

### Démarrage des conteneurs

<img width="905" height="829" alt="image" src="https://github.com/user-attachments/assets/e5d6d801-6e6b-4e29-990d-d5a5dd2c518c" />
 
<img width="902" height="497" alt="14docker1" src="https://github.com/user-attachments/assets/47464e02-133a-4df4-8337-4e89e4e8d64c" />
<img width="906" height="423" alt="14docker2" src="https://github.com/user-attachments/assets/4eecfc63-cd7e-415c-86fb-303df8c56007" />
<img width="933" height="948" alt="14docker3" src="https://github.com/user-attachments/assets/11944490-7daf-4150-970b-2efae97d76bc" />

<img width="1021" height="560" alt="14docker" src="https://github.com/user-attachments/assets/b5f0f431-4761-48bb-bad2-86eb1c4dc6d1" />

### Application accessible

Dans un navigateur :

```
http://localhost:8080/
```
<img width="542" height="232" alt="image" src="https://github.com/user-attachments/assets/53af60e6-ace0-4df6-8365-c7595b9baa88" />


---

