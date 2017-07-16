package com.test.test1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cassandra.thrift.Cassandra.system_add_column_family_args;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.junit.Test;

import com.google.common.annotations.VisibleForTesting;

/**
 * Hello world!
 *
 */
public class App {
	static int NEIBORHOOD_NUM = 10;
	static int RECOMMENDER_NUM = 5;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		try {
			String file = "e:/123.csv";
			DataModel model = new FileDataModel(new File(file));
			UserSimilarity user = new EuclideanDistanceSimilarity(model);
			System.out.println(user.userSimilarity(1, 3));
			NearestNUserNeighborhood nearbor = new NearestNUserNeighborhood(NEIBORHOOD_NUM, user, model);
			
			
//			Recommender r = new GenericUserBasedRecommender(model, nearbor, user);
//			LongPrimitiveIterator iter = model.getUserIDs();
//			while (iter.hasNext()) {
//				long uid = iter.nextLong();
//				List<RecommendedItem> list = r.recommend(uid, RECOMMENDER_NUM);
//				System.out.printf("uid:%s", uid);
//				for (RecommendedItem rItem : list) {
//					System.out.printf("(%s,%f)", rItem.getItemID(), rItem.getValue());
//
//				}
//
//				System.out.println();
//
//			}
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void test1() {
		
		ArrayList<String> arrayList = new ArrayList<String>();

		Map<Integer, String> map = new HashMap<Integer, String>();
		Integer i = 1;
		int j = i;

	}
}

enum grade {
	A, B, C, D, E
}
