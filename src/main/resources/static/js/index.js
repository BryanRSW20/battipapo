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

function confirmaSenha(){

var senha = document.getElementById("senha").value;
var confirmarSenha = document.getElementById("confirma-senha").value;
var outputSenha = document.getElementById("outputSenha");
var formulario = document.getElementById("form")

// Comparação das senhas
if(senha === confirmarSenha){
    console.log("As senhas são iguais!");
}
else{
    outputSenha.innerHTML = "Você digitou senhas diferentes"
    //Caso as senhas não sejam iguais, o formulário é resetado
    formulario.reset();
}

}
// Sidenav

function abreNav(){
    document.getElementById("sideNav").style.width = "250px";
    // document.getElementById("main").style.marginLeft = "250px";
}

function fechaNav(){
    document.getElementById("sideNav").style.width = "0px";
    // document.getElementById("main").style.marginLeft = "0px";
}

// Função de pesquisa

// function pesquisa(){
//     var input, filtro, ul, li, a, i;

//     input = document.getElementById("pesquisa");
//     filtro = input.value.toUpperCase();
//     ul = document.getElementById("menuPesquisa");
//     li = document.getElementsByTagName("li");

//     for(i = 0; i < li.length; i++){
//         a = li[i].getElementsByTagName("a")[0];

//         if(a.innerHTML.toUpperCase().indexOf(filter) > -1) {
//             li[i].style.display = "";
//         } else{
//             li[i].style.display = "none";
//         }
//     }
// }

//Contador de Tags/Likes

var interact = document.getElementById("interact");
var tags = 0;
var Clicou = false;

function contador(){
  if (!Clicou) {
    tags += 1;
    document.getElementById("output-tags").innerHTML = tags;
    Clicou = true;

    if (Clicou = true) {
      interact.style.color = "#06BA63"
    }
  }
}
   
