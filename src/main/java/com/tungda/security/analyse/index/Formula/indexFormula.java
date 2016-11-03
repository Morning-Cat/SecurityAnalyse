package com.tungda.security.analyse.index.Formula;

/*采用策略模式，封装不同的算法，使之可以相互替换*/
public interface indexFormula {
	public double caculate();//传入参数类型暂时省略
}
