package com.revenuecat.purchases.ui.revenuecatui.composables;

import Td.L;
import U.AbstractC2166c;
import U.AbstractC2174k;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import app.notifee.core.event.LogEvent;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "LTd/L;", "dismissRequest", "", LogEvent.LEVEL_ERROR, "ErrorDialog", "(Lie/a;Ljava/lang/String;LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ErrorDialogKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt$ErrorDialog$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ InterfaceC5082a $dismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC5082a interfaceC5082a) {
            super(2);
            this.$dismissRequest = interfaceC5082a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1928946396, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog.<anonymous> (ErrorDialog.kt:22)");
            }
            AbstractC2174k.c(this.$dismissRequest, null, false, null, null, null, null, null, null, ComposableSingletons$ErrorDialogKt.INSTANCE.m567getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425m, 805306368, 510);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt$ErrorDialog$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(2);
            this.$error = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            if ((i10 & 3) == 2 && interfaceC2425m.i()) {
                interfaceC2425m.K();
                return;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1457354655, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog.<anonymous> (ErrorDialog.kt:33)");
            }
            j0.b(this.$error, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt$ErrorDialog$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ InterfaceC5082a $dismissRequest;
        final /* synthetic */ String $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(InterfaceC5082a interfaceC5082a, String str, int i10) {
            super(2);
            this.$dismissRequest = interfaceC5082a;
            this.$error = str;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ErrorDialogKt.ErrorDialog(this.$dismissRequest, this.$error, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final /* synthetic */ void ErrorDialog(InterfaceC5082a dismissRequest, String error, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        AbstractC5504s.h(dismissRequest, "dismissRequest");
        AbstractC5504s.h(error, "error");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(875108500);
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425mG.F(dismissRequest) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(error) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(875108500, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialog (ErrorDialog.kt:18)");
            }
            interfaceC2425m2 = interfaceC2425mG;
            AbstractC2166c.a(dismissRequest, i.d(1928946396, true, new AnonymousClass1(dismissRequest), interfaceC2425mG, 54), null, null, ComposableSingletons$ErrorDialogKt.INSTANCE.m568getLambda2$revenuecatui_defaultsBc8Release(), null, i.d(-1457354655, true, new AnonymousClass2(error), interfaceC2425mG, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, interfaceC2425m2, (i11 & 14) | 1597488, 0, 16300);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(dismissRequest, error, i10));
        }
    }
}
