'use strict';

/*
  Note: This test uses an HTML Fixture. Fixture elements are essentially an insertion of HTML onto your DOM for your tests to run on if your JS operates on the DOM.
  Using fixtures is a good practice in JS testing, and generally fixtures should be separated out from the code.
*/

describe('application', function () {
    var container, application;

    beforeEach(function () {
        container = fixture(
          '<div id="result-value"></div>' +
          '<button id="button-id"></button>' +
          '<button id="length"></button>' +
          '<button id="max"></button>' +
          '<button id="min"></button>' +
          '<button id="average"></button>' +
          '<input id="input-box">'
        );
        document.body.appendChild(container);
        application = new Application(document);
    });

    afterEach(function () {
        document.body.removeChild(container);
    });

    it('should change result-value when button is clicked', function () {
        application.init();
        document.getElementById('button-id').click();

        expect(document.getElementById('result-value').textContent).toEqual('clicked!');
    });

    it('should set result-value to 0 when input is empty and length button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('0');
    });

    it('should set result-value to 1 when input is 2 and length button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('1');
    });

    it('should set result-value to 1 when input is 10 and length button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '10';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('1');
    });

    it('should set result-value to 4 when input is 1,6,10,3 and length button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '1,6,10,3';
        document.getElementById('length').click();

        expect(document.getElementById('result-value').textContent).toEqual('4');
    });

    it('should set result-value to empty when input is empty and max button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('');
    });

    it('should set result-value to 2 when input is 2 and max button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should set result-value to 2 when input is 1,2 and max button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '1,2';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should set result-value to 2 when input is 2,1 and max button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2,1';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should set result-value to 5 when input is 1,5,2 and max button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '1,5,2';
        document.getElementById('max').click();

        expect(document.getElementById('result-value').textContent).toEqual('5');
    });
    

    it('should set result-value to empty when input is empty and min button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('');
    });

    it('should set result-value to 2 when input is 2 and min button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should set result-value to 1 when input is 1,2 and min button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '1,2';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('1');
    });

    it('should set result-value to 1 when input is 2,1 and min button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2,1';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('1');
    });

    it('should set result-value to 3 when input is 5,3,8 and max button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '5,3,8';
        document.getElementById('min').click();

        expect(document.getElementById('result-value').textContent).toEqual('3');
    });


    it('should set result-value to empty when input is empty and average button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('');
    });

    it('should set result-value to 2 when input is 2 and average button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('2');
    });

    it('should set result-value to 1.5 when input is 1,2 and average button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '1,2';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('1.5');
    });

    it('should set result-value to 3 when input is 2,4 and average button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '2,4';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('3');
    });

    it('should set result-value to 10 when input is 15,5,10 and average button is clicked', function () {
        application.init();
        document.getElementById('input-box').value = '15,5,10';
        document.getElementById('average').click();

        expect(document.getElementById('result-value').textContent).toEqual('10');
    });

});

function fixture(html) {
  var div = document.createElement('div');
  div.innerHTML = html;
  return div;
}
