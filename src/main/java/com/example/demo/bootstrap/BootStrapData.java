package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {
    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        OutsourcedPart o1= new OutsourcedPart();
        o1.setCompanyName("Western Governors University");
        o1.setName("Soccer Net");
        o1.setInv(2);
        o1.setPrice(25.0);
        o1.setId(400);
        outsourcedPartRepository.save(o1);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Soccer Net"))thePart=part;
        }
        OutsourcedPart o2= new OutsourcedPart();
        o2.setCompanyName("Western Governors University");
        o2.setName("Replacement Cleats (adult)");
        o2.setInv(2);
        o2.setPrice(2.0);
        o2.setId(401);
        outsourcedPartRepository.save(o2);
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Replacement Cleats (adult)"))thePart=part;
        }
        OutsourcedPart o3= new OutsourcedPart();
        o3.setCompanyName("Western Governors University");
        o3.setName("Replacement Cleats (child)");
        o3.setInv(2);
        o3.setPrice(2.0);
        o3.setId(402);
        outsourcedPartRepository.save(o3);
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Replacement Cleats (child)"))thePart=part;
        }
        OutsourcedPart o4= new OutsourcedPart();
        o4.setCompanyName("Western Governors University");
        o4.setName("Cones (4 pack)");
        o4.setInv(5);
        o4.setPrice(9.0);
        o4.setId(403);
        outsourcedPartRepository.save(o4);
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Cones (4 pack)"))thePart=part;
        }
        OutsourcedPart o5= new OutsourcedPart();
        o5.setCompanyName("Western Governors University");
        o5.setName("Water Bottle");
        o5.setInv(5);
        o5.setPrice(5.0);
        o5.setId(404);
        outsourcedPartRepository.save(o5);
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("Water Bottle"))thePart=part;
        }

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        Product childSoccerBall= new Product("Child-sized soccer set",10.0,5);
        productRepository.save(childSoccerBall);
        Product adultSoccerBall= new Product("Adult-sized soccer set",15.0,10);
        productRepository.save(adultSoccerBall);
        Product childGoal= new Product("Soccer Set: replacement parts",20.0,2);
        productRepository.save(childGoal);
        Product childShinGuards= new Product("Soccer Set: Family Size",10.0,5);
        productRepository.save(childShinGuards);
        Product adultShinGuards= new Product("Soccer Set: Party Size",15.0,5);
        productRepository.save(adultShinGuards);
        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}