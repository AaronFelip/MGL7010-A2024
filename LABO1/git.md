Voici une liste et une explication des 5-6 commandes Git les plus utilisées, en prenant comme exemple l'URL de dépôt distant `https://github.com/AaronFelip/MGL7010-A2024` :

---

### Les commandes Git les plus utiles :

1. **`git clone`**
    - Cette commande permet de cloner un dépôt Git distant sur votre machine locale. Par exemple, pour cloner le dépôt distant associé à votre projet, vous utiliseriez :
      ```bash
      git clone https://github.com/AaronFelip/MGL7010-A2024.git
      ```
    - Cela va créer un répertoire local contenant une copie de tout le projet.

2. **`git add`**
    - Cette commande est utilisée pour ajouter des fichiers ou des modifications à l'index (zone de staging) avant de les committer. Par exemple, si vous avez modifié un fichier `README.md`, vous devez l’ajouter ainsi :
      ```bash
      git add README.md
      ```
    - Vous pouvez aussi ajouter tous les fichiers modifiés avec :
      ```bash
      git add .
      ```

3. **`git commit`**
    - Après avoir ajouté des fichiers à l'index, vous pouvez enregistrer ces modifications dans l'historique du dépôt avec un commit. Chaque commit doit avoir un message explicatif. Exemple :
      ```bash
      git commit -m "Ajout du fichier README avec les informations du projet"
      ```

4. **`git push`**
    - La commande `git push` permet d'envoyer les commits locaux vers le dépôt distant. Cela mettra à jour le dépôt Git distant avec vos dernières modifications. Pour pousser les modifications vers le dépôt distant `https://github.com/AaronFelip/MGL7010-A2024`, utilisez :
      ```bash
      git push origin master
      ```

5. **`git pull`**
    - Cette commande permet de récupérer les dernières modifications du dépôt distant et de les fusionner avec votre dépôt local. Cela assure que vous travaillez avec la version la plus à jour du projet. Par exemple :
      ```bash
      git pull origin master
      ```

6. **`git status`**
    - C’est l'une des commandes les plus utilisées pour connaître l'état de votre dépôt. Elle affiche les fichiers modifiés, ceux qui ne sont pas encore ajoutés à l'index, et ceux qui sont prêts à être commités. Utilisez-la fréquemment pour garder une vue claire de votre projet :
      ```bash
      git status
      ```

---

