package com.online.taxi.controller;

import com.online.taxi.dto.ResponseResult;
import com.online.taxi.dto.map.request.DispatchRequest;
import com.online.taxi.service.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018/8/20
 */
@RestController
public class DispatchController {

	@Autowired
	private DispatchService dispatchService;

	//调用高德获取 符合条件的5个司机
	@PostMapping("/vehicleDispatch")
	public ResponseResult dispatch(@RequestBody DispatchRequest dispatchRequest) {
		return dispatchService.dispatch(dispatchRequest);
	}
}
