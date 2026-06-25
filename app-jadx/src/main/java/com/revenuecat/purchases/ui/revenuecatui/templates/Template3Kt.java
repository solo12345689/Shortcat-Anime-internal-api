package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.G;
import C.InterfaceC1138i;
import C.J;
import C.K;
import I0.B;
import J.i;
import K0.InterfaceC1788g;
import R0.C;
import R0.r;
import Td.L;
import U.D;
import U0.Y0;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import Y0.L;
import android.net.Uri;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import p0.AbstractC5912g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\n\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\f\u001a&\u0010\u0012\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "LTd/L;", "Template3", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "LC/i;", "PortraitContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "LandscapeContent", "Icon", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V", "Title", "Li1/h;", "spacing", "Features-TDGSqEk", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;FLY/m;I)V", "Features", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "feature", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;", "colors", "Feature", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$Colors;LY/m;I)V", "Template3Preview", "(LY/m;I)V", "Template3FooterPreview", "Template3CondensedFooterPreview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template3Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Feature$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(C semantics) {
            AbstractC5504s.h(semantics, "$this$semantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Feature$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.LocalizedConfiguration.Feature $feature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$feature = feature;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Feature(this.$feature, this.$colors, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Icon$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44631 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44631(PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Icon(this.$state, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$LandscapeContent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$this_LandscapeContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.LandscapeContent(this.$this_LandscapeContent, this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$PortraitContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44642 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44642(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$this_PortraitContent = interfaceC1138i;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.PortraitContent(this.$this_PortraitContent, this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44652 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44652(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Template3(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3CondensedFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44661 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44661 INSTANCE = new C44661();

        C44661() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m885invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m885invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3CondensedFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44672 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44672(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Template3CondensedFooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3FooterPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44681 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44681 INSTANCE = new C44681();

        C44681() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m886invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m886invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3FooterPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44692 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44692(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Template3FooterPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3Preview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44701 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44701 INSTANCE = new C44701();

        C44701() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m887invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m887invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3Preview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44712 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44712(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Template3Preview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Title$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44721 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44721(PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template3Kt.Title(this.$state, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-840535719);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(feature) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(colors) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-840535719, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template3.kt:198)");
            }
            e.a aVar = e.f52304a;
            e.c cVarL = aVar.l();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarH = s.h(aVar2, 0.0f, 1, null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarK = p.k(eVarH, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            Template3UIConstants template3UIConstants = Template3UIConstants.INSTANCE;
            androidx.compose.ui.e eVarE = r.e(p.m(eVarK, 0.0f, C5015h.n(template3UIConstants.m892getIconPaddingD9Ej5fM() * 2), 0.0f, 0.0f, 13, null), true, AnonymousClass1.INSTANCE);
            C1131b c1131b = C1131b.f2093a;
            B b10 = G.b(c1131b.g(), cVarL, interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarE);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, b10, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            J j10 = J.f2025a;
            String iconID = feature.getIconID();
            PaywallIconName paywallIconNameFromValue = iconID != null ? PaywallIconName.INSTANCE.fromValue(iconID) : null;
            interfaceC2425mG.V(-115319316);
            if (paywallIconNameFromValue != null) {
                androidx.compose.ui.e eVarD = b.d(AbstractC5912g.a(s.r(aVar2, template3UIConstants.m888getFeatureIconSizeD9Ej5fM()), i.g()), colors.m779getAccent20d7_KjU(), null, 2, null);
                B bH = f.h(aVar.o(), false);
                int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR2 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarD);
                InterfaceC5082a interfaceC5082aA2 = aVar3.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA2);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB2, bH, aVar3.e());
                m2.e(interfaceC2425mB2, iR2, aVar3.g());
                Function2 function2B2 = aVar3.b();
                if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                    interfaceC2425mB2.u(Integer.valueOf(iA2));
                    interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
                }
                m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
                h hVar = h.f26161a;
                PaywallIconKt.m607PaywallIconFNF3uiM(paywallIconNameFromValue, p.i(aVar2, template3UIConstants.m892getIconPaddingD9Ej5fM()), colors.m778getAccent10d7_KjU(), interfaceC2425mG, 48, 0);
                interfaceC2425mG.x();
                L l10 = L.f17438a;
            }
            interfaceC2425mG.O();
            androidx.compose.ui.e eVarM = p.m(aVar2, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            B bA = AbstractC1136g.a(c1131b.h(), aVar.k(), interfaceC2425mG, 0);
            int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR3 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarM);
            InterfaceC5082a interfaceC5082aA3 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA3);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB3, bA, aVar3.e());
            m2.e(interfaceC2425mB3, iR3, aVar3.g());
            Function2 function2B3 = aVar3.b();
            if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                interfaceC2425mB3.u(Integer.valueOf(iA3));
                interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
            }
            m2.e(interfaceC2425mB3, eVarF3, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            D d10 = D.f17597a;
            int i12 = D.f17598b;
            Y0 y0B = d10.c(interfaceC2425mG, i12).b();
            L.a aVar4 = Y0.L.f22613b;
            Y0.L lB = aVar4.b();
            C4830j.a aVar5 = C4830j.f47278b;
            MarkdownKt.m594MarkdownDkhmgE0(feature.getTitle(), null, colors.m786getText10d7_KjU(), y0B, 0L, lB, null, null, C4830j.h(aVar5.f()), false, true, false, interfaceC2425mG, 196608, 54, 722);
            String content = feature.getContent();
            interfaceC2425mG.V(-929124297);
            if (content == null) {
                interfaceC2425m2 = interfaceC2425mG;
            } else {
                interfaceC2425m2 = interfaceC2425mG;
                MarkdownKt.m594MarkdownDkhmgE0(content, null, colors.m787getText20d7_KjU(), d10.c(interfaceC2425mG, i12).c(), 0L, aVar4.g(), null, null, C4830j.h(aVar5.f()), false, true, false, interfaceC2425m2, 196608, 54, 722);
                Td.L l11 = Td.L.f17438a;
            }
            interfaceC2425m2.O();
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(feature, colors, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Features-TDGSqEk, reason: not valid java name */
    public static final void m883FeaturesTDGSqEk(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, float f10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2122368427);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.b(f10) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2122368427, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template3.kt:172)");
            }
            List<PaywallData.LocalizedConfiguration.Feature> features = PaywallStateKt.getSelectedLocalization(legacy).getFeatures();
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0);
            if (features.isEmpty()) {
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                B1 b1K = interfaceC2425mG.k();
                if (b1K != null) {
                    b1K.a(new Template3Kt$Features$1(interfaceC1138i, legacy, f10, i10));
                    return;
                }
                return;
            }
            androidx.compose.ui.e eVarD = s.d(InterfaceC1138i.c(interfaceC1138i, m.f(androidx.compose.ui.e.f26613a, m.c(0, interfaceC2425mG, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
            C1131b c1131b = C1131b.f2093a;
            e.a aVar = l0.e.f52304a;
            B bA = AbstractC1136g.a(c1131b.q(f10, aVar.i()), aVar.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarD);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            interfaceC2425mG.V(-1766546977);
            Iterator<T> it = features.iterator();
            while (it.hasNext()) {
                Feature((PaywallData.LocalizedConfiguration.Feature) it.next(), currentColors, interfaceC2425mG, 0);
            }
            interfaceC2425mG.O();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K2 = interfaceC2425mG.k();
        if (b1K2 != null) {
            b1K2.a(new Template3Kt$Features$3(interfaceC1138i, legacy, f10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Icon(PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-743688035);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-743688035, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Icon (Template3.kt:144)");
            }
            Uri iconUri = legacy.getTemplateConfiguration().getImages().getIconUri();
            Template3UIConstants template3UIConstants = Template3UIConstants.INSTANCE;
            IconImageKt.m584IconImagedjqsMU(iconUri, template3UIConstants.m893getIconSizeD9Ej5fM(), template3UIConstants.m891getIconCornerRadiusD9Ej5fM(), p.m(androidx.compose.ui.e.f26613a, 0.0f, UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), interfaceC2425mG, 432, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44631(legacy, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LandscapeContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC1138i interfaceC1138i2;
        PaywallState.Loaded.Legacy legacy2;
        PaywallViewModel paywallViewModel2;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1763419076);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC1138i2 = interfaceC1138i;
            legacy2 = legacy;
            paywallViewModel2 = paywallViewModel;
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1763419076, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.LandscapeContent (Template3.kt:106)");
            }
            C1131b.e eVarC = C1131b.a.f2102a.c();
            e.a aVar = l0.e.f52304a;
            e.c cVarI = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.f26613a;
            androidx.compose.ui.e eVarC2 = InterfaceC1138i.c(interfaceC1138i, aVar2, 1.0f, false, 2, null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e eVarK = p.k(p.m(eVarC2, 0.0f, uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            B b10 = G.b(eVarC, cVarI, interfaceC2425mG, 54);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarK);
            InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, b10, aVar3.e());
            m2.e(interfaceC2425mB, iR, aVar3.g());
            Function2 function2B = aVar3.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar3.f());
            J j10 = J.f2025a;
            interfaceC1138i2 = interfaceC1138i;
            androidx.compose.ui.e eVarB = C.I.b(j10, aVar2, 0.5f, false, 2, null);
            e.b bVarG = aVar.g();
            C1131b c1131b = C1131b.f2093a;
            B bA = AbstractC1136g.a(c1131b.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.i()), bVarG, interfaceC2425mG, 48);
            int iA2 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR2 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarB);
            InterfaceC5082a interfaceC5082aA2 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA2);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB2, bA, aVar3.e());
            m2.e(interfaceC2425mB2, iR2, aVar3.g());
            Function2 function2B2 = aVar3.b();
            if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                interfaceC2425mB2.u(Integer.valueOf(iA2));
                interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
            }
            m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
            C1139j c1139j = C1139j.f2142a;
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            int i13 = i12 >> 3;
            int i14 = i13 & 14;
            Icon(legacy, interfaceC2425mG, i14);
            Title(legacy, interfaceC2425mG, i14);
            K.a(InterfaceC1138i.c(c1139j, aVar2, 0.5f, false, 2, null), interfaceC2425mG, 0);
            interfaceC2425mG.x();
            androidx.compose.ui.e eVarB2 = C.I.b(j10, aVar2, 0.5f, false, 2, null);
            B bA2 = AbstractC1136g.a(c1131b.h(), aVar.k(), interfaceC2425mG, 0);
            int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR3 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarB2);
            InterfaceC5082a interfaceC5082aA3 = aVar3.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA3);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB3, bA2, aVar3.e());
            m2.e(interfaceC2425mB3, iR3, aVar3.g());
            Function2 function2B3 = aVar3.b();
            if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                interfaceC2425mB3.u(Integer.valueOf(iA3));
                interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
            }
            m2.e(interfaceC2425mB3, eVarF3, aVar3.f());
            m883FeaturesTDGSqEk(c1139j, legacy, Template3UIConstants.INSTANCE.m889getFeatureSpacingLandscapeD9Ej5fM(), interfaceC2425mG, 390 | (i12 & 112));
            OfferDetailsKt.m605OfferDetailsRPmYEkk(legacy, legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0).m787getText20d7_KjU(), interfaceC2425mG, i14);
            legacy2 = legacy;
            paywallViewModel2 = paywallViewModel;
            interfaceC2425m2 = interfaceC2425mG;
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(legacy2, paywallViewModel2, null, C5015h.n(0), null, interfaceC2425m2, i14 | 3072 | (i13 & 112), 20);
            interfaceC2425m2.x();
            interfaceC2425m2.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(interfaceC1138i2, legacy2, paywallViewModel2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortraitContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(949126752);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(paywallViewModel) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(949126752, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.PortraitContent (Template3.kt:77)");
            }
            interfaceC2425mG.V(-217227990);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                androidx.compose.ui.e eVarH = s.h(InterfaceC1138i.c(interfaceC1138i, androidx.compose.ui.e.f26613a, 1.0f, false, 2, null), 0.0f, 1, null);
                UIConstant uIConstant = UIConstant.INSTANCE;
                androidx.compose.ui.e eVarJ = p.j(eVarH, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM());
                e.a aVar = l0.e.f52304a;
                B bA = AbstractC1136g.a(C1131b.f2093a.q(uIConstant.m389getDefaultVerticalSpacingD9Ej5fM(), aVar.l()), aVar.g(), interfaceC2425mG, 48);
                int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarJ);
                InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA = aVar2.a();
                if (interfaceC2425mG.j() == null) {
                    AbstractC2410h.d();
                }
                interfaceC2425mG.I();
                if (interfaceC2425mG.e()) {
                    interfaceC2425mG.h(interfaceC5082aA);
                } else {
                    interfaceC2425mG.s();
                }
                InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
                m2.e(interfaceC2425mB, bA, aVar2.e());
                m2.e(interfaceC2425mB, iR, aVar2.g());
                Function2 function2B = aVar2.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar2.f());
                C1139j c1139j = C1139j.f2142a;
                InsetSpacersKt.StatusBarSpacer(interfaceC2425mG, 0);
                int i13 = (i12 >> 3) & 14;
                Icon(legacy, interfaceC2425mG, i13);
                Title(legacy, interfaceC2425mG, i13);
                m883FeaturesTDGSqEk(c1139j, legacy, Template3UIConstants.INSTANCE.m890getFeatureSpacingPortraitD9Ej5fM(), interfaceC2425mG, (i12 & 112) | 390);
                interfaceC2425mG.x();
            }
            interfaceC2425mG.O();
            K.a(s.i(androidx.compose.ui.e.f26613a, UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM()), interfaceC2425mG, 0);
            int i14 = i12 >> 3;
            OfferDetailsKt.m605OfferDetailsRPmYEkk(legacy, legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0).m787getText20d7_KjU(), interfaceC2425mG, i14 & 14);
            interfaceC2425m2 = interfaceC2425mG;
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(legacy, paywallViewModel, null, 0.0f, null, interfaceC2425m2, i14 & 126, 28);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C44642(interfaceC1138i, legacy, paywallViewModel, i10));
        }
    }

    public static final void Template3(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallViewModel paywallViewModel;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(viewModel, "viewModel");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-533890389);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(viewModel) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            paywallViewModel = viewModel;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-533890389, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3 (Template3.kt:64)");
            }
            e.a aVar = androidx.compose.ui.e.f26613a;
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425mG, 0);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, aVar);
            InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar2.a();
            if (interfaceC2425mG.j() == null) {
                AbstractC2410h.d();
            }
            interfaceC2425mG.I();
            if (interfaceC2425mG.e()) {
                interfaceC2425mG.h(interfaceC5082aA);
            } else {
                interfaceC2425mG.s();
            }
            InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425mG);
            m2.e(interfaceC2425mB, bA, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            C1139j c1139j = C1139j.f2142a;
            if (WindowHelperKt.shouldUseLandscapeLayout(state, interfaceC2425mG, i11 & 14)) {
                interfaceC2425mG.V(-1741914098);
                int i12 = i11 << 3;
                LandscapeContent(c1139j, state, viewModel, interfaceC2425mG, (i12 & 896) | 6 | (i12 & 112));
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(-1741850641);
                int i13 = i11 << 3;
                PortraitContent(c1139j, state, viewModel, interfaceC2425mG, (i13 & 896) | 6 | (i13 & 112));
                interfaceC2425mG.O();
            }
            paywallViewModel = viewModel;
            FooterKt.Footer(state.getTemplateConfiguration(), paywallViewModel, null, null, null, interfaceC2425mG, i11 & 112, 28);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44652(state, paywallViewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template3CondensedFooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1430130282);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1430130282, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3CondensedFooterPreview (Template3.kt:280)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44661.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate3Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44672(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template3FooterPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-377072487);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-377072487, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3FooterPreview (Template3.kt:271)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44681.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate3Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44692(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template3Preview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2025889118);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2025889118, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3Preview (Template3.kt:262)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44701.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate3Offering(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44712(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(887524410);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(legacy) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(887524410, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template3.kt:156)");
            }
            interfaceC2425m2 = interfaceC2425mG;
            MarkdownKt.m594MarkdownDkhmgE0(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), null, legacy.getTemplateConfiguration().getCurrentColors(interfaceC2425mG, 0).m786getText10d7_KjU(), D.f17597a.c(interfaceC2425mG, D.f17598b).i(), 0L, Y0.L.f22613b.h(), null, null, C4830j.h(C4830j.f47278b.a()), false, true, false, interfaceC2425m2, 196608, 54, 722);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new C44721(legacy, i10));
        }
    }
}
