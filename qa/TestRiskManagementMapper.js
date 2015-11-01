var RiskManagementMapper = require('../lib/RiskManagementMapper.js');
var expect = require('chai').expect;

var fs = require('fs-extra'),
Excel = require("exceljs");

var RA_CELL_LOCATION = 'I9';
var RA_CELL_VALUE = 123;

var _map = {};
_map['getCell'] = function(cell){

	if(RA_CELL_LOCATION == cell){
		return {value: RA_CELL_VALUE};
	}	
	return null;
};

suite('RiskManagementMapper unit tests', function(){

	var _riskManagement = RiskManagementMapper.convertToModel(_map);
	
	test('_riskManagement.ra should return an ra value', function(){
		expect(_riskManagement.ra).to.equal(RA_CELL_VALUE);
	});
});

suite('RiskManagementMapper integration tests', function(){

	var filename = 'e:/tests/node/fileupload/labul_test.xlsx';
	
	test('_riskManagement.ra should return an ra value', function(done){
		var workbook = new Excel.Workbook();
		
		workbook.xlsx.readFile(filename).then(function() {
			// use workbook 
			console.log('use workbook');
			
			var worksheet = workbook.getWorksheet("MANRISK")
			//console.log('I9 : ' + worksheet.getCell("I9").value);
			
			var _riskManagement = RiskManagementMapper.convertToModel(worksheet);
			expect(_riskManagement.ra).to.equal(RA_CELL_VALUE);
			
			done();
			
		});
		
	});
	
	

	
});