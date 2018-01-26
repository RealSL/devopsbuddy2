/**
 * 
 */
$(document).ready(main);

function main(){
	
	$('.btn-collapse').click(function(e) {
		e.preventDefault();
		var $this=$(this);
		var $collapse = $this.closest('.collpase-group').find('.collapse');
		$collapse.collapse('toggle')
	});
	
}