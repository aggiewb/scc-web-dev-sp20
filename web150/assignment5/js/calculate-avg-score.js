
function getScore() {
    var score = parseInt(window.prompt("Enter test score\nOr enter 999 to end entries"));
    var scores = [];
    for(var i = 0; score !== 999; i++){
        scores[i] = score;
        var score = parseInt(window.prompt("Enter test score\nOr enter 999 to end entries"));
    }

    return scores;
}

