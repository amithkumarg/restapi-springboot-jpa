package com.ln.event.mgr.repo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EventInventoryRepoTest {
  
  @Autowired
  private EventInventoryRepo eventInventoryRepo;
  
  @Test
  public void testCount(){
    assertEquals(6, eventInventoryRepo.count("MSCLAMKJ", null, null, null));
  }
  
  
  
}
