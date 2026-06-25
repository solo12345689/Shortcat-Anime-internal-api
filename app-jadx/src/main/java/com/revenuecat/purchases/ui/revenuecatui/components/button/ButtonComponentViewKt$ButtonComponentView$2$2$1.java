package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Gf.AbstractC1617k;
import Gf.O;
import Td.L;
import Td.v;
import Y.C0;
import Zd.e;
import ae.AbstractC2605b;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ButtonComponentViewKt$ButtonComponentView$2$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ButtonComponentState $buttonState;
    final /* synthetic */ O $coroutineScope;
    final /* synthetic */ C0 $myActionInProgress$delegate;
    final /* synthetic */ Function2 $onClick;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2$2$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2$2$1$1", f = "ButtonComponentView.kt", l = {139}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ ButtonComponentState $buttonState;
        final /* synthetic */ C0 $myActionInProgress$delegate;
        final /* synthetic */ Function2 $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function2 function2, ButtonComponentState buttonComponentState, PaywallState.Loaded.Components components, C0 c02, e eVar) {
            super(2, eVar);
            this.$onClick = function2;
            this.$buttonState = buttonComponentState;
            this.$state = components;
            this.$myActionInProgress$delegate = c02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new AnonymousClass1(this.$onClick, this.$buttonState, this.$state, this.$myActionInProgress$delegate, eVar);
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
                Function2 function2 = this.$onClick;
                PaywallAction action = this.$buttonState.getAction();
                this.label = 1;
                if (function2.invoke(action, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            ButtonComponentViewKt.AnonymousClass2.invoke$lambda$3(this.$myActionInProgress$delegate, false);
            PaywallState.Loaded.Components.update$default(this.$state, null, null, b.a(false), 3, null);
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonComponentViewKt$ButtonComponentView$2$2$1(PaywallState.Loaded.Components components, O o10, C0 c02, Function2 function2, ButtonComponentState buttonComponentState) {
        super(0);
        this.$state = components;
        this.$coroutineScope = o10;
        this.$myActionInProgress$delegate = c02;
        this.$onClick = function2;
        this.$buttonState = buttonComponentState;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m400invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m400invoke() {
        ButtonComponentViewKt.AnonymousClass2.invoke$lambda$3(this.$myActionInProgress$delegate, true);
        PaywallState.Loaded.Components.update$default(this.$state, null, null, Boolean.TRUE, 3, null);
        AbstractC1617k.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$onClick, this.$buttonState, this.$state, this.$myActionInProgress$delegate, null), 3, null);
    }
}
