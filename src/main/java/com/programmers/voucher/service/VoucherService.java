package com.programmers.voucher.service;

import com.programmers.voucher.voucher.Voucher;
import com.programmers.voucher.voucher.VoucherType;

import java.util.List;
import java.util.UUID;

public interface VoucherService {
    Voucher register(String voucherType, String value);

    Voucher getVoucher(UUID voucherId);

    List<Voucher> findAll();

    void deleteAll();
}
