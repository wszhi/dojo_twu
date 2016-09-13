'use strict';
var Application = function () {
    return {
        init: function () {
            document.getElementById('button-id').onclick = function () {
                document.getElementById('result-value').textContent = "clicked!";
            };
            document.getElementById('length').onclick = function () {
                var textSequence = document.getElementById('input-box').value;
                var arraySequence = textSequence.length > 0 ? textSequence.split(",") : [];
                var seqenceLength = new StatisticsCalculator().sequenceLength(arraySequence);
                document.getElementById('result-value').textContent = seqenceLength;
            };

            document.getElementById('max').onclick = function () {
                var textSequence = document.getElementById('input-box').value;
                var arraySequence = textSequence.length > 0 ? textSequence.split(",") : [];
                var seqenceLength = new StatisticsCalculator().maximum(arraySequence);
                document.getElementById('result-value').textContent = seqenceLength;
            };

            document.getElementById('min').onclick = function () {
                var textSequence = document.getElementById('input-box').value;
                var arraySequence = textSequence.length > 0 ? textSequence.split(",") : [];
                var seqenceLength = new StatisticsCalculator().minimum(arraySequence);
                document.getElementById('result-value').textContent = seqenceLength;
            };

            document.getElementById('average').onclick = function () {
                var textSequence = document.getElementById('input-box').value;
                var arraySequence = textSequence.length > 0 ? textSequence.split(",") : [];
                var seqenceLength = new StatisticsCalculator().average(arraySequence);
                document.getElementById('result-value').textContent = seqenceLength;
            };
        }
    };
};

var application = new Application(document);
application.init();