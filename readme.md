# RAPPORT DE TP
## Développement d’une API REST Calculatrice avec JAX-RS (Jersey) et Grizzly

---

## Page de garde

**Université :** faculté de science de sfax

**Filière :** LSI3

**Module :** SOA / Web Services

**TP :** Développement d’une API REST avec JAX-RS (Jersey)

**Sujet :** Service REST Calculatrice

**Réalisé par :** Omar Belfeki

**Année universitaire :** 2025 / 2026

---

## 1. Introduction

Dans le cadre du module SOA / Web Services, ce travail pratique a pour objectif de concevoir et de mettre en œuvre une API REST en Java en utilisant la spécification JAX-RS et son implémentation Jersey.

Contrairement à une architecture classique basée sur un serveur d’applications externe, l’API développée dans ce TP fonctionne sous forme d’une application Java autonome intégrant un serveur HTTP embarqué Grizzly. Cette approche permet de simplifier le déploiement et l’exécution du service.

L’API réalisée correspond à un service de calculatrice REST proposant les opérations arithmétiques de base : addition, soustraction, multiplication et division.

De plus, l’outil Postman n’étant pas fonctionnel sur mon ordinateur, j’ai utilisé le client HTTP intégré à IntelliJ (.http) pour tester les endpoints. L’API est exécutée via GrizzlyHttpServerFactory puisque Tomcat n’a pas pu être configuré correctement.

---

## 2. Environnement technique utilisé

Les outils et technologies utilisés pour la réalisation de ce TP sont les suivants :

- **Système d’exploitation :** Ubuntu Linux 22.04
- **Langage de programmation :** Java
- **Version Java :** JDK 17 (Eclipse Adoptium)
- **IDE :** IntelliJ IDEA Community Edition
- **Outil de build :** Maven
- **Framework REST :** JAX-RS (Jersey 3.x)
- **Serveur HTTP embarqué :** Grizzly
- **Mode d’exécution :** Application Java standalone
- **Format d’échange :** JSON
- **Outils de test :** IntelliJ HTTP Client (.http)

---

## 3. Description du fonctionnement de l’API

L’API REST développée expose plusieurs endpoints accessibles via le protocole HTTP. Chaque endpoint correspond à une opération mathématique.

Les paramètres nécessaires aux calculs sont transmis via des *Query Parameters* dans l’URL de la requête. Les résultats sont retournés au client sous forme d’objets JSON.

### 3.1 Structure de l’application

L’application est structurée de la manière suivante :

- **Calculatrice** : classe métier contenant la logique des opérations mathématiques.
- **Operation** : modèle de données représentant une opération et son résultat, sérialisé en JSON.
- **CalculRest** : ressource REST exposant les endpoints HTTP.
- **RestApplication** : classe de configuration Jersey et point d’entrée de l’application.

### 3.2 Liste des endpoints

| Méthode HTTP | Endpoint | Description |
|-------------|---------|-------------|
| GET | /api/calcul/addition | Addition de deux nombres |
| GET | /api/calcul/soustraction | Soustraction de deux nombres |
| GET | /api/calcul/multiplication | Multiplication de deux nombres |
| GET | /api/calcul/division | Division de deux nombres |

### 3.3 Exemple de requête

```
GET http://localhost:8080/api/calcul/addition?a=5&b=3
```

### 3.4 Exemple de réponse JSON

```json
{
  "type": "addition",
  "a": 5,
  "b": 3,
  "resultat": 8
}
```

---

## 4. Tests de l’API

Les tests de l’API ont été réalisés à l’aide du client HTTP intégré à IntelliJ via des fichiers `.http`. Chaque endpoint a été testé en envoyant des requêtes HTTP de type GET avec différents paramètres. Les réponses JSON retournées confirment le bon fonctionnement des opérations proposées.

### 4.1 Tests effectués

- Test de l’endpoint d’addition
- Test de l’endpoint de soustraction
- Test de l’endpoint de multiplication
- Test de l’endpoint de division
- Test de l’endpoint de division par zéro

### 4.2 Captures d’écran

**Figure 1 :** Test de l’endpoint Addition  
<img width="1366" height="805" alt="7-test-addition" src="https://github.com/user-attachments/assets/90e5e4d8-ce15-45ca-a2b6-5bb65a1bc30f" />


**Figure 2 :** Test de l’endpoint Soustraction  
<img width="1366" height="805" alt="7-test-soustraction" src="https://github.com/user-attachments/assets/b4275955-189d-4cc0-8059-4936af479b8b" />


**Figure 3 :** Test de l’endpoint Multiplication  
<img width="1366" height="805" alt="7-test-multiplication" src="https://github.com/user-attachments/assets/3e6deca9-8c7c-4e0e-8557-e44e8722fc5e" />


**Figure 4 :** Test de l’endpoint Division  
<img width="1366" height="805" alt="7-test-division" src="https://github.com/user-attachments/assets/d7025626-6098-400f-97e7-89878ccbcc9b" />


**Figure 5 :** Test de l’endpoint Division par zéro  
<img width="1366" height="805" alt="7-test-division-zero" src="https://github.com/user-attachments/assets/ec7c4bc7-7ec8-43af-bdca-3a6bc89386d6" />

---

## 5. Schéma de l’architecture REST

L’architecture de l’application repose sur un modèle REST simple et efficace intégrant un serveur HTTP embarqué.

### Schéma de l’architecture

```
[ Client (HTTP Client IntelliJ) ]
                |
                v
     [ Grizzly HTTP Server ]
                |
                v
        [ Jersey (JAX-RS) ]
                |
                v
        [ Ressource REST ]
                |
                v
          [ Calculatrice ]
```

Dans cette architecture, Grizzly joue le rôle de serveur HTTP, tandis que Jersey assure la gestion des requêtes REST et le routage vers les ressources appropriées.

---

## 6. Conclusion

Ce travail pratique a permis de concevoir et de déployer une API REST fonctionnelle en Java en utilisant JAX-RS et Jersey avec un serveur HTTP embarqué Grizzly.

Cette approche a permis de mieux comprendre le fonctionnement interne des services REST, la configuration de Jersey ainsi que l’exécution d’une application REST en mode autonome, sans dépendre d’un serveur d’applications externe.

Les objectifs pédagogiques du TP ont été atteints et cette réalisation constitue une base solide pour le développement de services REST plus avancés.

---

**Fin du rapport**
