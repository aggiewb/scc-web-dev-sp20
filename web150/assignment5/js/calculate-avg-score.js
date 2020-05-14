
function getScore() {
    var score = parseInt(window.prompt("Enter test score\nOr enter 999 to end entries"));
    var scores = [];
    for(var i = 0; score !== 999; i++){
        scores[i] = score;
        var score = parseInt(window.prompt("Enter test score\nOr enter 999 to end entries"));
    }

    return scores;
}

function avgScore(scoreArray){
    var scoreSum = 0;
    for(var i = 0; i < scores.length; i++){
        scoreSum += scoreArray[i];
    }
    var averageScore = scoreSum / scoreArray.length;
    window.alert("Average score is " + averageScore);
}

var scores = getScore();
avgScore(scores);