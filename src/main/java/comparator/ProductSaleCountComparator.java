package comparator;

import com.ply.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @author ply
 * @date 2021/3/11 - 12:52
 */
public class ProductSaleCountComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount()-p1.getSaleCount();
    }

}
