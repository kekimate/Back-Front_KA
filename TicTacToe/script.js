const cells = document.querySelectorAll('.cell');
const message = document.getElementById('message');
const resetButton = document.getElementById('reset-button');

let currentPlayer = 'X';
let gameBoard = ['', '', '', '', '', '', '', '', ''];
let gameOver = false;

function checkWinner() {
    const winPatterns = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],
        [0, 3, 6], [1, 4, 7], [2, 5, 8],
        [0, 4, 8], [2, 4, 6]
    ];

    for (const pattern of winPatterns) {
        const [a, b, c] = pattern;
        if (gameBoard[a] && gameBoard[a] === gameBoard[b] && gameBoard[a] === gameBoard[c]) {
            return gameBoard[a];
        }
    }

    if (gameBoard.includes('')) {
        return null; // A játék még nem ért véget.
    } else {
        return 'TIE'; // Döntetlen.
    }
}

function handleCellClick(event) {
    const cellIndex = event.target.id;

    if (!gameOver && gameBoard[cellIndex] === '') {
        gameBoard[cellIndex] = currentPlayer;
        event.target.textContent = currentPlayer;
        
        const winner = checkWinner();
        if (winner) {
            gameOver = true;
            if (winner === 'TIE') {
                message.textContent = 'Döntetlen!';
            } else {
                message.textContent = `${winner} nyert!`;
            }
        } else {
            currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
            if (currentPlayer === 'O' && !gameOver) {
                // Ellenfél véletlenszerű lépése (egyszerű véletlenszerű választás).
                let emptyCells = [];
                for (let i = 0; i < gameBoard.length; i++) {
                    if (gameBoard[i] === '') {
                        emptyCells.push(i);
                    }
                }
                if (emptyCells.length > 0) {
                    const randomIndex = Math.floor(Math.random() * emptyCells.length);
                    const opponentMove = emptyCells[randomIndex];
                    gameBoard[opponentMove] = currentPlayer;
                    cells[opponentMove].textContent = currentPlayer;

                    const opponentWinner = checkWinner();
                    if (opponentWinner) {
                        gameOver = true;
                        if (opponentWinner === 'TIE') {
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

resetGame(); // Játék inicializálása.
