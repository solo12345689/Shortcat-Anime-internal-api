package com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs;

import C.I;
import Td.L;
import U.AbstractC2166c;
import U.AbstractC2174k;
import U.D;
import U.j0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import com.emergetools.snapshots.annotations.EmergeSnapshotConfig;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import g0.i;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aK\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;", "state", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "Lkotlin/Function0;", "LTd/L;", "onDismiss", "onRestore", "onContactSupport", "RestorePurchasesDialog", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;Lie/a;LY/m;I)V", "RestoringDialog", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LY/m;I)V", "PurchasesRecoveredDialog", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;LY/m;I)V", "PurchasesNotFoundDialog", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Lie/a;Lie/a;LY/m;II)V", "RestorePurchasesDialogRestoringPreview", "(LY/m;I)V", "RestorePurchasesDialogRecoveredPreview", "RestorePurchasesDialogNotFoundPreview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class RestorePurchasesDialogKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onContactSupport;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$1$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06871 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ CustomerCenterConfigData.Localization $localization;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06871(CustomerCenterConfigData.Localization localization) {
                super(3);
                this.$localization = localization;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(I TextButton, InterfaceC2425m interfaceC2425m, int i10) {
                AbstractC5504s.h(TextButton, "$this$TextButton");
                if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(1149789201, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous>.<anonymous> (RestorePurchasesDialog.kt:136)");
                }
                j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.CONTACT_SUPPORT), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC5082a interfaceC5082a, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onContactSupport = interfaceC5082a;
            this.$localization = localization;
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
                AbstractC2454w.U(2084079289, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:134)");
            }
            InterfaceC5082a interfaceC5082a = this.$onContactSupport;
            if (interfaceC5082a != null) {
                AbstractC2174k.c(interfaceC5082a, null, false, null, null, null, null, null, null, i.d(1149789201, true, new C06871(this.$localization), interfaceC2425m, 54), interfaceC2425m, 805306368, 510);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onDismiss;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$2$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ CustomerCenterConfigData.Localization $localization;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerCenterConfigData.Localization localization) {
                super(3);
                this.$localization = localization;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(I TextButton, InterfaceC2425m interfaceC2425m, int i10) {
                AbstractC5504s.h(TextButton, "$this$TextButton");
                if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(-221760264, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous>.<anonymous> (RestorePurchasesDialog.kt:146)");
                }
                j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DISMISS), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC5082a interfaceC5082a, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onDismiss = interfaceC5082a;
            this.$localization = localization;
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
                AbstractC2454w.U(-1053355717, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:145)");
            }
            AbstractC2174k.c(this.$onDismiss, null, false, null, null, null, null, null, null, i.d(-221760264, true, new AnonymousClass1(this.$localization), interfaceC2425m, 54), interfaceC2425m, 805306368, 510);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(104176573, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:118)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_NOT_FOUND), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425m, D.f17598b).j(), interfaceC2425m, 0, 0, 65534);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass4 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(682942718, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesNotFoundDialog.<anonymous> (RestorePurchasesDialog.kt:126)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_NOT_RECOVERED), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425m, D.f17598b).b(), interfaceC2425m, 0, 0, 65534);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesNotFoundDialog$5 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onContactSupport;
        final /* synthetic */ InterfaceC5082a $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(CustomerCenterConfigData.Localization localization, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, int i10, int i11) {
            super(2);
            this.$localization = localization;
            this.$onDismiss = interfaceC5082a;
            this.$onContactSupport = interfaceC5082a2;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.PurchasesNotFoundDialog(this.$localization, this.$onDismiss, this.$onContactSupport, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesRecoveredDialog$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43401 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onDismiss;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesRecoveredDialog$1$1 */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06881 extends AbstractC5506u implements InterfaceC5096o {
            final /* synthetic */ CustomerCenterConfigData.Localization $localization;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06881(CustomerCenterConfigData.Localization localization) {
                super(3);
                this.$localization = localization;
            }

            @Override // ie.InterfaceC5096o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
                return L.f17438a;
            }

            public final void invoke(I TextButton, InterfaceC2425m interfaceC2425m, int i10) {
                AbstractC5504s.h(TextButton, "$this$TextButton");
                if ((i10 & 17) == 16 && interfaceC2425m.i()) {
                    interfaceC2425m.K();
                    return;
                }
                if (AbstractC2454w.L()) {
                    AbstractC2454w.U(-1528989004, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous>.<anonymous> (RestorePurchasesDialog.kt:99)");
                }
                j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DONE), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC2425m, 0, 0, 131070);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43401(InterfaceC5082a interfaceC5082a, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onDismiss = interfaceC5082a;
            this.$localization = localization;
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
                AbstractC2454w.U(1752184593, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous> (RestorePurchasesDialog.kt:98)");
            }
            AbstractC2174k.c(this.$onDismiss, null, false, null, null, null, null, null, null, i.d(-1528989004, true, new C06881(this.$localization), interfaceC2425m, 54), interfaceC2425m, 805306368, 510);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesRecoveredDialog$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43412 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43412(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(90877325, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous> (RestorePurchasesDialog.kt:82)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RECOVERED), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425m, D.f17598b).j(), interfaceC2425m, 0, 0, 65534);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesRecoveredDialog$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43423 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43423(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(-324449492, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog.<anonymous> (RestorePurchasesDialog.kt:90)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425m, D.f17598b).b(), interfaceC2425m, 0, 0, 65534);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$PurchasesRecoveredDialog$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43434 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43434(CustomerCenterConfigData.Localization localization, InterfaceC5082a interfaceC5082a, int i10) {
            super(2);
            this.$localization = localization;
            this.$onDismiss = interfaceC5082a;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.PurchasesRecoveredDialog(this.$localization, this.$onDismiss, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialog$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C43442 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ InterfaceC5082a $onContactSupport;
        final /* synthetic */ InterfaceC5082a $onDismiss;
        final /* synthetic */ InterfaceC5082a $onRestore;
        final /* synthetic */ RestorePurchasesState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43442(RestorePurchasesState restorePurchasesState, CustomerCenterConfigData.Localization localization, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, int i10) {
            super(2);
            this.$state = restorePurchasesState;
            this.$localization = localization;
            this.$onDismiss = interfaceC5082a;
            this.$onRestore = interfaceC5082a2;
            this.$onContactSupport = interfaceC5082a3;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.RestorePurchasesDialog(this.$state, this.$localization, this.$onDismiss, this.$onRestore, this.$onContactSupport, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43451 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43451 INSTANCE = new C43451();

        C43451() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m689invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m689invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43462 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43462 INSTANCE = new C43462();

        C43462() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m690invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m690invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43473 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43473 INSTANCE = new C43473();

        C43473() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m691invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m691invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogNotFoundPreview$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43484 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43484(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.RestorePurchasesDialogNotFoundPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43491 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43491 INSTANCE = new C43491();

        C43491() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m692invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m692invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43502 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43502 INSTANCE = new C43502();

        C43502() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m693invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m693invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43513 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43513 INSTANCE = new C43513();

        C43513() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m694invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m694invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRecoveredPreview$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43524 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43524(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.RestorePurchasesDialogRecoveredPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43531 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43531 INSTANCE = new C43531();

        C43531() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m695invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m695invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43542 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43542 INSTANCE = new C43542();

        C43542() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m696invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m696invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43553 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43553 INSTANCE = new C43553();

        C43553() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m697invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m697invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestorePurchasesDialogRestoringPreview$4 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43564 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43564(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.RestorePurchasesDialogRestoringPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestoringDialog$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43571 extends AbstractC5506u implements InterfaceC5082a {
        public static final C43571 INSTANCE = new C43571();

        C43571() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke */
        public final void m698invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m698invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestoringDialog$2 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43582 extends AbstractC5506u implements Function2 {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43582(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                AbstractC2454w.U(1131714747, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestoringDialog.<anonymous> (RestorePurchasesDialog.kt:54)");
            }
            j0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASES_RESTORING), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, D.f17597a.c(interfaceC2425m, D.f17598b).j(), interfaceC2425m, 0, 0, 65534);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt$RestoringDialog$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43593 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43593(CustomerCenterConfigData.Localization localization, int i10) {
            super(2);
            this.$localization = localization;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            RestorePurchasesDialogKt.RestoringDialog(this.$localization, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestorePurchasesState.values().length];
            try {
                iArr[RestorePurchasesState.PURCHASES_RECOVERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestorePurchasesState.PURCHASES_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestorePurchasesState.RESTORING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PurchasesNotFoundDialog(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r25, ie.InterfaceC5082a r26, ie.InterfaceC5082a r27, Y.InterfaceC2425m r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogKt.PurchasesNotFoundDialog(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, ie.a, ie.a, Y.m, int, int):void");
    }

    public static final void PurchasesRecoveredDialog(CustomerCenterConfigData.Localization localization, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1735282777);
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425mG.F(localization) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC5082a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1735282777, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.PurchasesRecoveredDialog (RestorePurchasesDialog.kt:78)");
            }
            interfaceC2425m2 = interfaceC2425mG;
            AbstractC2166c.a(interfaceC5082a, i.d(1752184593, true, new C43401(interfaceC5082a, localization), interfaceC2425mG, 54), null, null, null, i.d(90877325, true, new C43412(localization), interfaceC2425mG, 54), i.d(-324449492, true, new C43423(localization), interfaceC2425mG, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, interfaceC2425m2, ((i11 >> 3) & 14) | 1769520, 0, 16284);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C43434(localization, interfaceC5082a, i10));
        }
    }

    public static final /* synthetic */ void RestorePurchasesDialog(RestorePurchasesState state, CustomerCenterConfigData.Localization localization, InterfaceC5082a onDismiss, InterfaceC5082a onRestore, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC5082a interfaceC5082a2;
        CustomerCenterConfigData.Localization localization2;
        InterfaceC5082a interfaceC5082a3;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(localization, "localization");
        AbstractC5504s.h(onDismiss, "onDismiss");
        AbstractC5504s.h(onRestore, "onRestore");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1558153315);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(localization) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(onDismiss) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.F(onRestore) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC5082a) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC5082a2 = onDismiss;
            localization2 = localization;
            interfaceC5082a3 = interfaceC5082a;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1558153315, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialog (RestorePurchasesDialog.kt:28)");
            }
            int i12 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i12 == 1) {
                interfaceC5082a2 = onDismiss;
                localization2 = localization;
                interfaceC5082a3 = interfaceC5082a;
                interfaceC2425mG.V(-583327083);
                PurchasesRecoveredDialog(localization2, interfaceC5082a2, interfaceC2425mG, (i11 >> 3) & 126);
                interfaceC2425mG.O();
            } else if (i12 != 2) {
                if (i12 != 3) {
                    interfaceC2425mG.V(-902851391);
                    interfaceC2425mG.O();
                } else {
                    interfaceC2425mG.V(-583314999);
                    RestoringDialog(localization, interfaceC2425mG, (i11 >> 3) & 14);
                    L l10 = L.f17438a;
                    onRestore.invoke();
                    interfaceC2425mG.O();
                }
                interfaceC5082a2 = onDismiss;
                localization2 = localization;
                interfaceC5082a3 = interfaceC5082a;
            } else {
                interfaceC2425mG.V(-583322607);
                interfaceC5082a2 = onDismiss;
                PurchasesNotFoundDialog(localization, interfaceC5082a2, interfaceC5082a, interfaceC2425mG, ((i11 >> 3) & 126) | ((i11 >> 6) & 896), 0);
                localization2 = localization;
                interfaceC5082a3 = interfaceC5082a;
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43442(state, localization2, interfaceC5082a2, onRestore, interfaceC5082a3, i10));
        }
    }

    @EmergeSnapshotConfig(ignore = true)
    public static final void RestorePurchasesDialogNotFoundPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-789679044);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-789679044, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogNotFoundPreview (RestorePurchasesDialog.kt:185)");
            }
            RestorePurchasesDialog(RestorePurchasesState.PURCHASES_NOT_FOUND, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), C43451.INSTANCE, C43462.INSTANCE, C43473.INSTANCE, interfaceC2425mG, 28038);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43484(i10));
        }
    }

    @EmergeSnapshotConfig(ignore = true)
    public static final void RestorePurchasesDialogRecoveredPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1527727452);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1527727452, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogRecoveredPreview (RestorePurchasesDialog.kt:172)");
            }
            RestorePurchasesDialog(RestorePurchasesState.PURCHASES_RECOVERED, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), C43491.INSTANCE, C43502.INSTANCE, C43513.INSTANCE, interfaceC2425mG, 28038);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43524(i10));
        }
    }

    @EmergeSnapshotConfig(ignore = true)
    public static final void RestorePurchasesDialogRestoringPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2037934116);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2037934116, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesDialogRestoringPreview (RestorePurchasesDialog.kt:159)");
            }
            RestorePurchasesDialog(RestorePurchasesState.RESTORING, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), C43531.INSTANCE, C43542.INSTANCE, C43553.INSTANCE, interfaceC2425mG, 28038);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C43564(i10));
        }
    }

    public static final void RestoringDialog(CustomerCenterConfigData.Localization localization, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1621839505);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(localization) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1621839505, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestoringDialog (RestorePurchasesDialog.kt:50)");
            }
            C43571 c43571 = C43571.INSTANCE;
            ComposableSingletons$RestorePurchasesDialogKt composableSingletons$RestorePurchasesDialogKt = ComposableSingletons$RestorePurchasesDialogKt.INSTANCE;
            interfaceC2425m2 = interfaceC2425mG;
            AbstractC2166c.a(c43571, composableSingletons$RestorePurchasesDialogKt.m687getLambda1$revenuecatui_defaultsBc8Release(), null, null, null, i.d(1131714747, true, new C43582(localization), interfaceC2425mG, 54), composableSingletons$RestorePurchasesDialogKt.m688getLambda2$revenuecatui_defaultsBc8Release(), null, 0L, 0L, 0L, 0L, 0.0f, null, interfaceC2425m2, 1769526, 0, 16284);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C43593(localization, i10));
        }
    }
}
