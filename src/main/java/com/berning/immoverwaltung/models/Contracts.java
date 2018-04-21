package com.berning.immoverwaltung.models;

import java.util.Date;

public class Contracts {
    private Date startDate;
    private Date startPayment;
    private int cancellationPeriodEndOfMonth;
    private int contractPeriodMonth;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartPayment() {
        return startPayment;
    }

    public void setStartPayment(Date startPayment) {
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
