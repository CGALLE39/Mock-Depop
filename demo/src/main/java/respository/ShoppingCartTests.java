package respository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.annotation.Rollback;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ShoppingCartTests {

    private CartItemRepository cartRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testAddOneCartItem() {
        entityManager.find(Product.class, primaryKey);
    }

}
