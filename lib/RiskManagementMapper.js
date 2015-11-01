var RA_CELL_LOCATION = 'I9';

exports.convertToModel = function(map){
	var _riskManagement = {};
	
	_riskManagement["ra"] = map.getCell(RA_CELL_LOCATION).value;
	
	return _riskManagement;
}