 //控制层 
app.controller('specificationController' ,function($scope,$controller   ,specificationService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		specificationService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		specificationService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		specificationService.findOne(id).success(
			function(response){
					$scope.entity=response;
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=specificationService.update; //修改
		}else{
			serviceObject=specificationService.add;//增加
		}
		serviceObject($scope.entity)
			.success(
			function(response){
				if(response.success){
					//重新查询
					$scope.entity={};
					$scope.ids=[];
		        	$scope.reload();//重新加载
				}else{
					$scope.entity={};
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		specificationService.dele( $scope.ids ).success(
			function(response){
				if(response.success){
					$scope.reload();//刷新列表
					$scope.ids=[];
				}
				else{
					$scope.ids=[];
					alert("失败原因："+data.message);
				}
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(){
		specificationService.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage,$scope.entityCondition).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
    
});	
