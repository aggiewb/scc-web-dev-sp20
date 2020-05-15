(function() {
    //Function to get individual user scores, which are stored in an array, and returns array.
    function getScore() {
        var scores = [];
        var doneNum = 999;
        var score = parseInt(window.prompt("Enter test score\nOr enter " + doneNum + " to end entries"));
        

        for(var i = 0; score !== doneNum; i++){
            scores[i] = score;
            score = parseInt(window.prompt("Enter test score\nOr enter " + doneNum + " to end entries"));
        }

        return scores;
    }

    //Function to average an array of scores
    function avgScore(scoreArray){
        var scoreSum = 0;

        for(var i = 0; i < scoreArray.length; i++){
            scoreSum += scoreArray[i];
        }

        var averageScore = scoreSum / scoreArray.length;
        if(scoreSum % scoreArray.length !== 0){
            averageScore = averageScore.toFixed(2);
        }
        
        window.alert("Average score is " + averageScore);
    }

    //Call avgScore and pass in the return value of getScore
    avgScore(getScore());
}());