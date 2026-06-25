package com.revenuecat.purchases.ui.revenuecatui.composables;

import E0.InterfaceC1292b;
import Td.L;
import Td.v;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1", f = "DisableTouchesComposable.kt", l = {22}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE0/L;", "LTd/L;", "<anonymous>", "(LE0/L;)V"}, k = 3, mv = {1, 8, 0})
final class DisableTouchesComposableKt$DisableTouchesComposable$1$1 extends l implements Function2 {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1$1", f = "DisableTouchesComposable.kt", l = {ColorExtractionConstants.ALPHA_CHANNEL_SHIFT}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE0/b;", "LTd/L;", "<anonymous>", "(LE0/b;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends k implements Function2 {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1292b interfaceC1292b, e eVar) {
            return ((AnonymousClass1) create(interfaceC1292b, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1292b interfaceC1292b;
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                interfaceC1292b = (InterfaceC1292b) this.L$0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1292b = (InterfaceC1292b) this.L$0;
                v.b(obj);
            }
            do {
                this.L$0 = interfaceC1292b;
                this.label = 1;
            } while (InterfaceC1292b.D1(interfaceC1292b, null, this, 1, null) != objF);
            return objF;
        }
    }

    DisableTouchesComposableKt$DisableTouchesComposable$1$1(e eVar) {
        super(2, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        DisableTouchesComposableKt$DisableTouchesComposable$1$1 disableTouchesComposableKt$DisableTouchesComposable$1$1 = new DisableTouchesComposableKt$DisableTouchesComposable$1$1(eVar);
        disableTouchesComposableKt$DisableTouchesComposable$1$1.L$0 = obj;
        return disableTouchesComposableKt$DisableTouchesComposable$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(E0.L l10, e eVar) {
        return ((DisableTouchesComposableKt$DisableTouchesComposable$1$1) create(l10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            E0.L l10 = (E0.L) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (l10.k1(anonymousClass1, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
        }
        return L.f17438a;
    }
}
