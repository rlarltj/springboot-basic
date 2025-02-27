package com.programmers.voucher.voucher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.programmers.voucher.voucher.VoucherType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VoucherTypeTest {

    @Test
    @DisplayName("FixedAmount 타입으로 바우처를 생성할 경우 FixedAmountVoucher가 생성되어야 한다.")
    void 바우처생성테스트1() {
        VoucherType type = FixedAmount;
        Voucher voucher = VoucherFactory.createVoucher(type, 5000L);
        assertThat(voucher).isInstanceOf(FixedAmountVoucher.class);
    }

    @Test
    @DisplayName("PercentDiscount 타입으로 바우처를 생성할 경우 PercentDiscountVoucher가 생성되어야 한다.")
    void 바우처생성테스트2() {
        VoucherType type = PercentDiscount;
        Voucher voucher = VoucherFactory.createVoucher(type, 5L);

        assertThat(voucher).isInstanceOf(PercentDiscountVoucher.class);
    }

    @Test
    @DisplayName("VoucherType에 없는 타입을 검색한 경우 런타임 예외가 발생한다.")
    void 바우처타입검색() {
        assertThrows(RuntimeException.class,
                () -> getValidateVoucherType("K"));
    }


}