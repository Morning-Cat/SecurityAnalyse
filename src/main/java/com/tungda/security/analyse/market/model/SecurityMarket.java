package com.tungda.security.analyse.market.model;

//֤ȯ�г�
public class SecurityMarket extends Market {
	//�й�֤ȯ�г�
	public enum ChinaSecurityMarket{
		hu("000001"),
		shen("399001");
		String code;
		private ChinaSecurityMarket(String code){
			this.code=code;
		}
	}
}
