package br.com.cod3r.facade.callCenter.isolated.facade;

import br.com.cod3r.facade.callCenter.isolated.model.Card;
import br.com.cod3r.facade.callCenter.isolated.services.CardService;
import br.com.cod3r.facade.callCenter.isolated.services.PaymentService;
import br.com.cod3r.facade.callCenter.isolated.services.RegisterService;
import br.com.cod3r.facade.callCenter.isolated.services.ReportService;

public class CallCenterFacade {
    private final CardService cardService;
    private final RegisterService registerService;
    private final ReportService reportService;
    private final PaymentService paymentService;

    public CallCenterFacade() {
        this.cardService = new CardService();
        this.registerService = new RegisterService();
        this.reportService = new ReportService(registerService);
        this.paymentService = new PaymentService(registerService);
    }

    public Long getCardByUser(Long l) {
        Card card = cardService.getCardByUser(l);
        return card.getCardNumber();
    }

    public void getSummary(Long cardNumber) {
        reportService.getSumary(new Card(null, cardNumber));
    }

    public void getPaymentInfoByCard(Long cardNumber) {
        paymentService.getPaymentInfoByCard(new Card(null, cardNumber));
    }
}
