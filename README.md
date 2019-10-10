# flughafen
In caz ca nu ai proiectul vezi tutorialul **[2]NU AM PROIECTUL**
altfel **[1]AM PROIECTUL**



# [1]AM PROIECTUL

COMENZILE URMATOARE SE VOR EXECUTA IN FOLDERUL PROIECTULUI

In caz ca ai deja un branch creat cu numele tau (ex: cmocanu)
trebuie sa il stergi folosind comenzile:

	git checkout cmocanu
	git checkout -- .
	git checkout master
	git branch -D cmocanu
	git push origin --delete cmocanu 
	
Upadtam proiectul la ultima versiune de master:

	git checkout master
	git pull origin master

Dupa ce ai sters branchul cu numele tau si ai updatat proiectul la ultima versiune de **master**, consulti linkul [acesta](https://github.com/CrissRO/flughafen/issues)
pentru a vedea daca ai vreun issue atribuit contului tau.

Pentru a crea un branch cu issue-ul tau se vor executa comenzile:

Daca branchul **NU EXISTA**:

	git checkout -b "iss1"
	
Daca branchul **EXISTA**:

	git checkout iss1
	
Dupa ce am facut implementarile necesare dam commit si push:

	git commit -a -m "[iss1]Numele issueului"
	git push origin iss1

Se pot adauga multiple modificari pe branch atata timp cat aveti branchul selectat



# [2]NU AM PROIECTUL

Pasul 1: Accepti invitatia pe git pentru repo-ul proiectului

Pasul 2: Deschizi un terminal/cmd si mergi cu cd(change directory)
	 pana intr-un folder pe desktop(sau unde vrei)  

	 cd Desktop
	 cd Proiect
	 git clone https://github.com/CrissRO/flughafen

**Comenzile de git urmatoare pot fi executate doar din folderul flughafen**

	 cd flughafen 

Pasul 3: Pentru a te diferentia pe git iti creezi un branch cu numele tau sau al issue-ului pe care trebuie sa il rezolvi
	
	git checkout -b "cmocanu"

Pasul 4: In eclipse importi proiectul prin 

	 File>Import>General Project>Existing Project Into Workspace  
	 
Pasul 5: Faci modificarile pe care trebuie sa le faci

	 (de exemplu eu fac modificari in Flug.java)

Pasul 6: Cand consider ca am terminat execut comanda urmatoare in consola
	 ce are cd in folderul cu proiectul
	
In caz ca am adaugat fisiere noi folosim:

	 git add . 

Pentru modificari de tip text in fisiere folosim:

	 git commit -a -m "[cmocanu] Modificari in Flug.java"

Pasul 7: In aceasi consola urmeaza coamnda
	 !nimeni nu da push prin master!

	 git push origin cmocanu

Pasul 8: In caz ca vrei sa faci alte modificari repeti procedura 
	 de la pasul 6 incolo  
