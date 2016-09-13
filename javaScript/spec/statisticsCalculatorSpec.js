describe('StatisticsCalculator', function () {

    it('should calculate maximum empty value from an empty sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([])).toBe('');
    });

    it('should calculate maximum 2 value from a sequence that is 2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([2])).toBe(2);
    });

    it('should calculate maximum 2 value from a sequence that is 1,2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([1,2])).toBe(2);
    });

    it('should calculate maximum 2 value from a sequence that is 2,1', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([2,1])).toBe(2);
    });

    it('should calculate maximum 5 value from a sequence that is 1,5,2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.maximum([1,5,2])).toBe(5);
    });
    
    

    it('should calculate minimum empty value from an empty sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([])).toBe('');
    });

    it('should calculate minimum 2 value from a sequence that is 2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([2])).toBe(2);
    });
    
    it('should calculate minimum 1 value from a sequence that is 1,2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([1,2])).toBe(1);
    });

    it('should calculate minimum 1 value from a sequence that is 2,1', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([2,1])).toBe(1);
    });

    it('should calculate minimum 3 value from a sequence that is 5,3,8', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.minimum([5,3,8])).toBe(3);
    });





    it('should calculate average empty value from an empty sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([])).toBe('');
    });

    it('should calculate average 2 value from a sequence that is 2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([2])).toBe(2);
    });

    it('should calculate average 3 value from a sequence that is 4,2', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([4,2])).toBe(3);
    });

    it('should calculate average 10 value from a sequence that is 5,10,15', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.average([5,10,15])).toBe(10);
    });
    
    

    it('should calculate length 0 for an empty sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength([])).toBe(0);
    });

    it('should calculate length 0 for an null sequence', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength()).toBe(0);
    });

    it('should calculate length 2 for a sequence with two numbers', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength([1,3])).toBe(2);
    });

    it('should calculate length 5 for a sequence with five numbers', function () {
        statisticsCalculator = new StatisticsCalculator();
        expect(statisticsCalculator.sequenceLength([1,3,6,9,20])).toBe(5);
    });


});
