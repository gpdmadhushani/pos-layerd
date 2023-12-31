/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.DaoFactory;
import pos.layerd.dao.custom.CustomerDao;
import pos.layerd.dto.CustomerDto;
import pos.layerd.entity.CustomerEntity;

import pos.layerd.service.custom.CustomerService;

/**
 *
 * @author TOSHIBA
 */
public class CustomerServiceImpl implements CustomerService  {
    CustomerDao customerDao=(CustomerDao)DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    
    public String addCustomer(CustomerDto dto) throws Exception {
        
        CustomerEntity ce =new CustomerEntity (dto.getId(), dto.getTitle(), dto.getName(), dto.getDob(), dto.getSalary(), dto.getAddress(), dto.getCity(), dto.getProvince(), dto.getZip());
       
        if(customerDao.add(ce) ){
        return "Successfully Added";
    }else{
    return "fail";
        }
    }  

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
       CustomerEntity ce =new CustomerEntity (dto.getId(), dto.getTitle(), dto.getName(), dto.getDob(), dto.getSalary(), dto.getAddress(), dto.getCity(), dto.getProvince(), dto.getZip());
       
        if(customerDao.update(ce) ){
        return "Successfully Update";
    }else{
    return "fail";
        }  
        
        
        
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
         if(customerDao.delete(id) ){
        return "Successfully Delete";
    }else{
    return "fail";
        }   
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity entity=customerDao.get(id);
        CustomerDto cus=new CustomerDto(entity.getId(), entity.getTitle(), entity.getName(), entity.getDob(), entity.getSalary(), entity.getAddress(), entity.getCity(), entity.getProvince(), entity.getZip());
    if(cus!=null){
        return cus;
    }else{
        return null;
    }
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
        ArrayList <CustomerDto> customerDtos=new ArrayList <>();
        ArrayList <CustomerEntity> customerEntitys=customerDao.getAll();
        
    for(CustomerEntity entity:customerEntitys ){
        CustomerDto dto=new CustomerDto(entity.getId(), entity.getTitle(), entity.getName(), entity.getDob(), entity.getSalary(), entity.getAddress(), entity.getCity(), entity.getProvince(), entity.getZip());
        customerDtos.add(dto);
    
    }
    return customerDtos;
    }
    
}
