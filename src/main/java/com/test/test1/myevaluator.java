package com.test.test1;

import org.apache.mahout.cf.taste.impl.model.file.*;//FileDataModel

import org.apache.mahout.cf.taste.model.*;//DAtaModel

import org.apache.mahout.cf.taste.impl.neighborhood.*;

import org.apache.mahout.cf.taste.impl.recommender.*;

import org.apache.mahout.cf.taste.impl.similarity.*;

import org.apache.mahout.cf.taste.neighborhood.*;

import org.apache.mahout.cf.taste.similarity.*;

import org.apache.mahout.cf.taste.recommender.*;

import org.apache.mahout.common.RandomUtils;

import org.apache.mahout.cf.taste.impl.eval.*;

import org.apache.mahout.cf.taste.eval.*;

import org.apache.mahout.cf.taste.common.TasteException;

import java.io.*;
public class myevaluator {

	public static void main(String[] args) throws IOException, TasteException {
		int[] i={5,10,15,20,25,30,40,50,60,70,80};
		Double[] score=new Double[i.length];
		for(int j=0;j<i.length;j++){
			score[j]=calculation.evalue(i[j]);
		}
		for(int j=0;j<score.length;j++)
		{
			System.out.println("k="+i[j]+",评价得分：" + score[j]); 
			
		}
	}

}
class  calculation{
	
	public static double evalue(int i)throws IOException, TasteException{
		// TODO Auto-generated method stub
		final int k;
		k = i;
				RandomUtils.useTestSeed();

				/**
				 * 
				 * 加载数据文件
				 * 
				 */

				DataModel model = new FileDataModel(new File("e:/123.csv"));

				/**
				 * 
				 * 创建评价器
				 * 
				 */

				RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
				
				RecommenderBuilder builder = new RecommenderBuilder() {
					 public Recommender buildRecommender(DataModel model) throws TasteException {

						UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

						UserNeighborhood neighborhood = new NearestNUserNeighborhood(k , similarity, model);

						return new GenericUserBasedRecommender(model, neighborhood, similarity);

			}

			};
			
		

				double score = evaluator.evaluate(builder, null, model, 0.8, 1.0);

				System.out.println("评价得分：" + score); // 输出评价得分
return score;
		
		
	}
	
	
	
}