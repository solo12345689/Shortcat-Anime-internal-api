package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Td.L;
import U.AbstractC2176m;
import U.E;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.AbstractActivityC2640j;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.SdkConfigurationStateKt;
import e.AbstractC4634b;
import g0.i;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterActivity;", "Landroidx/activity/j;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LTd/L;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterActivity extends AbstractActivityC2640j {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_WAS_LAUNCHED_THROUGH_SDK = "was_launched_through_sdk";

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/CustomerCenterActivity$Companion;", "", "()V", "EXTRA_WAS_LAUNCHED_THROUGH_SDK", "", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "createIntent$revenuecatui_defaultsBc8Release", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent createIntent$revenuecatui_defaultsBc8Release(Context context) {
            AbstractC5504s.h(context, "context");
            Intent intent = new Intent(context, (Class<?>) CustomerCenterActivity.class);
            intent.putExtra(CustomerCenterActivity.EXTRA_WAS_LAUNCHED_THROUGH_SDK, true);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06861 extends AbstractC5506u implements Function2 {
            final /* synthetic */ CustomerCenterActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06861(CustomerCenterActivity customerCenterActivity) {
                super(2);
                this.this$0 = customerCenterActivity;
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
                    AbstractC2454w.U(1428363188, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity.onCreate.<anonymous>.<anonymous> (CustomerCenterActivity.kt:52)");
                }
                e eVarF = s.f(e.f26613a, 0.0f, 1, null);
                interfaceC2425m.V(1948489528);
                boolean zU = interfaceC2425m.U(this.this$0);
                CustomerCenterActivity customerCenterActivity = this.this$0;
                Object objD = interfaceC2425m.D();
                if (zU || objD == InterfaceC2425m.f22370a.a()) {
                    objD = new CustomerCenterActivity$onCreate$1$1$1$1(customerCenterActivity);
                    interfaceC2425m.u(objD);
                }
                interfaceC2425m.O();
                CustomerCenterKt.CustomerCenter(eVarF, null, (InterfaceC5082a) objD, interfaceC2425m, 6, 2);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        AnonymousClass1() {
            super(2);
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
                AbstractC2454w.U(2072096008, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterActivity.onCreate.<anonymous> (CustomerCenterActivity.kt:46)");
            }
            E.a(AbstractC7015m.a(interfaceC2425m, 0) ? AbstractC2176m.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null) : AbstractC2176m.j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null), null, null, i.d(1428363188, true, new C06861(CustomerCenterActivity.this), interfaceC2425m, 54), interfaceC2425m, 3072, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SdkConfigurationStateKt.restoreSdkConfigurationIfNeeded(this, savedInstanceState);
        if (getIntent().getBooleanExtra(EXTRA_WAS_LAUNCHED_THROUGH_SDK, false) || Purchases.INSTANCE.isConfigured()) {
            AbstractC4634b.b(this, null, i.b(2072096008, true, new AnonymousClass1()), 1, null);
        } else {
            Logger.INSTANCE.e("CustomerCenterActivity was launched incorrectly. Please use ShowCustomerCenter activity result contract, CustomerCenter composable, or CustomerCenterView to display the Customer Center.");
            finish();
        }
    }

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        SdkConfigurationStateKt.saveSdkConfiguration(outState);
        super.onSaveInstanceState(outState);
    }
}
