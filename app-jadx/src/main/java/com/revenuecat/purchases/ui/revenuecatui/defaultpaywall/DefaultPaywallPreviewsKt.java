package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Td.L;
import U.AbstractC2176m;
import U.D;
import U.E;
import Ud.AbstractC2279u;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import androidx.compose.foundation.b;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DualColorImageGenerator;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import g0.i;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import x.AbstractC7015m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0002\u001a!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LTd/L;", "DefaultPaywallRedGreenPreview", "(LY/m;I)V", "DefaultPaywallBlueGreenPreview", "DefaultPaywallPurpleOrangePreview", "DefaultPaywallWarningLocalizationPreview", "DefaultPaywallWarningNoPaywallPreview", "Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;", "icon", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;", "warning", "DefaultPaywallPreview", "(Lcom/revenuecat/purchases/ui/revenuecatui/defaultpaywall/DualColorImageGenerator$PreviewAppIcon;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/PaywallWarning;LY/m;I)V", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "previewPackages", "Ljava/util/List;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DefaultPaywallPreviewsKt {
    private static final List<TemplateConfiguration.PackageInfo> previewPackages;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallBlueGreenPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallPreviewsKt.DefaultPaywallBlueGreenPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44331 extends AbstractC5506u implements Function2 {
        final /* synthetic */ DualColorImageGenerator.PreviewAppIcon $icon;
        final /* synthetic */ PaywallWarning $warning;

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallPreview$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C06941 extends AbstractC5506u implements Function1 {
            public static final C06941 INSTANCE = new C06941();

            C06941() {
                super(1);
            }

            public final void invoke(TemplateConfiguration.PackageInfo it) {
                AbstractC5504s.h(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TemplateConfiguration.PackageInfo) obj);
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallPreview$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass2 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m797invoke() {
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m797invoke();
                return L.f17438a;
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallPreview$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class AnonymousClass3 extends AbstractC5506u implements InterfaceC5082a {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            AnonymousClass3() {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m798invoke() {
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m798invoke();
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44331(PaywallWarning paywallWarning, DualColorImageGenerator.PreviewAppIcon previewAppIcon) {
            super(2);
            this.$warning = paywallWarning;
            this.$icon = previewAppIcon;
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
                AbstractC2454w.U(2020893435, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreview.<anonymous> (DefaultPaywallPreviews.kt:117)");
            }
            DefaultPaywallViewKt.DefaultPaywallView(DefaultPaywallPreviewsKt.previewPackages, (TemplateConfiguration.PackageInfo) AbstractC2279u.m0(DefaultPaywallPreviewsKt.previewPackages), this.$warning, C06941.INSTANCE, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, b.d(e.f26613a, D.f17597a.a(interfaceC2425m, D.f17598b).c(), null, 2, null), new DefaultPaywallPreviewOverrides("RevenueCat", this.$icon.getBitmap(), this.$icon.getProminentColors(), Boolean.TRUE), interfaceC2425m, 224256, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallPreview$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ DualColorImageGenerator.PreviewAppIcon $icon;
        final /* synthetic */ PaywallWarning $warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DualColorImageGenerator.PreviewAppIcon previewAppIcon, PaywallWarning paywallWarning, int i10) {
            super(2);
            this.$icon = previewAppIcon;
            this.$warning = paywallWarning;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallPreviewsKt.DefaultPaywallPreview(this.$icon, this.$warning, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallPurpleOrangePreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44341 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44341(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallPreviewsKt.DefaultPaywallPurpleOrangePreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallRedGreenPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44351 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44351(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallPreviewsKt.DefaultPaywallRedGreenPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallWarningLocalizationPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44361 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44361(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallPreviewsKt.DefaultPaywallWarningLocalizationPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewsKt$DefaultPaywallWarningNoPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44371 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44371(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            DefaultPaywallPreviewsKt.DefaultPaywallWarningNoPaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    static {
        TestData.Packages packages = TestData.Packages.INSTANCE;
        List<Package> listP = AbstractC2279u.p(packages.getAnnual(), packages.getMonthly());
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listP, 10));
        for (Package r22 : listP) {
            arrayList.add(new TemplateConfiguration.PackageInfo(r22, new ProcessedLocalizedConfiguration(r22.getProduct().getName(), null, "Continue", null, null, null, null, null, r22.getProduct().getName(), null, null, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null), null));
        }
        previewPackages = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaywallBlueGreenPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(657651692);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(657651692, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallBlueGreenPreview (DefaultPaywallPreviews.kt:61)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getBlueGreen(), null, interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaywallPreview(DualColorImageGenerator.PreviewAppIcon previewAppIcon, PaywallWarning paywallWarning, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1946056999);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(previewAppIcon) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(paywallWarning) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1946056999, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreview (DefaultPaywallPreviews.kt:114)");
            }
            E.a(AbstractC7015m.a(interfaceC2425mG, 0) ? AbstractC2176m.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null) : AbstractC2176m.j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null), null, null, i.d(2020893435, true, new C44331(paywallWarning, previewAppIcon), interfaceC2425mG, 54), interfaceC2425mG, 3072, 6);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(previewAppIcon, paywallWarning, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaywallPurpleOrangePreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(361581643);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(361581643, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPurpleOrangePreview (DefaultPaywallPreviews.kt:75)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getPurpleOrange(), null, interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44341(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaywallRedGreenPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-848283725);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-848283725, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallRedGreenPreview (DefaultPaywallPreviews.kt:47)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getRedGreen(), null, interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44351(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaywallWarningLocalizationPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-197693384);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-197693384, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarningLocalizationPreview (DefaultPaywallPreviews.kt:89)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getRedGreen(), PaywallWarning.MissingLocalization.INSTANCE, interfaceC2425mG, 48);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44361(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPaywallWarningNoPaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-684325386);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-684325386, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarningNoPaywallPreview (DefaultPaywallPreviews.kt:103)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getPurpleOrange(), new PaywallWarning.NoPaywall("WAT"), interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44371(i10));
        }
    }
}
