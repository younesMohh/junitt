package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTest{



    static    List<List<Integer>>  partition (List<Integer> L , int i){ 
		 Map<Object, List<Integer>> groups = 
		   L.stream().collect(Collectors.groupingBy(o -> (o- 1) / i)); 
		
		return new ArrayList<List<Integer>>(groups.values());
		}
		
@Test
	public  void verifier_le_premier_liste_envoyer_partition() {
	List<Integer> Llist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	List<Integer> premierPrtition = partition(Llist,3).get(0); 
	System.out.println(premierPrtition.get(0));
	 List<Integer> expected = Arrays.asList(1, 2, 3);
	 Assert.assertEquals(partition(Llist,3).size(), 3);
	 Assert.assertEquals(premierPrtition, expected);     
	 }

}
