package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Y.X;
import Y.Y;
import android.app.Activity;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.r;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY/Y;", "LY/X;", "invoke", "(LY/Y;)LY/X;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$InternalCustomerCenter$4$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ r $lifecycleOwner;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC2857k.a.values().length];
            try {
                iArr[AbstractC2857k.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2857k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC2857k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$InternalCustomerCenter$4$1(r rVar, CustomerCenterViewModel customerCenterViewModel, Activity activity) {
        super(1);
        this.$lifecycleOwner = rVar;
        this.$viewModel = customerCenterViewModel;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CustomerCenterViewModel customerCenterViewModel, Activity activity, r rVar, AbstractC2857k.a event) {
        AbstractC5504s.h(rVar, "<anonymous parameter 0>");
        AbstractC5504s.h(event, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            customerCenterViewModel.onActivityStopped(activity != null && activity.isChangingConfigurations());
        } else if (i10 == 2) {
            customerCenterViewModel.onActivityStarted();
        } else {
            if (i10 != 3) {
                return;
            }
            customerCenterViewModel.onActivityResumed();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final X invoke(Y DisposableEffect) {
        AbstractC5504s.h(DisposableEffect, "$this$DisposableEffect");
        final CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
        final Activity activity = this.$activity;
        final InterfaceC2861o interfaceC2861o = new InterfaceC2861o() { // from class: com.revenuecat.purchases.ui.revenuecatui.customercenter.a
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(r rVar, AbstractC2857k.a aVar) {
                InternalCustomerCenterKt$InternalCustomerCenter$4$1.invoke$lambda$0(customerCenterViewModel, activity, rVar, aVar);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(interfaceC2861o);
        final r rVar = this.$lifecycleOwner;
        return new X() { // from class: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$4$1$invoke$$inlined$onDispose$1
            @Override // Y.X
            public void dispose() {
                rVar.getLifecycle().removeObserver(interfaceC2861o);
            }
        };
    }
}
