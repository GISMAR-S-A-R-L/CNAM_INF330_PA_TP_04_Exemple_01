# CNAM_INF330_PA_TP_04_Exemple_01

Exemples de tests unitaires en JAVA avec JUnit5

## Contenu
Dans cet exemple on trouve :

- `pom.xml`: qui contient la configuration `maven` nécessaire pour :
    - `test` : intégrer le framework JUnit5 pour l'implémentation des test unitaires
    - `build` :
        - intégrer la librairie `jackson` pour le sérialisation d'un flux json
        - la compilation et fabrication du .jar avec toutes les dépendances

- `src\main` : l'implémentation d'un programme pour sérialiser un flux json provenant d'un fichier
- `src\test` : quelques tests unitaires

## Script de lancement du programme
- `run.sh` : script permettant de lancer le programme JAVA en ligne de commande Linux.
- `run.bat` : script permettant de lancer le programme JAVA en ligne de commande Windows.