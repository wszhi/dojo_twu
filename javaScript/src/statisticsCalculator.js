function StatisticsCalculator() {
    this.maximum = function (sequence) {
        if (sequence.length === 0) {
            return '';
        }
        return sequence.reduce(function (num1, num2) {
            return num1 > num2 ? num1 : num2;
        });
    };

    this.minimum = function (sequence) {
        if (sequence.length === 0) {
            return '';
        }
        return sequence.reduce(function (num1, num2) {
            return num1 < num2 ? num1 : num2;
        });
    };

    this.average = function (sequence) {
        if (sequence.length === 0) {
            return '';
        }
        var total = sequence.reduce(function (num1, num2) {
            return parseFloat(num1) + parseFloat(num2);
        });
        return (total / sequence.length);
    };

    this.sequenceLength = function (sequence) {
        if (sequence) {
            return sequence.length;
        }
        return 0;
    };

}
