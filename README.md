# estore

Projet pour l'enseignement des composants logiciels

## Couplage et dépendances

2. Identifiez les objets "services" et les dépendances de leur code
   a. Combien a-t-on d'objets (pas de classe) ? Où et comment est exprimée
   cette dépendance de leurs codes ?

7
4 sont créés dans la classe Main
et 3 appelés dans les scénarios de Client

   b. Comment avez-vous déterminé cela ? Quelles activités vous ont permis
   de les identifier ?

Parcours du code ligne par lignes, en regardant le role. Les services manipulent des datas. 

   c. Quel schéma de collaboration a-t-on ?
   TODO

## Services offerts

L'objectif de cette partie est d'identifier les services effectifs offerts par les objets
"services" et l'expression de cette offre. Pour cela, on part naturellement de
l'exécution décrite dans le main. Pour chaque objet "service" :
1. Identifiez les méthodes appelées par l'objet qui requiert les services. Donnez
   les profils.
2. Eliminez le couplage à des classes concrètes pour commencer l'introduction du
   pattern Bridge. Donnez les noms des interfaces créées.

   ==> Action : Faites l'extraction des interfaces correspondant aux services
   identifiés précédemment si ce n'est pas déjà fait
   ==> Action : Définissez le contenu de ces interfaces (profil des méthodes)

## Services requis

   L'objectif maintenant est de comprendre comment les objets deviennent couplés et
   comment couplage et dépendances sont exprimés dans le code. Cette partie donne
   lieu à la dernière étape du refactoring introduisant Bridge.
1. Eliminez les dépendances aux classes concrètes

   ==> Action : Remplacez les types des attributs par les types des services offerts
   ==> Action : Corrigez les appels aux méthodes des services offerts
2. 2. Corrigez les mécanismes d'injection de dépendances
      a. ==> Action : Faites ceci soit par l'usage d'un constructeur, de setters ou
      de méthodes d'injection spécifiques. Attention, tous les cas d'injection
      ne se traitent pas de la même façon.