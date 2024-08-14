package br.com.cod3r.facade.callCenter.after.facade;

import br.com.cod3r.facade.callCenter.after.model.Card;
import br.com.cod3r.facade.callCenter.after.model.Register;
import br.com.cod3r.facade.callCenter.after.services.CardService;
import br.com.cod3r.facade.callCenter.after.services.PaymentService;
import br.com.cod3r.facade.callCenter.after.services.RegisterService;
import br.com.cod3r.facade.callCenter.after.services.ReportService;
import br.com.cod3r.facade.callCenter.after.services.SecurityService;

import java.util.List;

public class CallCenterFacade {
    private final CardService cardService;
    private final RegisterService registerService;
    private final ReportService reportService;
    private final PaymentService paymentService;
    private final SecurityService securityService;

    public CallCenterFacade() {
        this.cardService = new CardService();
        this.registerService = new RegisterService();
        this.reportService = new ReportService(registerService);
        this.paymentService = new PaymentService(registerService);
        this.securityService = new SecurityService(cardService, registerService);
    }

    public Card getCardByUser(Long l) {
        return cardService.getCardByUser(l);
    }

    public void getSummary(Card card) {
        reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        paymentService.getPaymentInfoByCard(card);
    }

    public void cancelLastRegister(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
    }
}
