package com.test.test1;

import java.io.File;
import java.util.*;

import org.apache.cassandra.thrift.Cassandra.system_add_column_family_args;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.NearestNeighborClusterSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;


public class evaluator {

	public static void main(String[] args) {
		
		try {
			int i=1;
			DataModel model = new FileDataModel(new File("e:/123.csv"));
			UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
			UserNeighborhood neighborhood = new NearestNUserNeighborhood(5, similarity, model);
			Recommender recommender=new GenericUserBasedRecommender(model, neighborhood, similarity);
			for(i=1;i<=6040;i++){
			List<RecommendedItem> recommendations=recommender.recommend(i,10);
			for(RecommendedItem recommendation:recommendations)
			{System.out.println(recommendation);}}
			System.out.println(i+"结束");
		} catch (Exception e) {
			System.out.println("出错了");
		}

	}
	

}
