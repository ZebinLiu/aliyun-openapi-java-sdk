/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.transform.v20160104;

import com.aliyuncs.iot.model.v20160104.DevicePermitModifyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DevicePermitModifyResponseUnmarshaller {

	public static DevicePermitModifyResponse unmarshall(DevicePermitModifyResponse devicePermitModifyResponse, UnmarshallerContext context) {
		
		devicePermitModifyResponse.setRequestId(context.stringValue("DevicePermitModifyResponse.RequestId"));
		devicePermitModifyResponse.setSuccess(context.booleanValue("DevicePermitModifyResponse.Success"));
		devicePermitModifyResponse.setErrorMessage(context.stringValue("DevicePermitModifyResponse.ErrorMessage"));
	 
	 	return devicePermitModifyResponse;
	}
}