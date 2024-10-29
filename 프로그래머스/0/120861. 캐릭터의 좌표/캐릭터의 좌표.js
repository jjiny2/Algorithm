function solution(keyinput, board) {
    let x = 0, y = 0;
    const xLimit = Math.floor(board[0] / 2);
    const yLimit = Math.floor(board[1] / 2);
    
    for (let item of keyinput) {
        if (item === 'left') {
            x = Math.max(-xLimit, x - 1);
        } else if (item === 'right') {
            x = Math.min(xLimit, x + 1);
        } else if (item === 'up') {
            y = Math.min(yLimit, y + 1);
        } else if (item === 'down') {
            y = Math.max(-yLimit, y - 1);
        }
    }
    
    return [x, y];
}
