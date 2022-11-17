addEventListener("submit", submitButtonWasClicked)
function submitButtonWasClicked() {
alert("stopped")
event.preventDefault() //probably put an if here so if no errors then no prevent 
}
function makeAnArrayOfAllRequiredInputs() {
    const values = Array.from(document.querySelectorAll('.required'))
    .map(input => input.value)
    console.log(values)
    for (var i = 0; i < values.length; i++)
    {
        if (values[i] == "" || values[i] == null || values[i].match(/^ *$/)!==null){
        console.log("empty");
        var ul = document.createElement('ul');
    }else{console.log("not empty")}
    }

}


