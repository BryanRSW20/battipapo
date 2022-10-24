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

// Float Label - Verificação Is Valid

const inputs = document.querySelectorAll("input");
 
inputs.forEach((input) => {
  input.addEventListener("blur", (event) => {
    if (event.target.value) {
      input.classList.add("is-valid");
    } else {
      input.classList.remove("is-valid");
    }
  });
});

// Verificação Confirmar Senha

var senha = document.getElementById("senha");
var confirmarSenha = document.getElementById("confirmar-senha");

if(senha == confirmarSenha){
    console.log("Tá serto");
}

else{
    console.log("Tá erradun");
    
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