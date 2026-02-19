package com.student.receipts.model;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/receipt")
public class ReceiptController {

    private final ReceiptService service;

    public ReceiptController(ReceiptService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public String addReceipt(@RequestBody Receipt receipt) {
        service.addReceipt(receipt);
        return "Data Added Successfully";
        }
   
    @GetMapping("/all")
    public List<Receipt> getAllReceipts() {
        return service.getAllReceipts();
    }
    
     // ✅ Update
    @PutMapping("/update")
    public String updateReceipt(@RequestBody Receipt receipt) {
        service.updateReceipt(receipt);
        return "Data Updated Successfully";
    }
    // ✅ Delete
    @DeleteMapping("/delete/{id}")
    public String deleteReceipt(@PathVariable("id") long id) {
        service.deleteReceipt(id);
        return "Data Deleted Successfully";
    }
    }




