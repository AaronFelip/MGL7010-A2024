# MGL7010 LABO1 - Introduction à GIT et VS Code

### Étape 1 : Installation de Java

1. **Téléchargement de la dernière version de Java** :
    - Rendez-vous sur le site officiel de Java pour télécharger la dernière version du JDK (Java Development Kit) : [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html).
    - Choisissez la version correspondant à votre système d'exploitation (Windows, macOS ou Linux) et suivez les instructions d'installation.

2. **Vérification de l'installation** :  
   Une fois Java installé, ouvrez un terminal ou une invite de commande et tapez la commande suivante pour vérifier que Java est bien installé et connaître la version installée :
   ```bash
   java -version
   ```

### Étape 2 : Installation de l’environnement de travail

La mise en place de l'environnement de travail implique la configuration de certains outils qui seront essentiels pour vos travaux tout au long de la session.

Parmi ces outils, nous installerons aujourd'hui **Visual Studio Code** comme IDE (environnement de développement intégré). Vous pouvez le télécharger gratuitement à cette adresse : [https://code.visualstudio.com/](https://code.visualstudio.com/).

#### Configuration de Java dans Visual Studio Code

Pour que **Visual Studio Code** fonctionne correctement avec Java, vous devez installer quelques plugins et extensions spécifiques. Voici les étapes :

1. **Installation de l'extension Java** :
    - Ouvrez Visual Studio Code.
    - Accédez au **Marketplace** des extensions (en cliquant sur l'icône d'extensions dans la barre latérale gauche ou via le raccourci `Ctrl+Shift+X`).
    - Recherchez **"Java Extension Pack"** et installez-le. Ce pack contient plusieurs extensions qui vous permettent de coder en Java, y compris le support pour l'autocomplétion, la gestion des projets Maven ou Gradle, et le débogage.

2. **Configurer le chemin du JDK** :
    - Allez dans les paramètres de Visual Studio Code (`Ctrl+,`).
    - Dans la barre de recherche des paramètres, tapez **"Java configuration"**.
    - Dans **Java Home**, spécifiez le chemin d'installation de votre JDK. Par exemple, pour Windows, cela pourrait être `C:\Program Files\Java\jdk-XX`. Sous macOS ou Linux, cela peut être `/Library/Java/JavaVirtualMachines/jdk-XX/Contents/Home`.

3. **Configurer le débogueur Java** :  
   Le Java Extension Pack installe automatiquement un débogueur Java, mais assurez-vous que **Debugger for Java** est activé dans Visual Studio Code.

4. **Test de l'installation** :  
   Créez un nouveau fichier Java (`Main.java`), écrivez un programme simple, puis compilez et exécutez-le à partir de Visual Studio Code :
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Hello, Java on Visual Studio Code!");
       }
   }
   ```

   Assurez-vous que tout fonctionne correctement en appuyant sur `F5` pour exécuter votre programme.

### Étape 3 : Installation de Git

**Git** est un système de gestion de version distribué qui permet de suivre les modifications apportées au code source et de collaborer efficacement sur des projets. Nous allons installer Git et expliquer comment il peut être utilisé pour gérer des projets en ligne de commande et sur des plateformes telles que GitLab.

- **Utilisateurs Windows** :  
  Téléchargez et installez Git depuis [https://git-scm.com/download/win](https://git-scm.com/download/win). Ce processus installera également **Git Bash**, un terminal qui permet d'utiliser les commandes Git sous Windows, et qui sera essentiel pour ce cours.

- **Utilisateurs Mac** :  
  Il est recommandé d'utiliser **Homebrew** ou **MacPorts** pour installer Git. Voici la commande pour installer Git avec Homebrew :
   ```bash
   brew install git
   ```
  Et avec MacPorts :
   ```bash
   sudo port install git
   ```

- **Utilisateurs Linux** :  
  Pour les systèmes basés sur Debian (comme Ubuntu), utilisez la commande suivante pour installer Git :
   ```bash
   sudo apt-get install git
   ```

Une fois installé, vous pouvez commencer à utiliser Git pour gérer vos projets, synchroniser votre code avec GitLab, et collaborer avec vos collègues.


Voici une version optimisée du texte, ainsi que les commandes à utiliser dans la section des solutions annexes :

---

# Démonstration GIT: Introduction

## Objectifs
- Manipuler les principales fonctionnalités de Git en ligne de commande.
- Utiliser GitLab pour héberger un dépôt distant.
- Gérer un dépôt distant.
- Écrire un premier programme en Java.

## Liste des commandes Git utiles
1. `git init` – Initialiser un dépôt Git local.
2. `git add` – Ajouter des fichiers à l'index.
3. `git commit` – Créer un commit avec un message décrivant les changements.
4. `git push` – Envoyer les modifications locales vers un dépôt distant.
5. `git clone` – Cloner un dépôt Git distant sur votre machine locale.
6. `git pull` – Récupérer les modifications depuis un dépôt distant et les fusionner dans votre dépôt local.
7. `git status` – Vérifier l'état actuel du dépôt.
8. `git log` – Afficher l'historique des commits.
9. `git reset` – Revenir à un état précédent du dépôt.
10. `git checkout` – Changer de branche ou revenir à une version précédente d’un fichier.
11. `git merge` – Fusionner les modifications d'une autre branche dans la branche actuelle.

## Configurer GIT sur votre machine
``` 
$ git config --global user.name "username"
$ git config --global user.email "email@domaine.ext"
$ git config --global core.editor "vim|nano"
$ git config --global color.ui auto
$ git config --global push.default simple
``` 
### Pour voir votre configuration
```
$ git config --list
```

## Exercices

1. **Créer un dépôt distant sur GitLab associé à l'UQAM**  
   *Lors de la création, ne pas ajouter automatiquement de fichier `README.md`.*
   [Voir la vidéo du premier dépôt](images/first-repo.webm)

2. **Créer un dépôt local vide sur votre machine**
   ```bash
    git init --initial-branch=main //master dans certains cas
    git remote add origin https://gitlab.info.uqam.ca/aaron/mgl7010-labo1.git // changer l'URL par la vôtre
   ```

3. **Dans votre IDE, créer un fichier `README.md` contenant votre nom complet et votre code permanent.**  
   Ensuite, ajouter le fichier à Git, et faire un commit.
   ```bash
   git add README.md
   git commit -m "Ajout du fichier README avec nom et code permanent"
   ```

4. **Pousser le commit vers le dépôt distant**
   ```bash
   git push -u origin main //master dans certains cas
   ```

5. **Modifier le fichier `README.md` localement en supprimant le code permanent, puis faire un nouveau push.**
   ```bash
   git add README.md
   git commit -m "Suppression du code permanent du fichier README"
   git push
   ```

6. **Effacer le dossier contenant les fichiers de ce labo sur votre machine.**  
   Utilisez la commande d'effacement de votre système (par exemple, `rm -rf <nom_du_dossier>` sur Linux/MacOS).

7. **Cloner le dépôt distant sur votre machine**
   ```bash
   git clone <URL_du_dépôt_distant>
   ```

8. **Ajouter un fichier `.gitignore` pour ignorer les fichiers `.class` et le pousser vers le dépôt distant.**
    - Créer le fichier `.gitignore` avec le contenu suivant :
      ```
      *.class
      ```  
    - Puis :
      ```bash
      git add .gitignore
      git commit -m "Ajout du fichier .gitignore pour exclure les fichiers .class"
      git push
      ```

9. **Écrire un programme FizzBuzz (Hello, world si too much) dans votre IDE et le pousser vers le dépôt distant.**  
   Après avoir écrit le programme :
   ```bash
   git add <nom_du_fichier>
   git commit -m "Ajout du programme FizzBuzz"
   git push
   ```

10. **Sur GitLab, modifier manuellement le fichier pour ajouter une en-tête de classe, puis sauvegarder.**

11. **Dans votre dépôt local, ajouter un commentaire dans le fichier `main` et faire un push. Que se passe-t-il ?**  
    Si vous n'avez pas encore récupéré les modifications du dépôt distant, un conflit peut se produire. Git vous demandera de résoudre ce conflit.

12. **Mettre à jour le fichier source local avec `git pull`, puis pousser à nouveau vos changements.**
   ```bash
   git pull
   git push
   ```

13. **Faire une modification quelconque dans votre code, puis la commiter. Ensuite, annuler la modification pour remettre le dépôt local dans son état d'origine.**
- Commiter la modification :
  ```bash
  git add <nom_du_fichier>
  git commit -m "Modification quelconque"
  ```  
- Annuler le commit et revenir à l'état précédent :
  ```bash
  git reset --hard HEAD^
  ```



