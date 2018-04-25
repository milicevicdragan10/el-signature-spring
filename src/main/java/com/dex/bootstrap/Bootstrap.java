package com.dex.bootstrap;

import com.dex.model.KontniOkvir;
import com.dex.model.OpisPromene;
import com.dex.model.User;
import com.dex.repositories.KontniOkvirRepository;
import com.dex.repositories.OpisPromeneRepository;
import com.dex.repositories.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private OpisPromeneRepository opisPromeneRepository;
    private KontniOkvirRepository kontniOkvirRepository;
    private UserRepository userRepository;

    public Bootstrap(OpisPromeneRepository opisPromeneRepository, KontniOkvirRepository kontniOkvirRepository, UserRepository userRepository) {
        this.opisPromeneRepository = opisPromeneRepository;
        this.kontniOkvirRepository = kontniOkvirRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        OpisPromene op1=new OpisPromene();
        op1.setNazivOpisaPromene("opis 1");

        OpisPromene op2=new OpisPromene();
        op2.setNazivOpisaPromene("opis 2");

        opisPromeneRepository.save(op1);
        opisPromeneRepository.save(op2);

        KontniOkvir konto1=new KontniOkvir();
        konto1.setKonto("0123");
        konto1.setNazivKonta("Izvod");
        konto1.setKontoCetvorocifreni("0123");
        konto1.setKontoSestocifreni("012345");
        konto1.setAnalitickiKonto("012345");

        KontniOkvir konto2 = new KontniOkvir();
        konto2.setKonto("0222");
        konto2.setNazivKonta("Uplata dobavljacu");
        konto2.setKontoCetvorocifreni("0222");
        konto2.setKontoSestocifreni("0222");
        konto2.setAnalitickiKonto("1");

        KontniOkvir konto3 = new KontniOkvir();
        konto3.setKonto("0333");
        konto3.setNazivKonta("Naplata potrazivanja");
        konto3.setKontoCetvorocifreni("0333");
        konto3.setKontoSestocifreni("033333");
        konto3.setAnalitickiKonto("012345");

        kontniOkvirRepository.save(konto1);
        kontniOkvirRepository.save(konto2);
        kontniOkvirRepository.save(konto3);

        User user1=new User();
        user1.setIme("Dragan");
        user1.setPrezime("Milicevic");
        user1.setKorisnickoIme("duck");
        user1.setLozinka("d123");
        userRepository.save(user1);
    }


}
