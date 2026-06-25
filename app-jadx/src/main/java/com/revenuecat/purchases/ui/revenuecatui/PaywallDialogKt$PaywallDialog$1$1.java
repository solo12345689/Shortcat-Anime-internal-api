package com.revenuecat.purchases.ui.revenuecatui;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import Y.C0;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1", f = "PaywallDialog.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class PaywallDialogKt$PaywallDialog$1$1 extends l implements Function2 {
    final /* synthetic */ Function1 $shouldDisplayBlock;
    final /* synthetic */ C0 $shouldDisplayDialog$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$1$1$1", f = "PaywallDialog.kt", l = {55}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ Function1 $shouldDisplayBlock;
        final /* synthetic */ C0 $shouldDisplayDialog$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, C0 c02, e eVar) {
            super(2, eVar);
            this.$shouldDisplayBlock = function1;
            this.$shouldDisplayDialog$delegate = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C0 c02;
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                C0 c03 = this.$shouldDisplayDialog$delegate;
                Function1 function1 = this.$shouldDisplayBlock;
                this.L$0 = c03;
                this.label = 1;
                Object objShouldDisplayPaywall = HelperFunctionsKt.shouldDisplayPaywall(function1, this);
                if (objShouldDisplayPaywall == objF) {
                    return objF;
                }
                c02 = c03;
                obj = objShouldDisplayPaywall;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c02 = (C0) this.L$0;
                v.b(obj);
            }
            PaywallDialogKt.PaywallDialog$lambda$2(c02, ((Boolean) obj).booleanValue());
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialog$1$1(Function1 function1, C0 c02, e eVar) {
        super(2, eVar);
        this.$shouldDisplayBlock = function1;
        this.$shouldDisplayDialog$delegate = c02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        PaywallDialogKt$PaywallDialog$1$1 paywallDialogKt$PaywallDialog$1$1 = new PaywallDialogKt$PaywallDialog$1$1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, eVar);
        paywallDialogKt$PaywallDialog$1$1.L$0 = obj;
        return paywallDialogKt$PaywallDialog$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((PaywallDialogKt$PaywallDialog$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AbstractC2605b.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v.b(obj);
        AbstractC1617k.d((O) this.L$0, null, null, new AnonymousClass1(this.$shouldDisplayBlock, this.$shouldDisplayDialog$delegate, null), 3, null);
        return L.f17438a;
    }
}
