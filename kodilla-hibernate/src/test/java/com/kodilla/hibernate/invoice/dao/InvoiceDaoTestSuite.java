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

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    private ItemDao itemDao;
    private InvoiceDao invoiceDao;
    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1=new Product("Vacuum cleaner");
        Product product2=new Product("Dishwasher");
        Item item1=new Item(product1, new BigDecimal(357), 12, new BigDecimal(1233));
        Item item2=new Item(product1, new BigDecimal(401), 18, new BigDecimal(2233));
        Item item3=new Item(product2, new BigDecimal(125), 85, new BigDecimal(12233));
        Item item4=new Item(product2, new BigDecimal(125), 85, new BigDecimal(12233));
        Item item5=new Item(product2, new BigDecimal(51), 10, new BigDecimal(1256));
        Invoice invoice1=new Invoice("123456");
        Invoice invoice2=new Invoice("456789");
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);
        product2.getItems().add(item4);
        product2.getItems().add(item5);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);

        //When
        productDao.save(product1);
        int idp1 = product1.getId();
        productDao.save(product2);
        int idp2= product2.getId();
        invoiceDao.save(invoice1);
        int idinv1=invoice1.getId();
        invoiceDao.save(invoice2);
        int idinv2=invoice2.getId();
        itemDao.save(item1);
        int idi1=item1.getId();
        itemDao.save(item1);
        int idi2=item2.getId();
        itemDao.save(item2);
        int idi3=item3.getId();
        itemDao.save(item3);
        int idi4=item4.getId();
        itemDao.save(item4);
        int idi5=item5.getId();
        itemDao.save(item5);
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
