for (const form of document.querySelectorAll("form")) {
    form.addEventListener("submit", function checkUserInputsByClass(event) {
      let errorsArray = ["test"];
      [...form.elements].forEach((input) => {
        if (input.classList.contains("required")) {
          if (input.value == "" || input.value.trim().length == 0) {errorsArray.push("Required fields must have a value that is not empty or whitespace.");}
        }
        if (input.classList.contains("required_size") && input.value !== "") {
          if (!requiredSizeValidationFunction(input)) {errorsArray.push("Required_size field lengths must exactly match the minlength attribute of that field.");}
        }
        if (input.classList.contains("alphabetic") && input.value !== "") {
          if (!alphabeticFunctionValidation(input)) {errorsArray.push("Alphabetic fields must be a series of alphabetic characters.");}
        }
        if (input.classList.contains("password") && (input.value !== "")) {
          if (!passwordValidatorFunction(input)) {errorsArray.push("Password fields must contain one or more of each of the following types: uppercase letters, lowercase letters, numbers, special characters.");}
        }
        if (input.classList.contains("numeric") && input.value !== "") {
          if (!numberValidatorFunction(input)) {errorsArray.push("Numeric fields must be a series of numbers.");}
        }
        if (input.classList.contains("username") && input.value !== "") {
          if (input.value.length < 8) { errorsArray.push("Username fields must contain at least 8 characters.");}
          if (!alphaNumericValidationFunction(input)) {errorsArray.push("Username fields must contain only alphanumeric characters.");}
        }
        if (input.classList.contains("phone") && input.value !== "") {
          if (!phoneValidationFunction(input)) {errorsArray.push("Phone fields must match the format of XXX-XXX-XXXX.");}
        }
        if (input.classList.contains("date") && input.value !== "") {
          if (!dateValidationFunction(input)) {errorsArray.push("Date fields must match the format of XX/XX/XXXX.");}
        }

      })
      if (errors.length > 0) {
        event.preventDefault()
        var listOfErrors = document.createElement("ul")
        listOfErrors.style = "color:red", "font-weight: bold"
      } else {
        form.submit();
      }
    });
  }
  const requiredSizeValidationFunction = (input) => {
    return input.value.length === parseInt(input.getAttribute("minlength"));
  };
  const numberValidatorFunction = (input) => {
    const regEx = /^\d+$/;
    return regEx.test(input.value.trim());
  }; 
  const alphaNumericValidationFunction = (input) => {
    const regEx = /^[0-9a-zA-Z]+$/;
    return regEx.test(input.value.trim());
  };
  const alphabeticFunctionValidation = (input) => {
    const regEx = /^[a-zA-Z]+$/;
    return regEx.test(input.value.trim());
  };
  const passwordValidatorFunction = (input) => {
    const regEx = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[¬!"£$%^&*()_+=\-`{}:@~#';<>?\/.,|\\]).*$/;
    return regEx.test(input.value);
  };
  const dateValidationFunction = (input) => {
    const regEx = /^[0-9]{2}[\/][0-9]{2}[\/][0-9]{4}$/;
    return regEx.test(input.value);
  };
  const phoneValidationFunction = (input) => {
    const regEx = /^(?:\(\d{3}\)|\d{3}-)\d{3}-\d{4}$/;
    return regEx.test(input.value);
  };