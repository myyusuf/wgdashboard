exports.convertToModel = function(map){
	var _riskManagement = {};
	
	_riskManagement["ra"] = map.get("P9");
	
	return _riskManagement;
}