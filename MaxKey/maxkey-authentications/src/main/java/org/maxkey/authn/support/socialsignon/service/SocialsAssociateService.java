/*
 * Copyright [2020] [MaxKey of copyright http://www.maxkey.top]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 

package org.maxkey.authn.support.socialsignon.service;

import java.util.List;


public interface SocialsAssociateService{

	public boolean insert(SocialsAssociate socialsAssociate); 
	
	public List<SocialsAssociate> query (SocialsAssociate socialsAssociate);
	
	public SocialsAssociate get (SocialsAssociate socialsAssociate);
	
	public boolean delete (SocialsAssociate socialsAssociate);
	
	public boolean update (SocialsAssociate socialsAssociate);
	
}
