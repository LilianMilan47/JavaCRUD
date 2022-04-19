Pour que le projet fonctionne :

	Mettre l'adresse IP de sa base de donnée dans les fichiers :
		- JavaCRUD.java dans le package javacrud
		- UtilDB.java dans le package javacrud.tech

	Dans phpMyAdmin :
		- créer une base de donnée avec le nom "gestion_utilisateur"
		- importer le fichier "gestion_utilisateur.sql" se trouvant dans le dossier src/Document

Il ne reste plus qu'à lancer le projet avec NetBeans (les logins/mot de passes se trouvent dans la table utilisateur de la base)