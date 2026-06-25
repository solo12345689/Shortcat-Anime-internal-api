package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import Ef.a;
import Ef.c;
import Gf.AbstractC1617k;
import Gf.F0;
import Gf.O;
import Gf.Z;
import Jf.AbstractC1744g;
import Jf.I;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import Td.v;
import Y.C0;
import Zd.e;
import ae.AbstractC2605b;
import androidx.lifecycle.r;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1", f = "CountdownComponentState.kt", l = {92}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
final class CountdownComponentStateKt$rememberCountdownState$1$1 extends l implements Function2 {
    final /* synthetic */ C0 $countdownTime$delegate;
    final /* synthetic */ C0 $isCountingEnabled$delegate;
    final /* synthetic */ r $lifecycleOwner;
    final /* synthetic */ Date $targetDate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1", f = "CountdownComponentState.kt", l = {74}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ C0 $isCountingEnabled$delegate;
        final /* synthetic */ r $lifecycleOwner;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(r rVar, C0 c02, e eVar) {
            super(2, eVar);
            this.$lifecycleOwner = rVar;
            this.$isCountingEnabled$delegate = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass1(this.$lifecycleOwner, this.$isCountingEnabled$delegate, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((AnonymousClass1) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                final I currentStateFlow = this.$lifecycleOwner.getLifecycle().getCurrentStateFlow();
                InterfaceC1742e interfaceC1742eI = AbstractC1744g.i(new InterfaceC1742e() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LTd/L;", "emit", "(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class AnonymousClass2<T> implements InterfaceC1743f {
                        final /* synthetic */ InterfaceC1743f $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                        @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1$2", f = "CountdownComponentState.kt", l = {223}, m = "emit")
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        public static final class AnonymousClass1 extends d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(e eVar) {
                                super(eVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC1743f interfaceC1743f) {
                            this.$this_unsafeFlow = interfaceC1743f;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // Jf.InterfaceC1743f
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, Zd.e r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = ae.AbstractC2605b.f()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                Td.v.b(r6)
                                goto L4b
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                Td.v.b(r6)
                                Jf.f r6 = r4.$this_unsafeFlow
                                androidx.lifecycle.k$b r5 = (androidx.lifecycle.AbstractC2857k.b) r5
                                androidx.lifecycle.k$b r2 = androidx.lifecycle.AbstractC2857k.b.f30238d
                                boolean r5 = r5.b(r2)
                                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L4b
                                return r1
                            L4b:
                                Td.L r5 = Td.L.f17438a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, Zd.e):java.lang.Object");
                        }
                    }

                    @Override // Jf.InterfaceC1742e
                    public Object collect(InterfaceC1743f interfaceC1743f, e eVar) {
                        Object objCollect = currentStateFlow.collect(new AnonymousClass2(interfaceC1743f), eVar);
                        return objCollect == AbstractC2605b.f() ? objCollect : L.f17438a;
                    }
                });
                final C0 c02 = this.$isCountingEnabled$delegate;
                InterfaceC1743f interfaceC1743f = new InterfaceC1743f() { // from class: com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt.rememberCountdownState.1.1.1.2
                    @Override // Jf.InterfaceC1743f
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit(((Boolean) obj2).booleanValue(), eVar);
                    }

                    public final Object emit(boolean z10, e eVar) {
                        CountdownComponentStateKt.rememberCountdownState$lambda$6(c02, z10);
                        return L.f17438a;
                    }
                };
                this.label = 1;
                if (interfaceC1742eI.collect(interfaceC1743f, this) == objF) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountdownComponentStateKt$rememberCountdownState$1$1(Date date, r rVar, C0 c02, C0 c03, e eVar) {
        super(2, eVar);
        this.$targetDate = date;
        this.$lifecycleOwner = rVar;
        this.$isCountingEnabled$delegate = c02;
        this.$countdownTime$delegate = c03;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final e create(Object obj, e eVar) {
        CountdownComponentStateKt$rememberCountdownState$1$1 countdownComponentStateKt$rememberCountdownState$1$1 = new CountdownComponentStateKt$rememberCountdownState$1$1(this.$targetDate, this.$lifecycleOwner, this.$isCountingEnabled$delegate, this.$countdownTime$delegate, eVar);
        countdownComponentStateKt$rememberCountdownState$1$1.L$0 = obj;
        return countdownComponentStateKt$rememberCountdownState$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(O o10, e eVar) {
        return ((CountdownComponentStateKt$rememberCountdownState$1$1) create(o10, eVar)).invokeSuspend(L.f17438a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        O o10;
        long jS;
        Object objF = AbstractC2605b.f();
        int i10 = this.label;
        if (i10 == 0) {
            v.b(obj);
            O o11 = (O) this.L$0;
            AbstractC1617k.d(o11, null, null, new AnonymousClass1(this.$lifecycleOwner, this.$isCountingEnabled$delegate, null), 3, null);
            o10 = o11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o10 = (O) this.L$0;
            v.b(obj);
        }
        do {
            if (F0.n(o10.getCoroutineContext())) {
                if (CountdownComponentStateKt.rememberCountdownState$lambda$5(this.$isCountingEnabled$delegate)) {
                    long time = this.$targetDate.getTime() - new Date().getTime();
                    if (time <= 0) {
                        this.$countdownTime$delegate.setValue(CountdownTime.INSTANCE.getZERO());
                    } else {
                        this.$countdownTime$delegate.setValue(CountdownTime.INSTANCE.fromInterval(time));
                    }
                }
                a.C0060a c0060a = a.f5961b;
                jS = c.s(1, Ef.d.f5971e);
                this.L$0 = o10;
                this.label = 1;
            }
            return L.f17438a;
        } while (Z.b(jS, this) != objF);
        return objF;
    }
}
