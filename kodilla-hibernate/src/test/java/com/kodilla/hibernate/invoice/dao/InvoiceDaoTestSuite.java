package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1=new Product("Vacuum cleaner");
        Product product2=new Product("Dishwasher");
        Invoice invoice1=new Invoice("123456");
        Invoice invoice2=new Invoice("456789");

        Item item1=new Item(product1, new BigDecimal(357), 12, new BigDecimal(1233));
        Item item2=new Item(product1, new BigDecimal(401), 18, new BigDecimal(2233));
        Item item3=new Item(product2, new BigDecimal(125), 85, new BigDecimal(12233));
        Item item4=new Item(product2, new BigDecimal(125), 85, new BigDecimal(12233));
        Item item5=new Item(product2, new BigDecimal(51), 10, new BigDecimal(1256));

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);

        List<Item> items=new ArrayList<>();
        product1.setItems(items);
        product2.setItems(items);
        invoice1.setItems(items);
        invoice2.setItems(items);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);
        product2.getItems().add(item4);
        product2.getItems().add(item5);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        itemDao.save(item1);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);

        int idp1 = product1.getId();
        int idp2= product2.getId();
        int idinv1=invoice1.getId();
        int idinv2=invoice2.getId();
        int idi1=item1.getId();
        int idi2=item2.getId();
        int idi3=item3.getId();
        int idi4=item4.getId();
        int idi5=item5.getId();

        //Then
        Assert.assertNotEquals(0, idp1);
        Assert.assertNotEquals(0, idp2);
        Assert.assertNotEquals(0, idinv1);
        Assert.assertNotEquals(0, idinv2);
        Assert.assertNotEquals(0, idi1);
        Assert.assertNotEquals(0, idi2);
        Assert.assertNotEquals(0, idi3);
        Assert.assertNotEquals(0, idi4);
        Assert.assertNotEquals(0, idi5);
        Assert.assertNotNull(product1.getItems());
        Assert.assertEquals("Vacuum cleaner", product1.getName());
        Assert.assertEquals("123456", item1.getInvoice().getNumber());

        //CleanUp
        itemDao.delete(idi1);
        itemDao.delete(idi2);
        itemDao.delete(idi3);
        itemDao.delete(idi4);
        itemDao.delete(idi5);
        invoiceDao.delete(idinv1);
        invoiceDao.delete(idinv2);
        productDao.delete(idp1);
        productDao.delete(idp2);
    }
}
