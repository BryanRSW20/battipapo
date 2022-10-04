function darkmode(){
    const element = document.body;

if(localStorage.getItem("data-theme")){
    element.setAttribute("data-theme", localStorage.getItem("data-theme"));
    darkmode(1);
}

function darkmode(r) {
    const dataTheme = element.getAttribute("data-theme");
    let trocaTema;
    if(dataTheme === "claro"){
        trocaTema = 1
    } 
    else {
        trocaTema = 0
    }
    
    if (trocaTema) {
        element.setAttribute("data-theme", "escuro");
        localStorage.setItem("data-theme", "escuro");
    }
    else{
        element.setAttribute("data-theme", "claro");
        localStorage.setItem("data-theme", "claro");
    }
}

// element.classList.toggle("dark-mode");


}