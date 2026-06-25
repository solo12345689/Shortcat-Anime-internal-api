package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import androidx.lifecycle.r;
import j2.AbstractC5332c;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000f²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ljava/util/Date;", "targetDate", "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;", "rememberCountdownState", "(Ljava/util/Date;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownState;", "", "SECONDS_IN_DAY", "I", "SECONDS_IN_HOUR", "SECONDS_IN_MINUTE", "MILLIS_IN_SECOND", "Lcom/revenuecat/purchases/ui/revenuecatui/components/countdown/CountdownTime;", "countdownTime", "", "isCountingEnabled", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class CountdownComponentStateKt {
    private static final int MILLIS_IN_SECOND = 1000;
    private static final int SECONDS_IN_DAY = 86400;
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static final CountdownState rememberCountdownState(Date targetDate, InterfaceC2425m interfaceC2425m, int i10) {
        Date date;
        AbstractC5504s.h(targetDate, "targetDate");
        interfaceC2425m.V(280932820);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(280932820, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.rememberCountdownState (CountdownComponentState.kt:57)");
        }
        interfaceC2425m.V(-392681169);
        boolean zU = interfaceC2425m.U(targetDate);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = Long.valueOf(targetDate.getTime() - new Date().getTime());
            interfaceC2425m.u(objD);
        }
        long jLongValue = ((Number) objD).longValue();
        interfaceC2425m.O();
        interfaceC2425m.V(-392678500);
        boolean zU2 = interfaceC2425m.U(targetDate);
        Object objD2 = interfaceC2425m.D();
        if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
            objD2 = b2.e(jLongValue <= 0 ? CountdownTime.INSTANCE.getZERO() : CountdownTime.INSTANCE.fromInterval(jLongValue), null, 2, null);
            interfaceC2425m.u(objD2);
        }
        C0 c02 = (C0) objD2;
        interfaceC2425m.O();
        interfaceC2425m.V(-392672454);
        Object objD3 = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD3 == aVar.a()) {
            objD3 = b2.e(Boolean.TRUE, null, 2, null);
            interfaceC2425m.u(objD3);
        }
        C0 c03 = (C0) objD3;
        interfaceC2425m.O();
        r rVar = (r) interfaceC2425m.n(AbstractC5332c.c());
        interfaceC2425m.V(-392667923);
        boolean zF = interfaceC2425m.F(rVar) | interfaceC2425m.F(targetDate) | interfaceC2425m.U(c02);
        Object objD4 = interfaceC2425m.D();
        if (zF || objD4 == aVar.a()) {
            date = targetDate;
            Object countdownComponentStateKt$rememberCountdownState$1$1 = new CountdownComponentStateKt$rememberCountdownState$1$1(date, rVar, c03, c02, null);
            interfaceC2425m.u(countdownComponentStateKt$rememberCountdownState$1$1);
            objD4 = countdownComponentStateKt$rememberCountdownState$1$1;
        } else {
            date = targetDate;
        }
        interfaceC2425m.O();
        AbstractC2393b0.e(date, (Function2) objD4, interfaceC2425m, i10 & 14);
        CountdownState countdownState = new CountdownState(rememberCountdownState$lambda$2(c02), AbstractC5504s.c(rememberCountdownState$lambda$2(c02), CountdownTime.INSTANCE.getZERO()));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return countdownState;
    }

    private static final CountdownTime rememberCountdownState$lambda$2(C0 c02) {
        return (CountdownTime) c02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberCountdownState$lambda$5(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberCountdownState$lambda$6(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }
}
