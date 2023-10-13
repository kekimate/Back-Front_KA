let cells = document.querySelectorAll('.cell');
let message = document.getElementById('message');
let resetButton = document.getElementById('reset-button');

let currentPlayer = 'X';
let gameBoard = ['', '', '', '', '', '', '', '', ''];
let gameOver = false;

function checkWinner() {
    let winPatterns = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];

    for (let pattern of winPatterns) {
        let [a, b, c] = pattern;
        if (gameBoard[a] && gameBoard[a] === gameBoard[b] && gameBoard[a] === gameBoard[c]) {
            return gameBoard[a];
        }
    }

    if (gameBoard.includes('')) {
        return null;
    } else {
        return 'Döntetlen';
    }
}

function handleCellClick(event) {
    let cellIndex = event.target.id;

    if (!gameOver && gameBoard[cellIndex] === '') {
        gameBoard[cellIndex] = currentPlayer;
        event.target.textContent = currentPlayer;
        
        let winner = checkWinner();
        if (winner) {
            gameOver = true;
            if (winner === 'Döntetlen') {
                message.textContent = 'Döntetlen!';
            } else {
                message.textContent = `${winner} nyert!`;
            }
        } else {
            currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
            if (currentPlayer === 'O' && !gameOver) {
                let emptyCells = gameBoard.map((cell, index) => cell === '' ? index : -1).filter(index => index !== -1);
                let randomIndex = Math.floor(Math.random() * emptyCells.length);
                let opponentMove = emptyCells[randomIndex];
                gameBoard[opponentMove] = currentPlayer;
                cells[opponentMove].textContent = currentPlayer;

                let opponentWinner = checkWinner();
                if (opponentWinner) {
                    gameOver = true;
                    if (opponentWinner === 'Döntetlen') {
                        message.textContent = 'Döntetlen!';
                    } else {
                        message.textContent = `${opponentWinner} nyert!`;
                    }
                } else {
                    currentPlayer = 'X';
                }
            }
        }
    }
}
function resetGame() {
    gameBoard = ['', '', '', '', '', '', '', '', ''];
    currentPlayer = 'X';
    gameOver = false;
    cells.forEach(cell => cell.textContent = '');
    message.textContent = '';
}

cells.forEach(cell => cell.addEventListener('click', handleCellClick));
resetButton.addEventListener('click', resetGame);

resetGame();