package com.dex.bootstrap;

import com.dex.model.OpisPromene;
import com.dex.repositories.OpisPromeneRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private OpisPromeneRepository opisPromeneRepository;

    public Bootstrap(OpisPromeneRepository opisPromeneRepository) {
        this.opisPromeneRepository = opisPromeneRepository;
    }

    @Transactional
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        OpisPromene op1=new OpisPromene();
        op1.setNazivOpisaPromene("opis 1");

        OpisPromene op2=new OpisPromene();
        op2.setNazivOpisaPromene("opis 2");

        opisPromeneRepository.save(op1);
        opisPromeneRepository.save(op2);
    }
}
