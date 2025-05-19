// Function to handle button clicks and append text to the input field
function doller(text) {
    const inputField = document.getElementById('short-bill');
    inputField.value += text;
}

// Function to handle adding items to the cart and performing basic calculations
function result() {
    const inputField = document.getElementById('short-bill');
    
    // Basic evaluation to check and handle calculations (e.g., "899*2")
    try {
        if (inputField.value.includes('*') || inputField.value.includes('+') || inputField.value.includes('-') || inputField.value.includes('/')) {
            inputField.value = eval(inputField.value); // Calculate the input string safely
            alert('Item added to cart with a total of $' + inputField.value);
        } else {
            alert('Please select a valid quantity or item before adding to the cart.');
        }
    } catch (error) {
        alert('Invalid operation. Please try again.');
    }

    // Clear the input field after adding to cart
    inputField.value = '';
}
