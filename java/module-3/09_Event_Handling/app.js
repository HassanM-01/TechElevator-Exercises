let correctAnswer = 0;
let score = 0;
let currentProblem = 1
const numberOfProblems = 10;
let isCorrect = false;
let arrayOfProblems = [];

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



document.addEventListener('DOMContentLoaded', () => {


});