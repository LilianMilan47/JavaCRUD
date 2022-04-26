Pour que le projet fonctionne :

	Mettre l'adresse IP, le login et le mot de passe de sa base de donnée dans les fichiers :
		- JavaCRUD.java dans le package javacrud
		- UtilDB.java dans le package javacrud.tech

	Dans phpMyAdmin :
		- créer une base de donnée avec le nom "gestion_utilisateur"
		- importer le fichier "gestion_utilisateur.sql" se trouvant dans le dossier src/Document

Il ne reste plus qu'à lancer le projet avec NetBeans (les logins/mot de passes se trouvent dans la table utilisateur de la base)

Si le projet a des erreurs :
	- Clique droit sur le projet
	- "Resolv Project Problems..."
	- Puis sur chacun des problèmes cliquer dessus puis sur "Resolve..." et les fichiers à localiser se trouve dans src/ressource (Attention : Pour l'erreur ""mysql-connector-java-8.0.27.jar" file/folder could not be found (in JavaCRUD)" il faut sélectionner le fichier "mysql-connector-java-8.0.23.jar"