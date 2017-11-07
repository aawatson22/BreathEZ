

package com.example.amanda.breathez;

import java.util.List;

public class WekaclassifierRandomForest extends RandomForest {

public double max;
public double rmin;
public double lmin;
public double rslope;
public double lslope;

public String toString() {
StringBuilder b = new StringBuilder();
b.append("MyClass: ");
b.append(MyClass);
b.append(", max: ");
b.append(max);
b.append(", rmin: ");
b.append(rmin);
b.append(", lmin: ");
b.append(lmin);
b.append(", rslope: ");
b.append(rslope);
b.append(", lslope: ");
b.append(lslope);
return b.toString();
}

protected void runClassifiers(List<Prediction> predictions) {
	predictions.add(runTree0());
	predictions.add(runTree1());
	predictions.add(runTree2());
	predictions.add(runTree3());
	predictions.add(runTree4());
	predictions.add(runTree5());
	predictions.add(runTree6());
	predictions.add(runTree7());
	predictions.add(runTree8());
	predictions.add(runTree9());
	predictions.add(runTree10());
	predictions.add(runTree11());
	predictions.add(runTree12());
	predictions.add(runTree13());
	predictions.add(runTree14());
	predictions.add(runTree15());
	predictions.add(runTree16());
	predictions.add(runTree17());
	predictions.add(runTree18());
	predictions.add(runTree19());
	predictions.add(runTree20());
	predictions.add(runTree21());
	predictions.add(runTree22());
	predictions.add(runTree23());
	predictions.add(runTree24());
	predictions.add(runTree25());
	predictions.add(runTree26());
	predictions.add(runTree27());
	predictions.add(runTree28());
	predictions.add(runTree29());
	predictions.add(runTree30());
	predictions.add(runTree31());
	predictions.add(runTree32());
	predictions.add(runTree33());
	predictions.add(runTree34());
	predictions.add(runTree35());
	predictions.add(runTree36());
	predictions.add(runTree37());
	predictions.add(runTree38());
	predictions.add(runTree39());
	predictions.add(runTree40());
	predictions.add(runTree41());
	predictions.add(runTree42());
	predictions.add(runTree43());
	predictions.add(runTree44());
	predictions.add(runTree45());
	predictions.add(runTree46());
	predictions.add(runTree47());
	predictions.add(runTree48());
	predictions.add(runTree49());
	predictions.add(runTree50());
	predictions.add(runTree51());
	predictions.add(runTree52());
	predictions.add(runTree53());
	predictions.add(runTree54());
	predictions.add(runTree55());
	predictions.add(runTree56());
	predictions.add(runTree57());
	predictions.add(runTree58());
	predictions.add(runTree59());
	predictions.add(runTree60());
	predictions.add(runTree61());
	predictions.add(runTree62());
	predictions.add(runTree63());
	predictions.add(runTree64());
	predictions.add(runTree65());
	predictions.add(runTree66());
	predictions.add(runTree67());
	predictions.add(runTree68());
	predictions.add(runTree69());
	predictions.add(runTree70());
	predictions.add(runTree71());
	predictions.add(runTree72());
	predictions.add(runTree73());
	predictions.add(runTree74());
	predictions.add(runTree75());
	predictions.add(runTree76());
	predictions.add(runTree77());
	predictions.add(runTree78());
	predictions.add(runTree79());
	predictions.add(runTree80());
	predictions.add(runTree81());
	predictions.add(runTree82());
	predictions.add(runTree83());
	predictions.add(runTree84());
	predictions.add(runTree85());
	predictions.add(runTree86());
	predictions.add(runTree87());
	predictions.add(runTree88());
	predictions.add(runTree89());
	predictions.add(runTree90());
	predictions.add(runTree91());
	predictions.add(runTree92());
	predictions.add(runTree93());
	predictions.add(runTree94());
	predictions.add(runTree95());
	predictions.add(runTree96());
	predictions.add(runTree97());
	predictions.add(runTree98());
	predictions.add(runTree99());
}

private Prediction runTree0() {
	if( max >= 14.89 ) { 
		if( rslope >= -18857.5 ) { return new Prediction("AT", 51.67, 2.67); }
	if( rslope < -18857.5 ) {
		if( lmin < -13.48 ) { return new Prediction("NAT", 1.05, 0); }
		if( lmin >= -13.48 ) { return new Prediction("AT", 7.38, 0.38); }
	}
	}
	if( max < 14.89 ) { 
	if( rmin >= -7.6 ) { 
	if( rmin < 4.24 ) { 
	if( max >= 1.68 ) { 
	if( max < 10.18 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 56.94, 0); }
	if( rslope < -5426 ) { 
		if( rslope < -35123.5 ) { return new Prediction("NAT", 45.34, 0); }
	if( rslope >= -35123.5 ) { 
		if( rslope >= -6068 ) { return new Prediction("AT", 5.27, 0.27); }
	if( rslope < -6068 ) { 
		if( rslope >= -8889 ) { return new Prediction("NAT", 18.98, 0); }
	if( rslope < -8889 ) { 
	if( rmin < 2.08 ) { 
	if( lslope < -17642.5 ) { 
		if( lmin >= 1.24 ) { return new Prediction("NAT", 9.49, 0); }
	if( lmin < 1.24 ) { 
	if( max >= 7.28 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.05, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 5.27, 0.27); }
	}
	if( max < 7.28 ) { 
	if( rmin >= -5.54 ) { 
	if( rmin >= -0.24 ) { 
		if( max >= 4.06 ) { return new Prediction("AT", 5.27, 0.27); }
	if( max < 4.06 ) { 
		if( rmin >= 0.5 ) { return new Prediction("NAT", 5.27, 0); }
		if( rmin < 0.5 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	}
	if( rmin < -0.24 ) { 
		if( lslope >= -18315.5 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lslope < -18315.5 ) { return new Prediction("NAT", 28.47, 0); }
	}
	}
	if( rmin < -5.54 ) { 
		if( lslope < -18397 ) { return new Prediction("AT", 5.27, 0.27); }
		if( lslope >= -18397 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
	}
	}
	if( lslope >= -17642.5 ) { 
	if( lmin < -5.41 ) { 
	if( lmin < -6.07 ) { 
	if( rmin >= -6.31 ) { 
		if( max >= 2.25 ) { return new Prediction("NAT", 2.11, 0); }
		if( max < 2.25 ) { return new Prediction("AT", 1.05, 0.05); }
	}
		if( rmin < -6.31 ) { return new Prediction("NAT", 5.27, 0); }
	}
		if( lmin >= -6.07 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( lmin >= -5.41 ) { return new Prediction("NAT", 42.18, 0); }
	}
	}
	if( rmin >= 2.08 ) { 
	if( rslope >= -23765.5 ) { 
		if( max < 2.97 ) { return new Prediction("NAT", 1.05, 0); }
	if( max >= 2.97 ) { 
		if( rmin < 3.4 ) { return new Prediction("AT", 7.38, 0.38); }
	if( rmin >= 3.4 ) { 
		if( max >= 8.54 ) { return new Prediction("AT", 2.11, 0.11); }
		if( max < 8.54 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
	}
		if( rslope < -23765.5 ) { return new Prediction("NAT", 7.38, 0); }
	}
	}
	}
	}
	}
	}
	if( max >= 10.18 ) { 
		if( lmin >= 3.21 ) { return new Prediction("NAT", 20.03, 0); }
	if( lmin < 3.21 ) { 
	if( lslope >= -19959 ) { 
	if( lslope >= -10026.5 ) { 
	if( rmin < 2.39 ) { 
		if( max < 11.16 ) { return new Prediction("NAT", 5.27, 0); }
	if( max >= 11.16 ) { 
		if( lmin < -9.2 ) { return new Prediction("AT", 2.11, 0.11); }
		if( lmin >= -9.2 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
		if( rmin >= 2.39 ) { return new Prediction("AT", 3.16, 0.16); }
	}
		if( lslope < -10026.5 ) { return new Prediction("AT", 17.92, 0.92); }
	}
	if( lslope < -19959 ) { 
		if( rmin < -2.69 ) { return new Prediction("NAT", 4.22, 0); }
	if( rmin >= -2.69 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 3.16, 0); }
		if( rmin < 2.46 ) { return new Prediction("AT", 3.16, 0.16); }
	}
	}
	}
	}
	}
	if( max < 1.68 ) { 
		if( rmin >= -6.3 ) { return new Prediction("NAT", 188.74, 0); }
	if( rmin < -6.3 ) { 
		if( rmin >= -6.38 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rmin < -6.38 ) { return new Prediction("NAT", 33.74, 0); }
	}
	}
	}
		if( rmin >= 4.24 ) { return new Prediction("NAT", 101.22, 0); }
	}
	if( rmin < -7.6 ) { 
	if( max < 3.21 ) { 
	if( lslope >= -10213 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 10.54, 0); }
	if( lslope < -4149.5 ) { 
		if( lmin < -10.66 ) { return new Prediction("AT", 11.6, 0.6); }
	if( lmin >= -10.66 ) { 
		if( lmin < -10.39 ) { return new Prediction("NAT", 2.11, 0); }
		if( lmin >= -10.39 ) { return new Prediction("AT", 3.16, 0.16); }
	}
	}
	}
	if( lslope < -10213 ) { 
		if( rmin >= -7.82 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rmin < -7.82 ) { return new Prediction("NAT", 42.18, 0); }
	}
	}
	if( max >= 3.21 ) { 
	if( lmin >= -7.35 ) { 
		if( max >= 4.17 ) { return new Prediction("NAT", 12.65, 0); }
		if( max < 4.17 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	if( lmin < -7.35 ) { 
	if( lmin >= -16.85 ) { 
	if( lslope < -11418 ) { 
		if( rslope < -14728 ) { return new Prediction("AT", 20.03, 1.03); }
	if( rslope >= -14728 ) { 
		if( max >= 9.05 ) { return new Prediction("AT", 2.11, 0.11); }
		if( max < 9.05 ) { return new Prediction("NAT", 4.22, 0); }
	}
	}
		if( lslope >= -11418 ) { return new Prediction("AT", 28.47, 1.47); }
	}
		if( lmin < -16.85 ) { return new Prediction("NAT", 5.27, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree1() {
	if( lmin < -9.17 ) { 
	if( max < 9.21 ) { 
	if( lslope < -10729.5 ) { 
	if( max < 7.92 ) { 
	if( lslope < -15114.5 ) { 
	if( rmin < -5.25 ) { 
		if( max < 0.35 ) { return new Prediction("NAT", 5.36, 0.01); }
	if( max >= 0.35 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 7.5, 0.48); }
	}
	}
		if( rmin >= -5.25 ) { return new Prediction("NAT", 12.86, 0.03); }
	}
		if( lslope >= -15114.5 ) { return new Prediction("NAT", 19.29, 0.05); }
	}
	if( max >= 7.92 ) { 
		if( lslope < -16039.5 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lslope >= -16039.5 ) { return new Prediction("AT", 5.36, 0.35); }
	}
	}
	if( lslope >= -10729.5 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 7.5, 0.02); }
	if( lslope < -4149.5 ) { 
	if( max >= -5.41 ) { 
	if( lmin < -19.4 ) { 
		if( lmin < -20.72 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -20.72 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lmin >= -19.4 ) { 
		if( max >= -2.19 ) { return new Prediction("AT", 30.01, 1.93); }
	if( max < -2.19 ) { 
		if( lmin < -13.17 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= -13.17 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
		if( max < -5.41 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
	}
	if( max >= 9.21 ) { 
		if( rslope >= -20001.5 ) { return new Prediction("AT", 66.44, 4.28); }
	if( rslope < -20001.5 ) { 
		if( lslope >= -28257 ) { return new Prediction("NAT", 6.43, 0.02); }
		if( lslope < -28257 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
	}
	if( lmin >= -9.17 ) { 
		if( lmin >= 2.68 ) { return new Prediction("NAT", 140.38, 0.33); }
	if( lmin < 2.68 ) { 
	if( rslope >= -35655 ) { 
	if( max < 6.32 ) { 
	if( lmin >= 0.39 ) { 
	if( max >= 3.5 ) { 
		if( rmin < -0.92 ) { return new Prediction("NAT", 5.36, 0.01); }
	if( rmin >= -0.92 ) { 
	if( lmin < 1.21 ) { 
		if( rmin < 2.81 ) { return new Prediction("AT", 7.5, 0.48); }
		if( rmin >= 2.81 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin >= 1.21 ) { return new Prediction("NAT", 3.21, 0.01); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 34.29, 0.08); }
	}
	if( lmin < 0.39 ) { 
		if( rmin >= -5.57 ) { return new Prediction("NAT", 198.25, 0.46); }
	if( rmin < -5.57 ) { 
	if( max >= 1.43 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 9.64, 0.02); }
	if( lmin < -4.28 ) { 
		if( rmin < -8.39 ) { return new Prediction("NAT", 6.43, 0.02); }
		if( rmin >= -8.39 ) { return new Prediction("AT", 4.29, 0.28); }
	}
	}
		if( max < 1.43 ) { return new Prediction("NAT", 42.86, 0.1); }
	}
	}
	}
	if( max >= 6.32 ) { 
		if( rslope >= -6525 ) { return new Prediction("NAT", 23.58, 0.06); }
	if( rslope < -6525 ) { 
	if( lslope >= -18985.5 ) { 
	if( max < 10.47 ) { 
	if( rmin >= -6.63 ) { 
		if( max >= 9.4 ) { return new Prediction("NAT", 4.29, 0.01); }
	if( max < 9.4 ) { 
	if( lmin >= 0.55 ) { 
		if( max >= 7.29 ) { return new Prediction("NAT", 4.29, 0.01); }
	if( max < 7.29 ) { 
		if( lmin >= 1.63 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < 1.63 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( lmin < 0.55 ) { 
	if( lmin < -1.3 ) { 
		if( lmin >= -5.11 ) { return new Prediction("NAT", 4.29, 0.01); }
		if( lmin < -5.11 ) { return new Prediction("AT", 3.21, 0.21); }
	}
		if( lmin >= -1.3 ) { return new Prediction("AT", 8.57, 0.55); }
	}
	}
	}
		if( rmin < -6.63 ) { return new Prediction("AT", 10.72, 0.69); }
	}
	if( max >= 10.47 ) { 
	if( rmin >= -19.21 ) { 
	if( rmin >= 1.82 ) { 
		if( rmin >= 2.97 ) { return new Prediction("AT", 9.64, 0.62); }
		if( rmin < 2.97 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin < 1.82 ) { return new Prediction("AT", 15, 0.97); }
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( lslope < -18985.5 ) { 
		if( rmin >= -0.4 ) { return new Prediction("NAT", 22.5, 0.05); }
	if( rmin < -0.4 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 8.57, 0.55); }
	}
	}
	}
	}
	}
		if( rslope < -35655 ) { return new Prediction("NAT", 102.87, 0.24); }
	}
	}
return null;
}
private Prediction runTree2() {
	if( max < 11.14 ) { 
	if( lmin < -7.7 ) { 
	if( rslope >= -10526.5 ) { 
	if( rslope >= -5051 ) { 
		if( rslope >= -3819 ) { return new Prediction("NAT", 9.71, 0.02); }
	if( rslope < -3819 ) { 
		if( max >= -3.62 ) { return new Prediction("AT", 4.31, 0.3); }
		if( max < -3.62 ) { return new Prediction("NAT", 3.24, 0.01); }
	}
	}
		if( rslope < -5051 ) { return new Prediction("AT", 43.14, 3.03); }
	}
	if( rslope < -10526.5 ) { 
	if( max < 5.41 ) { 
	if( lmin < -7.93 ) { 
	if( rmin >= -8.14 ) { 
		if( max < 1.55 ) { return new Prediction("NAT", 16.18, 0.04); }
	if( max >= 1.55 ) { 
	if( rmin < -5.25 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 2.16, 0.01); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 2.16, 0.15); }
	}
		if( rmin >= -5.25 ) { return new Prediction("NAT", 6.47, 0.02); }
	}
	}
		if( rmin < -8.14 ) { return new Prediction("NAT", 29.12, 0.07); }
	}
		if( lmin >= -7.93 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	if( max >= 5.41 ) { 
	if( rmin < -0.66 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 2.16, 0.01); }
	if( lslope >= -35302 ) { 
		if( lmin >= -9.55 ) { return new Prediction("AT", 9.71, 0.68); }
	if( lmin < -9.55 ) { 
		if( lmin < -13.27 ) { return new Prediction("AT", 5.39, 0.38); }
	if( lmin >= -13.27 ) { 
		if( max < 7.56 ) { return new Prediction("AT", 2.16, 0.15); }
		if( max >= 7.56 ) { return new Prediction("NAT", 4.31, 0.01); }
	}
	}
	}
	}
		if( rmin >= -0.66 ) { return new Prediction("NAT", 4.31, 0.01); }
	}
	}
	}
	if( lmin >= -7.7 ) { 
		if( max < 1.65 ) { return new Prediction("NAT", 218.91, 0.51); }
	if( max >= 1.65 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 83.04, 0.19); }
	if( rslope < -5426 ) { 
	if( lslope >= -6005.5 ) { 
		if( lslope < -5364.5 ) { return new Prediction("AT", 7.55, 0.53); }
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 1.08, 0); }
	}
	if( lslope < -6005.5 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 47.45, 0.11); }
	if( lmin < 3.98 ) { 
	if( rmin >= -0.17 ) { 
	if( rmin >= 0.41 ) { 
	if( max >= 6.82 ) { 
		if( rslope < -16752 ) { return new Prediction("NAT", 15.1, 0.04); }
	if( rslope >= -16752 ) { 
		if( lmin >= -1.61 ) { return new Prediction("AT", 19.41, 1.37); }
		if( lmin < -1.61 ) { return new Prediction("NAT", 6.47, 0.02); }
	}
	}
	if( max < 6.82 ) { 
		if( rmin >= 1.29 ) { return new Prediction("NAT", 32.35, 0.08); }
	if( rmin < 1.29 ) { 
	if( lslope >= -27253 ) { 
		if( lmin >= -2.24 ) { return new Prediction("AT", 3.24, 0.23); }
		if( lmin < -2.24 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
		if( lslope < -27253 ) { return new Prediction("NAT", 5.39, 0.01); }
	}
	}
	}
		if( rmin < 0.41 ) { return new Prediction("AT", 9.71, 0.68); }
	}
	if( rmin < -0.17 ) { 
	if( lmin >= -4.28 ) { 
	if( max >= 7.53 ) { 
		if( max < 7.6 ) { return new Prediction("AT", 2.16, 0.15); }
	if( max >= 7.6 ) { 
		if( max >= 10.93 ) { return new Prediction("AT", 1.08, 0.08); }
		if( max < 10.93 ) { return new Prediction("NAT", 7.55, 0.02); }
	}
	}
		if( max < 7.53 ) { return new Prediction("NAT", 77.64, 0.18); }
	}
	if( lmin < -4.28 ) { 
		if( lslope < -34937 ) { return new Prediction("NAT", 7.55, 0.02); }
	if( lslope >= -34937 ) { 
		if( rmin >= -3.95 ) { return new Prediction("NAT", 6.47, 0.02); }
	if( rmin < -3.95 ) { 
	if( lmin < -6.13 ) { 
		if( max < 6.31 ) { return new Prediction("NAT", 3.24, 0.01); }
		if( max >= 6.31 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	if( lmin >= -6.13 ) { 
		if( rmin < -5.61 ) { return new Prediction("AT", 7.55, 0.53); }
	if( rmin >= -5.61 ) { 
		if( lmin >= -5.3 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin < -5.3 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	if( max >= 11.14 ) { 
	if( lmin < -1.66 ) { 
	if( lslope < -18972 ) { 
	if( max >= 11.33 ) { 
		if( lmin < -13.48 ) { return new Prediction("NAT", 6.47, 0.02); }
	if( lmin >= -13.48 ) { 
		if( max < 12.03 ) { return new Prediction("NAT", 3.24, 0.01); }
	if( max >= 12.03 ) { 
		if( rmin >= -6.3 ) { return new Prediction("AT", 5.39, 0.38); }
	if( rmin < -6.3 ) { 
		if( lmin < -9.72 ) { return new Prediction("NAT", 2.16, 0.01); }
		if( lmin >= -9.72 ) { return new Prediction("AT", 3.24, 0.23); }
	}
	}
	}
	}
		if( max < 11.33 ) { return new Prediction("AT", 5.39, 0.38); }
	}
	if( lslope >= -18972 ) { 
	if( lslope >= -2255.99 ) { 
		if( rslope < -2252.01 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope >= -2252.01 ) { return new Prediction("AT", 7.55, 0.53); }
	}
		if( lslope < -2255.99 ) { return new Prediction("AT", 75.49, 5.31); }
	}
	}
	if( lmin >= -1.66 ) { 
		if( lslope >= -14016 ) { return new Prediction("NAT", 16.18, 0.04); }
	if( lslope < -14016 ) { 
		if( rslope < -20544.5 ) { return new Prediction("NAT", 7.55, 0.02); }
		if( rslope >= -20544.5 ) { return new Prediction("AT", 5.39, 0.38); }
	}
	}
	}
return null;
}
private Prediction runTree3() {
	if( lmin >= -8.27 ) { 
	if( max >= 5.51 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 93.72, 0); }
	if( lmin < 3.98 ) { 
		if( max >= 15.69 ) { return new Prediction("AT", 14.74, 0.74); }
	if( max < 15.69 ) { 
	if( rmin < 6.74 ) { 
	if( rslope < -4918.5 ) { 
		if( rslope >= -7951 ) { return new Prediction("AT", 9.48, 0.48); }
	if( rslope < -7951 ) { 
		if( rslope < -36005 ) { return new Prediction("NAT", 11.58, 0); }
	if( rslope >= -36005 ) { 
	if( max >= 7.32 ) { 
	if( lmin >= -0.8 ) { 
	if( max < 7.63 ) { 
		if( lslope < -10280.5 ) { return new Prediction("AT", 14.74, 0.74); }
		if( lslope >= -10280.5 ) { return new Prediction("NAT", 1.05, 0); }
	}
	if( max >= 7.63 ) { 
		if( rslope < -14682 ) { return new Prediction("NAT", 5.27, 0); }
	if( rslope >= -14682 ) { 
		if( rmin < -12.38 ) { return new Prediction("NAT", 1.05, 0); }
		if( rmin >= -12.38 ) { return new Prediction("AT", 8.42, 0.42); }
	}
	}
	}
	if( lmin < -0.8 ) { 
	if( rmin < -0.79 ) { 
	if( lslope < -13033 ) { 
	if( max < 11.09 ) { 
		if( rmin < -5.45 ) { return new Prediction("NAT", 1.05, 0); }
		if( rmin >= -5.45 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( max >= 11.09 ) { return new Prediction("AT", 8.42, 0.42); }
	}
		if( lslope >= -13033 ) { return new Prediction("NAT", 2.11, 0); }
	}
	if( rmin >= -0.79 ) { 
		if( max < 12.57 ) { return new Prediction("NAT", 14.74, 0); }
		if( max >= 12.57 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	}
	}
	if( max < 7.32 ) { 
	if( rslope >= -28660 ) { 
	if( lslope >= -18742 ) { 
	if( max < 7.05 ) { 
		if( lmin < -6.34 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lmin >= -6.34 ) { return new Prediction("NAT", 13.69, 0); }
	}
		if( max >= 7.05 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( lslope < -18742 ) { return new Prediction("NAT", 12.64, 0); }
	}
		if( rslope < -28660 ) { return new Prediction("AT", 5.27, 0.27); }
	}
	}
	}
	}
		if( rslope >= -4918.5 ) { return new Prediction("NAT", 13.69, 0); }
	}
		if( rmin >= 6.74 ) { return new Prediction("NAT", 18.96, 0); }
	}
	}
	}
	if( max < 5.51 ) { 
	if( max >= 1.68 ) { 
		if( rmin >= 1.21 ) { return new Prediction("NAT", 56.87, 0); }
	if( rmin < 1.21 ) { 
	if( lslope >= -30377.5 ) { 
	if( rmin < 1.17 ) { 
	if( rslope >= -29932 ) { 
	if( max >= 1.74 ) { 
	if( rslope < -18790.5 ) { 
		if( rmin < -5.58 ) { return new Prediction("AT", 2.11, 0.11); }
	if( rmin >= -5.58 ) { 
	if( max >= 3.6 ) { 
		if( lmin < -2.51 ) { return new Prediction("NAT", 2.11, 0); }
	if( lmin >= -2.51 ) { 
		if( rmin < 0.81 ) { return new Prediction("AT", 2.11, 0.11); }
		if( rmin >= 0.81 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
		if( max < 3.6 ) { return new Prediction("NAT", 22.11, 0); }
	}
	}
		if( rslope >= -18790.5 ) { return new Prediction("NAT", 45.28, 0); }
	}
	if( max < 1.74 ) { 
		if( lslope < -6691.5 ) { return new Prediction("NAT", 2.11, 0); }
		if( lslope >= -6691.5 ) { return new Prediction("AT", 3.16, 0.16); }
	}
	}
		if( rslope < -29932 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( rmin >= 1.17 ) { return new Prediction("AT", 3.16, 0.16); }
	}
		if( lslope < -30377.5 ) { return new Prediction("NAT", 31.59, 0); }
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 220.1, 0); }
	}
	}
	if( lmin < -8.27 ) { 
	if( lslope < -19947.5 ) { 
	if( rmin >= -6.1 ) { 
		if( lmin >= -8.76 ) { return new Prediction("AT", 3.16, 0.16); }
	if( lmin < -8.76 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 13.69, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	}
		if( rmin < -6.1 ) { return new Prediction("NAT", 14.74, 0); }
	}
	if( lslope >= -19947.5 ) { 
	if( max < 11.14 ) { 
		if( lslope >= -4851.5 ) { return new Prediction("NAT", 14.74, 0); }
	if( lslope < -4851.5 ) { 
	if( rslope < -11195 ) { 
	if( lslope >= -14974.5 ) { 
		if( lmin < -16.69 ) { return new Prediction("AT", 2.11, 0.11); }
	if( lmin >= -16.69 ) { 
	if( rmin < -15.71 ) { 
		if( lmin < -15.36 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lmin >= -15.36 ) { return new Prediction("NAT", 1.05, 0); }
	}
		if( rmin >= -15.71 ) { return new Prediction("NAT", 20.01, 0); }
	}
	}
	if( lslope < -14974.5 ) { 
	if( rslope < -16690 ) { 
		if( lslope < -19381.5 ) { return new Prediction("AT", 5.27, 0.27); }
	if( lslope >= -19381.5 ) { 
	if( rslope >= -19160 ) { 
	if( rslope < -17354 ) { 
		if( lmin >= -12.7 ) { return new Prediction("AT", 5.27, 0.27); }
		if( lmin < -12.7 ) { return new Prediction("NAT", 1.05, 0); }
	}
	if( rslope >= -17354 ) { 
	if( lslope >= -16849.5 ) { 
		if( rmin >= -4.69 ) { return new Prediction("NAT", 1.05, 0); }
		if( rmin < -4.69 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( lslope < -16849.5 ) { return new Prediction("NAT", 4.21, 0); }
	}
	}
		if( rslope < -19160 ) { return new Prediction("NAT", 4.21, 0); }
	}
	}
	if( rslope >= -16690 ) { 
		if( max >= 6.03 ) { return new Prediction("AT", 11.58, 0.58); }
	if( max < 6.03 ) { 
		if( max < 1.89 ) { return new Prediction("AT", 1.05, 0.05); }
		if( max >= 1.89 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
	}
	}
		if( rslope >= -11195 ) { return new Prediction("AT", 41.07, 2.07); }
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 50.55, 2.55); }
	}
	}
return null;
}
private Prediction runTree4() {
	if( lmin < -7.73 ) { 
	if( rslope >= -19885 ) { 
		if( max < -3.46 ) { return new Prediction("NAT", 21.27, 0.02); }
	if( max >= -3.46 ) { 
	if( rslope < -10879.5 ) { 
	if( max < 7.92 ) { 
		if( rslope >= -14995.5 ) { return new Prediction("NAT", 21.27, 0.02); }
	if( rslope < -14995.5 ) { 
	if( lmin >= -12.26 ) { 
	if( rmin < -8.06 ) { 
		if( lmin >= -10.21 ) { return new Prediction("NAT", 5.32, 0.01); }
		if( lmin < -10.21 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( rmin >= -8.06 ) { 
		if( rmin < -4.31 ) { return new Prediction("AT", 9.57, 0.56); }
		if( rmin >= -4.31 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 5.32, 0.01); }
	}
	}
	if( max >= 7.92 ) { 
		if( lslope >= -16707.5 ) { return new Prediction("AT", 38.29, 2.24); }
	if( lslope < -16707.5 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 11.7, 0.69); }
		if( max < 9.7 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
	}
	if( rslope >= -10879.5 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 4.25, 0); }
	if( lmin >= -23.72 ) { 
		if( lslope < -2471.99 ) { return new Prediction("AT", 72.32, 4.24); }
	if( lslope >= -2471.99 ) { 
		if( lmin >= -13.47 ) { return new Prediction("AT", 3.19, 0.19); }
		if( lmin < -13.47 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	}
	if( rslope < -19885 ) { 
	if( rslope < -29695.5 ) { 
		if( lslope >= -35460.5 ) { return new Prediction("AT", 4.25, 0.25); }
		if( lslope < -35460.5 ) { return new Prediction("NAT", 17.02, 0.02); }
	}
		if( rslope >= -29695.5 ) { return new Prediction("NAT", 18.08, 0.02); }
	}
	}
	if( lmin >= -7.73 ) { 
	if( max < 10.58 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 138.27, 0.16); }
	if( lmin < 1.09 ) { 
	if( max >= 1.68 ) { 
	if( max >= 1.74 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 34.03, 0.04); }
	if( lslope < -5358 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 30.84, 0.04); }
	if( max >= 3.17 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 20.21, 0.02); }
	if( rslope >= -33045 ) { 
	if( max >= 3.71 ) { 
	if( rslope >= -7343.5 ) { 
		if( max < 6.27 ) { return new Prediction("NAT", 5.32, 0.01); }
	if( max >= 6.27 ) { 
		if( lmin < -0.02 ) { return new Prediction("AT", 5.32, 0.31); }
		if( lmin >= -0.02 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( rslope < -7343.5 ) { 
	if( lslope < -22683.5 ) { 
		if( lmin >= 0.06 ) { return new Prediction("AT", 6.38, 0.37); }
	if( lmin < 0.06 ) { 
		if( lslope >= -32607 ) { return new Prediction("NAT", 17.02, 0.02); }
		if( lslope < -32607 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( lslope >= -22683.5 ) { 
	if( rmin < -5.82 ) { 
	if( rmin < -5.9 ) { 
	if( lmin < -4.74 ) { 
		if( rmin >= -6.53 ) { return new Prediction("AT", 2.13, 0.12); }
	if( rmin < -6.53 ) { 
		if( lslope < -15052.5 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lslope >= -15052.5 ) { return new Prediction("NAT", 6.38, 0.01); }
	}
	}
		if( lmin >= -4.74 ) { return new Prediction("NAT", 9.57, 0.01); }
	}
		if( rmin >= -5.9 ) { return new Prediction("AT", 2.13, 0.12); }
	}
		if( rmin >= -5.82 ) { return new Prediction("NAT", 57.43, 0.07); }
	}
	}
	}
	if( max < 3.71 ) { 
		if( max >= 3.49 ) { return new Prediction("AT", 3.19, 0.19); }
	if( max < 3.49 ) { 
		if( lslope < -24794 ) { return new Prediction("NAT", 3.19, 0); }
		if( lslope >= -24794 ) { return new Prediction("AT", 2.13, 0.12); }
	}
	}
	}
	}
	}
	}
		if( max < 1.74 ) { return new Prediction("AT", 4.25, 0.25); }
	}
		if( max < 1.68 ) { return new Prediction("NAT", 172.3, 0.2); }
	}
	}
	if( max >= 10.58 ) { 
	if( rmin < 5.89 ) { 
	if( lmin < 3.62 ) { 
		if( max >= 15.69 ) { return new Prediction("AT", 10.64, 0.62); }
	if( max < 15.69 ) { 
		if( lmin >= 2.3 ) { return new Prediction("AT", 8.51, 0.5); }
	if( lmin < 2.3 ) { 
	if( rslope >= -21351.5 ) { 
		if( rslope >= -5371.5 ) { return new Prediction("NAT", 4.25, 0); }
	if( rslope < -5371.5 ) { 
		if( rmin < -12.38 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -12.38 ) { return new Prediction("AT", 13.83, 0.81); }
	}
	}
	if( rslope < -21351.5 ) { 
		if( lmin >= -1.7 ) { return new Prediction("NAT", 7.45, 0.01); }
	if( lmin < -1.7 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 3.19, 0); }
		if( max >= 11.09 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	}
		if( lmin >= 3.62 ) { return new Prediction("NAT", 18.08, 0.02); }
	}
		if( rmin >= 5.89 ) { return new Prediction("NAT", 23.4, 0.03); }
	}
	}
return null;
}
private Prediction runTree5() {
	if( rmin >= -7.46 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 95.73, 0.11); }
	if( lmin < 3.98 ) { 
	if( lslope >= -33031.5 ) { 
	if( max < 5.52 ) { 
	if( rmin < -4.74 ) { 
		if( max < 2.09 ) { return new Prediction("AT", 4.3, 0.3); }
	if( max >= 2.09 ) { 
	if( rmin >= -6.93 ) { 
		if( max >= 2.38 ) { return new Prediction("NAT", 6.45, 0.01); }
	if( max < 2.38 ) { 
		if( lmin >= -10.36 ) { return new Prediction("AT", 1.08, 0.07); }
		if( lmin < -10.36 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( rmin < -6.93 ) { return new Prediction("AT", 1.08, 0.07); }
	}
	}
	if( rmin >= -4.74 ) { 
		if( rmin < 0.25 ) { return new Prediction("NAT", 54.86, 0.06); }
	if( rmin >= 0.25 ) { 
		if( rmin < 0.45 ) { return new Prediction("AT", 2.15, 0.15); }
	if( rmin >= 0.45 ) { 
		if( lslope >= -18814.5 ) { return new Prediction("NAT", 17.21, 0.02); }
	if( lslope < -18814.5 ) { 
		if( rslope < -26978 ) { return new Prediction("NAT", 15.06, 0.02); }
	if( rslope >= -26978 ) { 
		if( lmin < -2.59 ) { return new Prediction("AT", 1.08, 0.07); }
	if( lmin >= -2.59 ) { 
		if( rmin < 1.3 ) { return new Prediction("AT", 1.08, 0.07); }
		if( rmin >= 1.3 ) { return new Prediction("NAT", 4.3, 0.01); }
	}
	}
	}
	}
	}
	}
	}
	if( max >= 5.52 ) { 
	if( rslope >= -16663.5 ) { 
		if( lmin < -9.97 ) { return new Prediction("AT", 9.68, 0.67); }
	if( lmin >= -9.97 ) { 
		if( lslope >= -4680 ) { return new Prediction("NAT", 12.91, 0.02); }
	if( lslope < -4680 ) { 
	if( lmin < 2.65 ) { 
	if( lmin < -1.13 ) { 
		if( max >= 6.5 ) { return new Prediction("NAT", 16.13, 0.02); }
	if( max < 6.5 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope >= -10417 ) { return new Prediction("AT", 3.23, 0.22); }
	}
	}
	if( lmin >= -1.13 ) { 
	if( lmin < 0.63 ) { 
		if( max < 6.74 ) { return new Prediction("NAT", 4.3, 0.01); }
		if( max >= 6.74 ) { return new Prediction("AT", 12.91, 0.89); }
	}
	if( lmin >= 0.63 ) { 
		if( rmin < -0.06 ) { return new Prediction("NAT", 7.53, 0.01); }
	if( rmin >= -0.06 ) { 
		if( max >= 7.38 ) { return new Prediction("NAT", 3.23, 0); }
		if( max < 7.38 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	}
	}
		if( lmin >= 2.65 ) { return new Prediction("AT", 5.38, 0.37); }
	}
	}
	}
	if( rslope < -16663.5 ) { 
	if( max >= 6.01 ) { 
	if( rmin < -1.85 ) { 
	if( rmin >= -4.21 ) { 
		if( max >= 7.28 ) { return new Prediction("AT", 3.23, 0.22); }
		if( max < 7.28 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( rmin < -4.21 ) { return new Prediction("NAT", 8.61, 0.01); }
	}
		if( rmin >= -1.85 ) { return new Prediction("NAT", 33.35, 0.04); }
	}
		if( max < 6.01 ) { return new Prediction("AT", 6.45, 0.45); }
	}
	}
	}
		if( lslope < -33031.5 ) { return new Prediction("NAT", 65.62, 0.08); }
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 210.83, 0.25); }
	}
	if( max >= 13.14 ) { 
	if( lmin < 1.46 ) { 
	if( rmin < -5.33 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 2.15, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 4.3, 0.3); }
	}
		if( rmin >= -5.33 ) { return new Prediction("AT", 46.25, 3.2); }
	}
		if( lmin >= 1.46 ) { return new Prediction("NAT", 5.38, 0.01); }
	}
	}
	if( rmin < -7.46 ) { 
	if( max >= -0.77 ) { 
	if( lslope < -10474.5 ) { 
		if( rslope < -34555 ) { return new Prediction("NAT", 10.76, 0.01); }
	if( rslope >= -34555 ) { 
	if( max < 6.32 ) { 
		if( rmin < -8.31 ) { return new Prediction("NAT", 25.82, 0.03); }
	if( rmin >= -8.31 ) { 
		if( max >= 3.49 ) { return new Prediction("NAT", 5.38, 0.01); }
		if( max < 3.49 ) { return new Prediction("AT", 4.3, 0.3); }
	}
	}
	if( max >= 6.32 ) { 
	if( lmin < -11.53 ) { 
		if( lslope < -16039.5 ) { return new Prediction("NAT", 2.15, 0); }
		if( lslope >= -16039.5 ) { return new Prediction("AT", 4.3, 0.3); }
	}
		if( lmin >= -11.53 ) { return new Prediction("AT", 17.21, 1.19); }
	}
	}
	}
	if( lslope >= -10474.5 ) { 
	if( lmin >= -22.76 ) { 
		if( lmin < -2.74 ) { return new Prediction("AT", 69.92, 4.84); }
		if( lmin >= -2.74 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 5.38, 0.01); }
	}
	}
	if( max < -0.77 ) { 
		if( lmin < -13.17 ) { return new Prediction("AT", 1.08, 0.07); }
		if( lmin >= -13.17 ) { return new Prediction("NAT", 33.35, 0.04); }
	}
	}
return null;
}
private Prediction runTree6() {
	if( lmin >= -8.97 ) { 
	if( max >= 1.68 ) { 
	if( rslope < -5891 ) { 
	if( rslope >= -36810.5 ) { 
	if( max < 10.58 ) { 
	if( lmin >= 1.19 ) { 
		if( lslope < -9322 ) { return new Prediction("NAT", 36.86, 0.09); }
	if( lslope >= -9322 ) { 
		if( lslope >= -8573 ) { return new Prediction("NAT", 17.9, 0.04); }
		if( lslope < -8573 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	}
	if( lmin < 1.19 ) { 
	if( rmin >= -5.54 ) { 
	if( rmin >= -0.15 ) { 
		if( max >= 9.4 ) { return new Prediction("NAT", 15.8, 0.04); }
	if( max < 9.4 ) { 
	if( rmin >= 0.5 ) { 
	if( max >= 7.29 ) { 
		if( rmin < 1.78 ) { return new Prediction("NAT", 1.05, 0); }
	if( rmin >= 1.78 ) { 
	if( max >= 7.89 ) { 
		if( max < 9.09 ) { return new Prediction("NAT", 3.16, 0.01); }
		if( max >= 9.09 ) { return new Prediction("AT", 2.11, 0.1); }
	}
		if( max < 7.89 ) { return new Prediction("AT", 6.32, 0.3); }
	}
	}
		if( max < 7.29 ) { return new Prediction("NAT", 32.65, 0.08); }
	}
	if( rmin < 0.5 ) { 
		if( max >= 3.27 ) { return new Prediction("AT", 13.69, 0.66); }
		if( max < 3.27 ) { return new Prediction("NAT", 3.16, 0.01); }
	}
	}
	}
		if( rmin < -0.15 ) { return new Prediction("NAT", 50.55, 0.12); }
	}
	if( rmin < -5.54 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 11.58, 0.03); }
	if( lmin < -4.28 ) { 
	if( rslope < -10417 ) { 
	if( lmin < -5.76 ) { 
	if( lmin < -7.19 ) { 
		if( rslope >= -22069 ) { return new Prediction("AT", 5.27, 0.25); }
	if( rslope < -22069 ) { 
		if( rmin >= -7.03 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rmin < -7.03 ) { return new Prediction("NAT", 6.32, 0.01); }
	}
	}
		if( lmin >= -7.19 ) { return new Prediction("NAT", 10.53, 0.02); }
	}
		if( lmin >= -5.76 ) { return new Prediction("AT", 4.21, 0.2); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 13.69, 0.66); }
	}
	}
	}
	}
	if( max >= 10.58 ) { 
	if( rmin < 1.85 ) { 
	if( lmin >= 0.41 ) { 
		if( lmin < 0.93 ) { return new Prediction("NAT", 2.11, 0); }
		if( lmin >= 0.93 ) { return new Prediction("AT", 1.05, 0.05); }
	}
		if( lmin < 0.41 ) { return new Prediction("AT", 25.27, 1.21); }
	}
	if( rmin >= 1.85 ) { 
	if( lslope >= -12407.5 ) { 
		if( lslope >= -6610.5 ) { return new Prediction("NAT", 1.05, 0); }
	if( lslope < -6610.5 ) { 
		if( lmin < 5.12 ) { return new Prediction("AT", 8.42, 0.4); }
		if( lmin >= 5.12 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
		if( lslope < -12407.5 ) { return new Prediction("NAT", 16.85, 0.04); }
	}
	}
	}
		if( rslope < -36810.5 ) { return new Prediction("NAT", 58.97, 0.14); }
	}
		if( rslope >= -5891 ) { return new Prediction("NAT", 98.99, 0.23); }
	}
	if( max < 1.68 ) { 
		if( lmin >= -8.62 ) { return new Prediction("NAT", 213.78, 0.5); }
	if( lmin < -8.62 ) { 
		if( lmin >= -8.81 ) { return new Prediction("AT", 2.11, 0.1); }
		if( lmin < -8.81 ) { return new Prediction("NAT", 5.27, 0.01); }
	}
	}
	}
	if( lmin < -8.97 ) { 
	if( rslope >= -19885 ) { 
	if( max < 11.09 ) { 
	if( lslope >= -4851.5 ) { 
	if( lmin >= -10.34 ) { 
		if( rslope >= -4378 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rslope < -4378 ) { return new Prediction("NAT", 4.21, 0.01); }
	}
		if( lmin < -10.34 ) { return new Prediction("NAT", 8.42, 0.02); }
	}
	if( lslope < -4851.5 ) { 
	if( lslope >= -10480.5 ) { 
		if( rslope >= -9296 ) { return new Prediction("AT", 28.43, 1.37); }
	if( rslope < -9296 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 9.48, 0.46); }
		if( max >= 8.49 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
	if( lslope < -10480.5 ) { 
	if( lslope < -13963.5 ) { 
	if( max >= 6.79 ) { 
	if( rmin < -12.48 ) { 
		if( lmin >= -11.28 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lmin < -11.28 ) { return new Prediction("NAT", 2.11, 0); }
	}
		if( rmin >= -12.48 ) { return new Prediction("AT", 16.85, 0.81); }
	}
	if( max < 6.79 ) { 
	if( rslope >= -19571.5 ) { 
		if( rmin >= -6.9 ) { return new Prediction("NAT", 8.42, 0.02); }
	if( rmin < -6.9 ) { 
		if( lslope >= -17205 ) { return new Prediction("NAT", 5.27, 0.01); }
		if( lslope < -17205 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	}
		if( rslope < -19571.5 ) { return new Prediction("AT", 4.21, 0.2); }
	}
	}
	if( lslope >= -13963.5 ) { 
		if( lmin < -17.33 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lmin >= -17.33 ) { return new Prediction("NAT", 15.8, 0.04); }
	}
	}
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 58.97, 2.83); }
	}
	if( rslope < -19885 ) { 
		if( max < 16.52 ) { return new Prediction("NAT", 12.64, 0.03); }
		if( max >= 16.52 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	}
return null;
}
private Prediction runTree7() {
	if( max >= 14.89 ) { 
	if( rslope < -19591 ) { 
		if( lslope < -20306 ) { return new Prediction("AT", 7.43, 0.42); }
		if( lslope >= -20306 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( rslope >= -19591 ) { return new Prediction("AT", 50.93, 2.87); }
	}
	if( max < 14.89 ) { 
	if( rmin < -5.59 ) { 
	if( max >= 5.35 ) { 
	if( lmin < -6.34 ) { 
	if( max < 13.24 ) { 
	if( lmin >= -11.34 ) { 
		if( lmin < -6.92 ) { return new Prediction("AT", 31.83, 1.79); }
	if( lmin >= -6.92 ) { 
		if( lmin >= -6.6 ) { return new Prediction("AT", 5.3, 0.3); }
		if( lmin < -6.6 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( lmin < -11.34 ) { 
		if( lmin >= -12 ) { return new Prediction("NAT", 1.06, 0); }
	if( lmin < -12 ) { 
	if( lmin < -17.63 ) { 
		if( lmin >= -18.21 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -18.21 ) { return new Prediction("AT", 2.12, 0.12); }
	}
		if( lmin >= -17.63 ) { return new Prediction("AT", 7.43, 0.42); }
	}
	}
	}
	if( max >= 13.24 ) { 
		if( lmin < -11.33 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -11.33 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( lmin >= -6.34 ) { 
	if( max >= 5.56 ) { 
		if( lmin >= 1.63 ) { return new Prediction("NAT", 4.24, 0); }
	if( lmin < 1.63 ) { 
		if( rmin >= -7.82 ) { return new Prediction("NAT", 6.37, 0.01); }
		if( rmin < -7.82 ) { return new Prediction("AT", 5.3, 0.3); }
	}
	}
		if( max < 5.56 ) { return new Prediction("AT", 3.18, 0.18); }
	}
	}
	if( max < 5.35 ) { 
		if( rslope < -21013 ) { return new Prediction("NAT", 45.62, 0.05); }
	if( rslope >= -21013 ) { 
	if( lmin >= -9.94 ) { 
	if( lslope < -18418 ) { 
	if( rmin >= -10.82 ) { 
		if( lmin >= -2.99 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin < -2.99 ) { return new Prediction("AT", 5.3, 0.3); }
	}
		if( rmin < -10.82 ) { return new Prediction("NAT", 3.18, 0); }
	}
	if( lslope >= -18418 ) { 
		if( lmin < -5.63 ) { return new Prediction("NAT", 18.04, 0.02); }
	if( lmin >= -5.63 ) { 
	if( lmin >= -5.58 ) { 
	if( rslope >= -8464 ) { 
		if( lslope < -4821.5 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lslope >= -4821.5 ) { return new Prediction("NAT", 4.24, 0); }
	}
		if( rslope < -8464 ) { return new Prediction("NAT", 16.98, 0.02); }
	}
		if( lmin < -5.58 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	if( lmin < -9.94 ) { 
		if( lslope >= -4003.5 ) { return new Prediction("NAT", 11.67, 0.01); }
	if( lslope < -4003.5 ) { 
	if( lslope >= -10480.5 ) { 
	if( lslope >= -5292.5 ) { 
		if( lmin < -10.39 ) { return new Prediction("NAT", 4.24, 0); }
		if( lmin >= -10.39 ) { return new Prediction("AT", 7.43, 0.42); }
	}
		if( lslope < -5292.5 ) { return new Prediction("AT", 20.16, 1.13); }
	}
	if( lslope < -10480.5 ) { 
		if( lmin < -12.33 ) { return new Prediction("NAT", 13.79, 0.02); }
	if( lmin >= -12.33 ) { 
		if( lslope < -14181 ) { return new Prediction("AT", 3.18, 0.18); }
	if( lslope >= -14181 ) { 
		if( max < 2.35 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 2.35 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( rmin >= -5.59 ) { 
	if( max >= 5.83 ) { 
	if( rmin < 5.29 ) { 
		if( lslope < -34130.5 ) { return new Prediction("NAT", 23.34, 0.03); }
	if( lslope >= -34130.5 ) { 
		if( lmin >= 3.99 ) { return new Prediction("NAT", 36.07, 0.04); }
	if( lmin < 3.99 ) { 
	if( max >= 8.77 ) { 
	if( lmin < 2.06 ) { 
	if( lslope >= -23686.5 ) { 
	if( max < 12.09 ) { 
	if( rmin >= -0.82 ) { 
	if( lmin >= -1.19 ) { 
		if( max >= 11.43 ) { return new Prediction("NAT", 2.12, 0); }
		if( max < 11.43 ) { return new Prediction("AT", 3.18, 0.18); }
	}
		if( lmin < -1.19 ) { return new Prediction("NAT", 3.18, 0); }
	}
		if( rmin < -0.82 ) { return new Prediction("AT", 6.37, 0.36); }
	}
		if( max >= 12.09 ) { return new Prediction("AT", 4.24, 0.24); }
	}
		if( lslope < -23686.5 ) { return new Prediction("NAT", 3.18, 0); }
	}
		if( lmin >= 2.06 ) { return new Prediction("AT", 11.67, 0.66); }
	}
	if( max < 8.77 ) { 
		if( lslope >= -12108.5 ) { return new Prediction("NAT", 22.28, 0.03); }
	if( lslope < -12108.5 ) { 
	if( max >= 6.01 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 12.73, 0.01); }
	if( max >= 7.05 ) { 
	if( lmin < 2.02 ) { 
	if( lmin < 0.66 ) { 
	if( max >= 8.19 ) { 
		if( lmin >= -5.3 ) { return new Prediction("NAT", 2.12, 0); }
	if( lmin < -5.3 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.06, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
		if( max < 8.19 ) { return new Prediction("AT", 4.24, 0.24); }
	}
		if( lmin >= 0.66 ) { return new Prediction("NAT", 7.43, 0.01); }
	}
		if( lmin >= 2.02 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
		if( max < 6.01 ) { return new Prediction("AT", 3.18, 0.18); }
	}
	}
	}
	}
	}
	if( rmin >= 5.29 ) { 
	if( lmin < -0.73 ) { 
		if( lmin >= -1.5 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -1.5 ) { return new Prediction("NAT", 14.85, 0.02); }
	}
		if( lmin >= -0.73 ) { return new Prediction("NAT", 68.96, 0.08); }
	}
	}
	if( max < 5.83 ) { 
	if( rslope >= -30285.5 ) { 
		if( lslope < -29875 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lslope >= -29875 ) { 
	if( lmin >= -17.85 ) { 
		if( rslope >= -17582 ) { return new Prediction("NAT", 131.56, 0.15); }
	if( rslope < -17582 ) { 
	if( rslope < -17823.5 ) { 
		if( max < 3.09 ) { return new Prediction("NAT", 79.57, 0.09); }
	if( max >= 3.09 ) { 
		if( rmin < -0.78 ) { return new Prediction("NAT", 12.73, 0.01); }
	if( rmin >= -0.78 ) { 
		if( max < 4.07 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max >= 4.07 ) { return new Prediction("NAT", 5.3, 0.01); }
	}
	}
	}
		if( rslope >= -17823.5 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
		if( lmin < -17.85 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
		if( rslope < -30285.5 ) { return new Prediction("NAT", 92.3, 0.11); }
	}
	}
	}
return null;
}
private Prediction runTree8() {
	if( lmin < -7.72 ) { 
	if( max >= 5.34 ) { 
	if( rslope >= -17033.5 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= -23.72 ) { 
		if( max >= 9.74 ) { return new Prediction("AT", 58.01, 4.01); }
	if( max < 9.74 ) { 
		if( lmin >= -9.55 ) { return new Prediction("AT", 16.11, 1.11); }
	if( lmin < -9.55 ) { 
		if( lmin >= -10.43 ) { return new Prediction("NAT", 4.3, 0); }
	if( lmin < -10.43 ) { 
		if( lmin >= -17.51 ) { return new Prediction("AT", 9.67, 0.67); }
		if( lmin < -17.51 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	if( rslope < -17033.5 ) { 
	if( rmin < 3.34 ) { 
		if( rslope >= -17926 ) { return new Prediction("NAT", 4.3, 0); }
	if( rslope < -17926 ) { 
		if( rslope < -35355.5 ) { return new Prediction("NAT", 1.07, 0); }
	if( rslope >= -35355.5 ) { 
	if( rslope >= -28340 ) { 
		if( max < 12.83 ) { return new Prediction("AT", 4.3, 0.3); }
		if( max >= 12.83 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( rslope < -28340 ) { return new Prediction("AT", 8.59, 0.59); }
	}
	}
	}
		if( rmin >= 3.34 ) { return new Prediction("NAT", 7.52, 0); }
	}
	}
	if( max < 5.34 ) { 
	if( lslope < -10729.5 ) { 
	if( lslope >= -20345 ) { 
	if( lmin >= -12.26 ) { 
	if( rmin < -4.75 ) { 
		if( rmin >= -8.24 ) { return new Prediction("AT", 9.67, 0.67); }
		if( rmin < -8.24 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( rmin >= -4.75 ) { return new Prediction("NAT", 4.3, 0); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 21.49, 0); }
	}
		if( lslope < -20345 ) { return new Prediction("NAT", 26.86, 0); }
	}
	if( lslope >= -10729.5 ) { 
	if( max >= -5.41 ) { 
		if( rslope >= -3381.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope < -3381.5 ) { return new Prediction("AT", 30.08, 2.08); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 11.82, 0); }
	}
	}
	}
	if( lmin >= -7.72 ) { 
	if( max < 10.9 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 183.71, 0); }
	if( max >= 1.66 ) { 
		if( lmin >= 2.49 ) { return new Prediction("NAT", 118.17, 0); }
	if( lmin < 2.49 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 39.75, 0); }
	if( rslope >= -33045 ) { 
	if( rmin < -5.82 ) { 
	if( lmin < -4.06 ) { 
		if( lmin < -6.49 ) { return new Prediction("NAT", 2.15, 0); }
	if( lmin >= -6.49 ) { 
	if( rslope < -4687 ) { 
	if( lmin < -6.27 ) { 
		if( max < 6.31 ) { return new Prediction("NAT", 2.15, 0); }
		if( max >= 6.31 ) { return new Prediction("AT", 3.22, 0.22); }
	}
		if( lmin >= -6.27 ) { return new Prediction("AT", 15.04, 1.04); }
	}
		if( rslope >= -4687 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( lmin >= -4.06 ) { 
		if( max >= 7.38 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 7.38 ) { return new Prediction("NAT", 5.37, 0); }
	}
	}
	if( rmin >= -5.82 ) { 
	if( lslope < -13284 ) { 
	if( max >= 5.73 ) { 
		if( max >= 8.56 ) { return new Prediction("NAT", 7.52, 0); }
	if( max < 8.56 ) { 
	if( lmin < -1.08 ) { 
		if( lmin >= -5.36 ) { return new Prediction("NAT", 5.37, 0); }
		if( lmin < -5.36 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	if( lmin >= -1.08 ) { 
		if( rmin < 1.2 ) { return new Prediction("AT", 8.59, 0.59); }
	if( rmin >= 1.2 ) { 
		if( max >= 7.52 ) { return new Prediction("NAT", 2.15, 0); }
		if( max < 7.52 ) { return new Prediction("AT", 5.37, 0.37); }
	}
	}
	}
	}
	if( max < 5.73 ) { 
	if( rmin >= 0.23 ) { 
	if( rmin < 1.3 ) { 
		if( lmin < 1.37 ) { return new Prediction("AT", 3.22, 0.22); }
		if( lmin >= 1.37 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rmin >= 1.3 ) { 
		if( lslope >= -21511.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -21511.5 ) { return new Prediction("NAT", 11.82, 0); }
	}
	}
		if( rmin < 0.23 ) { return new Prediction("NAT", 46.2, 0); }
	}
	}
	if( lslope >= -13284 ) { 
		if( max < 7.5 ) { return new Prediction("NAT", 58.01, 0); }
	if( max >= 7.5 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 20.41, 0); }
		if( max < 7.59 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	}
	}
	}
	}
	if( max >= 10.9 ) { 
		if( lslope >= -6000 ) { return new Prediction("NAT", 20.41, 0); }
	if( lslope < -6000 ) { 
	if( max < 14.71 ) { 
	if( lslope >= -23686.5 ) { 
	if( rmin < 5.93 ) { 
		if( lmin >= -0.08 ) { return new Prediction("AT", 8.59, 0.59); }
	if( lmin < -0.08 ) { 
		if( max < 11.02 ) { return new Prediction("NAT", 4.3, 0); }
	if( max >= 11.02 ) { 
	if( rmin >= -0.4 ) { 
		if( lmin < -2.88 ) { return new Prediction("AT", 3.22, 0.22); }
	if( lmin >= -2.88 ) { 
		if( rmin >= 4.13 ) { return new Prediction("AT", 3.22, 0.22); }
		if( rmin < 4.13 ) { return new Prediction("NAT", 5.37, 0); }
	}
	}
		if( rmin < -0.4 ) { return new Prediction("AT", 8.59, 0.59); }
	}
	}
	}
		if( rmin >= 5.93 ) { return new Prediction("NAT", 3.22, 0); }
	}
		if( lslope < -23686.5 ) { return new Prediction("NAT", 7.52, 0); }
	}
		if( max >= 14.71 ) { return new Prediction("AT", 17.19, 1.19); }
	}
	}
	}
return null;
}
private Prediction runTree9() {
	if( lmin < -8.58 ) { 
	if( max < 7.92 ) { 
	if( lslope >= -10213 ) { 
	if( max >= -5.87 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 37.04, 2.04); }
		if( lslope >= -3296 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max < -5.87 ) { return new Prediction("NAT", 7.41, 0); }
	}
	if( lslope < -10213 ) { 
	if( rmin >= -9.14 ) { 
	if( lslope >= -22219 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 7.41, 0); }
	if( lmin >= -12.54 ) { 
		if( rmin >= -4.41 ) { return new Prediction("NAT", 2.12, 0); }
	if( rmin < -4.41 ) { 
		if( rslope < -19882.5 ) { return new Prediction("NAT", 1.06, 0); }
	if( rslope >= -19882.5 ) { 
		if( lmin < -10.23 ) { return new Prediction("AT", 9.52, 0.52); }
		if( lmin >= -10.23 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
		if( lslope < -22219 ) { return new Prediction("NAT", 11.64, 0); }
	}
		if( rmin < -9.14 ) { return new Prediction("NAT", 20.11, 0); }
	}
	}
	if( max >= 7.92 ) { 
	if( lmin >= -11.91 ) { 
	if( rslope < -16861.5 ) { 
	if( lmin < -9.96 ) { 
		if( max < 16.52 ) { return new Prediction("NAT", 4.23, 0); }
		if( max >= 16.52 ) { return new Prediction("AT", 2.12, 0.12); }
	}
		if( lmin >= -9.96 ) { return new Prediction("AT", 5.29, 0.29); }
	}
		if( rslope >= -16861.5 ) { return new Prediction("AT", 27.52, 1.52); }
	}
		if( lmin < -11.91 ) { return new Prediction("AT", 43.39, 2.39); }
	}
	}
	if( lmin >= -8.58 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 268.81, 0); }
	if( max >= 3.17 ) { 
		if( lmin >= 2.68 ) { return new Prediction("NAT", 132.29, 0); }
	if( lmin < 2.68 ) { 
		if( rslope >= -6525 ) { return new Prediction("NAT", 50.8, 0); }
	if( rslope < -6525 ) { 
	if( max < 11.02 ) { 
		if( rmin >= 4 ) { return new Prediction("NAT", 28.57, 0); }
	if( rmin < 4 ) { 
	if( lslope >= -35460.5 ) { 
	if( lmin >= -1.07 ) { 
	if( max < 7.5 ) { 
	if( lslope < -13020.5 ) { 
		if( rslope >= -17105.5 ) { return new Prediction("AT", 5.29, 0.29); }
	if( rslope < -17105.5 ) { 
		if( lmin >= 1.24 ) { return new Prediction("NAT", 8.47, 0); }
	if( lmin < 1.24 ) { 
		if( lmin < 0.12 ) { return new Prediction("NAT", 3.17, 0); }
	if( lmin >= 0.12 ) { 
		if( rslope < -32388.5 ) { return new Prediction("NAT", 2.12, 0); }
		if( rslope >= -32388.5 ) { return new Prediction("AT", 10.58, 0.58); }
	}
	}
	}
	}
		if( lslope >= -13020.5 ) { return new Prediction("NAT", 15.87, 0); }
	}
	if( max >= 7.5 ) { 
	if( rslope < -14125.5 ) { 
		if( lmin >= 0.65 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < 0.65 ) { return new Prediction("AT", 3.17, 0.17); }
	}
		if( rslope >= -14125.5 ) { return new Prediction("AT", 10.58, 0.58); }
	}
	}
	if( lmin < -1.07 ) { 
	if( rmin >= -5.41 ) { 
		if( max < 3.31 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max >= 3.31 ) { return new Prediction("NAT", 47.62, 0); }
	}
	if( rmin < -5.41 ) { 
	if( lmin < -4.18 ) { 
	if( lmin < -6.27 ) { 
		if( lmin >= -7.03 ) { return new Prediction("NAT", 4.23, 0); }
		if( lmin < -7.03 ) { return new Prediction("AT", 4.23, 0.23); }
	}
		if( lmin >= -6.27 ) { return new Prediction("AT", 9.52, 0.52); }
	}
		if( lmin >= -4.18 ) { return new Prediction("NAT", 3.17, 0); }
	}
	}
	}
		if( lslope < -35460.5 ) { return new Prediction("NAT", 28.57, 0); }
	}
	}
	if( max >= 11.02 ) { 
		if( rmin >= 5.62 ) { return new Prediction("NAT", 2.12, 0); }
	if( rmin < 5.62 ) { 
		if( rslope < -41079.5 ) { return new Prediction("NAT", 1.06, 0); }
	if( rslope >= -41079.5 ) { 
	if( lmin >= -0.69 ) { 
		if( lmin >= -0.08 ) { return new Prediction("AT", 3.17, 0.17); }
		if( lmin < -0.08 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lmin < -0.69 ) { return new Prediction("AT", 25.4, 1.4); }
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree10() {
	if( lmin < -8.28 ) { 
	if( rslope >= -19885 ) { 
	if( max < 4.56 ) { 
	if( rmin >= -13.03 ) { 
	if( rmin < -5.25 ) { 
		if( lmin < -12.33 ) { return new Prediction("NAT", 15.93, 0.02); }
	if( lmin >= -12.33 ) { 
	if( max >= 0.46 ) { 
		if( lmin < -9.48 ) { return new Prediction("AT", 18.06, 1.04); }
		if( lmin >= -9.48 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( max < 0.46 ) { return new Prediction("NAT", 11.68, 0.01); }
	}
	}
		if( rmin >= -5.25 ) { return new Prediction("NAT", 10.62, 0.01); }
	}
	if( rmin < -13.03 ) { 
		if( lslope < -11540 ) { return new Prediction("NAT", 4.25, 0); }
		if( lslope >= -11540 ) { return new Prediction("AT", 19.12, 1.1); }
	}
	}
	if( max >= 4.56 ) { 
		if( lslope >= -2088.99 ) { return new Prediction("NAT", 5.31, 0.01); }
	if( lslope < -2088.99 ) { 
	if( max < 9.21 ) { 
	if( lslope < -11526 ) { 
	if( rmin < 0.58 ) { 
	if( max >= 6.15 ) { 
	if( max < 9.18 ) { 
		if( lslope < -13744 ) { return new Prediction("AT", 9.56, 0.55); }
		if( lslope >= -13744 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max >= 9.18 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max < 6.15 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin >= 0.58 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lslope >= -11526 ) { return new Prediction("AT", 20.18, 1.16); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 74.36, 4.27); }
	}
	}
	}
	if( rslope < -19885 ) { 
	if( lslope >= -34749.5 ) { 
		if( max < 17.33 ) { return new Prediction("NAT", 10.62, 0.01); }
		if( max >= 17.33 ) { return new Prediction("AT", 4.25, 0.24); }
	}
		if( lslope < -34749.5 ) { return new Prediction("NAT", 18.06, 0.02); }
	}
	}
	if( lmin >= -8.28 ) { 
	if( max < 3.42 ) { 
		if( rslope < -6064.5 ) { return new Prediction("NAT", 247.51, 0.29); }
	if( rslope >= -6064.5 ) { 
		if( rslope < -5654.5 ) { return new Prediction("AT", 3.19, 0.18); }
		if( rslope >= -5654.5 ) { return new Prediction("NAT", 28.68, 0.03); }
	}
	}
	if( max >= 3.42 ) { 
		if( lslope >= -7152 ) { return new Prediction("NAT", 107.29, 0.13); }
	if( lslope < -7152 ) { 
	if( rslope >= -30708 ) { 
	if( max < 11.02 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 28.68, 0.03); }
	if( lmin < 3.98 ) { 
	if( lslope < -7460 ) { 
	if( lmin >= -0.85 ) { 
	if( lmin < 0.72 ) { 
		if( lslope >= -11533.5 ) { return new Prediction("NAT", 4.25, 0); }
	if( lslope < -11533.5 ) { 
		if( max < 4.07 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 4.07 ) { return new Prediction("AT", 14.87, 0.85); }
	}
	}
	if( lmin >= 0.72 ) { 
		if( lslope >= -11341 ) { return new Prediction("AT", 6.37, 0.37); }
	if( lslope < -11341 ) { 
	if( rmin < 0.55 ) { 
		if( max >= 4.59 ) { return new Prediction("NAT", 4.25, 0); }
		if( max < 4.59 ) { return new Prediction("AT", 4.25, 0.24); }
	}
		if( rmin >= 0.55 ) { return new Prediction("NAT", 17, 0.02); }
	}
	}
	}
	if( lmin < -0.85 ) { 
	if( max >= 4.17 ) { 
	if( lslope >= -9053.5 ) { 
		if( lmin >= -5.11 ) { return new Prediction("NAT", 5.31, 0.01); }
		if( lmin < -5.11 ) { return new Prediction("AT", 3.19, 0.18); }
	}
		if( lslope < -9053.5 ) { return new Prediction("NAT", 40.37, 0.05); }
	}
	if( max < 4.17 ) { 
	if( lmin < -4.25 ) { 
		if( rmin >= -2.66 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin < -2.66 ) { return new Prediction("AT", 4.25, 0.24); }
	}
		if( lmin >= -4.25 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
	}
		if( lslope >= -7460 ) { return new Prediction("AT", 6.37, 0.37); }
	}
	}
	if( max >= 11.02 ) { 
	if( lmin >= -0.85 ) { 
		if( lslope < -20462 ) { return new Prediction("NAT", 6.37, 0.01); }
	if( lslope >= -20462 ) { 
		if( rslope < -20038 ) { return new Prediction("AT", 2.12, 0.12); }
	if( rslope >= -20038 ) { 
		if( lmin < 0.4 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= 0.4 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
	}
		if( lmin < -0.85 ) { return new Prediction("AT", 25.49, 1.46); }
	}
	}
	if( rslope < -30708 ) { 
		if( max < 14.26 ) { return new Prediction("NAT", 56.3, 0.07); }
		if( max >= 14.26 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
return null;
}
private Prediction runTree11() {
	if( max < 12.91 ) { 
	if( lmin < -7.73 ) { 
	if( lslope < -10474.5 ) { 
	if( max >= 5.11 ) { 
	if( lslope < -16801.5 ) { 
	if( rslope < -17354 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 1.06, 0); }
	if( lslope >= -35302 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 2.11, 0); }
		if( rmin < -5.54 ) { return new Prediction("AT", 11.61, 0.61); }
	}
	}
		if( rslope >= -17354 ) { return new Prediction("NAT", 6.33, 0); }
	}
	if( lslope >= -16801.5 ) { 
		if( max >= 8.34 ) { return new Prediction("AT", 14.78, 0.78); }
		if( max < 8.34 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( max < 5.11 ) { 
		if( rmin < -6.54 ) { return new Prediction("NAT", 40.12, 0); }
	if( rmin >= -6.54 ) { 
	if( rmin < -4.83 ) { 
		if( lslope >= -17886 ) { return new Prediction("AT", 4.22, 0.22); }
	if( lslope < -17886 ) { 
		if( rmin >= -6.27 ) { return new Prediction("NAT", 5.28, 0); }
		if( rmin < -6.27 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	}
		if( rmin >= -4.83 ) { return new Prediction("NAT", 13.72, 0); }
	}
	}
	}
	if( lslope >= -10474.5 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 5.28, 0); }
	if( lslope < -4149.5 ) { 
		if( max < -4.54 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= -4.54 ) { return new Prediction("AT", 48.56, 2.56); }
	}
	}
	}
	if( lmin >= -7.73 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 116.13, 0); }
	if( rslope >= -33045 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 115.07, 0); }
	if( lslope < -5395 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 146.74, 0); }
	if( max >= 1.66 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 48.56, 0); }
	if( lmin < 3.98 ) { 
	if( rslope >= -9057 ) { 
		if( rmin >= 2.94 ) { return new Prediction("AT", 7.39, 0.39); }
	if( rmin < 2.94 ) { 
		if( rmin < -4.39 ) { return new Prediction("AT", 6.33, 0.33); }
	if( rmin >= -4.39 ) { 
		if( lslope >= -5710 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lslope < -5710 ) { return new Prediction("NAT", 9.5, 0); }
	}
	}
	}
	if( rslope < -9057 ) { 
	if( lmin >= -0.85 ) { 
	if( max >= 3.48 ) { 
	if( max >= 4.58 ) { 
	if( lmin >= -0.63 ) { 
	if( max < 7.05 ) { 
	if( lslope < -28836.5 ) { 
		if( rmin < 1.48 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin >= 1.48 ) { return new Prediction("NAT", 2.11, 0); }
	}
		if( lslope >= -28836.5 ) { return new Prediction("NAT", 17.95, 0); }
	}
	if( max >= 7.05 ) { 
		if( rmin >= 5 ) { return new Prediction("NAT", 4.22, 0); }
	if( rmin < 5 ) { 
	if( max < 11.13 ) { 
		if( max < 7.63 ) { return new Prediction("AT", 3.17, 0.17); }
	if( max >= 7.63 ) { 
		if( lmin >= 1.74 ) { return new Prediction("AT", 2.11, 0.11); }
	if( lmin < 1.74 ) { 
		if( lmin >= 0.61 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < 0.61 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
		if( max >= 11.13 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
		if( lmin < -0.63 ) { return new Prediction("AT", 4.22, 0.22); }
	}
		if( max < 4.58 ) { return new Prediction("AT", 9.5, 0.5); }
	}
		if( max < 3.48 ) { return new Prediction("NAT", 10.56, 0); }
	}
	if( lmin < -0.85 ) { 
	if( rslope >= -11647 ) { 
	if( rmin < -6.02 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 6.33, 0.33); }
		if( max >= 5.93 ) { return new Prediction("NAT", 5.28, 0); }
	}
		if( rmin >= -6.02 ) { return new Prediction("NAT", 8.45, 0); }
	}
	if( rslope < -11647 ) { 
	if( lslope >= -32607 ) { 
	if( max < 11.09 ) { 
		if( rmin < 2.85 ) { return new Prediction("NAT", 62.29, 0); }
	if( rmin >= 2.85 ) { 
		if( max >= 3.72 ) { return new Prediction("NAT", 11.61, 0); }
		if( max < 3.72 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( max >= 11.09 ) { 
		if( lslope < -21728.5 ) { return new Prediction("AT", 2.11, 0.11); }
		if( lslope >= -21728.5 ) { return new Prediction("NAT", 6.33, 0); }
	}
	}
		if( lslope < -32607 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	if( max >= 12.91 ) { 
	if( max < 17.11 ) { 
		if( lmin >= 0.32 ) { return new Prediction("NAT", 8.45, 0); }
	if( lmin < 0.32 ) { 
	if( max < 16.32 ) { 
		if( lslope >= -22326 ) { return new Prediction("AT", 17.95, 0.95); }
	if( lslope < -22326 ) { 
		if( max < 14.69 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 14.69 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	}
		if( max >= 16.32 ) { return new Prediction("NAT", 3.17, 0); }
	}
	}
		if( max >= 17.11 ) { return new Prediction("AT", 49.62, 2.62); }
	}
return null;
}
private Prediction runTree12() {
	if( lmin < -9.17 ) { 
	if( max >= 4.48 ) { 
	if( lslope < -16970 ) { 
	if( rmin < -5.52 ) { 
	if( rslope < -17354 ) { 
		if( max < 12.83 ) { return new Prediction("AT", 10.81, 0.77); }
	if( max >= 12.83 ) { 
		if( max < 16.52 ) { return new Prediction("NAT", 1.08, 0); }
		if( max >= 16.52 ) { return new Prediction("AT", 3.24, 0.23); }
	}
	}
		if( rslope >= -17354 ) { return new Prediction("NAT", 4.32, 0.02); }
	}
		if( rmin >= -5.52 ) { return new Prediction("NAT", 4.32, 0.02); }
	}
	if( lslope >= -16970 ) { 
	if( lmin >= -23.97 ) { 
	if( rmin >= -17.32 ) { 
		if( lmin < -9.56 ) { return new Prediction("AT", 67.03, 4.79); }
	if( lmin >= -9.56 ) { 
		if( lmin >= -9.38 ) { return new Prediction("AT", 5.41, 0.39); }
		if( lmin < -9.38 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	if( rmin < -17.32 ) { 
		if( lslope >= -9769.5 ) { return new Prediction("NAT", 1.08, 0); }
		if( lslope < -9769.5 ) { return new Prediction("AT", 4.32, 0.31); }
	}
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	if( max < 4.48 ) { 
	if( rslope >= -11065 ) { 
		if( lslope >= -4003.5 ) { return new Prediction("NAT", 6.49, 0.02); }
	if( lslope < -4003.5 ) { 
		if( max >= -3.59 ) { return new Prediction("AT", 20.54, 1.47); }
	if( max < -3.59 ) { 
		if( rmin < -13.31 ) { return new Prediction("AT", 2.16, 0.15); }
		if( rmin >= -13.31 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
	}
	}
	if( rslope < -11065 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 16.22, 0.06); }
	if( max < 2.61 ) { 
	if( rmin >= -6.44 ) { 
	if( max < 1.55 ) { 
		if( rmin < -6.03 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rmin >= -6.03 ) { return new Prediction("NAT", 8.65, 0.03); }
	}
		if( max >= 1.55 ) { return new Prediction("AT", 2.16, 0.15); }
	}
		if( rmin < -6.44 ) { return new Prediction("NAT", 12.97, 0.05); }
	}
	}
	}
	}
	if( lmin >= -9.17 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
	if( rmin < -5.45 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 19.46, 0.07); }
	if( lslope >= -34743.5 ) { 
	if( rmin < -6.54 ) { 
	if( max < 6.42 ) { 
		if( lmin >= -4.53 ) { return new Prediction("NAT", 14.05, 0.05); }
	if( lmin < -4.53 ) { 
		if( lmin < -5.97 ) { return new Prediction("NAT", 9.73, 0.03); }
	if( lmin >= -5.97 ) { 
		if( rmin >= -6.88 ) { return new Prediction("NAT", 2.16, 0.01); }
		if( rmin < -6.88 ) { return new Prediction("AT", 5.41, 0.39); }
	}
	}
	}
	if( max >= 6.42 ) { 
		if( lslope >= -3659 ) { return new Prediction("NAT", 3.24, 0.01); }
	if( lslope < -3659 ) { 
		if( rmin >= -6.63 ) { return new Prediction("NAT", 1.08, 0); }
		if( rmin < -6.63 ) { return new Prediction("AT", 8.65, 0.62); }
	}
	}
	}
		if( rmin >= -6.54 ) { return new Prediction("AT", 8.65, 0.62); }
	}
	}
	if( rmin >= -5.45 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 80, 0.28); }
	if( lslope < -5358 ) { 
	if( lmin >= -0.76 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 62.7, 0.22); }
	if( lmin < 3.69 ) { 
	if( lmin >= 2.44 ) { 
		if( max >= 6.26 ) { return new Prediction("AT", 9.73, 0.7); }
		if( max < 6.26 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
	if( lmin < 2.44 ) { 
	if( max >= 3.6 ) { 
		if( lmin >= 0.91 ) { return new Prediction("NAT", 14.05, 0.05); }
	if( lmin < 0.91 ) { 
	if( rslope >= -11617 ) { 
		if( lslope < -5760.5 ) { return new Prediction("NAT", 15.14, 0.05); }
		if( lslope >= -5760.5 ) { return new Prediction("AT", 2.16, 0.15); }
	}
	if( rslope < -11617 ) { 
		if( rslope < -30648 ) { return new Prediction("NAT", 6.49, 0.02); }
	if( rslope >= -30648 ) { 
	if( rmin < 0.38 ) { 
		if( rmin < -3.05 ) { return new Prediction("AT", 1.08, 0.08); }
	if( rmin >= -3.05 ) { 
		if( max >= 6.44 ) { return new Prediction("NAT", 5.41, 0.02); }
		if( max < 6.44 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	if( rmin >= 0.38 ) { 
	if( lslope >= -27095.5 ) { 
		if( lslope < -14212 ) { return new Prediction("AT", 9.73, 0.7); }
	if( lslope >= -14212 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 1.08, 0); }
		if( max < 7.59 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lslope < -27095.5 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	}
	}
		if( max < 3.6 ) { return new Prediction("NAT", 22.7, 0.08); }
	}
	}
	}
	if( lmin < -0.76 ) { 
	if( rmin < -4.16 ) { 
		if( rmin >= -4.2 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rmin < -4.2 ) { return new Prediction("NAT", 3.24, 0.01); }
	}
	if( rmin >= -4.16 ) { 
	if( lmin < -4.62 ) { 
		if( rmin < 2.75 ) { return new Prediction("NAT", 23.78, 0.08); }
	if( rmin >= 2.75 ) { 
		if( max >= 3.68 ) { return new Prediction("NAT", 17.3, 0.06); }
		if( max < 3.68 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lmin >= -4.62 ) { return new Prediction("NAT", 62.7, 0.22); }
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 231.36, 0.81); }
	}
	if( max >= 13.14 ) { 
		if( lmin < -0.73 ) { return new Prediction("AT", 21.62, 1.55); }
		if( lmin >= -0.73 ) { return new Prediction("NAT", 6.49, 0.02); }
	}
	}
return null;
}
private Prediction runTree13() {
	if( lmin >= -8.27 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 116.22, 0); }
	if( lmin < 3.69 ) { 
	if( lslope < -5766 ) { 
	if( lslope >= -35061.5 ) { 
	if( lslope < -5937.5 ) { 
	if( lmin < 0.27 ) { 
	if( rmin >= -5.41 ) { 
	if( max >= 7.14 ) { 
		if( max < 7.6 ) { return new Prediction("AT", 3.29, 0.29); }
	if( max >= 7.6 ) { 
		if( rmin >= -0.4 ) { return new Prediction("NAT", 24.12, 0); }
	if( rmin < -0.4 ) { 
		if( rslope < -17629 ) { return new Prediction("AT", 2.19, 0.19); }
		if( rslope >= -17629 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
	}
		if( max < 7.14 ) { return new Prediction("NAT", 70.17, 0); }
	}
	if( rmin < -5.41 ) { 
	if( lmin < -4.74 ) { 
		if( rmin >= -7.32 ) { return new Prediction("AT", 12.06, 1.06); }
	if( rmin < -7.32 ) { 
		if( rslope < -13841 ) { return new Prediction("AT", 3.29, 0.29); }
		if( rslope >= -13841 ) { return new Prediction("NAT", 3.29, 0); }
	}
	}
	if( lmin >= -4.74 ) { 
		if( rmin < -12.69 ) { return new Prediction("AT", 1.1, 0.1); }
		if( rmin >= -12.69 ) { return new Prediction("NAT", 13.16, 0); }
	}
	}
	}
	if( lmin >= 0.27 ) { 
	if( rslope < -14682 ) { 
		if( lslope >= -16554.5 ) { return new Prediction("NAT", 7.67, 0); }
	if( lslope < -16554.5 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 14.25, 0); }
	if( lmin < 1.09 ) { 
	if( lslope >= -25691.5 ) { 
		if( max >= 5.8 ) { return new Prediction("AT", 3.29, 0.29); }
		if( max < 5.8 ) { return new Prediction("NAT", 4.39, 0); }
	}
	if( lslope < -25691.5 ) { 
		if( max >= 3.5 ) { return new Prediction("AT", 10.96, 0.96); }
		if( max < 3.5 ) { return new Prediction("NAT", 1.1, 0); }
	}
	}
	}
	}
	if( rslope >= -14682 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 4.39, 0); }
		if( max >= 7.05 ) { return new Prediction("AT", 9.87, 0.87); }
	}
	}
	}
		if( lslope >= -5937.5 ) { return new Prediction("AT", 4.39, 0.39); }
	}
		if( lslope < -35061.5 ) { return new Prediction("NAT", 46.05, 0); }
	}
		if( lslope >= -5766 ) { return new Prediction("NAT", 50.43, 0); }
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 205.03, 0); }
	}
	if( max >= 13.14 ) { 
		if( lslope >= -5525 ) { return new Prediction("NAT", 6.58, 0); }
	if( lslope < -5525 ) { 
		if( lmin < -0.21 ) { return new Prediction("AT", 24.12, 2.12); }
	if( lmin >= -0.21 ) { 
	if( lmin < 1.46 ) { 
		if( max < 20.84 ) { return new Prediction("NAT", 1.1, 0); }
		if( max >= 20.84 ) { return new Prediction("AT", 2.19, 0.19); }
	}
		if( lmin >= 1.46 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( lslope < -19947.5 ) { 
		if( lslope < -35251 ) { return new Prediction("NAT", 13.16, 0); }
	if( lslope >= -35251 ) { 
		if( max < 17.33 ) { return new Prediction("NAT", 8.77, 0); }
		if( max >= 17.33 ) { return new Prediction("AT", 2.19, 0.19); }
	}
	}
	if( lslope >= -19947.5 ) { 
	if( max >= 3.49 ) { 
	if( lmin >= -21.11 ) { 
		if( lslope >= -13253.5 ) { return new Prediction("AT", 74.56, 6.56); }
	if( lslope < -13253.5 ) { 
	if( rslope < -13539.5 ) { 
	if( lslope < -16970 ) { 
		if( lmin >= -11.1 ) { return new Prediction("AT", 5.48, 0.48); }
		if( lmin < -11.1 ) { return new Prediction("NAT", 2.19, 0); }
	}
		if( lslope >= -16970 ) { return new Prediction("AT", 29.6, 2.6); }
	}
		if( rslope >= -13539.5 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
		if( lmin < -21.11 ) { return new Prediction("NAT", 3.29, 0); }
	}
	if( max < 3.49 ) { 
	if( rmin >= -13.63 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 9.87, 0); }
	if( lslope < -4149.5 ) { 
	if( lslope >= -10001.5 ) { 
		if( rslope < -6095.5 ) { return new Prediction("AT", 6.58, 0.58); }
	if( rslope >= -6095.5 ) { 
		if( lmin < -10 ) { return new Prediction("AT", 1.1, 0.1); }
		if( lmin >= -10 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
	if( lslope < -10001.5 ) { 
	if( rmin >= -8.14 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 3.29, 0); }
	if( max < 2.61 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 1.1, 0); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 5.48, 0.48); }
	}
	}
		if( rmin < -8.14 ) { return new Prediction("NAT", 14.25, 0); }
	}
	}
	}
	if( rmin < -13.63 ) { 
		if( max < 1.01 ) { return new Prediction("AT", 16.45, 1.45); }
		if( max >= 1.01 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree14() {
	if( max < 13.14 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 122.62, 0); }
	if( rslope >= -34924 ) { 
	if( lslope >= -4149.5 ) { 
		if( max < 11.16 ) { return new Prediction("NAT", 91.7, 0); }
	if( max >= 11.16 ) { 
		if( max < 11.48 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max >= 11.48 ) { return new Prediction("NAT", 10.66, 0); }
	}
	}
	if( lslope < -4149.5 ) { 
	if( rmin >= -7.6 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 143.94, 0); }
	if( max >= 1.66 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 58.64, 0); }
	if( rmin < 6.73 ) { 
	if( max >= 7.32 ) { 
		if( lmin >= 5.38 ) { return new Prediction("NAT", 15.99, 0); }
	if( lmin < 5.38 ) { 
	if( lmin < -7.87 ) { 
	if( lslope < -16709.5 ) { 
		if( lslope < -17290.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope >= -17290.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -16709.5 ) { return new Prediction("AT", 15.99, 0.99); }
	}
	if( lmin >= -7.87 ) { 
	if( lmin >= -1.19 ) { 
	if( rslope >= -15847 ) { 
	if( rmin < 1.78 ) { 
	if( lmin < 0.6 ) { 
		if( rmin < -4.6 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.6 ) { return new Prediction("AT", 2.13, 0.13); }
	}
		if( lmin >= 0.6 ) { return new Prediction("NAT", 3.2, 0); }
	}
		if( rmin >= 1.78 ) { return new Prediction("AT", 20.26, 1.26); }
	}
	if( rslope < -15847 ) { 
	if( rmin < 1.58 ) { 
		if( lmin < -0.07 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -0.07 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin >= 1.58 ) { return new Prediction("NAT", 8.53, 0); }
	}
	}
	if( lmin < -1.19 ) { 
	if( rmin < -1.65 ) { 
		if( rmin < -4.96 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.96 ) { return new Prediction("AT", 4.27, 0.27); }
	}
		if( rmin >= -1.65 ) { return new Prediction("NAT", 11.73, 0); }
	}
	}
	}
	}
	if( max < 7.32 ) { 
	if( max >= 1.74 ) { 
	if( rmin < -5.44 ) { 
		if( lmin >= -4.93 ) { return new Prediction("NAT", 4.26, 0); }
	if( lmin < -4.93 ) { 
	if( lmin >= -11.99 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 8.53, 0.53); }
		if( max >= 5.93 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin < -11.99 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	if( rmin >= -5.44 ) { 
	if( lslope >= -25691.5 ) { 
	if( lmin >= 2.44 ) { 
		if( lmin < 2.76 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= 2.76 ) { return new Prediction("NAT", 5.33, 0); }
	}
	if( lmin < 2.44 ) { 
		if( rmin < 3.07 ) { return new Prediction("NAT", 75.7, 0); }
	if( rmin >= 3.07 ) { 
		if( rmin < 3.21 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= 3.21 ) { return new Prediction("NAT", 9.6, 0); }
	}
	}
	}
	if( lslope < -25691.5 ) { 
	if( lslope < -25870.5 ) { 
	if( max >= 3.5 ) { 
	if( lmin < 1.21 ) { 
		if( lmin >= 0.19 ) { return new Prediction("AT", 7.46, 0.46); }
		if( lmin < 0.19 ) { return new Prediction("NAT", 6.4, 0); }
	}
		if( lmin >= 1.21 ) { return new Prediction("NAT", 13.86, 0); }
	}
		if( max < 3.5 ) { return new Prediction("NAT", 11.73, 0); }
	}
		if( lslope >= -25870.5 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	}
	}
		if( max < 1.74 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	}
	}
	}
	if( rmin < -7.6 ) { 
	if( rslope < -9177 ) { 
	if( max < 9.82 ) { 
		if( rmin < -20.04 ) { return new Prediction("AT", 3.2, 0.2); }
	if( rmin >= -20.04 ) { 
		if( lmin < -12.33 ) { return new Prediction("NAT", 13.86, 0); }
	if( lmin >= -12.33 ) { 
		if( lslope >= -10662 ) { return new Prediction("AT", 3.2, 0.2); }
	if( lslope < -10662 ) { 
		if( max >= 6.36 ) { return new Prediction("AT", 2.13, 0.13); }
	if( max < 6.36 ) { 
		if( rmin >= -7.87 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin < -7.87 ) { return new Prediction("NAT", 24.52, 0); }
	}
	}
	}
	}
	}
		if( max >= 9.82 ) { return new Prediction("AT", 9.6, 0.6); }
	}
	if( rslope >= -9177 ) { 
		if( max < -6.88 ) { return new Prediction("NAT", 2.13, 0); }
		if( max >= -6.88 ) { return new Prediction("AT", 36.25, 2.25); }
	}
	}
	}
	}
	}
	if( max >= 13.14 ) { 
	if( max < 17.11 ) { 
	if( lmin < -0.73 ) { 
	if( rmin < 9.61 ) { 
	if( rmin < -5.33 ) { 
		if( lmin < -16.4 ) { return new Prediction("AT", 2.13, 0.13); }
		if( lmin >= -16.4 ) { return new Prediction("NAT", 3.2, 0); }
	}
		if( rmin >= -5.33 ) { return new Prediction("AT", 21.32, 1.32); }
	}
		if( rmin >= 9.61 ) { return new Prediction("NAT", 2.13, 0); }
	}
		if( lmin >= -0.73 ) { return new Prediction("NAT", 8.53, 0); }
	}
		if( max >= 17.11 ) { return new Prediction("AT", 45.85, 2.85); }
	}
return null;
}
private Prediction runTree15() {
	if( lmin >= -8.27 ) { 
		if( max >= 15.69 ) { return new Prediction("AT", 19.19, 1.17); }
	if( max < 15.69 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 235.64, 0.28); }
	if( max >= 3.17 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 77.84, 0.09); }
	if( rmin < 6.73 ) { 
	if( lslope < -5336 ) { 
	if( rslope >= -35845.5 ) { 
	if( lmin < 2.86 ) { 
	if( max < 7.05 ) { 
	if( max >= 3.43 ) { 
		if( rslope < -34672.5 ) { return new Prediction("AT", 3.2, 0.2); }
	if( rslope >= -34672.5 ) { 
	if( rmin < 0.55 ) { 
	if( lmin >= 0.38 ) { 
		if( rmin < -0.38 ) { return new Prediction("NAT", 5.33, 0.01); }
		if( rmin >= -0.38 ) { return new Prediction("AT", 5.33, 0.33); }
	}
	if( lmin < 0.38 ) { 
		if( max < 5.48 ) { return new Prediction("NAT", 29.86, 0.04); }
	if( max >= 5.48 ) { 
		if( lslope >= -10373 ) { return new Prediction("AT", 2.13, 0.13); }
		if( lslope < -10373 ) { return new Prediction("NAT", 4.26, 0); }
	}
	}
	}
		if( rmin >= 0.55 ) { return new Prediction("NAT", 35.19, 0.04); }
	}
	}
	if( max < 3.43 ) { 
		if( lmin >= -3.07 ) { return new Prediction("NAT", 2.13, 0); }
		if( lmin < -3.07 ) { return new Prediction("AT", 6.4, 0.39); }
	}
	}
	if( max >= 7.05 ) { 
	if( max >= 7.22 ) { 
	if( lmin >= -1.19 ) { 
	if( lmin >= 0.41 ) { 
	if( lslope >= -12907.5 ) { 
	if( rslope >= -10027.5 ) { 
		if( lmin < 2.65 ) { return new Prediction("NAT", 2.13, 0); }
		if( lmin >= 2.65 ) { return new Prediction("AT", 1.07, 0.06); }
	}
		if( rslope < -10027.5 ) { return new Prediction("AT", 2.13, 0.13); }
	}
		if( lslope < -12907.5 ) { return new Prediction("NAT", 7.46, 0.01); }
	}
	if( lmin < 0.41 ) { 
	if( lslope < -19694 ) { 
		if( lmin < -0.11 ) { return new Prediction("NAT", 2.13, 0); }
		if( lmin >= -0.11 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	if( lslope >= -19694 ) { 
		if( lslope < -7008 ) { return new Prediction("AT", 13.86, 0.84); }
	if( lslope >= -7008 ) { 
		if( rmin >= -2.89 ) { return new Prediction("AT", 3.2, 0.2); }
		if( rmin < -2.89 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	if( lmin < -1.19 ) { 
	if( lslope < -15041 ) { 
	if( max < 11.09 ) { 
		if( lslope >= -32522.5 ) { return new Prediction("NAT", 5.33, 0.01); }
	if( lslope < -32522.5 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 3.2, 0.2); }
	}
		if( lslope >= -15041 ) { return new Prediction("NAT", 15.99, 0.02); }
	}
	}
		if( max < 7.22 ) { return new Prediction("AT", 5.33, 0.33); }
	}
	}
		if( lmin >= 2.86 ) { return new Prediction("NAT", 37.32, 0.04); }
	}
		if( rslope < -35845.5 ) { return new Prediction("NAT", 28.79, 0.03); }
	}
		if( lslope >= -5336 ) { return new Prediction("NAT", 51.18, 0.06); }
	}
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( lslope < -19947.5 ) { 
		if( max < 17.33 ) { return new Prediction("NAT", 26.66, 0.03); }
		if( max >= 17.33 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	if( lslope >= -19947.5 ) { 
	if( max < 11.09 ) { 
	if( lslope < -10474.5 ) { 
	if( rmin < -9.32 ) { 
		if( rmin >= -14.77 ) { return new Prediction("NAT", 18.13, 0.02); }
	if( rmin < -14.77 ) { 
		if( lmin < -15.36 ) { return new Prediction("AT", 3.2, 0.2); }
		if( lmin >= -15.36 ) { return new Prediction("NAT", 3.2, 0); }
	}
	}
	if( rmin >= -9.32 ) { 
	if( max < 7.92 ) { 
	if( lmin >= -12.26 ) { 
	if( max < 4.03 ) { 
		if( lmin < -9.9 ) { return new Prediction("AT", 4.26, 0.26); }
		if( lmin >= -9.9 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max >= 4.03 ) { return new Prediction("NAT", 5.33, 0.01); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 13.86, 0.02); }
	}
	if( max >= 7.92 ) { 
	if( lslope < -16709.5 ) { 
		if( lmin >= -10.65 ) { return new Prediction("AT", 3.2, 0.19); }
		if( lmin < -10.65 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -16709.5 ) { return new Prediction("AT", 19.19, 1.17); }
	}
	}
	}
	if( lslope >= -10474.5 ) { 
	if( lslope >= -4851.5 ) { 
	if( lslope < -3884 ) { 
		if( lmin < -10.39 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -10.39 ) { return new Prediction("AT", 1.07, 0.06); }
	}
		if( lslope >= -3884 ) { return new Prediction("NAT", 7.46, 0.01); }
	}
	if( lslope < -4851.5 ) { 
		if( lmin >= -17.43 ) { return new Prediction("AT", 54.38, 3.31); }
	if( lmin < -17.43 ) { 
		if( lmin >= -18.41 ) { return new Prediction("NAT", 2.13, 0); }
		if( lmin < -18.41 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 70.37, 4.29); }
	}
	}
return null;
}
private Prediction runTree16() {
	if( max < 13.14 ) { 
	if( rmin < -7.89 ) { 
	if( lslope >= -19883.5 ) { 
	if( lslope >= -4149.5 ) { 
		if( lmin >= -12.01 ) { return new Prediction("NAT", 13.93, 0.02); }
	if( lmin < -12.01 ) { 
		if( lslope < -2471.99 ) { return new Prediction("AT", 3.21, 0.21); }
		if( lslope >= -2471.99 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	if( lslope < -4149.5 ) { 
	if( lslope < -8885 ) { 
	if( lmin >= -12.49 ) { 
	if( lmin >= -9.75 ) { 
		if( max >= 8.34 ) { return new Prediction("AT", 5.36, 0.35); }
	if( max < 8.34 ) { 
	if( lslope >= -18770.5 ) { 
	if( lmin >= -2.41 ) { 
		if( lmin < 1.2 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= 1.2 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( lmin < -2.41 ) { return new Prediction("NAT", 10.72, 0.01); }
	}
		if( lslope < -18770.5 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	if( lmin < -9.75 ) { 
		if( max >= 2.22 ) { return new Prediction("AT", 19.29, 1.27); }
		if( max < 2.22 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	if( lmin < -12.49 ) { 
		if( rslope < -15896 ) { return new Prediction("AT", 2.14, 0.14); }
	if( rslope >= -15896 ) { 
		if( rmin < -19.54 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= -19.54 ) { return new Prediction("NAT", 16.07, 0.02); }
	}
	}
	}
	if( lslope >= -8885 ) { 
		if( max < -6.88 ) { return new Prediction("NAT", 3.21, 0); }
		if( max >= -6.88 ) { return new Prediction("AT", 41.79, 2.74); }
	}
	}
	}
		if( lslope < -19883.5 ) { return new Prediction("NAT", 24.65, 0.03); }
	}
	if( rmin >= -7.89 ) { 
	if( max >= 1.68 ) { 
	if( lslope >= -5785.5 ) { 
		if( lmin >= -9.98 ) { return new Prediction("NAT", 88.94, 0.1); }
		if( lmin < -9.98 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( lslope < -5785.5 ) { 
	if( lmin < -6.34 ) { 
	if( lslope >= -16989.5 ) { 
	if( max < 5.16 ) { 
		if( lmin < -10.96 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= -10.96 ) { return new Prediction("NAT", 3.21, 0); }
	}
		if( max >= 5.16 ) { return new Prediction("AT", 22.5, 1.48); }
	}
	if( lslope < -16989.5 ) { 
		if( max >= 10.91 ) { return new Prediction("AT", 3.21, 0.21); }
	if( max < 10.91 ) { 
	if( rmin < -4.82 ) { 
		if( lmin >= -8.33 ) { return new Prediction("AT", 3.21, 0.21); }
		if( lmin < -8.33 ) { return new Prediction("NAT", 3.21, 0); }
	}
		if( rmin >= -4.82 ) { return new Prediction("NAT", 13.93, 0.02); }
	}
	}
	}
	if( lmin >= -6.34 ) { 
	if( rslope >= -30708 ) { 
		if( lslope >= -6005.5 ) { return new Prediction("AT", 6.43, 0.42); }
	if( lslope < -6005.5 ) { 
	if( max < 10.58 ) { 
	if( lmin >= -0.97 ) { 
	if( lmin >= 1.09 ) { 
		if( lslope < -9322 ) { return new Prediction("NAT", 33.22, 0.04); }
	if( lslope >= -9322 ) { 
		if( lslope >= -8572 ) { return new Prediction("NAT", 11.79, 0.01); }
		if( lslope < -8572 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	if( lmin < 1.09 ) { 
	if( rslope >= -23320.5 ) { 
	if( lmin < -0.6 ) { 
		if( rmin >= 1.06 ) { return new Prediction("AT", 3.21, 0.21); }
		if( rmin < 1.06 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lmin >= -0.6 ) { 
		if( max < 7.26 ) { return new Prediction("NAT", 28.93, 0.03); }
	if( max >= 7.26 ) { 
		if( lslope >= -12907.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -12907.5 ) { return new Prediction("NAT", 5.36, 0.01); }
	}
	}
	}
	if( rslope < -23320.5 ) { 
	if( lmin >= 0.06 ) { 
	if( rslope >= -26857.5 ) { 
		if( lmin < 0.57 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= 0.57 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rslope < -26857.5 ) { return new Prediction("AT", 9.64, 0.63); }
	}
		if( lmin < 0.06 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	}
	if( lmin < -0.97 ) { 
	if( lmin >= -5.51 ) { 
	if( rmin >= 2.97 ) { 
		if( max >= 3.78 ) { return new Prediction("NAT", 10.72, 0.01); }
		if( max < 3.78 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin < 2.97 ) { return new Prediction("NAT", 66.44, 0.08); }
	}
	if( lmin < -5.51 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 3.21, 0.21); }
		if( max >= 5.93 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	}
	if( max >= 10.58 ) { 
		if( rmin >= 6.07 ) { return new Prediction("NAT", 7.5, 0.01); }
	if( rmin < 6.07 ) { 
		if( lslope >= -8342.5 ) { return new Prediction("AT", 6.43, 0.42); }
	if( lslope < -8342.5 ) { 
	if( lmin >= -1.95 ) { 
	if( lmin >= -0.08 ) { 
		if( lmin >= 4.72 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin < 4.72 ) { return new Prediction("AT", 5.36, 0.35); }
	}
		if( lmin < -0.08 ) { return new Prediction("NAT", 4.29, 0.01); }
	}
		if( lmin < -1.95 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
	}
	}
	}
		if( rslope < -30708 ) { return new Prediction("NAT", 67.51, 0.08); }
	}
	}
	}
	if( max < 1.68 ) { 
	if( lmin < -10.12 ) { 
		if( lmin >= -11.1 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -11.1 ) { return new Prediction("NAT", 4.29, 0.01); }
	}
		if( lmin >= -10.12 ) { return new Prediction("NAT", 185.39, 0.22); }
	}
	}
	}
	if( max >= 13.14 ) { 
	if( rmin < 1 ) { 
		if( lslope >= -22326 ) { return new Prediction("AT", 62.15, 4.08); }
	if( lslope < -22326 ) { 
		if( max < 14.69 ) { return new Prediction("NAT", 2.14, 0); }
		if( max >= 14.69 ) { return new Prediction("AT", 5.36, 0.35); }
	}
	}
	if( rmin >= 1 ) { 
		if( max >= 20.28 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max < 20.28 ) { return new Prediction("NAT", 6.43, 0.01); }
	}
	}
return null;
}
private Prediction runTree17() {
	if( max < 17.11 ) { 
	if( lmin >= -8.97 ) { 
	if( max < 3.17 ) { 
		if( rslope < -6064.5 ) { return new Prediction("NAT", 257.71, 0); }
	if( rslope >= -6064.5 ) { 
		if( lslope < -5405 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lslope >= -5405 ) { return new Prediction("NAT", 31.95, 0); }
	}
	}
	if( max >= 3.17 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 127.79, 0); }
	if( lmin < 3.69 ) { 
	if( max < 10.58 ) { 
	if( lslope >= -30196 ) { 
	if( lslope < -5336 ) { 
	if( lmin >= -5.51 ) { 
	if( lmin < -1.13 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 28.75, 0); }
	if( lmin < -4.28 ) { 
		if( max < 3.67 ) { return new Prediction("AT", 3.19, 0.19); }
		if( max >= 3.67 ) { return new Prediction("NAT", 15.97, 0); }
	}
	}
	if( lmin >= -1.13 ) { 
	if( lmin < -0.6 ) { 
		if( rmin >= 2.07 ) { return new Prediction("AT", 5.32, 0.32); }
		if( rmin < 2.07 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( lmin >= -0.6 ) { 
	if( lslope >= -22954.5 ) { 
	if( lslope < -5760.5 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 24.49, 0); }
	if( max >= 7.05 ) { 
	if( max >= 7.59 ) { 
	if( max >= 9.05 ) { 
		if( lmin >= 1.92 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < 1.92 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max < 9.05 ) { return new Prediction("NAT", 8.52, 0); }
	}
		if( max < 7.59 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	}
		if( lslope >= -5760.5 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( lslope < -22954.5 ) { 
	if( lslope >= -27095.5 ) { 
		if( lmin >= 1.25 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < 1.25 ) { return new Prediction("AT", 5.32, 0.32); }
	}
	if( lslope < -27095.5 ) { 
		if( rslope >= -28654.5 ) { return new Prediction("NAT", 5.32, 0); }
		if( rslope < -28654.5 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
	}
	}
	}
	if( lmin < -5.51 ) { 
		if( max >= 10.04 ) { return new Prediction("NAT", 5.32, 0); }
	if( max < 10.04 ) { 
	if( max < 6.31 ) { 
		if( lmin < -6.27 ) { return new Prediction("NAT", 3.19, 0); }
		if( lmin >= -6.27 ) { return new Prediction("AT", 3.19, 0.19); }
	}
		if( max >= 6.31 ) { return new Prediction("AT", 9.58, 0.58); }
	}
	}
	}
		if( lslope >= -5336 ) { return new Prediction("NAT", 34.08, 0); }
	}
		if( lslope < -30196 ) { return new Prediction("NAT", 40.47, 0); }
	}
	if( max >= 10.58 ) { 
	if( rmin < 5.49 ) { 
	if( rslope < -4727.5 ) { 
	if( rslope < -24121 ) { 
	if( lmin < -0.83 ) { 
		if( max < 13.36 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 13.36 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin >= -0.83 ) { return new Prediction("NAT", 4.26, 0); }
	}
	if( rslope >= -24121 ) { 
	if( rmin >= -19.21 ) { 
		if( rslope >= -21351.5 ) { return new Prediction("AT", 22.36, 1.36); }
	if( rslope < -21351.5 ) { 
		if( lslope >= -22214.5 ) { return new Prediction("NAT", 2.13, 0); }
		if( lslope < -22214.5 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
		if( rslope >= -4727.5 ) { return new Prediction("NAT", 4.26, 0); }
	}
		if( rmin >= 5.49 ) { return new Prediction("NAT", 8.52, 0); }
	}
	}
	}
	}
	if( lmin < -8.97 ) { 
		if( lslope < -19947.5 ) { return new Prediction("NAT", 22.36, 0); }
	if( lslope >= -19947.5 ) { 
	if( max < 11.14 ) { 
		if( lmin < -19.72 ) { return new Prediction("NAT", 7.45, 0); }
	if( lmin >= -19.72 ) { 
		if( max < -6.88 ) { return new Prediction("NAT", 6.39, 0); }
	if( max >= -6.88 ) { 
		if( rslope >= -9296 ) { return new Prediction("AT", 30.88, 1.88); }
	if( rslope < -9296 ) { 
	if( max < 5.42 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 10.65, 0); }
	if( max < 2.61 ) { 
	if( rslope < -14955 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	if( rslope >= -14955 ) { 
		if( rmin < -17.94 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin >= -17.94 ) { return new Prediction("NAT", 8.52, 0); }
	}
	}
	}
	if( max >= 5.42 ) { 
		if( lslope >= -8999.5 ) { return new Prediction("NAT", 1.06, 0); }
	if( lslope < -8999.5 ) { 
	if( max < 9.21 ) { 
		if( max >= 9.05 ) { return new Prediction("NAT", 1.06, 0); }
	if( max < 9.05 ) { 
		if( rmin < -9.25 ) { return new Prediction("AT", 3.19, 0.19); }
	if( rmin >= -9.25 ) { 
		if( lmin >= -11.09 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -11.09 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
	}
		if( max >= 9.21 ) { return new Prediction("AT", 14.91, 0.91); }
	}
	}
	}
	}
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 20.23, 1.23); }
	}
	}
	}
		if( max >= 17.11 ) { return new Prediction("AT", 43.66, 2.66); }
return null;
}
private Prediction runTree18() {
	if( lmin >= -8.97 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 131.4, 0); }
	if( lslope < -5785.5 ) { 
	if( max < 3.17 ) { 
	if( rslope >= -7308.5 ) { 
		if( rmin >= -5.18 ) { return new Prediction("NAT", 6.46, 0); }
		if( rmin < -5.18 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( rslope < -7308.5 ) { return new Prediction("NAT", 267.1, 0); }
	}
	if( max >= 3.17 ) { 
	if( max < 12.03 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 59.24, 0); }
	if( lslope >= -35302 ) { 
		if( lmin >= 3.55 ) { return new Prediction("NAT", 35.54, 0); }
	if( lmin < 3.55 ) { 
	if( lmin >= -8.27 ) { 
	if( max >= 7.09 ) { 
		if( rmin < -7.28 ) { return new Prediction("AT", 7.54, 0.54); }
	if( rmin >= -7.28 ) { 
		if( rmin >= 6.86 ) { return new Prediction("NAT", 14, 0); }
	if( rmin < 6.86 ) { 
	if( lmin < -1.16 ) { 
		if( max >= 10.99 ) { return new Prediction("AT", 1.08, 0.08); }
	if( max < 10.99 ) { 
		if( lmin >= -5.3 ) { return new Prediction("NAT", 11.85, 0); }
	if( lmin < -5.3 ) { 
	if( lmin >= -6.14 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 2.15, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( lmin < -6.14 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	if( lmin >= -1.16 ) { 
	if( lmin >= 0.55 ) { 
	if( lmin < 2.65 ) { 
		if( max < 9.64 ) { return new Prediction("NAT", 6.46, 0); }
		if( max >= 9.64 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( lmin >= 2.65 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	if( lmin < 0.55 ) { 
		if( lmin >= -0.8 ) { return new Prediction("AT", 8.62, 0.62); }
	if( lmin < -0.8 ) { 
		if( lmin >= -0.89 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin < -0.89 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
	}
	}
	if( max < 7.09 ) { 
	if( max >= 3.43 ) { 
		if( rmin >= 1.42 ) { return new Prediction("NAT", 21.54, 0); }
	if( rmin < 1.42 ) { 
		if( max < 4.07 ) { return new Prediction("NAT", 15.08, 0); }
	if( max >= 4.07 ) { 
	if( rmin < -0.38 ) { 
	if( lmin < -4.82 ) { 
	if( max < 5.26 ) { 
		if( max >= 4.14 ) { return new Prediction("NAT", 8.62, 0); }
		if( max < 4.14 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	if( max >= 5.26 ) { 
		if( rmin >= -6.53 ) { return new Prediction("AT", 3.23, 0.23); }
		if( rmin < -6.53 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( lmin >= -4.82 ) { return new Prediction("NAT", 22.62, 0); }
	}
	if( rmin >= -0.38 ) { 
	if( lmin < 1.37 ) { 
		if( lmin >= -2.28 ) { return new Prediction("AT", 6.46, 0.46); }
		if( lmin < -2.28 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lmin >= 1.37 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	}
	if( max < 3.43 ) { 
		if( rmin < -4.79 ) { return new Prediction("AT", 3.23, 0.23); }
	if( rmin >= -4.79 ) { 
		if( rmin < 1.14 ) { return new Prediction("NAT", 5.39, 0); }
		if( rmin >= 1.14 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	}
	}
		if( lmin < -8.27 ) { return new Prediction("AT", 6.46, 0.46); }
	}
	}
	}
	if( max >= 12.03 ) { 
	if( max < 14.71 ) { 
		if( max >= 13.82 ) { return new Prediction("NAT", 5.39, 0); }
		if( max < 13.82 ) { return new Prediction("AT", 7.54, 0.54); }
	}
		if( max >= 14.71 ) { return new Prediction("AT", 12.92, 0.92); }
	}
	}
	}
	}
	if( lmin < -8.97 ) { 
	if( max < 4.56 ) { 
	if( rmin < -4.75 ) { 
	if( rslope < -10795.5 ) { 
		if( lslope >= -16225.5 ) { return new Prediction("NAT", 14, 0); }
	if( lslope < -16225.5 ) { 
		if( rmin < -8.31 ) { return new Prediction("NAT", 3.23, 0); }
	if( rmin >= -8.31 ) { 
		if( lslope < -32770 ) { return new Prediction("NAT", 1.08, 0); }
		if( lslope >= -32770 ) { return new Prediction("AT", 10.77, 0.77); }
	}
	}
	}
	if( rslope >= -10795.5 ) { 
		if( lslope >= -4003.5 ) { return new Prediction("NAT", 3.23, 0); }
	if( lslope < -4003.5 ) { 
		if( max >= -3.59 ) { return new Prediction("AT", 18.31, 1.31); }
	if( max < -3.59 ) { 
	if( max >= -5.41 ) { 
		if( rmin < -13.31 ) { return new Prediction("AT", 3.23, 0.23); }
		if( rmin >= -13.31 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	}
		if( rmin >= -4.75 ) { return new Prediction("NAT", 17.23, 0); }
	}
	if( max >= 4.56 ) { 
	if( rslope >= -19885 ) { 
	if( lmin >= -9.75 ) { 
		if( lmin < -9.73 ) { return new Prediction("NAT", 4.31, 0); }
		if( lmin >= -9.73 ) { return new Prediction("AT", 17.23, 1.23); }
	}
	if( lmin < -9.75 ) { 
		if( rmin >= -16.19 ) { return new Prediction("AT", 59.24, 4.24); }
	if( rmin < -16.19 ) { 
		if( rmin >= -18.02 ) { return new Prediction("NAT", 1.08, 0); }
		if( rmin < -18.02 ) { return new Prediction("AT", 4.31, 0.31); }
	}
	}
	}
	if( rslope < -19885 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 4.31, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
return null;
}
private Prediction runTree19() {
	if( lmin >= -8.27 ) { 
	if( lslope < -5828 ) { 
	if( rslope >= -36810.5 ) { 
	if( max < 10.9 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 176.82, 0); }
	if( max >= 3.17 ) { 
		if( rmin >= 3.89 ) { return new Prediction("NAT", 52.51, 0); }
	if( rmin < 3.89 ) { 
		if( lmin >= 2.54 ) { return new Prediction("NAT", 20.36, 0); }
	if( lmin < 2.54 ) { 
	if( rmin < -0.18 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 34.29, 0); }
	if( lmin < -4.28 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 15, 0); }
	if( rmin < -5.54 ) { 
	if( rmin >= -9.59 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 7.5, 0.5); }
	if( max >= 5.93 ) { 
	if( rslope < -9709 ) { 
		if( lmin < -7.19 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= -7.19 ) { return new Prediction("NAT", 4.29, 0); }
	}
		if( rslope >= -9709 ) { return new Prediction("AT", 5.36, 0.36); }
	}
	}
		if( rmin < -9.59 ) { return new Prediction("NAT", 5.36, 0); }
	}
	}
	}
	if( rmin >= -0.18 ) { 
	if( lslope >= -30377.5 ) { 
		if( lmin < -1.22 ) { return new Prediction("NAT", 7.5, 0); }
	if( lmin >= -1.22 ) { 
	if( lslope < -25680.5 ) { 
		if( rmin < 2.34 ) { return new Prediction("AT", 13.93, 0.93); }
		if( rmin >= 2.34 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope >= -25680.5 ) { 
	if( lmin < -0.55 ) { 
		if( max < 5.85 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 5.85 ) { return new Prediction("AT", 7.5, 0.5); }
	}
	if( lmin >= -0.55 ) { 
		if( max < 6.63 ) { return new Prediction("NAT", 8.57, 0); }
	if( max >= 6.63 ) { 
		if( lslope < -13401 ) { return new Prediction("NAT", 6.43, 0); }
		if( lslope >= -13401 ) { return new Prediction("AT", 5.36, 0.36); }
	}
	}
	}
	}
	}
		if( lslope < -30377.5 ) { return new Prediction("NAT", 7.5, 0); }
	}
	}
	}
	}
	}
	if( max >= 10.9 ) { 
	if( rmin < 2.1 ) { 
	if( rmin >= -19.21 ) { 
	if( lslope < -20462 ) { 
		if( lslope >= -20851 ) { return new Prediction("NAT", 2.14, 0); }
	if( lslope < -20851 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 11.09 ) { return new Prediction("AT", 15, 1); }
	}
	}
		if( lslope >= -20462 ) { return new Prediction("AT", 20.36, 1.36); }
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rmin >= 2.1 ) { 
		if( rslope < -12742.5 ) { return new Prediction("NAT", 7.5, 0); }
	if( rslope >= -12742.5 ) { 
		if( lmin < 5.11 ) { return new Prediction("AT", 6.43, 0.43); }
		if( lmin >= 5.11 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
		if( rslope < -36810.5 ) { return new Prediction("NAT", 95.37, 0); }
	}
		if( lslope >= -5828 ) { return new Prediction("NAT", 120.02, 0); }
	}
	if( lmin < -8.27 ) { 
	if( max >= 5.34 ) { 
	if( lslope >= -21578.5 ) { 
	if( rmin < -7.97 ) { 
	if( rmin < -8.19 ) { 
	if( rmin < -12.4 ) { 
	if( rmin < -12.98 ) { 
	if( max < 9.92 ) { 
		if( max >= 9.27 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 9.27 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( max >= 9.92 ) { return new Prediction("AT", 7.5, 0.5); }
	}
		if( rmin >= -12.98 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin >= -12.4 ) { return new Prediction("AT", 28.93, 1.93); }
	}
		if( rmin >= -8.19 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( rmin >= -7.97 ) { return new Prediction("AT", 43.94, 2.94); }
	}
	if( lslope < -21578.5 ) { 
		if( max >= 15.71 ) { return new Prediction("AT", 4.29, 0.29); }
		if( max < 15.71 ) { return new Prediction("NAT", 4.29, 0); }
	}
	}
	if( max < 5.34 ) { 
	if( lmin >= -9.94 ) { 
	if( rslope >= -9453 ) { 
		if( rslope < -6095.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rslope >= -6095.5 ) { return new Prediction("NAT", 7.5, 0); }
	}
		if( rslope < -9453 ) { return new Prediction("NAT", 21.43, 0); }
	}
	if( lmin < -9.94 ) { 
	if( rslope < -11195 ) { 
		if( rmin < -6.66 ) { return new Prediction("NAT", 13.93, 0); }
	if( rmin >= -6.66 ) { 
	if( rmin < -4.58 ) { 
		if( lmin >= -10.73 ) { return new Prediction("NAT", 3.21, 0); }
		if( lmin < -10.73 ) { return new Prediction("AT", 7.5, 0.5); }
	}
		if( rmin >= -4.58 ) { return new Prediction("NAT", 8.57, 0); }
	}
	}
	if( rslope >= -11195 ) { 
	if( lslope >= -5292.5 ) { 
		if( max >= -3.62 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max < -3.62 ) { return new Prediction("NAT", 6.43, 0); }
	}
		if( lslope < -5292.5 ) { return new Prediction("AT", 33.22, 2.22); }
	}
	}
	}
	}
return null;
}
private Prediction runTree20() {
	if( rmin >= -7.43 ) { 
	if( lmin >= -8.96 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 143.07, 0.34); }
	if( lslope < -5395 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 168, 0.39); }
	if( max >= 1.66 ) { 
		if( max >= 13.18 ) { return new Prediction("AT", 16.26, 1.22); }
	if( max < 13.18 ) { 
	if( lslope >= -35061.5 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 36.85, 0.09); }
	if( rmin < 6.73 ) { 
	if( rmin >= -5.54 ) { 
	if( rmin < -0.06 ) { 
	if( rslope < -5972 ) { 
		if( rmin >= -1.14 ) { return new Prediction("NAT", 23.84, 0.06); }
	if( rmin < -1.14 ) { 
		if( max < 7.57 ) { return new Prediction("NAT", 31.43, 0.07); }
	if( max >= 7.57 ) { 
		if( lslope >= -13657.5 ) { return new Prediction("NAT", 5.42, 0.01); }
	if( lslope < -13657.5 ) { 
		if( rmin < -4.95 ) { return new Prediction("NAT", 1.08, 0); }
		if( rmin >= -4.95 ) { return new Prediction("AT", 5.42, 0.41); }
	}
	}
	}
	}
		if( rslope >= -5972 ) { return new Prediction("AT", 2.17, 0.16); }
	}
	if( rmin >= -0.06 ) { 
	if( rmin >= 0.41 ) { 
	if( lslope < -20781 ) { 
	if( max < 4.31 ) { 
		if( max < 3.9 ) { return new Prediction("NAT", 8.67, 0.02); }
		if( max >= 3.9 ) { return new Prediction("AT", 2.17, 0.16); }
	}
		if( max >= 4.31 ) { return new Prediction("NAT", 22.76, 0.05); }
	}
	if( lslope >= -20781 ) { 
	if( max >= 6.71 ) { 
	if( max >= 10.41 ) { 
		if( max < 11.14 ) { return new Prediction("AT", 9.75, 0.73); }
		if( max >= 11.14 ) { return new Prediction("NAT", 1.08, 0); }
	}
	if( max < 10.41 ) { 
	if( lmin < 5.13 ) { 
		if( lmin < -2.01 ) { return new Prediction("NAT", 3.25, 0.01); }
	if( lmin >= -2.01 ) { 
	if( rslope < -14120.5 ) { 
		if( lmin >= 0.05 ) { return new Prediction("NAT", 3.25, 0.01); }
		if( lmin < 0.05 ) { return new Prediction("AT", 2.17, 0.16); }
	}
		if( rslope >= -14120.5 ) { return new Prediction("AT", 7.59, 0.57); }
	}
	}
		if( lmin >= 5.13 ) { return new Prediction("NAT", 4.34, 0.01); }
	}
	}
	if( max < 6.71 ) { 
		if( lslope >= -18975.5 ) { return new Prediction("NAT", 20.59, 0.05); }
		if( lslope < -18975.5 ) { return new Prediction("AT", 2.17, 0.16); }
	}
	}
	}
	if( rmin < 0.41 ) { 
		if( rslope >= -26857.5 ) { return new Prediction("NAT", 2.17, 0.01); }
		if( rslope < -26857.5 ) { return new Prediction("AT", 11.92, 0.89); }
	}
	}
	}
	if( rmin < -5.54 ) { 
	if( rmin >= -6.84 ) { 
		if( lmin >= -5.23 ) { return new Prediction("NAT", 5.42, 0.01); }
		if( lmin < -5.23 ) { return new Prediction("AT", 8.67, 0.65); }
	}
		if( rmin < -6.84 ) { return new Prediction("AT", 4.34, 0.33); }
	}
	}
	}
		if( lslope < -35061.5 ) { return new Prediction("NAT", 54.19, 0.13); }
	}
	}
	}
	}
	if( lmin < -8.96 ) { 
	if( rslope >= -17930.5 ) { 
	if( max < 5.16 ) { 
		if( lslope >= -14872 ) { return new Prediction("NAT", 4.34, 0.01); }
		if( lslope < -14872 ) { return new Prediction("AT", 2.17, 0.16); }
	}
	if( max >= 5.16 ) { 
		if( rmin >= -6.84 ) { return new Prediction("AT", 34.68, 2.6); }
	if( rmin < -6.84 ) { 
		if( rmin < -6.95 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rmin >= -6.95 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	if( rslope < -17930.5 ) { 
		if( lmin < -11.87 ) { return new Prediction("NAT", 14.09, 0.03); }
	if( lmin >= -11.87 ) { 
	if( rmin < -5.44 ) { 
		if( lmin >= -10.73 ) { return new Prediction("NAT", 2.17, 0.01); }
		if( lmin < -10.73 ) { return new Prediction("AT", 2.17, 0.16); }
	}
		if( rmin >= -5.44 ) { return new Prediction("NAT", 8.67, 0.02); }
	}
	}
	}
	}
	if( rmin < -7.43 ) { 
	if( max >= 5.35 ) { 
		if( lslope < -14212 ) { return new Prediction("AT", 22.76, 1.71); }
	if( lslope >= -14212 ) { 
	if( lslope >= -13241.5 ) { 
	if( rmin >= -19.21 ) { 
	if( lmin >= -22.24 ) { 
		if( lslope >= -1014.49 ) { return new Prediction("NAT", 2.17, 0.01); }
	if( lslope < -1014.49 ) { 
	if( rmin >= -7.69 ) { 
		if( max < 9.36 ) { return new Prediction("NAT", 1.08, 0); }
		if( max >= 9.36 ) { return new Prediction("AT", 2.17, 0.16); }
	}
		if( rmin < -7.69 ) { return new Prediction("AT", 39.02, 2.93); }
	}
	}
		if( lmin < -22.24 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
	if( rmin < -19.21 ) { 
		if( lmin >= -11.39 ) { return new Prediction("NAT", 4.34, 0.01); }
		if( lmin < -11.39 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lslope < -13241.5 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
	}
	if( max < 5.35 ) { 
	if( lslope >= -10662 ) { 
		if( lslope >= -5332.5 ) { return new Prediction("NAT", 9.75, 0.02); }
	if( lslope < -5332.5 ) { 
		if( max >= -3.59 ) { return new Prediction("AT", 20.59, 1.55); }
	if( max < -3.59 ) { 
		if( lmin < -15.37 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lmin >= -15.37 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	if( lslope < -10662 ) { 
		if( rmin < -8.13 ) { return new Prediction("NAT", 54.19, 0.13); }
	if( rmin >= -8.13 ) { 
	if( max < 3.97 ) { 
		if( lmin < -4.68 ) { return new Prediction("NAT", 4.34, 0.01); }
	if( lmin >= -4.68 ) { 
		if( max >= 3.49 ) { return new Prediction("NAT", 3.25, 0.01); }
		if( max < 3.49 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( max >= 3.97 ) { return new Prediction("AT", 2.17, 0.16); }
	}
	}
	}
	}
return null;
}
private Prediction runTree21() {
	if( lmin < -9.16 ) { 
	if( rslope >= -19885 ) { 
	if( max < 3.21 ) { 
	if( lslope < -10474 ) { 
		if( lslope >= -16713 ) { return new Prediction("NAT", 15.12, 0.02); }
	if( lslope < -16713 ) { 
		if( lmin >= -12.26 ) { return new Prediction("AT", 2.16, 0.16); }
		if( lmin < -12.26 ) { return new Prediction("NAT", 4.32, 0.01); }
	}
	}
	if( lslope >= -10474 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 11.88, 0.01); }
		if( max >= -4.9 ) { return new Prediction("AT", 22.67, 1.65); }
	}
	}
	if( max >= 3.21 ) { 
	if( max < 9.82 ) { 
	if( lmin >= -9.98 ) { 
		if( lslope >= -9438 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lslope < -9438 ) { return new Prediction("NAT", 3.24, 0); }
	}
	if( lmin < -9.98 ) { 
		if( max < 9.18 ) { return new Prediction("AT", 36.71, 2.67); }
		if( max >= 9.18 ) { return new Prediction("NAT", 3.24, 0); }
	}
	}
		if( max >= 9.82 ) { return new Prediction("AT", 63.71, 4.63); }
	}
	}
	if( rslope < -19885 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 14.04, 0.02); }
		if( max >= 18.14 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
	if( lmin >= -9.16 ) { 
	if( max < 10.58 ) { 
	if( max < 3.17 ) { 
		if( rslope < -6064.5 ) { return new Prediction("NAT", 232.15, 0.27); }
	if( rslope >= -6064.5 ) { 
		if( rslope < -5914 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rslope >= -5914 ) { return new Prediction("NAT", 23.75, 0.03); }
	}
	}
	if( max >= 3.17 ) { 
	if( rmin >= -4.12 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 86.38, 0.1); }
	if( lmin < 3.69 ) { 
		if( rmin < -1.13 ) { return new Prediction("NAT", 47.51, 0.06); }
	if( rmin >= -1.13 ) { 
		if( rslope < -30316 ) { return new Prediction("NAT", 23.75, 0.03); }
	if( rslope >= -30316 ) { 
		if( max >= 9.41 ) { return new Prediction("NAT", 16.2, 0.02); }
	if( max < 9.41 ) { 
	if( lslope < -5336 ) { 
	if( lmin < 0.02 ) { 
	if( rslope >= -22636 ) { 
		if( rslope < -14775.5 ) { return new Prediction("AT", 5.4, 0.39); }
	if( rslope >= -14775.5 ) { 
		if( lmin < -1.28 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -1.28 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
		if( rslope < -22636 ) { return new Prediction("NAT", 3.24, 0); }
	}
	if( lmin >= 0.02 ) { 
		if( lslope < -27978.5 ) { return new Prediction("AT", 2.16, 0.16); }
	if( lslope >= -27978.5 ) { 
		if( lmin < 0.44 ) { return new Prediction("NAT", 11.88, 0.01); }
	if( lmin >= 0.44 ) { 
	if( lslope < -12527 ) { 
	if( max < 4.82 ) { 
		if( lmin < 1.15 ) { return new Prediction("AT", 3.24, 0.24); }
		if( lmin >= 1.15 ) { return new Prediction("NAT", 6.48, 0.01); }
	}
		if( max >= 4.82 ) { return new Prediction("NAT", 12.96, 0.02); }
	}
		if( lslope >= -12527 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
	}
	}
		if( lslope >= -5336 ) { return new Prediction("NAT", 12.96, 0.02); }
	}
	}
	}
	}
	}
	if( rmin < -4.12 ) { 
	if( max < 6.31 ) { 
		if( rmin < -7.08 ) { return new Prediction("NAT", 21.59, 0.03); }
	if( rmin >= -7.08 ) { 
	if( lslope < -9986 ) { 
		if( rslope < -36421 ) { return new Prediction("NAT", 2.16, 0); }
		if( rslope >= -36421 ) { return new Prediction("AT", 5.4, 0.39); }
	}
		if( lslope >= -9986 ) { return new Prediction("NAT", 10.8, 0.01); }
	}
	}
	if( max >= 6.31 ) { 
	if( lslope < -6373 ) { 
	if( lmin >= -4.08 ) { 
		if( rmin >= -9.74 ) { return new Prediction("NAT", 6.48, 0.01); }
		if( rmin < -9.74 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	if( lmin < -4.08 ) { 
		if( lmin >= -8.77 ) { return new Prediction("AT", 15.12, 1.1); }
		if( lmin < -8.77 ) { return new Prediction("NAT", 2.16, 0); }
	}
	}
		if( lslope >= -6373 ) { return new Prediction("NAT", 6.48, 0.01); }
	}
	}
	}
	}
	if( max >= 10.58 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 28.07, 0.03); }
	if( lmin < 3.6 ) { 
	if( rmin < 5.89 ) { 
		if( rslope >= -4959 ) { return new Prediction("NAT", 6.48, 0.01); }
	if( rslope < -4959 ) { 
		if( lslope < -41019 ) { return new Prediction("NAT", 2.16, 0); }
	if( lslope >= -41019 ) { 
	if( lmin >= -3.31 ) { 
	if( rmin >= -19.21 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 29.15, 2.12); }
	if( lmin < -1.14 ) { 
		if( max >= 12.26 ) { return new Prediction("AT", 15.12, 1.1); }
		if( max < 12.26 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 3.24, 0); }
	}
	if( lmin < -3.31 ) { 
		if( max >= 12.15 ) { return new Prediction("AT", 4.32, 0.31); }
		if( max < 12.15 ) { return new Prediction("NAT", 3.24, 0); }
	}
	}
	}
	}
	if( rmin >= 5.89 ) { 
		if( max < 19.89 ) { return new Prediction("NAT", 11.88, 0.01); }
		if( max >= 19.89 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
return null;
}
private Prediction runTree22() {
		if( max >= 15.55 ) { return new Prediction("AT", 44.38, 3.33); }
	if( max < 15.55 ) { 
	if( rslope < -19077.5 ) { 
	if( max >= 2.49 ) { 
		if( rmin >= 0.85 ) { return new Prediction("NAT", 86.6, 0.1); }
	if( rmin < 0.85 ) { 
		if( lslope < -36676 ) { return new Prediction("NAT", 34.64, 0.04); }
	if( lslope >= -36676 ) { 
	if( rmin >= -0.94 ) { 
	if( lslope >= -34841.5 ) { 
	if( lslope >= -30377.5 ) { 
	if( max >= 3.27 ) { 
		if( rslope < -20933 ) { return new Prediction("AT", 7.58, 0.57); }
		if( rslope >= -20933 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( max < 3.27 ) { return new Prediction("NAT", 2.16, 0); }
	}
		if( lslope < -30377.5 ) { return new Prediction("NAT", 4.33, 0.01); }
	}
		if( lslope < -34841.5 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	if( rmin < -0.94 ) { 
		if( lmin >= -1.39 ) { return new Prediction("NAT", 16.24, 0.02); }
	if( lmin < -1.39 ) { 
		if( max < 2.72 ) { return new Prediction("AT", 1.08, 0.08); }
	if( max >= 2.72 ) { 
		if( lslope >= -20829.5 ) { return new Prediction("NAT", 9.74, 0.01); }
	if( lslope < -20829.5 ) { 
	if( lslope >= -22966.5 ) { 
		if( lmin >= -3.13 ) { return new Prediction("AT", 2.16, 0.16); }
	if( lmin < -3.13 ) { 
		if( max < 3.67 ) { return new Prediction("AT", 1.08, 0.08); }
		if( max >= 3.67 ) { return new Prediction("NAT", 3.25, 0); }
	}
	}
	if( lslope < -22966.5 ) { 
		if( lmin >= -7 ) { return new Prediction("NAT", 11.91, 0.01); }
	if( lmin < -7 ) { 
		if( max >= 7.47 ) { return new Prediction("NAT", 3.25, 0); }
		if( max < 7.47 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
		if( max < 2.49 ) { return new Prediction("NAT", 177.53, 0.21); }
	}
	if( rslope >= -19077.5 ) { 
	if( lmin >= -7.71 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 107.17, 0.13); }
	if( lslope < -5395 ) { 
	if( max < 6.31 ) { 
	if( rmin < -6.03 ) { 
		if( lslope < -11678 ) { return new Prediction("NAT", 15.15, 0.02); }
	if( lslope >= -11678 ) { 
		if( max < -0.19 ) { return new Prediction("NAT", 4.33, 0.01); }
	if( max >= -0.19 ) { 
		if( lmin < -6.27 ) { return new Prediction("NAT", 3.25, 0); }
		if( lmin >= -6.27 ) { return new Prediction("AT", 6.49, 0.49); }
	}
	}
	}
		if( rmin >= -6.03 ) { return new Prediction("NAT", 96.34, 0.11); }
	}
	if( max >= 6.31 ) { 
	if( lmin < 4.22 ) { 
	if( lslope < -12373.5 ) { 
	if( lslope >= -14016 ) { 
		if( lmin < 1.66 ) { return new Prediction("NAT", 12.99, 0.02); }
		if( lmin >= 1.66 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	if( lslope < -14016 ) { 
		if( lmin < 0.63 ) { return new Prediction("AT", 8.66, 0.65); }
		if( lmin >= 0.63 ) { return new Prediction("NAT", 3.25, 0); }
	}
	}
	if( lslope >= -12373.5 ) { 
	if( lmin < -2.46 ) { 
		if( rslope < -8392 ) { return new Prediction("AT", 3.25, 0.24); }
		if( rslope >= -8392 ) { return new Prediction("NAT", 3.25, 0); }
	}
		if( lmin >= -2.46 ) { return new Prediction("AT", 22.73, 1.71); }
	}
	}
		if( lmin >= 4.22 ) { return new Prediction("NAT", 19.48, 0.02); }
	}
	}
	}
	if( lmin < -7.71 ) { 
	if( max >= -5.41 ) { 
	if( lslope < -11359 ) { 
	if( max >= 6.15 ) { 
		if( lmin >= -11.34 ) { return new Prediction("AT", 21.65, 1.62); }
	if( lmin < -11.34 ) { 
		if( lmin >= -12 ) { return new Prediction("NAT", 2.16, 0); }
		if( lmin < -12 ) { return new Prediction("AT", 3.25, 0.24); }
	}
	}
	if( max < 6.15 ) { 
		if( rslope >= -16756 ) { return new Prediction("NAT", 15.15, 0.02); }
	if( rslope < -16756 ) { 
	if( rmin >= -7.68 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 3.25, 0); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 8.66, 0.65); }
	}
		if( rmin < -7.68 ) { return new Prediction("NAT", 4.33, 0.01); }
	}
	}
	}
	if( lslope >= -11359 ) { 
		if( lmin < -21.44 ) { return new Prediction("NAT", 3.25, 0); }
	if( lmin >= -21.44 ) { 
	if( lmin < -14.13 ) { 
	if( lslope < -3898.49 ) { 
		if( max < 6.87 ) { return new Prediction("AT", 12.99, 0.97); }
	if( max >= 6.87 ) { 
		if( max < 12.35 ) { return new Prediction("NAT", 1.08, 0); }
		if( max >= 12.35 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lslope >= -3898.49 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lmin >= -14.13 ) { return new Prediction("AT", 43.3, 3.25); }
	}
	}
	}
		if( max < -5.41 ) { return new Prediction("NAT", 14.07, 0.02); }
	}
	}
	}
return null;
}
private Prediction runTree23() {
	if( max >= 13.61 ) { 
	if( lmin < 3.96 ) { 
	if( lmin < -0.73 ) { 
	if( rslope < -19599 ) { 
		if( lslope < -26626 ) { return new Prediction("AT", 7.44, 0.44); }
		if( lslope >= -26626 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rslope >= -19599 ) { return new Prediction("AT", 46.74, 2.74); }
	}
	if( lmin >= -0.73 ) { 
		if( lmin >= 0.41 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lmin < 0.41 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( lmin >= 3.96 ) { return new Prediction("NAT", 3.19, 0); }
	}
	if( max < 13.61 ) { 
	if( rslope >= -21351.5 ) { 
	if( lmin >= -8.49 ) { 
	if( max >= 1.61 ) { 
	if( rslope < -5839.5 ) { 
	if( rmin < -5.82 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 10.62, 0); }
	if( lmin < -4.28 ) { 
	if( rmin < -9.48 ) { 
		if( rmin >= -10.37 ) { return new Prediction("NAT", 4.25, 0); }
		if( rmin < -10.37 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( rmin >= -9.48 ) { 
		if( lslope >= -10373 ) { return new Prediction("AT", 15.93, 0.93); }
	if( lslope < -10373 ) { 
		if( lslope >= -11091 ) { return new Prediction("NAT", 2.12, 0); }
		if( lslope < -11091 ) { return new Prediction("AT", 8.5, 0.5); }
	}
	}
	}
	}
	if( rmin >= -5.82 ) { 
	if( max < 7.05 ) { 
	if( lslope < -19140.5 ) { 
		if( lslope < -20097 ) { return new Prediction("NAT", 3.19, 0); }
		if( lslope >= -20097 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lslope >= -19140.5 ) { return new Prediction("NAT", 47.8, 0); }
	}
	if( max >= 7.05 ) { 
		if( lmin >= 4.61 ) { return new Prediction("NAT", 25.49, 0); }
	if( lmin < 4.61 ) { 
		if( max < 7.42 ) { return new Prediction("AT", 7.44, 0.44); }
	if( max >= 7.42 ) { 
	if( rmin < 5.98 ) { 
	if( lmin >= -1.19 ) { 
	if( lslope >= -14761 ) { 
		if( rmin < -4.6 ) { return new Prediction("NAT", 2.12, 0); }
		if( rmin >= -4.6 ) { return new Prediction("AT", 14.87, 0.87); }
	}
		if( lslope < -14761 ) { return new Prediction("NAT", 3.19, 0); }
	}
	if( lmin < -1.19 ) { 
		if( lslope < -15751.5 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lslope >= -15751.5 ) { return new Prediction("NAT", 10.62, 0); }
	}
	}
		if( rmin >= 5.98 ) { return new Prediction("NAT", 8.5, 0); }
	}
	}
	}
	}
	}
		if( rslope >= -5839.5 ) { return new Prediction("NAT", 83.92, 0); }
	}
		if( max < 1.61 ) { return new Prediction("NAT", 110.48, 0); }
	}
	if( lmin < -8.49 ) { 
	if( rmin < -16.01 ) { 
		if( lmin >= -10.15 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -10.15 ) { return new Prediction("AT", 19.12, 1.12); }
	}
	if( rmin >= -16.01 ) { 
	if( rmin < -9.55 ) { 
	if( max >= 3.07 ) { 
		if( rmin < -15.15 ) { return new Prediction("NAT", 2.12, 0); }
	if( rmin >= -15.15 ) { 
	if( lmin < -12.91 ) { 
		if( lmin >= -13.32 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin < -13.32 ) { return new Prediction("AT", 5.31, 0.31); }
	}
		if( lmin >= -12.91 ) { return new Prediction("AT", 15.93, 0.93); }
	}
	}
	if( max < 3.07 ) { 
		if( rmin >= -11.33 ) { return new Prediction("NAT", 18.06, 0); }
	if( rmin < -11.33 ) { 
	if( max < 2.53 ) { 
		if( lslope >= -11279 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lslope < -11279 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max >= 2.53 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
	}
	if( rmin >= -9.55 ) { 
		if( max >= 8.05 ) { return new Prediction("AT", 23.37, 1.37); }
	if( max < 8.05 ) { 
	if( lslope < -9811.5 ) { 
		if( rslope < -18188 ) { return new Prediction("NAT", 7.44, 0); }
	if( rslope >= -18188 ) { 
		if( lslope < -15402.5 ) { return new Prediction("AT", 3.19, 0.19); }
		if( lslope >= -15402.5 ) { return new Prediction("NAT", 6.37, 0); }
	}
	}
		if( lslope >= -9811.5 ) { return new Prediction("AT", 9.56, 0.56); }
	}
	}
	}
	}
	}
	if( rslope < -21351.5 ) { 
	if( max >= 3.5 ) { 
		if( lmin >= 1.19 ) { return new Prediction("NAT", 56.3, 0); }
	if( lmin < 1.19 ) { 
	if( lmin < 0.27 ) { 
	if( rmin < -1.85 ) { 
		if( max < 4.99 ) { return new Prediction("NAT", 7.44, 0); }
	if( max >= 4.99 ) { 
	if( max >= 5.82 ) { 
		if( rmin >= -2.16 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < -2.16 ) { return new Prediction("NAT", 7.44, 0); }
	}
		if( max < 5.82 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
		if( rmin >= -1.85 ) { return new Prediction("NAT", 38.24, 0); }
	}
	if( lmin >= 0.27 ) { 
		if( lslope < -36267 ) { return new Prediction("NAT", 4.25, 0); }
		if( lslope >= -36267 ) { return new Prediction("AT", 7.44, 0.44); }
	}
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 183.77, 0); }
	}
	}
return null;
}
private Prediction runTree24() {
	if( max >= 12.06 ) { 
	if( max < 17.11 ) { 
	if( lslope >= -4978.5 ) { 
		if( lslope < -1829.99 ) { return new Prediction("NAT", 8.47, 0.02); }
	if( lslope >= -1829.99 ) { 
		if( max < 13.33 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 13.33 ) { return new Prediction("AT", 3.17, 0.17); }
	}
	}
	if( lslope < -4978.5 ) { 
		if( rslope >= -20001.5 ) { return new Prediction("AT", 16.93, 0.89); }
	if( rslope < -20001.5 ) { 
		if( rmin < -3.17 ) { return new Prediction("NAT", 5.29, 0.01); }
	if( rmin >= -3.17 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 4.23, 0.01); }
		if( rmin < 2.46 ) { return new Prediction("AT", 6.35, 0.33); }
	}
	}
	}
	}
		if( max >= 17.11 ) { return new Prediction("AT", 43.39, 2.29); }
	}
	if( max < 12.06 ) { 
	if( rmin >= -5.48 ) { 
		if( rslope < -33176 ) { return new Prediction("NAT", 88.9, 0.21); }
	if( rslope >= -33176 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 84.67, 0.2); }
	if( lslope < -5358 ) { 
	if( max >= 3.49 ) { 
	if( lmin < 3.71 ) { 
	if( lmin < -1.13 ) { 
	if( lmin >= -8.96 ) { 
	if( max >= 10.99 ) { 
		if( lmin >= -1.95 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -1.95 ) { return new Prediction("AT", 2.12, 0.11); }
	}
	if( max < 10.99 ) { 
		if( lslope >= -32607 ) { return new Prediction("NAT", 51.86, 0.12); }
		if( lslope < -32607 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( lmin < -8.96 ) { 
		if( lslope < -16389 ) { return new Prediction("NAT", 3.17, 0.01); }
	if( lslope >= -16389 ) { 
	if( rmin < -3.74 ) { 
		if( lmin < -13.34 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -13.34 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin >= -3.74 ) { return new Prediction("AT", 4.23, 0.22); }
	}
	}
	}
	if( lmin >= -1.13 ) { 
	if( max >= 7.32 ) { 
	if( rmin >= 3.97 ) { 
		if( lslope >= -15345 ) { return new Prediction("AT", 3.17, 0.17); }
		if( lslope < -15345 ) { return new Prediction("NAT", 3.17, 0.01); }
	}
	if( rmin < 3.97 ) { 
		if( rmin < -3.41 ) { return new Prediction("NAT", 1.06, 0); }
	if( rmin >= -3.41 ) { 
		if( lmin < 0.66 ) { return new Prediction("AT", 19.05, 1); }
	if( lmin >= 0.66 ) { 
		if( max < 8.53 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 8.53 ) { return new Prediction("AT", 3.17, 0.17); }
	}
	}
	}
	}
	if( max < 7.32 ) { 
		if( rmin >= 1.46 ) { return new Prediction("NAT", 16.93, 0.04); }
	if( rmin < 1.46 ) { 
		if( rmin < -0.38 ) { return new Prediction("NAT", 7.41, 0.02); }
	if( rmin >= -0.38 ) { 
		if( max >= 7.22 ) { return new Prediction("NAT", 2.12, 0); }
		if( max < 7.22 ) { return new Prediction("AT", 11.64, 0.61); }
	}
	}
	}
	}
	}
		if( lmin >= 3.71 ) { return new Prediction("NAT", 41.27, 0.1); }
	}
	if( max < 3.49 ) { 
		if( lmin >= -11.81 ) { return new Prediction("NAT", 155.57, 0.36); }
	if( lmin < -11.81 ) { 
	if( lslope >= -17886 ) { 
	if( lmin >= -17.85 ) { 
		if( lmin >= -14.58 ) { return new Prediction("AT", 2.12, 0.11); }
		if( lmin < -14.58 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( lmin < -17.85 ) { return new Prediction("AT", 2.12, 0.11); }
	}
		if( lslope < -17886 ) { return new Prediction("NAT", 6.35, 0.01); }
	}
	}
	}
	}
	}
	if( rmin < -5.48 ) { 
	if( max >= 1.24 ) { 
	if( lmin < -4.33 ) { 
	if( lmin < -12.83 ) { 
		if( max < 3.64 ) { return new Prediction("NAT", 11.64, 0.03); }
	if( max >= 3.64 ) { 
	if( lmin < -17.63 ) { 
		if( max >= 9.27 ) { return new Prediction("NAT", 3.17, 0.01); }
		if( max < 9.27 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( lmin >= -17.63 ) { 
		if( lmin >= -13.2 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -13.2 ) { return new Prediction("AT", 6.35, 0.33); }
	}
	}
	}
	if( lmin >= -12.83 ) { 
	if( lslope >= -10521 ) { 
		if( lslope >= -4043 ) { return new Prediction("NAT", 4.23, 0.01); }
		if( lslope < -4043 ) { return new Prediction("AT", 46.57, 2.46); }
	}
	if( lslope < -10521 ) { 
	if( lslope < -15203.5 ) { 
	if( lmin >= -9.31 ) { 
		if( lmin < -8.15 ) { return new Prediction("NAT", 5.29, 0.01); }
	if( lmin >= -8.15 ) { 
		if( rmin >= -10.97 ) { return new Prediction("AT", 6.35, 0.33); }
		if( rmin < -10.97 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( lmin < -9.31 ) { return new Prediction("AT", 19.05, 1); }
	}
	if( lslope >= -15203.5 ) { 
	if( rmin >= -14.05 ) { 
		if( lmin < -5.76 ) { return new Prediction("NAT", 15.87, 0.04); }
		if( lmin >= -5.76 ) { return new Prediction("AT", 2.12, 0.11); }
	}
		if( rmin < -14.05 ) { return new Prediction("AT", 2.12, 0.11); }
	}
	}
	}
	}
	if( lmin >= -4.33 ) { 
		if( rmin >= -17.66 ) { return new Prediction("NAT", 20.11, 0.05); }
		if( rmin < -17.66 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( max < 1.24 ) { 
	if( rmin >= -16.13 ) { 
		if( max < 0.29 ) { return new Prediction("NAT", 78.32, 0.18); }
	if( max >= 0.29 ) { 
	if( lmin < -7.28 ) { 
	if( lmin >= -12.41 ) { 
		if( rmin < -9.41 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -9.41 ) { return new Prediction("AT", 2.12, 0.11); }
	}
		if( lmin < -12.41 ) { return new Prediction("NAT", 4.23, 0.01); }
	}
		if( lmin >= -7.28 ) { return new Prediction("NAT", 5.29, 0.01); }
	}
	}
		if( rmin < -16.13 ) { return new Prediction("AT", 8.47, 0.45); }
	}
	}
	}
return null;
}
private Prediction runTree25() {
	if( rslope >= -19848.5 ) { 
		if( max >= 15.55 ) { return new Prediction("AT", 40.57, 2.47); }
	if( max < 15.55 ) { 
	if( rmin < -5.24 ) { 
	if( max >= -0.77 ) { 
	if( lslope < -2471.99 ) { 
	if( rslope < -9199.5 ) { 
		if( lmin >= -5.03 ) { return new Prediction("NAT", 20.28, 0.05); }
	if( lmin < -5.03 ) { 
	if( max < 9.21 ) { 
		if( lslope < -18418 ) { return new Prediction("AT", 11.74, 0.72); }
	if( lslope >= -18418 ) { 
	if( rslope < -10563.5 ) { 
	if( rmin >= -9.38 ) { 
	if( lslope < -11214.5 ) { 
	if( rslope >= -16439.5 ) { 
		if( lslope < -14454.5 ) { return new Prediction("AT", 7.47, 0.46); }
	if( lslope >= -14454.5 ) { 
		if( rslope < -11891 ) { return new Prediction("NAT", 3.2, 0.01); }
		if( rslope >= -11891 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	}
		if( rslope < -16439.5 ) { return new Prediction("NAT", 4.27, 0.01); }
	}
		if( lslope >= -11214.5 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
		if( rmin < -9.38 ) { return new Prediction("NAT", 17.08, 0.04); }
	}
		if( rslope >= -10563.5 ) { return new Prediction("AT", 9.61, 0.59); }
	}
	}
		if( max >= 9.21 ) { return new Prediction("AT", 12.81, 0.78); }
	}
	}
	if( rslope >= -9199.5 ) { 
		if( rmin < -5.82 ) { return new Prediction("AT", 45.91, 2.8); }
	if( rmin >= -5.82 ) { 
		if( max >= 12.75 ) { return new Prediction("AT", 4.27, 0.26); }
		if( max < 12.75 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	}
		if( lslope >= -2471.99 ) { return new Prediction("NAT", 10.68, 0.03); }
	}
	if( max < -0.77 ) { 
		if( lmin < -13.17 ) { return new Prediction("AT", 3.2, 0.2); }
		if( lmin >= -13.17 ) { return new Prediction("NAT", 42.7, 0.1); }
	}
	}
	if( rmin >= -5.24 ) { 
	if( lslope >= -7143 ) { 
	if( max >= 13.63 ) { 
		if( lmin >= -5.91 ) { return new Prediction("NAT", 4.27, 0.01); }
		if( lmin < -5.91 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	if( max < 13.63 ) { 
	if( lslope < -5364.5 ) { 
		if( rslope < -5662.5 ) { return new Prediction("NAT", 19.22, 0.05); }
		if( rslope >= -5662.5 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 86.47, 0.2); }
	}
	}
	if( lslope < -7143 ) { 
	if( max < 7.05 ) { 
		if( lmin >= -17.85 ) { return new Prediction("NAT", 101.42, 0.24); }
	if( lmin < -17.85 ) { 
		if( rmin >= 1.19 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < 1.19 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( max >= 7.05 ) { 
		if( rmin >= 5.94 ) { return new Prediction("NAT", 19.22, 0.05); }
	if( rmin < 5.94 ) { 
		if( rmin < -3.84 ) { return new Prediction("AT", 6.41, 0.39); }
	if( rmin >= -3.84 ) { 
		if( lmin >= 5.38 ) { return new Prediction("NAT", 11.74, 0.03); }
	if( lmin < 5.38 ) { 
		if( max < 8.14 ) { return new Prediction("AT", 10.68, 0.65); }
	if( max >= 8.14 ) { 
	if( max < 10.53 ) { 
		if( rmin >= 3.92 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < 3.92 ) { return new Prediction("NAT", 8.54, 0.02); }
	}
	if( max >= 10.53 ) { 
	if( lmin < -1.13 ) { 
		if( lslope < -14566.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope >= -14566.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin >= -1.13 ) { return new Prediction("AT", 7.47, 0.46); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	}
	if( rslope < -19848.5 ) { 
	if( max < 17.33 ) { 
		if( max < 3.14 ) { return new Prediction("NAT", 171.88, 0.4); }
	if( max >= 3.14 ) { 
	if( rmin < 3.34 ) { 
	if( lslope >= -36747 ) { 
	if( lmin < 1.21 ) { 
	if( lmin < 0.63 ) { 
	if( rslope < -34672.5 ) { 
	if( lslope < -34959 ) { 
		if( lmin >= -5.66 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -5.66 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( lslope >= -34959 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	if( rslope >= -34672.5 ) { 
	if( rmin >= -2.21 ) { 
	if( max < 7.42 ) { 
		if( max < 3.31 ) { return new Prediction("AT", 1.07, 0.07); }
	if( max >= 3.31 ) { 
	if( lmin >= 0.1 ) { 
		if( lmin >= 0.51 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lmin < 0.51 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin < 0.1 ) { return new Prediction("NAT", 9.61, 0.02); }
	}
	}
	if( max >= 7.42 ) { 
		if( lslope >= -20851 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope < -20851 ) { return new Prediction("AT", 5.34, 0.33); }
	}
	}
		if( rmin < -2.21 ) { return new Prediction("NAT", 16.01, 0.04); }
	}
	}
		if( lmin >= 0.63 ) { return new Prediction("AT", 4.27, 0.26); }
	}
		if( lmin >= 1.21 ) { return new Prediction("NAT", 11.74, 0.03); }
	}
		if( lslope < -36747 ) { return new Prediction("NAT", 30.96, 0.07); }
	}
		if( rmin >= 3.34 ) { return new Prediction("NAT", 54.45, 0.13); }
	}
	}
		if( max >= 17.33 ) { return new Prediction("AT", 7.47, 0.46); }
	}
return null;
}
private Prediction runTree26() {
	if( rmin < -4.71 ) { 
	if( lmin >= -10.18 ) { 
	if( max >= 0.26 ) { 
		if( lmin >= -0.76 ) { return new Prediction("NAT", 20.44, 0.02); }
	if( lmin < -0.76 ) { 
	if( max >= 8.38 ) { 
		if( rslope >= -21136.5 ) { return new Prediction("AT", 20.44, 1.41); }
		if( rslope < -21136.5 ) { return new Prediction("NAT", 2.15, 0); }
	}
	if( max < 8.38 ) { 
	if( rslope < -10417 ) { 
	if( max < 5.26 ) { 
	if( lmin >= -7.9 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 6.45, 0.01); }
	if( lmin < -4.28 ) { 
		if( max >= 4.23 ) { return new Prediction("NAT", 6.45, 0.01); }
	if( max < 4.23 ) { 
		if( rmin < -9.18 ) { return new Prediction("NAT", 2.15, 0); }
	if( rmin >= -9.18 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 2.15, 0); }
		if( max >= 1.66 ) { return new Prediction("AT", 5.38, 0.37); }
	}
	}
	}
	}
		if( lmin < -7.9 ) { return new Prediction("NAT", 9.68, 0.01); }
	}
	if( max >= 5.26 ) { 
	if( lslope < -14518.5 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 1.08, 0); }
		if( rmin < -5.54 ) { return new Prediction("AT", 7.53, 0.52); }
	}
		if( lslope >= -14518.5 ) { return new Prediction("NAT", 5.38, 0.01); }
	}
	}
	if( rslope >= -10417 ) { 
		if( lmin >= -4.53 ) { return new Prediction("NAT", 7.53, 0.01); }
	if( lmin < -4.53 ) { 
		if( rslope >= -4982.5 ) { return new Prediction("NAT", 3.23, 0); }
		if( rslope < -4982.5 ) { return new Prediction("AT", 17.21, 1.19); }
	}
	}
	}
	}
	}
		if( max < 0.26 ) { return new Prediction("NAT", 70.99, 0.08); }
	}
	if( lmin < -10.18 ) { 
	if( lslope < -10474.5 ) { 
	if( max >= 6.79 ) { 
	if( lslope < -19048 ) { 
		if( rslope >= -26690 ) { return new Prediction("NAT", 2.15, 0); }
		if( rslope < -26690 ) { return new Prediction("AT", 1.08, 0.07); }
	}
		if( lslope >= -19048 ) { return new Prediction("AT", 23.66, 1.64); }
	}
	if( max < 6.79 ) { 
	if( max >= 1.33 ) { 
		if( rmin < -10.39 ) { return new Prediction("NAT", 7.53, 0.01); }
	if( rmin >= -10.39 ) { 
		if( rmin >= -7.54 ) { return new Prediction("AT", 4.3, 0.3); }
	if( rmin < -7.54 ) { 
		if( lslope < -13678 ) { return new Prediction("NAT", 1.08, 0); }
		if( lslope >= -13678 ) { return new Prediction("AT", 1.08, 0.07); }
	}
	}
	}
		if( max < 1.33 ) { return new Prediction("NAT", 12.91, 0.02); }
	}
	}
	if( lslope >= -10474.5 ) { 
		if( max < -6.57 ) { return new Prediction("NAT", 3.23, 0); }
	if( max >= -6.57 ) { 
	if( lmin >= -22.76 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 48.4, 3.35); }
	if( lslope >= -3296 ) { 
		if( max >= 7.32 ) { return new Prediction("AT", 3.23, 0.22); }
		if( max < 7.32 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	}
	if( rmin >= -4.71 ) { 
	if( max >= 10.55 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 25.82, 0.03); }
	if( lmin < 3.6 ) { 
	if( rslope >= -21351.5 ) { 
	if( max < 11.47 ) { 
		if( lmin < -1.13 ) { return new Prediction("NAT", 7.53, 0.01); }
	if( lmin >= -1.13 ) { 
		if( max < 11.03 ) { return new Prediction("AT", 12.91, 0.89); }
		if( max >= 11.03 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	if( max >= 11.47 ) { 
		if( rmin < 1.49 ) { return new Prediction("AT", 32.27, 2.23); }
	if( rmin >= 1.49 ) { 
	if( rmin >= 1.98 ) { 
		if( rslope >= -18350 ) { return new Prediction("AT", 9.68, 0.67); }
		if( rslope < -18350 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( rmin < 1.98 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	if( rslope < -21351.5 ) { 
		if( lmin >= -1.7 ) { return new Prediction("NAT", 5.38, 0.01); }
	if( lmin < -1.7 ) { 
		if( rmin < -1.25 ) { return new Prediction("AT", 3.23, 0.22); }
		if( rmin >= -1.25 ) { return new Prediction("NAT", 3.23, 0); }
	}
	}
	}
	}
	if( max < 10.55 ) { 
	if( lslope < -5364.5 ) { 
	if( max >= 7.32 ) { 
		if( max < 7.63 ) { return new Prediction("AT", 10.76, 0.74); }
	if( max >= 7.63 ) { 
	if( lmin >= -5.58 ) { 
		if( rslope < -11270 ) { return new Prediction("NAT", 46.25, 0.05); }
	if( rslope >= -11270 ) { 
	if( max < 9.44 ) { 
		if( lslope >= -8522 ) { return new Prediction("NAT", 2.15, 0); }
		if( lslope < -8522 ) { return new Prediction("AT", 3.23, 0.22); }
	}
		if( max >= 9.44 ) { return new Prediction("NAT", 10.76, 0.01); }
	}
	}
	if( lmin < -5.58 ) { 
		if( rmin >= 7.71 ) { return new Prediction("NAT", 3.23, 0); }
		if( rmin < 7.71 ) { return new Prediction("AT", 3.23, 0.22); }
	}
	}
	}
	if( max < 7.32 ) { 
	if( lmin >= 0.39 ) { 
	if( lmin >= 0.41 ) { 
	if( rmin < 0.76 ) { 
		if( rmin < -0.06 ) { return new Prediction("NAT", 37.65, 0.04); }
	if( rmin >= -0.06 ) { 
	if( max >= 3.27 ) { 
		if( lmin < 1.43 ) { return new Prediction("AT", 4.3, 0.3); }
	if( lmin >= 1.43 ) { 
		if( max >= 5.95 ) { return new Prediction("AT", 1.08, 0.07); }
		if( max < 5.95 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
		if( max < 3.27 ) { return new Prediction("NAT", 3.23, 0); }
	}
	}
		if( rmin >= 0.76 ) { return new Prediction("NAT", 41.95, 0.05); }
	}
		if( lmin < 0.41 ) { return new Prediction("AT", 1.08, 0.07); }
	}
	if( lmin < 0.39 ) { 
	if( lslope >= -9655 ) { 
		if( max < -0.42 ) { return new Prediction("AT", 1.08, 0.07); }
		if( max >= -0.42 ) { return new Prediction("NAT", 22.59, 0.03); }
	}
		if( lslope < -9655 ) { return new Prediction("NAT", 168.88, 0.2); }
	}
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 87.13, 0.1); }
	}
	}
return null;
}
private Prediction runTree27() {
	if( max < 13.14 ) { 
	if( lmin < -9.17 ) { 
	if( lslope >= -20377 ) { 
		if( lslope >= -2473.5 ) { return new Prediction("NAT", 6.42, 0.01); }
	if( lslope < -2473.5 ) { 
	if( rslope >= -10526.5 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 5.35, 0.01); }
	if( max >= -4.9 ) { 
	if( lmin < -17.66 ) { 
		if( lmin >= -18.18 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin < -18.18 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( lmin >= -17.66 ) { return new Prediction("AT", 42.81, 2.76); }
	}
	}
	if( rslope < -10526.5 ) { 
	if( lslope >= -14836.5 ) { 
		if( lmin < -18.26 ) { return new Prediction("AT", 7.49, 0.48); }
	if( lmin >= -18.26 ) { 
		if( max < 6.64 ) { return new Prediction("NAT", 16.05, 0.02); }
		if( max >= 6.64 ) { return new Prediction("AT", 6.42, 0.41); }
	}
	}
	if( lslope < -14836.5 ) { 
	if( max < 6.87 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 7.49, 0.01); }
	if( max < 2.61 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 10.7, 0.69); }
	}
	}
		if( max >= 6.87 ) { return new Prediction("AT", 23.55, 1.52); }
	}
	}
	}
	}
		if( lslope < -20377 ) { return new Prediction("NAT", 19.26, 0.02); }
	}
	if( lmin >= -9.17 ) { 
	if( max < 3.17 ) { 
		if( lmin >= -8.74 ) { return new Prediction("NAT", 266.5, 0.31); }
	if( lmin < -8.74 ) { 
		if( lmin < -8.94 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin >= -8.94 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( max >= 3.17 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 105.96, 0.12); }
	if( lmin < 3.98 ) { 
	if( lmin >= 0.24 ) { 
	if( lslope >= -30859.5 ) { 
		if( lslope >= -5490.5 ) { return new Prediction("NAT", 7.49, 0.01); }
	if( lslope < -5490.5 ) { 
	if( rmin < 5.98 ) { 
	if( rmin < -0.38 ) { 
		if( max >= 7.53 ) { return new Prediction("AT", 5.35, 0.35); }
		if( max < 7.53 ) { return new Prediction("NAT", 14.98, 0.02); }
	}
	if( rmin >= -0.38 ) { 
		if( rmin < 0.55 ) { return new Prediction("AT", 11.77, 0.76); }
	if( rmin >= 0.55 ) { 
	if( lmin < 2.15 ) { 
	if( lmin < 0.7 ) { 
		if( lmin < 0.44 ) { return new Prediction("NAT", 3.21, 0); }
		if( lmin >= 0.44 ) { return new Prediction("AT", 4.28, 0.28); }
	}
		if( lmin >= 0.7 ) { return new Prediction("NAT", 10.7, 0.01); }
	}
	if( lmin >= 2.15 ) { 
		if( rslope < -15978.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -15978.5 ) { return new Prediction("AT", 7.49, 0.48); }
	}
	}
	}
	}
		if( rmin >= 5.98 ) { return new Prediction("NAT", 5.35, 0.01); }
	}
	}
		if( lslope < -30859.5 ) { return new Prediction("NAT", 12.84, 0.02); }
	}
	if( lmin < 0.24 ) { 
	if( lmin < -4.62 ) { 
	if( rmin < -4.08 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 8.56, 0.01); }
	if( rslope >= -34924 ) { 
	if( lslope >= -14424.5 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 4.28, 0.01); }
	if( rslope >= -10417 ) { 
		if( lmin >= -5.72 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -5.72 ) { return new Prediction("AT", 4.28, 0.28); }
	}
	}
	if( lslope < -14424.5 ) { 
	if( rmin >= -5.54 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin < -5.54 ) { return new Prediction("AT", 6.42, 0.41); }
	}
	}
	}
	if( rmin >= -4.08 ) { 
		if( rmin < 2.75 ) { return new Prediction("NAT", 20.34, 0.02); }
	if( rmin >= 2.75 ) { 
		if( lmin < -4.63 ) { return new Prediction("NAT", 7.49, 0.01); }
		if( lmin >= -4.63 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( lmin >= -4.62 ) { 
		if( lmin < -2.59 ) { return new Prediction("NAT", 51.37, 0.06); }
	if( lmin >= -2.59 ) { 
	if( max >= 7.29 ) { 
		if( lslope >= -7698.5 ) { return new Prediction("NAT", 10.7, 0.01); }
	if( lslope < -7698.5 ) { 
		if( lmin >= -0.63 ) { return new Prediction("NAT", 4.28, 0.01); }
	if( lmin < -0.63 ) { 
		if( lmin >= -0.8 ) { return new Prediction("AT", 2.14, 0.14); }
	if( lmin < -0.8 ) { 
		if( lmin < -2.51 ) { return new Prediction("AT", 1.07, 0.07); }
	if( lmin >= -2.51 ) { 
		if( rmin >= 4.16 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < 4.16 ) { return new Prediction("NAT", 7.49, 0.01); }
	}
	}
	}
	}
	}
		if( max < 7.29 ) { return new Prediction("NAT", 26.76, 0.03); }
	}
	}
	}
	}
	}
	}
	}
	if( max >= 13.14 ) { 
	if( lmin < -0.73 ) { 
	if( lslope < -19538 ) { 
		if( lmin < -13.48 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= -13.48 ) { 
	if( max < 14.48 ) { 
		if( lslope >= -22326 ) { return new Prediction("AT", 3.21, 0.21); }
		if( lslope < -22326 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max >= 14.48 ) { return new Prediction("AT", 5.35, 0.35); }
	}
	}
		if( lslope >= -19538 ) { return new Prediction("AT", 61.01, 3.93); }
	}
	if( lmin >= -0.73 ) { 
		if( max >= 21.62 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 21.62 ) { return new Prediction("NAT", 8.56, 0.01); }
	}
	}
return null;
}
private Prediction runTree28() {
	if( lmin >= -8.96 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 126.41, 0); }
	if( lslope < -5395 ) { 
	if( max < 10.9 ) { 
	if( lslope >= -35061.5 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 144.47, 0); }
	if( max >= 1.66 ) { 
	if( lmin >= -4.44 ) { 
	if( lmin >= -0.93 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 47.8, 0); }
	if( lmin < 3.7 ) { 
	if( max >= 7.32 ) { 
	if( rmin < 3.18 ) { 
	if( rslope >= -15847 ) { 
	if( rmin < 1.78 ) { 
		if( max < 7.42 ) { return new Prediction("AT", 1.06, 0.06); }
	if( max >= 7.42 ) { 
		if( lmin < 0.35 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= 0.35 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
		if( rmin >= 1.78 ) { return new Prediction("AT", 8.5, 0.5); }
	}
		if( rslope < -15847 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( rmin >= 3.18 ) { 
		if( max < 10.44 ) { return new Prediction("NAT", 8.5, 0); }
		if( max >= 10.44 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( max < 7.32 ) { 
		if( rslope >= -26857.5 ) { return new Prediction("NAT", 47.8, 0); }
	if( rslope < -26857.5 ) { 
		if( rmin >= 0.41 ) { return new Prediction("NAT", 14.87, 0); }
	if( rmin < 0.41 ) { 
		if( rmin < -0.92 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -0.92 ) { return new Prediction("AT", 8.5, 0.5); }
	}
	}
	}
	}
	}
		if( lmin < -0.93 ) { return new Prediction("NAT", 47.8, 0); }
	}
	if( lmin < -4.44 ) { 
	if( max < 9.93 ) { 
	if( max < 8.66 ) { 
	if( rmin >= -8.58 ) { 
	if( rmin >= -5.54 ) { 
		if( rslope >= -20923 ) { return new Prediction("NAT", 10.62, 0); }
	if( rslope < -20923 ) { 
		if( lmin >= -4.64 ) { return new Prediction("AT", 2.12, 0.12); }
	if( lmin < -4.64 ) { 
		if( lmin >= -5.21 ) { return new Prediction("NAT", 1.06, 0); }
	if( lmin < -5.21 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	if( rmin < -5.54 ) { 
		if( rmin >= -7.32 ) { return new Prediction("AT", 12.75, 0.75); }
	if( rmin < -7.32 ) { 
	if( lmin < -6.13 ) { 
		if( lmin >= -7.35 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin < -7.35 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin >= -6.13 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	}
	}
		if( rmin < -8.58 ) { return new Prediction("NAT", 8.5, 0); }
	}
		if( max >= 8.66 ) { return new Prediction("AT", 4.25, 0.25); }
	}
		if( max >= 9.93 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
	}
		if( lslope < -35061.5 ) { return new Prediction("NAT", 109.41, 0); }
	}
	if( max >= 10.9 ) { 
	if( rslope >= -19255.5 ) { 
		if( lmin >= 3.58 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < 3.58 ) { return new Prediction("AT", 22.31, 1.31); }
	}
	if( rslope < -19255.5 ) { 
		if( max >= 12.96 ) { return new Prediction("AT", 6.37, 0.37); }
	if( max < 12.96 ) { 
		if( max >= 11.33 ) { return new Prediction("NAT", 12.75, 0); }
		if( max < 11.33 ) { return new Prediction("AT", 4.25, 0.25); }
	}
	}
	}
	}
	}
	if( lmin < -8.96 ) { 
	if( rslope >= -19140 ) { 
	if( lslope < -10444 ) { 
	if( rmin < -8.75 ) { 
	if( max >= 6.15 ) { 
		if( lmin >= -11.28 ) { return new Prediction("AT", 3.19, 0.19); }
	if( lmin < -11.28 ) { 
		if( rmin < -13.33 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin >= -13.33 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( max < 6.15 ) { return new Prediction("NAT", 20.18, 0); }
	}
	if( rmin >= -8.75 ) { 
	if( max < 9.21 ) { 
	if( lmin < -11.82 ) { 
	if( lmin >= -16.01 ) { 
		if( max < 1.17 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 1.17 ) { return new Prediction("AT", 4.25, 0.25); }
	}
		if( lmin < -16.01 ) { return new Prediction("NAT", 3.19, 0); }
	}
		if( lmin >= -11.82 ) { return new Prediction("NAT", 6.37, 0); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 33.99, 1.99); }
	}
	}
	if( lslope >= -10444 ) { 
	if( max >= -5.41 ) { 
	if( lmin >= -22.76 ) { 
		if( lslope < -2447.99 ) { return new Prediction("AT", 64.8, 3.8); }
	if( lslope >= -2447.99 ) { 
		if( rmin >= -6.62 ) { return new Prediction("AT", 4.25, 0.25); }
		if( rmin < -6.62 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 9.56, 0); }
	}
	}
	if( rslope < -19140 ) { 
		if( lmin >= -9.39 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lmin < -9.39 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 24.43, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
return null;
}
private Prediction runTree29() {
	if( max >= 14.81 ) { 
	if( max < 17.11 ) { 
		if( rmin >= 0.13 ) { return new Prediction("NAT", 1.07, 0); }
	if( rmin < 0.13 ) { 
		if( max < 16.48 ) { return new Prediction("AT", 10.72, 0.7); }
		if( max >= 16.48 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( max >= 17.11 ) { return new Prediction("AT", 40.72, 2.67); }
	}
	if( max < 14.81 ) { 
	if( lmin < -7.72 ) { 
	if( max < 1.21 ) { 
	if( rslope >= -10526.5 ) { 
		if( rslope >= -6585.5 ) { return new Prediction("NAT", 15, 0.02); }
		if( rslope < -6585.5 ) { return new Prediction("AT", 9.64, 0.63); }
	}
		if( rslope < -10526.5 ) { return new Prediction("NAT", 37.51, 0.04); }
	}
	if( max >= 1.21 ) { 
		if( lmin < -19.72 ) { return new Prediction("NAT", 8.57, 0.01); }
	if( lmin >= -19.72 ) { 
	if( lslope < -11088.5 ) { 
		if( lslope < -36123.5 ) { return new Prediction("NAT", 6.43, 0.01); }
	if( lslope >= -36123.5 ) { 
	if( max < 5.26 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 13.93, 0.02); }
	if( max < 2.61 ) { 
		if( lslope >= -16615 ) { return new Prediction("NAT", 2.14, 0); }
	if( lslope < -16615 ) { 
		if( lslope >= -22458.5 ) { return new Prediction("AT", 8.57, 0.56); }
		if( lslope < -22458.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( max >= 5.26 ) { 
	if( rmin >= 7.86 ) { 
		if( lmin < -8.78 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -8.78 ) { return new Prediction("NAT", 3.21, 0); }
	}
	if( rmin < 7.86 ) { 
		if( max >= 12.85 ) { return new Prediction("NAT", 1.07, 0); }
	if( max < 12.85 ) { 
	if( max < 9.21 ) { 
	if( max < 9.18 ) { 
	if( lslope >= -14173 ) { 
		if( lmin < -14.62 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -14.62 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope < -14173 ) { return new Prediction("AT", 16.07, 1.06); }
	}
		if( max >= 9.18 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 21.43, 1.41); }
	}
	}
	}
	}
	}
	if( lslope >= -11088.5 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 41.79, 2.74); }
	if( max >= 8.49 ) { 
		if( lmin >= -15.84 ) { return new Prediction("AT", 3.21, 0.21); }
		if( lmin < -15.84 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	if( lmin >= -7.72 ) { 
	if( rslope >= -21351.5 ) { 
	if( max < 10.58 ) { 
	if( max >= 1.58 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 64.3, 0.08); }
	if( lslope < -5358 ) { 
	if( lslope >= -6005.5 ) { 
		if( rmin < -0.1 ) { return new Prediction("AT", 5.36, 0.35); }
	if( rmin >= -0.1 ) { 
		if( rmin >= 2.37 ) { return new Prediction("AT", 2.14, 0.14); }
		if( rmin < 2.37 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( lslope < -6005.5 ) { 
		if( lmin >= 3.99 ) { return new Prediction("NAT", 25.72, 0.03); }
	if( lmin < 3.99 ) { 
	if( rmin < -5.82 ) { 
		if( rslope < -18724 ) { return new Prediction("AT", 4.29, 0.28); }
	if( rslope >= -18724 ) { 
	if( lmin >= -4.93 ) { 
		if( max >= 7.38 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 7.38 ) { return new Prediction("NAT", 10.72, 0.01); }
	}
	if( lmin < -4.93 ) { 
	if( rslope < -10417 ) { 
		if( max >= 4.16 ) { return new Prediction("NAT", 7.5, 0.01); }
		if( max < 4.16 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 5.36, 0.35); }
	}
	}
	}
	if( rmin >= -5.82 ) { 
	if( lmin >= -0.85 ) { 
		if( lmin < -0.6 ) { return new Prediction("AT", 6.43, 0.42); }
	if( lmin >= -0.6 ) { 
		if( lmin >= 3.42 ) { return new Prediction("AT", 3.21, 0.21); }
	if( lmin < 3.42 ) { 
		if( max < 7.26 ) { return new Prediction("NAT", 25.72, 0.03); }
	if( max >= 7.26 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 7.5, 0.01); }
		if( max < 7.59 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	}
		if( lmin < -0.85 ) { return new Prediction("NAT", 36.43, 0.04); }
	}
	}
	}
	}
	}
		if( max < 1.58 ) { return new Prediction("NAT", 95.37, 0.11); }
	}
	if( max >= 10.58 ) { 
		if( lslope >= -6610.5 ) { return new Prediction("NAT", 18.22, 0.02); }
	if( lslope < -6610.5 ) { 
		if( max >= 13.82 ) { return new Prediction("NAT", 3.21, 0); }
	if( max < 13.82 ) { 
	if( lmin < 5.12 ) { 
	if( lslope >= -18985.5 ) { 
	if( max >= 11.18 ) { 
		if( rmin >= 1.82 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < 1.82 ) { return new Prediction("AT", 11.79, 0.77); }
	}
		if( max < 11.18 ) { return new Prediction("AT", 17.15, 1.13); }
	}
	if( lslope < -18985.5 ) { 
		if( lmin >= -3.86 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -3.86 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( lmin >= 5.12 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	}
	}
	if( rslope < -21351.5 ) { 
	if( max >= 3.5 ) { 
	if( max >= 3.56 ) { 
		if( lmin >= 1.13 ) { return new Prediction("NAT", 49.29, 0.06); }
	if( lmin < 1.13 ) { 
		if( rmin >= 1.29 ) { return new Prediction("NAT", 26.79, 0.03); }
	if( rmin < 1.29 ) { 
	if( lmin < 0.09 ) { 
	if( max >= 8.38 ) { 
	if( lmin < -4.94 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin >= -4.94 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max < 8.38 ) { return new Prediction("NAT", 20.36, 0.02); }
	}
	if( lmin >= 0.09 ) { 
		if( rmin >= -1.62 ) { return new Prediction("AT", 4.29, 0.28); }
		if( rmin < -1.62 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	}
	}
		if( max < 3.56 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( max < 3.5 ) { return new Prediction("NAT", 132.88, 0.16); }
	}
	}
	}
return null;
}
private Prediction runTree30() {
	if( lmin < -7.72 ) { 
	if( lslope < -19947.5 ) { 
		if( max < 5.41 ) { return new Prediction("NAT", 27.03, 0.03); }
	if( max >= 5.41 ) { 
		if( rmin < 0.14 ) { return new Prediction("AT", 7.57, 0.56); }
		if( rmin >= 0.14 ) { return new Prediction("NAT", 5.41, 0.01); }
	}
	}
	if( lslope >= -19947.5 ) { 
	if( max >= 5.19 ) { 
	if( lmin >= -23.97 ) { 
	if( max < 9.21 ) { 
	if( rmin >= -7.31 ) { 
		if( lmin >= -11.99 ) { return new Prediction("NAT", 2.16, 0); }
		if( lmin < -11.99 ) { return new Prediction("AT", 2.16, 0.16); }
	}
		if( rmin < -7.31 ) { return new Prediction("AT", 19.46, 1.44); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 67.03, 4.95); }
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 1.08, 0); }
	}
	if( max < 5.19 ) { 
	if( lslope < -10729.5 ) { 
	if( lslope < -15114.5 ) { 
	if( max < 2.45 ) { 
	if( rmin < -4.31 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 4.32, 0.32); }
	}
		if( rmin >= -4.31 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( max >= 2.45 ) { return new Prediction("NAT", 5.41, 0.01); }
	}
		if( lslope >= -15114.5 ) { return new Prediction("NAT", 19.46, 0.02); }
	}
	if( lslope >= -10729.5 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 8.65, 0.01); }
	if( lslope < -4149.5 ) { 
		if( max >= -3.59 ) { return new Prediction("AT", 32.43, 2.4); }
	if( max < -3.59 ) { 
		if( max >= -3.95 ) { return new Prediction("NAT", 1.08, 0); }
		if( max < -3.95 ) { return new Prediction("AT", 3.24, 0.24); }
	}
	}
	}
	}
	}
	}
	if( lmin >= -7.72 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 144.87, 0.17); }
	if( lslope < -5785.5 ) { 
	if( max < 12.91 ) { 
	if( max < 3.17 ) { 
		if( lslope < -5941.5 ) { return new Prediction("NAT", 237.85, 0.28); }
		if( lslope >= -5941.5 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	if( max >= 3.17 ) { 
	if( rslope >= -15847 ) { 
	if( rmin < 2.4 ) { 
	if( rmin >= -4.48 ) { 
	if( lslope < -14775.5 ) { 
		if( max < 6.1 ) { return new Prediction("NAT", 2.16, 0); }
		if( max >= 6.1 ) { return new Prediction("AT", 2.16, 0.16); }
	}
		if( lslope >= -14775.5 ) { return new Prediction("NAT", 37.84, 0.04); }
	}
	if( rmin < -4.48 ) { 
	if( lslope >= -11147 ) { 
	if( lmin < -5.93 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 2.16, 0); }
		if( rslope >= -10417 ) { return new Prediction("AT", 4.32, 0.32); }
	}
		if( lmin >= -5.93 ) { return new Prediction("NAT", 9.73, 0.01); }
	}
	if( lslope < -11147 ) { 
		if( rmin >= -7.27 ) { return new Prediction("AT", 3.24, 0.24); }
	if( rmin < -7.27 ) { 
		if( lmin < -1.84 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -1.84 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
	if( rmin >= 2.4 ) { 
	if( rmin >= 5.63 ) { 
		if( max >= 7.97 ) { return new Prediction("NAT", 11.89, 0.01); }
		if( max < 7.97 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	if( rmin < 5.63 ) { 
		if( max < 6.85 ) { return new Prediction("NAT", 4.32, 0.01); }
	if( max >= 6.85 ) { 
		if( max >= 11.18 ) { return new Prediction("NAT", 1.08, 0); }
		if( max < 11.18 ) { return new Prediction("AT", 19.46, 1.44); }
	}
	}
	}
	}
	if( rslope < -15847 ) { 
	if( max >= 4.14 ) { 
	if( rmin < 0.2 ) { 
		if( rmin >= -0.09 ) { return new Prediction("AT", 1.08, 0.08); }
	if( rmin < -0.09 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 35.68, 0.04); }
	if( max >= 11.09 ) { 
		if( lmin >= -0.96 ) { return new Prediction("NAT", 4.32, 0.01); }
		if( lmin < -0.96 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
		if( rmin >= 0.2 ) { return new Prediction("NAT", 63.79, 0.07); }
	}
	if( max < 4.14 ) { 
	if( max < 4.11 ) { 
	if( lslope >= -30655 ) { 
		if( max >= 3.56 ) { return new Prediction("NAT", 5.41, 0.01); }
	if( max < 3.56 ) { 
	if( lmin >= -3.78 ) { 
		if( max >= 3.49 ) { return new Prediction("AT", 1.08, 0.08); }
		if( max < 3.49 ) { return new Prediction("NAT", 2.16, 0); }
	}
		if( lmin < -3.78 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lslope < -30655 ) { return new Prediction("NAT", 12.97, 0.02); }
	}
		if( max >= 4.11 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
	}
	}
	if( max >= 12.91 ) { 
		if( lslope >= -23379.5 ) { return new Prediction("AT", 20.54, 1.52); }
	if( lslope < -23379.5 ) { 
		if( lslope < -30509.5 ) { return new Prediction("AT", 4.32, 0.32); }
		if( lslope >= -30509.5 ) { return new Prediction("NAT", 3.24, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree31() {
	if( max >= 14.89 ) { 
	if( max < 17.11 ) { 
	if( max < 16.48 ) { 
		if( lmin < -1.45 ) { return new Prediction("AT", 10.77, 0.76); }
		if( lmin >= -1.45 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( max >= 16.48 ) { return new Prediction("NAT", 3.23, 0); }
	}
		if( max >= 17.11 ) { return new Prediction("AT", 42, 2.95); }
	}
	if( max < 14.89 ) { 
	if( lmin < -7.72 ) { 
	if( max >= 5.34 ) { 
	if( lslope < -16970 ) { 
	if( rslope < -17354 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 2.15, 0); }
	if( rmin < -5.54 ) { 
		if( rslope >= -21217.5 ) { return new Prediction("AT", 9.69, 0.68); }
	if( rslope < -21217.5 ) { 
		if( rmin >= -6.33 ) { return new Prediction("AT", 2.15, 0.15); }
		if( rmin < -6.33 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
		if( rslope >= -17354 ) { return new Prediction("NAT", 4.31, 0.01); }
	}
	if( lslope >= -16970 ) { 
	if( max < 7.92 ) { 
		if( max < 7.69 ) { return new Prediction("AT", 8.62, 0.61); }
		if( max >= 7.69 ) { return new Prediction("NAT", 4.31, 0.01); }
	}
		if( max >= 7.92 ) { return new Prediction("AT", 38.77, 2.73); }
	}
	}
	if( max < 5.34 ) { 
	if( lslope < -10474.5 ) { 
	if( rmin >= -6.63 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 15.08, 0.02); }
	if( lmin >= -12.19 ) { 
	if( rmin < -4.83 ) { 
		if( lmin < -9.96 ) { return new Prediction("AT", 6.46, 0.45); }
	if( lmin >= -9.96 ) { 
		if( lmin >= -7.9 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lmin < -7.9 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
		if( rmin >= -4.83 ) { return new Prediction("NAT", 7.54, 0.01); }
	}
	}
		if( rmin < -6.63 ) { return new Prediction("NAT", 26.93, 0.03); }
	}
	if( lslope >= -10474.5 ) { 
		if( max < -5.53 ) { return new Prediction("NAT", 10.77, 0.01); }
	if( max >= -5.53 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 28, 1.97); }
		if( lslope >= -3296 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	}
	if( lmin >= -7.72 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 259.56, 0.3); }
	if( max >= 3.17 ) { 
	if( lmin < 3.47 ) { 
		if( rslope >= -5356.5 ) { return new Prediction("NAT", 42, 0.05); }
	if( rslope < -5356.5 ) { 
	if( lslope >= -33031.5 ) { 
	if( rmin < -5.82 ) { 
	if( lslope >= -21452 ) { 
	if( max < 5.48 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 3.23, 0); }
	if( lmin < -4.28 ) { 
		if( lmin < -5.97 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -5.97 ) { return new Prediction("AT", 6.46, 0.45); }
	}
	}
	if( max >= 5.48 ) { 
		if( lmin < -4.18 ) { return new Prediction("AT", 14, 0.98); }
	if( lmin >= -4.18 ) { 
		if( rmin >= -9.74 ) { return new Prediction("NAT", 1.08, 0); }
		if( rmin < -9.74 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
		if( lslope < -21452 ) { return new Prediction("NAT", 2.15, 0); }
	}
	if( rmin >= -5.82 ) { 
	if( lmin < -1.13 ) { 
	if( max < 12.57 ) { 
	if( max < 3.31 ) { 
		if( rmin < 1.14 ) { return new Prediction("NAT", 2.15, 0); }
		if( rmin >= 1.14 ) { return new Prediction("AT", 4.31, 0.3); }
	}
	if( max >= 3.31 ) { 
	if( lslope >= -32607 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 50.62, 0.06); }
	if( max >= 11.09 ) { 
		if( max < 11.25 ) { return new Prediction("AT", 1.08, 0.08); }
		if( max >= 11.25 ) { return new Prediction("NAT", 6.46, 0.01); }
	}
	}
		if( lslope < -32607 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( max >= 12.57 ) { return new Prediction("AT", 3.23, 0.23); }
	}
	if( lmin >= -1.13 ) { 
	if( max >= 7.32 ) { 
	if( lslope < -15022 ) { 
	if( lmin < 0.5 ) { 
		if( rmin < -0.62 ) { return new Prediction("AT", 2.15, 0.15); }
	if( rmin >= -0.62 ) { 
		if( lslope < -18534.5 ) { return new Prediction("NAT", 3.23, 0); }
		if( lslope >= -18534.5 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lmin >= 0.5 ) { return new Prediction("NAT", 6.46, 0.01); }
	}
	if( lslope >= -15022 ) { 
		if( rmin < -4.6 ) { return new Prediction("NAT", 2.15, 0); }
		if( rmin >= -4.6 ) { return new Prediction("AT", 18.31, 1.29); }
	}
	}
	if( max < 7.32 ) { 
	if( lslope < -25680.5 ) { 
		if( lmin < 1.21 ) { return new Prediction("AT", 10.77, 0.76); }
		if( lmin >= 1.21 ) { return new Prediction("NAT", 7.54, 0.01); }
	}
		if( lslope >= -25680.5 ) { return new Prediction("NAT", 16.16, 0.02); }
	}
	}
	}
	}
		if( lslope < -33031.5 ) { return new Prediction("NAT", 30.16, 0.04); }
	}
	}
	if( lmin >= 3.47 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 107.7, 0.13); }
	if( lmin < 3.98 ) { 
	if( rmin >= 4.08 ) { 
		if( lmin >= 3.85 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lmin < 3.85 ) { return new Prediction("NAT", 3.23, 0); }
	}
		if( rmin < 4.08 ) { return new Prediction("NAT", 16.16, 0.02); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree32() {
	if( lmin < -9.17 ) { 
	if( rslope >= -19885 ) { 
	if( max < 9.21 ) { 
	if( rslope < -11146 ) { 
		if( lslope >= -14836.5 ) { return new Prediction("NAT", 20.39, 0.02); }
	if( lslope < -14836.5 ) { 
		if( max < 2.72 ) { return new Prediction("AT", 7.51, 0.5); }
	if( max >= 2.72 ) { 
	if( rslope < -15574.5 ) { 
		if( lmin >= -16.31 ) { return new Prediction("NAT", 9.66, 0.01); }
	if( lmin < -16.31 ) { 
		if( rmin >= -4.93 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < -4.93 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rslope >= -15574.5 ) { return new Prediction("AT", 4.29, 0.29); }
	}
	}
	}
	if( rslope >= -11146 ) { 
	if( lslope >= -4851.5 ) { 
		if( max < -2.15 ) { return new Prediction("NAT", 9.66, 0.01); }
		if( max >= -2.15 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( lslope < -4851.5 ) { return new Prediction("AT", 38.63, 2.58); }
	}
	}
	if( max >= 9.21 ) { 
	if( rmin < -14.95 ) { 
		if( rmin < -16.08 ) { return new Prediction("AT", 4.29, 0.29); }
		if( rmin >= -16.08 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin >= -14.95 ) { return new Prediction("AT", 55.79, 3.73); }
	}
	}
	if( rslope < -19885 ) { 
		if( lmin >= -11.48 ) { return new Prediction("NAT", 24.68, 0.03); }
	if( lmin < -11.48 ) { 
		if( lmin < -11.87 ) { return new Prediction("NAT", 3.22, 0); }
		if( lmin >= -11.87 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( lmin >= -9.17 ) { 
	if( rslope < -5914 ) { 
	if( max < 12.81 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 108.37, 0.13); }
	if( lslope >= -34743.5 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 154.51, 0.18); }
	if( max >= 1.66 ) { 
	if( rmin >= -4.48 ) { 
	if( rmin < -0.06 ) { 
	if( lslope < -22986.5 ) { 
		if( lslope >= -23755 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -23755 ) { return new Prediction("NAT", 19.31, 0.02); }
	}
		if( lslope >= -22986.5 ) { return new Prediction("NAT", 46.14, 0.05); }
	}
	if( rmin >= -0.06 ) { 
	if( lmin >= -1.07 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 36.48, 0.04); }
	if( lmin < 3.69 ) { 
	if( max >= 3.5 ) { 
	if( rmin >= 0.36 ) { 
	if( max >= 6.71 ) { 
	if( rslope < -15430 ) { 
		if( rmin >= 0.79 ) { return new Prediction("NAT", 8.58, 0.01); }
	if( rmin < 0.79 ) { 
		if( max < 11.13 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max >= 11.13 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( rslope >= -15430 ) { return new Prediction("AT", 19.31, 1.29); }
	}
	if( max < 6.71 ) { 
	if( max < 4.3 ) { 
		if( lmin < 1.15 ) { return new Prediction("AT", 4.29, 0.29); }
		if( lmin >= 1.15 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( max >= 4.3 ) { return new Prediction("NAT", 15.02, 0.02); }
	}
	}
		if( rmin < 0.36 ) { return new Prediction("AT", 8.58, 0.57); }
	}
		if( max < 3.5 ) { return new Prediction("NAT", 9.66, 0.01); }
	}
	}
		if( lmin < -1.07 ) { return new Prediction("NAT", 39.7, 0.05); }
	}
	}
	if( rmin < -4.48 ) { 
	if( lmin < 1.76 ) { 
	if( rmin >= -11.15 ) { 
	if( lslope >= -9173.5 ) { 
		if( lmin < -2.34 ) { return new Prediction("AT", 7.51, 0.5); }
		if( lmin >= -2.34 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope < -9173.5 ) { 
	if( lslope < -9949 ) { 
	if( max >= 5.01 ) { 
	if( max >= 9.95 ) { 
		if( max >= 11.31 ) { return new Prediction("AT", 3.22, 0.22); }
		if( max < 11.31 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max < 9.95 ) { return new Prediction("AT", 5.36, 0.36); }
	}
	if( max < 5.01 ) { 
	if( lmin < -4.27 ) { 
		if( lmin >= -7.9 ) { return new Prediction("AT", 5.36, 0.36); }
		if( lmin < -7.9 ) { return new Prediction("NAT", 3.22, 0); }
	}
		if( lmin >= -4.27 ) { return new Prediction("NAT", 5.36, 0.01); }
	}
	}
		if( lslope >= -9949 ) { return new Prediction("NAT", 3.22, 0); }
	}
	}
		if( rmin < -11.15 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( lmin >= 1.76 ) { return new Prediction("NAT", 9.66, 0.01); }
	}
	}
	}
	}
	if( max >= 12.81 ) { 
		if( lmin < 1.46 ) { return new Prediction("AT", 26.82, 1.79); }
		if( lmin >= 1.46 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
		if( rslope >= -5914 ) { return new Prediction("NAT", 112.66, 0.13); }
	}
return null;
}
private Prediction runTree33() {
	if( rmin < -7.22 ) { 
	if( rslope >= -20195.5 ) { 
	if( max >= -0.77 ) { 
	if( rslope < -10879.5 ) { 
	if( max >= 6.36 ) { 
		if( lslope < -14212 ) { return new Prediction("AT", 22.48, 1.45); }
	if( lslope >= -14212 ) { 
		if( lmin < -12.65 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -12.65 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( max < 6.36 ) { 
	if( lslope < -17473.5 ) { 
		if( max < 0.84 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 0.84 ) { return new Prediction("AT", 3.21, 0.21); }
	}
		if( lslope >= -17473.5 ) { return new Prediction("NAT", 19.26, 0.02); }
	}
	}
	if( rslope >= -10879.5 ) { 
	if( lmin < -2.74 ) { 
	if( lmin < -17.57 ) { 
		if( rmin < -15.22 ) { return new Prediction("NAT", 3.21, 0); }
		if( rmin >= -15.22 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( lmin >= -17.57 ) { return new Prediction("AT", 49.23, 3.17); }
	}
		if( lmin >= -2.74 ) { return new Prediction("NAT", 5.35, 0.01); }
	}
	}
	if( max < -0.77 ) { 
		if( lmin >= -12.26 ) { return new Prediction("NAT", 10.7, 0.01); }
		if( lmin < -12.26 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	if( rslope < -20195.5 ) { 
		if( lmin >= -10.49 ) { return new Prediction("NAT", 23.55, 0.03); }
		if( lmin < -10.49 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( rmin >= -7.22 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
	if( lmin < -7.73 ) { 
	if( rmin < -3.89 ) { 
		if( lslope >= -16849.5 ) { return new Prediction("AT", 11.77, 0.76); }
	if( lslope < -16849.5 ) { 
	if( lmin >= -12.26 ) { 
	if( rmin >= -6.84 ) { 
		if( rmin < -5.82 ) { return new Prediction("AT", 6.42, 0.41); }
	if( rmin >= -5.82 ) { 
		if( lmin >= -11.05 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -11.05 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rmin < -6.84 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	if( rmin >= -3.89 ) { 
	if( lslope >= -16849.5 ) { 
		if( max >= 7.23 ) { return new Prediction("AT", 4.28, 0.28); }
		if( max < 7.23 ) { return new Prediction("NAT", 4.28, 0.01); }
	}
		if( lslope < -16849.5 ) { return new Prediction("NAT", 10.7, 0.01); }
	}
	}
	if( lmin >= -7.73 ) { 
	if( lslope < -5364.5 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 55.65, 0.07); }
	if( rslope >= -33045 ) { 
	if( rmin < 4.55 ) { 
		if( rslope >= -6056 ) { return new Prediction("AT", 4.28, 0.28); }
	if( rslope < -6056 ) { 
	if( rmin < 2.4 ) { 
	if( lmin < -5.41 ) { 
		if( rmin >= -4.07 ) { return new Prediction("NAT", 8.56, 0.01); }
	if( rmin < -4.07 ) { 
		if( lslope < -9949 ) { return new Prediction("AT", 6.42, 0.41); }
		if( lslope >= -9949 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	if( lmin >= -5.41 ) { 
	if( lslope >= -22276 ) { 
		if( lmin < 2.14 ) { return new Prediction("NAT", 78.13, 0.09); }
	if( lmin >= 2.14 ) { 
		if( max >= 7.39 ) { return new Prediction("NAT", 7.49, 0.01); }
	if( max < 7.39 ) { 
		if( rmin >= 0.23 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < 0.23 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( lslope < -22276 ) { 
		if( rslope >= -23533 ) { return new Prediction("AT", 2.14, 0.14); }
	if( rslope < -23533 ) { 
		if( lmin < -0.5 ) { return new Prediction("NAT", 16.05, 0.02); }
	if( lmin >= -0.5 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 7.49, 0.01); }
		if( lmin < 1.09 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
	}
	}
	}
	if( rmin >= 2.4 ) { 
	if( rslope >= -21190 ) { 
	if( max < 8.76 ) { 
		if( lmin >= 0.69 ) { return new Prediction("NAT", 2.14, 0); }
	if( lmin < 0.69 ) { 
		if( lslope >= -11533.5 ) { return new Prediction("NAT", 2.14, 0); }
		if( lslope < -11533.5 ) { return new Prediction("AT", 5.35, 0.35); }
	}
	}
		if( max >= 8.76 ) { return new Prediction("AT", 5.35, 0.35); }
	}
		if( rslope < -21190 ) { return new Prediction("NAT", 9.63, 0.01); }
	}
	}
	}
		if( rmin >= 4.55 ) { return new Prediction("NAT", 41.74, 0.05); }
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 100.6, 0.12); }
	}
	}
	if( max < 1.68 ) { 
		if( lmin < -15.12 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -15.12 ) { return new Prediction("NAT", 240.81, 0.28); }
	}
	}
	if( max >= 13.14 ) { 
	if( rmin < -5.33 ) { 
		if( max < 17.11 ) { return new Prediction("NAT", 7.49, 0.01); }
		if( max >= 17.11 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	if( rmin >= -5.33 ) { 
		if( lmin >= 3.42 ) { return new Prediction("NAT", 4.28, 0.01); }
		if( lmin < 3.42 ) { return new Prediction("AT", 47.09, 3.04); }
	}
	}
	}
return null;
}
private Prediction runTree34() {
	if( lmin >= -8.97 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 116.03, 0); }
	if( lslope < -5785.5 ) { 
	if( rslope >= -35655 ) { 
	if( max < 10.9 ) { 
	if( rmin >= -5.5 ) { 
	if( rmin >= -0.03 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 36.53, 0); }
	if( lmin < 3.7 ) { 
	if( lmin >= -1.07 ) { 
	if( max >= 3.5 ) { 
	if( lmin < -0.55 ) { 
		if( lmin >= -0.92 ) { return new Prediction("AT", 6.45, 0.45); }
	if( lmin < -0.92 ) { 
		if( lmin < -0.99 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -0.99 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( lmin >= -0.55 ) { 
	if( lslope < -9412.5 ) { 
		if( lmin < 0.27 ) { return new Prediction("NAT", 6.45, 0); }
	if( lmin >= 0.27 ) { 
		if( lslope < -28836.5 ) { return new Prediction("AT", 2.15, 0.15); }
	if( lslope >= -28836.5 ) { 
		if( rmin >= 3.52 ) { return new Prediction("NAT", 6.45, 0); }
	if( rmin < 3.52 ) { 
	if( rslope < -14125.5 ) { 
		if( rmin < 0.51 ) { return new Prediction("AT", 2.15, 0.15); }
	if( rmin >= 0.51 ) { 
		if( lmin < 0.7 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= 0.7 ) { return new Prediction("NAT", 8.59, 0); }
	}
	}
		if( rslope >= -14125.5 ) { return new Prediction("AT", 4.3, 0.3); }
	}
	}
	}
	}
		if( lslope >= -9412.5 ) { return new Prediction("NAT", 4.3, 0); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 27.93, 0); }
	}
	if( lmin < -1.07 ) { 
	if( max < 3.58 ) { 
		if( rmin >= 2.97 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < 2.97 ) { return new Prediction("NAT", 16.11, 0); }
	}
		if( max >= 3.58 ) { return new Prediction("NAT", 32.23, 0); }
	}
	}
	}
	if( rmin < -0.03 ) { 
		if( max < 7.57 ) { return new Prediction("NAT", 150.4, 0); }
	if( max >= 7.57 ) { 
		if( max < 7.63 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max >= 7.63 ) { return new Prediction("NAT", 11.82, 0); }
	}
	}
	}
	if( rmin < -5.5 ) { 
	if( max >= 5.47 ) { 
	if( lmin < 0.93 ) { 
		if( lslope < -9949 ) { return new Prediction("AT", 13.97, 0.97); }
	if( lslope >= -9949 ) { 
		if( lmin < -6.49 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -6.49 ) { return new Prediction("AT", 6.45, 0.45); }
	}
	}
		if( lmin >= 0.93 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( max < 5.47 ) { 
	if( max >= 1.43 ) { 
	if( rmin >= -8.58 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 7.52, 0); }
		if( lmin < -4.28 ) { return new Prediction("AT", 8.59, 0.59); }
	}
		if( rmin < -8.58 ) { return new Prediction("NAT", 9.67, 0); }
	}
		if( max < 1.43 ) { return new Prediction("NAT", 29.01, 0); }
	}
	}
	}
	if( max >= 10.9 ) { 
	if( rmin < 2.1 ) { 
	if( rmin >= -19.21 ) { 
	if( max < 11.48 ) { 
		if( lmin < -0.72 ) { return new Prediction("AT", 2.15, 0.15); }
	if( lmin >= -0.72 ) { 
		if( lmin < -0.07 ) { return new Prediction("NAT", 2.15, 0); }
		if( lmin >= -0.07 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( max >= 11.48 ) { return new Prediction("AT", 32.23, 2.23); }
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rmin >= 2.1 ) { 
		if( lslope < -10613 ) { return new Prediction("NAT", 6.45, 0); }
		if( lslope >= -10613 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
		if( rslope < -35655 ) { return new Prediction("NAT", 109.58, 0); }
	}
	}
	if( lmin < -8.97 ) { 
	if( rslope >= -19885 ) { 
	if( lslope < -10438 ) { 
		if( max >= 6.79 ) { return new Prediction("AT", 45.12, 3.12); }
	if( max < 6.79 ) { 
	if( rslope < -16281 ) { 
		if( rslope >= -17995 ) { return new Prediction("AT", 4.3, 0.3); }
	if( rslope < -17995 ) { 
		if( rmin >= -6.13 ) { return new Prediction("NAT", 4.3, 0); }
		if( rmin < -6.13 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
		if( rslope >= -16281 ) { return new Prediction("NAT", 20.41, 0); }
	}
	}
	if( lslope >= -10438 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 6.45, 0); }
	if( max >= -4.9 ) { 
		if( lmin >= -22.76 ) { return new Prediction("AT", 81.65, 5.65); }
		if( lmin < -22.76 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	if( rslope < -19885 ) { 
		if( lmin >= -11.48 ) { return new Prediction("NAT", 11.82, 0); }
	if( lmin < -11.48 ) { 
		if( rmin < -5.52 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= -5.52 ) { return new Prediction("NAT", 3.22, 0); }
	}
	}
	}
return null;
}
private Prediction runTree35() {
	if( lmin >= -8.97 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 2.68 ) { return new Prediction("NAT", 121.56, 0); }
	if( lmin < 2.68 ) { 
	if( rmin >= -4.48 ) { 
	if( max >= 13.13 ) { 
		if( rslope >= -4959 ) { return new Prediction("NAT", 3.17, 0); }
	if( rslope < -4959 ) { 
		if( lmin < 1.46 ) { return new Prediction("AT", 19.03, 1.03); }
		if( lmin >= 1.46 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( max < 13.13 ) { 
	if( lslope >= -30377.5 ) { 
	if( lmin < -2.59 ) { 
	if( rmin >= 2.97 ) { 
	if( rslope < -20952 ) { 
		if( lmin < -5.53 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin >= -5.53 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rslope >= -20952 ) { return new Prediction("NAT", 8.46, 0); }
	}
		if( rmin < 2.97 ) { return new Prediction("NAT", 57.08, 0); }
	}
	if( lmin >= -2.59 ) { 
		if( max < 3.45 ) { return new Prediction("NAT", 20.08, 0); }
	if( max >= 3.45 ) { 
		if( lmin >= 2.44 ) { return new Prediction("AT", 5.29, 0.29); }
	if( lmin < 2.44 ) { 
	if( lslope >= -28458.5 ) { 
		if( lmin < -2.51 ) { return new Prediction("AT", 3.17, 0.17); }
	if( lmin >= -2.51 ) { 
		if( lmin < -1.13 ) { return new Prediction("NAT", 11.63, 0); }
	if( lmin >= -1.13 ) { 
		if( lmin >= 0.91 ) { return new Prediction("NAT", 11.63, 0); }
	if( lmin < 0.91 ) { 
	if( rmin >= 0.43 ) { 
		if( max >= 11.49 ) { return new Prediction("NAT", 4.23, 0); }
	if( max < 11.49 ) { 
	if( max >= 6.82 ) { 
		if( lslope >= -15770.5 ) { return new Prediction("AT", 9.51, 0.51); }
		if( lslope < -15770.5 ) { return new Prediction("NAT", 2.11, 0); }
	}
	if( max < 6.82 ) { 
		if( lmin >= 0.39 ) { return new Prediction("AT", 2.11, 0.11); }
		if( lmin < 0.39 ) { return new Prediction("NAT", 6.34, 0); }
	}
	}
	}
	if( rmin < 0.43 ) { 
	if( rmin < -1.85 ) { 
		if( lmin < 0.02 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin >= 0.02 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rmin >= -1.85 ) { return new Prediction("NAT", 6.34, 0); }
	}
	}
	}
	}
	}
		if( lslope < -28458.5 ) { return new Prediction("AT", 4.23, 0.23); }
	}
	}
	}
	}
		if( lslope < -30377.5 ) { return new Prediction("NAT", 45.45, 0); }
	}
	}
	if( rmin < -4.48 ) { 
	if( lslope < -20223 ) { 
	if( rmin >= -6.01 ) { 
		if( rmin < -5.16 ) { return new Prediction("AT", 2.11, 0.11); }
		if( rmin >= -5.16 ) { return new Prediction("NAT", 3.17, 0); }
	}
		if( rmin < -6.01 ) { return new Prediction("NAT", 16.91, 0); }
	}
	if( lslope >= -20223 ) { 
		if( max >= 8.38 ) { return new Prediction("AT", 17.97, 0.97); }
	if( max < 8.38 ) { 
	if( lmin >= -4.52 ) { 
		if( rmin < -12.69 ) { return new Prediction("AT", 3.17, 0.17); }
		if( rmin >= -12.69 ) { return new Prediction("NAT", 16.91, 0); }
	}
	if( lmin < -4.52 ) { 
	if( lmin < -6.27 ) { 
	if( lslope < -9236 ) { 
		if( rslope >= -16988.5 ) { return new Prediction("NAT", 6.34, 0); }
		if( rslope < -16988.5 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lslope >= -9236 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	if( lmin >= -6.27 ) { 
		if( lslope < -4631.5 ) { return new Prediction("AT", 21.14, 1.14); }
		if( lslope >= -4631.5 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( max < 1.68 ) { 
		if( lmin >= -8.62 ) { return new Prediction("NAT", 232.54, 0); }
	if( lmin < -8.62 ) { 
		if( lmin >= -8.81 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -8.81 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	if( lmin < -8.97 ) { 
	if( rslope >= -19885 ) { 
	if( rmin < -3.48 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 8.46, 0); }
	if( max >= -4.9 ) { 
	if( rslope >= -11149 ) { 
	if( lmin < -17.75 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.06, 0); }
	if( lmin >= -23.72 ) { 
	if( lslope >= -9407 ) { 
		if( lmin >= -18.18 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -18.18 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( lslope < -9407 ) { return new Prediction("AT", 4.23, 0.23); }
	}
	}
		if( lmin >= -17.75 ) { return new Prediction("AT", 53.91, 2.91); }
	}
	if( rslope < -11149 ) { 
	if( lslope >= -14875.5 ) { 
		if( max >= 8.05 ) { return new Prediction("AT", 6.34, 0.34); }
		if( max < 8.05 ) { return new Prediction("NAT", 13.74, 0); }
	}
	if( lslope < -14875.5 ) { 
	if( lmin < -11.37 ) { 
	if( lslope >= -16849.5 ) { 
		if( rslope < -15896 ) { return new Prediction("AT", 6.34, 0.34); }
	if( rslope >= -15896 ) { 
		if( lmin < -14.67 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -14.67 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( lslope < -16849.5 ) { 
		if( max < 2.09 ) { return new Prediction("AT", 2.11, 0.11); }
		if( max >= 2.09 ) { return new Prediction("NAT", 8.46, 0); }
	}
	}
		if( lmin >= -11.37 ) { return new Prediction("AT", 26.43, 1.43); }
	}
	}
	}
	}
		if( rmin >= -3.48 ) { return new Prediction("AT", 21.14, 1.14); }
	}
	if( rslope < -19885 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 20.08, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
return null;
}
private Prediction runTree36() {
	if( lmin >= -8.49 ) { 
	if( max < 3.17 ) { 
		if( rslope < -6064.5 ) { return new Prediction("NAT", 240.42, 0); }
	if( rslope >= -6064.5 ) { 
		if( lslope < -5405 ) { return new Prediction("AT", 1.1, 0.1); }
		if( lslope >= -5405 ) { return new Prediction("NAT", 18.66, 0); }
	}
	}
	if( max >= 3.17 ) { 
	if( lslope < -5364.5 ) { 
	if( max < 12.91 ) { 
	if( rslope < -8978.5 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 47.21, 0); }
	if( rslope >= -34924 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 29.64, 0); }
	if( rmin < 6.73 ) { 
	if( lslope < -9986 ) { 
		if( lmin >= 2.84 ) { return new Prediction("NAT", 17.56, 0); }
	if( lmin < 2.84 ) { 
	if( lmin >= -0.8 ) { 
	if( lmin >= -0.63 ) { 
		if( rmin >= 3.46 ) { return new Prediction("NAT", 7.68, 0); }
	if( rmin < 3.46 ) { 
	if( lmin >= 0.04 ) { 
	if( rslope < -20899 ) { 
		if( lmin < 1.43 ) { return new Prediction("AT", 9.88, 0.88); }
		if( lmin >= 1.43 ) { return new Prediction("NAT", 1.1, 0); }
	}
	if( rslope >= -20899 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 7.68, 0); }
	if( max >= 7.05 ) { 
		if( rslope < -14682 ) { return new Prediction("NAT", 2.2, 0); }
		if( rslope >= -14682 ) { return new Prediction("AT", 6.59, 0.59); }
	}
	}
	}
		if( lmin < 0.04 ) { return new Prediction("NAT", 4.39, 0); }
	}
	}
		if( lmin < -0.63 ) { return new Prediction("AT", 4.39, 0.39); }
	}
	if( lmin < -0.8 ) { 
	if( lmin < -2.44 ) { 
		if( max < 3.31 ) { return new Prediction("AT", 2.2, 0.2); }
	if( max >= 3.31 ) { 
	if( rslope >= -32574.5 ) { 
		if( max >= 10.99 ) { return new Prediction("AT", 1.1, 0.1); }
	if( max < 10.99 ) { 
	if( lslope < -10429 ) { 
		if( max >= 4.17 ) { return new Prediction("NAT", 24.15, 0); }
	if( max < 4.17 ) { 
		if( max >= 4.06 ) { return new Prediction("AT", 1.1, 0.1); }
		if( max < 4.06 ) { return new Prediction("NAT", 2.2, 0); }
	}
	}
		if( lslope >= -10429 ) { return new Prediction("AT", 1.1, 0.1); }
	}
	}
	if( rslope < -32574.5 ) { 
		if( lmin < -6.75 ) { return new Prediction("AT", 1.1, 0.1); }
	if( lmin >= -6.75 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.1, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.1, 0.1); }
	}
	}
	}
	}
		if( lmin >= -2.44 ) { return new Prediction("NAT", 13.17, 0); }
	}
	}
	}
		if( lslope >= -9986 ) { return new Prediction("NAT", 19.76, 0); }
	}
	}
	}
	if( rslope >= -8978.5 ) { 
		if( rmin >= 5.43 ) { return new Prediction("NAT", 7.68, 0); }
	if( rmin < 5.43 ) { 
		if( max < 6.31 ) { return new Prediction("NAT", 9.88, 0); }
	if( max >= 6.31 ) { 
		if( max >= 10.57 ) { return new Prediction("AT", 10.98, 0.98); }
	if( max < 10.57 ) { 
		if( lslope < -8338 ) { return new Prediction("AT", 6.59, 0.59); }
	if( lslope >= -8338 ) { 
	if( lslope >= -7423 ) { 
		if( max < 9.89 ) { return new Prediction("AT", 8.78, 0.78); }
		if( max >= 9.89 ) { return new Prediction("NAT", 1.1, 0); }
	}
		if( lslope < -7423 ) { return new Prediction("NAT", 4.39, 0); }
	}
	}
	}
	}
	}
	}
	if( max >= 12.91 ) { 
		if( lmin >= 5.71 ) { return new Prediction("NAT", 1.1, 0); }
		if( lmin < 5.71 ) { return new Prediction("AT", 25.25, 2.25); }
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 92.22, 0); }
	}
	}
	if( lmin < -8.49 ) { 
	if( max < 3.31 ) { 
	if( rslope >= -10526.5 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 12.08, 0); }
	if( max >= -4.9 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 23.05, 2.05); }
		if( lslope >= -3296 ) { return new Prediction("NAT", 1.1, 0); }
	}
	}
	if( rslope < -10526.5 ) { 
	if( max >= 1.4 ) { 
		if( max < 1.78 ) { return new Prediction("AT", 1.1, 0.1); }
		if( max >= 1.78 ) { return new Prediction("NAT", 13.17, 0); }
	}
		if( max < 1.4 ) { return new Prediction("NAT", 24.15, 0); }
	}
	}
	if( max >= 3.31 ) { 
	if( rslope >= -17033.5 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.1, 0); }
	if( lmin >= -23.72 ) { 
	if( max < 7.92 ) { 
		if( lslope >= -11003.5 ) { return new Prediction("AT", 27.45, 2.45); }
	if( lslope < -11003.5 ) { 
		if( rmin < -15.53 ) { return new Prediction("AT", 2.2, 0.2); }
		if( rmin >= -15.53 ) { return new Prediction("NAT", 6.59, 0); }
	}
	}
		if( max >= 7.92 ) { return new Prediction("AT", 79.04, 7.04); }
	}
	}
	if( rslope < -17033.5 ) { 
	if( rmin >= -7.11 ) { 
	if( lmin >= -9.87 ) { 
		if( rslope < -36199.5 ) { return new Prediction("NAT", 2.2, 0); }
		if( rslope >= -36199.5 ) { return new Prediction("AT", 3.29, 0.29); }
	}
		if( lmin < -9.87 ) { return new Prediction("NAT", 12.08, 0); }
	}
	if( rmin < -7.11 ) { 
		if( lslope < -17290.5 ) { return new Prediction("AT", 8.78, 0.78); }
		if( lslope >= -17290.5 ) { return new Prediction("NAT", 1.1, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree37() {
	if( lmin < -9.2 ) { 
	if( rslope < -11225 ) { 
	if( max < 9.8 ) { 
	if( rmin < -5.44 ) { 
	if( rmin < -6.59 ) { 
		if( rmin >= -14.77 ) { return new Prediction("NAT", 13.88, 0.03); }
		if( rmin < -14.77 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	if( rmin >= -6.59 ) { 
	if( lmin >= -12.52 ) { 
		if( lmin < -10.57 ) { return new Prediction("AT", 7.47, 0.46); }
		if( lmin >= -10.57 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin < -12.52 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( rmin >= -5.44 ) { 
	if( lmin < -18.26 ) { 
		if( lmin < -20.71 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -20.71 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin >= -18.26 ) { return new Prediction("NAT", 23.49, 0.06); }
	}
	}
	if( max >= 9.8 ) { 
	if( lmin < -15.22 ) { 
		if( lmin < -17.47 ) { return new Prediction("AT", 2.14, 0.13); }
		if( lmin >= -17.47 ) { return new Prediction("NAT", 6.41, 0.02); }
	}
	if( lmin >= -15.22 ) { 
		if( lslope >= -21578.5 ) { return new Prediction("AT", 25.62, 1.56); }
	if( lslope < -21578.5 ) { 
		if( lmin < -10.83 ) { return new Prediction("AT", 5.34, 0.33); }
		if( lmin >= -10.83 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	if( rslope >= -11225 ) { 
	if( lslope >= -4831.5 ) { 
	if( max < 11.14 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( lslope < -4149.5 ) { 
		if( rmin >= -7.75 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < -7.75 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 13.88, 0.85); }
	}
	if( lslope < -4831.5 ) { 
		if( max >= -3.59 ) { return new Prediction("AT", 53.38, 3.25); }
		if( max < -3.59 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( lmin >= -9.2 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 85.41, 0.2); }
	if( lslope < -5358 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 62.99, 0.15); }
	if( lmin < 3.98 ) { 
	if( rmin < -4.16 ) { 
	if( lmin < -4.25 ) { 
	if( lmin >= -6.24 ) { 
		if( rmin < -5.77 ) { return new Prediction("AT", 12.81, 0.78); }
	if( rmin >= -5.77 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	}
	if( lmin < -6.24 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( lslope >= -34743.5 ) { 
	if( max < 6.31 ) { 
		if( rslope < -30052 ) { return new Prediction("AT", 2.14, 0.13); }
		if( rslope >= -30052 ) { return new Prediction("NAT", 7.47, 0.02); }
	}
		if( max >= 6.31 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	}
	}
	if( lmin >= -4.25 ) { 
		if( lmin < -0.83 ) { return new Prediction("NAT", 13.88, 0.03); }
	if( lmin >= -0.83 ) { 
		if( lmin >= 0.65 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( lmin < 0.65 ) { 
	if( lmin < 0.23 ) { 
		if( lmin >= -0.63 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lmin < -0.63 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin >= 0.23 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
	}
	}
	if( rmin >= -4.16 ) { 
	if( lmin < -1.01 ) { 
	if( lmin < -4.62 ) { 
		if( lmin < -4.74 ) { return new Prediction("NAT", 40.57, 0.1); }
		if( lmin >= -4.74 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin >= -4.62 ) { return new Prediction("NAT", 61.92, 0.15); }
	}
	if( lmin >= -1.01 ) { 
	if( max >= 3.5 ) { 
		if( lslope < -30483.5 ) { return new Prediction("NAT", 10.68, 0.03); }
	if( lslope >= -30483.5 ) { 
	if( rslope >= -28973 ) { 
	if( max >= 7.16 ) { 
		if( lslope >= -12907.5 ) { return new Prediction("AT", 13.88, 0.85); }
	if( lslope < -12907.5 ) { 
		if( lmin >= 0.61 ) { return new Prediction("NAT", 5.34, 0.01); }
	if( lmin < 0.61 ) { 
		if( rslope >= -18601 ) { return new Prediction("AT", 4.27, 0.26); }
		if( rslope < -18601 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	}
	if( max < 7.16 ) { 
	if( max < 4.63 ) { 
	if( lmin >= 0.38 ) { 
		if( lmin < 1.15 ) { return new Prediction("AT", 6.41, 0.39); }
		if( lmin >= 1.15 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( lmin < 0.38 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( max >= 4.63 ) { return new Prediction("NAT", 22.42, 0.05); }
	}
	}
		if( rslope < -28973 ) { return new Prediction("AT", 6.41, 0.39); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 30.96, 0.07); }
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 222.06, 0.52); }
	}
	if( max >= 13.14 ) { 
		if( lslope >= -5525 ) { return new Prediction("NAT", 5.34, 0.01); }
	if( lslope < -5525 ) { 
	if( rmin >= 2.46 ) { 
		if( rmin < 15.06 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= 15.06 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin < 2.46 ) { return new Prediction("AT", 26.69, 1.63); }
	}
	}
	}
return null;
}
private Prediction runTree38() {
	if( lmin < -8.58 ) { 
	if( lslope < -16717.5 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 9.55, 0.02); }
	if( lmin >= -12.19 ) { 
	if( rslope >= -19885 ) { 
		if( rmin < -8.8 ) { return new Prediction("NAT", 3.18, 0.01); }
	if( rmin >= -8.8 ) { 
		if( lslope < -17337 ) { return new Prediction("AT", 6.37, 0.35); }
		if( lslope >= -17337 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( rslope < -19885 ) { 
		if( lmin >= -11.48 ) { return new Prediction("NAT", 13.79, 0.03); }
	if( lmin < -11.48 ) { 
		if( max < 9.81 ) { return new Prediction("NAT", 2.12, 0); }
		if( max >= 9.81 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	if( lslope >= -16717.5 ) { 
	if( lmin >= -9.94 ) { 
	if( max < 5.94 ) { 
		if( lmin < -8.82 ) { return new Prediction("NAT", 11.67, 0.03); }
		if( lmin >= -8.82 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( max >= 5.94 ) { 
	if( lslope < -12277.5 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 5.3, 0.29); }
		if( max < 9.7 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lslope >= -12277.5 ) { return new Prediction("AT", 7.43, 0.41); }
	}
	}
	if( lmin < -9.94 ) { 
	if( rslope < -10879.5 ) { 
		if( max >= 6 ) { return new Prediction("AT", 23.34, 1.29); }
	if( max < 6 ) { 
		if( lslope >= -16215.5 ) { return new Prediction("NAT", 9.55, 0.02); }
		if( lslope < -16215.5 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
	if( rslope >= -10879.5 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.06, 0); }
	if( lmin >= -23.72 ) { 
		if( max < -7.42 ) { return new Prediction("NAT", 1.06, 0); }
	if( max >= -7.42 ) { 
		if( lslope < -2447.99 ) { return new Prediction("AT", 54.11, 2.98); }
	if( lslope >= -2447.99 ) { 
		if( lslope < -2321.49 ) { return new Prediction("NAT", 1.06, 0); }
		if( lslope >= -2321.49 ) { return new Prediction("AT", 5.3, 0.29); }
	}
	}
	}
	}
	}
	}
	}
	if( lmin >= -8.58 ) { 
	if( lslope < -5364.5 ) { 
	if( rslope >= -21351.5 ) { 
	if( max < 10.58 ) { 
		if( lslope >= -5999.5 ) { return new Prediction("AT", 3.18, 0.18); }
	if( lslope < -5999.5 ) { 
		if( max < 3.42 ) { return new Prediction("NAT", 91.24, 0.21); }
	if( max >= 3.42 ) { 
	if( max < 7.54 ) { 
	if( lmin < -4.74 ) { 
	if( max < 6.31 ) { 
		if( rmin >= -5.63 ) { return new Prediction("NAT", 4.24, 0.01); }
	if( rmin < -5.63 ) { 
	if( rmin >= -8.95 ) { 
		if( lmin < -6.27 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin >= -6.27 ) { return new Prediction("AT", 7.43, 0.41); }
	}
		if( rmin < -8.95 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
		if( max >= 6.31 ) { return new Prediction("AT", 6.37, 0.35); }
	}
	if( lmin >= -4.74 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 41.38, 0.1); }
	if( max >= 7.05 ) { 
		if( rslope < -11032.5 ) { return new Prediction("AT", 8.49, 0.47); }
		if( rslope >= -11032.5 ) { return new Prediction("NAT", 3.18, 0.01); }
	}
	}
	}
		if( max >= 7.54 ) { return new Prediction("NAT", 37.13, 0.09); }
	}
	}
	}
	if( max >= 10.58 ) { 
	if( lmin < 3.97 ) { 
	if( rmin >= -19.21 ) { 
	if( lmin >= -7.23 ) { 
	if( max < 11.48 ) { 
		if( lslope >= -12154.5 ) { return new Prediction("AT", 13.79, 0.76); }
	if( lslope < -12154.5 ) { 
		if( max < 11.13 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max >= 11.13 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
		if( max >= 11.48 ) { return new Prediction("AT", 24.4, 1.34); }
	}
		if( lmin < -7.23 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 3.18, 0.01); }
	}
		if( lmin >= 3.97 ) { return new Prediction("NAT", 5.3, 0.01); }
	}
	}
	if( rslope < -21351.5 ) { 
	if( rslope >= -35678.5 ) { 
	if( lslope < -34640 ) { 
		if( rmin < -7.97 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -7.97 ) { return new Prediction("AT", 4.24, 0.23); }
	}
	if( lslope >= -34640 ) { 
	if( max >= 3.5 ) { 
	if( max < 4.24 ) { 
	if( lslope >= -30377.5 ) { 
		if( rmin < -0.54 ) { return new Prediction("NAT", 2.12, 0); }
		if( rmin >= -0.54 ) { return new Prediction("AT", 10.61, 0.58); }
	}
		if( lslope < -30377.5 ) { return new Prediction("NAT", 4.24, 0.01); }
	}
	if( max >= 4.24 ) { 
	if( rmin < -1.99 ) { 
		if( lmin >= -2.13 ) { return new Prediction("NAT", 3.18, 0.01); }
	if( lmin < -2.13 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 3.18, 0.01); }
	if( rmin >= -4.79 ) { 
		if( lmin < -4.39 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lmin >= -4.39 ) { 
		if( max >= 7.81 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 7.81 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
		if( rmin >= -1.99 ) { return new Prediction("NAT", 54.11, 0.13); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 99.73, 0.23); }
	}
	}
		if( rslope < -35678.5 ) { return new Prediction("NAT", 99.73, 0.23); }
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 148.53, 0.35); }
	}
return null;
}
private Prediction runTree39() {
	if( max >= 14.81 ) { 
	if( max < 17.11 ) { 
		if( max < 15.48 ) { return new Prediction("AT", 5.38, 0.37); }
	if( max >= 15.48 ) { 
		if( max < 15.85 ) { return new Prediction("NAT", 1.08, 0); }
	if( max >= 15.85 ) { 
		if( lmin < -12.65 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -12.65 ) { return new Prediction("AT", 1.08, 0.07); }
	}
	}
	}
		if( max >= 17.11 ) { return new Prediction("AT", 37.65, 2.56); }
	}
	if( max < 14.81 ) { 
	if( lmin < -7.73 ) { 
	if( rslope < -19080 ) { 
	if( lmin < -7.86 ) { 
	if( max >= 11.2 ) { 
		if( max < 12.83 ) { return new Prediction("AT", 1.08, 0.07); }
		if( max >= 12.83 ) { return new Prediction("NAT", 3.23, 0.01); }
	}
		if( max < 11.2 ) { return new Prediction("NAT", 39.8, 0.09); }
	}
		if( lmin >= -7.86 ) { return new Prediction("AT", 3.23, 0.22); }
	}
	if( rslope >= -19080 ) { 
	if( max >= 3.27 ) { 
		if( lmin < -20.71 ) { return new Prediction("NAT", 3.23, 0.01); }
	if( lmin >= -20.71 ) { 
		if( lslope >= -8844 ) { return new Prediction("AT", 31.19, 2.12); }
	if( lslope < -8844 ) { 
		if( lslope >= -8999.5 ) { return new Prediction("NAT", 2.15, 0.01); }
	if( lslope < -8999.5 ) { 
	if( max < 9.21 ) { 
	if( lslope < -11088.5 ) { 
	if( max < 7.92 ) { 
		if( rmin < -15.53 ) { return new Prediction("AT", 1.08, 0.07); }
		if( rmin >= -15.53 ) { return new Prediction("NAT", 6.45, 0.02); }
	}
	if( max >= 7.92 ) { 
		if( lslope < -16310 ) { return new Prediction("NAT", 1.08, 0); }
		if( lslope >= -16310 ) { return new Prediction("AT", 7.53, 0.51); }
	}
	}
		if( lslope >= -11088.5 ) { return new Prediction("AT", 8.61, 0.59); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 26.89, 1.83); }
	}
	}
	}
	}
	if( max < 3.27 ) { 
		if( max >= 2.48 ) { return new Prediction("NAT", 8.61, 0.02); }
	if( max < 2.48 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 5.38, 0.01); }
	if( max >= -4.9 ) { 
	if( lslope < -10474 ) { 
	if( rmin >= -8.14 ) { 
		if( max >= 1.61 ) { return new Prediction("AT", 6.45, 0.44); }
	if( max < 1.61 ) { 
		if( lslope < -16131 ) { return new Prediction("NAT", 2.15, 0.01); }
		if( lslope >= -16131 ) { return new Prediction("AT", 1.08, 0.07); }
	}
	}
		if( rmin < -8.14 ) { return new Prediction("NAT", 10.76, 0.03); }
	}
	if( lslope >= -10474 ) { 
		if( rslope >= -3381.5 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope < -3381.5 ) { return new Prediction("AT", 18.29, 1.24); }
	}
	}
	}
	}
	}
	}
	if( lmin >= -7.73 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 119.4, 0.28); }
	if( lmin < 3.69 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 48.4, 0.11); }
	if( rslope >= -33045 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 41.95, 0.1); }
	if( rslope < -5426 ) { 
	if( lmin >= -1.07 ) { 
	if( max >= 3.48 ) { 
	if( rmin < 5.84 ) { 
	if( max < 7.5 ) { 
	if( rslope < -13297.5 ) { 
		if( rmin >= 2.24 ) { return new Prediction("NAT", 3.23, 0.01); }
	if( rmin < 2.24 ) { 
	if( max >= 6.44 ) { 
		if( rslope < -20347 ) { return new Prediction("NAT", 6.45, 0.02); }
		if( rslope >= -20347 ) { return new Prediction("AT", 5.38, 0.37); }
	}
	if( max < 6.44 ) { 
		if( lmin < 1.43 ) { return new Prediction("AT", 10.76, 0.73); }
		if( lmin >= 1.43 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
		if( rslope >= -13297.5 ) { return new Prediction("NAT", 15.06, 0.04); }
	}
	if( max >= 7.5 ) { 
	if( rslope < -14682 ) { 
		if( rmin >= 1.1 ) { return new Prediction("NAT", 4.3, 0.01); }
	if( rmin < 1.1 ) { 
	if( lslope < -19694 ) { 
		if( rmin < -0.86 ) { return new Prediction("AT", 1.08, 0.07); }
		if( rmin >= -0.86 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lslope >= -19694 ) { return new Prediction("AT", 4.3, 0.29); }
	}
	}
		if( rslope >= -14682 ) { return new Prediction("AT", 16.13, 1.1); }
	}
	}
		if( rmin >= 5.84 ) { return new Prediction("NAT", 5.38, 0.01); }
	}
		if( max < 3.48 ) { return new Prediction("NAT", 17.21, 0.04); }
	}
	if( lmin < -1.07 ) { 
	if( rmin < -6.02 ) { 
		if( lmin >= -4.53 ) { return new Prediction("NAT", 12.91, 0.03); }
	if( lmin < -4.53 ) { 
	if( lmin < -6.43 ) { 
		if( lmin < -6.92 ) { return new Prediction("AT", 1.08, 0.07); }
		if( lmin >= -6.92 ) { return new Prediction("NAT", 2.15, 0.01); }
	}
		if( lmin >= -6.43 ) { return new Prediction("AT", 8.61, 0.59); }
	}
	}
	if( rmin >= -6.02 ) { 
	if( lslope >= -32607 ) { 
	if( max < 12.57 ) { 
	if( rmin >= 2.97 ) { 
		if( max >= 3.72 ) { return new Prediction("NAT", 16.13, 0.04); }
		if( max < 3.72 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( rmin < 2.97 ) { return new Prediction("NAT", 61.31, 0.14); }
	}
		if( max >= 12.57 ) { return new Prediction("AT", 1.08, 0.07); }
	}
		if( lslope < -32607 ) { return new Prediction("AT", 1.08, 0.07); }
	}
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 209.75, 0.49); }
	}
	}
return null;
}
private Prediction runTree40() {
	if( lmin >= -7.74 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 126.13, 0); }
	if( lslope < -5785.5 ) { 
		if( lslope < -36676 ) { return new Prediction("NAT", 107.96, 0); }
	if( lslope >= -36676 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 35.27, 0); }
	if( lmin < 3.69 ) { 
	if( max < 3.09 ) { 
		if( rslope < -6191 ) { return new Prediction("NAT", 158.2, 0); }
		if( rslope >= -6191 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( max >= 3.09 ) { 
	if( lmin < -1.52 ) { 
	if( rmin < 3.28 ) { 
	if( max < 11.09 ) { 
		if( lmin >= -4.52 ) { return new Prediction("NAT", 28.86, 0); }
	if( lmin < -4.52 ) { 
		if( lmin < -6.27 ) { return new Prediction("NAT", 9.62, 0); }
	if( lmin >= -6.27 ) { 
	if( lmin < -5.38 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 8.55, 0.55); }
	}
	if( lmin >= -5.38 ) { 
		if( max < 4.03 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max >= 4.03 ) { return new Prediction("NAT", 6.41, 0); }
	}
	}
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 11.76, 0.76); }
	}
		if( rmin >= 3.28 ) { return new Prediction("NAT", 14.96, 0); }
	}
	if( lmin >= -1.52 ) { 
	if( max < 10.38 ) { 
	if( max >= 7.32 ) { 
	if( lmin >= 0.55 ) { 
		if( lmin < 2.53 ) { return new Prediction("NAT", 10.69, 0); }
		if( lmin >= 2.53 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin < 0.55 ) { return new Prediction("AT", 10.69, 0.69); }
	}
	if( max < 7.32 ) { 
	if( rslope < -26347 ) { 
		if( rmin < 0.51 ) { return new Prediction("AT", 8.55, 0.55); }
	if( rmin >= 0.51 ) { 
		if( rslope >= -27154 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rslope < -27154 ) { return new Prediction("NAT", 8.55, 0); }
	}
	}
	if( rslope >= -26347 ) { 
	if( lmin >= 2.44 ) { 
		if( max >= 6.69 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 6.69 ) { return new Prediction("NAT", 6.41, 0); }
	}
		if( lmin < 2.44 ) { return new Prediction("NAT", 18.17, 0); }
	}
	}
	}
	if( max >= 10.38 ) { 
		if( rslope < -20544.5 ) { return new Prediction("NAT", 5.34, 0); }
	if( rslope >= -20544.5 ) { 
		if( rmin >= -19.21 ) { return new Prediction("AT", 27.79, 1.79); }
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( lmin < -7.74 ) { 
	if( rslope >= -19885 ) { 
	if( max < 11.14 ) { 
		if( max < -7.42 ) { return new Prediction("NAT", 7.48, 0); }
	if( max >= -7.42 ) { 
		if( rmin < -17.99 ) { return new Prediction("AT", 17.1, 1.1); }
	if( rmin >= -17.99 ) { 
	if( lmin < -11.4 ) { 
	if( max >= 3.55 ) { 
		if( lmin < -21.85 ) { return new Prediction("NAT", 4.28, 0); }
	if( lmin >= -21.85 ) { 
	if( max < 9.82 ) { 
		if( lslope < -12630 ) { return new Prediction("NAT", 5.34, 0); }
	if( lslope >= -12630 ) { 
		if( max < 8.84 ) { return new Prediction("AT", 7.48, 0.48); }
		if( max >= 8.84 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( max >= 9.82 ) { return new Prediction("AT", 10.69, 0.69); }
	}
	}
	if( max < 3.55 ) { 
	if( lslope >= -10213 ) { 
		if( lslope < -4247 ) { return new Prediction("AT", 5.34, 0.34); }
		if( lslope >= -4247 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope < -10213 ) { return new Prediction("NAT", 18.17, 0); }
	}
	}
	if( lmin >= -11.4 ) { 
	if( max >= -0.29 ) { 
	if( max < 10.46 ) { 
		if( rmin >= -4.65 ) { return new Prediction("NAT", 3.21, 0); }
	if( rmin < -4.65 ) { 
	if( rmin < -9.56 ) { 
		if( rmin >= -9.75 ) { return new Prediction("NAT", 2.14, 0); }
		if( rmin < -9.75 ) { return new Prediction("AT", 12.83, 0.83); }
	}
		if( rmin >= -9.56 ) { return new Prediction("AT", 33.14, 2.14); }
	}
	}
		if( max >= 10.46 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( max < -0.29 ) { return new Prediction("NAT", 4.28, 0); }
	}
	}
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 58.79, 3.79); }
	}
	if( rslope < -19885 ) { 
	if( lmin >= -8.74 ) { 
		if( lmin < -8.58 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -8.58 ) { return new Prediction("NAT", 12.83, 0); }
	}
		if( lmin < -8.74 ) { return new Prediction("NAT", 33.14, 0); }
	}
	}
return null;
}
private Prediction runTree41() {
	if( lmin >= -7.74 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
	if( lmin < 2.66 ) { 
	if( max >= 7.16 ) { 
	if( rmin < 4.59 ) { 
		if( max >= 11.56 ) { return new Prediction("NAT", 7.42, 0.01); }
	if( max < 11.56 ) { 
	if( max < 10.47 ) { 
		if( rmin < -7.28 ) { return new Prediction("AT", 4.24, 0.23); }
	if( rmin >= -7.28 ) { 
	if( rmin < 1.78 ) { 
	if( lslope < -29285 ) { 
		if( max >= 8.38 ) { return new Prediction("AT", 3.18, 0.18); }
		if( max < 8.38 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( lslope >= -29285 ) { 
		if( lslope < -5797 ) { return new Prediction("NAT", 19.07, 0.02); }
	if( lslope >= -5797 ) { 
		if( lslope >= -4588 ) { return new Prediction("NAT", 3.18, 0); }
		if( lslope < -4588 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	if( rmin >= 1.78 ) { 
		if( max >= 9.86 ) { return new Prediction("NAT", 2.12, 0); }
	if( max < 9.86 ) { 
		if( rmin < 2.74 ) { return new Prediction("AT", 4.24, 0.23); }
	if( rmin >= 2.74 ) { 
	if( lmin >= -1.07 ) { 
		if( lmin < -0.06 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -0.06 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lmin < -1.07 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	}
	if( max >= 10.47 ) { 
	if( lmin >= -3.13 ) { 
		if( lslope < -4437.5 ) { return new Prediction("AT", 14.83, 0.82); }
		if( lslope >= -4437.5 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lmin < -3.13 ) { return new Prediction("NAT", 3.18, 0); }
	}
	}
	}
		if( rmin >= 4.59 ) { return new Prediction("NAT", 34.97, 0.04); }
	}
	if( max < 7.16 ) { 
	if( rmin < -6.91 ) { 
		if( lmin >= -4.08 ) { return new Prediction("NAT", 5.3, 0.01); }
	if( lmin < -4.08 ) { 
		if( max < 4.57 ) { return new Prediction("AT", 10.6, 0.58); }
		if( max >= 4.57 ) { return new Prediction("NAT", 3.18, 0); }
	}
	}
	if( rmin >= -6.91 ) { 
	if( lmin < 0.34 ) { 
		if( lslope < -20097 ) { return new Prediction("NAT", 59.34, 0.07); }
	if( lslope >= -20097 ) { 
		if( lslope < -18115.5 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lslope >= -18115.5 ) { 
	if( lmin < -6.04 ) { 
		if( lmin >= -6.45 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -6.45 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lmin >= -6.04 ) { return new Prediction("NAT", 73.11, 0.09); }
	}
	}
	}
	if( lmin >= 0.34 ) { 
		if( rmin >= 0.79 ) { return new Prediction("NAT", 18.01, 0.02); }
	if( rmin < 0.79 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 10.6, 0.01); }
	if( lmin < 1.09 ) { 
		if( max >= 4.73 ) { return new Prediction("NAT", 6.36, 0.01); }
		if( max < 4.73 ) { return new Prediction("AT", 4.24, 0.23); }
	}
	}
	}
	}
	}
	}
	if( lmin >= 2.66 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 96.43, 0.11); }
	if( lmin < 3.98 ) { 
		if( rmin < 3.58 ) { return new Prediction("NAT", 21.19, 0.02); }
	if( rmin >= 3.58 ) { 
		if( lmin >= 3.85 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < 3.85 ) { return new Prediction("NAT", 5.3, 0.01); }
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 214.04, 0.25); }
	}
	if( max >= 13.14 ) { 
		if( rslope < -10274 ) { return new Prediction("AT", 18.01, 0.99); }
		if( rslope >= -10274 ) { return new Prediction("NAT", 5.3, 0.01); }
	}
	}
	if( lmin < -7.74 ) { 
	if( max < 5.04 ) { 
	if( rslope < -10795.5 ) { 
		if( lmin >= -7.9 ) { return new Prediction("AT", 3.18, 0.18); }
	if( lmin < -7.9 ) { 
	if( max >= 1.61 ) { 
		if( lslope >= -16225.5 ) { return new Prediction("NAT", 13.78, 0.02); }
	if( lslope < -16225.5 ) { 
	if( max < 2.7 ) { 
		if( lslope >= -17886 ) { return new Prediction("AT", 4.24, 0.23); }
	if( lslope < -17886 ) { 
		if( max >= 2.3 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 2.3 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
		if( max >= 2.7 ) { return new Prediction("NAT", 7.42, 0.01); }
	}
	}
		if( max < 1.61 ) { return new Prediction("NAT", 34.97, 0.04); }
	}
	}
	if( rslope >= -10795.5 ) { 
		if( max < -6.38 ) { return new Prediction("NAT", 6.36, 0.01); }
	if( max >= -6.38 ) { 
	if( max < -2.17 ) { 
		if( lmin < -13.17 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lmin >= -13.17 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max >= -2.17 ) { return new Prediction("AT", 21.19, 1.17); }
	}
	}
	}
	if( max >= 5.04 ) { 
	if( lslope < -16970 ) { 
	if( max < 17.33 ) { 
		if( lslope < -18331.5 ) { return new Prediction("NAT", 10.6, 0.01); }
	if( lslope >= -18331.5 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 3.18, 0.18); }
		if( max < 9.7 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
		if( max >= 17.33 ) { return new Prediction("AT", 10.6, 0.58); }
	}
	if( lslope >= -16970 ) { 
	if( lmin < -17.96 ) { 
		if( max < 19.94 ) { return new Prediction("NAT", 3.18, 0); }
		if( max >= 19.94 ) { return new Prediction("AT", 3.18, 0.18); }
	}
		if( lmin >= -17.96 ) { return new Prediction("AT", 64.64, 3.56); }
	}
	}
	}
return null;
}
private Prediction runTree42() {
	if( lmin < -9.16 ) { 
	if( rslope >= -20001.5 ) { 
	if( lmin >= -23.97 ) { 
	if( rslope >= -11119 ) { 
	if( max >= -3.59 ) { 
		if( rslope < -2529.01 ) { return new Prediction("AT", 69.05, 4.05); }
	if( rslope >= -2529.01 ) { 
		if( max >= 7.32 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max < 7.32 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( max < -3.59 ) { 
		if( rmin < -14.35 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin >= -14.35 ) { return new Prediction("NAT", 8.5, 0); }
	}
	}
	if( rslope < -11119 ) { 
	if( rslope < -13214 ) { 
	if( max < 9.21 ) { 
	if( lmin >= -12.26 ) { 
		if( max < 7.56 ) { return new Prediction("AT", 12.75, 0.75); }
		if( max >= 7.56 ) { return new Prediction("NAT", 3.19, 0); }
	}
	if( lmin < -12.26 ) { 
		if( max < 5.61 ) { return new Prediction("NAT", 8.5, 0); }
		if( max >= 5.61 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
		if( max >= 9.21 ) { return new Prediction("AT", 25.49, 1.49); }
	}
	if( rslope >= -13214 ) { 
		if( max >= 6.25 ) { return new Prediction("AT", 5.31, 0.31); }
		if( max < 6.25 ) { return new Prediction("NAT", 12.75, 0); }
	}
	}
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 4.25, 0); }
	}
	if( rslope < -20001.5 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 13.81, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( lmin >= -9.16 ) { 
	if( max < 7.05 ) { 
	if( max < 1.65 ) { 
	if( rmin < -8.74 ) { 
		if( rmin < -9.65 ) { return new Prediction("NAT", 14.87, 0); }
		if( rmin >= -9.65 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rmin >= -8.74 ) { return new Prediction("NAT", 202.89, 0); }
	}
	if( max >= 1.65 ) { 
	if( rmin >= -5.55 ) { 
		if( rmin < -0.06 ) { return new Prediction("NAT", 106.23, 0); }
	if( rmin >= -0.06 ) { 
		if( lslope >= -16199 ) { return new Prediction("NAT", 33.99, 0); }
	if( lslope < -16199 ) { 
	if( rmin >= 0.4 ) { 
		if( rslope < -26978 ) { return new Prediction("NAT", 35.05, 0); }
	if( rslope >= -26978 ) { 
		if( lslope < -25762 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lslope >= -25762 ) { 
		if( rmin < 3.07 ) { return new Prediction("NAT", 4.25, 0); }
		if( rmin >= 3.07 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	if( rmin < 0.4 ) { 
		if( max >= 3.27 ) { return new Prediction("AT", 5.31, 0.31); }
		if( max < 3.27 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	if( rmin < -5.55 ) { 
	if( lslope < -11896.5 ) { 
	if( lmin < -4.74 ) { 
		if( lslope < -22318.5 ) { return new Prediction("NAT", 9.56, 0); }
	if( lslope >= -22318.5 ) { 
		if( rmin < -8.74 ) { return new Prediction("NAT", 2.12, 0); }
		if( rmin >= -8.74 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
		if( lmin >= -4.74 ) { return new Prediction("NAT", 14.87, 0); }
	}
	if( lslope >= -11896.5 ) { 
	if( rslope < -4687 ) { 
	if( rslope < -10417 ) { 
		if( lmin < -5.76 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin >= -5.76 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 7.44, 0.44); }
	}
		if( rslope >= -4687 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
	}
	}
	if( max >= 7.05 ) { 
		if( lmin >= 4.14 ) { return new Prediction("NAT", 91.35, 0); }
	if( lmin < 4.14 ) { 
	if( rslope >= -21351.5 ) { 
	if( rslope < -4951.5 ) { 
	if( lmin >= -2.19 ) { 
	if( lslope < -15022 ) { 
		if( rmin < -0.62 ) { return new Prediction("AT", 11.68, 0.68); }
	if( rmin >= -0.62 ) { 
	if( rmin < 1.58 ) { 
		if( max < 11.13 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max >= 11.13 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin >= 1.58 ) { return new Prediction("NAT", 4.25, 0); }
	}
	}
	if( lslope >= -15022 ) { 
		if( rmin >= -5.12 ) { return new Prediction("AT", 28.68, 1.68); }
	if( rmin < -5.12 ) { 
		if( max >= 9.24 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 9.24 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	if( lmin < -2.19 ) { 
		if( max >= 11.8 ) { return new Prediction("AT", 17, 1); }
	if( max < 11.8 ) { 
	if( lmin < -5.39 ) { 
		if( max >= 10.04 ) { return new Prediction("NAT", 4.25, 0); }
		if( max < 10.04 ) { return new Prediction("AT", 8.5, 0.5); }
	}
		if( lmin >= -5.39 ) { return new Prediction("NAT", 19.12, 0); }
	}
	}
	}
		if( rslope >= -4951.5 ) { return new Prediction("NAT", 11.68, 0); }
	}
	if( rslope < -21351.5 ) { 
	if( rmin < -1.07 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 4.25, 0); }
	if( max >= 11.09 ) { 
		if( lmin < -0.83 ) { return new Prediction("AT", 4.25, 0.25); }
		if( lmin >= -0.83 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( rmin >= -1.07 ) { return new Prediction("NAT", 22.31, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree43() {
		if( max >= 14.89 ) { return new Prediction("AT", 55.45, 3.31); }
	if( max < 14.89 ) { 
	if( lmin < -7.72 ) { 
	if( lslope >= -19730.5 ) { 
	if( lslope < -10474 ) { 
	if( lslope >= -14788.5 ) { 
		if( rmin < -4.95 ) { return new Prediction("NAT", 17.06, 0.04); }
	if( rmin >= -4.95 ) { 
		if( lmin < -14.66 ) { return new Prediction("AT", 1.07, 0.06); }
		if( lmin >= -14.66 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	if( lslope < -14788.5 ) { 
	if( max < 6.87 ) { 
	if( lmin >= -12.26 ) { 
		if( max < 2.83 ) { return new Prediction("AT", 5.33, 0.32); }
		if( max >= 2.83 ) { return new Prediction("NAT", 4.26, 0.01); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 7.46, 0.02); }
	}
	if( max >= 6.87 ) { 
	if( rmin >= -7.77 ) { 
		if( lslope < -16709.5 ) { return new Prediction("NAT", 3.2, 0.01); }
		if( lslope >= -16709.5 ) { return new Prediction("AT", 5.33, 0.32); }
	}
		if( rmin < -7.77 ) { return new Prediction("AT", 14.93, 0.89); }
	}
	}
	}
	if( lslope >= -10474 ) { 
	if( max >= -5.41 ) { 
	if( lmin >= -22.76 ) { 
		if( rslope < -2529.01 ) { return new Prediction("AT", 46.91, 2.8); }
	if( rslope >= -2529.01 ) { 
		if( max >= 7.32 ) { return new Prediction("AT", 3.2, 0.19); }
		if( max < 7.32 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 2.13, 0); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 11.73, 0.03); }
	}
	}
	if( lslope < -19730.5 ) { 
		if( lmin < -7.86 ) { return new Prediction("NAT", 35.19, 0.08); }
		if( lmin >= -7.86 ) { return new Prediction("AT", 1.07, 0.06); }
	}
	}
	if( lmin >= -7.72 ) { 
	if( lslope >= -30196 ) { 
	if( max < 3.17 ) { 
		if( rmin >= -6.9 ) { return new Prediction("NAT", 162.07, 0.38); }
	if( rmin < -6.9 ) { 
		if( max >= 1.33 ) { return new Prediction("AT", 2.13, 0.13); }
		if( max < 1.33 ) { return new Prediction("NAT", 23.46, 0.05); }
	}
	}
	if( max >= 3.17 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 95.96, 0.22); }
	if( lmin < 3.69 ) { 
	if( lslope < -5336 ) { 
	if( max >= 10.73 ) { 
		if( max >= 13.82 ) { return new Prediction("NAT", 2.13, 0); }
	if( max < 13.82 ) { 
	if( lmin < -2.74 ) { 
		if( max < 12.03 ) { return new Prediction("NAT", 4.26, 0.01); }
		if( max >= 12.03 ) { return new Prediction("AT", 3.2, 0.19); }
	}
	if( lmin >= -2.74 ) { 
	if( lslope >= -14016 ) { 
		if( max >= 11.18 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 11.18 ) { return new Prediction("AT", 6.4, 0.38); }
	}
		if( lslope < -14016 ) { return new Prediction("AT", 14.93, 0.89); }
	}
	}
	}
	if( max < 10.73 ) { 
		if( rslope < -29051.5 ) { return new Prediction("AT", 4.26, 0.25); }
	if( rslope >= -29051.5 ) { 
	if( rmin < -5.82 ) { 
		if( lmin >= -4.22 ) { return new Prediction("NAT", 5.33, 0.01); }
	if( lmin < -4.22 ) { 
		if( rmin < -8.85 ) { return new Prediction("NAT", 2.13, 0); }
		if( rmin >= -8.85 ) { return new Prediction("AT", 10.66, 0.64); }
	}
	}
	if( rmin >= -5.82 ) { 
	if( max >= 7.29 ) { 
	if( max >= 7.64 ) { 
		if( lslope < -11464.5 ) { return new Prediction("NAT", 21.32, 0.05); }
	if( lslope >= -11464.5 ) { 
		if( max >= 9.04 ) { return new Prediction("AT", 3.2, 0.19); }
		if( max < 9.04 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( max < 7.64 ) { 
		if( lmin >= 1.55 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < 1.55 ) { return new Prediction("AT", 12.79, 0.77); }
	}
	}
	if( max < 7.29 ) { 
	if( max < 4.3 ) { 
	if( rmin >= -0.25 ) { 
		if( lslope < -14200.5 ) { return new Prediction("AT", 7.46, 0.45); }
		if( lslope >= -14200.5 ) { return new Prediction("NAT", 4.26, 0.01); }
	}
		if( rmin < -0.25 ) { return new Prediction("NAT", 18.13, 0.04); }
	}
		if( max >= 4.3 ) { return new Prediction("NAT", 44.78, 0.1); }
	}
	}
	}
	}
	}
		if( lslope >= -5336 ) { return new Prediction("NAT", 40.52, 0.09); }
	}
	}
	}
		if( lslope < -30196 ) { return new Prediction("NAT", 141.81, 0.33); }
	}
	}
return null;
}
private Prediction runTree44() {
	if( lmin >= -8.27 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 197.09, 0.23); }
	if( max >= 1.66 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 122.78, 0.14); }
	if( lmin < 3.7 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 43.08, 0.05); }
	if( rslope >= -34924 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 43.08, 0.05); }
	if( rslope < -5426 ) { 
	if( max < 10.87 ) { 
		if( lslope >= -5999.5 ) { return new Prediction("AT", 4.31, 0.3); }
	if( lslope < -5999.5 ) { 
	if( rmin >= 3.46 ) { 
		if( lslope < -16533.5 ) { return new Prediction("NAT", 21.54, 0.03); }
	if( lslope >= -16533.5 ) { 
		if( lslope < -14095 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lslope >= -14095 ) { return new Prediction("NAT", 4.31, 0.01); }
	}
	}
	if( rmin < 3.46 ) { 
	if( rmin >= -0.15 ) { 
	if( rmin >= 0.41 ) { 
	if( lslope >= -26497.5 ) { 
		if( lslope >= -9598 ) { return new Prediction("NAT", 9.69, 0.01); }
	if( lslope < -9598 ) { 
	if( max >= 7.32 ) { 
	if( rslope >= -15847 ) { 
		if( lmin < -2.38 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -2.38 ) { return new Prediction("AT", 8.62, 0.61); }
	}
		if( rslope < -15847 ) { return new Prediction("NAT", 3.23, 0); }
	}
	if( max < 7.32 ) { 
		if( rmin < 0.81 ) { return new Prediction("AT", 3.23, 0.23); }
	if( rmin >= 0.81 ) { 
		if( rmin < 2.91 ) { return new Prediction("NAT", 10.77, 0.01); }
	if( rmin >= 2.91 ) { 
		if( max >= 3.78 ) { return new Prediction("NAT", 5.39, 0.01); }
		if( max < 3.78 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	}
	}
	}
		if( lslope < -26497.5 ) { return new Prediction("NAT", 10.77, 0.01); }
	}
	if( rmin < 0.41 ) { 
		if( rslope >= -26857.5 ) { return new Prediction("NAT", 2.15, 0); }
		if( rslope < -26857.5 ) { return new Prediction("AT", 12.92, 0.91); }
	}
	}
	if( rmin < -0.15 ) { 
	if( lmin >= -5.51 ) { 
		if( lslope >= -19672.5 ) { return new Prediction("NAT", 51.7, 0.06); }
	if( lslope < -19672.5 ) { 
	if( max < 6.85 ) { 
		if( rslope >= -21517.5 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rslope < -21517.5 ) { return new Prediction("NAT", 19.39, 0.02); }
	}
		if( max >= 6.85 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	if( lmin < -5.51 ) { 
	if( max < 6.31 ) { 
		if( max < 3.95 ) { return new Prediction("AT", 3.23, 0.23); }
	if( max >= 3.95 ) { 
	if( rmin >= -6.53 ) { 
		if( rmin >= -5.41 ) { return new Prediction("NAT", 2.15, 0); }
		if( rmin < -5.41 ) { return new Prediction("AT", 3.23, 0.23); }
	}
		if( rmin < -6.53 ) { return new Prediction("NAT", 7.54, 0.01); }
	}
	}
	if( max >= 6.31 ) { 
		if( lmin < -5.85 ) { return new Prediction("AT", 5.39, 0.38); }
	if( lmin >= -5.85 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
	}
	}
	}
	if( max >= 10.87 ) { 
	if( lslope < -18972 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 7.54, 0.01); }
	if( rmin < 2.46 ) { 
	if( lslope >= -22214.5 ) { 
		if( lmin < -4.06 ) { return new Prediction("AT", 2.15, 0.15); }
		if( lmin >= -4.06 ) { return new Prediction("NAT", 4.31, 0.01); }
	}
		if( lslope < -22214.5 ) { return new Prediction("AT", 3.23, 0.23); }
	}
	}
		if( lslope >= -18972 ) { return new Prediction("AT", 17.23, 1.21); }
	}
	}
	}
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( rslope >= -19885 ) { 
	if( max < 11.09 ) { 
	if( lslope < -3884 ) { 
	if( lslope < -10474.5 ) { 
	if( rmin < -4.75 ) { 
	if( max < 9.21 ) { 
	if( lmin >= -12.26 ) { 
		if( lslope < -18501 ) { return new Prediction("AT", 6.46, 0.45); }
	if( lslope >= -18501 ) { 
		if( rmin < -9.32 ) { return new Prediction("NAT", 10.77, 0.01); }
	if( rmin >= -9.32 ) { 
	if( rmin >= -7.33 ) { 
		if( max >= 4.95 ) { return new Prediction("NAT", 2.15, 0); }
		if( max < 4.95 ) { return new Prediction("AT", 4.31, 0.3); }
	}
		if( rmin < -7.33 ) { return new Prediction("AT", 6.46, 0.45); }
	}
	}
	}
	if( lmin < -12.26 ) { 
		if( max < 6.67 ) { return new Prediction("NAT", 15.08, 0.02); }
		if( max >= 6.67 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
		if( max >= 9.21 ) { return new Prediction("AT", 11.85, 0.83); }
	}
	if( rmin >= -4.75 ) { 
		if( lslope < -12420 ) { return new Prediction("NAT", 9.69, 0.01); }
	if( lslope >= -12420 ) { 
		if( lslope < -11883 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lslope >= -11883 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	if( lslope >= -10474.5 ) { 
	if( max < 8.49 ) { 
		if( max < -6.57 ) { return new Prediction("NAT", 1.08, 0); }
		if( max >= -6.57 ) { return new Prediction("AT", 37.7, 2.65); }
	}
	if( max >= 8.49 ) { 
		if( max >= 9.74 ) { return new Prediction("AT", 2.15, 0.15); }
		if( max < 9.74 ) { return new Prediction("NAT", 3.23, 0); }
	}
	}
	}
		if( lslope >= -3884 ) { return new Prediction("NAT", 7.54, 0.01); }
	}
		if( max >= 11.09 ) { return new Prediction("AT", 61.39, 4.32); }
	}
	if( rslope < -19885 ) { 
		if( rslope < -35134 ) { return new Prediction("NAT", 17.23, 0.02); }
	if( rslope >= -35134 ) { 
		if( lslope < -29169 ) { return new Prediction("AT", 2.15, 0.15); }
		if( lslope >= -29169 ) { return new Prediction("NAT", 10.77, 0.01); }
	}
	}
	}
return null;
}
private Prediction runTree45() {
	if( lmin < -7.73 ) { 
	if( lslope < -16717.5 ) { 
		if( lslope < -34959 ) { return new Prediction("NAT", 20.57, 0.05); }
	if( lslope >= -34959 ) { 
		if( lslope < -29169 ) { return new Prediction("AT", 7.58, 0.56); }
	if( lslope >= -29169 ) { 
	if( rmin < -5.45 ) { 
	if( max >= 2.14 ) { 
		if( lslope >= -17848 ) { return new Prediction("NAT", 5.41, 0.01); }
	if( lslope < -17848 ) { 
		if( rslope < -21649 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope >= -21649 ) { return new Prediction("AT", 9.74, 0.72); }
	}
	}
		if( max < 2.14 ) { return new Prediction("NAT", 7.58, 0.02); }
	}
		if( rmin >= -5.45 ) { return new Prediction("NAT", 15.15, 0.04); }
	}
	}
	}
	if( lslope >= -16717.5 ) { 
	if( lmin >= -22.76 ) { 
	if( max < 4.47 ) { 
		if( max < -3.46 ) { return new Prediction("NAT", 14.07, 0.03); }
	if( max >= -3.46 ) { 
	if( lslope < -10474 ) { 
	if( lmin >= -12.61 ) { 
		if( rmin < -11.79 ) { return new Prediction("NAT", 3.25, 0.01); }
	if( rmin >= -11.79 ) { 
		if( rmin >= -5.13 ) { return new Prediction("NAT", 2.16, 0.01); }
		if( rmin < -5.13 ) { return new Prediction("AT", 4.33, 0.32); }
	}
	}
		if( lmin < -12.61 ) { return new Prediction("NAT", 10.82, 0.03); }
	}
		if( lslope >= -10474 ) { return new Prediction("AT", 21.65, 1.6); }
	}
	}
		if( max >= 4.47 ) { return new Prediction("AT", 95.26, 7.04); }
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 4.33, 0.01); }
	}
	}
	if( lmin >= -7.73 ) { 
	if( max < 10.58 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 197.01, 0.46); }
	if( max >= 1.66 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 95.26, 0.22); }
	if( lmin < 3.98 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 37.89, 0.09); }
	if( rslope >= -33045 ) { 
	if( lslope < -5336 ) { 
		if( rslope >= -6068 ) { return new Prediction("AT", 4.33, 0.32); }
	if( rslope < -6068 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 30.31, 0.07); }
	if( max >= 3.17 ) { 
	if( lmin < 0.27 ) { 
	if( lmin >= -5.19 ) { 
	if( rslope < -14343 ) { 
		if( lslope < -19892.5 ) { return new Prediction("NAT", 23.81, 0.06); }
	if( lslope >= -19892.5 ) { 
	if( lmin < -0.99 ) { 
		if( max < 3.59 ) { return new Prediction("AT", 1.08, 0.08); }
		if( max >= 3.59 ) { return new Prediction("NAT", 7.58, 0.02); }
	}
		if( lmin >= -0.99 ) { return new Prediction("AT", 4.33, 0.32); }
	}
	}
		if( rslope >= -14343 ) { return new Prediction("NAT", 40.05, 0.09); }
	}
	if( lmin < -5.19 ) { 
	if( max < 6.31 ) { 
		if( lmin < -6.27 ) { return new Prediction("NAT", 9.74, 0.02); }
	if( lmin >= -6.27 ) { 
		if( lslope < -20618 ) { return new Prediction("NAT", 1.08, 0); }
		if( lslope >= -20618 ) { return new Prediction("AT", 5.41, 0.4); }
	}
	}
		if( max >= 6.31 ) { return new Prediction("AT", 4.33, 0.32); }
	}
	}
	if( lmin >= 0.27 ) { 
	if( lmin >= 0.91 ) { 
	if( lmin >= 2.44 ) { 
	if( rmin >= -0.96 ) { 
	if( lmin >= 3.7 ) { 
		if( max >= 8.27 ) { return new Prediction("AT", 1.08, 0.08); }
		if( max < 8.27 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
		if( lmin < 3.7 ) { return new Prediction("AT", 3.25, 0.24); }
	}
		if( rmin < -0.96 ) { return new Prediction("NAT", 4.33, 0.01); }
	}
	if( lmin < 2.44 ) { 
		if( lslope < -29098 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lslope >= -29098 ) { return new Prediction("NAT", 12.99, 0.03); }
	}
	}
	if( lmin < 0.91 ) { 
		if( rmin >= 3.02 ) { return new Prediction("NAT", 3.25, 0.01); }
	if( rmin < 3.02 ) { 
	if( rmin < -0.38 ) { 
		if( lmin >= 0.54 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin < 0.54 ) { return new Prediction("AT", 2.16, 0.16); }
	}
		if( rmin >= -0.38 ) { return new Prediction("AT", 8.66, 0.64); }
	}
	}
	}
	}
	}
	}
		if( lslope >= -5336 ) { return new Prediction("NAT", 35.72, 0.08); }
	}
	}
	}
	}
	if( max >= 10.58 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 30.31, 0.07); }
	if( lmin < 3.6 ) { 
	if( rmin < 5.89 ) { 
	if( lslope < -20462 ) { 
		if( lmin >= -1.7 ) { return new Prediction("NAT", 7.58, 0.02); }
	if( lmin < -1.7 ) { 
		if( max >= 10.99 ) { return new Prediction("AT", 2.16, 0.16); }
		if( max < 10.99 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
	}
	if( lslope >= -20462 ) { 
		if( lslope >= -4493 ) { return new Prediction("NAT", 2.16, 0.01); }
	if( lslope < -4493 ) { 
	if( rmin >= 1.82 ) { 
		if( lslope >= -12154.5 ) { return new Prediction("AT", 11.91, 0.88); }
		if( lslope < -12154.5 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( rmin < 1.82 ) { return new Prediction("AT", 22.73, 1.68); }
	}
	}
	}
	if( rmin >= 5.89 ) { 
		if( rmin >= 18.85 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rmin < 18.85 ) { return new Prediction("NAT", 10.82, 0.03); }
	}
	}
	}
	}
return null;
}
private Prediction runTree46() {
	if( max < 13.14 ) { 
	if( lmin < -7.73 ) { 
		if( rslope < -35355.5 ) { return new Prediction("NAT", 25.59, 0.06); }
	if( rslope >= -35355.5 ) { 
	if( max >= -0.77 ) { 
	if( rslope < -10795.5 ) { 
	if( max < 7.92 ) { 
		if( rslope >= -15486.5 ) { return new Prediction("NAT", 21.32, 0.05); }
	if( rslope < -15486.5 ) { 
		if( lmin >= -8.12 ) { return new Prediction("AT", 4.26, 0.25); }
	if( lmin < -8.12 ) { 
		if( lmin >= -10.35 ) { return new Prediction("NAT", 8.53, 0.02); }
	if( lmin < -10.35 ) { 
		if( max < 2.72 ) { return new Prediction("AT", 5.33, 0.32); }
		if( max >= 2.72 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	}
	}
	if( max >= 7.92 ) { 
		if( rslope < -19098 ) { return new Prediction("NAT", 1.07, 0); }
	if( rslope >= -19098 ) { 
		if( lmin >= -11.34 ) { return new Prediction("AT", 21.33, 1.28); }
	if( lmin < -11.34 ) { 
		if( lmin >= -12 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -12 ) { return new Prediction("AT", 5.33, 0.32); }
	}
	}
	}
	}
	if( rslope >= -10795.5 ) { 
		if( lmin < -21.44 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -21.44 ) { return new Prediction("AT", 49.05, 2.93); }
	}
	}
	if( max < -0.77 ) { 
		if( rmin < -14.58 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin >= -14.58 ) { return new Prediction("NAT", 25.59, 0.06); }
	}
	}
	}
	if( lmin >= -7.73 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 122.62, 0.29); }
	if( rslope >= -33045 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 137.55, 0.32); }
	if( max >= 1.66 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 88.5, 0.21); }
	if( lmin < 3.98 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 50.11, 0.12); }
	if( rslope < -5426 ) { 
	if( max < 5.52 ) { 
	if( max < 4.24 ) { 
		if( max >= 4.21 ) { return new Prediction("AT", 2.13, 0.13); }
	if( max < 4.21 ) { 
		if( lslope >= -5964 ) { return new Prediction("AT", 2.13, 0.13); }
	if( lslope < -5964 ) { 
	if( lmin >= 0.32 ) { 
	if( rmin >= 0.1 ) { 
		if( lmin < 1.2 ) { return new Prediction("AT", 3.2, 0.19); }
		if( lmin >= 1.2 ) { return new Prediction("NAT", 4.26, 0.01); }
	}
		if( rmin < 0.1 ) { return new Prediction("NAT", 8.53, 0.02); }
	}
	if( lmin < 0.32 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 34.12, 0.08); }
	if( max >= 3.17 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 8.53, 0.02); }
	if( lmin < -4.28 ) { 
		if( max < 3.73 ) { return new Prediction("AT", 2.13, 0.13); }
		if( max >= 3.73 ) { return new Prediction("NAT", 5.33, 0.01); }
	}
	}
	}
	}
	}
	}
		if( max >= 4.24 ) { return new Prediction("NAT", 35.19, 0.08); }
	}
	if( max >= 5.52 ) { 
	if( rslope < -16664 ) { 
		if( lslope >= -28111.5 ) { return new Prediction("NAT", 31.99, 0.07); }
	if( lslope < -28111.5 ) { 
		if( max < 9.64 ) { return new Prediction("AT", 4.26, 0.25); }
		if( max >= 9.64 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	if( rslope >= -16664 ) { 
	if( max < 10.47 ) { 
	if( max < 7.62 ) { 
	if( max < 7.05 ) { 
	if( lmin < -5.05 ) { 
		if( lmin < -6.49 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -6.49 ) { return new Prediction("AT", 5.33, 0.32); }
	}
		if( lmin >= -5.05 ) { return new Prediction("NAT", 13.86, 0.03); }
	}
	if( max >= 7.05 ) { 
		if( lmin >= -1.59 ) { return new Prediction("AT", 11.73, 0.7); }
	if( lmin < -1.59 ) { 
		if( lslope >= -8456 ) { return new Prediction("AT", 2.13, 0.13); }
		if( lslope < -8456 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( max >= 7.62 ) { 
		if( lmin < 2.43 ) { return new Prediction("NAT", 12.8, 0.03); }
		if( lmin >= 2.43 ) { return new Prediction("AT", 1.07, 0.06); }
	}
	}
	if( max >= 10.47 ) { 
	if( max >= 11.18 ) { 
		if( max < 11.47 ) { return new Prediction("NAT", 2.13, 0); }
		if( max >= 11.47 ) { return new Prediction("AT", 3.2, 0.19); }
	}
		if( max < 11.18 ) { return new Prediction("AT", 6.4, 0.38); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
	if( max >= 13.14 ) { 
	if( max < 17.11 ) { 
	if( lmin < -0.21 ) { 
		if( rmin < 9.61 ) { return new Prediction("AT", 19.19, 1.15); }
		if( rmin >= 9.61 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin >= -0.21 ) { return new Prediction("NAT", 5.33, 0.01); }
	}
		if( max >= 17.11 ) { return new Prediction("AT", 47.98, 2.87); }
	}
return null;
}
private Prediction runTree47() {
	if( lmin >= -8.25 ) { 
	if( lslope < -5766 ) { 
	if( lslope < -22526 ) { 
		if( lslope < -36676 ) { return new Prediction("NAT", 102.71, 0.24); }
	if( lslope >= -36676 ) { 
	if( max >= 3.5 ) { 
		if( lmin >= 1.19 ) { return new Prediction("NAT", 32.43, 0.08); }
	if( lmin < 1.19 ) { 
	if( lmin < 0.27 ) { 
	if( lslope < -32483.5 ) { 
	if( lslope >= -35154.5 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 2.16, 0.01); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( lslope < -35154.5 ) { return new Prediction("AT", 3.24, 0.24); }
	}
		if( lslope >= -32483.5 ) { return new Prediction("NAT", 19.46, 0.05); }
	}
		if( lmin >= 0.27 ) { return new Prediction("AT", 7.57, 0.55); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 72.43, 0.17); }
	}
	}
	if( lslope >= -22526 ) { 
	if( max >= 10.73 ) { 
	if( rmin >= -14.76 ) { 
	if( lmin < 5.12 ) { 
	if( rslope < -20544.5 ) { 
	if( rslope >= -22553 ) { 
	if( rmin >= 0.56 ) { 
		if( lmin < -4.24 ) { return new Prediction("AT", 2.16, 0.16); }
		if( lmin >= -4.24 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
		if( rmin < 0.56 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
		if( rslope < -22553 ) { return new Prediction("AT", 3.24, 0.24); }
	}
	if( rslope >= -20544.5 ) { 
	if( max < 11.47 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 7.57, 0.55); }
		if( lmin < -1.14 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( max >= 11.47 ) { return new Prediction("AT", 21.62, 1.57); }
	}
	}
		if( lmin >= 5.12 ) { return new Prediction("NAT", 3.24, 0.01); }
	}
		if( rmin < -14.76 ) { return new Prediction("NAT", 3.24, 0.01); }
	}
	if( max < 10.73 ) { 
	if( max >= 1.58 ) { 
	if( max >= 7.59 ) { 
	if( lmin >= 2.3 ) { 
		if( lmin >= 4.91 ) { return new Prediction("NAT", 10.81, 0.03); }
		if( lmin < 4.91 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( lmin < 2.3 ) { return new Prediction("NAT", 27.03, 0.06); }
	}
	if( max < 7.59 ) { 
	if( max >= 6.95 ) { 
		if( lmin >= -1.59 ) { return new Prediction("AT", 14.05, 1.02); }
	if( lmin < -1.59 ) { 
		if( lmin < -4.18 ) { return new Prediction("AT", 2.16, 0.16); }
		if( lmin >= -4.18 ) { return new Prediction("NAT", 4.32, 0.01); }
	}
	}
	if( max < 6.95 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 51.89, 0.12); }
	if( lmin < -4.28 ) { 
	if( lmin < -4.82 ) { 
		if( rmin >= -5.63 ) { return new Prediction("NAT", 10.81, 0.03); }
	if( rmin < -5.63 ) { 
	if( rmin >= -7.32 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 5.41, 0.39); }
		if( max >= 5.93 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( rmin < -7.32 ) { return new Prediction("NAT", 4.32, 0.01); }
	}
	}
		if( lmin >= -4.82 ) { return new Prediction("AT", 7.57, 0.55); }
	}
	}
	}
	}
		if( max < 1.58 ) { return new Prediction("NAT", 70.27, 0.16); }
	}
	}
	}
		if( lslope >= -5766 ) { return new Prediction("NAT", 140.54, 0.33); }
	}
	if( lmin < -8.25 ) { 
	if( rslope < -18123.5 ) { 
	if( lmin < -8.67 ) { 
	if( rmin < -5.52 ) { 
	if( max >= 2.3 ) { 
		if( lslope >= -21578.5 ) { return new Prediction("AT", 3.24, 0.24); }
	if( lslope < -21578.5 ) { 
		if( lmin < -10.83 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lmin >= -10.83 ) { return new Prediction("NAT", 5.41, 0.01); }
	}
	}
		if( max < 2.3 ) { return new Prediction("NAT", 10.81, 0.03); }
	}
		if( rmin >= -5.52 ) { return new Prediction("NAT", 22.7, 0.05); }
	}
	if( lmin >= -8.67 ) { 
		if( max >= 11.3 ) { return new Prediction("AT", 3.24, 0.24); }
		if( max < 11.3 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	if( rslope >= -18123.5 ) { 
	if( max < 4.54 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 11.89, 0.03); }
	if( lslope < -4149.5 ) { 
	if( rslope >= -10526.5 ) { 
	if( lslope >= -5292.5 ) { 
		if( max < -2.15 ) { return new Prediction("NAT", 2.16, 0.01); }
		if( max >= -2.15 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( lslope < -5292.5 ) { return new Prediction("AT", 19.46, 1.41); }
	}
	if( rslope < -10526.5 ) { 
		if( rslope < -16772 ) { return new Prediction("AT", 2.16, 0.16); }
	if( rslope >= -16772 ) { 
	if( rmin >= -9.14 ) { 
		if( rmin >= -5.41 ) { return new Prediction("NAT", 4.32, 0.01); }
		if( rmin < -5.41 ) { return new Prediction("AT", 2.16, 0.16); }
	}
		if( rmin < -9.14 ) { return new Prediction("NAT", 16.22, 0.04); }
	}
	}
	}
	}
	if( max >= 4.54 ) { 
	if( rmin < -12.48 ) { 
	if( lmin >= -16.19 ) { 
		if( rmin < -12.98 ) { return new Prediction("AT", 14.05, 1.02); }
		if( rmin >= -12.98 ) { return new Prediction("NAT", 3.24, 0.01); }
	}
		if( lmin < -16.19 ) { return new Prediction("NAT", 5.41, 0.01); }
	}
	if( rmin >= -12.48 ) { 
	if( max < 9.21 ) { 
	if( rslope < -11782.5 ) { 
		if( lmin < -13.27 ) { return new Prediction("AT", 2.16, 0.16); }
	if( lmin >= -13.27 ) { 
		if( rmin < -8.07 ) { return new Prediction("AT", 1.08, 0.08); }
		if( rmin >= -8.07 ) { return new Prediction("NAT", 2.16, 0.01); }
	}
	}
		if( rslope >= -11782.5 ) { return new Prediction("AT", 21.62, 1.57); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 57.3, 4.16); }
	}
	}
	}
	}
return null;
}
private Prediction runTree48() {
	if( lmin < -7.72 ) { 
	if( rslope >= -19885 ) { 
		if( max >= 10.91 ) { return new Prediction("AT", 40.47, 2.42); }
	if( max < 10.91 ) { 
	if( max >= -5.41 ) { 
	if( lslope < -10480 ) { 
	if( max < 7.92 ) { 
	if( lmin >= -12.26 ) { 
	if( lslope >= -16615 ) { 
		if( lslope >= -11943.5 ) { return new Prediction("AT", 2.13, 0.13); }
	if( lslope < -11943.5 ) { 
		if( rmin < -13.94 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin >= -13.94 ) { return new Prediction("NAT", 7.45, 0.01); }
	}
	}
		if( lslope < -16615 ) { return new Prediction("AT", 7.45, 0.45); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 22.36, 0.03); }
	}
	if( max >= 7.92 ) { 
		if( rmin >= 3.03 ) { return new Prediction("NAT", 1.06, 0); }
	if( rmin < 3.03 ) { 
		if( rmin >= -10.92 ) { return new Prediction("AT", 13.84, 0.83); }
	if( rmin < -10.92 ) { 
		if( lmin >= -13.55 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -13.55 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	if( lslope >= -10480 ) { 
	if( lmin < -14.13 ) { 
	if( rmin >= -18.22 ) { 
		if( max < -1.67 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max >= -1.67 ) { return new Prediction("NAT", 3.19, 0); }
	}
		if( rmin < -18.22 ) { return new Prediction("AT", 12.78, 0.76); }
	}
		if( lmin >= -14.13 ) { return new Prediction("AT", 33.01, 1.97); }
	}
	}
		if( max < -5.41 ) { return new Prediction("NAT", 8.52, 0.01); }
	}
	}
	if( rslope < -19885 ) { 
	if( lmin < -7.87 ) { 
		if( max < 17.33 ) { return new Prediction("NAT", 46.86, 0.05); }
		if( max >= 17.33 ) { return new Prediction("AT", 3.19, 0.19); }
	}
		if( lmin >= -7.87 ) { return new Prediction("AT", 5.32, 0.32); }
	}
	}
	if( lmin >= -7.72 ) { 
	if( max >= 10.55 ) { 
	if( rmin < 0.94 ) { 
	if( lslope < -10709 ) { 
		if( lslope < -41019 ) { return new Prediction("NAT", 1.06, 0); }
	if( lslope >= -41019 ) { 
	if( rmin >= -0.28 ) { 
	if( lslope < -19165 ) { 
		if( rmin >= 0.56 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < 0.56 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lslope >= -19165 ) { return new Prediction("AT", 5.32, 0.32); }
	}
		if( rmin < -0.28 ) { return new Prediction("AT", 26.62, 1.59); }
	}
	}
	if( lslope >= -10709 ) { 
		if( lmin < -6.3 ) { return new Prediction("AT", 2.13, 0.13); }
	if( lmin >= -6.3 ) { 
		if( lmin >= -0.24 ) { return new Prediction("NAT", 5.32, 0.01); }
	if( lmin < -0.24 ) { 
		if( lmin >= -2.91 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -2.91 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	}
	}
	if( rmin >= 0.94 ) { 
		if( lmin >= 3.58 ) { return new Prediction("NAT", 19.17, 0.02); }
	if( lmin < 3.58 ) { 
	if( lmin < 2.06 ) { 
		if( max < 12.82 ) { return new Prediction("NAT", 14.91, 0.02); }
	if( max >= 12.82 ) { 
		if( lmin < -1.04 ) { return new Prediction("AT", 4.26, 0.25); }
		if( lmin >= -1.04 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
		if( lmin >= 2.06 ) { return new Prediction("AT", 4.26, 0.25); }
	}
	}
	}
	if( max < 10.55 ) { 
	if( max >= 1.68 ) { 
	if( lmin < -4.62 ) { 
	if( rmin >= -4.07 ) { 
		if( lmin < -4.74 ) { return new Prediction("NAT", 31.95, 0.04); }
		if( lmin >= -4.74 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	if( rmin < -4.07 ) { 
		if( rmin < -8.79 ) { return new Prediction("NAT", 3.19, 0); }
	if( rmin >= -8.79 ) { 
		if( rslope < -48557 ) { return new Prediction("NAT", 1.06, 0); }
	if( rslope >= -48557 ) { 
	if( rslope < -4687 ) { 
		if( lslope >= -10373 ) { return new Prediction("AT", 13.84, 0.83); }
	if( lslope < -10373 ) { 
		if( lslope >= -11091 ) { return new Prediction("NAT", 1.06, 0); }
	if( lslope < -11091 ) { 
		if( lmin >= -5.23 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -5.23 ) { return new Prediction("AT", 5.32, 0.32); }
	}
	}
	}
		if( rslope >= -4687 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	if( lmin >= -4.62 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 96.91, 0.11); }
	if( lmin < 3.98 ) { 
	if( max < 7.05 ) { 
		if( lslope >= -25691.5 ) { return new Prediction("NAT", 88.39, 0.1); }
	if( lslope < -25691.5 ) { 
	if( rslope >= -30708 ) { 
		if( lslope < -29875 ) { return new Prediction("AT", 2.13, 0.13); }
	if( lslope >= -29875 ) { 
	if( rslope >= -27154 ) { 
		if( rmin >= 0.23 ) { return new Prediction("AT", 3.19, 0.19); }
		if( rmin < 0.23 ) { return new Prediction("NAT", 3.19, 0); }
	}
		if( rslope < -27154 ) { return new Prediction("NAT", 12.78, 0.01); }
	}
	}
		if( rslope < -30708 ) { return new Prediction("NAT", 34.08, 0.04); }
	}
	}
	if( max >= 7.05 ) { 
	if( lmin >= -1.07 ) { 
		if( max < 7.4 ) { return new Prediction("AT", 7.45, 0.45); }
	if( max >= 7.4 ) { 
		if( max < 7.5 ) { return new Prediction("NAT", 5.32, 0.01); }
	if( max >= 7.5 ) { 
		if( max < 7.6 ) { return new Prediction("AT", 4.26, 0.25); }
	if( max >= 7.6 ) { 
		if( max < 8.79 ) { return new Prediction("NAT", 7.45, 0.01); }
	if( max >= 8.79 ) { 
		if( max < 9.72 ) { return new Prediction("AT", 3.19, 0.19); }
		if( max >= 9.72 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	}
	}
	}
		if( lmin < -1.07 ) { return new Prediction("NAT", 11.71, 0.01); }
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 204.46, 0.24); }
	}
	}
return null;
}
private Prediction runTree49() {
	if( rslope >= -19835.5 ) { 
	if( lmin < -8.95 ) { 
	if( rslope >= -10528 ) { 
	if( lslope >= -4851.5 ) { 
	if( rmin >= -8.88 ) { 
		if( lmin < -10.32 ) { return new Prediction("AT", 19.34, 1.34); }
		if( lmin >= -10.32 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rmin < -8.88 ) { 
	if( max < 11.14 ) { 
		if( max < 1.08 ) { return new Prediction("NAT", 10.74, 0); }
	if( max >= 1.08 ) { 
		if( max >= 6.21 ) { return new Prediction("NAT", 2.15, 0); }
		if( max < 6.21 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 4.3, 0.3); }
	}
	}
	if( lslope < -4851.5 ) { 
	if( lmin < -17.75 ) { 
	if( max >= 4.58 ) { 
		if( max >= 30.61 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 30.61 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max < 4.58 ) { return new Prediction("AT", 5.37, 0.37); }
	}
		if( lmin >= -17.75 ) { return new Prediction("AT", 40.82, 2.82); }
	}
	}
	if( rslope < -10528 ) { 
	if( lslope < -13133.5 ) { 
	if( lslope >= -18022 ) { 
	if( rmin < -8.75 ) { 
		if( max < 6.28 ) { return new Prediction("NAT", 5.37, 0); }
		if( max >= 6.28 ) { return new Prediction("AT", 5.37, 0.37); }
	}
	if( rmin >= -8.75 ) { 
	if( rslope < -16861.5 ) { 
		if( lslope < -17290.5 ) { return new Prediction("AT", 3.22, 0.22); }
		if( lslope >= -17290.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rslope >= -16861.5 ) { return new Prediction("AT", 19.34, 1.34); }
	}
	}
	if( lslope < -18022 ) { 
		if( rmin >= -6.13 ) { return new Prediction("NAT", 8.59, 0); }
		if( rmin < -6.13 ) { return new Prediction("AT", 3.22, 0.22); }
	}
	}
	if( lslope >= -13133.5 ) { 
		if( rslope < -12807 ) { return new Prediction("NAT", 8.59, 0); }
	if( rslope >= -12807 ) { 
		if( max < 10.51 ) { return new Prediction("NAT", 6.45, 0); }
		if( max >= 10.51 ) { return new Prediction("AT", 6.45, 0.45); }
	}
	}
	}
	}
	if( lmin >= -8.95 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 124.62, 0); }
	if( lslope < -5785.5 ) { 
	if( max >= 10.73 ) { 
	if( rslope >= -14356 ) { 
	if( lmin < 5.12 ) { 
	if( rmin >= -19.21 ) { 
		if( rslope < -12742.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -12742.5 ) { return new Prediction("AT", 10.74, 0.74); }
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin >= 5.12 ) { return new Prediction("NAT", 5.37, 0); }
	}
		if( rslope < -14356 ) { return new Prediction("AT", 18.26, 1.26); }
	}
	if( max < 10.73 ) { 
	if( rmin < -5.82 ) { 
		if( lslope >= -9605 ) { return new Prediction("AT", 7.52, 0.52); }
	if( lslope < -9605 ) { 
	if( lslope < -18418 ) { 
		if( lmin < -3.45 ) { return new Prediction("AT", 3.22, 0.22); }
		if( lmin >= -3.45 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope >= -18418 ) { 
		if( lmin >= -4.93 ) { return new Prediction("NAT", 13.97, 0); }
	if( lmin < -4.93 ) { 
	if( rmin < -6.99 ) { 
		if( max < 7.73 ) { return new Prediction("NAT", 21.49, 0); }
		if( max >= 7.73 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rmin >= -6.99 ) { 
		if( lmin < -6.43 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= -6.43 ) { 
		if( max >= 2.28 ) { return new Prediction("AT", 2.15, 0.15); }
		if( max < 2.28 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	}
	if( rmin >= -5.82 ) { 
		if( rmin < 1.79 ) { return new Prediction("NAT", 98.84, 0); }
	if( rmin >= 1.79 ) { 
		if( lmin >= 4.61 ) { return new Prediction("NAT", 23.63, 0); }
	if( lmin < 4.61 ) { 
	if( max >= 6.82 ) { 
	if( rmin < 5.39 ) { 
		if( lslope < -15022 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope >= -15022 ) { return new Prediction("AT", 5.37, 0.37); }
	}
		if( rmin >= 5.39 ) { return new Prediction("NAT", 5.37, 0); }
	}
		if( max < 6.82 ) { return new Prediction("NAT", 10.74, 0); }
	}
	}
	}
	}
	}
	}
	}
	if( rslope < -19835.5 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 167.59, 0); }
	if( max >= 3.17 ) { 
	if( rmin < 0.81 ) { 
	if( rslope >= -35747 ) { 
		if( lmin >= 1.63 ) { return new Prediction("NAT", 5.37, 0); }
	if( lmin < 1.63 ) { 
		if( lmin >= 0.04 ) { return new Prediction("AT", 11.82, 0.82); }
	if( lmin < 0.04 ) { 
		if( lslope >= -20829.5 ) { return new Prediction("NAT", 5.37, 0); }
	if( lslope < -20829.5 ) { 
		if( lslope >= -22966.5 ) { return new Prediction("AT", 5.37, 0.37); }
	if( lslope < -22966.5 ) { 
		if( rslope >= -32574.5 ) { return new Prediction("NAT", 9.67, 0); }
	if( rslope < -32574.5 ) { 
	if( lmin >= -7 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 3.22, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 3.22, 0.22); }
	}
		if( lmin < -7 ) { return new Prediction("AT", 3.22, 0.22); }
	}
	}
	}
	}
	}
	}
		if( rslope < -35747 ) { return new Prediction("NAT", 33.3, 0); }
	}
		if( rmin >= 0.81 ) { return new Prediction("NAT", 91.32, 0); }
	}
	}
return null;
}
private Prediction runTree50() {
	if( rmin < -4.83 ) { 
	if( lmin >= -8.97 ) { 
	if( max >= 0.26 ) { 
		if( lmin >= -2.43 ) { return new Prediction("NAT", 21.54, 0); }
	if( lmin < -2.43 ) { 
	if( lslope >= -19169 ) { 
	if( rslope < -5322.5 ) { 
	if( max < 6.31 ) { 
	if( rmin < -6.99 ) { 
		if( lmin < -8.71 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lmin >= -8.71 ) { return new Prediction("NAT", 10.77, 0); }
	}
	if( rmin >= -6.99 ) { 
		if( lmin >= -4.93 ) { return new Prediction("NAT", 2.15, 0); }
	if( lmin < -4.93 ) { 
		if( rmin >= -5.63 ) { return new Prediction("NAT", 1.08, 0); }
		if( rmin < -5.63 ) { return new Prediction("AT", 8.62, 0.62); }
	}
	}
	}
		if( max >= 6.31 ) { return new Prediction("AT", 20.46, 1.46); }
	}
		if( rslope >= -5322.5 ) { return new Prediction("NAT", 5.39, 0); }
	}
		if( lslope < -19169 ) { return new Prediction("NAT", 8.62, 0); }
	}
	}
		if( max < 0.26 ) { return new Prediction("NAT", 73.24, 0); }
	}
	if( lmin < -8.97 ) { 
	if( max >= 3.27 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 2.15, 0); }
	if( lmin >= -23.72 ) { 
	if( lslope < -11900 ) { 
	if( lslope < -14749.5 ) { 
	if( rslope >= -19885 ) { 
	if( lmin < -11.52 ) { 
		if( lmin >= -12 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin < -12 ) { return new Prediction("AT", 4.31, 0.31); }
	}
		if( lmin >= -11.52 ) { return new Prediction("AT", 25.85, 1.85); }
	}
	if( rslope < -19885 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 3.23, 0); }
		if( max >= 18.14 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( lslope >= -14749.5 ) { return new Prediction("NAT", 6.46, 0); }
	}
	if( lslope >= -11900 ) { 
		if( rmin >= -16.19 ) { return new Prediction("AT", 43.08, 3.08); }
	if( rmin < -16.19 ) { 
		if( lmin >= -16.39 ) { return new Prediction("AT", 5.39, 0.39); }
	if( lmin < -16.39 ) { 
		if( lmin < -20.69 ) { return new Prediction("AT", 2.15, 0.15); }
		if( lmin >= -20.69 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
	}
	}
	}
	if( max < 3.27 ) { 
	if( rmin < -15.52 ) { 
		if( max < 1.67 ) { return new Prediction("AT", 14, 1); }
		if( max >= 1.67 ) { return new Prediction("NAT", 1.08, 0); }
	}
	if( rmin >= -15.52 ) { 
	if( max >= 0.33 ) { 
		if( lmin < -13.12 ) { return new Prediction("NAT", 12.92, 0); }
		if( lmin >= -13.12 ) { return new Prediction("AT", 9.69, 0.69); }
	}
		if( max < 0.33 ) { return new Prediction("NAT", 19.39, 0); }
	}
	}
	}
	}
	if( rmin >= -4.83 ) { 
	if( max < 13.14 ) { 
	if( max >= 5.81 ) { 
		if( lmin >= 4.14 ) { return new Prediction("NAT", 91.55, 0); }
	if( lmin < 4.14 ) { 
		if( lslope >= -4739.5 ) { return new Prediction("NAT", 25.85, 0); }
	if( lslope < -4739.5 ) { 
		if( lslope < -34130.5 ) { return new Prediction("NAT", 21.54, 0); }
	if( lslope >= -34130.5 ) { 
	if( max < 7.05 ) { 
	if( lmin < -8.42 ) { 
		if( max < 6.07 ) { return new Prediction("AT", 2.15, 0.15); }
		if( max >= 6.07 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lmin >= -8.42 ) { return new Prediction("NAT", 18.31, 0); }
	}
	if( max >= 7.05 ) { 
	if( lmin < 2.02 ) { 
	if( rmin < -1.65 ) { 
		if( max >= 8.39 ) { return new Prediction("AT", 10.77, 0.77); }
	if( max < 8.39 ) { 
		if( max >= 8.31 ) { return new Prediction("NAT", 2.15, 0); }
		if( max < 8.31 ) { return new Prediction("AT", 3.23, 0.23); }
	}
	}
	if( rmin >= -1.65 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 8.62, 0); }
	if( rmin < 6.73 ) { 
	if( rmin >= 2.73 ) { 
		if( lmin < -0.06 ) { return new Prediction("AT", 6.46, 0.46); }
		if( lmin >= -0.06 ) { return new Prediction("NAT", 2.15, 0); }
	}
	if( rmin < 2.73 ) { 
	if( max < 11.47 ) { 
		if( lmin < -2.59 ) { return new Prediction("NAT", 9.69, 0); }
	if( lmin >= -2.59 ) { 
		if( rmin < -0.34 ) { return new Prediction("AT", 2.15, 0.15); }
	if( rmin >= -0.34 ) { 
		if( lslope < -12972.5 ) { return new Prediction("NAT", 7.54, 0); }
	if( lslope >= -12972.5 ) { 
		if( max >= 8.93 ) { return new Prediction("NAT", 1.08, 0); }
		if( max < 8.93 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
		if( max >= 11.47 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
		if( lmin >= 2.02 ) { return new Prediction("AT", 7.54, 0.54); }
	}
	}
	}
	}
	}
	if( max < 5.81 ) { 
	if( lmin >= -17.85 ) { 
	if( rmin >= 0.34 ) { 
	if( lmin >= 0.39 ) { 
	if( rmin < 0.39 ) { 
		if( lmin < 0.7 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= 0.7 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	if( rmin >= 0.39 ) { 
	if( max >= 4.2 ) { 
		if( lmin < 0.56 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lmin >= 0.56 ) { return new Prediction("NAT", 9.69, 0); }
	}
		if( max < 4.2 ) { return new Prediction("NAT", 20.46, 0); }
	}
	}
		if( lmin < 0.39 ) { return new Prediction("NAT", 39.85, 0); }
	}
		if( rmin < 0.34 ) { return new Prediction("NAT", 206.79, 0); }
	}
		if( lmin < -17.85 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	if( max >= 13.14 ) { 
	if( lmin < 1.46 ) { 
		if( rmin < 1.49 ) { return new Prediction("AT", 30.16, 2.16); }
	if( rmin >= 1.49 ) { 
	if( lmin < -1.04 ) { 
		if( max >= 21.72 ) { return new Prediction("AT", 5.39, 0.39); }
		if( max < 21.72 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lmin >= -1.04 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( lmin >= 1.46 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
return null;
}
private Prediction runTree51() {
	if( lmin < -7.73 ) { 
	if( rslope >= -19885 ) { 
	if( max < 11.09 ) { 
	if( lslope >= -4851.5 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 11.64, 0); }
	if( lslope < -4149.5 ) { 
		if( max < -2.15 ) { return new Prediction("NAT", 4.23, 0); }
		if( max >= -2.15 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( lslope < -4851.5 ) { 
	if( rmin < -9.28 ) { 
	if( lslope < -10781.5 ) { 
		if( max >= 6.15 ) { return new Prediction("AT", 12.7, 0.7); }
		if( max < 6.15 ) { return new Prediction("NAT", 11.64, 0); }
	}
	if( lslope >= -10781.5 ) { 
	if( lmin < -17.77 ) { 
		if( max < 4.82 ) { return new Prediction("AT", 4.23, 0.23); }
		if( max >= 4.82 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lmin >= -17.77 ) { return new Prediction("AT", 32.81, 1.81); }
	}
	}
	if( rmin >= -9.28 ) { 
		if( rmin < -8.75 ) { return new Prediction("NAT", 4.23, 0); }
	if( rmin >= -8.75 ) { 
		if( lslope >= -10165.5 ) { return new Prediction("AT", 12.7, 0.7); }
	if( lslope < -10165.5 ) { 
	if( rslope < -14689.5 ) { 
	if( lmin >= -11.29 ) { 
	if( max >= 1.84 ) { 
		if( max < 10.46 ) { return new Prediction("AT", 9.52, 0.52); }
		if( max >= 10.46 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max < 1.84 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( lmin < -11.29 ) { 
	if( rslope >= -17995 ) { 
		if( lmin >= -11.84 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -11.84 ) { return new Prediction("AT", 2.12, 0.12); }
	}
		if( rslope < -17995 ) { return new Prediction("NAT", 4.23, 0); }
	}
	}
	if( rslope >= -14689.5 ) { 
		if( rmin >= -4.06 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < -4.06 ) { return new Prediction("NAT", 8.47, 0); }
	}
	}
	}
	}
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 66.67, 3.67); }
	}
	if( rslope < -19885 ) { 
	if( lmin < -7.87 ) { 
		if( max >= 15.71 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 15.71 ) { return new Prediction("NAT", 34.92, 0); }
	}
		if( lmin >= -7.87 ) { return new Prediction("AT", 3.17, 0.17); }
	}
	}
	if( lmin >= -7.73 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 88.9, 0); }
	if( lmin < 3.98 ) { 
		if( max >= 15.69 ) { return new Prediction("AT", 14.82, 0.82); }
	if( max < 15.69 ) { 
	if( rslope >= -30708 ) { 
		if( lslope >= -5177.5 ) { return new Prediction("NAT", 30.69, 0); }
	if( lslope < -5177.5 ) { 
		if( lslope >= -5999.5 ) { return new Prediction("AT", 11.64, 0.64); }
	if( lslope < -5999.5 ) { 
		if( max < 3.09 ) { return new Prediction("NAT", 29.63, 0); }
	if( max >= 3.09 ) { 
		if( rmin >= 5.95 ) { return new Prediction("NAT", 17.99, 0); }
	if( rmin < 5.95 ) { 
		if( rslope < -29051.5 ) { return new Prediction("AT", 8.47, 0.47); }
	if( rslope >= -29051.5 ) { 
	if( max >= 8.77 ) { 
	if( lmin < 2.06 ) { 
	if( lmin >= -0.85 ) { 
	if( max < 11.78 ) { 
		if( lmin >= -0.08 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lmin < -0.08 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max >= 11.78 ) { return new Prediction("NAT", 9.52, 0); }
	}
	if( lmin < -0.85 ) { 
		if( max < 10.53 ) { return new Prediction("NAT", 2.12, 0); }
	if( max >= 10.53 ) { 
	if( rslope >= -16080 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 3.17, 0.17); }
		if( lmin < -1.14 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rslope < -16080 ) { return new Prediction("AT", 9.52, 0.52); }
	}
	}
	}
		if( lmin >= 2.06 ) { return new Prediction("AT", 10.58, 0.58); }
	}
	if( max < 8.77 ) { 
	if( lmin >= -5.19 ) { 
	if( lslope < -12256.5 ) { 
	if( rmin >= -0.21 ) { 
	if( max >= 4.58 ) { 
	if( lslope < -13401 ) { 
	if( lmin < -0.46 ) { 
		if( lmin < -2.66 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin >= -2.66 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin >= -0.46 ) { return new Prediction("NAT", 9.52, 0); }
	}
		if( lslope >= -13401 ) { return new Prediction("AT", 3.17, 0.17); }
	}
		if( max < 4.58 ) { return new Prediction("AT", 5.29, 0.29); }
	}
	if( rmin < -0.21 ) { 
		if( max < 3.3 ) { return new Prediction("AT", 1.06, 0.06); }
	if( max >= 3.3 ) { 
	if( rmin < -12.69 ) { 
		if( max < 6.16 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 6.16 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rmin >= -12.69 ) { return new Prediction("NAT", 23.28, 0); }
	}
	}
	}
		if( lslope >= -12256.5 ) { return new Prediction("NAT", 31.75, 0); }
	}
	if( lmin < -5.19 ) { 
	if( rmin < -4.66 ) { 
	if( rslope < -10417 ) { 
		if( max >= 4.52 ) { return new Prediction("NAT", 2.12, 0); }
		if( max < 4.52 ) { return new Prediction("AT", 2.12, 0.12); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 9.52, 0.52); }
	}
		if( rmin >= -4.66 ) { return new Prediction("NAT", 5.29, 0); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( rslope < -30708 ) { 
	if( rslope >= -36810.5 ) { 
		if( rmin >= -0.24 ) { return new Prediction("NAT", 21.17, 0); }
	if( rmin < -0.24 ) { 
	if( max >= 6.21 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 2.12, 0.12); }
	}
		if( max < 6.21 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
		if( rslope < -36810.5 ) { return new Prediction("NAT", 43.39, 0); }
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 212.72, 0); }
	}
return null;
}
private Prediction runTree52() {
	if( max < 10.58 ) { 
	if( lmin < -7.73 ) { 
	if( lslope >= -19730.5 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 8.58, 0.02); }
	if( lslope < -4149.5 ) { 
	if( lslope >= -10213 ) { 
	if( lmin < -17.77 ) { 
		if( lmin >= -18.41 ) { return new Prediction("NAT", 3.22, 0.01); }
		if( lmin < -18.41 ) { return new Prediction("AT", 4.29, 0.28); }
	}
	if( lmin >= -17.77 ) { 
		if( max < -6.88 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= -6.88 ) { return new Prediction("AT", 39.7, 2.61); }
	}
	}
	if( lslope < -10213 ) { 
	if( max >= 6.79 ) { 
		if( rmin < -8.34 ) { return new Prediction("AT", 13.95, 0.92); }
	if( rmin >= -8.34 ) { 
		if( rmin < -6.79 ) { return new Prediction("NAT", 2.15, 0.01); }
		if( rmin >= -6.79 ) { return new Prediction("AT", 5.36, 0.35); }
	}
	}
	if( max < 6.79 ) { 
	if( lslope < -17477 ) { 
	if( lmin >= -12.26 ) { 
		if( max < 0.84 ) { return new Prediction("NAT", 3.22, 0.01); }
		if( max >= 0.84 ) { return new Prediction("AT", 7.51, 0.49); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 4.29, 0.01); }
	}
	if( lslope >= -17477 ) { 
		if( rslope < -10795.5 ) { return new Prediction("NAT", 24.68, 0.06); }
	if( rslope >= -10795.5 ) { 
		if( lmin >= -11.92 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -11.92 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	}
	if( lslope < -19730.5 ) { 
		if( max < 5.41 ) { return new Prediction("NAT", 28.97, 0.07); }
	if( max >= 5.41 ) { 
		if( lmin >= -7.97 ) { return new Prediction("AT", 2.15, 0.14); }
		if( lmin < -7.97 ) { return new Prediction("NAT", 5.36, 0.01); }
	}
	}
	}
	if( lmin >= -7.73 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 232.83, 0.55); }
	if( max >= 3.17 ) { 
	if( rmin < 4.25 ) { 
	if( lmin >= -5.51 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 41.85, 0.1); }
	if( rslope < -5426 ) { 
		if( lslope < -29877 ) { return new Prediction("NAT", 37.55, 0.09); }
	if( lslope >= -29877 ) { 
		if( rslope < -29051.5 ) { return new Prediction("AT", 4.29, 0.28); }
	if( rslope >= -29051.5 ) { 
	if( lmin >= -0.85 ) { 
	if( rslope >= -27154 ) { 
	if( max >= 7.32 ) { 
	if( rmin < -3.41 ) { 
		if( max >= 8.05 ) { return new Prediction("NAT", 3.22, 0.01); }
		if( max < 8.05 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rmin >= -3.41 ) { 
	if( lslope < -9322 ) { 
		if( rmin >= 3.16 ) { return new Prediction("NAT", 1.07, 0); }
	if( rmin < 3.16 ) { 
		if( lmin >= 5.59 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < 5.59 ) { return new Prediction("AT", 7.51, 0.49); }
	}
	}
		if( lslope >= -9322 ) { return new Prediction("AT", 4.29, 0.28); }
	}
	}
	if( max < 7.32 ) { 
	if( rslope >= -26757.5 ) { 
	if( rmin >= -0.21 ) { 
		if( rmin < 0.89 ) { return new Prediction("AT", 3.22, 0.21); }
		if( rmin >= 0.89 ) { return new Prediction("NAT", 11.8, 0.03); }
	}
		if( rmin < -0.21 ) { return new Prediction("NAT", 12.88, 0.03); }
	}
		if( rslope < -26757.5 ) { return new Prediction("AT", 4.29, 0.28); }
	}
	}
		if( rslope < -27154 ) { return new Prediction("NAT", 11.8, 0.03); }
	}
	if( lmin < -0.85 ) { 
	if( max < 3.31 ) { 
		if( lslope < -17253.5 ) { return new Prediction("AT", 3.22, 0.21); }
		if( lslope >= -17253.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max >= 3.31 ) { return new Prediction("NAT", 47.21, 0.11); }
	}
	}
	}
	}
	}
	if( lmin < -5.51 ) { 
	if( rmin < -4.08 ) { 
		if( lmin >= -6.24 ) { return new Prediction("AT", 13.95, 0.92); }
	if( lmin < -6.24 ) { 
		if( max < 6.31 ) { return new Prediction("NAT", 4.29, 0.01); }
		if( max >= 6.31 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rmin >= -4.08 ) { return new Prediction("NAT", 13.95, 0.03); }
	}
	}
		if( rmin >= 4.25 ) { return new Prediction("NAT", 90.13, 0.21); }
	}
	}
	}
	if( max >= 10.58 ) { 
	if( rmin < -1.07 ) { 
	if( lslope < -19947.5 ) { 
		if( rmin < -3.24 ) { return new Prediction("NAT", 6.44, 0.02); }
		if( rmin >= -3.24 ) { return new Prediction("AT", 6.44, 0.42); }
	}
	if( lslope >= -19947.5 ) { 
	if( rmin < -14.95 ) { 
		if( max >= 30.59 ) { return new Prediction("AT", 3.22, 0.21); }
		if( max < 30.59 ) { return new Prediction("NAT", 3.22, 0.01); }
	}
		if( rmin >= -14.95 ) { return new Prediction("AT", 61.16, 4.02); }
	}
	}
	if( rmin >= -1.07 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 23.61, 0.06); }
	if( lmin < 3.6 ) { 
	if( lslope < -5116 ) { 
	if( lslope >= -18008 ) { 
		if( rmin >= 2.97 ) { return new Prediction("AT", 13.95, 0.92); }
	if( rmin < 2.97 ) { 
		if( lslope >= -15121 ) { return new Prediction("NAT", 2.15, 0.01); }
		if( lslope < -15121 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
	if( lslope < -18008 ) { 
	if( max >= 12.62 ) { 
		if( rmin >= 9.12 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < 9.12 ) { return new Prediction("AT", 3.22, 0.21); }
	}
		if( max < 12.62 ) { return new Prediction("NAT", 6.44, 0.02); }
	}
	}
	if( lslope >= -5116 ) { 
		if( lmin < -8.7 ) { return new Prediction("AT", 2.15, 0.14); }
		if( lmin >= -8.7 ) { return new Prediction("NAT", 7.51, 0.02); }
	}
	}
	}
	}
return null;
}
private Prediction runTree53() {
	if( rmin >= -7.46 ) { 
	if( lmin < -10.17 ) { 
	if( lslope >= -16849.5 ) { 
	if( max < 4.32 ) { 
		if( lmin < -14.56 ) { return new Prediction("NAT", 2.15, 0.01); }
		if( lmin >= -14.56 ) { return new Prediction("AT", 2.15, 0.14); }
	}
		if( max >= 4.32 ) { return new Prediction("AT", 35.45, 2.37); }
	}
	if( lslope < -16849.5 ) { 
	if( max < 14.47 ) { 
		if( lmin < -11.16 ) { return new Prediction("NAT", 10.74, 0.03); }
	if( lmin >= -11.16 ) { 
		if( lslope < -27460.5 ) { return new Prediction("NAT", 3.22, 0.01); }
		if( lslope >= -27460.5 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( max >= 14.47 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
	if( lmin >= -10.17 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 122.47, 0.29); }
	if( lslope < -5395 ) { 
		if( lslope < -36676 ) { return new Prediction("NAT", 96.69, 0.23); }
	if( lslope >= -36676 ) { 
	if( rmin < 12 ) { 
	if( rmin < 4.24 ) { 
	if( max < 8.76 ) { 
	if( rmin >= 0.36 ) { 
		if( lslope >= -11776 ) { return new Prediction("NAT", 26.86, 0.06); }
	if( lslope < -11776 ) { 
	if( max >= 3.5 ) { 
	if( rmin >= 0.41 ) { 
	if( rslope >= -27154 ) { 
		if( lmin >= 0.91 ) { return new Prediction("NAT", 6.45, 0.02); }
	if( lmin < 0.91 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 2.15, 0.01); }
	if( max < 7.59 ) { 
	if( rmin < 1.14 ) { 
		if( rslope < -25091.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rslope >= -25091.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin >= 1.14 ) { return new Prediction("AT", 5.37, 0.36); }
	}
	}
	}
		if( rslope < -27154 ) { return new Prediction("NAT", 11.82, 0.03); }
	}
		if( rmin < 0.41 ) { return new Prediction("AT", 3.22, 0.22); }
	}
		if( max < 3.5 ) { return new Prediction("NAT", 19.34, 0.05); }
	}
	}
	if( rmin < 0.36 ) { 
	if( lslope >= -8868 ) { 
		if( lslope < -8500 ) { return new Prediction("AT", 3.22, 0.22); }
	if( lslope >= -8500 ) { 
		if( max >= 7.14 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 7.14 ) { return new Prediction("NAT", 13.97, 0.03); }
	}
	}
	if( lslope < -8868 ) { 
	if( lslope < -34508 ) { 
		if( lmin < -5.39 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -5.39 ) { return new Prediction("NAT", 2.15, 0.01); }
	}
		if( lslope >= -34508 ) { return new Prediction("NAT", 174.04, 0.41); }
	}
	}
	}
	if( max >= 8.76 ) { 
	if( rslope >= -21351.5 ) { 
	if( lslope >= -14016 ) { 
		if( rslope < -12891.5 ) { return new Prediction("NAT", 3.22, 0.01); }
	if( rslope >= -12891.5 ) { 
	if( rslope < -6380.5 ) { 
		if( max < 10.82 ) { return new Prediction("AT", 10.74, 0.72); }
	if( max >= 10.82 ) { 
		if( max < 14.27 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 14.27 ) { return new Prediction("AT", 3.22, 0.22); }
	}
	}
		if( rslope >= -6380.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lslope < -14016 ) { return new Prediction("AT", 20.41, 1.36); }
	}
	if( rslope < -21351.5 ) { 
	if( rmin < -0.56 ) { 
		if( lmin >= -3.31 ) { return new Prediction("AT", 4.3, 0.29); }
		if( lmin < -3.31 ) { return new Prediction("NAT", 3.22, 0.01); }
	}
		if( rmin >= -0.56 ) { return new Prediction("NAT", 4.3, 0.01); }
	}
	}
	}
		if( rmin >= 4.24 ) { return new Prediction("NAT", 63.38, 0.15); }
	}
		if( rmin >= 12 ) { return new Prediction("AT", 4.3, 0.29); }
	}
	}
	}
	}
	if( rmin < -7.46 ) { 
	if( max < 6.55 ) { 
	if( rslope >= -11119 ) { 
	if( max >= -2.19 ) { 
		if( lmin >= -8.17 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -8.17 ) { return new Prediction("AT", 38.68, 2.58); }
	}
	if( max < -2.19 ) { 
		if( lmin < -15.37 ) { return new Prediction("AT", 2.15, 0.14); }
		if( lmin >= -15.37 ) { return new Prediction("NAT", 8.59, 0.02); }
	}
	}
	if( rslope < -11119 ) { 
	if( rmin >= -7.87 ) { 
		if( lmin < -4.06 ) { return new Prediction("AT", 5.37, 0.36); }
		if( lmin >= -4.06 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin < -7.87 ) { return new Prediction("NAT", 56.94, 0.13); }
	}
	}
	if( max >= 6.55 ) { 
		if( lmin >= -0.16 ) { return new Prediction("NAT", 2.15, 0.01); }
	if( lmin < -0.16 ) { 
	if( lslope >= -34514 ) { 
		if( lmin >= -9.55 ) { return new Prediction("AT", 36.53, 2.44); }
	if( lmin < -9.55 ) { 
	if( max < 9.82 ) { 
		if( max >= 9.05 ) { return new Prediction("NAT", 3.22, 0.01); }
	if( max < 9.05 ) { 
		if( rmin < -9.68 ) { return new Prediction("AT", 6.45, 0.43); }
		if( rmin >= -9.68 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( max >= 9.82 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -23.72 ) { return new Prediction("AT", 19.34, 1.29); }
	}
	}
	}
		if( lslope < -34514 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
return null;
}
private Prediction runTree54() {
	if( lslope < -19761 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 180.08, 0); }
	if( max >= 3.17 ) { 
		if( rmin >= 0.41 ) { return new Prediction("NAT", 87.41, 0); }
	if( rmin < 0.41 ) { 
	if( lslope >= -36141 ) { 
	if( rslope < -29051.5 ) { 
		if( rmin >= -2.97 ) { return new Prediction("AT", 7.37, 0.37); }
	if( rmin < -2.97 ) { 
		if( max < 4.81 ) { return new Prediction("NAT", 2.11, 0); }
	if( max >= 4.81 ) { 
		if( lmin < -6.75 ) { return new Prediction("AT", 4.21, 0.21); }
		if( lmin >= -6.75 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
	}
	if( rslope >= -29051.5 ) { 
	if( rslope >= -28339 ) { 
	if( lmin >= -4.85 ) { 
	if( lmin < 2.46 ) { 
		if( max < 11.26 ) { return new Prediction("AT", 8.42, 0.42); }
		if( max >= 11.26 ) { return new Prediction("NAT", 1.05, 0); }
	}
		if( lmin >= 2.46 ) { return new Prediction("NAT", 1.05, 0); }
	}
		if( lmin < -4.85 ) { return new Prediction("NAT", 7.37, 0); }
	}
		if( rslope < -28339 ) { return new Prediction("NAT", 10.53, 0); }
	}
	}
		if( lslope < -36141 ) { return new Prediction("NAT", 20.01, 0); }
	}
	}
	}
	if( lslope >= -19761 ) { 
	if( rmin >= -7.76 ) { 
	if( max >= 10.55 ) { 
	if( lmin < 4.97 ) { 
	if( lslope < -2495.99 ) { 
	if( max < 11.47 ) { 
		if( lmin >= -0.48 ) { return new Prediction("AT", 6.32, 0.32); }
	if( lmin < -0.48 ) { 
		if( lmin >= -5.47 ) { return new Prediction("NAT", 1.05, 0); }
		if( lmin < -5.47 ) { return new Prediction("AT", 2.11, 0.11); }
	}
	}
		if( max >= 11.47 ) { return new Prediction("AT", 46.34, 2.34); }
	}
	if( lslope >= -2495.99 ) { 
		if( lmin >= -9.25 ) { return new Prediction("NAT", 5.27, 0); }
		if( lmin < -9.25 ) { return new Prediction("AT", 3.16, 0.16); }
	}
	}
		if( lmin >= 4.97 ) { return new Prediction("NAT", 15.8, 0); }
	}
	if( max < 10.55 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 96.88, 0); }
	if( lslope < -5785.5 ) { 
	if( lmin < -8.19 ) { 
		if( max >= 9.24 ) { return new Prediction("AT", 4.21, 0.21); }
	if( max < 9.24 ) { 
	if( lslope < -10574 ) { 
	if( rslope >= -13819 ) { 
		if( rmin < -3.39 ) { return new Prediction("NAT", 8.42, 0); }
		if( rmin >= -3.39 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	if( rslope < -13819 ) { 
		if( lmin < -16.94 ) { return new Prediction("NAT", 3.16, 0); }
	if( lmin >= -16.94 ) { 
	if( max < 9.18 ) { 
		if( lslope >= -18315.5 ) { return new Prediction("AT", 7.37, 0.37); }
	if( lslope < -18315.5 ) { 
		if( rmin < -5.25 ) { return new Prediction("AT", 2.11, 0.11); }
		if( rmin >= -5.25 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
		if( max >= 9.18 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
	}
		if( lslope >= -10574 ) { return new Prediction("AT", 4.21, 0.21); }
	}
	}
	if( lmin >= -8.19 ) { 
		if( lslope >= -6005.5 ) { return new Prediction("AT", 4.21, 0.21); }
	if( lslope < -6005.5 ) { 
	if( max < 5.52 ) { 
		if( rslope < -20459.5 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rslope >= -20459.5 ) { return new Prediction("NAT", 116.89, 0); }
	}
	if( max >= 5.52 ) { 
	if( max < 7.54 ) { 
	if( lmin < 0.63 ) { 
	if( rmin < 1.79 ) { 
	if( lmin < -5.05 ) { 
		if( lslope >= -10373 ) { return new Prediction("AT", 2.11, 0.11); }
		if( lslope < -10373 ) { return new Prediction("NAT", 1.05, 0); }
	}
		if( lmin >= -5.05 ) { return new Prediction("NAT", 4.21, 0); }
	}
		if( rmin >= 1.79 ) { return new Prediction("AT", 6.32, 0.32); }
	}
		if( lmin >= 0.63 ) { return new Prediction("NAT", 9.48, 0); }
	}
		if( max >= 7.54 ) { return new Prediction("NAT", 37.91, 0); }
	}
	}
	}
	}
	}
	}
	if( rmin < -7.76 ) { 
	if( max < 5.27 ) { 
	if( lslope < -10474 ) { 
	if( lslope < -17473.5 ) { 
		if( rmin >= -7.87 ) { return new Prediction("AT", 3.16, 0.16); }
		if( rmin < -7.87 ) { return new Prediction("NAT", 1.05, 0); }
	}
	if( lslope >= -17473.5 ) { 
		if( rslope >= -11065 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rslope < -11065 ) { return new Prediction("NAT", 25.27, 0); }
	}
	}
	if( lslope >= -10474 ) { 
		if( rslope < -5911.5 ) { return new Prediction("AT", 24.22, 1.22); }
	if( rslope >= -5911.5 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 7.37, 0); }
	if( lslope < -4149.5 ) { 
		if( max >= -3.62 ) { return new Prediction("AT", 2.11, 0.11); }
		if( max < -3.62 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
	}
	}
	if( max >= 5.27 ) { 
	if( rslope < -2285.51 ) { 
	if( rmin < -16.38 ) { 
		if( lmin < -15.3 ) { return new Prediction("NAT", 2.11, 0); }
	if( lmin >= -15.3 ) { 
		if( lmin >= -0.24 ) { return new Prediction("NAT", 1.05, 0); }
		if( lmin < -0.24 ) { return new Prediction("AT", 3.16, 0.16); }
	}
	}
	if( rmin >= -16.38 ) { 
	if( max < 8.36 ) { 
		if( max >= 7.58 ) { return new Prediction("NAT", 2.11, 0); }
		if( max < 7.58 ) { return new Prediction("AT", 15.8, 0.8); }
	}
		if( max >= 8.36 ) { return new Prediction("AT", 34.75, 1.75); }
	}
	}
		if( rslope >= -2285.51 ) { return new Prediction("NAT", 3.16, 0); }
	}
	}
	}
return null;
}
private Prediction runTree55() {
	if( lmin < -7.73 ) { 
		if( max >= 13.66 ) { return new Prediction("AT", 61.61, 3.47); }
	if( max < 13.66 ) { 
	if( lslope < -10474.5 ) { 
	if( max < 4.99 ) { 
	if( max >= 1.61 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 21.25, 0.05); }
	if( lmin >= -12.19 ) { 
	if( lmin >= -10.42 ) { 
		if( lmin < -8.15 ) { return new Prediction("NAT", 9.56, 0.02); }
		if( lmin >= -8.15 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin < -10.42 ) { return new Prediction("AT", 7.44, 0.42); }
	}
	}
		if( max < 1.61 ) { return new Prediction("NAT", 19.12, 0.04); }
	}
	if( max >= 4.99 ) { 
	if( rslope >= -19885 ) { 
	if( max >= 8.05 ) { 
		if( max >= 9.6 ) { return new Prediction("AT", 19.12, 1.08); }
	if( max < 9.6 ) { 
		if( max < 9.18 ) { return new Prediction("AT", 8.5, 0.48); }
		if( max >= 9.18 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( max < 8.05 ) { 
	if( lmin < -10.38 ) { 
		if( max < 6.92 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 6.92 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin >= -10.38 ) { return new Prediction("NAT", 4.25, 0.01); }
	}
	}
	if( rslope < -19885 ) { 
		if( max >= 5.98 ) { return new Prediction("NAT", 10.62, 0.02); }
		if( max < 5.98 ) { return new Prediction("AT", 5.31, 0.3); }
	}
	}
	}
	if( lslope >= -10474.5 ) { 
		if( lslope < -4844 ) { return new Prediction("AT", 55.24, 3.11); }
	if( lslope >= -4844 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 11.68, 0.03); }
	if( lslope < -4149.5 ) { 
		if( rmin >= -9.59 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < -9.59 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	}
	if( lmin >= -7.73 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 112.6, 0.26); }
	if( lmin < 3.98 ) { 
	if( rslope >= -36810.5 ) { 
	if( max < 6.32 ) { 
	if( rmin >= -6.08 ) { 
		if( rmin < 0.01 ) { return new Prediction("NAT", 150.84, 0.35); }
	if( rmin >= 0.01 ) { 
		if( lslope >= -17097 ) { return new Prediction("NAT", 45.68, 0.11); }
	if( lslope < -17097 ) { 
	if( rslope >= -30698 ) { 
	if( rmin < 0.51 ) { 
		if( rslope >= -26857.5 ) { return new Prediction("NAT", 1.06, 0); }
		if( rslope < -26857.5 ) { return new Prediction("AT", 6.37, 0.36); }
	}
	if( rmin >= 0.51 ) { 
	if( lslope < -20781 ) { 
		if( max < 3.9 ) { return new Prediction("NAT", 14.87, 0.03); }
	if( max >= 3.9 ) { 
		if( max >= 4.58 ) { return new Prediction("NAT", 5.31, 0.01); }
		if( max < 4.58 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
		if( lslope >= -20781 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
		if( rslope < -30698 ) { return new Prediction("NAT", 17, 0.04); }
	}
	}
	}
	if( rmin < -6.08 ) { 
		if( max < 1.1 ) { return new Prediction("NAT", 17, 0.04); }
	if( max >= 1.1 ) { 
	if( lmin < -4.27 ) { 
	if( rmin >= -8.65 ) { 
		if( lslope < -4631.5 ) { return new Prediction("AT", 9.56, 0.54); }
		if( lslope >= -4631.5 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin < -8.65 ) { return new Prediction("NAT", 3.19, 0.01); }
	}
		if( lmin >= -4.27 ) { return new Prediction("NAT", 9.56, 0.02); }
	}
	}
	}
	if( max >= 6.32 ) { 
	if( rmin < 5.89 ) { 
	if( max >= 10.84 ) { 
	if( rslope < -5316.5 ) { 
	if( max < 12.03 ) { 
		if( lslope >= -10739.5 ) { return new Prediction("AT", 7.44, 0.42); }
	if( lslope < -10739.5 ) { 
		if( lmin >= -0.08 ) { return new Prediction("AT", 4.25, 0.24); }
	if( lmin < -0.08 ) { 
		if( lmin >= -1.95 ) { return new Prediction("NAT", 3.19, 0.01); }
	if( lmin < -1.95 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 11.09 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
	}
	}
		if( max >= 12.03 ) { return new Prediction("AT", 20.18, 1.14); }
	}
		if( rslope >= -5316.5 ) { return new Prediction("NAT", 2.12, 0); }
	}
	if( max < 10.84 ) { 
	if( lmin < 2.07 ) { 
	if( lmin >= -5.3 ) { 
	if( lmin >= -1.11 ) { 
	if( rmin < 1.69 ) { 
		if( max < 7.5 ) { return new Prediction("NAT", 8.5, 0.02); }
	if( max >= 7.5 ) { 
		if( lmin < -0.02 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -0.02 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
		if( rmin >= 1.69 ) { return new Prediction("AT", 4.25, 0.24); }
	}
		if( lmin < -1.11 ) { return new Prediction("NAT", 25.49, 0.06); }
	}
	if( lmin < -5.3 ) { 
		if( max < 7.82 ) { return new Prediction("AT", 4.25, 0.24); }
	if( max >= 7.82 ) { 
	if( lmin >= -6.14 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin < -6.14 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
	}
	if( lmin >= 2.07 ) { 
		if( rmin < -2.54 ) { return new Prediction("NAT", 2.12, 0); }
		if( rmin >= -2.54 ) { return new Prediction("AT", 8.5, 0.48); }
	}
	}
	}
	if( rmin >= 5.89 ) { 
		if( max >= 7.52 ) { return new Prediction("NAT", 21.25, 0.05); }
	if( max < 7.52 ) { 
		if( lmin < -1.53 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin >= -1.53 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
		if( rslope < -36810.5 ) { return new Prediction("NAT", 90.29, 0.21); }
	}
	}
return null;
}
private Prediction runTree56() {
	if( lmin >= -8.27 ) { 
	if( max < 3.17 ) { 
		if( rslope < -6064.5 ) { return new Prediction("NAT", 235.2, 0.55); }
	if( rslope >= -6064.5 ) { 
		if( lslope < -5622.5 ) { return new Prediction("AT", 2.17, 0.16); }
		if( lslope >= -5622.5 ) { return new Prediction("NAT", 27.1, 0.06); }
	}
	}
	if( max >= 3.17 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 99.72, 0.23); }
	if( lmin < 3.98 ) { 
	if( max < 10.58 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 44.44, 0.1); }
	if( rslope >= -33045 ) { 
	if( rslope < -6394.5 ) { 
		if( max >= 9.4 ) { return new Prediction("NAT", 15.17, 0.04); }
	if( max < 9.4 ) { 
		if( max >= 8.82 ) { return new Prediction("AT", 7.59, 0.57); }
	if( max < 8.82 ) { 
	if( lmin < -5.04 ) { 
	if( lmin >= -6.45 ) { 
		if( rmin < -8.85 ) { return new Prediction("NAT", 3.25, 0.01); }
	if( rmin >= -8.85 ) { 
	if( max < 6.31 ) { 
		if( lslope < -20618 ) { return new Prediction("NAT", 2.17, 0.01); }
	if( lslope >= -20618 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 5.42, 0.41); }
		if( max >= 5.93 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( max >= 6.31 ) { return new Prediction("AT", 9.75, 0.73); }
	}
	}
		if( lmin < -6.45 ) { return new Prediction("NAT", 5.42, 0.01); }
	}
	if( lmin >= -5.04 ) { 
	if( rslope < -13297.5 ) { 
	if( lmin < 1.21 ) { 
	if( lmin >= -0.93 ) { 
	if( max < 7.63 ) { 
		if( lslope >= -27095.5 ) { return new Prediction("AT", 13.01, 0.98); }
	if( lslope < -27095.5 ) { 
	if( lslope < -27726 ) { 
		if( rslope < -31169.5 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope >= -31169.5 ) { return new Prediction("AT", 6.5, 0.49); }
	}
		if( lslope >= -27726 ) { return new Prediction("NAT", 4.34, 0.01); }
	}
	}
		if( max >= 7.63 ) { return new Prediction("NAT", 4.34, 0.01); }
	}
	if( lmin < -0.93 ) { 
		if( rmin >= -5.98 ) { return new Prediction("NAT", 14.09, 0.03); }
		if( rmin < -5.98 ) { return new Prediction("AT", 2.17, 0.16); }
	}
	}
	if( lmin >= 1.21 ) { 
		if( lslope < -13847.5 ) { return new Prediction("NAT", 15.17, 0.04); }
		if( lslope >= -13847.5 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
		if( rslope >= -13297.5 ) { return new Prediction("NAT", 34.68, 0.08); }
	}
	}
	}
	}
		if( rslope >= -6394.5 ) { return new Prediction("NAT", 31.43, 0.07); }
	}
	}
	if( max >= 10.58 ) { 
	if( rmin < 5.75 ) { 
		if( lslope >= -4493 ) { return new Prediction("NAT", 5.42, 0.01); }
	if( lslope < -4493 ) { 
		if( rmin < -15.6 ) { return new Prediction("NAT", 2.17, 0.01); }
	if( rmin >= -15.6 ) { 
	if( lslope >= -21574 ) { 
	if( max < 11.48 ) { 
		if( max >= 11.18 ) { return new Prediction("NAT", 3.25, 0.01); }
		if( max < 11.18 ) { return new Prediction("AT", 15.17, 1.14); }
	}
		if( max >= 11.48 ) { return new Prediction("AT", 26.01, 1.95); }
	}
	if( lslope < -21574 ) { 
	if( rmin >= -3.1 ) { 
		if( rmin < -0.56 ) { return new Prediction("AT", 2.17, 0.16); }
		if( rmin >= -0.56 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
		if( rmin < -3.1 ) { return new Prediction("NAT", 5.42, 0.01); }
	}
	}
	}
	}
		if( rmin >= 5.75 ) { return new Prediction("NAT", 10.84, 0.03); }
	}
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( max >= 9.74 ) { 
	if( lslope < -19947.5 ) { 
		if( lslope < -26626 ) { return new Prediction("AT", 5.42, 0.41); }
		if( lslope >= -26626 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lslope >= -19947.5 ) { return new Prediction("AT", 61.78, 4.64); }
	}
	if( max < 9.74 ) { 
	if( lslope < -10474.5 ) { 
	if( lslope >= -20737 ) { 
	if( rmin < -9.42 ) { 
		if( max >= 6.15 ) { return new Prediction("AT", 2.17, 0.16); }
		if( max < 6.15 ) { return new Prediction("NAT", 21.68, 0.05); }
	}
	if( rmin >= -9.42 ) { 
	if( max < 7.92 ) { 
	if( max >= 2.61 ) { 
		if( rmin >= -8.94 ) { return new Prediction("NAT", 11.92, 0.03); }
		if( rmin < -8.94 ) { return new Prediction("AT", 2.17, 0.16); }
	}
	if( max < 2.61 ) { 
	if( max < 1.79 ) { 
	if( lslope < -13285 ) { 
		if( lmin >= -9.6 ) { return new Prediction("NAT", 2.17, 0.01); }
		if( lmin < -9.6 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( lslope >= -13285 ) { return new Prediction("NAT", 3.25, 0.01); }
	}
		if( max >= 1.79 ) { return new Prediction("AT", 5.42, 0.41); }
	}
	}
	if( max >= 7.92 ) { 
		if( max < 9.18 ) { return new Prediction("AT", 6.5, 0.49); }
	if( max >= 9.18 ) { 
		if( lmin < -10.45 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin >= -10.45 ) { return new Prediction("AT", 1.08, 0.08); }
	}
	}
	}
	}
		if( lslope < -20737 ) { return new Prediction("NAT", 19.51, 0.05); }
	}
	if( lslope >= -10474.5 ) { 
	if( max >= -3.14 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 36.85, 2.76); }
		if( max >= 8.49 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
		if( max < -3.14 ) { return new Prediction("NAT", 8.67, 0.02); }
	}
	}
	}
return null;
}
private Prediction runTree57() {
	if( lmin >= -8.96 ) { 
	if( lslope < -5766 ) { 
	if( rslope >= -35263.5 ) { 
	if( max >= 10.91 ) { 
	if( lmin >= -0.85 ) { 
		if( rslope < -20544.5 ) { return new Prediction("NAT", 4.29, 0); }
	if( rslope >= -20544.5 ) { 
		if( rmin < -12.38 ) { return new Prediction("NAT", 2.15, 0); }
	if( rmin >= -12.38 ) { 
		if( lmin < 6.82 ) { return new Prediction("AT", 7.51, 0.51); }
		if( lmin >= 6.82 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( lmin < -0.85 ) { 
		if( rmin < 5.49 ) { return new Prediction("AT", 23.61, 1.61); }
	if( rmin >= 5.49 ) { 
		if( lmin >= -2.2 ) { return new Prediction("AT", 2.15, 0.15); }
		if( lmin < -2.2 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	if( max < 10.91 ) { 
	if( rmin >= -5.57 ) { 
		if( lmin < -1.13 ) { return new Prediction("NAT", 115.88, 0); }
	if( lmin >= -1.13 ) { 
	if( max >= 3.5 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 52.57, 0); }
	if( lmin < 3.69 ) { 
		if( lmin < -0.6 ) { return new Prediction("AT", 5.36, 0.36); }
	if( lmin >= -0.6 ) { 
	if( lmin >= 0.24 ) { 
	if( max >= 4.51 ) { 
	if( lmin >= 0.29 ) { 
		if( lslope >= -9992.5 ) { return new Prediction("AT", 2.15, 0.15); }
	if( lslope < -9992.5 ) { 
	if( lmin < 0.72 ) { 
		if( rmin < 2.85 ) { return new Prediction("AT", 3.22, 0.22); }
		if( rmin >= 2.85 ) { return new Prediction("NAT", 4.29, 0); }
	}
	if( lmin >= 0.72 ) { 
		if( lslope >= -11341 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -11341 ) { return new Prediction("NAT", 19.31, 0); }
	}
	}
	}
		if( lmin < 0.29 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	if( max < 4.51 ) { 
		if( lmin >= 0.42 ) { return new Prediction("AT", 5.36, 0.36); }
		if( lmin < 0.42 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lmin < 0.24 ) { return new Prediction("NAT", 13.95, 0); }
	}
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 69.74, 0); }
	}
	}
	if( rmin < -5.57 ) { 
		if( lslope >= -9173.5 ) { return new Prediction("AT", 10.73, 0.73); }
	if( lslope < -9173.5 ) { 
		if( max >= 7.38 ) { return new Prediction("AT", 7.51, 0.51); }
	if( max < 7.38 ) { 
	if( max >= 2.13 ) { 
	if( lmin < -4.74 ) { 
		if( max < 4.57 ) { return new Prediction("AT", 4.29, 0.29); }
	if( max >= 4.57 ) { 
		if( lslope >= -24892 ) { return new Prediction("NAT", 4.29, 0); }
		if( lslope < -24892 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( lmin >= -4.74 ) { return new Prediction("NAT", 16.09, 0); }
	}
		if( max < 2.13 ) { return new Prediction("NAT", 23.61, 0); }
	}
	}
	}
	}
	}
		if( rslope < -35263.5 ) { return new Prediction("NAT", 128.75, 0); }
	}
		if( lslope >= -5766 ) { return new Prediction("NAT", 138.41, 0); }
	}
	if( lmin < -8.96 ) { 
	if( max < 4.75 ) { 
	if( lslope < -10474.5 ) { 
	if( max >= 1.4 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 13.95, 0); }
	if( lmin >= -12.19 ) { 
		if( lmin < -10.75 ) { return new Prediction("AT", 7.51, 0.51); }
		if( lmin >= -10.75 ) { return new Prediction("NAT", 4.29, 0); }
	}
	}
		if( max < 1.4 ) { return new Prediction("NAT", 20.39, 0); }
	}
	if( lslope >= -10474.5 ) { 
	if( lslope >= -5285 ) { 
		if( rmin >= -9.59 ) { return new Prediction("AT", 2.15, 0.15); }
		if( rmin < -9.59 ) { return new Prediction("NAT", 9.66, 0); }
	}
		if( lslope < -5285 ) { return new Prediction("AT", 23.61, 1.61); }
	}
	}
	if( max >= 4.75 ) { 
		if( max >= 13.66 ) { return new Prediction("AT", 37.55, 2.55); }
	if( max < 13.66 ) { 
	if( rslope >= -19885 ) { 
	if( rslope < -3568.51 ) { 
	if( max < 9.82 ) { 
	if( rslope < -16861.5 ) { 
		if( max >= 8.26 ) { return new Prediction("NAT", 3.22, 0); }
		if( max < 8.26 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rslope >= -16861.5 ) { 
	if( max < 9.46 ) { 
	if( max >= 5.19 ) { 
	if( lmin >= -9.98 ) { 
	if( rmin >= -8.28 ) { 
		if( max >= 8.54 ) { return new Prediction("AT", 2.15, 0.15); }
		if( max < 8.54 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin < -8.28 ) { return new Prediction("AT", 5.36, 0.36); }
	}
		if( lmin < -9.98 ) { return new Prediction("AT", 18.24, 1.24); }
	}
	if( max < 5.19 ) { 
		if( lmin >= -10.6 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -10.6 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
		if( max >= 9.46 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( max >= 9.82 ) { return new Prediction("AT", 17.17, 1.17); }
	}
		if( rslope >= -3568.51 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rslope < -19885 ) { return new Prediction("NAT", 6.44, 0); }
	}
	}
	}
return null;
}
private Prediction runTree58() {
	if( lmin < -8.58 ) { 
	if( max < 3.21 ) { 
	if( rmin >= -14.74 ) { 
	if( lmin < -8.82 ) { 
	if( max < 1.18 ) { 
	if( rmin >= -3.46 ) { 
		if( lmin < -14.27 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -14.27 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin < -3.46 ) { return new Prediction("NAT", 25.78, 0); }
	}
	if( max >= 1.18 ) { 
		if( lmin >= -12.26 ) { return new Prediction("AT", 4.3, 0.3); }
		if( lmin < -12.26 ) { return new Prediction("NAT", 7.52, 0); }
	}
	}
		if( lmin >= -8.82 ) { return new Prediction("AT", 3.22, 0.22); }
	}
		if( rmin < -14.74 ) { return new Prediction("AT", 15.04, 1.04); }
	}
	if( max >= 3.21 ) { 
	if( max < 17.11 ) { 
		if( lslope < -19947.5 ) { return new Prediction("NAT", 10.74, 0); }
	if( lslope >= -19947.5 ) { 
		if( lmin < -20.71 ) { return new Prediction("NAT", 3.22, 0); }
	if( lmin >= -20.71 ) { 
	if( rmin >= -12.46 ) { 
	if( max < 7.92 ) { 
		if( max < 6.87 ) { return new Prediction("AT", 13.97, 0.97); }
		if( max >= 6.87 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( max >= 7.92 ) { return new Prediction("AT", 54.79, 3.79); }
	}
	if( rmin < -12.46 ) { 
		if( max < 4.43 ) { return new Prediction("AT", 6.45, 0.45); }
	if( max >= 4.43 ) { 
		if( rmin >= -13.23 ) { return new Prediction("NAT", 5.37, 0); }
	if( rmin < -13.23 ) { 
		if( rslope < -9527.5 ) { return new Prediction("AT", 11.82, 0.82); }
		if( rslope >= -9527.5 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	}
	}
	}
		if( max >= 17.11 ) { return new Prediction("AT", 34.38, 2.38); }
	}
	}
	if( lmin >= -8.58 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 112.8, 0); }
	if( rslope < -5426 ) { 
		if( lslope < -36711.5 ) { return new Prediction("NAT", 85.94, 0); }
	if( lslope >= -36711.5 ) { 
	if( max >= 5.51 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 45.12, 0); }
	if( lmin < 3.98 ) { 
		if( rmin >= 5.95 ) { return new Prediction("NAT", 15.04, 0); }
	if( rmin < 5.95 ) { 
	if( max < 7.05 ) { 
	if( lmin >= -5.59 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 2.15, 0.15); }
		if( max >= 5.93 ) { return new Prediction("NAT", 26.86, 0); }
	}
	if( lmin < -5.59 ) { 
		if( rmin >= -6.53 ) { return new Prediction("AT", 8.59, 0.59); }
	if( rmin < -6.53 ) { 
		if( max < 6.42 ) { return new Prediction("NAT", 2.15, 0); }
		if( max >= 6.42 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	}
	if( max >= 7.05 ) { 
		if( rmin >= 2.73 ) { return new Prediction("AT", 15.04, 1.04); }
	if( rmin < 2.73 ) { 
	if( max < 11.48 ) { 
		if( max < 7.35 ) { return new Prediction("AT", 10.74, 0.74); }
	if( max >= 7.35 ) { 
	if( lmin >= -1.14 ) { 
	if( lmin < 0.66 ) { 
		if( lslope < -18534.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope >= -18534.5 ) { return new Prediction("AT", 7.52, 0.52); }
	}
		if( lmin >= 0.66 ) { return new Prediction("NAT", 2.15, 0); }
	}
	if( lmin < -1.14 ) { 
	if( rmin < -1.65 ) { 
		if( rslope >= -22553 ) { return new Prediction("NAT", 5.37, 0); }
	if( rslope < -22553 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 4.3, 0.3); }
	}
	}
		if( rmin >= -1.65 ) { return new Prediction("NAT", 10.74, 0); }
	}
	}
	}
	if( max >= 11.48 ) { 
		if( rmin < -15.6 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -15.6 ) { return new Prediction("AT", 17.19, 1.19); }
	}
	}
	}
	}
	}
	}
	if( max < 5.51 ) { 
		if( rslope >= -6068 ) { return new Prediction("AT", 2.15, 0.15); }
	if( rslope < -6068 ) { 
		if( max < 2.15 ) { return new Prediction("NAT", 159, 0); }
	if( max >= 2.15 ) { 
		if( rmin >= 0.41 ) { return new Prediction("NAT", 44.05, 0); }
	if( rmin < 0.41 ) { 
		if( rmin >= 0.1 ) { return new Prediction("AT", 6.45, 0.45); }
	if( rmin < 0.1 ) { 
		if( lmin >= -5.19 ) { return new Prediction("NAT", 49.42, 0); }
	if( lmin < -5.19 ) { 
		if( max >= 4.14 ) { return new Prediction("NAT", 8.59, 0); }
		if( max < 4.14 ) { return new Prediction("AT", 3.22, 0.22); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree59() {
	if( max < 10.9 ) { 
	if( lmin >= -9.94 ) { 
	if( rmin < -5.59 ) { 
	if( max >= 5.47 ) { 
	if( lslope >= -14284 ) { 
		if( max >= 7.28 ) { return new Prediction("NAT", 8.5, 0.02); }
	if( max < 7.28 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 2.12, 0); }
	if( rslope >= -10417 ) { 
		if( lmin >= -2.99 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < -2.99 ) { return new Prediction("AT", 7.44, 0.42); }
	}
	}
	}
	if( lslope < -14284 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 2.12, 0); }
		if( lslope >= -35302 ) { return new Prediction("AT", 13.81, 0.78); }
	}
	}
	if( max < 5.47 ) { 
		if( rmin < -7.71 ) { return new Prediction("NAT", 46.74, 0.11); }
	if( rmin >= -7.71 ) { 
		if( max < 1.54 ) { return new Prediction("NAT", 47.8, 0.11); }
	if( max >= 1.54 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 13.81, 0.03); }
	if( lmin < -4.28 ) { 
		if( rslope < -29539 ) { return new Prediction("NAT", 2.12, 0); }
		if( rslope >= -29539 ) { return new Prediction("AT", 6.37, 0.36); }
	}
	}
	}
	}
	}
	if( rmin >= -5.59 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 191.21, 0.45); }
	if( max >= 3.17 ) { 
	if( lslope < -5364.5 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 47.8, 0.11); }
	if( lmin < 3.69 ) { 
	if( lmin >= -0.92 ) { 
	if( max >= 7.32 ) { 
		if( max < 7.63 ) { return new Prediction("AT", 8.5, 0.48); }
	if( max >= 7.63 ) { 
	if( lmin < 2.53 ) { 
		if( max < 10.45 ) { return new Prediction("NAT", 8.5, 0.02); }
		if( max >= 10.45 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin >= 2.53 ) { return new Prediction("AT", 5.31, 0.3); }
	}
	}
	if( max < 7.32 ) { 
	if( rmin < 0.55 ) { 
		if( lmin >= 1.24 ) { return new Prediction("NAT", 9.56, 0.02); }
	if( lmin < 1.24 ) { 
		if( rslope >= -19586.5 ) { return new Prediction("NAT", 3.19, 0.01); }
		if( rslope < -19586.5 ) { return new Prediction("AT", 4.25, 0.24); }
	}
	}
		if( rmin >= 0.55 ) { return new Prediction("NAT", 20.18, 0.05); }
	}
	}
	if( lmin < -0.92 ) { 
	if( max < 3.31 ) { 
		if( lmin >= -3.07 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin < -3.07 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( max >= 3.31 ) { 
	if( rmin < -4.16 ) { 
		if( rmin < -4.66 ) { return new Prediction("NAT", 3.19, 0.01); }
		if( rmin >= -4.66 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rmin >= -4.16 ) { return new Prediction("NAT", 69.05, 0.16); }
	}
	}
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 52.05, 0.12); }
	}
	}
	}
	if( lmin < -9.94 ) { 
	if( lslope < -10866.5 ) { 
	if( max >= 6.79 ) { 
	if( lslope < -16970 ) { 
	if( lslope < -17473 ) { 
		if( rmin < -4.5 ) { return new Prediction("AT", 4.25, 0.24); }
		if( rmin >= -4.5 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lslope >= -17473 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( lslope >= -16970 ) { return new Prediction("AT", 15.93, 0.9); }
	}
	if( max < 6.79 ) { 
		if( lslope >= -16215.5 ) { return new Prediction("NAT", 21.25, 0.05); }
	if( lslope < -16215.5 ) { 
	if( rslope >= -17995 ) { 
		if( max >= 2.49 ) { return new Prediction("NAT", 1.06, 0); }
		if( max < 2.49 ) { return new Prediction("AT", 3.19, 0.18); }
	}
	if( rslope < -17995 ) { 
		if( lmin < -11.16 ) { return new Prediction("NAT", 11.68, 0.03); }
	if( lmin >= -11.16 ) { 
		if( lslope < -32770 ) { return new Prediction("NAT", 5.31, 0.01); }
		if( lslope >= -32770 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
	}
	}
	}
	if( lslope >= -10866.5 ) { 
	if( lslope < -3884 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 41.43, 2.33); }
		if( max >= 8.49 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lslope >= -3884 ) { return new Prediction("NAT", 5.31, 0.01); }
	}
	}
	}
	if( max >= 10.9 ) { 
	if( lmin >= -0.85 ) { 
	if( max < 11.62 ) { 
	if( lmin >= 1.18 ) { 
		if( rmin < 1.48 ) { return new Prediction("NAT", 3.19, 0.01); }
		if( rmin >= 1.48 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( lmin < 1.18 ) { return new Prediction("AT", 5.31, 0.3); }
	}
	if( max >= 11.62 ) { 
		if( max >= 21.62 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max < 21.62 ) { return new Prediction("NAT", 29.74, 0.07); }
	}
	}
	if( lmin < -0.85 ) { 
	if( lslope >= -2406.49 ) { 
		if( max < 15.88 ) { return new Prediction("NAT", 5.31, 0.01); }
		if( max >= 15.88 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( lslope < -2406.49 ) { 
	if( rslope >= -20001.5 ) { 
	if( rmin >= 1.82 ) { 
		if( rmin < 3.48 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= 3.48 ) { return new Prediction("AT", 11.68, 0.66); }
	}
		if( rmin < 1.82 ) { return new Prediction("AT", 77.55, 4.36); }
	}
	if( rslope < -20001.5 ) { 
		if( rmin >= 4.1 ) { return new Prediction("NAT", 4.25, 0.01); }
	if( rmin < 4.1 ) { 
		if( lmin < -13.48 ) { return new Prediction("NAT", 2.12, 0); }
		if( lmin >= -13.48 ) { return new Prediction("AT", 12.75, 0.72); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree60() {
	if( lmin >= -8.96 ) { 
	if( max < 5.52 ) { 
	if( max < 3.17 ) { 
	if( rmin < -9.21 ) { 
		if( rmin < -9.65 ) { return new Prediction("NAT", 21.76, 0.03); }
		if( rmin >= -9.65 ) { return new Prediction("AT", 2.18, 0.17); }
	}
		if( rmin >= -9.21 ) { return new Prediction("NAT", 274.18, 0.32); }
	}
	if( max >= 3.17 ) { 
	if( rslope >= -30708 ) { 
		if( lslope >= -11416 ) { return new Prediction("NAT", 38.08, 0.04); }
	if( lslope < -11416 ) { 
	if( lmin < 1.21 ) { 
		if( lmin >= -0.88 ) { return new Prediction("AT", 4.35, 0.35); }
	if( lmin < -0.88 ) { 
	if( lslope < -12848 ) { 
		if( max >= 3.27 ) { return new Prediction("NAT", 16.32, 0.02); }
		if( max < 3.27 ) { return new Prediction("AT", 1.09, 0.09); }
	}
		if( lslope >= -12848 ) { return new Prediction("AT", 2.18, 0.17); }
	}
	}
		if( lmin >= 1.21 ) { return new Prediction("NAT", 15.23, 0.02); }
	}
	}
		if( rslope < -30708 ) { return new Prediction("NAT", 42.43, 0.05); }
	}
	}
	if( max >= 5.52 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 89.22, 0.1); }
	if( lmin < 3.98 ) { 
	if( max < 12.67 ) { 
		if( lslope < -30572 ) { return new Prediction("NAT", 25.02, 0.03); }
	if( lslope >= -30572 ) { 
		if( rslope >= -5895 ) { return new Prediction("NAT", 23.94, 0.03); }
	if( rslope < -5895 ) { 
	if( rmin < -5.82 ) { 
		if( lmin < -6.34 ) { return new Prediction("AT", 9.79, 0.78); }
	if( lmin >= -6.34 ) { 
	if( rmin < -6.35 ) { 
	if( lmin < -1.67 ) { 
		if( lslope >= -8456 ) { return new Prediction("AT", 1.09, 0.09); }
		if( lslope < -8456 ) { return new Prediction("NAT", 2.18, 0); }
	}
		if( lmin >= -1.67 ) { return new Prediction("AT", 2.18, 0.17); }
	}
		if( rmin >= -6.35 ) { return new Prediction("AT", 4.35, 0.35); }
	}
	}
	if( rmin >= -5.82 ) { 
	if( max < 10.53 ) { 
		if( lmin < -1.22 ) { return new Prediction("NAT", 21.76, 0.03); }
	if( lmin >= -1.22 ) { 
		if( lmin < -0.6 ) { return new Prediction("AT", 3.26, 0.26); }
	if( lmin >= -0.6 ) { 
		if( lslope < -28597.5 ) { return new Prediction("AT", 3.26, 0.26); }
	if( lslope >= -28597.5 ) { 
		if( max < 7.5 ) { return new Prediction("NAT", 13.06, 0.02); }
	if( max >= 7.5 ) { 
		if( lslope >= -12907.5 ) { return new Prediction("AT", 5.44, 0.43); }
		if( lslope < -12907.5 ) { return new Prediction("NAT", 4.35, 0.01); }
	}
	}
	}
	}
	}
	if( max >= 10.53 ) { 
	if( max < 11.26 ) { 
		if( rmin < 8.21 ) { return new Prediction("AT", 9.79, 0.78); }
		if( rmin >= 8.21 ) { return new Prediction("NAT", 1.09, 0); }
	}
		if( max >= 11.26 ) { return new Prediction("NAT", 3.26, 0); }
	}
	}
	}
	}
	}
	if( max >= 12.67 ) { 
		if( lmin < -0.21 ) { return new Prediction("AT", 21.76, 1.73); }
		if( lmin >= -0.21 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
	}
	}
	if( lmin < -8.96 ) { 
	if( max < 9.82 ) { 
		if( lslope < -21862.5 ) { return new Prediction("NAT", 14.14, 0.02); }
	if( lslope >= -21862.5 ) { 
	if( max >= -5.41 ) { 
	if( lslope < -8885 ) { 
	if( lmin >= -12.26 ) { 
	if( max >= 1.4 ) { 
	if( max >= 5.71 ) { 
		if( lmin >= -9.38 ) { return new Prediction("AT", 1.09, 0.09); }
	if( lmin < -9.38 ) { 
		if( rmin < -15.38 ) { return new Prediction("AT", 1.09, 0.09); }
		if( rmin >= -15.38 ) { return new Prediction("NAT", 4.35, 0.01); }
	}
	}
		if( max < 5.71 ) { return new Prediction("AT", 17.41, 1.39); }
	}
	if( max < 1.4 ) { 
		if( lslope >= -14248 ) { return new Prediction("NAT", 10.88, 0.01); }
		if( lslope < -14248 ) { return new Prediction("AT", 3.26, 0.26); }
	}
	}
	if( lmin < -12.26 ) { 
	if( max >= 5.18 ) { 
		if( max >= 9.27 ) { return new Prediction("NAT", 3.26, 0); }
	if( max < 9.27 ) { 
		if( rslope >= -17312 ) { return new Prediction("AT", 3.26, 0.26); }
		if( rslope < -17312 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
		if( max < 5.18 ) { return new Prediction("NAT", 15.23, 0.02); }
	}
	}
	if( lslope >= -8885 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 22.85, 1.82); }
		if( lslope >= -3296 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
		if( max < -5.41 ) { return new Prediction("NAT", 8.7, 0.01); }
	}
	}
	if( max >= 9.82 ) { 
	if( rslope >= -20001.5 ) { 
		if( lmin >= -23.97 ) { return new Prediction("AT", 73.98, 5.9); }
		if( lmin < -23.97 ) { return new Prediction("NAT", 1.09, 0); }
	}
	if( rslope < -20001.5 ) { 
		if( rmin < -7.8 ) { return new Prediction("AT", 1.09, 0.09); }
		if( rmin >= -7.8 ) { return new Prediction("NAT", 5.44, 0.01); }
	}
	}
	}
return null;
}
private Prediction runTree61() {
	if( lmin < -7.73 ) { 
	if( lslope < -19978 ) { 
		if( max < 5.41 ) { return new Prediction("NAT", 33.05, 0); }
	if( max >= 5.41 ) { 
		if( lslope >= -28257 ) { return new Prediction("NAT", 4.26, 0); }
	if( lslope < -28257 ) { 
		if( lslope < -34959 ) { return new Prediction("NAT", 3.2, 0); }
		if( lslope >= -34959 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	}
	}
	if( lslope >= -19978 ) { 
	if( max < 11.14 ) { 
		if( lslope >= -4851.5 ) { return new Prediction("NAT", 14.93, 0); }
	if( lslope < -4851.5 ) { 
	if( max >= 5.19 ) { 
	if( lslope < -16970 ) { 
		if( rmin >= -9.26 ) { return new Prediction("NAT", 3.2, 0); }
		if( rmin < -9.26 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	if( lslope >= -16970 ) { 
		if( rmin >= -17.32 ) { return new Prediction("AT", 30.92, 1.92); }
	if( rmin < -17.32 ) { 
		if( max >= 8.61 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 8.61 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( max < 5.19 ) { 
		if( lslope >= -11003.5 ) { return new Prediction("AT", 23.46, 1.46); }
	if( lslope < -11003.5 ) { 
	if( lslope >= -16615 ) { 
		if( max >= 0.82 ) { return new Prediction("NAT", 18.13, 0); }
	if( max < 0.82 ) { 
		if( rslope < -14467 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rslope >= -14467 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	if( lslope < -16615 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 3.2, 0); }
		if( max < 2.61 ) { return new Prediction("AT", 11.73, 0.73); }
	}
	}
	}
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 55.45, 3.45); }
	}
	}
	if( lmin >= -7.73 ) { 
	if( max < 10.58 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 110.89, 0); }
	if( lslope < -5785.5 ) { 
	if( max >= 1.68 ) { 
		if( lslope >= -6005.5 ) { return new Prediction("AT", 6.4, 0.4); }
	if( lslope < -6005.5 ) { 
		if( rmin >= 2.76 ) { return new Prediction("NAT", 52.25, 0); }
	if( rmin < 2.76 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 44.78, 0); }
	if( max >= 3.17 ) { 
		if( rmin >= 2.7 ) { return new Prediction("AT", 5.33, 0.33); }
	if( rmin < 2.7 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 26.66, 0); }
	if( rslope >= -33045 ) { 
	if( lmin < 1.21 ) { 
	if( rslope < -29051.5 ) { 
		if( max >= 4.94 ) { return new Prediction("AT", 5.33, 0.33); }
	if( max < 4.94 ) { 
		if( lmin < -1 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -1 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( rslope >= -29051.5 ) { 
	if( lmin >= 0.25 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 3.2, 0); }
		if( max < 7.59 ) { return new Prediction("AT", 5.33, 0.33); }
	}
	if( lmin < 0.25 ) { 
	if( rmin < -5.82 ) { 
	if( rmin < -6.35 ) { 
		if( rmin >= -7.68 ) { return new Prediction("NAT", 10.66, 0); }
	if( rmin < -7.68 ) { 
	if( lslope >= -18337 ) { 
		if( rmin < -12.69 ) { return new Prediction("AT", 1.07, 0.07); }
	if( rmin >= -12.69 ) { 
		if( max < 6.1 ) { return new Prediction("NAT", 4.26, 0); }
		if( max >= 6.1 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( lslope < -18337 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	}
		if( rmin >= -6.35 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	if( rmin >= -5.82 ) { 
	if( lmin >= -0.84 ) { 
		if( lslope < -11405 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope >= -11405 ) { return new Prediction("NAT", 4.26, 0); }
	}
		if( lmin < -0.84 ) { return new Prediction("NAT", 35.19, 0); }
	}
	}
	}
	}
		if( lmin >= 1.21 ) { return new Prediction("NAT", 29.86, 0); }
	}
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 180.2, 0); }
	}
	}
	if( max >= 10.58 ) { 
	if( lslope < -6354.5 ) { 
	if( lslope >= -18985.5 ) { 
	if( lmin < 5.12 ) { 
	if( lmin >= 0.41 ) { 
		if( lmin >= 1.54 ) { return new Prediction("AT", 10.66, 0.66); }
		if( lmin < 1.54 ) { return new Prediction("NAT", 2.13, 0); }
	}
		if( lmin < 0.41 ) { return new Prediction("AT", 23.46, 1.46); }
	}
		if( lmin >= 5.12 ) { return new Prediction("NAT", 3.2, 0); }
	}
	if( lslope < -18985.5 ) { 
	if( max < 14.71 ) { 
		if( lslope < -23279.5 ) { return new Prediction("NAT", 17.06, 0); }
	if( lslope >= -23279.5 ) { 
		if( lmin >= -1.7 ) { return new Prediction("NAT", 6.4, 0); }
	if( lmin < -1.7 ) { 
		if( lslope >= -20142.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope < -20142.5 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
	}
		if( max >= 14.71 ) { return new Prediction("AT", 5.33, 0.33); }
	}
	}
		if( lslope >= -6354.5 ) { return new Prediction("NAT", 29.86, 0); }
	}
	}
return null;
}
private Prediction runTree62() {
	if( max >= 14.89 ) { 
	if( lmin < 3.96 ) { 
	if( rmin >= 12.75 ) { 
		if( lmin >= -13.47 ) { return new Prediction("AT", 4.3, 0.29); }
		if( lmin < -13.47 ) { return new Prediction("NAT", 2.15, 0.01); }
	}
		if( rmin < 12.75 ) { return new Prediction("AT", 64.46, 4.31); }
	}
		if( lmin >= 3.96 ) { return new Prediction("NAT", 2.15, 0.01); }
	}
	if( max < 14.89 ) { 
	if( rmin >= -5.48 ) { 
	if( max >= 5.81 ) { 
	if( rmin < 6.74 ) { 
	if( rslope >= -6527 ) { 
		if( lmin < -9.48 ) { return new Prediction("AT", 2.15, 0.14); }
	if( lmin >= -9.48 ) { 
		if( lslope >= -5129 ) { return new Prediction("NAT", 36.53, 0.09); }
	if( lslope < -5129 ) { 
		if( rslope < -5662.5 ) { return new Prediction("NAT", 5.37, 0.01); }
		if( rslope >= -5662.5 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( rslope < -6527 ) { 
	if( max >= 8.77 ) { 
		if( lslope < -22288 ) { return new Prediction("NAT", 9.67, 0.02); }
	if( lslope >= -22288 ) { 
		if( lmin >= 5.38 ) { return new Prediction("NAT", 2.15, 0.01); }
	if( lmin < 5.38 ) { 
	if( lslope < -19694 ) { 
		if( lmin < -2.46 ) { return new Prediction("AT", 3.22, 0.22); }
		if( lmin >= -2.46 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -19694 ) { return new Prediction("AT", 33.3, 2.23); }
	}
	}
	}
	if( max < 8.77 ) { 
	if( max >= 6.01 ) { 
	if( lslope < -13107.5 ) { 
	if( rslope < -16331.5 ) { 
	if( rmin < -1.85 ) { 
		if( max < 7.18 ) { return new Prediction("NAT", 3.22, 0.01); }
	if( max >= 7.18 ) { 
	if( lmin < -2.74 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin >= -2.74 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rmin >= -1.85 ) { return new Prediction("NAT", 18.26, 0.04); }
	}
		if( rslope >= -16331.5 ) { return new Prediction("AT", 4.3, 0.29); }
	}
		if( lslope >= -13107.5 ) { return new Prediction("NAT", 16.11, 0.04); }
	}
		if( max < 6.01 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
	}
	if( rmin >= 6.74 ) { 
		if( lmin < -8.67 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -8.67 ) { return new Prediction("NAT", 68.76, 0.16); }
	}
	}
	if( max < 5.81 ) { 
	if( rmin >= 0.36 ) { 
	if( rmin >= 0.37 ) { 
	if( rmin >= 0.5 ) { 
		if( lmin >= -4.44 ) { return new Prediction("NAT", 61.24, 0.14); }
	if( lmin < -4.44 ) { 
		if( lslope < -24901 ) { return new Prediction("NAT", 5.37, 0.01); }
	if( lslope >= -24901 ) { 
		if( max >= 2.66 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 2.66 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( rmin < 0.5 ) { 
		if( lmin >= 0.86 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < 0.86 ) { return new Prediction("NAT", 4.3, 0.01); }
	}
	}
		if( rmin < 0.37 ) { return new Prediction("AT", 2.15, 0.14); }
	}
		if( rmin < 0.36 ) { return new Prediction("NAT", 235.27, 0.55); }
	}
	}
	if( rmin < -5.48 ) { 
	if( rslope >= -20195.5 ) { 
	if( lslope < -4846 ) { 
	if( lslope < -10474.5 ) { 
		if( max >= 9.24 ) { return new Prediction("AT", 18.26, 1.22); }
	if( max < 9.24 ) { 
	if( max >= 0.55 ) { 
		if( rslope < -18790.5 ) { return new Prediction("AT", 5.37, 0.36); }
	if( rslope >= -18790.5 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 9.67, 0.02); }
	if( lmin >= -12.54 ) { 
	if( lmin >= -5.22 ) { 
		if( rmin < -12.69 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= -12.69 ) { return new Prediction("NAT", 9.67, 0.02); }
	}
	if( lmin < -5.22 ) { 
	if( max < 4.25 ) { 
		if( rmin >= -9.22 ) { return new Prediction("AT", 9.67, 0.65); }
		if( rmin < -9.22 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( max >= 4.25 ) { 
		if( lslope >= -14134 ) { return new Prediction("NAT", 6.45, 0.02); }
	if( lslope < -14134 ) { 
		if( lslope < -16310 ) { return new Prediction("NAT", 5.37, 0.01); }
		if( lslope >= -16310 ) { return new Prediction("AT", 5.37, 0.36); }
	}
	}
	}
	}
	}
	}
		if( max < 0.55 ) { return new Prediction("NAT", 19.34, 0.05); }
	}
	}
	if( lslope >= -10474.5 ) { 
	if( lmin >= -3.6 ) { 
		if( rmin >= -12.36 ) { return new Prediction("NAT", 7.52, 0.02); }
	if( rmin < -12.36 ) { 
		if( rmin >= -19.21 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < -19.21 ) { return new Prediction("NAT", 2.15, 0.01); }
	}
	}
		if( lmin < -3.6 ) { return new Prediction("AT", 55.86, 3.73); }
	}
	}
	if( lslope >= -4846 ) { 
		if( max < 11.14 ) { return new Prediction("NAT", 35.45, 0.08); }
	if( max >= 11.14 ) { 
		if( max >= 12.96 ) { return new Prediction("NAT", 3.22, 0.01); }
		if( max < 12.96 ) { return new Prediction("AT", 3.22, 0.22); }
	}
	}
	}
	if( rslope < -20195.5 ) { 
	if( rmin >= -5.71 ) { 
		if( max >= 1.94 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 1.94 ) { return new Prediction("NAT", 4.3, 0.01); }
	}
		if( rmin < -5.71 ) { return new Prediction("NAT", 51.57, 0.12); }
	}
	}
	}
return null;
}
private Prediction runTree63() {
	if( lmin >= -8.27 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 125.69, 0.15); }
	if( lslope < -5395 ) { 
	if( max >= 5.51 ) { 
	if( rmin < -2.62 ) { 
	if( rmin >= -7.82 ) { 
	if( max < 14.26 ) { 
		if( lmin < -6.34 ) { return new Prediction("AT", 4.3, 0.29); }
	if( lmin >= -6.34 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 2.15, 0.15); }
	if( max >= 5.93 ) { 
		if( max < 10.15 ) { return new Prediction("NAT", 13.97, 0.02); }
	if( max >= 10.15 ) { 
		if( max < 12.12 ) { return new Prediction("AT", 2.15, 0.15); }
		if( max >= 12.12 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	}
		if( max >= 14.26 ) { return new Prediction("AT", 13.97, 0.95); }
	}
		if( rmin < -7.82 ) { return new Prediction("AT", 16.11, 1.1); }
	}
	if( rmin >= -2.62 ) { 
	if( lmin < 2.86 ) { 
	if( lslope < -7867.5 ) { 
	if( max < 12.57 ) { 
		if( lmin < -2.74 ) { return new Prediction("NAT", 24.71, 0.03); }
	if( lmin >= -2.74 ) { 
	if( lslope >= -22547 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 6.45, 0.01); }
	if( max >= 7.05 ) { 
	if( lslope < -15022 ) { 
	if( lmin >= -1.7 ) { 
	if( max < 11.13 ) { 
		if( lmin >= 0.65 ) { return new Prediction("NAT", 2.15, 0); }
		if( lmin < 0.65 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( max >= 11.13 ) { return new Prediction("NAT", 5.37, 0.01); }
	}
		if( lmin < -1.7 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( lslope >= -15022 ) { return new Prediction("AT", 5.37, 0.37); }
	}
	}
	if( lslope < -22547 ) { 
	if( max < 6.2 ) { 
		if( rmin < -0.92 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -0.92 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( max >= 6.2 ) { return new Prediction("NAT", 17.19, 0.02); }
	}
	}
	}
	if( max >= 12.57 ) { 
		if( lmin >= -0.49 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -0.49 ) { return new Prediction("AT", 3.22, 0.22); }
	}
	}
		if( lslope >= -7867.5 ) { return new Prediction("AT", 7.52, 0.51); }
	}
		if( lmin >= 2.86 ) { return new Prediction("NAT", 48.34, 0.06); }
	}
	}
	if( max < 5.51 ) { 
	if( rslope < -6064.5 ) { 
	if( lslope >= -30196 ) { 
	if( lslope >= -30059.5 ) { 
		if( max < 2.09 ) { return new Prediction("NAT", 136.44, 0.16); }
	if( max >= 2.09 ) { 
	if( max < 4.3 ) { 
	if( lmin >= -5.23 ) { 
		if( max >= 4.21 ) { return new Prediction("AT", 1.07, 0.07); }
	if( max < 4.21 ) { 
		if( lmin >= -4.44 ) { return new Prediction("NAT", 41.9, 0.05); }
	if( lmin < -4.44 ) { 
		if( lmin >= -4.64 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -4.64 ) { return new Prediction("NAT", 7.52, 0.01); }
	}
	}
	}
	if( lmin < -5.23 ) { 
		if( max < 3.73 ) { return new Prediction("AT", 4.3, 0.29); }
		if( max >= 3.73 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
		if( max >= 4.3 ) { return new Prediction("NAT", 42.97, 0.05); }
	}
	}
		if( lslope < -30059.5 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( lslope < -30196 ) { return new Prediction("NAT", 107.43, 0.13); }
	}
		if( rslope >= -6064.5 ) { return new Prediction("AT", 4.3, 0.29); }
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( max < 4.56 ) { 
	if( rslope >= -10528 ) { 
	if( lslope >= -5537.5 ) { 
		if( max < 1.08 ) { return new Prediction("NAT", 7.52, 0.01); }
		if( max >= 1.08 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lslope < -5537.5 ) { return new Prediction("AT", 24.71, 1.68); }
	}
	if( rslope < -10528 ) { 
	if( lslope >= -17810.5 ) { 
	if( rmin >= -7.58 ) { 
		if( rmin < -4.75 ) { return new Prediction("AT", 3.22, 0.22); }
		if( rmin >= -4.75 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( rmin < -7.58 ) { return new Prediction("NAT", 19.34, 0.02); }
	}
		if( lslope < -17810.5 ) { return new Prediction("NAT", 26.86, 0.03); }
	}
	}
	if( max >= 4.56 ) { 
	if( rslope >= -17033.5 ) { 
	if( lmin >= -23.97 ) { 
		if( lmin < -9.56 ) { return new Prediction("AT", 66.61, 4.53); }
	if( lmin >= -9.56 ) { 
		if( max < 5.76 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 5.76 ) { return new Prediction("AT", 12.89, 0.88); }
	}
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rslope < -17033.5 ) { 
	if( lslope < -17430.5 ) { 
		if( lmin >= -9.11 ) { return new Prediction("NAT", 3.22, 0); }
	if( lmin < -9.11 ) { 
	if( lslope < -19947.5 ) { 
		if( lslope >= -28257 ) { return new Prediction("NAT", 3.22, 0); }
		if( lslope < -28257 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( lslope >= -19947.5 ) { return new Prediction("AT", 10.74, 0.73); }
	}
	}
		if( lslope >= -17430.5 ) { return new Prediction("NAT", 6.45, 0.01); }
	}
	}
	}
return null;
}
private Prediction runTree64() {
		if( max >= 14.81 ) { return new Prediction("AT", 60.01, 4.01); }
	if( max < 14.81 ) { 
	if( lmin < -9.17 ) { 
	if( rslope >= -19140 ) { 
	if( max >= -5.41 ) { 
	if( rslope >= -10849.5 ) { 
	if( rslope < -2285.51 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 43.94, 2.94); }
	if( max >= 8.49 ) { 
		if( rmin >= -13.79 ) { return new Prediction("AT", 6.43, 0.43); }
		if( rmin < -13.79 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( rslope >= -2285.51 ) { 
		if( lmin >= -18.36 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -18.36 ) { return new Prediction("NAT", 5.36, 0); }
	}
	}
	if( rslope < -10849.5 ) { 
	if( rmin < -5.89 ) { 
	if( lslope < -14749.5 ) { 
		if( max < 2.09 ) { return new Prediction("AT", 4.29, 0.29); }
	if( max >= 2.09 ) { 
		if( max < 5.24 ) { return new Prediction("NAT", 6.43, 0); }
	if( max >= 5.24 ) { 
		if( rmin >= -7.69 ) { return new Prediction("NAT", 2.14, 0); }
		if( rmin < -7.69 ) { return new Prediction("AT", 6.43, 0.43); }
	}
	}
	}
	if( lslope >= -14749.5 ) { 
		if( max >= 9.05 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max < 9.05 ) { return new Prediction("NAT", 17.15, 0); }
	}
	}
	if( rmin >= -5.89 ) { 
		if( max >= 7.16 ) { return new Prediction("AT", 10.72, 0.72); }
	if( max < 7.16 ) { 
		if( rmin >= -4.41 ) { return new Prediction("NAT", 3.21, 0); }
		if( rmin < -4.41 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
	}
	}
		if( max < -5.41 ) { return new Prediction("NAT", 7.5, 0); }
	}
	if( rslope < -19140 ) { 
		if( rslope < -21127.5 ) { return new Prediction("NAT", 16.07, 0); }
	if( rslope >= -21127.5 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 5.36, 0); }
		if( max < 2.61 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( lmin >= -9.17 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 216.46, 0); }
	if( max >= 1.66 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 111.45, 0); }
	if( lmin < 3.98 ) { 
	if( rmin >= -5.54 ) { 
	if( lslope >= -33031.5 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 33.22, 0); }
	if( rslope < -5426 ) { 
	if( lmin >= -1.11 ) { 
	if( max >= 7.32 ) { 
	if( rslope < -14682 ) { 
		if( rmin < -0.62 ) { return new Prediction("AT", 3.21, 0.21); }
	if( rmin >= -0.62 ) { 
		if( max < 7.49 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max >= 7.49 ) { return new Prediction("NAT", 9.64, 0); }
	}
	}
		if( rslope >= -14682 ) { return new Prediction("AT", 13.93, 0.93); }
	}
	if( max < 7.32 ) { 
	if( lslope < -25941 ) { 
		if( rmin >= 1.54 ) { return new Prediction("NAT", 3.21, 0); }
	if( rmin < 1.54 ) { 
		if( rmin < -0.3 ) { return new Prediction("NAT", 2.14, 0); }
	if( rmin >= -0.3 ) { 
	if( rslope >= -27710 ) { 
		if( max < 3.9 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 3.9 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( rslope < -27710 ) { return new Prediction("AT", 7.5, 0.5); }
	}
	}
	}
	if( lslope >= -25941 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 33.22, 0); }
	if( max >= 7.05 ) { 
		if( lmin < 2.02 ) { return new Prediction("NAT", 4.29, 0); }
		if( lmin >= 2.02 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	}
	if( lmin < -1.11 ) { 
	if( lslope < -16864 ) { 
	if( max >= 10.99 ) { 
		if( rmin >= 4.1 ) { return new Prediction("NAT", 5.36, 0); }
		if( rmin < 4.1 ) { return new Prediction("AT", 4.29, 0.29); }
	}
	if( max < 10.99 ) { 
		if( lslope >= -32522.5 ) { return new Prediction("NAT", 38.58, 0); }
	if( lslope < -32522.5 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
		if( lslope >= -16864 ) { return new Prediction("NAT", 34.29, 0); }
	}
	}
	}
		if( lslope < -33031.5 ) { return new Prediction("NAT", 49.29, 0); }
	}
	if( rmin < -5.54 ) { 
		if( lmin >= -0.76 ) { return new Prediction("NAT", 12.86, 0); }
	if( lmin < -0.76 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 5.36, 0); }
	if( lslope >= -34743.5 ) { 
	if( lmin >= -4.53 ) { 
		if( lmin >= -1.25 ) { return new Prediction("AT", 5.36, 0.36); }
		if( lmin < -1.25 ) { return new Prediction("NAT", 13.93, 0); }
	}
	if( lmin < -4.53 ) { 
	if( max < 6.31 ) { 
	if( lmin < -5.97 ) { 
		if( rmin < -6.72 ) { return new Prediction("NAT", 8.57, 0); }
		if( rmin >= -6.72 ) { return new Prediction("AT", 4.29, 0.29); }
	}
	if( lmin >= -5.97 ) { 
		if( rmin >= -6.88 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < -6.88 ) { return new Prediction("AT", 7.5, 0.5); }
	}
	}
		if( max >= 6.31 ) { return new Prediction("AT", 9.64, 0.64); }
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree65() {
	if( lmin < -9.17 ) { 
	if( rslope < -18316.5 ) { 
	if( rmin < -4.83 ) { 
	if( rslope < -21651.5 ) { 
	if( lmin < -10.83 ) { 
		if( lmin >= -11.54 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin < -11.54 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( lmin >= -10.83 ) { return new Prediction("NAT", 10.69, 0); }
	}
		if( rslope >= -21651.5 ) { return new Prediction("AT", 4.28, 0.28); }
	}
		if( rmin >= -4.83 ) { return new Prediction("NAT", 16.03, 0); }
	}
	if( rslope >= -18316.5 ) { 
	if( max < 9.82 ) { 
	if( rslope >= -10528 ) { 
	if( max >= -5.41 ) { 
	if( max < 8.49 ) { 
		if( rslope >= -3381.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope < -3381.5 ) { return new Prediction("AT", 58.79, 3.79); }
	}
		if( max >= 8.49 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 7.48, 0); }
	}
	if( rslope < -10528 ) { 
	if( lslope >= -14117 ) { 
		if( lmin < -19.17 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -19.17 ) { return new Prediction("NAT", 18.17, 0); }
	}
	if( lslope < -14117 ) { 
		if( rslope >= -15116.5 ) { return new Prediction("AT", 3.21, 0.21); }
	if( rslope < -15116.5 ) { 
		if( rmin < -8.75 ) { return new Prediction("NAT", 5.34, 0); }
	if( rmin >= -8.75 ) { 
	if( max >= 5.64 ) { 
		if( lmin < -10.45 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -10.45 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( max < 5.64 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
	}
	}
	}
		if( max >= 9.82 ) { return new Prediction("AT", 65.2, 4.2); }
	}
	}
	if( lmin >= -9.17 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 113.31, 0); }
	if( lslope < -5395 ) { 
		if( lslope < -36676 ) { return new Prediction("NAT", 97.27, 0); }
	if( lslope >= -36676 ) { 
	if( max >= 10.91 ) { 
	if( rmin >= 5.62 ) { 
		if( rmin < 17.93 ) { return new Prediction("NAT", 4.28, 0); }
		if( rmin >= 17.93 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin < 5.62 ) { return new Prediction("AT", 31, 2); }
	}
	if( max < 10.91 ) { 
	if( rmin >= -5.57 ) { 
		if( max < 3.09 ) { return new Prediction("NAT", 150.72, 0); }
	if( max >= 3.09 ) { 
		if( max >= 9.41 ) { return new Prediction("NAT", 40.62, 0); }
	if( max < 9.41 ) { 
	if( max < 7.04 ) { 
		if( rslope >= -20923 ) { return new Prediction("NAT", 34.21, 0); }
	if( rslope < -20923 ) { 
	if( rmin >= 0.41 ) { 
		if( rslope < -22092 ) { return new Prediction("NAT", 31, 0); }
		if( rslope >= -22092 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rmin < 0.41 ) { 
		if( lmin < 0.22 ) { return new Prediction("NAT", 11.76, 0); }
	if( lmin >= 0.22 ) { 
		if( rmin < -0.92 ) { return new Prediction("NAT", 4.28, 0); }
		if( rmin >= -0.92 ) { return new Prediction("AT", 6.41, 0.41); }
	}
	}
	}
	}
	if( max >= 7.04 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 13.9, 0); }
	if( lmin < 3.7 ) { 
	if( max >= 7.74 ) { 
		if( lmin >= 2.3 ) { return new Prediction("AT", 3.21, 0.21); }
	if( lmin < 2.3 ) { 
		if( rslope >= -28895 ) { return new Prediction("NAT", 7.48, 0); }
	if( rslope < -28895 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 3.21, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
	}
	if( max < 7.74 ) { 
		if( lslope < -24442.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope >= -24442.5 ) { return new Prediction("AT", 9.62, 0.62); }
	}
	}
	}
	}
	}
	}
	if( rmin < -5.57 ) { 
	if( rmin >= -9.38 ) { 
	if( max >= 1.43 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 7.48, 0); }
	if( lmin < -4.28 ) { 
	if( lmin < -6.27 ) { 
	if( rmin >= -9.16 ) { 
		if( rmin >= -6.81 ) { return new Prediction("AT", 4.28, 0.28); }
	if( rmin < -6.81 ) { 
		if( rslope < -10135.5 ) { return new Prediction("NAT", 9.62, 0); }
		if( rslope >= -10135.5 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	}
		if( rmin < -9.16 ) { return new Prediction("AT", 4.28, 0.28); }
	}
		if( lmin >= -6.27 ) { return new Prediction("AT", 8.55, 0.55); }
	}
	}
	if( max < 1.43 ) { 
		if( rslope < -9133 ) { return new Prediction("NAT", 22.45, 0); }
		if( rslope >= -9133 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rmin < -9.38 ) { return new Prediction("NAT", 20.31, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree66() {
	if( lmin < -9.17 ) { 
	if( lslope < -16970 ) { 
	if( rmin < -5.25 ) { 
	if( max >= 1.7 ) { 
		if( rslope >= -17926 ) { return new Prediction("NAT", 3.28, 0); }
	if( rslope < -17926 ) { 
		if( max < 12.83 ) { return new Prediction("AT", 5.47, 0.47); }
	if( max >= 12.83 ) { 
		if( max < 16.52 ) { return new Prediction("NAT", 3.28, 0); }
		if( max >= 16.52 ) { return new Prediction("AT", 2.19, 0.19); }
	}
	}
	}
		if( max < 1.7 ) { return new Prediction("NAT", 10.95, 0.01); }
	}
		if( rmin >= -5.25 ) { return new Prediction("NAT", 16.42, 0.02); }
	}
	if( lslope >= -16970 ) { 
	if( max < 11.14 ) { 
		if( lslope >= -4851.5 ) { return new Prediction("NAT", 8.76, 0.01); }
	if( lslope < -4851.5 ) { 
	if( lslope < -10474.5 ) { 
	if( lslope < -14749.5 ) { 
		if( lmin < -18.52 ) { return new Prediction("NAT", 1.09, 0); }
		if( lmin >= -18.52 ) { return new Prediction("AT", 16.42, 1.41); }
	}
	if( lslope >= -14749.5 ) { 
	if( max < 7.92 ) { 
	if( rslope >= -11065 ) { 
		if( lmin >= -11.92 ) { return new Prediction("AT", 1.09, 0.09); }
		if( lmin < -11.92 ) { return new Prediction("NAT", 3.28, 0); }
	}
		if( rslope < -11065 ) { return new Prediction("NAT", 14.23, 0.02); }
	}
		if( max >= 7.92 ) { return new Prediction("AT", 1.09, 0.09); }
	}
	}
	if( lslope >= -10474.5 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 44.89, 3.84); }
		if( max >= 8.49 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 44.89, 3.84); }
	}
	}
	if( lmin >= -9.17 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 116.07, 0.14); }
	if( lslope < -5395 ) { 
	if( max < 3.17 ) { 
		if( rmin >= -6.48 ) { return new Prediction("NAT", 175.2, 0.21); }
	if( rmin < -6.48 ) { 
		if( lslope >= -9247.5 ) { return new Prediction("AT", 2.19, 0.19); }
	if( lslope < -9247.5 ) { 
		if( rmin >= -6.56 ) { return new Prediction("AT", 1.09, 0.09); }
		if( rmin < -6.56 ) { return new Prediction("NAT", 44.89, 0.05); }
	}
	}
	}
	if( max >= 3.17 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 53.65, 0.06); }
	if( lmin < 3.98 ) { 
	if( max < 12.91 ) { 
	if( lslope >= -30196 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 17.52, 0.02); }
	if( rmin < 6.73 ) { 
	if( max >= 8.77 ) { 
		if( lmin >= -0.08 ) { return new Prediction("AT", 20.8, 1.78); }
	if( lmin < -0.08 ) { 
		if( lmin >= -0.89 ) { return new Prediction("NAT", 3.28, 0); }
	if( lmin < -0.89 ) { 
	if( rmin >= -0.15 ) { 
		if( lmin < -2.52 ) { return new Prediction("NAT", 3.28, 0); }
		if( lmin >= -2.52 ) { return new Prediction("AT", 1.09, 0.09); }
	}
		if( rmin < -0.15 ) { return new Prediction("AT", 8.76, 0.75); }
	}
	}
	}
	if( max < 8.77 ) { 
	if( lmin < 1.21 ) { 
	if( rslope >= -20923 ) { 
	if( max < 6.31 ) { 
	if( lmin < -5.38 ) { 
		if( rmin >= -5.63 ) { return new Prediction("NAT", 7.66, 0.01); }
	if( rmin < -5.63 ) { 
		if( lmin < -6.27 ) { return new Prediction("NAT", 6.57, 0.01); }
		if( lmin >= -6.27 ) { return new Prediction("AT", 3.28, 0.28); }
	}
	}
		if( lmin >= -5.38 ) { return new Prediction("NAT", 33.94, 0.04); }
	}
	if( max >= 6.31 ) { 
	if( max < 7.62 ) { 
	if( lmin < 0.63 ) { 
		if( max >= 6.95 ) { return new Prediction("AT", 12.04, 1.03); }
	if( max < 6.95 ) { 
		if( rmin < -3.75 ) { return new Prediction("AT", 3.28, 0.28); }
		if( rmin >= -3.75 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
		if( lmin >= 0.63 ) { return new Prediction("NAT", 2.19, 0); }
	}
		if( max >= 7.62 ) { return new Prediction("NAT", 17.52, 0.02); }
	}
	}
	if( rslope < -20923 ) { 
	if( max >= 6.01 ) { 
		if( lmin >= 0.04 ) { return new Prediction("AT", 1.09, 0.09); }
		if( lmin < 0.04 ) { return new Prediction("NAT", 7.66, 0.01); }
	}
	if( max < 6.01 ) { 
	if( rslope < -26978 ) { 
		if( rmin < -1.49 ) { return new Prediction("NAT", 3.28, 0); }
	if( rmin >= -1.49 ) { 
		if( rmin < 2.66 ) { return new Prediction("AT", 6.57, 0.56); }
		if( rmin >= 2.66 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
		if( rslope >= -26978 ) { return new Prediction("AT", 13.14, 1.12); }
	}
	}
	}
	if( lmin >= 1.21 ) { 
	if( lslope >= -14898.5 ) { 
		if( lmin >= 2.54 ) { return new Prediction("NAT", 1.09, 0); }
		if( lmin < 2.54 ) { return new Prediction("AT", 1.09, 0.09); }
	}
		if( lslope < -14898.5 ) { return new Prediction("NAT", 18.61, 0.02); }
	}
	}
	}
	}
	if( lslope < -30196 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 45.99, 0.05); }
	if( rmin < -5.54 ) { 
		if( rmin >= -6.01 ) { return new Prediction("AT", 2.19, 0.19); }
		if( rmin < -6.01 ) { return new Prediction("NAT", 5.47, 0.01); }
	}
	}
	}
	if( max >= 12.91 ) { 
		if( lmin < 1.46 ) { return new Prediction("AT", 27.37, 2.34); }
		if( lmin >= 1.46 ) { return new Prediction("NAT", 2.19, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree67() {
	if( lmin >= -8.27 ) { 
	if( max < 10.58 ) { 
		if( max < 2.16 ) { return new Prediction("NAT", 208.44, 0); }
	if( max >= 2.16 ) { 
	if( lslope < -5364.5 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 55.58, 0); }
	if( lmin < 3.98 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 34.21, 0); }
	if( lslope >= -34743.5 ) { 
	if( lslope >= -34579 ) { 
	if( rmin >= -7.63 ) { 
	if( lmin >= -1.07 ) { 
	if( max >= 3.5 ) { 
		if( lmin < -0.6 ) { return new Prediction("AT", 3.21, 0.21); }
	if( lmin >= -0.6 ) { 
		if( lmin < -0.18 ) { return new Prediction("NAT", 7.48, 0); }
	if( lmin >= -0.18 ) { 
	if( rmin < 0.55 ) { 
	if( rmin < -0.38 ) { 
	if( max >= 7.29 ) { 
		if( lmin < -0.02 ) { return new Prediction("AT", 1.07, 0.07); }
	if( lmin >= -0.02 ) { 
		if( lmin >= 0.2 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < 0.2 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
		if( max < 7.29 ) { return new Prediction("NAT", 3.21, 0); }
	}
		if( rmin >= -0.38 ) { return new Prediction("AT", 7.48, 0.48); }
	}
	if( rmin >= 0.55 ) { 
	if( lslope < -14211 ) { 
	if( lmin < 0.56 ) { 
		if( rmin < 2.34 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= 2.34 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( lmin >= 0.56 ) { return new Prediction("NAT", 18.17, 0); }
	}
	if( lslope >= -14211 ) { 
		if( max < 6.63 ) { return new Prediction("NAT", 2.14, 0); }
		if( max >= 6.63 ) { return new Prediction("AT", 4.28, 0.28); }
	}
	}
	}
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 11.76, 0); }
	}
	if( lmin < -1.07 ) { 
	if( max >= 3.43 ) { 
	if( rslope >= -8873.5 ) { 
		if( lslope < -8338 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope >= -8338 ) { return new Prediction("NAT", 10.69, 0); }
	}
		if( rslope < -8873.5 ) { return new Prediction("NAT", 64.14, 0); }
	}
	if( max < 3.43 ) { 
	if( lmin >= -5.23 ) { 
	if( lslope < -18115.5 ) { 
		if( max < 2.88 ) { return new Prediction("NAT", 2.14, 0); }
		if( max >= 2.88 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lslope >= -18115.5 ) { return new Prediction("NAT", 10.69, 0); }
	}
		if( lmin < -5.23 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	}
	if( rmin < -7.63 ) { 
		if( rmin >= -8.95 ) { return new Prediction("AT", 6.41, 0.41); }
	if( rmin < -8.95 ) { 
		if( max >= 6.36 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 6.36 ) { return new Prediction("NAT", 4.28, 0); }
	}
	}
	}
		if( lslope < -34579 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 69.48, 0); }
	}
	}
	if( max >= 10.58 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 23.52, 0); }
	if( lmin < 3.6 ) { 
		if( rmin >= 5.96 ) { return new Prediction("NAT", 11.76, 0); }
	if( rmin < 5.96 ) { 
	if( lslope >= -23686.5 ) { 
	if( lslope < -4377.5 ) { 
	if( lmin >= 0.41 ) { 
		if( max >= 12.39 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 12.39 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	if( lmin < 0.41 ) { 
	if( max < 11.02 ) { 
		if( lmin < -2.31 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -2.31 ) { return new Prediction("AT", 3.21, 0.21); }
	}
		if( max >= 11.02 ) { return new Prediction("AT", 22.45, 1.45); }
	}
	}
		if( lslope >= -4377.5 ) { return new Prediction("NAT", 2.14, 0); }
	}
	if( lslope < -23686.5 ) { 
		if( max < 14.71 ) { return new Prediction("NAT", 8.55, 0); }
		if( max >= 14.71 ) { return new Prediction("AT", 4.28, 0.28); }
	}
	}
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( max < 3.31 ) { 
	if( rmin >= -14.84 ) { 
		if( max < -0.68 ) { return new Prediction("NAT", 27.79, 0); }
	if( max >= -0.68 ) { 
	if( lslope >= -10165.5 ) { 
		if( rslope >= -3381.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope < -3381.5 ) { return new Prediction("AT", 6.41, 0.41); }
	}
	if( lslope < -10165.5 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 17.1, 0); }
	if( lmin >= -12.19 ) { 
		if( rmin < -7.97 ) { return new Prediction("NAT", 6.41, 0); }
	if( rmin >= -7.97 ) { 
		if( lslope < -32770 ) { return new Prediction("NAT", 3.21, 0); }
	if( lslope >= -32770 ) { 
		if( rmin < -4.75 ) { return new Prediction("AT", 6.41, 0.41); }
		if( rmin >= -4.75 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	}
	}
	}
	}
	if( rmin < -14.84 ) { 
		if( rslope >= -13275.5 ) { return new Prediction("AT", 7.48, 0.48); }
		if( rslope < -13275.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( max >= 3.31 ) { 
	if( rslope < -18316.5 ) { 
	if( rslope >= -19885 ) { 
		if( max < 9.22 ) { return new Prediction("NAT", 2.14, 0); }
		if( max >= 9.22 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	if( rslope < -19885 ) { 
		if( lslope >= -28257 ) { return new Prediction("NAT", 12.83, 0); }
	if( lslope < -28257 ) { 
		if( lslope >= -35092.5 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lslope < -35092.5 ) { return new Prediction("NAT", 7.48, 0); }
	}
	}
	}
	if( rslope >= -18316.5 ) { 
	if( rslope < -12811.5 ) { 
	if( rslope < -13539.5 ) { 
	if( lslope < -16801.5 ) { 
		if( lslope < -17290.5 ) { return new Prediction("AT", 4.28, 0.28); }
		if( lslope >= -17290.5 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( lslope >= -16801.5 ) { return new Prediction("AT", 31, 2); }
	}
		if( rslope >= -13539.5 ) { return new Prediction("NAT", 5.34, 0); }
	}
		if( rslope >= -12811.5 ) { return new Prediction("AT", 85.51, 5.51); }
	}
	}
	}
return null;
}
private Prediction runTree68() {
	if( lmin >= -8.97 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 123.55, 0); }
	if( lslope < -5395 ) { 
	if( max < 3.17 ) { 
		if( rslope >= -6082.5 ) { return new Prediction("AT", 3.22, 0.22); }
		if( rslope < -6082.5 ) { return new Prediction("NAT", 249.24, 0); }
	}
	if( max >= 3.17 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 56.94, 0); }
	if( lmin < 3.7 ) { 
	if( max < 12.03 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 33.3, 0); }
	if( rslope >= -34924 ) { 
	if( lslope < -7867.5 ) { 
	if( rmin < -4.16 ) { 
	if( max < 8.66 ) { 
		if( lmin >= -3.75 ) { return new Prediction("NAT", 9.67, 0); }
	if( lmin < -3.75 ) { 
		if( lslope >= -10373 ) { return new Prediction("AT", 6.45, 0.45); }
	if( lslope < -10373 ) { 
	if( rslope < -17311.5 ) { 
		if( max < 6.99 ) { return new Prediction("AT", 5.37, 0.37); }
	if( max >= 6.99 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 2.15, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	if( rslope >= -17311.5 ) { 
	if( max < 3.96 ) { 
		if( max < 3.39 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 3.39 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( max >= 3.96 ) { return new Prediction("NAT", 3.22, 0); }
	}
	}
	}
	}
		if( max >= 8.66 ) { return new Prediction("AT", 7.52, 0.52); }
	}
	if( rmin >= -4.16 ) { 
	if( max < 3.8 ) { 
		if( rmin < -0.27 ) { return new Prediction("NAT", 7.52, 0); }
	if( rmin >= -0.27 ) { 
	if( lmin < 1.21 ) { 
		if( lslope >= -32300.5 ) { return new Prediction("AT", 10.74, 0.74); }
		if( lslope < -32300.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin >= 1.21 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	if( max >= 3.8 ) { 
	if( max >= 7.32 ) { 
		if( lmin < -2.59 ) { return new Prediction("NAT", 22.56, 0); }
	if( lmin >= -2.59 ) { 
	if( max >= 7.59 ) { 
	if( rmin >= 0.27 ) { 
	if( lslope >= -12089.5 ) { 
		if( lslope >= -9598 ) { return new Prediction("NAT", 2.15, 0); }
		if( lslope < -9598 ) { return new Prediction("AT", 3.22, 0.22); }
	}
		if( lslope < -12089.5 ) { return new Prediction("NAT", 16.11, 0); }
	}
		if( rmin < 0.27 ) { return new Prediction("AT", 5.37, 0.37); }
	}
		if( max < 7.59 ) { return new Prediction("AT", 6.45, 0.45); }
	}
	}
	if( max < 7.32 ) { 
	if( rslope < -27906 ) { 
		if( lslope < -29877 ) { return new Prediction("NAT", 7.52, 0); }
	if( lslope >= -29877 ) { 
		if( rmin < -0.92 ) { return new Prediction("NAT", 1.07, 0); }
	if( rmin >= -0.92 ) { 
		if( lmin < 2.16 ) { return new Prediction("AT", 2.15, 0.15); }
		if( lmin >= 2.16 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
		if( rslope >= -27906 ) { return new Prediction("NAT", 32.23, 0); }
	}
	}
	}
	}
	if( lslope >= -7867.5 ) { 
	if( rmin >= -6.77 ) { 
	if( rmin >= 2.6 ) { 
		if( max >= 7.22 ) { return new Prediction("AT", 6.45, 0.45); }
		if( max < 7.22 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rmin < 2.6 ) { 
		if( lmin >= -0.25 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -0.25 ) { return new Prediction("NAT", 5.37, 0); }
	}
	}
		if( rmin < -6.77 ) { return new Prediction("AT", 8.59, 0.59); }
	}
	}
	}
		if( max >= 12.03 ) { return new Prediction("AT", 18.26, 1.26); }
	}
	}
	}
	}
	if( lmin < -8.97 ) { 
	if( rslope >= -19140 ) { 
	if( max < 9.82 ) { 
	if( rslope >= -10849.5 ) { 
	if( max >= -5.41 ) { 
	if( lmin < -17.77 ) { 
		if( lmin >= -18.18 ) { return new Prediction("NAT", 3.22, 0); }
		if( lmin < -18.18 ) { return new Prediction("AT", 5.37, 0.37); }
	}
		if( lmin >= -17.77 ) { return new Prediction("AT", 27.93, 1.93); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 8.59, 0); }
	}
	if( rslope < -10849.5 ) { 
	if( max < 9.21 ) { 
	if( lslope < -13963.5 ) { 
	if( lslope < -14359.5 ) { 
		if( max < 2.63 ) { return new Prediction("AT", 1.07, 0.07); }
	if( max >= 2.63 ) { 
		if( rmin < -13.74 ) { return new Prediction("AT", 1.07, 0.07); }
	if( rmin >= -13.74 ) { 
		if( lslope >= -18404.5 ) { return new Prediction("NAT", 12.89, 0); }
		if( lslope < -18404.5 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
		if( lslope >= -14359.5 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( lslope >= -13963.5 ) { return new Prediction("NAT", 13.97, 0); }
	}
		if( max >= 9.21 ) { return new Prediction("AT", 4.3, 0.3); }
	}
	}
	if( max >= 9.82 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -23.72 ) { return new Prediction("AT", 75.2, 5.2); }
	}
	}
	if( rslope < -19140 ) { 
		if( max < 9.3 ) { return new Prediction("NAT", 23.63, 0); }
	if( max >= 9.3 ) { 
		if( rmin < -5.52 ) { return new Prediction("AT", 3.22, 0.22); }
		if( rmin >= -5.52 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
return null;
}
private Prediction runTree69() {
	if( rmin >= -7.68 ) { 
	if( lmin >= -9.06 ) { 
	if( max < 10.58 ) { 
	if( max >= 1.68 ) { 
	if( lmin < -4.76 ) { 
		if( rmin >= -4.07 ) { return new Prediction("NAT", 19.26, 0.05); }
	if( rmin < -4.07 ) { 
	if( rslope < -33045 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 4.28, 0.01); }
	if( rmin < -5.54 ) { 
		if( lmin >= -8.32 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -8.32 ) { return new Prediction("NAT", 3.21, 0.01); }
	}
	}
	if( rslope >= -33045 ) { 
	if( lmin < -6.27 ) { 
	if( lmin < -6.34 ) { 
		if( lmin >= -7.9 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin < -7.9 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin >= -6.34 ) { return new Prediction("NAT", 3.21, 0.01); }
	}
	if( lmin >= -6.27 ) { 
	if( lslope < -4631.5 ) { 
	if( rmin >= -5.18 ) { 
		if( max < 5.7 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 5.7 ) { return new Prediction("AT", 4.28, 0.27); }
	}
		if( rmin < -5.18 ) { return new Prediction("AT", 6.42, 0.41); }
	}
		if( lslope >= -4631.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	if( lmin >= -4.76 ) { 
	if( lmin >= -1.07 ) { 
	if( lmin >= 1.12 ) { 
		if( max < 8.79 ) { return new Prediction("NAT", 78.13, 0.18); }
	if( max >= 8.79 ) { 
	if( lmin < 4.17 ) { 
		if( lslope >= -16920.5 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lslope < -16920.5 ) { return new Prediction("NAT", 5.35, 0.01); }
	}
		if( lmin >= 4.17 ) { return new Prediction("NAT", 52.44, 0.12); }
	}
	}
	if( lmin < 1.12 ) { 
	if( lslope < -22933.5 ) { 
	if( lslope >= -32300.5 ) { 
	if( lmin >= 0.06 ) { 
		if( rmin < 1.3 ) { return new Prediction("AT", 12.84, 0.81); }
		if( rmin >= 1.3 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( lmin < 0.06 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( lslope < -32300.5 ) { return new Prediction("NAT", 10.7, 0.03); }
	}
	if( lslope >= -22933.5 ) { 
		if( lmin >= -1.03 ) { return new Prediction("NAT", 33.18, 0.08); }
		if( lmin < -1.03 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	}
		if( lmin < -1.07 ) { return new Prediction("NAT", 96.32, 0.23); }
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 190.51, 0.45); }
	}
	if( max >= 10.58 ) { 
		if( lslope >= -6610.5 ) { return new Prediction("NAT", 21.41, 0.05); }
	if( lslope < -6610.5 ) { 
	if( rslope < -19197 ) { 
	if( max < 14.92 ) { 
		if( lslope < -22565 ) { return new Prediction("NAT", 10.7, 0.03); }
	if( lslope >= -22565 ) { 
	if( lslope < -21088 ) { 
		if( lmin < -4.24 ) { return new Prediction("AT", 3.21, 0.2); }
	if( lmin >= -4.24 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( max >= 11.09 ) { return new Prediction("AT", 3.21, 0.2); }
	}
	}
		if( lslope >= -21088 ) { return new Prediction("NAT", 7.49, 0.02); }
	}
	}
		if( max >= 14.92 ) { return new Prediction("AT", 4.28, 0.27); }
	}
	if( rslope >= -19197 ) { 
		if( rmin >= 2.97 ) { return new Prediction("AT", 12.84, 0.81); }
	if( rmin < 2.97 ) { 
		if( rmin >= 1.82 ) { return new Prediction("NAT", 2.14, 0.01); }
	if( rmin < 1.82 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < 3.98 ) { return new Prediction("AT", 11.77, 0.75); }
	}
	}
	}
	}
	}
	}
	if( lmin < -9.06 ) { 
	if( lslope < -19947.5 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 13.91, 0.03); }
		if( max >= 18.14 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	if( lslope >= -19947.5 ) { 
		if( max >= 9.6 ) { return new Prediction("AT", 41.74, 2.64); }
	if( max < 9.6 ) { 
	if( max >= 5.18 ) { 
		if( max < 9.18 ) { return new Prediction("AT", 6.42, 0.41); }
		if( max >= 9.18 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( max < 5.18 ) { 
		if( max >= 2.64 ) { return new Prediction("NAT", 4.28, 0.01); }
	if( max < 2.64 ) { 
		if( rmin < -4.75 ) { return new Prediction("AT", 4.28, 0.27); }
	if( rmin >= -4.75 ) { 
		if( lslope >= -11061.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -11061.5 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
	}
	}
	}
	}
	}
	if( rmin < -7.68 ) { 
		if( rslope < -21521 ) { return new Prediction("NAT", 23.55, 0.06); }
	if( rslope >= -21521 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 9.63, 0.02); }
	if( lmin < -4.28 ) { 
	if( max >= 5.19 ) { 
		if( lmin < -23.72 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= -23.72 ) { 
	if( rmin < -12.48 ) { 
	if( max < 9.92 ) { 
		if( lslope < -16039.5 ) { return new Prediction("NAT", 1.07, 0); }
	if( lslope >= -16039.5 ) { 
		if( lslope < -11944 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lslope >= -11944 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( max >= 9.92 ) { return new Prediction("AT", 10.7, 0.68); }
	}
	if( rmin >= -12.48 ) { 
		if( lslope >= -12008 ) { return new Prediction("AT", 26.76, 1.69); }
	if( lslope < -12008 ) { 
		if( rslope >= -14281.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope < -14281.5 ) { return new Prediction("AT", 17.12, 1.08); }
	}
	}
	}
	}
	if( max < 5.19 ) { 
	if( lslope < -10729.5 ) { 
		if( lslope >= -17205 ) { return new Prediction("NAT", 20.34, 0.05); }
	if( lslope < -17205 ) { 
		if( max >= 1.14 ) { return new Prediction("AT", 5.35, 0.34); }
		if( max < 1.14 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
	if( lslope >= -10729.5 ) { 
		if( max < -5.53 ) { return new Prediction("NAT", 5.35, 0.01); }
	if( max >= -5.53 ) { 
	if( lslope < -3296 ) { 
		if( rmin < -9.28 ) { return new Prediction("AT", 27.83, 1.76); }
	if( rmin >= -9.28 ) { 
		if( lmin >= -11.92 ) { return new Prediction("AT", 3.21, 0.2); }
		if( lmin < -11.92 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lslope >= -3296 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree70() {
	if( lmin < -9.2 ) { 
	if( max >= 4.48 ) { 
	if( rslope >= -20001.5 ) { 
	if( max < 11.09 ) { 
		if( max >= 10.92 ) { return new Prediction("NAT", 2.11, 0); }
	if( max < 10.92 ) { 
		if( lslope >= -13241.5 ) { return new Prediction("AT", 14.74, 0.71); }
	if( lslope < -13241.5 ) { 
	if( lslope < -14749.5 ) { 
	if( lslope < -16970 ) { 
		if( lmin >= -11.1 ) { return new Prediction("AT", 4.21, 0.2); }
		if( lmin < -11.1 ) { return new Prediction("NAT", 2.11, 0); }
	}
		if( lslope >= -16970 ) { return new Prediction("AT", 10.53, 0.51); }
	}
		if( lslope >= -14749.5 ) { return new Prediction("NAT", 3.16, 0.01); }
	}
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 66.34, 3.19); }
	}
	if( rslope < -20001.5 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 5.27, 0.01); }
		if( max >= 18.14 ) { return new Prediction("AT", 2.11, 0.1); }
	}
	}
	if( max < 4.48 ) { 
	if( rslope >= -11119 ) { 
		if( rslope < -5752 ) { return new Prediction("AT", 20.01, 0.96); }
	if( rslope >= -5752 ) { 
		if( max < 1.08 ) { return new Prediction("NAT", 9.48, 0.02); }
		if( max >= 1.08 ) { return new Prediction("AT", 2.11, 0.1); }
	}
	}
	if( rslope < -11119 ) { 
		if( rmin < -7.97 ) { return new Prediction("NAT", 18.96, 0.04); }
	if( rmin >= -7.97 ) { 
	if( rmin < -5.25 ) { 
		if( lslope < -32770 ) { return new Prediction("NAT", 1.05, 0); }
		if( lslope >= -32770 ) { return new Prediction("AT", 7.37, 0.35); }
	}
		if( rmin >= -5.25 ) { return new Prediction("NAT", 15.8, 0.04); }
	}
	}
	}
	}
	if( lmin >= -9.2 ) { 
	if( rslope < -5914 ) { 
		if( lslope < -36676 ) { return new Prediction("NAT", 101.1, 0.24); }
	if( lslope >= -36676 ) { 
		if( rmin >= 5.77 ) { return new Prediction("NAT", 50.55, 0.12); }
	if( rmin < 5.77 ) { 
	if( max < 3.17 ) { 
	if( lslope >= -5954 ) { 
		if( max < -1.66 ) { return new Prediction("NAT", 1.05, 0); }
		if( max >= -1.66 ) { return new Prediction("AT", 2.11, 0.1); }
	}
		if( lslope < -5954 ) { return new Prediction("NAT", 195.87, 0.46); }
	}
	if( max >= 3.17 ) { 
	if( max < 10.9 ) { 
	if( rmin >= -5.54 ) { 
	if( lmin >= 0.24 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 13.69, 0.03); }
	if( lmin < 3.98 ) { 
	if( lslope >= -29879 ) { 
		if( max >= 8.24 ) { return new Prediction("AT", 6.32, 0.3); }
	if( max < 8.24 ) { 
	if( lslope >= -20076.5 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 5.27, 0.01); }
	if( max >= 7.05 ) { 
		if( rslope < -14120.5 ) { return new Prediction("NAT", 2.11, 0); }
		if( rslope >= -14120.5 ) { return new Prediction("AT", 2.11, 0.1); }
	}
	}
	if( lslope < -20076.5 ) { 
		if( lmin >= 1.25 ) { return new Prediction("NAT", 2.11, 0); }
		if( lmin < 1.25 ) { return new Prediction("AT", 6.32, 0.3); }
	}
	}
	}
		if( lslope < -29879 ) { return new Prediction("NAT", 6.32, 0.01); }
	}
	}
	if( lmin < 0.24 ) { 
		if( lslope >= -5999.5 ) { return new Prediction("AT", 1.05, 0.05); }
	if( lslope < -5999.5 ) { 
		if( max < 3.31 ) { return new Prediction("AT", 1.05, 0.05); }
	if( max >= 3.31 ) { 
	if( rslope < -32673 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.05, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	if( rslope >= -32673 ) { 
		if( rmin < 1.79 ) { return new Prediction("NAT", 49.5, 0.12); }
	if( rmin >= 1.79 ) { 
		if( lmin < -1.52 ) { return new Prediction("NAT", 9.48, 0.02); }
	if( lmin >= -1.52 ) { 
		if( max < 6.41 ) { return new Prediction("NAT", 3.16, 0.01); }
		if( max >= 6.41 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	}
	}
	}
	}
	}
	}
	if( rmin < -5.54 ) { 
	if( lslope >= -19090 ) { 
	if( max >= 5.44 ) { 
	if( rslope >= -13151.5 ) { 
		if( max >= 7.28 ) { return new Prediction("NAT", 4.21, 0.01); }
	if( max < 7.28 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 2.11, 0); }
		if( rslope >= -10417 ) { return new Prediction("AT", 5.27, 0.25); }
	}
	}
		if( rslope < -13151.5 ) { return new Prediction("AT", 3.16, 0.15); }
	}
	if( max < 5.44 ) { 
		if( rmin >= -7.27 ) { return new Prediction("AT", 1.05, 0.05); }
		if( rmin < -7.27 ) { return new Prediction("NAT", 13.69, 0.03); }
	}
	}
	if( lslope < -19090 ) { 
	if( max >= 4.34 ) { 
		if( lmin < -1.81 ) { return new Prediction("AT", 3.16, 0.15); }
		if( lmin >= -1.81 ) { return new Prediction("NAT", 1.05, 0); }
	}
		if( max < 4.34 ) { return new Prediction("AT", 6.32, 0.3); }
	}
	}
	}
	if( max >= 10.9 ) { 
	if( rmin < 2.1 ) { 
	if( rmin < -5.61 ) { 
		if( lslope >= -16544 ) { return new Prediction("AT", 2.11, 0.1); }
		if( lslope < -16544 ) { return new Prediction("NAT", 1.05, 0); }
	}
		if( rmin >= -5.61 ) { return new Prediction("AT", 23.17, 1.11); }
	}
	if( rmin >= 2.1 ) { 
		if( lslope >= -10739.5 ) { return new Prediction("AT", 4.21, 0.2); }
		if( lslope < -10739.5 ) { return new Prediction("NAT", 6.32, 0.01); }
	}
	}
	}
	}
	}
	}
		if( rslope >= -5914 ) { return new Prediction("NAT", 128.48, 0.3); }
	}
return null;
}
private Prediction runTree71() {
	if( max >= 10.73 ) { 
	if( lmin < 3.22 ) { 
	if( lslope < -19947.5 ) { 
	if( max < 17.33 ) { 
	if( rmin >= -3.1 ) { 
	if( lslope < -21088 ) { 
		if( rmin >= 0.85 ) { return new Prediction("NAT", 4.25, 0); }
		if( rmin < 0.85 ) { return new Prediction("AT", 4.25, 0.25); }
	}
		if( lslope >= -21088 ) { return new Prediction("NAT", 5.32, 0.01); }
	}
		if( rmin < -3.1 ) { return new Prediction("NAT", 10.64, 0.01); }
	}
		if( max >= 17.33 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	if( lslope >= -19947.5 ) { 
	if( rslope >= -3293 ) { 
		if( max >= 13.46 ) { return new Prediction("AT", 7.45, 0.44); }
	if( max < 13.46 ) { 
	if( rmin < -5 ) { 
		if( lmin >= -18.86 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -18.86 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin >= -5 ) { return new Prediction("NAT", 6.38, 0.01); }
	}
	}
	if( rslope < -3293 ) { 
		if( lmin < -1.66 ) { return new Prediction("AT", 57.43, 3.37); }
	if( lmin >= -1.66 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 15.95, 0.94); }
		if( lmin < -1.14 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	}
	}
		if( lmin >= 3.22 ) { return new Prediction("NAT", 23.4, 0.03); }
	}
	if( max < 10.73 ) { 
	if( lmin >= -8.27 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 1.12 ) { return new Prediction("NAT", 126.57, 0.15); }
	if( lmin < 1.12 ) { 
	if( max < 5.52 ) { 
	if( max >= 1.74 ) { 
	if( lmin < 0.88 ) { 
	if( lmin >= -4.28 ) { 
		if( rmin < 1.16 ) { return new Prediction("NAT", 80.83, 0.09); }
	if( rmin >= 1.16 ) { 
	if( max < 4.3 ) { 
		if( rmin < 1.26 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin >= 1.26 ) { return new Prediction("NAT", 3.19, 0); }
	}
		if( max >= 4.3 ) { return new Prediction("NAT", 11.7, 0.01); }
	}
	}
	if( lmin < -4.28 ) { 
	if( max >= 3.56 ) { 
		if( max >= 4.14 ) { return new Prediction("NAT", 22.34, 0.03); }
	if( max < 4.14 ) { 
		if( lmin < -5.48 ) { return new Prediction("NAT", 6.38, 0.01); }
	if( lmin >= -5.48 ) { 
		if( max >= 3.92 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 3.92 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	if( max < 3.56 ) { 
		if( max >= 3.07 ) { return new Prediction("AT", 5.32, 0.31); }
	if( max < 3.07 ) { 
		if( lmin < -6.91 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -6.91 ) { return new Prediction("NAT", 5.32, 0.01); }
	}
	}
	}
	}
		if( lmin >= 0.88 ) { return new Prediction("AT", 3.19, 0.19); }
	}
		if( max < 1.74 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	if( max >= 5.52 ) { 
	if( lmin >= -0.84 ) { 
	if( lmin < 0.72 ) { 
	if( rmin < 3 ) { 
	if( rmin < -1.33 ) { 
		if( rmin < -1.85 ) { return new Prediction("AT", 2.13, 0.12); }
		if( rmin >= -1.85 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin >= -1.33 ) { return new Prediction("AT", 18.08, 1.06); }
	}
	if( rmin >= 3 ) { 
		if( lmin < -0.23 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -0.23 ) { return new Prediction("NAT", 5.32, 0.01); }
	}
	}
		if( lmin >= 0.72 ) { return new Prediction("NAT", 7.45, 0.01); }
	}
	if( lmin < -0.84 ) { 
	if( rmin < -5.65 ) { 
		if( lmin < -6.49 ) { return new Prediction("NAT", 2.13, 0); }
		if( lmin >= -6.49 ) { return new Prediction("AT", 8.51, 0.5); }
	}
	if( rmin >= -5.65 ) { 
	if( max >= 8.39 ) { 
		if( lmin >= -1.11 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lmin < -1.11 ) { 
	if( rmin < -0.93 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rmin >= -0.93 ) { return new Prediction("NAT", 12.76, 0.01); }
	}
	}
		if( max < 8.39 ) { return new Prediction("NAT", 32.97, 0.04); }
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 205.27, 0.24); }
	}
	if( lmin < -8.27 ) { 
	if( lslope >= -17810.5 ) { 
		if( lslope >= -4851.5 ) { return new Prediction("NAT", 17.02, 0.02); }
	if( lslope < -4851.5 ) { 
	if( lslope < -10187 ) { 
	if( max < 9.21 ) { 
	if( lslope >= -14836.5 ) { 
		if( lmin < -16.69 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lmin >= -16.69 ) { 
		if( rslope < -11146 ) { return new Prediction("NAT", 19.14, 0.02); }
	if( rslope >= -11146 ) { 
		if( lslope < -10565.5 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lslope >= -10565.5 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	}
	if( lslope < -14836.5 ) { 
		if( lslope >= -15741.5 ) { return new Prediction("AT", 6.38, 0.37); }
	if( lslope < -15741.5 ) { 
		if( lslope < -17477 ) { return new Prediction("AT", 4.25, 0.25); }
		if( lslope >= -17477 ) { return new Prediction("NAT", 6.38, 0.01); }
	}
	}
	}
		if( max >= 9.21 ) { return new Prediction("AT", 9.57, 0.56); }
	}
		if( lslope >= -10187 ) { return new Prediction("AT", 36.16, 2.12); }
	}
	}
		if( lslope < -17810.5 ) { return new Prediction("NAT", 35.1, 0.04); }
	}
	}
return null;
}
private Prediction runTree72() {
	if( lmin >= -8.27 ) { 
	if( max < 3.42 ) { 
		if( lslope < -5941.5 ) { return new Prediction("NAT", 211.92, 0); }
	if( lslope >= -5941.5 ) { 
	if( rslope < -5914 ) { 
		if( lmin >= -5.58 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -5.58 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rslope >= -5914 ) { return new Prediction("NAT", 28.75, 0); }
	}
	}
	if( max >= 3.42 ) { 
	if( lslope < -5137.5 ) { 
	if( max < 12.91 ) { 
	if( rslope >= -35845.5 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 35.14, 0); }
	if( rmin < 6.73 ) { 
	if( lmin >= -1.07 ) { 
	if( rmin >= -17.66 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 21.3, 0); }
	if( lmin < 3.98 ) { 
	if( lmin >= -0.63 ) { 
		if( rmin < -4.6 ) { return new Prediction("NAT", 5.32, 0); }
	if( rmin >= -4.6 ) { 
	if( lmin >= 0.32 ) { 
	if( max < 8.76 ) { 
		if( lmin >= 1.27 ) { return new Prediction("NAT", 5.32, 0); }
	if( lmin < 1.27 ) { 
	if( lslope >= -21314.5 ) { 
		if( lslope < -12527 ) { return new Prediction("NAT", 5.32, 0); }
	if( lslope >= -12527 ) { 
		if( lmin < 0.44 ) { return new Prediction("NAT", 2.13, 0); }
		if( lmin >= 0.44 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	}
		if( lslope < -21314.5 ) { return new Prediction("AT", 10.65, 0.65); }
	}
	}
		if( max >= 8.76 ) { return new Prediction("AT", 9.58, 0.58); }
	}
	if( lmin < 0.32 ) { 
		if( rmin < -0.92 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin >= -0.92 ) { return new Prediction("NAT", 9.58, 0); }
	}
	}
	}
	if( lmin < -0.63 ) { 
		if( lslope >= -18381 ) { return new Prediction("AT", 8.52, 0.52); }
		if( lslope < -18381 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
		if( rmin < -17.66 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	if( lmin < -1.07 ) { 
	if( lmin >= -5.51 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 56.44, 0); }
	if( max >= 11.09 ) { 
		if( lmin >= -1.95 ) { return new Prediction("NAT", 4.26, 0); }
		if( lmin < -1.95 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	if( lmin < -5.51 ) { 
		if( max < 3.73 ) { return new Prediction("AT", 5.32, 0.32); }
	if( max >= 3.73 ) { 
		if( rmin >= -4.07 ) { return new Prediction("NAT", 6.39, 0); }
	if( rmin < -4.07 ) { 
		if( max < 5.26 ) { return new Prediction("NAT", 3.19, 0); }
	if( max >= 5.26 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 3.19, 0.19); }
	if( max >= 5.93 ) { 
	if( rmin >= -7.46 ) { 
		if( lmin < -6.19 ) { return new Prediction("NAT", 1.06, 0); }
	if( lmin >= -6.19 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
		if( rmin < -7.46 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
	}
	}
	}
	}
	}
	}
		if( rslope < -35845.5 ) { return new Prediction("NAT", 57.51, 0); }
	}
	if( max >= 12.91 ) { 
	if( lslope < -23046 ) { 
		if( lmin < -0.7 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -0.7 ) { return new Prediction("NAT", 4.26, 0); }
	}
		if( lslope >= -23046 ) { return new Prediction("AT", 21.3, 1.3); }
	}
	}
		if( lslope >= -5137.5 ) { return new Prediction("NAT", 96.91, 0); }
	}
	}
	if( lmin < -8.27 ) { 
	if( lslope < -19947.5 ) { 
		if( max < 17.33 ) { return new Prediction("NAT", 22.36, 0); }
		if( max >= 17.33 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	if( lslope >= -19947.5 ) { 
	if( max >= 9.74 ) { 
	if( rmin < -14.95 ) { 
		if( lslope < -5833.49 ) { return new Prediction("AT", 5.32, 0.32); }
		if( lslope >= -5833.49 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin >= -14.95 ) { return new Prediction("AT", 66.02, 4.02); }
	}
	if( max < 9.74 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 15.97, 0); }
	if( max >= -4.9 ) { 
	if( rslope >= -10849.5 ) { 
	if( lmin < -17.77 ) { 
		if( lmin >= -18.18 ) { return new Prediction("NAT", 3.19, 0); }
		if( lmin < -18.18 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	if( lmin >= -17.77 ) { 
		if( lslope >= -10480.5 ) { return new Prediction("AT", 39.4, 2.4); }
	if( lslope < -10480.5 ) { 
		if( rmin >= -9.14 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin < -9.14 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	if( rslope < -10849.5 ) { 
		if( lslope >= -14875.5 ) { return new Prediction("NAT", 28.75, 0); }
	if( lslope < -14875.5 ) { 
	if( lslope < -15686 ) { 
	if( lmin >= -11.29 ) { 
		if( rmin < -15.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -15.79 ) { return new Prediction("AT", 4.26, 0.26); }
	}
	if( lmin < -11.29 ) { 
		if( max < 2.4 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max >= 2.4 ) { return new Prediction("NAT", 11.71, 0); }
	}
	}
		if( lslope >= -15686 ) { return new Prediction("AT", 11.71, 0.71); }
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree73() {
	if( lmin < -8.21 ) { 
	if( max < 4.47 ) { 
	if( lslope >= -10480.5 ) { 
		if( max < -4.54 ) { return new Prediction("NAT", 11.71, 0.01); }
		if( max >= -4.54 ) { return new Prediction("AT", 18.1, 1.08); }
	}
	if( lslope < -10480.5 ) { 
	if( rmin >= -7.87 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 9.58, 0.01); }
	if( max < 2.61 ) { 
		if( max < 1.37 ) { return new Prediction("NAT", 6.39, 0.01); }
		if( max >= 1.37 ) { return new Prediction("AT", 4.26, 0.25); }
	}
	}
		if( rmin < -7.87 ) { return new Prediction("NAT", 25.56, 0.03); }
	}
	}
	if( max >= 4.47 ) { 
		if( lslope >= -13253.5 ) { return new Prediction("AT", 58.57, 3.5); }
	if( lslope < -13253.5 ) { 
		if( max < 6.87 ) { return new Prediction("NAT", 5.32, 0.01); }
	if( max >= 6.87 ) { 
	if( max < 9.21 ) { 
		if( lslope >= -14134 ) { return new Prediction("NAT", 3.19, 0); }
	if( lslope < -14134 ) { 
	if( lslope < -16310 ) { 
		if( lslope < -17931 ) { return new Prediction("AT", 3.19, 0.19); }
		if( lslope >= -17931 ) { return new Prediction("NAT", 2.13, 0); }
	}
		if( lslope >= -16310 ) { return new Prediction("AT", 5.32, 0.32); }
	}
	}
	if( max >= 9.21 ) { 
	if( max >= 12.85 ) { 
		if( lmin < -10.67 ) { return new Prediction("AT", 6.39, 0.38); }
	if( lmin >= -10.67 ) { 
		if( max >= 15.71 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 15.71 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
		if( max < 12.85 ) { return new Prediction("AT", 26.62, 1.59); }
	}
	}
	}
	}
	}
	if( lmin >= -8.21 ) { 
	if( rslope < -6538 ) { 
	if( rslope >= -21351.5 ) { 
	if( rmin < 0.61 ) { 
	if( max < 11.48 ) { 
	if( lmin >= -5.58 ) { 
	if( rslope < -20771.5 ) { 
		if( lslope < -21002 ) { return new Prediction("NAT", 4.26, 0); }
		if( lslope >= -21002 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( rslope >= -20771.5 ) { return new Prediction("NAT", 100.1, 0.12); }
	}
	if( lmin < -5.58 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 23.43, 0.03); }
	if( max >= 1.66 ) { 
		if( rmin >= -5.63 ) { return new Prediction("NAT", 4.26, 0); }
	if( rmin < -5.63 ) { 
	if( lmin < -6.27 ) { 
		if( max < 3.59 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max >= 3.59 ) { return new Prediction("NAT", 3.19, 0); }
	}
		if( lmin >= -6.27 ) { return new Prediction("AT", 6.39, 0.38); }
	}
	}
	}
	}
	if( max >= 11.48 ) { 
		if( rmin < -15.6 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -15.6 ) { return new Prediction("AT", 21.3, 1.27); }
	}
	}
	if( rmin >= 0.61 ) { 
	if( rmin >= 5.94 ) { 
		if( max < 19.1 ) { return new Prediction("NAT", 21.3, 0.02); }
		if( max >= 19.1 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( rmin < 5.94 ) { 
	if( lmin >= 1.69 ) { 
		if( max < 10.87 ) { return new Prediction("AT", 10.65, 0.64); }
	if( max >= 10.87 ) { 
		if( lmin < 4.74 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= 4.74 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( lmin < 1.69 ) { 
	if( lmin < -0.6 ) { 
	if( lmin < -1.66 ) { 
		if( max >= 11.3 ) { return new Prediction("AT", 3.19, 0.19); }
		if( max < 11.3 ) { return new Prediction("NAT", 9.58, 0.01); }
	}
		if( lmin >= -1.66 ) { return new Prediction("AT", 8.52, 0.51); }
	}
	if( lmin >= -0.6 ) { 
		if( max < 6.93 ) { return new Prediction("NAT", 9.58, 0.01); }
	if( max >= 6.93 ) { 
		if( lslope >= -12907.5 ) { return new Prediction("AT", 3.19, 0.19); }
		if( lslope < -12907.5 ) { return new Prediction("NAT", 5.32, 0.01); }
	}
	}
	}
	}
	}
	}
	if( rslope < -21351.5 ) { 
	if( max >= 3.5 ) { 
		if( rmin >= 0.41 ) { return new Prediction("NAT", 76.67, 0.09); }
	if( rmin < 0.41 ) { 
	if( lslope >= -36141 ) { 
	if( max < 11.09 ) { 
	if( rslope < -29051.5 ) { 
		if( lmin >= -1.31 ) { return new Prediction("AT", 4.26, 0.25); }
	if( lmin < -1.31 ) { 
		if( max < 4.81 ) { return new Prediction("NAT", 3.19, 0); }
	if( max >= 4.81 ) { 
	if( rmin >= -5.54 ) { 
	if( max < 9.64 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.06, 0.06); }
	}
		if( max >= 9.64 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( rmin < -5.54 ) { return new Prediction("AT", 2.13, 0.13); }
	}
	}
	}
	if( rslope >= -29051.5 ) { 
		if( rmin >= -0.52 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < -0.52 ) { return new Prediction("NAT", 13.84, 0.02); }
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 6.39, 0.38); }
	}
		if( lslope < -36141 ) { return new Prediction("NAT", 24.49, 0.03); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 144.83, 0.17); }
	}
	}
		if( rslope >= -6538 ) { return new Prediction("NAT", 142.7, 0.17); }
	}
return null;
}
private Prediction runTree74() {
	if( lmin < -7.72 ) { 
	if( max < 4.56 ) { 
	if( rmin >= -15.63 ) { 
		if( max < 0.04 ) { return new Prediction("NAT", 35.23, 0.08); }
	if( max >= 0.04 ) { 
	if( rslope < -10795.5 ) { 
	if( max < 2.72 ) { 
		if( max >= 2.14 ) { return new Prediction("AT", 5.34, 0.33); }
	if( max < 2.14 ) { 
	if( rslope >= -17995 ) { 
		if( max >= 1.61 ) { return new Prediction("AT", 2.14, 0.13); }
		if( max < 1.61 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
		if( rslope < -17995 ) { return new Prediction("NAT", 10.68, 0.03); }
	}
	}
		if( max >= 2.72 ) { return new Prediction("NAT", 13.88, 0.03); }
	}
	if( rslope >= -10795.5 ) { 
		if( lmin < -13.26 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -13.26 ) { return new Prediction("AT", 9.61, 0.59); }
	}
	}
	}
	if( rmin < -15.63 ) { 
		if( rslope >= -13136.5 ) { return new Prediction("AT", 17.08, 1.04); }
		if( rslope < -13136.5 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
	if( max >= 4.56 ) { 
	if( rslope >= -17033.5 ) { 
		if( max >= 9.74 ) { return new Prediction("AT", 60.85, 3.71); }
	if( max < 9.74 ) { 
	if( rmin >= -8.28 ) { 
		if( lmin >= -11.09 ) { return new Prediction("NAT", 3.2, 0.01); }
		if( lmin < -11.09 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	if( rmin < -8.28 ) { 
		if( lmin < -15.72 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= -15.72 ) { 
		if( lmin < -9.8 ) { return new Prediction("AT", 9.61, 0.59); }
	if( lmin >= -9.8 ) { 
		if( lmin < -9.34 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -9.34 ) { return new Prediction("AT", 5.34, 0.33); }
	}
	}
	}
	}
	}
	if( rslope < -17033.5 ) { 
	if( rmin < 1.38 ) { 
	if( lslope < -17290.5 ) { 
	if( max < 12.83 ) { 
	if( max < 6.87 ) { 
		if( rmin >= -5.54 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < -5.54 ) { return new Prediction("AT", 5.34, 0.33); }
	}
		if( max >= 6.87 ) { return new Prediction("AT", 11.74, 0.72); }
	}
	if( max >= 12.83 ) { 
		if( rslope >= -28919 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( rslope < -28919 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( lslope >= -17290.5 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
		if( rmin >= 1.38 ) { return new Prediction("NAT", 12.81, 0.03); }
	}
	}
	}
	if( lmin >= -7.72 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 133.45, 0.31); }
	if( lslope < -5395 ) { 
	if( max >= 1.68 ) { 
	if( rslope >= -22658 ) { 
	if( rmin < -5.82 ) { 
	if( rslope < -9045.5 ) { 
	if( rslope < -10160.5 ) { 
	if( rmin < -6.36 ) { 
		if( max >= 11.55 ) { return new Prediction("AT", 3.2, 0.2); }
	if( max < 11.55 ) { 
	if( max >= 4.17 ) { 
	if( rmin < -12.69 ) { 
		if( lmin < 1.2 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= 1.2 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
		if( rmin >= -12.69 ) { return new Prediction("NAT", 11.74, 0.03); }
	}
	if( max < 4.17 ) { 
		if( lmin < -4.27 ) { return new Prediction("AT", 5.34, 0.33); }
		if( lmin >= -4.27 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
	}
		if( rmin >= -6.36 ) { return new Prediction("AT", 4.27, 0.26); }
	}
		if( rslope >= -10160.5 ) { return new Prediction("NAT", 4.27, 0.01); }
	}
		if( rslope >= -9045.5 ) { return new Prediction("AT", 13.88, 0.85); }
	}
	if( rmin >= -5.82 ) { 
	if( max >= 7.16 ) { 
	if( lmin < 4.22 ) { 
	if( lmin >= -2.68 ) { 
	if( max < 11.47 ) { 
		if( rmin < -3.93 ) { return new Prediction("NAT", 2.14, 0.01); }
	if( rmin >= -3.93 ) { 
	if( max < 11.25 ) { 
	if( rmin < 5.98 ) { 
	if( max < 8.76 ) { 
		if( lmin >= 0.69 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lmin < 0.69 ) { return new Prediction("AT", 5.34, 0.33); }
	}
		if( max >= 8.76 ) { return new Prediction("AT", 13.88, 0.85); }
	}
		if( rmin >= 5.98 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( max >= 11.25 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
		if( max >= 11.47 ) { return new Prediction("AT", 13.88, 0.85); }
	}
	if( lmin < -2.68 ) { 
		if( lslope < -21088 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope >= -21088 ) { return new Prediction("NAT", 9.61, 0.02); }
	}
	}
		if( lmin >= 4.22 ) { return new Prediction("NAT", 22.42, 0.05); }
	}
		if( max < 7.16 ) { return new Prediction("NAT", 64.06, 0.15); }
	}
	}
	if( rslope < -22658 ) { 
		if( lmin >= 1.04 ) { return new Prediction("NAT", 52.31, 0.12); }
	if( lmin < 1.04 ) { 
	if( lmin >= 0.24 ) { 
	if( lslope >= -35286.5 ) { 
		if( max < 3.32 ) { return new Prediction("NAT", 4.27, 0.01); }
		if( max >= 3.32 ) { return new Prediction("AT", 8.54, 0.52); }
	}
		if( lslope < -35286.5 ) { return new Prediction("NAT", 4.27, 0.01); }
	}
	if( lmin < 0.24 ) { 
	if( max >= 8.38 ) { 
		if( rmin >= -1.66 ) { return new Prediction("NAT", 4.27, 0.01); }
		if( rmin < -1.66 ) { return new Prediction("AT", 3.2, 0.2); }
	}
		if( max < 8.38 ) { return new Prediction("NAT", 54.45, 0.13); }
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 178.29, 0.42); }
	}
	}
return null;
}
private Prediction runTree75() {
	if( lmin >= -8.49 ) { 
	if( max < 3.17 ) { 
	if( rslope >= -6082.5 ) { 
		if( lslope >= -5585.5 ) { return new Prediction("NAT", 27.62, 0); }
		if( lslope < -5585.5 ) { return new Prediction("AT", 2.12, 0.12); }
	}
		if( rslope < -6082.5 ) { return new Prediction("NAT", 239.01, 0); }
	}
	if( max >= 3.17 ) { 
	if( lmin < 3.47 ) { 
	if( lslope >= -35871.5 ) { 
	if( max < 10.58 ) { 
	if( rslope >= -28973 ) { 
	if( rmin < -7.78 ) { 
		if( rmin < -8.85 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin >= -8.85 ) { return new Prediction("AT", 6.37, 0.37); }
	}
	if( rmin >= -7.78 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 22.31, 0); }
	if( rslope < -5426 ) { 
	if( rslope < -6718.5 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 23.37, 0); }
	if( max < 7.59 ) { 
	if( max < 6.32 ) { 
	if( rslope >= -20923 ) { 
	if( rmin < -6.02 ) { 
		if( lslope >= -10373 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lslope < -10373 ) { return new Prediction("NAT", 6.37, 0); }
	}
		if( rmin >= -6.02 ) { return new Prediction("NAT", 39.3, 0); }
	}
	if( rslope < -20923 ) { 
	if( lslope >= -27095.5 ) { 
		if( rmin >= 1.07 ) { return new Prediction("AT", 3.19, 0.19); }
	if( rmin < 1.07 ) { 
		if( lmin >= -2.28 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -2.28 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
		if( lslope < -27095.5 ) { return new Prediction("NAT", 9.56, 0); }
	}
	}
	if( max >= 6.32 ) { 
	if( lmin >= -5.11 ) { 
		if( lslope < -19978.5 ) { return new Prediction("NAT", 9.56, 0); }
	if( lslope >= -19978.5 ) { 
		if( rmin < -0.06 ) { return new Prediction("NAT", 7.44, 0); }
		if( rmin >= -0.06 ) { return new Prediction("AT", 6.37, 0.37); }
	}
	}
		if( lmin < -5.11 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	}
	}
	if( rslope >= -6718.5 ) { 
		if( max < 6.1 ) { return new Prediction("NAT", 2.12, 0); }
	if( max >= 6.1 ) { 
		if( rmin >= -2.89 ) { return new Prediction("AT", 7.44, 0.44); }
		if( rmin < -2.89 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	}
	if( rslope < -28973 ) { 
		if( lslope >= -30196 ) { return new Prediction("AT", 8.5, 0.5); }
	if( lslope < -30196 ) { 
	if( lmin < -5.53 ) { 
		if( lmin < -6.75 ) { return new Prediction("AT", 3.19, 0.19); }
	if( lmin >= -6.75 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.06, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
		if( lmin >= -5.53 ) { return new Prediction("NAT", 7.44, 0); }
	}
	}
	}
	if( max >= 10.58 ) { 
		if( rmin < -15.6 ) { return new Prediction("NAT", 4.25, 0); }
	if( rmin >= -15.6 ) { 
	if( rmin >= 6.07 ) { 
		if( max >= 19.33 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max < 19.33 ) { return new Prediction("NAT", 6.37, 0); }
	}
	if( rmin < 6.07 ) { 
		if( lslope >= -4493 ) { return new Prediction("NAT", 2.12, 0); }
	if( lslope < -4493 ) { 
	if( lslope >= -23686.5 ) { 
	if( lslope >= -14016 ) { 
		if( lslope >= -12407.5 ) { return new Prediction("AT", 11.68, 0.68); }
		if( lslope < -12407.5 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( lslope < -14016 ) { return new Prediction("AT", 18.06, 1.06); }
	}
	if( lslope < -23686.5 ) { 
		if( lmin < -0.4 ) { return new Prediction("AT", 3.19, 0.19); }
		if( lmin >= -0.4 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	}
	}
		if( lslope < -35871.5 ) { return new Prediction("NAT", 36.12, 0); }
	}
	if( lmin >= 3.47 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 87.11, 0); }
	if( lmin < 3.98 ) { 
	if( max >= 8.27 ) { 
		if( lmin >= 3.87 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < 3.87 ) { return new Prediction("NAT", 4.25, 0); }
	}
		if( max < 8.27 ) { return new Prediction("NAT", 11.68, 0); }
	}
	}
	}
	}
	if( lmin < -8.49 ) { 
	if( max >= 4.48 ) { 
	if( rslope >= -17033.5 ) { 
	if( lmin >= -23.97 ) { 
		if( lmin < -9.79 ) { return new Prediction("AT", 78.61, 4.61); }
	if( lmin >= -9.79 ) { 
		if( rmin < -9.43 ) { return new Prediction("NAT", 1.06, 0); }
	if( rmin >= -9.43 ) { 
		if( lmin < -9.73 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin >= -9.73 ) { return new Prediction("AT", 14.87, 0.87); }
	}
	}
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 4.25, 0); }
	}
	if( rslope < -17033.5 ) { 
	if( rmin >= -7.11 ) { 
	if( max < 17.33 ) { 
		if( lmin >= -9.87 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -9.87 ) { return new Prediction("NAT", 11.68, 0); }
	}
		if( max >= 17.33 ) { return new Prediction("AT", 5.31, 0.31); }
	}
		if( rmin < -7.11 ) { return new Prediction("AT", 14.87, 0.87); }
	}
	}
	if( max < 4.48 ) { 
	if( rslope >= -10528 ) { 
		if( max >= -5.41 ) { return new Prediction("AT", 30.81, 1.81); }
		if( max < -5.41 ) { return new Prediction("NAT", 9.56, 0); }
	}
	if( rslope < -10528 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 17, 0); }
	if( max < 2.61 ) { 
	if( lslope >= -20737 ) { 
	if( max < 1.37 ) { 
		if( rmin < -13.76 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin >= -13.76 ) { return new Prediction("NAT", 9.56, 0); }
	}
	if( max >= 1.37 ) { 
	if( rmin < -5.89 ) { 
	if( max < 2.09 ) { 
		if( lmin >= -13.65 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lmin < -13.65 ) { return new Prediction("NAT", 1.06, 0); }
	}
		if( max >= 2.09 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( rmin >= -5.89 ) { return new Prediction("AT", 3.19, 0.19); }
	}
	}
		if( lslope < -20737 ) { return new Prediction("NAT", 9.56, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree76() {
	if( lmin >= -8.97 ) { 
		if( lslope >= -5785.5 ) { return new Prediction("NAT", 122.46, 0.14); }
	if( lslope < -5785.5 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 119.29, 0.14); }
	if( rslope >= -34924 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 39.06, 0.05); }
	if( lmin < 3.98 ) { 
	if( rslope < -19077.5 ) { 
		if( max < 3.09 ) { return new Prediction("NAT", 87.62, 0.1); }
	if( max >= 3.09 ) { 
	if( rmin >= 0.85 ) { 
		if( max < 3.32 ) { return new Prediction("AT", 1.06, 0.05); }
	if( max >= 3.32 ) { 
	if( lslope >= -21251.5 ) { 
		if( max >= 12.62 ) { return new Prediction("AT", 1.06, 0.05); }
		if( max < 12.62 ) { return new Prediction("NAT", 11.61, 0.01); }
	}
		if( lslope < -21251.5 ) { return new Prediction("NAT", 43.28, 0.05); }
	}
	}
	if( rmin < 0.85 ) { 
	if( rmin < 0.38 ) { 
		if( lmin >= 0.04 ) { return new Prediction("AT", 8.45, 0.44); }
	if( lmin < 0.04 ) { 
	if( lslope >= -32607 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 14.78, 0.02); }
	if( max >= 11.09 ) { 
		if( max < 11.26 ) { return new Prediction("AT", 1.06, 0.05); }
		if( max >= 11.26 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
	if( lslope < -32607 ) { 
		if( lmin < -6.75 ) { return new Prediction("AT", 3.17, 0.16); }
	if( lmin >= -6.75 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 2.11, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 3.17, 0.16); }
	}
	}
	}
	}
	if( rmin >= 0.38 ) { 
		if( rslope >= -30698 ) { return new Prediction("AT", 10.56, 0.54); }
		if( rslope < -30698 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	if( rslope >= -19077.5 ) { 
	if( rslope < -17455 ) { 
	if( max < 9.73 ) { 
		if( lslope >= -18558 ) { return new Prediction("NAT", 4.22, 0); }
	if( lslope < -18558 ) { 
		if( max >= 0.39 ) { return new Prediction("AT", 1.06, 0.05); }
		if( max < 0.39 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( max >= 9.73 ) { return new Prediction("AT", 16.89, 0.87); }
	}
	if( rslope >= -17455 ) { 
	if( rmin < 2.4 ) { 
	if( rmin >= -4.48 ) { 
		if( max < 7.05 ) { return new Prediction("NAT", 74.95, 0.09); }
	if( max >= 7.05 ) { 
		if( max < 7.49 ) { return new Prediction("AT", 3.17, 0.16); }
	if( max >= 7.49 ) { 
		if( lmin < -6.57 ) { return new Prediction("AT", 1.06, 0.05); }
		if( lmin >= -6.57 ) { return new Prediction("NAT", 8.45, 0.01); }
	}
	}
	}
	if( rmin < -4.48 ) { 
	if( rmin < -4.6 ) { 
	if( rslope < -10417 ) { 
	if( lslope < -15363 ) { 
		if( lmin >= -6.59 ) { return new Prediction("NAT", 5.28, 0.01); }
		if( lmin < -6.59 ) { return new Prediction("AT", 4.22, 0.22); }
	}
	if( lslope >= -15363 ) { 
		if( max < 3.39 ) { return new Prediction("NAT", 17.95, 0.02); }
	if( max >= 3.39 ) { 
		if( lmin < -5.76 ) { return new Prediction("NAT", 3.17, 0); }
		if( lmin >= -5.76 ) { return new Prediction("AT", 1.06, 0.05); }
	}
	}
	}
	if( rslope >= -10417 ) { 
		if( lmin >= -0.41 ) { return new Prediction("NAT", 5.28, 0.01); }
	if( lmin < -0.41 ) { 
		if( max < -1.18 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= -1.18 ) { return new Prediction("AT", 11.61, 0.6); }
	}
	}
	}
		if( rmin >= -4.6 ) { return new Prediction("AT", 5.28, 0.27); }
	}
	}
	if( rmin >= 2.4 ) { 
	if( rslope < -10797.5 ) { 
		if( lslope >= -11533.5 ) { return new Prediction("NAT", 7.39, 0.01); }
	if( lslope < -11533.5 ) { 
		if( max < 7.63 ) { return new Prediction("AT", 3.17, 0.16); }
		if( max >= 7.63 ) { return new Prediction("NAT", 9.5, 0.01); }
	}
	}
		if( rslope >= -10797.5 ) { return new Prediction("AT", 13.72, 0.71); }
	}
	}
	}
	}
	}
	}
	}
	if( lmin < -8.97 ) { 
	if( max >= 3.43 ) { 
	if( lmin >= -23.97 ) { 
	if( lslope < -19947.5 ) { 
		if( max < 18.14 ) { return new Prediction("NAT", 7.39, 0.01); }
		if( max >= 18.14 ) { return new Prediction("AT", 3.17, 0.16); }
	}
	if( lslope >= -19947.5 ) { 
	if( lmin >= -9.83 ) { 
	if( lslope >= -14884.5 ) { 
		if( lslope < -10105 ) { return new Prediction("NAT", 6.33, 0.01); }
		if( lslope >= -10105 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( lslope < -14884.5 ) { return new Prediction("AT", 20.06, 1.03); }
	}
	if( lmin < -9.83 ) { 
	if( rmin < -12.48 ) { 
		if( rmin >= -13.12 ) { return new Prediction("NAT", 2.11, 0); }
	if( rmin < -13.12 ) { 
		if( rmin >= -17.32 ) { return new Prediction("AT", 13.72, 0.71); }
	if( rmin < -17.32 ) { 
		if( rmin >= -18.02 ) { return new Prediction("NAT", 1.06, 0); }
		if( rmin < -18.02 ) { return new Prediction("AT", 4.22, 0.22); }
	}
	}
	}
		if( rmin >= -12.48 ) { return new Prediction("AT", 49.62, 2.56); }
	}
	}
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 4.22, 0); }
	}
	if( max < 3.43 ) { 
		if( rmin < -15.97 ) { return new Prediction("AT", 12.67, 0.65); }
	if( rmin >= -15.97 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 21.11, 0.02); }
	if( lmin >= -12.19 ) { 
		if( max < -0.24 ) { return new Prediction("NAT", 15.84, 0.02); }
	if( max >= -0.24 ) { 
	if( max < 1.21 ) { 
		if( max < 0.76 ) { return new Prediction("AT", 3.17, 0.16); }
		if( max >= 0.76 ) { return new Prediction("NAT", 3.17, 0); }
	}
		if( max >= 1.21 ) { return new Prediction("AT", 11.61, 0.6); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree77() {
	if( lmin >= -8.49 ) { 
	if( max < 10.58 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 99.78, 0.12); }
	if( lslope < -5395 ) { 
	if( max >= 1.68 ) { 
		if( rmin >= 3.89 ) { return new Prediction("NAT", 56.87, 0.07); }
	if( rmin < 3.89 ) { 
	if( lslope >= -5999.5 ) { 
	if( max < 6.1 ) { 
		if( lmin >= -3.05 ) { return new Prediction("NAT", 2.15, 0); }
		if( lmin < -3.05 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( max >= 6.1 ) { return new Prediction("AT", 4.29, 0.29); }
	}
	if( lslope < -5999.5 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 27.9, 0.03); }
	if( lslope >= -34743.5 ) { 
		if( lmin < -7.55 ) { return new Prediction("AT", 5.36, 0.36); }
	if( lmin >= -7.55 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 33.26, 0.04); }
	if( max >= 3.17 ) { 
	if( rmin >= -0.09 ) { 
	if( rmin < 0.89 ) { 
		if( lslope < -29397 ) { return new Prediction("NAT", 2.15, 0); }
	if( lslope >= -29397 ) { 
		if( lslope < -13037.5 ) { return new Prediction("AT", 11.8, 0.79); }
		if( lslope >= -13037.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( rmin >= 0.89 ) { 
		if( rmin < 1.79 ) { return new Prediction("NAT", 18.24, 0.02); }
	if( rmin >= 1.79 ) { 
		if( lslope >= -9598 ) { return new Prediction("NAT", 7.51, 0.01); }
	if( lslope < -9598 ) { 
	if( rmin < 3.28 ) { 
	if( lmin >= 0.69 ) { 
		if( lmin >= 3.42 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < 3.42 ) { return new Prediction("NAT", 3.22, 0); }
	}
		if( lmin < 0.69 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( rmin >= 3.28 ) { return new Prediction("NAT", 6.44, 0.01); }
	}
	}
	}
	}
	if( rmin < -0.09 ) { 
	if( lmin < -5.45 ) { 
		if( lmin < -6.49 ) { return new Prediction("NAT", 5.36, 0.01); }
	if( lmin >= -6.49 ) { 
	if( lslope < -10429 ) { 
	if( lmin >= -5.83 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin < -5.83 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -10429 ) { return new Prediction("AT", 4.29, 0.29); }
	}
	}
	if( lmin >= -5.45 ) { 
	if( rmin < -12.69 ) { 
		if( rmin < -12.99 ) { return new Prediction("NAT", 6.44, 0.01); }
		if( rmin >= -12.99 ) { return new Prediction("AT", 2.15, 0.14); }
	}
		if( rmin >= -12.69 ) { return new Prediction("NAT", 59.01, 0.07); }
	}
	}
	}
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 188.84, 0.22); }
	}
	}
	if( max >= 10.58 ) { 
		if( lslope >= -6256 ) { return new Prediction("NAT", 17.17, 0.02); }
	if( lslope < -6256 ) { 
	if( rslope >= -19205 ) { 
	if( rmin >= 1.82 ) { 
		if( lmin < -1.13 ) { return new Prediction("NAT", 2.15, 0); }
		if( lmin >= -1.13 ) { return new Prediction("AT", 7.51, 0.5); }
	}
		if( rmin < 1.82 ) { return new Prediction("AT", 21.46, 1.43); }
	}
	if( rslope < -19205 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 12.88, 0.02); }
	if( rmin < 2.46 ) { 
	if( lmin < 2.59 ) { 
		if( rmin < -4.97 ) { return new Prediction("NAT", 2.15, 0); }
	if( rmin >= -4.97 ) { 
		if( max >= 12.31 ) { return new Prediction("AT", 5.36, 0.36); }
		if( max < 12.31 ) { return new Prediction("NAT", 3.22, 0); }
	}
	}
		if( lmin >= 2.59 ) { return new Prediction("NAT", 5.36, 0.01); }
	}
	}
	}
	}
	}
	if( lmin < -8.49 ) { 
	if( rslope < -18123.5 ) { 
		if( lmin < -11.87 ) { return new Prediction("NAT", 10.73, 0.01); }
	if( lmin >= -11.87 ) { 
		if( max >= 10.25 ) { return new Prediction("AT", 5.36, 0.36); }
	if( max < 10.25 ) { 
		if( rslope < -19882.5 ) { return new Prediction("NAT", 17.17, 0.02); }
	if( rslope >= -19882.5 ) { 
		if( rmin < -8.1 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -8.1 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
	}
	}
	if( rslope >= -18123.5 ) { 
	if( lslope < -10794 ) { 
	if( max < 7.92 ) { 
	if( rmin < -7.9 ) { 
		if( max < 6.28 ) { return new Prediction("NAT", 19.31, 0.02); }
	if( max >= 6.28 ) { 
		if( max < 7.69 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max >= 7.69 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	if( rmin >= -7.9 ) { 
		if( max >= 2.43 ) { return new Prediction("NAT", 6.44, 0.01); }
		if( max < 2.43 ) { return new Prediction("AT", 10.73, 0.72); }
	}
	}
	if( max >= 7.92 ) { 
	if( lslope < -16970 ) { 
		if( lslope < -17290.5 ) { return new Prediction("AT", 5.36, 0.36); }
		if( lslope >= -17290.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -16970 ) { return new Prediction("AT", 35.41, 2.37); }
	}
	}
	if( lslope >= -10794 ) { 
	if( rslope >= -5051 ) { 
		if( max < 11.14 ) { return new Prediction("NAT", 9.66, 0.01); }
		if( max >= 11.14 ) { return new Prediction("AT", 12.88, 0.86); }
	}
		if( rslope < -5051 ) { return new Prediction("AT", 79.4, 5.31); }
	}
	}
	}
return null;
}
private Prediction runTree78() {
	if( lmin < -7.73 ) { 
	if( lslope < -10794 ) { 
		if( lslope < -34959 ) { return new Prediction("NAT", 25.49, 0); }
	if( lslope >= -34959 ) { 
	if( max >= 5.02 ) { 
	if( rslope >= -17033.5 ) { 
		if( max >= 8.34 ) { return new Prediction("AT", 27.62, 1.62); }
	if( max < 8.34 ) { 
		if( max < 7.69 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max >= 7.69 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	if( rslope < -17033.5 ) { 
		if( lmin < -9.96 ) { return new Prediction("NAT", 10.62, 0); }
	if( lmin >= -9.96 ) { 
		if( max >= 10.91 ) { return new Prediction("AT", 6.37, 0.37); }
	if( max < 10.91 ) { 
		if( max < 10.22 ) { return new Prediction("AT", 3.19, 0.19); }
		if( max >= 10.22 ) { return new Prediction("NAT", 4.25, 0); }
	}
	}
	}
	}
	if( max < 5.02 ) { 
		if( rslope >= -15365.5 ) { return new Prediction("NAT", 24.43, 0); }
	if( rslope < -15365.5 ) { 
	if( lmin >= -12.26 ) { 
	if( max >= 0.1 ) { 
		if( rmin < -8.42 ) { return new Prediction("NAT", 1.06, 0); }
	if( rmin >= -8.42 ) { 
		if( rmin < -4.31 ) { return new Prediction("AT", 13.81, 0.81); }
		if( rmin >= -4.31 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( max < 0.1 ) { return new Prediction("NAT", 9.56, 0); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 10.62, 0); }
	}
	}
	}
	}
	if( lslope >= -10794 ) { 
		if( lmin < -19.4 ) { return new Prediction("NAT", 6.37, 0); }
	if( lmin >= -19.4 ) { 
		if( max < -6.38 ) { return new Prediction("NAT", 7.44, 0); }
		if( max >= -6.38 ) { return new Prediction("AT", 83.92, 4.92); }
	}
	}
	}
	if( lmin >= -7.73 ) { 
	if( max < 10.58 ) { 
	if( max >= 1.68 ) { 
	if( rmin < -5.82 ) { 
		if( max < 1.89 ) { return new Prediction("AT", 2.12, 0.12); }
	if( max >= 1.89 ) { 
	if( lmin >= -4.28 ) { 
	if( rmin < -12.69 ) { 
		if( max >= 6.36 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 6.36 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( rmin >= -12.69 ) { return new Prediction("NAT", 21.25, 0); }
	}
	if( lmin < -4.28 ) { 
	if( lmin < -6.27 ) { 
		if( rmin >= -6.41 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < -6.41 ) { return new Prediction("NAT", 2.12, 0); }
	}
	if( lmin >= -6.27 ) { 
		if( rmin >= -8.95 ) { return new Prediction("AT", 9.56, 0.56); }
		if( rmin < -8.95 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	if( rmin >= -5.82 ) { 
		if( rmin < -1.13 ) { return new Prediction("NAT", 78.61, 0); }
	if( rmin >= -1.13 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 74.36, 0); }
	if( lmin < 3.69 ) { 
	if( lmin >= -0.84 ) { 
	if( max >= 3.5 ) { 
		if( lmin < -0.55 ) { return new Prediction("AT", 5.31, 0.31); }
	if( lmin >= -0.55 ) { 
	if( rmin >= 0.41 ) { 
	if( lmin < 2.15 ) { 
	if( lmin < 0.56 ) { 
		if( lmin >= 0.38 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lmin < 0.38 ) { return new Prediction("NAT", 14.87, 0); }
	}
		if( lmin >= 0.56 ) { return new Prediction("NAT", 22.31, 0); }
	}
	if( lmin >= 2.15 ) { 
		if( max >= 6.26 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max < 6.26 ) { return new Prediction("NAT", 2.12, 0); }
	}
	}
	if( rmin < 0.41 ) { 
	if( rmin < -0.38 ) { 
		if( max >= 7.29 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 7.29 ) { return new Prediction("NAT", 3.19, 0); }
	}
		if( rmin >= -0.38 ) { return new Prediction("AT", 5.31, 0.31); }
	}
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 19.12, 0); }
	}
	if( lmin < -0.84 ) { 
	if( lmin < -4.59 ) { 
		if( lmin >= -4.64 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -4.64 ) { return new Prediction("NAT", 13.81, 0); }
	}
		if( lmin >= -4.59 ) { return new Prediction("NAT", 41.43, 0); }
	}
	}
	}
	}
	}
		if( max < 1.68 ) { return new Prediction("NAT", 205.02, 0); }
	}
	if( max >= 10.58 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 20.18, 0); }
	if( lmin < 3.6 ) { 
		if( lslope >= -4847.5 ) { return new Prediction("NAT", 8.5, 0); }
	if( lslope < -4847.5 ) { 
	if( lslope < -20462 ) { 
		if( max >= 12.96 ) { return new Prediction("AT", 5.31, 0.31); }
	if( max < 12.96 ) { 
		if( rmin >= -0.4 ) { return new Prediction("NAT", 10.62, 0); }
	if( rmin < -0.4 ) { 
	if( lmin >= -3.13 ) { 
		if( max < 11.9 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max >= 11.9 ) { return new Prediction("NAT", 2.12, 0); }
	}
		if( lmin < -3.13 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
	}
	if( lslope >= -20462 ) { 
	if( rmin >= -19.21 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 23.37, 1.37); }
	if( lmin < -1.14 ) { 
		if( lmin < -1.41 ) { return new Prediction("AT", 5.31, 0.31); }
		if( lmin >= -1.41 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree79() {
	if( rmin < -4.16 ) { 
	if( max < -0.84 ) { 
		if( lmin < -12.56 ) { return new Prediction("AT", 4.21, 0.2); }
		if( lmin >= -12.56 ) { return new Prediction("NAT", 77.93, 0.18); }
	}
	if( max >= -0.84 ) { 
	if( lmin < -5.16 ) { 
	if( rslope >= -10648.5 ) { 
	if( lslope >= -2239.49 ) { 
		if( rslope >= -1654.51 ) { return new Prediction("AT", 4.21, 0.2); }
		if( rslope < -1654.51 ) { return new Prediction("NAT", 2.11, 0); }
	}
		if( lslope < -2239.49 ) { return new Prediction("AT", 66.34, 3.19); }
	}
	if( rslope < -10648.5 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 9.48, 0.02); }
	if( lslope >= -35302 ) { 
	if( max < 9.21 ) { 
	if( lslope < -14553.5 ) { 
		if( max < 0.59 ) { return new Prediction("NAT", 4.21, 0.01); }
	if( max >= 0.59 ) { 
	if( max < 9.18 ) { 
	if( rslope < -19714 ) { 
	if( rslope >= -33901 ) { 
	if( lmin >= -7.15 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 2.11, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 2.11, 0.1); }
	}
		if( lmin < -7.15 ) { return new Prediction("NAT", 3.16, 0.01); }
	}
		if( rslope < -33901 ) { return new Prediction("AT", 3.16, 0.15); }
	}
	if( rslope >= -19714 ) { 
	if( lmin >= -19.11 ) { 
	if( rslope >= -15268 ) { 
		if( max < 6.28 ) { return new Prediction("NAT", 1.05, 0); }
		if( max >= 6.28 ) { return new Prediction("AT", 1.05, 0.05); }
	}
		if( rslope < -15268 ) { return new Prediction("AT", 15.8, 0.76); }
	}
		if( lmin < -19.11 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
		if( max >= 9.18 ) { return new Prediction("NAT", 3.16, 0.01); }
	}
	}
	if( lslope >= -14553.5 ) { 
		if( lslope < -11678 ) { return new Prediction("NAT", 10.53, 0.02); }
	if( lslope >= -11678 ) { 
		if( max >= 4.16 ) { return new Prediction("NAT", 2.11, 0); }
	if( max < 4.16 ) { 
		if( lmin < -18.23 ) { return new Prediction("AT", 1.05, 0.05); }
	if( lmin >= -18.23 ) { 
		if( lmin >= -10.37 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lmin < -10.37 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
	}
	}
	}
	if( max >= 9.21 ) { 
	if( lslope < -19947.5 ) { 
		if( lslope >= -28257 ) { return new Prediction("NAT", 4.21, 0.01); }
		if( lslope < -28257 ) { return new Prediction("AT", 7.37, 0.35); }
	}
		if( lslope >= -19947.5 ) { return new Prediction("AT", 34.75, 1.67); }
	}
	}
	}
	}
	if( lmin >= -5.16 ) { 
	if( rslope >= -17751 ) { 
	if( lmin < 0.62 ) { 
	if( rmin >= -12.65 ) { 
		if( max >= 9.48 ) { return new Prediction("AT", 4.21, 0.2); }
	if( max < 9.48 ) { 
	if( lmin < -4.58 ) { 
		if( lslope < -8626.5 ) { return new Prediction("NAT", 3.16, 0.01); }
		if( lslope >= -8626.5 ) { return new Prediction("AT", 3.16, 0.15); }
	}
		if( lmin >= -4.58 ) { return new Prediction("NAT", 9.48, 0.02); }
	}
	}
		if( rmin < -12.65 ) { return new Prediction("AT", 3.16, 0.15); }
	}
		if( lmin >= 0.62 ) { return new Prediction("NAT", 10.53, 0.02); }
	}
		if( rslope < -17751 ) { return new Prediction("NAT", 14.74, 0.03); }
	}
	}
	}
	if( rmin >= -4.16 ) { 
	if( max < 10.9 ) { 
	if( max >= 3.5 ) { 
		if( rmin >= 6.66 ) { return new Prediction("NAT", 67.4, 0.16); }
	if( rmin < 6.66 ) { 
	if( lslope >= -30377.5 ) { 
	if( rslope < -6394.5 ) { 
		if( rslope < -29051.5 ) { return new Prediction("AT", 3.16, 0.15); }
	if( rslope >= -29051.5 ) { 
	if( max >= 7.32 ) { 
		if( lmin >= 5.38 ) { return new Prediction("NAT", 12.64, 0.03); }
	if( lmin < 5.38 ) { 
	if( lmin >= -1.75 ) { 
		if( lslope >= -12907.5 ) { return new Prediction("AT", 7.37, 0.35); }
	if( lslope < -12907.5 ) { 
		if( lmin < 0.46 ) { return new Prediction("AT", 4.21, 0.2); }
		if( lmin >= 0.46 ) { return new Prediction("NAT", 3.16, 0.01); }
	}
	}
	if( lmin < -1.75 ) { 
		if( lmin >= -10.85 ) { return new Prediction("NAT", 9.48, 0.02); }
		if( lmin < -10.85 ) { return new Prediction("AT", 3.16, 0.15); }
	}
	}
	}
	if( max < 7.32 ) { 
	if( max < 4.3 ) { 
		if( max < 4.19 ) { return new Prediction("NAT", 13.69, 0.03); }
		if( max >= 4.19 ) { return new Prediction("AT", 2.11, 0.1); }
	}
		if( max >= 4.3 ) { return new Prediction("NAT", 34.75, 0.08); }
	}
	}
	}
		if( rslope >= -6394.5 ) { return new Prediction("NAT", 40.02, 0.09); }
	}
		if( lslope < -30377.5 ) { return new Prediction("NAT", 46.34, 0.11); }
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 182.18, 0.43); }
	}
	if( max >= 10.9 ) { 
	if( lmin < -0.79 ) { 
		if( lslope < -43889.5 ) { return new Prediction("NAT", 7.37, 0.02); }
	if( lslope >= -43889.5 ) { 
	if( max >= 11.55 ) { 
	if( rmin >= 12.2 ) { 
		if( max >= 20.28 ) { return new Prediction("AT", 6.32, 0.3); }
		if( max < 20.28 ) { return new Prediction("NAT", 2.11, 0); }
	}
		if( rmin < 12.2 ) { return new Prediction("AT", 49.5, 2.38); }
	}
	if( max < 11.55 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 2.11, 0.1); }
	if( lmin < -1.14 ) { 
		if( lslope < -20783 ) { return new Prediction("AT", 1.05, 0.05); }
		if( lslope >= -20783 ) { return new Prediction("NAT", 5.27, 0.01); }
	}
	}
	}
	}
	if( lmin >= -0.79 ) { 
		if( max < 11.14 ) { return new Prediction("AT", 4.21, 0.2); }
		if( max >= 11.14 ) { return new Prediction("NAT", 32.65, 0.08); }
	}
	}
	}
return null;
}
private Prediction runTree80() {
	if( max >= 3.18 ) { 
	if( rmin >= -6.96 ) { 
	if( max >= 10.84 ) { 
	if( lmin >= 0.51 ) { 
		if( lmin >= 3.6 ) { return new Prediction("NAT", 23.52, 0); }
	if( lmin < 3.6 ) { 
	if( rslope >= -23084.5 ) { 
		if( rmin < -3.27 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= -3.27 ) { return new Prediction("AT", 4.28, 0.28); }
	}
		if( rslope < -23084.5 ) { return new Prediction("NAT", 8.55, 0); }
	}
	}
	if( lmin < 0.51 ) { 
	if( rmin < 3.24 ) { 
		if( rmin < -5.33 ) { return new Prediction("NAT", 3.21, 0); }
	if( rmin >= -5.33 ) { 
	if( lmin >= -0.69 ) { 
		if( lslope < -18534.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope >= -18534.5 ) { return new Prediction("AT", 5.34, 0.34); }
	}
		if( lmin < -0.69 ) { return new Prediction("AT", 42.76, 2.76); }
	}
	}
	if( rmin >= 3.24 ) { 
	if( rslope >= -18350 ) { 
		if( lmin < -1.1 ) { return new Prediction("AT", 10.69, 0.69); }
		if( lmin >= -1.1 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( rslope < -18350 ) { return new Prediction("NAT", 7.48, 0); }
	}
	}
	}
	if( max < 10.84 ) { 
		if( lmin >= 2.62 ) { return new Prediction("NAT", 104.75, 0); }
	if( lmin < 2.62 ) { 
	if( lmin >= -0.85 ) { 
		if( rmin < -2.18 ) { return new Prediction("NAT", 8.55, 0); }
	if( rmin >= -2.18 ) { 
	if( lmin >= 1.19 ) { 
		if( lmin >= 2.48 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < 2.48 ) { return new Prediction("NAT", 12.83, 0); }
	}
	if( lmin < 1.19 ) { 
	if( rmin >= 3.12 ) { 
		if( rmin < 5.57 ) { return new Prediction("NAT", 7.48, 0); }
	if( rmin >= 5.57 ) { 
		if( max < 8.67 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max >= 8.67 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( rmin < 3.12 ) { 
	if( lmin >= 0.38 ) { 
	if( lmin >= 0.64 ) { 
		if( max < 5.61 ) { return new Prediction("AT", 4.28, 0.28); }
		if( max >= 5.61 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( lmin < 0.64 ) { return new Prediction("AT", 7.48, 0.48); }
	}
	if( lmin < 0.38 ) { 
		if( max < 7.18 ) { return new Prediction("NAT", 7.48, 0); }
		if( max >= 7.18 ) { return new Prediction("AT", 5.34, 0.34); }
	}
	}
	}
	}
	}
	if( lmin < -0.85 ) { 
	if( rmin < -4.16 ) { 
	if( lslope < -9986 ) { 
		if( max < 5.41 ) { return new Prediction("NAT", 3.21, 0); }
	if( max >= 5.41 ) { 
	if( lmin < -3.73 ) { 
		if( max < 9.18 ) { return new Prediction("AT", 8.55, 0.55); }
	if( max >= 9.18 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 9.7 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lmin >= -3.73 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( lslope >= -9986 ) { 
		if( lmin >= -5.79 ) { return new Prediction("NAT", 11.76, 0); }
	if( lmin < -5.79 ) { 
		if( rmin >= -6.41 ) { return new Prediction("AT", 2.14, 0.14); }
		if( rmin < -6.41 ) { return new Prediction("NAT", 4.28, 0); }
	}
	}
	}
	if( rmin >= -4.16 ) { 
	if( max < 3.22 ) { 
		if( lmin >= -3.07 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -3.07 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( max >= 3.22 ) { 
		if( rmin >= -2.85 ) { return new Prediction("NAT", 87.65, 0); }
	if( rmin < -2.85 ) { 
		if( lmin >= -12.34 ) { return new Prediction("NAT", 17.1, 0); }
		if( lmin < -12.34 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	}
	}
	}
	}
	}
	if( rmin < -6.96 ) { 
	if( lslope < -16474.5 ) { 
		if( rmin < -12.48 ) { return new Prediction("NAT", 7.48, 0); }
	if( rmin >= -12.48 ) { 
	if( lmin >= -10.64 ) { 
		if( lmin < -5.75 ) { return new Prediction("NAT", 6.41, 0); }
		if( lmin >= -5.75 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( lmin < -10.64 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	if( lslope >= -16474.5 ) { 
	if( lmin >= -22.24 ) { 
	if( lmin >= -6.77 ) { 
		if( lslope >= -4018.5 ) { return new Prediction("NAT", 1.07, 0); }
	if( lslope < -4018.5 ) { 
	if( rmin >= -19.21 ) { 
	if( max < 6.75 ) { 
		if( rmin >= -7.27 ) { return new Prediction("AT", 4.28, 0.28); }
		if( rmin < -7.27 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( max >= 6.75 ) { return new Prediction("AT", 6.41, 0.41); }
	}
		if( rmin < -19.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lmin < -6.77 ) { return new Prediction("AT", 57.72, 3.72); }
	}
		if( lmin < -22.24 ) { return new Prediction("NAT", 4.28, 0); }
	}
	}
	}
	if( max < 3.18 ) { 
	if( rmin >= -17.2 ) { 
		if( lmin >= -10.28 ) { return new Prediction("NAT", 281.13, 0); }
	if( lmin < -10.28 ) { 
	if( max < 1.21 ) { 
	if( lmin >= -16.91 ) { 
	if( rslope < -14467 ) { 
		if( lslope >= -19887.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -19887.5 ) { return new Prediction("NAT", 9.62, 0); }
	}
		if( rslope >= -14467 ) { return new Prediction("NAT", 20.31, 0); }
	}
	if( lmin < -16.91 ) { 
		if( lslope >= -10213 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lslope < -10213 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	if( max >= 1.21 ) { 
		if( lmin >= -12.26 ) { return new Prediction("AT", 6.41, 0.41); }
		if( lmin < -12.26 ) { return new Prediction("NAT", 11.76, 0); }
	}
	}
	}
	if( rmin < -17.2 ) { 
		if( lslope < -12317.5 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope >= -12317.5 ) { return new Prediction("AT", 6.41, 0.41); }
	}
	}
return null;
}
private Prediction runTree81() {
	if( max < 14.43 ) { 
	if( lmin >= -7.71 ) { 
	if( max >= 3.12 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 86.93, 0.1); }
	if( rslope < -5426 ) { 
		if( rmin >= 5.43 ) { return new Prediction("NAT", 42.38, 0.05); }
	if( rmin < 5.43 ) { 
	if( max < 7.05 ) { 
	if( max >= 3.56 ) { 
	if( rslope >= -8784 ) { 
		if( lmin >= -5.11 ) { return new Prediction("NAT", 8.69, 0.01); }
		if( lmin < -5.11 ) { return new Prediction("AT", 3.26, 0.26); }
	}
	if( rslope < -8784 ) { 
	if( lmin < 0.56 ) { 
		if( max >= 6.01 ) { return new Prediction("NAT", 19.56, 0.02); }
	if( max < 6.01 ) { 
		if( lmin >= 0.38 ) { return new Prediction("AT", 3.26, 0.26); }
	if( lmin < 0.38 ) { 
		if( max < 5.52 ) { return new Prediction("NAT", 35.86, 0.04); }
		if( max >= 5.52 ) { return new Prediction("AT", 1.09, 0.09); }
	}
	}
	}
		if( lmin >= 0.56 ) { return new Prediction("NAT", 43.46, 0.05); }
	}
	}
	if( max < 3.56 ) { 
		if( rmin < -0.27 ) { return new Prediction("NAT", 4.35, 0.01); }
		if( rmin >= -0.27 ) { return new Prediction("AT", 4.35, 0.34); }
	}
	}
	if( max >= 7.05 ) { 
	if( rslope >= -23399 ) { 
	if( lslope >= -15447.5 ) { 
	if( lmin >= -1.19 ) { 
	if( lslope >= -14761 ) { 
		if( lmin >= 5.64 ) { return new Prediction("NAT", 3.26, 0); }
	if( lmin < 5.64 ) { 
	if( rmin < -4.6 ) { 
		if( max >= 9.86 ) { return new Prediction("AT", 1.09, 0.09); }
		if( max < 9.86 ) { return new Prediction("NAT", 2.17, 0); }
	}
		if( rmin >= -4.6 ) { return new Prediction("AT", 13.04, 1.02); }
	}
	}
		if( lslope < -14761 ) { return new Prediction("NAT", 2.17, 0); }
	}
	if( lmin < -1.19 ) { 
		if( rslope < -7601.5 ) { return new Prediction("NAT", 17.39, 0.02); }
		if( rslope >= -7601.5 ) { return new Prediction("AT", 2.17, 0.17); }
	}
	}
	if( lslope < -15447.5 ) { 
		if( rmin >= 3.38 ) { return new Prediction("NAT", 1.09, 0); }
		if( rmin < 3.38 ) { return new Prediction("AT", 13.04, 1.02); }
	}
	}
	if( rslope < -23399 ) { 
		if( rmin >= -3.72 ) { return new Prediction("NAT", 27.17, 0.03); }
	if( rmin < -3.72 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.09, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 1.09, 0.09); }
	}
	}
	}
	}
	}
	}
	if( max < 3.12 ) { 
		if( rmin >= -6.9 ) { return new Prediction("NAT", 246.66, 0.29); }
	if( rmin < -6.9 ) { 
		if( rmin >= -6.97 ) { return new Prediction("AT", 1.09, 0.09); }
		if( rmin < -6.97 ) { return new Prediction("NAT", 23.91, 0.03); }
	}
	}
	}
	if( lmin < -7.71 ) { 
	if( max < 3.31 ) { 
	if( rmin >= -14.74 ) { 
	if( max >= 0.33 ) { 
		if( lmin < -12.19 ) { return new Prediction("NAT", 15.21, 0.02); }
	if( lmin >= -12.19 ) { 
	if( lmin >= -10.73 ) { 
	if( lslope >= -21966 ) { 
		if( max >= 1.84 ) { return new Prediction("AT", 2.17, 0.17); }
	if( max < 1.84 ) { 
		if( rmin >= -7.86 ) { return new Prediction("NAT", 1.09, 0); }
		if( rmin < -7.86 ) { return new Prediction("AT", 1.09, 0.09); }
	}
	}
		if( lslope < -21966 ) { return new Prediction("NAT", 5.43, 0.01); }
	}
		if( lmin < -10.73 ) { return new Prediction("AT", 5.43, 0.43); }
	}
	}
		if( max < 0.33 ) { return new Prediction("NAT", 38.03, 0.04); }
	}
	if( rmin < -14.74 ) { 
		if( lslope < -11816.5 ) { return new Prediction("NAT", 4.35, 0.01); }
		if( lslope >= -11816.5 ) { return new Prediction("AT", 8.69, 0.68); }
	}
	}
	if( max >= 3.31 ) { 
	if( rslope >= -19885 ) { 
	if( lmin < -17.63 ) { 
		if( rmin < -15.15 ) { return new Prediction("NAT", 7.61, 0.01); }
	if( rmin >= -15.15 ) { 
		if( max >= 7.59 ) { return new Prediction("AT", 4.35, 0.34); }
		if( max < 7.59 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
	if( lmin >= -17.63 ) { 
	if( rslope < -11816.5 ) { 
	if( max >= 6.15 ) { 
	if( rmin >= -7.06 ) { 
	if( lslope >= -16249 ) { 
		if( max < 8.48 ) { return new Prediction("NAT", 1.09, 0); }
		if( max >= 8.48 ) { return new Prediction("AT", 6.52, 0.51); }
	}
		if( lslope < -16249 ) { return new Prediction("NAT", 5.43, 0.01); }
	}
		if( rmin < -7.06 ) { return new Prediction("AT", 21.73, 1.71); }
	}
		if( max < 6.15 ) { return new Prediction("NAT", 8.69, 0.01); }
	}
		if( rslope >= -11816.5 ) { return new Prediction("AT", 36.95, 2.9); }
	}
	}
		if( rslope < -19885 ) { return new Prediction("NAT", 5.43, 0.01); }
	}
	}
	}
	if( max >= 14.43 ) { 
	if( max < 17.2 ) { 
	if( lmin < -1.45 ) { 
		if( max < 16.48 ) { return new Prediction("AT", 13.04, 1.02); }
		if( max >= 16.48 ) { return new Prediction("NAT", 1.09, 0); }
	}
		if( lmin >= -1.45 ) { return new Prediction("NAT", 1.09, 0); }
	}
		if( max >= 17.2 ) { return new Prediction("AT", 47.81, 3.76); }
	}
return null;
}
private Prediction runTree82() {
	if( rmin < -6.65 ) { 
	if( max < 5.76 ) { 
	if( lmin >= -9.94 ) { 
		if( max < 1.54 ) { return new Prediction("NAT", 49.23, 0); }
	if( max >= 1.54 ) { 
	if( rmin < -7.08 ) { 
		if( max >= 3.27 ) { return new Prediction("NAT", 21.41, 0); }
	if( max < 3.27 ) { 
	if( rmin >= -9.97 ) { 
		if( rslope < -32940 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope >= -32940 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin < -9.97 ) { return new Prediction("NAT", 4.28, 0); }
	}
	}
	if( rmin >= -7.08 ) { 
		if( rslope >= -14083.5 ) { return new Prediction("AT", 4.28, 0.28); }
		if( rslope < -14083.5 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	}
	if( lmin < -9.94 ) { 
	if( rslope < -10795.5 ) { 
		if( rmin >= -8.14 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < -8.14 ) { return new Prediction("NAT", 20.34, 0); }
	}
	if( rslope >= -10795.5 ) { 
		if( max < -7.42 ) { return new Prediction("NAT", 4.28, 0); }
	if( max >= -7.42 ) { 
		if( rmin < -9.37 ) { return new Prediction("AT", 33.18, 2.18); }
	if( rmin >= -9.37 ) { 
		if( max < -0.06 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= -0.06 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	}
	}
	}
	if( max >= 5.76 ) { 
	if( lslope >= -21578.5 ) { 
	if( rmin >= -19.96 ) { 
		if( lmin >= 3.76 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin < 3.76 ) { 
		if( max >= 9.74 ) { return new Prediction("AT", 42.81, 2.81); }
	if( max < 9.74 ) { 
	if( max >= 9.05 ) { 
		if( max < 9.21 ) { return new Prediction("NAT", 1.07, 0); }
	if( max >= 9.21 ) { 
		if( lmin >= -13.75 ) { return new Prediction("AT", 3.21, 0.21); }
		if( lmin < -13.75 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( max < 9.05 ) { return new Prediction("AT", 11.77, 0.77); }
	}
	}
	}
		if( rmin < -19.96 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope < -21578.5 ) { 
		if( lmin < -10.83 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= -10.83 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	}
	if( rmin >= -6.65 ) { 
	if( lmin < -8.55 ) { 
	if( rslope >= -17995 ) { 
	if( rmin < -3.38 ) { 
		if( rmin >= -3.54 ) { return new Prediction("NAT", 2.14, 0); }
	if( rmin < -3.54 ) { 
	if( max < 5.16 ) { 
		if( lslope < -14181 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lslope >= -14181 ) { return new Prediction("NAT", 5.35, 0); }
	}
		if( max >= 5.16 ) { return new Prediction("AT", 16.05, 1.05); }
	}
	}
		if( rmin >= -3.38 ) { return new Prediction("AT", 22.48, 1.48); }
	}
	if( rslope < -17995 ) { 
	if( max < 17.33 ) { 
		if( rmin >= -6.13 ) { return new Prediction("NAT", 27.83, 0); }
	if( rmin < -6.13 ) { 
		if( lmin >= -10.25 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -10.25 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
		if( max >= 17.33 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	if( lmin >= -8.55 ) { 
	if( lslope < -5364.5 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 204.42, 0); }
	if( max >= 3.17 ) { 
	if( max < 12.91 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 48.16, 0); }
	if( lmin < 3.98 ) { 
	if( lmin >= -1.18 ) { 
		if( lslope < -30483.5 ) { return new Prediction("NAT", 19.26, 0); }
	if( lslope >= -30483.5 ) { 
	if( lmin < 0.72 ) { 
	if( rslope < -11401.5 ) { 
		if( lmin >= -0.8 ) { return new Prediction("AT", 11.77, 0.77); }
		if( lmin < -0.8 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rslope >= -11401.5 ) { 
		if( max >= 9.04 ) { return new Prediction("AT", 2.14, 0.14); }
	if( max < 9.04 ) { 
		if( rslope < -5972 ) { return new Prediction("NAT", 7.49, 0); }
		if( rslope >= -5972 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( lmin >= 0.72 ) { 
	if( rslope < -10001 ) { 
	if( max < 10.38 ) { 
		if( lslope < -29337 ) { return new Prediction("AT", 1.07, 0.07); }
	if( lslope >= -29337 ) { 
	if( rslope >= -27154 ) { 
	if( rmin < 0.89 ) { 
		if( rmin >= -0.21 ) { return new Prediction("AT", 4.28, 0.28); }
		if( rmin < -0.21 ) { return new Prediction("NAT", 8.56, 0); }
	}
		if( rmin >= 0.89 ) { return new Prediction("NAT", 10.7, 0); }
	}
		if( rslope < -27154 ) { return new Prediction("NAT", 9.63, 0); }
	}
	}
		if( max >= 10.38 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rslope >= -10001 ) { return new Prediction("AT", 6.42, 0.42); }
	}
	}
	}
	if( lmin < -1.18 ) { 
	if( rmin < -4.16 ) { 
		if( lmin >= -4.48 ) { return new Prediction("NAT", 5.35, 0); }
		if( lmin < -4.48 ) { return new Prediction("AT", 3.21, 0.21); }
	}
	if( rmin >= -4.16 ) { 
		if( max < 3.31 ) { return new Prediction("AT", 2.14, 0.14); }
	if( max >= 3.31 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 68.5, 0); }
	if( max >= 11.09 ) { 
		if( rmin < 0.77 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= 0.77 ) { return new Prediction("NAT", 8.56, 0); }
	}
	}
	}
	}
	}
	}
	if( max >= 12.91 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < 2.46 ) { return new Prediction("AT", 14.98, 0.98); }
	}
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 116.66, 0); }
	}
	}
return null;
}
private Prediction runTree83() {
	if( lmin < -9.71 ) { 
		if( rslope < -19882.5 ) { return new Prediction("NAT", 19.14, 0); }
	if( rslope >= -19882.5 ) { 
	if( max < 11.14 ) { 
	if( rmin >= -10.57 ) { 
		if( rmin >= -3.82 ) { return new Prediction("AT", 4.25, 0.25); }
	if( rmin < -3.82 ) { 
		if( rslope >= -4378 ) { return new Prediction("AT", 2.13, 0.13); }
	if( rslope < -4378 ) { 
		if( max < 0.43 ) { return new Prediction("NAT", 9.57, 0); }
	if( max >= 0.43 ) { 
	if( lslope >= -17886 ) { 
		if( max < 5.86 ) { return new Prediction("AT", 5.32, 0.32); }
	if( max >= 5.86 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 3.19, 0.19); }
	if( max < 9.7 ) { 
		if( rmin >= -5.87 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < -5.87 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
	}
	if( lslope < -17886 ) { 
		if( rmin >= -6.13 ) { return new Prediction("NAT", 5.32, 0); }
		if( rmin < -6.13 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	}
	if( rmin < -10.57 ) { 
	if( rslope < -3568.51 ) { 
		if( rslope >= -9296 ) { return new Prediction("AT", 35.1, 2.1); }
	if( rslope < -9296 ) { 
	if( max >= 4.53 ) { 
		if( lmin >= -16.85 ) { return new Prediction("AT", 13.83, 0.83); }
		if( lmin < -16.85 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( max < 4.53 ) { 
		if( rslope >= -11954 ) { return new Prediction("AT", 3.19, 0.19); }
		if( rslope < -11954 ) { return new Prediction("NAT", 4.25, 0); }
	}
	}
	}
		if( rslope >= -3568.51 ) { return new Prediction("NAT", 3.19, 0); }
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 57.43, 3.43); }
	}
	}
	if( lmin >= -9.71 ) { 
	if( max < 3.17 ) { 
		if( max < 2.16 ) { return new Prediction("NAT", 253.13, 0); }
	if( max >= 2.16 ) { 
		if( lmin < -6.91 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -6.91 ) { return new Prediction("NAT", 35.1, 0); }
	}
	}
	if( max >= 3.17 ) { 
	if( lslope < -5364.5 ) { 
	if( max < 12.03 ) { 
		if( lmin >= 3.54 ) { return new Prediction("NAT", 73.39, 0); }
	if( lmin < 3.54 ) { 
		if( rslope < -34924 ) { return new Prediction("NAT", 27.65, 0); }
	if( rslope >= -34924 ) { 
	if( rmin >= -5.54 ) { 
		if( lmin < -2.59 ) { return new Prediction("NAT", 41.48, 0); }
	if( lmin >= -2.59 ) { 
	if( max < 10.45 ) { 
	if( lmin >= -1.07 ) { 
	if( rmin < 0.89 ) { 
	if( lslope < -13020.5 ) { 
		if( max >= 5.35 ) { return new Prediction("AT", 4.25, 0.25); }
	if( max < 5.35 ) { 
	if( rmin >= -0.32 ) { 
	if( rmin < 0.55 ) { 
		if( lmin >= 2.04 ) { return new Prediction("NAT", 1.06, 0); }
		if( lmin < 2.04 ) { return new Prediction("AT", 4.25, 0.25); }
	}
		if( rmin >= 0.55 ) { return new Prediction("NAT", 2.13, 0); }
	}
		if( rmin < -0.32 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	if( lslope >= -13020.5 ) { 
		if( lmin < -0.02 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin >= -0.02 ) { return new Prediction("NAT", 10.64, 0); }
	}
	}
	if( rmin >= 0.89 ) { 
		if( lslope >= -6050 ) { return new Prediction("AT", 1.06, 0.06); }
	if( lslope < -6050 ) { 
		if( rmin >= 1.29 ) { return new Prediction("NAT", 19.14, 0); }
	if( rmin < 1.29 ) { 
		if( lmin >= 0.55 ) { return new Prediction("NAT", 7.45, 0); }
		if( lmin < 0.55 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
		if( lmin < -1.07 ) { return new Prediction("NAT", 12.76, 0); }
	}
	if( max >= 10.45 ) { 
		if( max < 11.25 ) { return new Prediction("AT", 13.83, 0.83); }
	if( max >= 11.25 ) { 
		if( lmin >= -0.08 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -0.08 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	}
	}
	if( rmin < -5.54 ) { 
	if( rmin < -9.48 ) { 
		if( max < 6.19 ) { return new Prediction("NAT", 7.45, 0); }
		if( max >= 6.19 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	if( rmin >= -9.48 ) { 
	if( rmin >= -7.68 ) { 
		if( lmin >= -4.93 ) { return new Prediction("NAT", 10.64, 0); }
	if( lmin < -4.93 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 10.64, 0.64); }
	if( max >= 5.93 ) { 
		if( rmin >= -6.81 ) { return new Prediction("AT", 2.13, 0.13); }
		if( rmin < -6.81 ) { return new Prediction("NAT", 2.13, 0); }
	}
	}
	}
		if( rmin < -7.68 ) { return new Prediction("AT", 12.76, 0.76); }
	}
	}
	}
	}
	}
	if( max >= 12.03 ) { 
		if( lslope < -41019 ) { return new Prediction("NAT", 1.06, 0); }
		if( lslope >= -41019 ) { return new Prediction("AT", 24.46, 1.46); }
	}
	}
		if( lslope >= -5364.5 ) { return new Prediction("NAT", 92.53, 0); }
	}
	}
return null;
}
private Prediction runTree84() {
	if( lmin < -9.17 ) { 
	if( max < 8.36 ) { 
	if( rslope < -10795.5 ) { 
	if( lmin >= -12.17 ) { 
		if( rslope < -19882.5 ) { return new Prediction("NAT", 16.11, 0.06); }
	if( rslope >= -19882.5 ) { 
	if( lslope >= -16225.5 ) { 
	if( lslope < -14749.5 ) { 
		if( lmin < -10 ) { return new Prediction("AT", 2.15, 0.14); }
		if( lmin >= -10 ) { return new Prediction("NAT", 3.22, 0.01); }
	}
		if( lslope >= -14749.5 ) { return new Prediction("NAT", 15.04, 0.05); }
	}
		if( lslope < -16225.5 ) { return new Prediction("AT", 6.45, 0.42); }
	}
	}
		if( lmin < -12.17 ) { return new Prediction("NAT", 27.93, 0.1); }
	}
	if( rslope >= -10795.5 ) { 
	if( rslope >= -5990 ) { 
		if( max < 1.08 ) { return new Prediction("NAT", 10.74, 0.04); }
		if( max >= 1.08 ) { return new Prediction("AT", 6.45, 0.42); }
	}
	if( rslope < -5990 ) { 
		if( lslope >= -10480.5 ) { return new Prediction("AT", 32.23, 2.12); }
	if( lslope < -10480.5 ) { 
		if( lmin >= -11.92 ) { return new Prediction("AT", 2.15, 0.14); }
		if( lmin < -11.92 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	if( max >= 8.36 ) { 
	if( lmin >= -23.97 ) { 
	if( lslope >= -21578.5 ) { 
	if( max < 9.82 ) { 
		if( max >= 9.43 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 9.43 ) { return new Prediction("AT", 4.3, 0.28); }
	}
		if( max >= 9.82 ) { return new Prediction("AT", 88.09, 5.78); }
	}
	if( lslope < -21578.5 ) { 
		if( max < 16.52 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 16.52 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
		if( lmin < -23.97 ) { return new Prediction("NAT", 2.15, 0.01); }
	}
	}
	if( lmin >= -9.17 ) { 
	if( max < 13.14 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 123.55, 0.43); }
	if( lmin < 3.69 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 97.76, 0.34); }
	if( lslope >= -34743.5 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 65.53, 0.23); }
	if( lslope < -5358 ) { 
	if( max < 6.31 ) { 
	if( max < 1.66 ) { 
		if( lmin >= -8.74 ) { return new Prediction("NAT", 122.47, 0.43); }
	if( lmin < -8.74 ) { 
		if( lmin < -8.94 ) { return new Prediction("NAT", 3.22, 0.01); }
		if( lmin >= -8.94 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
	if( max >= 1.66 ) { 
	if( rmin < -5.16 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 6.45, 0.02); }
	if( lmin < -4.28 ) { 
	if( lmin < -5.76 ) { 
		if( rmin < -7.08 ) { return new Prediction("NAT", 5.37, 0.02); }
		if( rmin >= -7.08 ) { return new Prediction("AT", 4.3, 0.28); }
	}
		if( lmin >= -5.76 ) { return new Prediction("AT", 6.45, 0.42); }
	}
	}
	if( rmin >= -5.16 ) { 
		if( lmin < 0.34 ) { return new Prediction("NAT", 70.9, 0.25); }
	if( lmin >= 0.34 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 17.19, 0.06); }
	if( lmin < 1.09 ) { 
		if( rmin >= 0.22 ) { return new Prediction("AT", 6.45, 0.42); }
		if( rmin < 0.22 ) { return new Prediction("NAT", 4.3, 0.02); }
	}
	}
	}
	}
	}
	if( max >= 6.31 ) { 
	if( lslope < -18056.5 ) { 
	if( rmin < -0.04 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 6.45, 0.02); }
		if( max >= 11.09 ) { return new Prediction("AT", 2.15, 0.14); }
	}
		if( rmin >= -0.04 ) { return new Prediction("NAT", 19.34, 0.07); }
	}
	if( lslope >= -18056.5 ) { 
	if( lslope >= -14016 ) { 
	if( lslope < -7790 ) { 
	if( rmin >= 0.57 ) { 
		if( lmin >= -0.44 ) { return new Prediction("AT", 6.45, 0.42); }
		if( lmin < -0.44 ) { return new Prediction("NAT", 3.22, 0.01); }
	}
	if( rmin < 0.57 ) { 
		if( lmin >= -5.11 ) { return new Prediction("NAT", 8.59, 0.03); }
		if( lmin < -5.11 ) { return new Prediction("AT", 2.15, 0.14); }
	}
	}
		if( lslope >= -7790 ) { return new Prediction("AT", 7.52, 0.49); }
	}
		if( lslope < -14016 ) { return new Prediction("AT", 10.74, 0.71); }
	}
	}
	}
	}
	}
	}
	if( max >= 13.14 ) { 
	if( lmin < 1.46 ) { 
		if( lslope >= -4493 ) { return new Prediction("NAT", 1.07, 0); }
		if( lslope < -4493 ) { return new Prediction("AT", 22.56, 1.48); }
	}
		if( lmin >= 1.46 ) { return new Prediction("NAT", 4.3, 0.02); }
	}
	}
return null;
}
private Prediction runTree85() {
	if( max >= 15.55 ) { 
		if( lslope >= -19524.5 ) { return new Prediction("AT", 45.29, 3.29); }
	if( lslope < -19524.5 ) { 
		if( rslope < -20381.5 ) { return new Prediction("AT", 6.47, 0.47); }
		if( rslope >= -20381.5 ) { return new Prediction("NAT", 2.16, 0); }
	}
	}
	if( max < 15.55 ) { 
	if( max >= 3.18 ) { 
	if( lslope < -5006.5 ) { 
	if( rmin >= -7.68 ) { 
	if( lmin < 2.86 ) { 
	if( lmin >= -11.99 ) { 
	if( max < 10.58 ) { 
	if( rmin < 3 ) { 
		if( lslope < -34959 ) { return new Prediction("NAT", 16.18, 0); }
	if( lslope >= -34959 ) { 
	if( max >= 5.51 ) { 
	if( max >= 6.09 ) { 
	if( rmin < 1.79 ) { 
		if( max < 6.31 ) { return new Prediction("NAT", 7.55, 0); }
	if( max >= 6.31 ) { 
	if( lmin < -0.18 ) { 
		if( lmin >= -5.3 ) { return new Prediction("NAT", 15.1, 0); }
	if( lmin < -5.3 ) { 
	if( lmin >= -9.5 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 1.08, 0); }
		if( rslope >= -33045 ) { return new Prediction("AT", 4.31, 0.31); }
	}
		if( lmin < -9.5 ) { return new Prediction("NAT", 5.39, 0); }
	}
	}
	if( lmin >= -0.18 ) { 
	if( max >= 7.29 ) { 
		if( lmin >= 1.24 ) { return new Prediction("NAT", 1.08, 0); }
		if( lmin < 1.24 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( max < 7.29 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
	}
		if( rmin >= 1.79 ) { return new Prediction("AT", 6.47, 0.47); }
	}
		if( max < 6.09 ) { return new Prediction("AT", 6.47, 0.47); }
	}
	if( max < 5.51 ) { 
	if( max < 4.3 ) { 
	if( max < 4.09 ) { 
	if( lmin >= -4.93 ) { 
		if( lslope >= -29391.5 ) { return new Prediction("NAT", 18.33, 0); }
	if( lslope < -29391.5 ) { 
		if( lslope >= -30655 ) { return new Prediction("AT", 1.08, 0.08); }
		if( lslope < -30655 ) { return new Prediction("NAT", 6.47, 0); }
	}
	}
	if( lmin < -4.93 ) { 
		if( max < 3.73 ) { return new Prediction("AT", 2.16, 0.16); }
		if( max >= 3.73 ) { return new Prediction("NAT", 3.24, 0); }
	}
	}
		if( max >= 4.09 ) { return new Prediction("AT", 3.24, 0.24); }
	}
		if( max >= 4.3 ) { return new Prediction("NAT", 22.65, 0); }
	}
	}
	}
		if( rmin >= 3 ) { return new Prediction("NAT", 33.43, 0); }
	}
	if( max >= 10.58 ) { 
		if( rslope >= -19255.5 ) { return new Prediction("AT", 28.04, 2.04); }
	if( rslope < -19255.5 ) { 
	if( max >= 12.06 ) { 
		if( lmin >= -1.14 ) { return new Prediction("NAT", 3.24, 0); }
	if( lmin < -1.14 ) { 
	if( max >= 13.39 ) { 
		if( lslope >= -30026.5 ) { return new Prediction("NAT", 1.08, 0); }
		if( lslope < -30026.5 ) { return new Prediction("AT", 1.08, 0.08); }
	}
		if( max < 13.39 ) { return new Prediction("AT", 3.24, 0.24); }
	}
	}
		if( max < 12.06 ) { return new Prediction("NAT", 12.94, 0); }
	}
	}
	}
		if( lmin < -11.99 ) { return new Prediction("AT", 11.86, 0.86); }
	}
		if( lmin >= 2.86 ) { return new Prediction("NAT", 56.08, 0); }
	}
	if( rmin < -7.68 ) { 
	if( rslope < -9199.5 ) { 
	if( max < 6.3 ) { 
		if( rmin >= -8.4 ) { return new Prediction("AT", 4.31, 0.31); }
	if( rmin < -8.4 ) { 
		if( lslope < -11280 ) { return new Prediction("NAT", 12.94, 0); }
		if( lslope >= -11280 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
	if( max >= 6.3 ) { 
	if( lslope < -8975.5 ) { 
	if( lslope < -16970 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 2.16, 0.16); }
		if( max < 9.7 ) { return new Prediction("NAT", 1.08, 0); }
	}
		if( lslope >= -16970 ) { return new Prediction("AT", 18.33, 1.33); }
	}
		if( lslope >= -8975.5 ) { return new Prediction("NAT", 1.08, 0); }
	}
	}
		if( rslope >= -9199.5 ) { return new Prediction("AT", 32.35, 2.35); }
	}
	}
	if( lslope >= -5006.5 ) { 
		if( max < 11.16 ) { return new Prediction("NAT", 92.74, 0); }
	if( max >= 11.16 ) { 
		if( rslope < -2883 ) { return new Prediction("NAT", 10.78, 0); }
		if( rslope >= -2883 ) { return new Prediction("AT", 2.16, 0.16); }
	}
	}
	}
	if( max < 3.18 ) { 
		if( rslope < -19833 ) { return new Prediction("NAT", 175.78, 0); }
	if( rslope >= -19833 ) { 
		if( lmin >= -8.74 ) { return new Prediction("NAT", 120.78, 0); }
	if( lmin < -8.74 ) { 
		if( max < -4.9 ) { return new Prediction("NAT", 11.86, 0); }
	if( max >= -4.9 ) { 
		if( lslope >= -10213 ) { return new Prediction("AT", 12.94, 0.94); }
	if( lslope < -10213 ) { 
		if( lmin < -11.25 ) { return new Prediction("NAT", 15.1, 0); }
	if( lmin >= -11.25 ) { 
		if( rmin < -7.96 ) { return new Prediction("NAT", 3.24, 0); }
		if( rmin >= -7.96 ) { return new Prediction("AT", 4.31, 0.31); }
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree86() {
	if( lmin >= -8.27 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 113.17, 0); }
	if( rslope < -5426 ) { 
	if( max >= 10.84 ) { 
	if( lmin < 3.62 ) { 
	if( lslope < -20462 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 10.48, 0); }
	if( rmin < 2.46 ) { 
		if( rmin < -2.69 ) { return new Prediction("NAT", 8.38, 0); }
	if( rmin >= -2.69 ) { 
		if( lmin < -1.41 ) { return new Prediction("AT", 5.24, 0.24); }
		if( lmin >= -1.41 ) { return new Prediction("NAT", 3.14, 0); }
	}
	}
	}
		if( lslope >= -20462 ) { return new Prediction("AT", 30.39, 1.39); }
	}
		if( lmin >= 3.62 ) { return new Prediction("NAT", 8.38, 0); }
	}
	if( max < 10.84 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 100.6, 0); }
	if( rslope >= -33045 ) { 
	if( rmin < -5.82 ) { 
	if( lslope >= -9173.5 ) { 
		if( lslope < -5622.5 ) { return new Prediction("AT", 7.34, 0.34); }
		if( lslope >= -5622.5 ) { return new Prediction("NAT", 1.05, 0); }
	}
	if( lslope < -9173.5 ) { 
		if( max < 1.66 ) { return new Prediction("NAT", 30.39, 0); }
	if( max >= 1.66 ) { 
	if( max >= 3.61 ) { 
	if( rmin < -6.35 ) { 
		if( max >= 7.38 ) { return new Prediction("AT", 1.05, 0.05); }
		if( max < 7.38 ) { return new Prediction("NAT", 9.43, 0); }
	}
	if( rmin >= -6.35 ) { 
		if( lmin >= -4.72 ) { return new Prediction("NAT", 1.05, 0); }
		if( lmin < -4.72 ) { return new Prediction("AT", 2.1, 0.1); }
	}
	}
		if( max < 3.61 ) { return new Prediction("AT", 5.24, 0.24); }
	}
	}
	}
	if( rmin >= -5.82 ) { 
	if( rslope < -5611 ) { 
	if( max >= 3.49 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 44.01, 0); }
	if( lmin < 3.7 ) { 
	if( lmin >= 0.24 ) { 
	if( lmin >= 1.19 ) { 
	if( lmin >= 2.44 ) { 
		if( rmin < -2.54 ) { return new Prediction("NAT", 2.1, 0); }
	if( rmin >= -2.54 ) { 
		if( max >= 6.69 ) { return new Prediction("AT", 3.14, 0.14); }
		if( max < 6.69 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
		if( lmin < 2.44 ) { return new Prediction("NAT", 12.57, 0); }
	}
	if( lmin < 1.19 ) { 
	if( rmin < 2.57 ) { 
		if( lslope < -18040 ) { return new Prediction("AT", 8.38, 0.38); }
	if( lslope >= -18040 ) { 
		if( max < 7.26 ) { return new Prediction("NAT", 2.1, 0); }
		if( max >= 7.26 ) { return new Prediction("AT", 3.14, 0.14); }
	}
	}
		if( rmin >= 2.57 ) { return new Prediction("NAT", 6.29, 0); }
	}
	}
	if( lmin < 0.24 ) { 
	if( rslope >= -32938 ) { 
	if( lmin >= -1.07 ) { 
	if( lmin < -0.6 ) { 
		if( max < 5.85 ) { return new Prediction("NAT", 3.14, 0); }
		if( max >= 5.85 ) { return new Prediction("AT", 3.14, 0.14); }
	}
		if( lmin >= -0.6 ) { return new Prediction("NAT", 16.77, 0); }
	}
		if( lmin < -1.07 ) { return new Prediction("NAT", 60.78, 0); }
	}
		if( rslope < -32938 ) { return new Prediction("AT", 1.05, 0.05); }
	}
	}
	}
		if( max < 3.49 ) { return new Prediction("NAT", 138.32, 0); }
	}
		if( rslope >= -5611 ) { return new Prediction("AT", 2.1, 0.1); }
	}
	}
	}
	}
	}
	if( lmin < -8.27 ) { 
	if( lslope < -19947.5 ) { 
	if( lslope >= -35092.5 ) { 
		if( lslope < -29169 ) { return new Prediction("AT", 4.19, 0.19); }
		if( lslope >= -29169 ) { return new Prediction("NAT", 10.48, 0); }
	}
		if( lslope < -35092.5 ) { return new Prediction("NAT", 20.96, 0); }
	}
	if( lslope >= -19947.5 ) { 
	if( max < 11.09 ) { 
	if( rslope < -11195 ) { 
	if( rslope < -13214 ) { 
	if( max >= 8.05 ) { 
		if( rslope >= -17033.5 ) { return new Prediction("AT", 17.81, 0.81); }
	if( rslope < -17033.5 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 4.19, 0.19); }
		if( max < 9.7 ) { return new Prediction("NAT", 2.1, 0); }
	}
	}
	if( max < 8.05 ) { 
	if( rslope >= -19591.5 ) { 
	if( lmin >= -12.26 ) { 
		if( lmin < -10.38 ) { return new Prediction("AT", 3.14, 0.14); }
		if( lmin >= -10.38 ) { return new Prediction("NAT", 9.43, 0); }
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 10.48, 0); }
	}
		if( rslope < -19591.5 ) { return new Prediction("AT", 3.14, 0.14); }
	}
	}
	if( rslope >= -13214 ) { 
		if( max >= 6.25 ) { return new Prediction("AT", 1.05, 0.05); }
		if( max < 6.25 ) { return new Prediction("NAT", 13.62, 0); }
	}
	}
	if( rslope >= -11195 ) { 
	if( rslope >= -5283 ) { 
		if( lslope >= -4003.5 ) { return new Prediction("NAT", 7.34, 0); }
	if( lslope < -4003.5 ) { 
		if( lmin < -10 ) { return new Prediction("AT", 2.1, 0.1); }
		if( lmin >= -10 ) { return new Prediction("NAT", 1.05, 0); }
	}
	}
	if( rslope < -5283 ) { 
		if( max >= 8.27 ) { return new Prediction("NAT", 2.1, 0); }
		if( max < 8.27 ) { return new Prediction("AT", 48.2, 2.2); }
	}
	}
	}
		if( max >= 11.09 ) { return new Prediction("AT", 46.11, 2.11); }
	}
	}
return null;
}
private Prediction runTree87() {
	if( lmin >= -8.25 ) { 
		if( max < 1.65 ) { return new Prediction("NAT", 214.59, 0); }
	if( max >= 1.65 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 107.3, 0); }
	if( lmin < 3.98 ) { 
	if( max >= 13.13 ) { 
		if( rmin < 1.49 ) { return new Prediction("AT", 13.95, 0.95); }
	if( rmin >= 1.49 ) { 
		if( lmin < -1.04 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -1.04 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	if( max < 13.13 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 52.57, 0); }
	if( rslope < -5426 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 41.85, 0); }
	if( lslope >= -34743.5 ) { 
	if( rmin >= -4.48 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 38.63, 0); }
	if( max >= 3.17 ) { 
	if( lmin >= -1.07 ) { 
	if( lslope < -7867.5 ) { 
	if( rmin >= 3.46 ) { 
		if( lslope < -9530.5 ) { return new Prediction("NAT", 18.24, 0); }
		if( lslope >= -9530.5 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rmin < 3.46 ) { 
		if( lslope < -31230 ) { return new Prediction("NAT", 4.29, 0); }
	if( lslope >= -31230 ) { 
	if( lslope < -25751 ) { 
		if( lmin < 0.09 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= 0.09 ) { 
		if( lmin >= 2.35 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < 2.35 ) { return new Prediction("AT", 12.88, 0.88); }
	}
	}
	if( lslope >= -25751 ) { 
		if( max < 7.36 ) { return new Prediction("NAT", 15.02, 0); }
	if( max >= 7.36 ) { 
		if( lslope >= -12907.5 ) { return new Prediction("AT", 5.36, 0.36); }
	if( lslope < -12907.5 ) { 
		if( lmin < 0.57 ) { return new Prediction("AT", 2.15, 0.15); }
		if( lmin >= 0.57 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
	}
	}
	if( lslope >= -7867.5 ) { 
		if( max < 6.31 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= 6.31 ) { return new Prediction("AT", 7.51, 0.51); }
	}
	}
	if( lmin < -1.07 ) { 
	if( lslope >= -32607 ) { 
	if( max < 3.31 ) { 
		if( rmin < 1.14 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin >= 1.14 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	if( max >= 3.31 ) { 
	if( max >= 10.99 ) { 
		if( max < 11.25 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max >= 11.25 ) { return new Prediction("NAT", 4.29, 0); }
	}
		if( max < 10.99 ) { return new Prediction("NAT", 53.65, 0); }
	}
	}
		if( lslope < -32607 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	}
	if( rmin < -4.48 ) { 
	if( lmin >= -4.52 ) { 
		if( max >= 11.31 ) { return new Prediction("AT", 4.29, 0.29); }
	if( max < 11.31 ) { 
		if( rmin >= -10.23 ) { return new Prediction("NAT", 10.73, 0); }
	if( rmin < -10.23 ) { 
		if( lmin >= 1.44 ) { return new Prediction("NAT", 3.22, 0); }
		if( lmin < 1.44 ) { return new Prediction("AT", 2.15, 0.15); }
	}
	}
	}
	if( lmin < -4.52 ) { 
	if( rslope < -10417 ) { 
		if( lslope >= -14424.5 ) { return new Prediction("NAT", 5.36, 0); }
		if( lslope < -14424.5 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 10.73, 0.73); }
	}
	}
	}
	}
	}
	}
	}
	}
	if( lmin < -8.25 ) { 
	if( rslope >= -18176.5 ) { 
	if( max < 11.14 ) { 
	if( max < -3.46 ) { 
		if( max < -6.88 ) { return new Prediction("NAT", 7.51, 0); }
	if( max >= -6.88 ) { 
		if( lmin < -13.17 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -13.17 ) { return new Prediction("NAT", 3.22, 0); }
	}
	}
	if( max >= -3.46 ) { 
	if( lmin < -19.72 ) { 
	if( lmin >= -22.76 ) { 
		if( lmin >= -20.63 ) { return new Prediction("NAT", 2.15, 0); }
		if( lmin < -20.63 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 2.15, 0); }
	}
	if( lmin >= -19.72 ) { 
	if( rmin >= -7.31 ) { 
	if( lmin >= -17.06 ) { 
	if( rmin < -4.75 ) { 
	if( max >= 4.95 ) { 
		if( max >= 9.24 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 9.24 ) { return new Prediction("NAT", 2.15, 0); }
	}
		if( max < 4.95 ) { return new Prediction("AT", 2.15, 0.15); }
	}
		if( rmin >= -4.75 ) { return new Prediction("NAT", 4.29, 0); }
	}
		if( lmin < -17.06 ) { return new Prediction("AT", 5.36, 0.36); }
	}
	if( rmin < -7.31 ) { 
		if( lslope >= -11676 ) { return new Prediction("AT", 38.63, 2.63); }
	if( lslope < -11676 ) { 
		if( lslope >= -14836.5 ) { return new Prediction("NAT", 8.58, 0); }
		if( lslope < -14836.5 ) { return new Prediction("AT", 22.53, 1.53); }
	}
	}
	}
	}
	}
		if( max >= 11.14 ) { return new Prediction("AT", 66.52, 4.52); }
	}
	if( rslope < -18176.5 ) { 
		if( max < 6.87 ) { return new Prediction("NAT", 30.04, 0); }
	if( max >= 6.87 ) { 
		if( max < 8.36 ) { return new Prediction("AT", 1.07, 0.07); }
	if( max >= 8.36 ) { 
		if( lmin < -8.78 ) { return new Prediction("NAT", 4.29, 0); }
		if( lmin >= -8.78 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	}
return null;
}
private Prediction runTree88() {
	if( lmin >= -8.26 ) { 
	if( max < 3.17 ) { 
		if( max < 2.15 ) { return new Prediction("NAT", 240.21, 0.56); }
	if( max >= 2.15 ) { 
		if( lmin < -6.91 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -6.91 ) { return new Prediction("NAT", 26.69, 0.06); }
	}
	}
	if( max >= 3.17 ) { 
	if( rmin < 5.78 ) { 
	if( lslope < -5336 ) { 
	if( rslope < -26978 ) { 
	if( max >= 5.47 ) { 
		if( lslope < -36774 ) { return new Prediction("NAT", 11.74, 0.03); }
	if( lslope >= -36774 ) { 
	if( lslope < -28117.5 ) { 
		if( max < 9.64 ) { return new Prediction("AT", 11.74, 0.72); }
		if( max >= 9.64 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -28117.5 ) { return new Prediction("NAT", 7.47, 0.02); }
	}
	}
		if( max < 5.47 ) { return new Prediction("NAT", 48.04, 0.11); }
	}
	if( rslope >= -26978 ) { 
		if( lmin >= 3.99 ) { return new Prediction("NAT", 16.01, 0.04); }
	if( lmin < 3.99 ) { 
	if( max < 7.05 ) { 
	if( max < 4.3 ) { 
	if( lslope >= -18875 ) { 
	if( lmin < -4.83 ) { 
		if( lmin < -6.07 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -6.07 ) { return new Prediction("AT", 4.27, 0.26); }
	}
		if( lmin >= -4.83 ) { return new Prediction("NAT", 6.41, 0.02); }
	}
		if( lslope < -18875 ) { return new Prediction("AT", 8.54, 0.52); }
	}
	if( max >= 4.3 ) { 
	if( lmin < -5.69 ) { 
	if( max < 6.31 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 4.27, 0.01); }
	if( rslope >= -10417 ) { 
		if( lmin < -6.66 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -6.66 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( max >= 6.31 ) { return new Prediction("AT", 2.14, 0.13); }
	}
		if( lmin >= -5.69 ) { return new Prediction("NAT", 33.1, 0.08); }
	}
	}
	if( max >= 7.05 ) { 
		if( lslope < -23761.5 ) { return new Prediction("NAT", 3.2, 0.01); }
	if( lslope >= -23761.5 ) { 
	if( max < 10.47 ) { 
	if( max >= 7.64 ) { 
		if( rmin >= 2.7 ) { return new Prediction("AT", 5.34, 0.33); }
		if( rmin < 2.7 ) { return new Prediction("NAT", 7.47, 0.02); }
	}
	if( max < 7.64 ) { 
	if( rmin < -3.93 ) { 
		if( lmin < 0.93 ) { return new Prediction("AT", 4.27, 0.26); }
		if( lmin >= 0.93 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin >= -3.93 ) { return new Prediction("AT", 13.88, 0.85); }
	}
	}
	if( max >= 10.47 ) { 
		if( lslope >= -20727 ) { return new Prediction("AT", 27.76, 1.69); }
	if( lslope < -20727 ) { 
		if( lmin >= -1.7 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lmin < -1.7 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
	}
	}
	}
	}
	}
		if( lslope >= -5336 ) { return new Prediction("NAT", 46.97, 0.11); }
	}
	if( rmin >= 5.78 ) { 
	if( rmin < 19.77 ) { 
	if( lmin < -0.73 ) { 
		if( lmin >= -1.46 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -1.46 ) { return new Prediction("NAT", 19.22, 0.05); }
	}
		if( lmin >= -0.73 ) { return new Prediction("NAT", 71.53, 0.17); }
	}
		if( rmin >= 19.77 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( lmin < -8.26 ) { 
	if( rslope >= -19140 ) { 
	if( max >= 4.48 ) { 
	if( lmin < -20.79 ) { 
		if( max < 29.17 ) { return new Prediction("NAT", 4.27, 0.01); }
		if( max >= 29.17 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( lmin >= -20.79 ) { 
	if( max < 7.92 ) { 
		if( max < 7.69 ) { return new Prediction("AT", 28.82, 1.76); }
		if( max >= 7.69 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
		if( max >= 7.92 ) { return new Prediction("AT", 68.33, 4.17); }
	}
	}
	if( max < 4.48 ) { 
	if( rslope < -10795.5 ) { 
	if( lslope < -15201.5 ) { 
		if( lmin < -12.54 ) { return new Prediction("NAT", 4.27, 0.01); }
		if( lmin >= -12.54 ) { return new Prediction("AT", 6.41, 0.39); }
	}
		if( lslope >= -15201.5 ) { return new Prediction("NAT", 19.22, 0.05); }
	}
	if( rslope >= -10795.5 ) { 
	if( lslope >= -5292.5 ) { 
		if( max < 1.08 ) { return new Prediction("NAT", 13.88, 0.03); }
		if( max >= 1.08 ) { return new Prediction("AT", 4.27, 0.26); }
	}
	if( lslope < -5292.5 ) { 
	if( rslope < -10229 ) { 
		if( max < -0.06 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= -0.06 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rslope >= -10229 ) { return new Prediction("AT", 21.35, 1.3); }
	}
	}
	}
	}
	if( rslope < -19140 ) { 
	if( rmin < -5.52 ) { 
		if( lmin >= -9.19 ) { return new Prediction("NAT", 16.01, 0.04); }
	if( lmin < -9.19 ) { 
		if( lmin >= -11.54 ) { return new Prediction("AT", 6.41, 0.39); }
		if( lmin < -11.54 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( rmin >= -5.52 ) { return new Prediction("NAT", 20.28, 0.05); }
	}
	}
return null;
}
private Prediction runTree89() {
	if( lmin < -9.16 ) { 
	if( max < 11.09 ) { 
	if( lslope < -10474.5 ) { 
		if( rslope < -19882.5 ) { return new Prediction("NAT", 11.8, 0.01); }
	if( rslope >= -19882.5 ) { 
	if( max < 7.92 ) { 
		if( lslope >= -16225.5 ) { return new Prediction("NAT", 22.53, 0.03); }
	if( lslope < -16225.5 ) { 
		if( max >= 2.61 ) { return new Prediction("NAT", 5.36, 0.01); }
		if( max < 2.61 ) { return new Prediction("AT", 5.36, 0.36); }
	}
	}
	if( max >= 7.92 ) { 
		if( rslope >= -17033.5 ) { return new Prediction("AT", 12.88, 0.86); }
	if( rslope < -17033.5 ) { 
		if( max >= 9.7 ) { return new Prediction("AT", 1.07, 0.07); }
		if( max < 9.7 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	}
	if( lslope >= -10474.5 ) { 
		if( lslope < -5068.5 ) { return new Prediction("AT", 45.06, 3.01); }
	if( lslope >= -5068.5 ) { 
		if( max < 1.08 ) { return new Prediction("NAT", 12.88, 0.02); }
	if( max >= 1.08 ) { 
		if( lmin >= -17.25 ) { return new Prediction("AT", 5.36, 0.36); }
		if( lmin < -17.25 ) { return new Prediction("NAT", 4.29, 0.01); }
	}
	}
	}
	}
	if( max >= 11.09 ) { 
		if( rslope >= -20001.5 ) { return new Prediction("AT", 50.43, 3.37); }
	if( rslope < -20001.5 ) { 
		if( rslope >= -28340 ) { return new Prediction("NAT", 3.22, 0); }
		if( rslope < -28340 ) { return new Prediction("AT", 4.29, 0.29); }
	}
	}
	}
	if( lmin >= -9.16 ) { 
	if( max < 13.14 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 107.3, 0.13); }
	if( lmin < 3.98 ) { 
	if( lslope >= -33031.5 ) { 
		if( lslope >= -5358 ) { return new Prediction("NAT", 48.28, 0.06); }
	if( lslope < -5358 ) { 
	if( lslope < -6086.5 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 40.77, 0.05); }
	if( max >= 3.17 ) { 
	if( rmin >= -7.68 ) { 
	if( rslope >= -28973 ) { 
	if( rslope >= -11647 ) { 
	if( max < 10.53 ) { 
		if( lmin >= 2.05 ) { return new Prediction("AT", 3.22, 0.22); }
	if( lmin < 2.05 ) { 
	if( rmin < -5.3 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 4.29, 0.29); }
	if( max >= 5.93 ) { 
		if( rmin < -6.23 ) { return new Prediction("NAT", 5.36, 0.01); }
		if( rmin >= -6.23 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rmin >= -5.3 ) { return new Prediction("NAT", 26.82, 0.03); }
	}
	}
		if( max >= 10.53 ) { return new Prediction("AT", 6.44, 0.43); }
	}
	if( rslope < -11647 ) { 
	if( lslope >= -27092 ) { 
		if( lslope < -25751.5 ) { return new Prediction("AT", 4.29, 0.29); }
	if( lslope >= -25751.5 ) { 
	if( max < 11.09 ) { 
	if( rmin >= 6.64 ) { 
		if( rmin < 6.74 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= 6.74 ) { return new Prediction("NAT", 7.51, 0.01); }
	}
		if( rmin < 6.64 ) { return new Prediction("NAT", 41.85, 0.05); }
	}
	if( max >= 11.09 ) { 
		if( lmin >= -0.25 ) { return new Prediction("AT", 2.15, 0.14); }
	if( lmin < -0.25 ) { 
		if( lslope < -21756.5 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope >= -21756.5 ) { return new Prediction("NAT", 6.44, 0.01); }
	}
	}
	}
	}
		if( lslope < -27092 ) { return new Prediction("NAT", 21.46, 0.03); }
	}
	}
	if( rslope < -28973 ) { 
	if( rmin < 0.65 ) { 
		if( lmin >= -1.31 ) { return new Prediction("AT", 7.51, 0.5); }
	if( lmin < -1.31 ) { 
	if( lmin < -4.39 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 2.15, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( lmin >= -4.39 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
		if( rmin >= 0.65 ) { return new Prediction("NAT", 5.36, 0.01); }
	}
	}
	if( rmin < -7.68 ) { 
		if( rmin >= -9.38 ) { return new Prediction("AT", 10.73, 0.72); }
	if( rmin < -9.38 ) { 
		if( lmin >= -3.55 ) { return new Prediction("AT", 2.15, 0.14); }
		if( lmin < -3.55 ) { return new Prediction("NAT", 2.15, 0); }
	}
	}
	}
	}
		if( lslope >= -6086.5 ) { return new Prediction("AT", 7.51, 0.5); }
	}
	}
		if( lslope < -33031.5 ) { return new Prediction("NAT", 59.01, 0.07); }
	}
	}
	if( max < 1.68 ) { 
	if( rmin < -8.74 ) { 
		if( max >= 0.26 ) { return new Prediction("AT", 2.15, 0.14); }
		if( max < 0.26 ) { return new Prediction("NAT", 15.02, 0.02); }
	}
		if( rmin >= -8.74 ) { return new Prediction("NAT", 186.69, 0.22); }
	}
	}
	if( max >= 13.14 ) { 
		if( lslope >= -9770 ) { return new Prediction("NAT", 3.22, 0); }
	if( lslope < -9770 ) { 
		if( lmin < 1.46 ) { return new Prediction("AT", 23.61, 1.58); }
		if( lmin >= 1.46 ) { return new Prediction("NAT", 3.22, 0); }
	}
	}
	}
return null;
}
private Prediction runTree90() {
	if( lmin < -7.72 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 18.17, 0.02); }
	if( lslope >= -35302 ) { 
	if( lslope < -10729.5 ) { 
	if( max < 5.26 ) { 
	if( rmin >= -8.14 ) { 
	if( lslope < -14711.5 ) { 
		if( rslope >= -18241.5 ) { return new Prediction("AT", 5.34, 0.34); }
	if( rslope < -18241.5 ) { 
		if( lmin >= -9.61 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -9.61 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
		if( lslope >= -14711.5 ) { return new Prediction("NAT", 4.28, 0.01); }
	}
		if( rmin < -8.14 ) { return new Prediction("NAT", 23.52, 0.03); }
	}
	if( max >= 5.26 ) { 
	if( lslope < -16970 ) { 
	if( rmin < 1.38 ) { 
		if( lmin >= -9.87 ) { return new Prediction("AT", 16.03, 1.02); }
	if( lmin < -9.87 ) { 
	if( rmin >= -9.31 ) { 
		if( lmin < -10.83 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= -10.83 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
	if( rmin < -9.31 ) { 
		if( lslope < -17473 ) { return new Prediction("AT", 4.28, 0.27); }
		if( lslope >= -17473 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
		if( rmin >= 1.38 ) { return new Prediction("NAT", 6.41, 0.01); }
	}
	if( lslope >= -16970 ) { 
	if( max < 7.92 ) { 
		if( lmin < -10.38 ) { return new Prediction("AT", 2.14, 0.14); }
		if( lmin >= -10.38 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( max >= 7.92 ) { return new Prediction("AT", 41.69, 2.64); }
	}
	}
	}
	if( lslope >= -10729.5 ) { 
	if( max >= -5.41 ) { 
	if( lmin >= -22.76 ) { 
	if( lslope < -2447.99 ) { 
		if( rslope >= -10528 ) { return new Prediction("AT", 71.62, 4.53); }
	if( rslope < -10528 ) { 
		if( max < -1.87 ) { return new Prediction("NAT", 1.07, 0); }
		if( max >= -1.87 ) { return new Prediction("AT", 6.41, 0.41); }
	}
	}
	if( lslope >= -2447.99 ) { 
		if( max >= 7.32 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max < 7.32 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 10.69, 0.01); }
	}
	}
	}
	if( lmin >= -7.72 ) { 
		if( lslope >= -6345 ) { return new Prediction("NAT", 148.58, 0.17); }
	if( lslope < -6345 ) { 
		if( rslope < -37030.5 ) { return new Prediction("NAT", 91.93, 0.11); }
	if( rslope >= -37030.5 ) { 
		if( lmin >= 2.84 ) { return new Prediction("NAT", 49.17, 0.06); }
	if( lmin < 2.84 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 154.99, 0.18); }
	if( max >= 3.17 ) { 
	if( rmin >= 0.93 ) { 
	if( rslope >= -21351.5 ) { 
	if( max < 10.58 ) { 
		if( lslope >= -12997.5 ) { return new Prediction("NAT", 14.96, 0.02); }
	if( lslope < -12997.5 ) { 
	if( rmin < 7.46 ) { 
		if( lmin < 0.08 ) { return new Prediction("AT", 4.28, 0.27); }
		if( lmin >= 0.08 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin >= 7.46 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	if( max >= 10.58 ) { 
		if( lslope >= -12407.5 ) { return new Prediction("AT", 4.28, 0.27); }
	if( lslope < -12407.5 ) { 
		if( lmin >= -3.86 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin < -3.86 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( rslope < -21351.5 ) { 
	if( max < 4.31 ) { 
		if( max < 3.9 ) { return new Prediction("NAT", 3.21, 0); }
		if( max >= 3.9 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( max >= 4.31 ) { return new Prediction("NAT", 24.59, 0.03); }
	}
	}
	if( rmin < 0.93 ) { 
	if( rmin >= -0.76 ) { 
	if( lslope < -13037.5 ) { 
		if( rslope >= -27154 ) { return new Prediction("AT", 11.76, 0.74); }
	if( rslope < -27154 ) { 
	if( lmin >= -3.22 ) { 
		if( rslope >= -27710 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope < -27710 ) { return new Prediction("AT", 7.48, 0.47); }
	}
		if( lmin < -3.22 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lslope >= -13037.5 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( rmin < -0.76 ) { 
	if( rmin < -1.99 ) { 
		if( max >= 14.9 ) { return new Prediction("AT", 11.76, 0.74); }
	if( max < 14.9 ) { 
	if( lslope >= -25045.5 ) { 
	if( lmin < 0.4 ) { 
	if( lmin < -1.3 ) { 
		if( rmin < -8.85 ) { return new Prediction("NAT", 6.41, 0.01); }
	if( rmin >= -8.85 ) { 
	if( lmin < -5.04 ) { 
	if( lmin < -6.27 ) { 
		if( rmin >= -6.41 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < -6.41 ) { return new Prediction("NAT", 4.28, 0.01); }
	}
		if( lmin >= -6.27 ) { return new Prediction("AT", 10.69, 0.68); }
	}
	if( lmin >= -5.04 ) { 
		if( lslope >= -16872 ) { return new Prediction("NAT", 7.48, 0.01); }
	if( lslope < -16872 ) { 
		if( lmin >= -3.13 ) { return new Prediction("AT", 2.14, 0.14); }
	if( lmin < -3.13 ) { 
		if( max >= 7.1 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 7.1 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	}
	}
		if( lmin >= -1.3 ) { return new Prediction("AT", 6.41, 0.41); }
	}
		if( lmin >= 0.4 ) { return new Prediction("NAT", 7.48, 0.01); }
	}
		if( lslope < -25045.5 ) { return new Prediction("NAT", 10.69, 0.01); }
	}
	}
	if( rmin >= -1.99 ) { 
		if( rslope >= -17952.5 ) { return new Prediction("NAT", 14.96, 0.02); }
	if( rslope < -17952.5 ) { 
		if( max >= 9.06 ) { return new Prediction("AT", 4.28, 0.27); }
		if( max < 9.06 ) { return new Prediction("NAT", 4.28, 0.01); }
	}
	}
	}
	}
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree91() {
	if( lmin < -9.16 ) { 
		if( lslope < -19947.5 ) { return new Prediction("NAT", 21.7, 0.08); }
	if( lslope >= -19947.5 ) { 
	if( rslope < -10879.5 ) { 
	if( max < 9.21 ) { 
		if( rmin < -17.65 ) { return new Prediction("AT", 2.17, 0.16); }
	if( rmin >= -17.65 ) { 
		if( rslope >= -15268 ) { return new Prediction("NAT", 20.62, 0.07); }
	if( rslope < -15268 ) { 
	if( rmin < -1.92 ) { 
	if( max >= 2.49 ) { 
		if( lmin >= -11.1 ) { return new Prediction("AT", 1.09, 0.08); }
	if( lmin < -11.1 ) { 
		if( rslope < -15574.5 ) { return new Prediction("NAT", 6.51, 0.02); }
		if( rslope >= -15574.5 ) { return new Prediction("AT", 1.09, 0.08); }
	}
	}
		if( max < 2.49 ) { return new Prediction("AT", 3.26, 0.24); }
	}
		if( rmin >= -1.92 ) { return new Prediction("NAT", 5.43, 0.02); }
	}
	}
	}
		if( max >= 9.21 ) { return new Prediction("AT", 27.13, 2.04); }
	}
	if( rslope >= -10879.5 ) { 
	if( max >= -2.19 ) { 
	if( lslope < -2447.99 ) { 
	if( lmin < -17.96 ) { 
		if( lmin >= -18.41 ) { return new Prediction("NAT", 1.09, 0); }
		if( lmin < -18.41 ) { return new Prediction("AT", 3.26, 0.24); }
	}
		if( lmin >= -17.96 ) { return new Prediction("AT", 72.71, 5.46); }
	}
	if( lslope >= -2447.99 ) { 
		if( lmin < -13.57 ) { return new Prediction("NAT", 7.6, 0.03); }
		if( lmin >= -13.57 ) { return new Prediction("AT", 5.43, 0.41); }
	}
	}
		if( max < -2.19 ) { return new Prediction("NAT", 6.51, 0.02); }
	}
	}
	}
	if( lmin >= -9.16 ) { 
		if( max >= 15.69 ) { return new Prediction("AT", 18.45, 1.38); }
	if( max < 15.69 ) { 
	if( lmin < 2.86 ) { 
	if( max >= 5.51 ) { 
	if( lmin >= -5.58 ) { 
		if( lslope >= -4680 ) { return new Prediction("NAT", 16.28, 0.06); }
	if( lslope < -4680 ) { 
	if( max < 10.58 ) { 
	if( max < 7.6 ) { 
	if( max >= 7.29 ) { 
		if( lslope < -12269 ) { return new Prediction("AT", 6.51, 0.49); }
	if( lslope >= -12269 ) { 
		if( rmin < -3.41 ) { return new Prediction("NAT", 3.26, 0.01); }
		if( rmin >= -3.41 ) { return new Prediction("AT", 1.09, 0.08); }
	}
	}
	if( max < 7.29 ) { 
		if( max >= 6.01 ) { return new Prediction("NAT", 20.62, 0.07); }
	if( max < 6.01 ) { 
		if( max >= 5.73 ) { return new Prediction("AT", 2.17, 0.16); }
		if( max < 5.73 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
	}
		if( max >= 7.6 ) { return new Prediction("NAT", 31.47, 0.11); }
	}
	if( max >= 10.58 ) { 
	if( lslope >= -18456.5 ) { 
		if( lmin >= -1.14 ) { return new Prediction("AT", 13.02, 0.98); }
	if( lmin < -1.14 ) { 
		if( max >= 12.26 ) { return new Prediction("AT", 1.09, 0.08); }
		if( max < 12.26 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
	}
	if( lslope < -18456.5 ) { 
		if( max >= 12.96 ) { return new Prediction("AT", 3.26, 0.24); }
	if( max < 12.96 ) { 
		if( rmin >= -0.58 ) { return new Prediction("NAT", 11.94, 0.04); }
	if( rmin < -0.58 ) { 
		if( lmin >= -0.96 ) { return new Prediction("NAT", 1.09, 0); }
		if( lmin < -0.96 ) { return new Prediction("AT", 1.09, 0.08); }
	}
	}
	}
	}
	}
	}
	if( lmin < -5.58 ) { 
	if( rmin < -3.75 ) { 
	if( rslope < -10417 ) { 
	if( lslope < -12874.5 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 1.09, 0); }
	if( lslope >= -35302 ) { 
	if( lmin >= -6.17 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 1.09, 0); }
		if( rmin >= -4.79 ) { return new Prediction("AT", 2.17, 0.16); }
	}
		if( lmin < -6.17 ) { return new Prediction("AT", 6.51, 0.49); }
	}
	}
		if( lslope >= -12874.5 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 10.85, 0.81); }
	}
		if( rmin >= -3.75 ) { return new Prediction("NAT", 5.43, 0.02); }
	}
	}
	if( max < 5.51 ) { 
		if( max < 0.29 ) { return new Prediction("NAT", 163.87, 0.58); }
	if( max >= 0.29 ) { 
	if( rmin < -6.91 ) { 
		if( rslope >= -9232 ) { return new Prediction("AT", 4.34, 0.33); }
	if( rslope < -9232 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 13.02, 0.05); }
	if( max >= 3.17 ) { 
	if( rslope >= -28963.5 ) { 
	if( lmin < -4.06 ) { 
		if( max >= 4.52 ) { return new Prediction("NAT", 1.09, 0); }
		if( max < 4.52 ) { return new Prediction("AT", 3.26, 0.24); }
	}
		if( lmin >= -4.06 ) { return new Prediction("NAT", 2.17, 0.01); }
	}
		if( rslope < -28963.5 ) { return new Prediction("NAT", 5.43, 0.02); }
	}
	}
	}
	if( rmin >= -6.91 ) { 
		if( max < 3.17 ) { return new Prediction("NAT", 109.61, 0.39); }
	if( max >= 3.17 ) { 
	if( lmin >= 0.32 ) { 
		if( lmin < 0.93 ) { return new Prediction("AT", 4.34, 0.33); }
		if( lmin >= 0.93 ) { return new Prediction("NAT", 11.94, 0.04); }
	}
	if( lmin < 0.32 ) { 
		if( max >= 3.27 ) { return new Prediction("NAT", 48.84, 0.17); }
	if( max < 3.27 ) { 
		if( rmin < 1.14 ) { return new Prediction("NAT", 1.09, 0); }
		if( rmin >= 1.14 ) { return new Prediction("AT", 1.09, 0.08); }
	}
	}
	}
	}
	}
	}
	}
		if( lmin >= 2.86 ) { return new Prediction("NAT", 133.48, 0.47); }
	}
	}
return null;
}
private Prediction runTree92() {
	if( max >= 14.81 ) { 
		if( lmin < 2.51 ) { return new Prediction("AT", 57.29, 3.16); }
		if( lmin >= 2.51 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( max < 14.81 ) { 
	if( rmin >= -4.48 ) { 
	if( lmin < -9.13 ) { 
		if( max >= 7.16 ) { return new Prediction("AT", 9.55, 0.53); }
		if( max < 7.16 ) { return new Prediction("NAT", 9.55, 0.02); }
	}
	if( lmin >= -9.13 ) { 
	if( max >= 3.5 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 81.69, 0.19); }
	if( lmin < 3.98 ) { 
	if( lmin >= -2.68 ) { 
	if( max >= 3.56 ) { 
	if( max >= 7.32 ) { 
	if( rmin < 6.74 ) { 
		if( rslope < -24514 ) { return new Prediction("NAT", 6.37, 0.01); }
	if( rslope >= -24514 ) { 
		if( lmin < -2.47 ) { return new Prediction("AT", 5.3, 0.29); }
	if( lmin >= -2.47 ) { 
	if( lmin >= 2.48 ) { 
		if( lslope >= -13587 ) { return new Prediction("AT", 7.43, 0.41); }
		if( lslope < -13587 ) { return new Prediction("NAT", 2.12, 0); }
	}
	if( lmin < 2.48 ) { 
	if( rslope < -4918.5 ) { 
		if( max < 7.63 ) { return new Prediction("AT", 5.3, 0.29); }
	if( max >= 7.63 ) { 
	if( rmin >= 1.1 ) { 
		if( rmin >= 4.13 ) { return new Prediction("AT", 1.06, 0.06); }
		if( rmin < 4.13 ) { return new Prediction("NAT", 7.43, 0.02); }
	}
	if( rmin < 1.1 ) { 
		if( lslope < -19694 ) { return new Prediction("NAT", 1.06, 0); }
		if( lslope >= -19694 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
	}
		if( rslope >= -4918.5 ) { return new Prediction("NAT", 5.3, 0.01); }
	}
	}
	}
	}
		if( rmin >= 6.74 ) { return new Prediction("NAT", 8.49, 0.02); }
	}
	if( max < 7.32 ) { 
	if( lslope < -25751 ) { 
	if( lslope >= -27095.5 ) { 
		if( max >= 3.85 ) { return new Prediction("AT", 3.18, 0.18); }
		if( max < 3.85 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( lslope < -27095.5 ) { 
	if( max >= 5.73 ) { 
		if( rmin < -0.78 ) { return new Prediction("NAT", 2.12, 0); }
	if( rmin >= -0.78 ) { 
		if( lmin >= -0.88 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -0.88 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( max < 5.73 ) { return new Prediction("NAT", 18.04, 0.04); }
	}
	}
		if( lslope >= -25751 ) { return new Prediction("NAT", 40.32, 0.09); }
	}
	}
		if( max < 3.56 ) { return new Prediction("AT", 5.3, 0.29); }
	}
	if( lmin < -2.68 ) { 
		if( max < 12.82 ) { return new Prediction("NAT", 76.39, 0.18); }
		if( max >= 12.82 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 192.03, 0.45); }
	}
	}
	if( rmin < -4.48 ) { 
	if( lslope >= -21010.5 ) { 
	if( max >= -0.77 ) { 
	if( lmin >= -5.42 ) { 
		if( rmin >= -4.68 ) { return new Prediction("AT", 3.18, 0.18); }
	if( rmin < -4.68 ) { 
		if( rslope < -20133 ) { return new Prediction("AT", 1.06, 0.06); }
	if( rslope >= -20133 ) { 
	if( rmin < -12.69 ) { 
		if( lmin >= -0.16 ) { return new Prediction("NAT", 5.3, 0.01); }
		if( lmin < -0.16 ) { return new Prediction("AT", 2.12, 0.12); }
	}
	if( rmin >= -12.69 ) { 
	if( lmin < -4.58 ) { 
		if( lmin >= -4.81 ) { return new Prediction("AT", 1.06, 0.06); }
		if( lmin < -4.81 ) { return new Prediction("NAT", 3.18, 0.01); }
	}
		if( lmin >= -4.58 ) { return new Prediction("NAT", 28.65, 0.07); }
	}
	}
	}
	}
	if( lmin < -5.42 ) { 
	if( lmin < -12.83 ) { 
	if( rmin >= -18.22 ) { 
		if( lmin >= -13.32 ) { return new Prediction("NAT", 8.49, 0.02); }
	if( lmin < -13.32 ) { 
		if( rmin >= -10.36 ) { return new Prediction("AT", 6.37, 0.35); }
	if( rmin < -10.36 ) { 
		if( lmin >= -15.35 ) { return new Prediction("NAT", 7.43, 0.02); }
	if( lmin < -15.35 ) { 
	if( rslope < -10135.5 ) { 
	if( max < 5.84 ) { 
		if( lslope >= -10213 ) { return new Prediction("AT", 2.12, 0.12); }
		if( lslope < -10213 ) { return new Prediction("NAT", 3.18, 0.01); }
	}
		if( max >= 5.84 ) { return new Prediction("AT", 4.24, 0.23); }
	}
		if( rslope >= -10135.5 ) { return new Prediction("NAT", 5.3, 0.01); }
	}
	}
	}
	}
		if( rmin < -18.22 ) { return new Prediction("AT", 7.43, 0.41); }
	}
	if( lmin >= -12.83 ) { 
		if( rslope >= -10648.5 ) { return new Prediction("AT", 46.68, 2.57); }
	if( rslope < -10648.5 ) { 
	if( lslope < -15203.5 ) { 
		if( max < 0.4 ) { return new Prediction("NAT", 1.06, 0); }
	if( max >= 0.4 ) { 
	if( max >= 9.04 ) { 
		if( lmin >= -11.34 ) { return new Prediction("AT", 11.67, 0.64); }
		if( lmin < -11.34 ) { return new Prediction("NAT", 3.18, 0.01); }
	}
		if( max < 9.04 ) { return new Prediction("AT", 19.1, 1.05); }
	}
	}
	if( lslope >= -15203.5 ) { 
	if( max >= 6.94 ) { 
		if( max < 7.69 ) { return new Prediction("AT", 2.12, 0.12); }
		if( max >= 7.69 ) { return new Prediction("NAT", 1.06, 0); }
	}
	if( max < 6.94 ) { 
		if( rslope < -11891 ) { return new Prediction("NAT", 8.49, 0.02); }
	if( rslope >= -11891 ) { 
		if( lslope >= -11091 ) { return new Prediction("NAT", 1.06, 0); }
		if( lslope < -11091 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
	}
	}
	}
	if( max < -0.77 ) { 
		if( lslope >= -5794.5 ) { return new Prediction("NAT", 21.22, 0.05); }
	if( lslope < -5794.5 ) { 
		if( lmin >= -14.95 ) { return new Prediction("NAT", 15.91, 0.04); }
		if( lmin < -14.95 ) { return new Prediction("AT", 3.18, 0.18); }
	}
	}
	}
	if( lslope < -21010.5 ) { 
		if( max < 5.41 ) { return new Prediction("NAT", 63.66, 0.15); }
	if( max >= 5.41 ) { 
		if( max >= 5.79 ) { return new Prediction("NAT", 9.55, 0.02); }
		if( max < 5.79 ) { return new Prediction("AT", 1.06, 0.06); }
	}
	}
	}
	}
return null;
}
private Prediction runTree93() {
	if( max >= 14.81 ) { 
	if( rmin < 0.39 ) { 
	if( lmin < -14.84 ) { 
		if( rslope >= -15449 ) { return new Prediction("AT", 6.53, 0.52); }
		if( rslope < -15449 ) { return new Prediction("NAT", 2.18, 0); }
	}
		if( lmin >= -14.84 ) { return new Prediction("AT", 42.43, 3.38); }
	}
	if( rmin >= 0.39 ) { 
		if( lmin >= -17.55 ) { return new Prediction("NAT", 3.26, 0); }
		if( lmin < -17.55 ) { return new Prediction("AT", 1.09, 0.09); }
	}
	}
	if( max < 14.81 ) { 
	if( rmin < -5.59 ) { 
	if( max >= 5.35 ) { 
	if( lmin < -4.91 ) { 
	if( lmin >= -21.24 ) { 
	if( rslope < -10232.5 ) { 
	if( lslope >= -14173 ) { 
		if( lmin < -12.65 ) { return new Prediction("AT", 1.09, 0.09); }
		if( lmin >= -12.65 ) { return new Prediction("NAT", 3.26, 0); }
	}
	if( lslope < -14173 ) { 
	if( max < 13.24 ) { 
		if( lslope < -35302 ) { return new Prediction("NAT", 1.09, 0); }
	if( lslope >= -35302 ) { 
		if( lmin >= -11.34 ) { return new Prediction("AT", 19.58, 1.56); }
	if( lmin < -11.34 ) { 
		if( lmin >= -12 ) { return new Prediction("NAT", 1.09, 0); }
		if( lmin < -12 ) { return new Prediction("AT", 2.18, 0.17); }
	}
	}
	}
		if( max >= 13.24 ) { return new Prediction("NAT", 1.09, 0); }
	}
	}
		if( rslope >= -10232.5 ) { return new Prediction("AT", 36.99, 2.95); }
	}
		if( lmin < -21.24 ) { return new Prediction("NAT", 1.09, 0); }
	}
	if( lmin >= -4.91 ) { 
		if( rmin < -10.04 ) { return new Prediction("AT", 2.18, 0.17); }
		if( rmin >= -10.04 ) { return new Prediction("NAT", 11.97, 0.01); }
	}
	}
	if( max < 5.35 ) { 
	if( lmin >= -9.94 ) { 
	if( max >= 0.26 ) { 
		if( lslope < -23116 ) { return new Prediction("NAT", 18.5, 0.02); }
	if( lslope >= -23116 ) { 
		if( rmin < -9.37 ) { return new Prediction("NAT", 13.06, 0.02); }
	if( rmin >= -9.37 ) { 
		if( rslope < -18790.5 ) { return new Prediction("AT", 6.53, 0.52); }
	if( rslope >= -18790.5 ) { 
		if( lslope < -11678 ) { return new Prediction("NAT", 8.7, 0.01); }
	if( lslope >= -11678 ) { 
		if( rslope >= -4982.5 ) { return new Prediction("NAT", 2.18, 0); }
		if( rslope < -4982.5 ) { return new Prediction("AT", 4.35, 0.35); }
	}
	}
	}
	}
	}
		if( max < 0.26 ) { return new Prediction("NAT", 57.66, 0.07); }
	}
	if( lmin < -9.94 ) { 
	if( rslope >= -10849.5 ) { 
		if( rslope < -6163.5 ) { return new Prediction("AT", 29.38, 2.34); }
		if( rslope >= -6163.5 ) { return new Prediction("NAT", 5.44, 0.01); }
	}
	if( rslope < -10849.5 ) { 
	if( lmin >= -12.63 ) { 
	if( lmin < -10.57 ) { 
		if( rmin >= -11.16 ) { return new Prediction("AT", 2.18, 0.17); }
		if( rmin < -11.16 ) { return new Prediction("NAT", 1.09, 0); }
	}
		if( lmin >= -10.57 ) { return new Prediction("NAT", 3.26, 0); }
	}
		if( lmin < -12.63 ) { return new Prediction("NAT", 13.06, 0.02); }
	}
	}
	}
	}
	if( rmin >= -5.59 ) { 
		if( rslope < -33045 ) { return new Prediction("NAT", 99.01, 0.12); }
	if( rslope >= -33045 ) { 
	if( max < 10.58 ) { 
	if( max >= 3.49 ) { 
		if( lmin >= 3.7 ) { return new Prediction("NAT", 84.86, 0.1); }
	if( lmin < 3.7 ) { 
	if( rslope >= -32938 ) { 
	if( rmin < 3 ) { 
		if( rmin >= 2.7 ) { return new Prediction("AT", 5.44, 0.43); }
	if( rmin < 2.7 ) { 
	if( rslope >= -28973 ) { 
	if( lmin >= -11.2 ) { 
	if( lmin >= -0.25 ) { 
		if( lmin >= 0.91 ) { return new Prediction("NAT", 16.32, 0.02); }
	if( lmin < 0.91 ) { 
	if( lslope >= -21314.5 ) { 
		if( lslope < -12527 ) { return new Prediction("NAT", 4.35, 0.01); }
	if( lslope >= -12527 ) { 
		if( rmin >= 2.17 ) { return new Prediction("AT", 3.26, 0.26); }
	if( rmin < 2.17 ) { 
		if( lmin < -0.02 ) { return new Prediction("AT", 1.09, 0.09); }
		if( lmin >= -0.02 ) { return new Prediction("NAT", 5.44, 0.01); }
	}
	}
	}
		if( lslope < -21314.5 ) { return new Prediction("AT", 3.26, 0.26); }
	}
	}
		if( lmin < -0.25 ) { return new Prediction("NAT", 46.78, 0.05); }
	}
		if( lmin < -11.2 ) { return new Prediction("AT", 3.26, 0.26); }
	}
	if( rslope < -28973 ) { 
		if( lslope >= -30377.5 ) { return new Prediction("AT", 4.35, 0.35); }
		if( lslope < -30377.5 ) { return new Prediction("NAT", 3.26, 0); }
	}
	}
	}
	if( rmin >= 3 ) { 
		if( lmin >= -15.09 ) { return new Prediction("NAT", 33.73, 0.04); }
	if( lmin < -15.09 ) { 
		if( lmin < -19.52 ) { return new Prediction("NAT", 1.09, 0); }
		if( lmin >= -19.52 ) { return new Prediction("AT", 1.09, 0.09); }
	}
	}
	}
		if( rslope < -32938 ) { return new Prediction("AT", 3.26, 0.26); }
	}
	}
	if( max < 3.49 ) { 
	if( lmin < -11.72 ) { 
	if( lmin >= -17.85 ) { 
		if( max < 2.4 ) { return new Prediction("AT", 1.09, 0.09); }
		if( max >= 2.4 ) { return new Prediction("NAT", 3.26, 0); }
	}
		if( lmin < -17.85 ) { return new Prediction("AT", 1.09, 0.09); }
	}
		if( lmin >= -11.72 ) { return new Prediction("NAT", 174.08, 0.2); }
	}
	}
	if( max >= 10.58 ) { 
		if( lslope >= -6610.5 ) { return new Prediction("NAT", 15.23, 0.02); }
	if( lslope < -6610.5 ) { 
	if( rslope >= -21351.5 ) { 
	if( lmin < 5.12 ) { 
	if( max < 11.47 ) { 
		if( max >= 11.18 ) { return new Prediction("NAT", 2.18, 0); }
		if( max < 11.18 ) { return new Prediction("AT", 9.79, 0.78); }
	}
		if( max >= 11.47 ) { return new Prediction("AT", 11.97, 0.95); }
	}
		if( lmin >= 5.12 ) { return new Prediction("NAT", 2.18, 0); }
	}
		if( rslope < -21351.5 ) { return new Prediction("NAT", 9.79, 0.01); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree94() {
	if( lmin >= -9.61 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 113.59, 0); }
	if( lmin < 3.98 ) { 
	if( max < 5.52 ) { 
	if( max >= 1.68 ) { 
	if( rmin < -5.58 ) { 
	if( lmin >= -8.08 ) { 
	if( max >= 2.38 ) { 
		if( lmin >= -5.23 ) { return new Prediction("NAT", 9.64, 0); }
	if( lmin < -5.23 ) { 
		if( lmin < -5.76 ) { return new Prediction("NAT", 4.29, 0); }
		if( lmin >= -5.76 ) { return new Prediction("AT", 5.36, 0.36); }
	}
	}
		if( max < 2.38 ) { return new Prediction("AT", 4.29, 0.29); }
	}
		if( lmin < -8.08 ) { return new Prediction("NAT", 11.79, 0); }
	}
	if( rmin >= -5.58 ) { 
	if( lslope < -25941 ) { 
	if( lmin >= 0.24 ) { 
		if( max >= 4.51 ) { return new Prediction("NAT", 8.57, 0); }
	if( max < 4.51 ) { 
	if( max >= 3.5 ) { 
		if( lmin < 1.21 ) { return new Prediction("AT", 8.57, 0.57); }
		if( lmin >= 1.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( max < 3.5 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
		if( lmin < 0.24 ) { return new Prediction("NAT", 26.79, 0); }
	}
		if( lslope >= -25941 ) { return new Prediction("NAT", 78.23, 0); }
	}
	}
	if( max < 1.68 ) { 
		if( rmin >= -8.76 ) { return new Prediction("NAT", 196.1, 0); }
	if( rmin < -8.76 ) { 
		if( rmin < -9.65 ) { return new Prediction("NAT", 18.22, 0); }
		if( rmin >= -9.65 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	}
	}
	if( max >= 5.52 ) { 
		if( lslope < -36711.5 ) { return new Prediction("NAT", 23.58, 0); }
	if( lslope >= -36711.5 ) { 
	if( rslope < -4951.5 ) { 
	if( max < 12.19 ) { 
	if( lmin < -1.22 ) { 
	if( lmin >= -5.36 ) { 
		if( max < 11.09 ) { return new Prediction("NAT", 27.86, 0); }
	if( max >= 11.09 ) { 
		if( lmin < -2.74 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -2.74 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( lmin < -5.36 ) { 
		if( max >= 9.31 ) { return new Prediction("NAT", 7.5, 0); }
	if( max < 9.31 ) { 
	if( rslope < -10417 ) { 
	if( lmin >= -7.45 ) { 
		if( rmin < -4.79 ) { return new Prediction("NAT", 5.36, 0); }
	if( rmin >= -4.79 ) { 
		if( lmin >= -6.45 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -6.45 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( lmin < -7.45 ) { return new Prediction("AT", 3.21, 0.21); }
	}
		if( rslope >= -10417 ) { return new Prediction("AT", 8.57, 0.57); }
	}
	}
	}
	if( lmin >= -1.22 ) { 
	if( rmin < 1.78 ) { 
	if( lmin < 0.72 ) { 
		if( lmin >= 0.2 ) { return new Prediction("AT", 10.72, 0.72); }
	if( lmin < 0.2 ) { 
		if( max < 8.15 ) { return new Prediction("AT", 3.21, 0.21); }
		if( max >= 8.15 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	if( lmin >= 0.72 ) { 
		if( rmin < -0.06 ) { return new Prediction("NAT", 10.72, 0); }
	if( rmin >= -0.06 ) { 
		if( max >= 7.22 ) { return new Prediction("NAT", 2.14, 0); }
		if( max < 7.22 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	if( rmin >= 1.78 ) { 
		if( max >= 6.82 ) { return new Prediction("AT", 24.65, 1.65); }
		if( max < 6.82 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
	}
	if( max >= 12.19 ) { 
		if( rmin < -15.6 ) { return new Prediction("NAT", 1.07, 0); }
	if( rmin >= -15.6 ) { 
		if( lmin >= 0.32 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin < 0.32 ) { return new Prediction("AT", 26.79, 1.79); }
	}
	}
	}
		if( rslope >= -4951.5 ) { return new Prediction("NAT", 12.86, 0); }
	}
	}
	}
	}
	if( lmin < -9.61 ) { 
	if( max < 11.14 ) { 
	if( rslope >= -19160 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 12.86, 0); }
	if( lslope < -4149.5 ) { 
		if( rslope >= -10526.5 ) { return new Prediction("AT", 39.65, 2.65); }
	if( rslope < -10526.5 ) { 
	if( lslope >= -14117 ) { 
		if( lslope < -12420 ) { return new Prediction("NAT", 16.07, 0); }
	if( lslope >= -12420 ) { 
		if( max >= 7.38 ) { return new Prediction("AT", 2.14, 0.14); }
	if( max < 7.38 ) { 
	if( rslope >= -10849.5 ) { 
	if( lmin >= -16.92 ) { 
		if( lmin >= -11.92 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -11.92 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lmin < -16.92 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rslope < -10849.5 ) { return new Prediction("NAT", 3.21, 0); }
	}
	}
	}
	if( lslope < -14117 ) { 
	if( rmin < -11.69 ) { 
	if( rmin >= -14.67 ) { 
		if( lmin >= -11.34 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -11.34 ) { return new Prediction("NAT", 7.5, 0); }
	}
		if( rmin < -14.67 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	if( rmin >= -11.69 ) { 
		if( lmin < -19.52 ) { return new Prediction("NAT", 1.07, 0); }
	if( lmin >= -19.52 ) { 
	if( rmin >= -7.33 ) { 
		if( rmin >= -6.61 ) { return new Prediction("AT", 9.64, 0.64); }
		if( rmin < -6.61 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( rmin < -7.33 ) { return new Prediction("AT", 11.79, 0.79); }
	}
	}
	}
	}
	}
	}
		if( rslope < -19160 ) { return new Prediction("NAT", 16.07, 0); }
	}
	if( max >= 11.14 ) { 
	if( lslope < -18282.5 ) { 
		if( lmin < -13.48 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -13.48 ) { return new Prediction("AT", 3.21, 0.21); }
	}
		if( lslope >= -18282.5 ) { return new Prediction("AT", 50.37, 3.37); }
	}
	}
return null;
}
private Prediction runTree95() {
	if( rmin < -7.36 ) { 
	if( lmin >= -8.17 ) { 
	if( max < 6.75 ) { 
	if( max >= 1.96 ) { 
		if( lslope >= -19090 ) { return new Prediction("NAT", 13.88, 0.02); }
	if( lslope < -19090 ) { 
		if( lmin >= -6.09 ) { return new Prediction("AT", 2.14, 0.13); }
		if( lmin < -6.09 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
		if( max < 1.96 ) { return new Prediction("NAT", 21.35, 0.03); }
	}
	if( max >= 6.75 ) { 
		if( lmin < 1.53 ) { return new Prediction("AT", 4.27, 0.27); }
		if( lmin >= 1.53 ) { return new Prediction("NAT", 4.27, 0.01); }
	}
	}
	if( lmin < -8.17 ) { 
	if( max < 3.64 ) { 
	if( rslope >= -10528 ) { 
		if( max < -5.53 ) { return new Prediction("NAT", 8.54, 0.01); }
	if( max >= -5.53 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 19.22, 1.19); }
		if( lslope >= -3296 ) { return new Prediction("NAT", 2.14, 0); }
	}
	}
		if( rslope < -10528 ) { return new Prediction("NAT", 28.82, 0.03); }
	}
	if( max >= 3.64 ) { 
		if( lslope < -34672.5 ) { return new Prediction("NAT", 2.14, 0); }
	if( lslope >= -34672.5 ) { 
	if( max < 11.62 ) { 
		if( max >= 10.92 ) { return new Prediction("NAT", 1.07, 0); }
	if( max < 10.92 ) { 
	if( rslope < -11477 ) { 
	if( lslope < -14749.5 ) { 
		if( rslope >= -17033.5 ) { return new Prediction("AT", 10.68, 0.66); }
	if( rslope < -17033.5 ) { 
		if( max >= 8.26 ) { return new Prediction("NAT", 1.07, 0); }
		if( max < 8.26 ) { return new Prediction("AT", 4.27, 0.27); }
	}
	}
		if( lslope >= -14749.5 ) { return new Prediction("NAT", 2.14, 0); }
	}
		if( rslope >= -11477 ) { return new Prediction("AT", 21.35, 1.33); }
	}
	}
		if( max >= 11.62 ) { return new Prediction("AT", 37.37, 2.32); }
	}
	}
	}
	}
	if( rmin >= -7.36 ) { 
	if( max < 13.14 ) { 
		if( lslope >= -5395 ) { return new Prediction("NAT", 108.89, 0.13); }
	if( lslope < -5395 ) { 
	if( lmin < -7.72 ) { 
	if( rslope < -19080 ) { 
		if( rmin >= -4.92 ) { return new Prediction("NAT", 13.88, 0.02); }
	if( rmin < -4.92 ) { 
		if( max >= 1.7 ) { return new Prediction("AT", 4.27, 0.27); }
		if( max < 1.7 ) { return new Prediction("NAT", 3.2, 0); }
	}
	}
	if( rslope >= -19080 ) { 
	if( max < 7.92 ) { 
	if( max < 3.32 ) { 
		if( lmin >= -8.12 ) { return new Prediction("AT", 3.2, 0.2); }
	if( lmin < -8.12 ) { 
		if( max >= 1.06 ) { return new Prediction("NAT", 2.14, 0); }
		if( max < 1.06 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
		if( max >= 3.32 ) { return new Prediction("NAT", 6.41, 0.01); }
	}
	if( max >= 7.92 ) { 
		if( rmin >= -6.84 ) { return new Prediction("AT", 11.74, 0.73); }
	if( rmin < -6.84 ) { 
		if( rmin >= -7.06 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < -7.06 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
	}
	}
	if( lmin >= -7.72 ) { 
	if( max >= 1.68 ) { 
	if( rslope >= -30708 ) { 
		if( rmin < -6.91 ) { return new Prediction("AT", 5.34, 0.33); }
	if( rmin >= -6.91 ) { 
		if( rmin >= 5.43 ) { return new Prediction("NAT", 38.43, 0.05); }
	if( rmin < 5.43 ) { 
	if( max < 10.47 ) { 
	if( rmin >= -0.09 ) { 
	if( rslope >= -13321 ) { 
		if( lmin < 2.53 ) { return new Prediction("NAT", 25.62, 0.03); }
		if( lmin >= 2.53 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rslope < -13321 ) { 
	if( rmin < 3.4 ) { 
	if( lslope < -25941 ) { 
		if( lmin < 1.43 ) { return new Prediction("AT", 8.54, 0.53); }
		if( lmin >= 1.43 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope >= -25941 ) { 
		if( lslope < -20781 ) { return new Prediction("NAT", 11.74, 0.01); }
	if( lslope >= -20781 ) { 
	if( lmin >= 0.05 ) { 
		if( max >= 7.38 ) { return new Prediction("NAT", 2.14, 0); }
		if( max < 7.38 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin < 0.05 ) { return new Prediction("AT", 6.41, 0.4); }
	}
	}
	}
		if( rmin >= 3.4 ) { return new Prediction("NAT", 6.41, 0.01); }
	}
	}
	if( rmin < -0.09 ) { 
		if( max < 7.57 ) { return new Prediction("NAT", 56.58, 0.07); }
	if( max >= 7.57 ) { 
		if( max >= 7.64 ) { return new Prediction("NAT", 5.34, 0.01); }
		if( max < 7.64 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
	}
	if( max >= 10.47 ) { 
		if( max < 10.87 ) { return new Prediction("AT", 4.27, 0.27); }
	if( max >= 10.87 ) { 
		if( rmin < 1.35 ) { return new Prediction("AT", 3.2, 0.2); }
	if( rmin >= 1.35 ) { 
		if( rmin < 3.48 ) { return new Prediction("NAT", 3.2, 0); }
		if( rmin >= 3.48 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	}
	}
	}
	}
		if( rslope < -30708 ) { return new Prediction("NAT", 64.06, 0.08); }
	}
		if( max < 1.68 ) { return new Prediction("NAT", 200.71, 0.24); }
	}
	}
	}
	if( max >= 13.14 ) { 
	if( lmin < -0.73 ) { 
	if( rslope < -19599 ) { 
	if( lslope >= -28257 ) { 
		if( lmin < -7.28 ) { return new Prediction("NAT", 3.2, 0); }
		if( lmin >= -7.28 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lslope < -28257 ) { return new Prediction("AT", 6.41, 0.4); }
	}
		if( rslope >= -19599 ) { return new Prediction("AT", 40.57, 2.52); }
	}
		if( lmin >= -0.73 ) { return new Prediction("NAT", 7.47, 0.01); }
	}
	}
return null;
}
private Prediction runTree96() {
	if( max < 11.58 ) { 
	if( lmin < -7.72 ) { 
	if( max >= -0.16 ) { 
	if( rslope >= -11119 ) { 
		if( max < 8.49 ) { return new Prediction("AT", 42.23, 2.23); }
	if( max >= 8.49 ) { 
		if( lmin >= -15.84 ) { return new Prediction("AT", 2.11, 0.11); }
		if( lmin < -15.84 ) { return new Prediction("NAT", 2.11, 0); }
	}
	}
	if( rslope < -11119 ) { 
		if( rslope < -35355.5 ) { return new Prediction("NAT", 11.61, 0); }
	if( rslope >= -35355.5 ) { 
	if( lslope < -14749.5 ) { 
		if( lslope >= -15731.5 ) { return new Prediction("AT", 12.67, 0.67); }
	if( lslope < -15731.5 ) { 
	if( rslope < -18123.5 ) { 
	if( rmin < -5.44 ) { 
		if( max >= 2.3 ) { return new Prediction("AT", 7.39, 0.39); }
		if( max < 2.3 ) { return new Prediction("NAT", 5.28, 0); }
	}
		if( rmin >= -5.44 ) { return new Prediction("NAT", 10.56, 0); }
	}
	if( rslope >= -18123.5 ) { 
		if( lslope < -17290.5 ) { return new Prediction("AT", 7.39, 0.39); }
	if( lslope >= -17290.5 ) { 
		if( max >= 9.6 ) { return new Prediction("AT", 2.11, 0.11); }
		if( max < 9.6 ) { return new Prediction("NAT", 5.28, 0); }
	}
	}
	}
	}
	if( lslope >= -14749.5 ) { 
		if( max >= 9.05 ) { return new Prediction("AT", 1.06, 0.06); }
		if( max < 9.05 ) { return new Prediction("NAT", 14.78, 0); }
	}
	}
	}
	}
	if( max < -0.16 ) { 
		if( lmin >= -14.14 ) { return new Prediction("NAT", 34.84, 0); }
		if( lmin < -14.14 ) { return new Prediction("AT", 3.17, 0.17); }
	}
	}
	if( lmin >= -7.72 ) { 
	if( lslope >= -30196 ) { 
	if( max >= 1.61 ) { 
		if( rslope >= -5426 ) { return new Prediction("NAT", 83.4, 0); }
	if( rslope < -5426 ) { 
		if( rmin >= 6.73 ) { return new Prediction("NAT", 29.56, 0); }
	if( rmin < 6.73 ) { 
		if( lmin >= 3.98 ) { return new Prediction("NAT", 21.11, 0); }
	if( lmin < 3.98 ) { 
	if( lmin >= -1.11 ) { 
	if( lslope < -10715.5 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 13.72, 0); }
	if( lmin < 1.09 ) { 
	if( max >= 3.27 ) { 
	if( lslope >= -21899 ) { 
	if( max >= 7.16 ) { 
		if( max >= 7.59 ) { return new Prediction("NAT", 5.28, 0); }
		if( max < 7.59 ) { return new Prediction("AT", 5.28, 0.28); }
	}
		if( max < 7.16 ) { return new Prediction("NAT", 8.45, 0); }
	}
	if( lslope < -21899 ) { 
		if( lmin >= 0.06 ) { return new Prediction("AT", 8.45, 0.45); }
		if( lmin < 0.06 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
		if( max < 3.27 ) { return new Prediction("NAT", 9.5, 0); }
	}
	}
	if( lslope >= -10715.5 ) { 
		if( rmin >= 2.3 ) { return new Prediction("AT", 8.45, 0.45); }
	if( rmin < 2.3 ) { 
		if( lmin < -0.02 ) { return new Prediction("AT", 3.17, 0.17); }
		if( lmin >= -0.02 ) { return new Prediction("NAT", 6.33, 0); }
	}
	}
	}
	if( lmin < -1.11 ) { 
		if( lmin >= -4.28 ) { return new Prediction("NAT", 65.45, 0); }
	if( lmin < -4.28 ) { 
		if( rmin >= -4.93 ) { return new Prediction("NAT", 11.61, 0); }
	if( rmin < -4.93 ) { 
	if( lmin < -5.76 ) { 
		if( rmin >= -6.89 ) { return new Prediction("AT", 4.22, 0.22); }
		if( rmin < -6.89 ) { return new Prediction("NAT", 3.17, 0); }
	}
		if( lmin >= -5.76 ) { return new Prediction("AT", 6.33, 0.33); }
	}
	}
	}
	}
	}
	}
	}
		if( max < 1.61 ) { return new Prediction("NAT", 150.96, 0); }
	}
		if( lslope < -30196 ) { return new Prediction("NAT", 125.63, 0); }
	}
	}
	if( max >= 11.58 ) { 
	if( lmin < -0.79 ) { 
		if( rslope < -43522.5 ) { return new Prediction("NAT", 3.17, 0); }
	if( rslope >= -43522.5 ) { 
	if( rmin < 8.75 ) { 
	if( lslope < -19947.5 ) { 
	if( rmin < -4.17 ) { 
		if( lslope >= -28257 ) { return new Prediction("NAT", 2.11, 0); }
		if( lslope < -28257 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( rmin >= -4.17 ) { return new Prediction("AT", 11.61, 0.61); }
	}
		if( lslope >= -19947.5 ) { return new Prediction("AT", 68.62, 3.62); }
	}
	if( rmin >= 8.75 ) { 
	if( lmin >= -13.47 ) { 
		if( max < 12.67 ) { return new Prediction("NAT", 1.06, 0); }
		if( max >= 12.67 ) { return new Prediction("AT", 2.11, 0.11); }
	}
		if( lmin < -13.47 ) { return new Prediction("NAT", 1.06, 0); }
	}
	}
	}
	if( lmin >= -0.79 ) { 
		if( max < 11.62 ) { return new Prediction("AT", 4.22, 0.22); }
		if( max >= 11.62 ) { return new Prediction("NAT", 23.23, 0); }
	}
	}
return null;
}
private Prediction runTree97() {
	if( max >= 15.55 ) { 
	if( rmin >= 12.2 ) { 
		if( lmin < -8.47 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -8.47 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( rmin < 12.2 ) { return new Prediction("AT", 58.79, 3.65); }
	}
	if( max < 15.55 ) { 
	if( rslope >= -21351.5 ) { 
	if( rmin < -6.94 ) { 
	if( max < 5.27 ) { 
	if( rslope < -11860 ) { 
		if( rslope >= -17529.5 ) { return new Prediction("NAT", 24.59, 0.06); }
	if( rslope < -17529.5 ) { 
		if( rslope >= -18048 ) { return new Prediction("AT", 2.14, 0.13); }
	if( rslope < -18048 ) { 
	if( max >= 2.55 ) { 
		if( lmin >= -0.08 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < -0.08 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( max < 2.55 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
	}
	}
	if( rslope >= -11860 ) { 
		if( lslope >= -4149.5 ) { return new Prediction("NAT", 13.9, 0.03); }
	if( lslope < -4149.5 ) { 
	if( rslope >= -11065 ) { 
		if( max < -6.01 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( max >= -6.01 ) { return new Prediction("AT", 27.79, 1.73); }
	}
	if( rslope < -11065 ) { 
		if( lslope >= -11483 ) { return new Prediction("NAT", 3.21, 0.01); }
		if( lslope < -11483 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
	}
	}
	if( max >= 5.27 ) { 
	if( rmin < -12.48 ) { 
		if( lmin >= -6.24 ) { return new Prediction("AT", 3.21, 0.2); }
		if( lmin < -6.24 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
	if( rmin >= -12.48 ) { 
		if( lmin < -4.91 ) { return new Prediction("AT", 42.76, 2.66); }
		if( lmin >= -4.91 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
	}
	if( rmin >= -6.94 ) { 
	if( max < 5.52 ) { 
	if( rmin < -5.61 ) { 
		if( lmin < -7.55 ) { return new Prediction("AT", 4.28, 0.27); }
		if( lmin >= -7.55 ) { return new Prediction("NAT", 16.03, 0.04); }
	}
	if( rmin >= -5.61 ) { 
		if( lmin >= -17.85 ) { return new Prediction("NAT", 151.79, 0.36); }
		if( lmin < -17.85 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( max >= 5.52 ) { 
	if( rslope < -5404.5 ) { 
		if( lmin >= 3.99 ) { return new Prediction("NAT", 34.21, 0.08); }
	if( lmin < 3.99 ) { 
		if( max >= 11.55 ) { return new Prediction("AT", 14.96, 0.93); }
	if( max < 11.55 ) { 
	if( lmin >= -11.99 ) { 
	if( lslope < -10715.5 ) { 
		if( lmin < -1.05 ) { return new Prediction("NAT", 19.24, 0.05); }
	if( lmin >= -1.05 ) { 
	if( max >= 7.16 ) { 
		if( lslope < -15022 ) { return new Prediction("NAT", 4.28, 0.01); }
	if( lslope >= -15022 ) { 
		if( rmin < 1.78 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( rmin >= 1.78 ) { return new Prediction("AT", 4.28, 0.27); }
	}
	}
		if( max < 7.16 ) { return new Prediction("NAT", 8.55, 0.02); }
	}
	}
	if( lslope >= -10715.5 ) { 
		if( rmin >= 2.52 ) { return new Prediction("AT", 12.83, 0.8); }
	if( rmin < 2.52 ) { 
	if( max >= 5.91 ) { 
		if( lmin >= -5.54 ) { return new Prediction("NAT", 12.83, 0.03); }
	if( lmin < -5.54 ) { 
		if( lmin >= -6.45 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin < -6.45 ) { return new Prediction("NAT", 3.21, 0.01); }
	}
	}
		if( max < 5.91 ) { return new Prediction("AT", 3.21, 0.2); }
	}
	}
	}
	if( lmin < -11.99 ) { 
		if( lmin < -20.71 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin >= -20.71 ) { return new Prediction("AT", 11.76, 0.73); }
	}
	}
	}
	}
	if( rslope >= -5404.5 ) { 
	if( rmin < -1.92 ) { 
		if( lmin >= -8.61 ) { return new Prediction("NAT", 8.55, 0.02); }
		if( lmin < -8.61 ) { return new Prediction("AT", 2.14, 0.13); }
	}
		if( rmin >= -1.92 ) { return new Prediction("NAT", 64.14, 0.15); }
	}
	}
	}
	}
	if( rslope < -21351.5 ) { 
	if( max >= 3.5 ) { 
	if( rmin >= 0.5 ) { 
		if( max >= 4.51 ) { return new Prediction("NAT", 51.31, 0.12); }
	if( max < 4.51 ) { 
		if( lslope >= -26568 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lslope < -26568 ) { return new Prediction("NAT", 8.55, 0.02); }
	}
	}
	if( rmin < 0.5 ) { 
		if( lslope < -34743.5 ) { return new Prediction("NAT", 19.24, 0.05); }
	if( lslope >= -34743.5 ) { 
	if( max >= 4.38 ) { 
		if( lslope < -33860 ) { return new Prediction("AT", 3.21, 0.2); }
	if( lslope >= -33860 ) { 
	if( lslope >= -22966.5 ) { 
		if( lmin >= -3.13 ) { return new Prediction("AT", 2.14, 0.13); }
		if( lmin < -3.13 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope < -22966.5 ) { 
		if( lslope >= -28111.5 ) { return new Prediction("NAT", 12.83, 0.03); }
	if( lslope < -28111.5 ) { 
	if( lmin < 1.73 ) { 
		if( lmin >= -1.87 ) { return new Prediction("AT", 2.14, 0.13); }
	if( lmin < -1.87 ) { 
		if( lmin < -4.94 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -4.94 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	}
		if( lmin >= 1.73 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
	}
	}
	}
		if( max < 4.38 ) { return new Prediction("AT", 4.28, 0.27); }
	}
	}
	}
		if( max < 3.5 ) { return new Prediction("NAT", 159.27, 0.37); }
	}
	}
return null;
}
private Prediction runTree98() {
	if( lmin < -7.72 ) { 
	if( lslope < -16475 ) { 
		if( lmin >= -7.8 ) { return new Prediction("AT", 5.35, 0.35); }
	if( lmin < -7.8 ) { 
	if( rslope < -19882.5 ) { 
		if( max < 17.33 ) { return new Prediction("NAT", 46.02, 0); }
		if( max >= 17.33 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	if( rslope >= -19882.5 ) { 
	if( lmin >= -12.26 ) { 
		if( lmin < -11.82 ) { return new Prediction("AT", 4.28, 0.28); }
	if( lmin >= -11.82 ) { 
		if( lslope < -18444 ) { return new Prediction("AT", 3.21, 0.21); }
		if( lslope >= -18444 ) { return new Prediction("NAT", 9.63, 0); }
	}
	}
		if( lmin < -12.26 ) { return new Prediction("NAT", 6.42, 0); }
	}
	}
	}
	if( lslope >= -16475 ) { 
	if( lslope < -10474.5 ) { 
		if( max >= 8.05 ) { return new Prediction("AT", 32.11, 2.11); }
	if( max < 8.05 ) { 
		if( lmin < -11.4 ) { return new Prediction("NAT", 14.98, 0); }
	if( lmin >= -11.4 ) { 
		if( lmin >= -10.7 ) { return new Prediction("NAT", 10.7, 0); }
		if( lmin < -10.7 ) { return new Prediction("AT", 6.42, 0.42); }
	}
	}
	}
	if( lslope >= -10474.5 ) { 
	if( max >= -5.41 ) { 
	if( lmin >= -22.76 ) { 
		if( lslope < -2471.99 ) { return new Prediction("AT", 79.2, 5.2); }
	if( lslope >= -2471.99 ) { 
		if( lmin < -13.57 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin >= -13.57 ) { return new Prediction("AT", 5.35, 0.35); }
	}
	}
		if( lmin < -22.76 ) { return new Prediction("NAT", 3.21, 0); }
	}
		if( max < -5.41 ) { return new Prediction("NAT", 10.7, 0); }
	}
	}
	}
	if( lmin >= -7.72 ) { 
	if( rslope < -5914 ) { 
	if( max < 3.17 ) { 
		if( lslope < -5941.5 ) { return new Prediction("NAT", 225.83, 0); }
		if( lslope >= -5941.5 ) { return new Prediction("AT", 2.14, 0.14); }
	}
	if( max >= 3.17 ) { 
	if( max < 12.81 ) { 
		if( rmin >= 5.77 ) { return new Prediction("NAT", 62.08, 0); }
	if( rmin < 5.77 ) { 
	if( lslope >= -27095.5 ) { 
	if( max < 7.05 ) { 
	if( lslope >= -18875 ) { 
	if( rmin < -5.1 ) { 
		if( rslope < -10417 ) { return new Prediction("NAT", 10.7, 0); }
		if( rslope >= -10417 ) { return new Prediction("AT", 3.21, 0.21); }
	}
		if( rmin >= -5.1 ) { return new Prediction("NAT", 24.62, 0); }
	}
	if( lslope < -18875 ) { 
	if( max >= 4.14 ) { 
	if( lslope < -25751.5 ) { 
		if( rmin >= -0.21 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < -0.21 ) { return new Prediction("NAT", 1.07, 0); }
	}
		if( lslope >= -25751.5 ) { return new Prediction("NAT", 5.35, 0); }
	}
		if( max < 4.14 ) { return new Prediction("AT", 8.56, 0.56); }
	}
	}
	if( max >= 7.05 ) { 
	if( lmin < 4.17 ) { 
	if( rslope >= -9336.5 ) { 
		if( rslope >= -6527 ) { return new Prediction("NAT", 1.07, 0); }
		if( rslope < -6527 ) { return new Prediction("AT", 14.98, 0.98); }
	}
	if( rslope < -9336.5 ) { 
	if( rmin >= -0.4 ) { 
		if( max >= 9.42 ) { return new Prediction("NAT", 8.56, 0); }
	if( max < 9.42 ) { 
	if( lslope < -13401 ) { 
		if( lmin >= 0.05 ) { return new Prediction("NAT", 5.35, 0); }
		if( lmin < 0.05 ) { return new Prediction("AT", 2.14, 0.14); }
	}
		if( lslope >= -13401 ) { return new Prediction("AT", 4.28, 0.28); }
	}
	}
	if( rmin < -0.4 ) { 
		if( lmin >= -3.13 ) { return new Prediction("AT", 8.56, 0.56); }
	if( lmin < -3.13 ) { 
		if( max >= 11.55 ) { return new Prediction("AT", 2.14, 0.14); }
		if( max < 11.55 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	}
		if( lmin >= 4.17 ) { return new Prediction("NAT", 5.35, 0); }
	}
	}
	if( lslope < -27095.5 ) { 
		if( rslope < -34989.5 ) { return new Prediction("NAT", 31.04, 0); }
	if( rslope >= -34989.5 ) { 
		if( rslope < -32673 ) { return new Prediction("AT", 1.07, 0.07); }
	if( rslope >= -32673 ) { 
	if( rmin < 0.28 ) { 
		if( lmin < 0.22 ) { return new Prediction("NAT", 12.84, 0); }
	if( lmin >= 0.22 ) { 
		if( lmin >= 2.38 ) { return new Prediction("NAT", 1.07, 0); }
		if( lmin < 2.38 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( rmin >= 0.28 ) { return new Prediction("NAT", 16.05, 0); }
	}
	}
	}
	}
	}
	if( max >= 12.81 ) { 
		if( lmin >= 5.71 ) { return new Prediction("NAT", 2.14, 0); }
		if( lmin < 5.71 ) { return new Prediction("AT", 21.41, 1.41); }
	}
	}
	}
		if( rslope >= -5914 ) { return new Prediction("NAT", 127.36, 0); }
	}
return null;
}
private Prediction runTree99() {
	if( max >= 14.89 ) { 
		if( rmin < 0.29 ) { return new Prediction("AT", 45.91, 2.8); }
	if( rmin >= 0.29 ) { 
		if( lmin < -19.59 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= -19.59 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	if( max < 14.89 ) { 
	if( lmin >= -8.96 ) { 
	if( max >= 1.68 ) { 
		if( lmin >= 3.69 ) { return new Prediction("NAT", 116.37, 0.27); }
	if( lmin < 3.69 ) { 
	if( rslope >= -30708 ) { 
	if( max < 8.84 ) { 
		if( lmin >= 1.09 ) { return new Prediction("NAT", 29.89, 0.07); }
	if( lmin < 1.09 ) { 
	if( lmin < 0.27 ) { 
	if( rmin < -5.51 ) { 
	if( lslope >= -9173.5 ) { 
		if( rslope < -3801 ) { return new Prediction("AT", 7.47, 0.46); }
		if( rslope >= -3801 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope < -9173.5 ) { 
	if( max < 5.48 ) { 
		if( max >= 4.16 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( max < 4.16 ) { 
		if( max < 3.39 ) { return new Prediction("NAT", 3.2, 0.01); }
		if( max >= 3.39 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
	if( max >= 5.48 ) { 
	if( rslope < -9939 ) { 
		if( max < 5.93 ) { return new Prediction("AT", 3.2, 0.2); }
	if( max >= 5.93 ) { 
		if( rmin < -10.28 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin >= -10.28 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
		if( rslope >= -9939 ) { return new Prediction("NAT", 4.27, 0.01); }
	}
	}
	}
	if( rmin >= -5.51 ) { 
		if( rmin < -1.13 ) { return new Prediction("NAT", 42.7, 0.1); }
	if( rmin >= -1.13 ) { 
	if( lmin >= -0.85 ) { 
		if( max >= 6.82 ) { return new Prediction("AT", 6.41, 0.39); }
		if( max < 6.82 ) { return new Prediction("NAT", 18.15, 0.04); }
	}
	if( lmin < -0.85 ) { 
		if( lslope >= -17695.5 ) { return new Prediction("NAT", 28.82, 0.07); }
	if( lslope < -17695.5 ) { 
		if( lslope < -20781 ) { return new Prediction("NAT", 8.54, 0.02); }
		if( lslope >= -20781 ) { return new Prediction("AT", 2.14, 0.13); }
	}
	}
	}
	}
	}
	if( lmin >= 0.27 ) { 
	if( lslope < -19553.5 ) { 
		if( max >= 3.27 ) { return new Prediction("AT", 13.88, 0.85); }
		if( max < 3.27 ) { return new Prediction("NAT", 1.07, 0); }
	}
	if( lslope >= -19553.5 ) { 
		if( rmin >= 2.58 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( rmin < 2.58 ) { 
		if( lmin < 0.71 ) { return new Prediction("AT", 1.07, 0.07); }
		if( lmin >= 0.71 ) { return new Prediction("NAT", 3.2, 0.01); }
	}
	}
	}
	}
	}
	if( max >= 8.84 ) { 
		if( rmin >= 6.07 ) { return new Prediction("NAT", 17.08, 0.04); }
	if( rmin < 6.07 ) { 
		if( lmin >= 2.3 ) { return new Prediction("AT", 11.74, 0.72); }
	if( lmin < 2.3 ) { 
	if( lslope >= -8102 ) { 
		if( lslope < -4119 ) { return new Prediction("AT", 8.54, 0.52); }
		if( lslope >= -4119 ) { return new Prediction("NAT", 2.14, 0.01); }
	}
	if( lslope < -8102 ) { 
		if( rslope >= -14356 ) { return new Prediction("NAT", 7.47, 0.02); }
	if( rslope < -14356 ) { 
		if( rmin >= 2.46 ) { return new Prediction("NAT", 2.14, 0.01); }
	if( rmin < 2.46 ) { 
	if( lslope < -19694 ) { 
		if( lmin < -4.06 ) { return new Prediction("AT", 2.14, 0.13); }
	if( lmin >= -4.06 ) { 
		if( lslope >= -22214.5 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( lslope < -22214.5 ) { return new Prediction("AT", 1.07, 0.07); }
	}
	}
		if( lslope >= -19694 ) { return new Prediction("AT", 5.34, 0.33); }
	}
	}
	}
	}
	}
	}
	}
	if( rslope < -30708 ) { 
	if( lmin < -7.72 ) { 
		if( rslope < -36421 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( rslope >= -36421 ) { return new Prediction("AT", 1.07, 0.07); }
	}
		if( lmin >= -7.72 ) { return new Prediction("NAT", 56.58, 0.13); }
	}
	}
	}
	if( max < 1.68 ) { 
		if( lmin >= -8.62 ) { return new Prediction("NAT", 197.5, 0.46); }
	if( lmin < -8.62 ) { 
		if( rmin >= -10.16 ) { return new Prediction("AT", 1.07, 0.07); }
		if( rmin < -10.16 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
	}
	}
	if( lmin < -8.96 ) { 
	if( max < 3.31 ) { 
	if( lslope < -10474 ) { 
		if( rmin < -6.7 ) { return new Prediction("NAT", 23.49, 0.06); }
	if( rmin >= -6.7 ) { 
		if( rmin >= -5.38 ) { return new Prediction("NAT", 18.15, 0.04); }
	if( rmin < -5.38 ) { 
		if( lmin >= -12.52 ) { return new Prediction("AT", 5.34, 0.33); }
		if( lmin < -12.52 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( lslope >= -10474 ) { 
		if( max < -5.53 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( max >= -5.53 ) { 
		if( lslope < -3296 ) { return new Prediction("AT", 17.08, 1.04); }
		if( lslope >= -3296 ) { return new Prediction("NAT", 1.07, 0); }
	}
	}
	}
	if( max >= 3.31 ) { 
	if( lslope >= -21578.5 ) { 
	if( rmin < -12.48 ) { 
		if( max >= 9.05 ) { return new Prediction("NAT", 8.54, 0.02); }
	if( max < 9.05 ) { 
		if( lmin >= -12.6 ) { return new Prediction("AT", 6.41, 0.39); }
	if( lmin < -12.6 ) { 
		if( rmin >= -13.88 ) { return new Prediction("NAT", 1.07, 0); }
		if( rmin < -13.88 ) { return new Prediction("AT", 3.2, 0.2); }
	}
	}
	}
	if( rmin >= -12.48 ) { 
	if( rslope < -13304 ) { 
		if( lslope >= -13485 ) { return new Prediction("NAT", 3.2, 0.01); }
	if( lslope < -13485 ) { 
		if( max < 6.64 ) { return new Prediction("NAT", 2.14, 0.01); }
		if( max >= 6.64 ) { return new Prediction("AT", 30.96, 1.89); }
	}
	}
		if( rslope >= -13304 ) { return new Prediction("AT", 32.03, 1.95); }
	}
	}
		if( lslope < -21578.5 ) { return new Prediction("NAT", 5.34, 0.01); }
	}
	}
	}
return null;
}
}

