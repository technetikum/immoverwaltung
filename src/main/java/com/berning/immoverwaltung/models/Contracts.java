package com.berning.immoverwaltung.models;

import java.time.LocalDate;

public class Contracts {
    private LocalDate startDate;
    private LocalDate startPayment;
    private int cancellationPeriodEndOfMonth;
    private int contractPeriodMonth;

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartPayment() {
        return startPayment;
    }

    public void setStartPayment(LocalDate startPayment) {
        this.startPayment = startPayment;
    }

    public int getCancellationPeriodEndOfMonth() {
        return cancellationPeriodEndOfMonth;
    }

    public void setCancellationPeriodEndOfMonth(int cancellationPeriodEndOfMonth) {
        this.cancellationPeriodEndOfMonth = cancellationPeriodEndOfMonth;
    }

    public int getContractPeriodMonth() {
        return contractPeriodMonth;
    }

    public void setContractPeriodMonth(int contractPeriodMonth) {
        this.contractPeriodMonth = contractPeriodMonth;
    }
    
}
