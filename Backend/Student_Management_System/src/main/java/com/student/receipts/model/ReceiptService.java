package com.student.receipts.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReceiptService {

    @Autowired
    private ReceiptRepository repository;
    public int addReceipt(Receipt receipt) {
        return repository.save(receipt);
    }
   
    public List<Receipt> getAllReceipts() {
        return repository.getAllReceipts();
    }

    public int updateReceipt(Receipt receipt) {
        return repository.update(receipt);
}

    public int deleteReceipt(long receiptId) {
        return repository.delete(receiptId);
}

}


