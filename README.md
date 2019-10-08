# flughafen

https://pastebin.com/UW7VyUEK

Pasul 1: Accepti invitatia pe git pentru repo-ul proiectului

Pasul 2: Deschizi un terminal/cmd si mergi cu cd(change directory)
	 pana intr-un folder pe desktop(sau unde vrei)  

	 cd Desktop
	 cd Proiect
	 git clone https://github.com/CrissRO/flughafen

!!! Comenzile de git urmatoare pot fi executate doar din folderul flughafen !!!

	 cd flughafen 

Pasul 3: Pentru a te diferentia pe git iti creezi un branch
	
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
