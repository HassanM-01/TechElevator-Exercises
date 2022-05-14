let correctAnswer = 0;
let score = 0;
let currentProblem = 1
const numberOfProblems = 10;
let isCorrect = false;
let arrayOfProblems = [];
let answerListArray = [];

function getRandomNumber(max) {
    return Math.floor(Math.random() * Math.floor(max));
  }

function generateProblemSet () {
    for (let i = 0; i < numberOfProblems; i++){
        const problem = {
        leftNumber : getRandomNumber(10),
        rightNumber: getRandomNumber(10)
        }
    arrayOfProblems.push(problem)
    }
}

function generateCorrectAnswer () {
    
       let numberOne = arrayOfProblems[currentProblem-1].leftNumber
       let numberTwo = arrayOfProblems[currentProblem-1].rightNumber
        correctAnswer = numberOne * numberTwo;
    }

function generateWrongAnswer (){
    let isSame = true;
    let numberOne = arrayOfProblems[currentProblem-1].leftNumber
    let numberTwo = 0;
    let wrongAnswer = 0;
    while(isSame){
        numberTwo = getRandomNumber(10)
        wrongAnswer = numberOne * numberTwo;
        if(wrongAnswer != correctAnswer){
            isSame = false;
        }
    }
    return wrongAnswer;
}

function displayProblem(){
    const pContainer = document.getElementById('problem')
    const expression = arrayOfProblems[currentProblem-1].leftNumber + ' * ' + arrayOfProblems[currentProblem-1].rightNumber
    pContainer.querySelector('div.expression').innerText = expression;
}

function populateAnswerArray(){
    answerListArray[0] = correctAnswer;
    answerListArray[1] = generateWrongAnswer();
    answerListArray[2] = generateWrongAnswer();
    answerListArray[3] = generateWrongAnswer();

    answerListArray = shuffleArray(answerListArray)
}

function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
  }

function updateCurrentProblem(){

}

function displayAnswer(){
    const aContainer = document.querySelector('ul');
    const answerList = aContainer.children;
    let answerListArray = Array.from(answerList)
    let counter = 0;

    answerListArray.forEach((item) => {
        item.innerText = [counter];
        counter++;
    })

}


document.addEventListener('DOMContentLoaded', () => {
    generateProblemSet();
    generateCorrectAnswer();
    displayProblem();
    populateAnswerArray();
    displayAnswer();
    

});