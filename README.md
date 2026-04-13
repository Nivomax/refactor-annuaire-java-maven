# Refactor Annuaire Java Maven

Exercice de refactorisation d'une application Java/Maven vers une architecture multicouche.

## Architecture
- `controller` : gestion des entrées/sorties
- `service` : logique métier de recherche
- `repository` : accès aux données de haut niveau
- `dao` : données codées en dur
- `dto` : objets de transfert

## Lancement
```powershell
mvn clean test
mvn exec:java -Dexec.mainClass=org.example.Main
```

## Point d'entrée
- `src/main/java/org/example/Main.java`

