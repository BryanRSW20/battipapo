// Função Alternar Light/Dark Mode

var toggle = document.getElementById("theme-toggle");

var storedTheme = localStorage.getItem('theme') || (window.matchMedia("(prefers-color-scheme: dark)").matches ? "dark" : "light");
if (storedTheme)
    document.documentElement.setAttribute('data-theme', storedTheme)


toggle.onclick = function() {
    var currentTheme = document.documentElement.getAttribute("data-theme");
    var targetTheme = "light";

    if (currentTheme === "light") {
        targetTheme = "dark";
    }

    document.documentElement.setAttribute('data-theme', targetTheme)
    localStorage.setItem('theme', targetTheme);
};

// Verificações Front-End Form Registro

var userAge = document.getElementById('iID').value;


if(userAge < 16){
    console.log("Menó");
    document.getElementById('outputAge').textContent("Sua idade está abaixo do aceitável pelos Termos de Uso.")   
}

else{
    console.log("Maió");
    
}

// Sidenav

function abreNav(){
    document.getElementById("sideNav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
}

function fechaNav(){
    document.getElementById("sideNav").style.width = "0px";
    document.getElementById("main").style.marginLeft = "0px";
}

// Função de pesquisa

function pesquisa(){
    var input, filtro, ul, li, a, i;

    input = document.getElementById("pesquisa");
    filter = input.value.toUpperCase();
    ul = document.getElementById("menuPesquisa");
    li = document.getElementsByTagName("li");

    for(i = 0; i < li.length; i++){
        a = li[i].getElementsByTagName("a")[0];

        if(a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else{
            li[i].style.display = "none";
        }
    }
}