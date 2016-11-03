package com.tungda.security.analyse.market.model;

//证券市场
public class SecurityMarket extends Market {
	//中国证券市场
	public enum ChinaSecurityMarket{
		hu("000001"),
		shen("399001");
		String code;
		private ChinaSecurityMarket(String code){
			this.code=code;
		}
	}
}
