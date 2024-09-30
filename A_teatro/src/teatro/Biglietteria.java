package teatro;
public class Biglietteria {
boolean[]filaA = new boolean[45];
boolean[]filaB = new boolean[45];
boolean[]filaC = new boolean[45];
boolean[]filaD = new boolean[45];
boolean[]filaE = new boolean[45];
boolean[]filaF = new boolean[45];
boolean[]filaG = new boolean[45];
boolean[]filaH = new boolean[45];
boolean[]filaI = new boolean[45];
boolean[]filaL = new boolean[45];
boolean[]filaM = new boolean[45];
boolean[]filaN = new boolean[45];
boolean[]filaO = new boolean[45];
boolean[]filaP = new boolean[45];
boolean[]filaQ = new boolean[45];
String biglietto;
public void prenota() {
	int low=22;
	int up=22;
	boolean v=false;
while(true) {
	v=false;
	
	for(int i=0;i<43;i=i+2) {
		if(filaA[up]==true) {
			low--;
		}else {filaA[up]=true;biglietto="filaA "+up;v=true;break;}
		
		if(filaA[low]==true) {
			up++;
		}else {filaA[low]=true;biglietto="filaA "+low;v=true;break;}
	}
		if (v==true) {break;}
		
		
		low=22;
		up=22;
		for(int i=0;i<43;i=i+2) {
			if(filaB[up]==true) {
				low--;
			}else {filaB[up]=true;biglietto="filaB "+up;v=true;break;}
			
			if(filaB[low]==true) {
				up++;
			}else {filaB[low]=true;biglietto="filaB "+low;v=true;break;}
		}
			if (v==true) {break;}
			
			
			low=22;
			up=22;
			for(int i=0;i<43;i=i+2) {
				if(filaC[up]==true) {
					low--;
				}else {filaC[up]=true;biglietto="filaC "+up;v=true;break;}
				
				if(filaC[low]==true) {
					up++;
				}else {filaC[low]=true;biglietto="filaC "+low;v=true;break;}
			}
				if (v==true) {break;}
				
				
				low=22;
				up=22;
				for(int i=0;i<43;i=i+2) {
					if(filaD[up]==true) {
						low--;
					}else {filaD[up]=true;biglietto="filaD "+up;v=true;break;}
					
					if(filaD[low]==true) {
						up++;
					}else {filaD[low]=true;biglietto="filaD "+low;v=true;break;}
				}
					if (v==true) {break;}
					
					
					low=22;
					up=22;
					for(int i=0;i<43;i=i+2) {
						if(filaE[up]==true) {
							low--;
						}else {filaE[up]=true;biglietto="filaE "+up;v=true;break;}
						
						if(filaE[low]==true) {
							up++;
						}else {filaE[low]=true;biglietto="filaE "+low;v=true;break;}
					}
						if (v==true) {break;}
						
						
						low=22;
						up=22;
						for(int i=0;i<43;i=i+2) {
							if(filaF[up]==true) {
								low--;
							}else {filaF[up]=true;biglietto="filaF "+up;v=true;break;}
							
							if(filaF[low]==true) {
								up++;
							}else {filaF[low]=true;biglietto="filaF "+low;v=true;break;}
						}
							if (v==true) {break;}
							
							
							low=22;
							up=22;
							for(int i=0;i<43;i=i+2) {
								if(filaG[up]==true) {
									low--;
								}else {filaG[up]=true;biglietto="filaG "+up;v=true;break;}
								
								if(filaG[low]==true) {
									up++;
								}else {filaG[low]=true;biglietto="filaG "+low;v=true;break;}
							}
								if (v==true) {break;}
								
								
								low=22;
								up=22;
								for(int i=0;i<43;i=i+2) {
									if(filaH[up]==true) {
										low--;
									}else {filaH[up]=true;biglietto="filaH "+up;v=true;break;}
									
									if(filaH[low]==true) {
										up++;
									}else {filaH[low]=true;biglietto="filaH "+low;v=true;break;}
								}
									if (v==true) {break;}
									
									
									low=22;
									up=22;
									for(int i=0;i<43;i=i+2) {
										if(filaI[up]==true) {
											low--;
										}else {filaI[up]=true;biglietto="filaI "+up;v=true;break;}
										
										if(filaI[low]==true) {
											up++;
										}else {filaI[low]=true;biglietto="filaI "+low;v=true;break;}
									}
										if (v==true) {break;}
										
										
										low=22;
										up=22;
										for(int i=0;i<43;i=i+2) {
											if(filaL[up]==true) {
												low--;
											}else {filaL[up]=true;biglietto="filaL "+up;v=true;break;}
											
											if(filaL[low]==true) {
												up++;
											}else {filaL[low]=true;biglietto="filaL "+low;v=true;break;}
										}
											if (v==true) {break;}
											
											
											low=22;
											up=22;
											for(int i=0;i<43;i=i+2) {
												if(filaM[up]==true) {
													low--;
												}else {filaM[up]=true;biglietto="filaM "+up;v=true;break;}
												
												if(filaM[low]==true) {
													up++;
												}else {filaM[low]=true;biglietto="filaM "+low;v=true;break;}
											}
												if (v==true) {break;}
												
												
												low=22;
												up=22;
												for(int i=0;i<43;i=i+2) {
													if(filaN[up]==true) {
														low--;
													}else {filaN[up]=true;biglietto="filaN "+up;v=true;break;}
													
													if(filaN[low]==true) {
														up++;
													}else {filaN[low]=true;biglietto="filaN "+low;v=true;break;}
												}
													if (v==true) {break;}
													
													
													low=22;
													up=22;
													for(int i=0;i<43;i=i+2) {
														if(filaO[up]==true) {
															low--;
														}else {filaO[up]=true;biglietto="filaO "+up;v=true;break;}
														
														if(filaO[low]==true) {
															up++;
														}else {filaO[low]=true;biglietto="filaO "+low;v=true;break;}
													}
														if (v==true) {break;}
														
														
														low=22;
														up=22;
														for(int i=0;i<43;i=i+2) {
															if(filaP[up]==true) {
																low--;
															}else {filaP[up]=true;biglietto="filaP "+up;v=true;break;}
															
															if(filaP[low]==true) {
																up++;
															}else {filaP[low]=true;biglietto="filaP "+low;v=true;break;}
														}
															if (v==true) {break;}
															
															
															low=22;
															up=22;
															for(int i=0;i<43;i=i+2) {
																if(filaQ[up]==true) {
																	low--;
																}else {filaQ[up]=true;biglietto="filaQ "+up;v=true;break;}
																
																if(filaQ[low]==true) {
																	up++;
																}else {filaQ[low]=true;biglietto="filaQ "+low;v=true;break;}
															}
																if (v==true) {break;}
				
				
		
		
		
		
		
	}
	}
 }

