package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.InterfaceC1138i;
import C.K;
import I0.B;
import K0.InterfaceC1788g;
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
import android.graphics.Matrix;
import android.net.Uri;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import g0.i;
import g1.C4830j;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import p0.AbstractC5912g;
import r0.AbstractC6227i;
import r0.C6224f;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.C6385r0;
import s0.E1;
import s0.InterfaceC6374m1;
import s0.S;
import s0.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "viewModel", "LTd/L;", "Template1", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;LY/m;I)V", "LC/i;", "Template1MainContent", "(LC/i;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;LY/m;I)V", "Landroid/net/Uri;", "uri", "", "landscapeLayout", "HeaderImage", "(Landroid/net/Uri;ZLY/m;I)V", "Lkotlin/Function0;", "content", "CircleMask", "(ZLkotlin/jvm/functions/Function2;LY/m;I)V", "Template1PaywallPreview", "(LY/m;I)V", "Template1NoFooterPaywallPreview", "Template1FooterPaywallPreview", "Template1CondensedFooterPaywallPreview", "CircleMaskPreview", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Template1Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$CircleMask$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2 $content;
        final /* synthetic */ boolean $landscapeLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z10, Function2 function2, int i10) {
            super(2);
            this.$landscapeLayout = z10;
            this.$content = function2;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.CircleMask(this.$landscapeLayout, this.$content, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$CircleMaskPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44422 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44422(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.CircleMaskPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$HeaderImage$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44432 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $landscapeLayout;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44432(Uri uri, boolean z10, int i10) {
            super(2);
            this.$uri = uri;
            this.$landscapeLayout = z10;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.HeaderImage(this.$uri, this.$landscapeLayout, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44442 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44442(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template1Kt.Template1(this.$state, this.$viewModel, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1CondensedFooterPaywallPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements InterfaceC5082a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m867invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m867invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1CondensedFooterPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44452 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44452(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.Template1CondensedFooterPaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1FooterPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44461 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44461 INSTANCE = new C44461();

        C44461() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m868invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m868invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1FooterPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44472 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44472(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.Template1FooterPaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1MainContent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44482 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ InterfaceC1138i $this_Template1MainContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44482(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$this_Template1MainContent = interfaceC1138i;
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.Template1MainContent(this.$this_Template1MainContent, this.$state, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1NoFooterPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44491 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44491 INSTANCE = new C44491();

        C44491() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m869invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m869invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1NoFooterPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44502 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44502(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.Template1NoFooterPaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C44511 extends AbstractC5506u implements InterfaceC5082a {
        public static final C44511 INSTANCE = new C44511();

        C44511() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m870invoke() {
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m870invoke();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C44522 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44522(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            Template1Kt.Template1PaywallPreview(interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleMask(boolean z10, Function2 function2, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1244949301);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1244949301, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMask (Template1.kt:159)");
            }
            final float f10 = z10 ? 8.0f : 3.0f;
            e eVarA = AbstractC5912g.a(e.f26613a, new E1() { // from class: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$CircleMask$clipShape$1
                @Override // s0.E1
                /* JADX INFO: renamed from: createOutline-Pq9zytI */
                public AbstractC6362i1 mo6createOutlinePq9zytI(long size, EnumC5027t layoutDirection, InterfaceC5011d density) {
                    AbstractC5504s.h(layoutDirection, "layoutDirection");
                    AbstractC5504s.h(density, "density");
                    Matrix matrix = new Matrix();
                    float f11 = f10;
                    matrix.preScale(f11, f11);
                    matrix.postTranslate(Template1Kt.CircleMask$circleOffsetX(f10, size), Template1Kt.CircleMask$circleOffsetY(f10, size));
                    InterfaceC6374m1 interfaceC6374m1A = V.a();
                    InterfaceC6374m1.p(interfaceC6374m1A, AbstractC6227i.b(C6224f.f58329b.c(), size), null, 2, null);
                    if (!(interfaceC6374m1A instanceof S)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((S) interfaceC6374m1A).v().transform(matrix);
                    return new AbstractC6362i1.a(interfaceC6374m1A);
                }
            });
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarA);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
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
            m2.e(interfaceC2425mB, bH, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            h hVar = h.f26161a;
            function2.invoke(interfaceC2425mG, Integer.valueOf((i11 >> 3) & 14));
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass2(z10, function2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircleMask$circleOffsetX(float f10, long j10) {
        return (((C6230l.i(j10) * f10) - C6230l.i(j10)) / 2.0f) * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircleMask$circleOffsetY(float f10, long j10) {
        return ((C6230l.g(j10) * f10) - C6230l.g(j10)) * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleMaskPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-414705569);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-414705569, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMaskPreview (Template1.kt:250)");
            }
            e.a aVar = e.f26613a;
            B bH = f.h(l0.e.f52304a.o(), false);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, aVar);
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
            m2.e(interfaceC2425mB, bH, aVar2.e());
            m2.e(interfaceC2425mB, iR, aVar2.g());
            Function2 function2B = aVar2.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar2.f());
            h hVar = h.f26161a;
            f.a(s.f(b.d(aVar, C6385r0.f58985b.h(), null, 2, null), 0.0f, 1, null), interfaceC2425mG, 6);
            CircleMask(false, ComposableSingletons$Template1Kt.INSTANCE.m862getLambda1$revenuecatui_defaultsBc8Release(), interfaceC2425mG, 54);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44422(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderImage(Uri uri, boolean z10, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(2030386997);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(uri) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(2030386997, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template1.kt:139)");
            }
            if (uri != null) {
                CircleMask(z10, i.d(1134746342, true, new Template1Kt$HeaderImage$1$1(uri, z10), interfaceC2425mG, 54), interfaceC2425mG, ((i11 >> 3) & 14) | 48);
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44432(uri, z10, i10));
        }
    }

    public static final void Template1(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        PaywallViewModel paywallViewModel;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(viewModel, "viewModel");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1499444075);
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
                AbstractC2454w.U(1499444075, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1 (Template1.kt:60)");
            }
            e eVarH = s.h(e.f26613a, 0.0f, 1, null);
            B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.g(), interfaceC2425mG, 48);
            int iA = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR = interfaceC2425mG.r();
            e eVarF = c.f(interfaceC2425mG, eVarH);
            InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA = aVar.a();
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
            m2.e(interfaceC2425mB, bA, aVar.e());
            m2.e(interfaceC2425mB, iR, aVar.g());
            Function2 function2B = aVar.b();
            if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                interfaceC2425mB.u(Integer.valueOf(iA));
                interfaceC2425mB.m(Integer.valueOf(iA), function2B);
            }
            m2.e(interfaceC2425mB, eVarF, aVar.f());
            Template1MainContent(C1139j.f2142a, state, interfaceC2425mG, ((i11 << 3) & 112) | 6);
            paywallViewModel = viewModel;
            PurchaseButtonKt.m616PurchaseButtonhGBTI10(state, paywallViewModel, null, 0.0f, null, interfaceC2425mG, i11 & 126, 28);
            FooterKt.Footer(state.getTemplateConfiguration(), paywallViewModel, null, null, null, interfaceC2425mG, i11 & 112, 28);
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44442(state, paywallViewModel, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1CondensedFooterPaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-527429650);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-527429650, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1CondensedFooterPaywallPreview (Template1.kt:241)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(AnonymousClass1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate1Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44452(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1FooterPaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1625504547);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1625504547, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1FooterPaywallPreview (Template1.kt:232)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44461.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate1Offering(), null, false, false, 28, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44472(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1MainContent(InterfaceC1138i interfaceC1138i, PaywallState.Loaded.Legacy legacy, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC1138i interfaceC1138i2;
        TemplateConfiguration.Colors colors;
        int i12;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1400671009);
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425mG.U(interfaceC1138i) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(legacy) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            interfaceC1138i2 = interfaceC1138i;
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1400671009, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1MainContent (Template1.kt:74)");
            }
            ProcessedLocalizedConfiguration selectedLocalization = PaywallStateKt.getSelectedLocalization(legacy);
            int i13 = (i11 >> 3) & 14;
            TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy, interfaceC2425mG, i13);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                interfaceC2425mG.V(908514334);
                boolean zShouldUseLandscapeLayout = WindowHelperKt.shouldUseLandscapeLayout(legacy, interfaceC2425mG, i13);
                e.a aVar = e.f26613a;
                e eVarC = InterfaceC1138i.c(interfaceC1138i, s.d(m.f(s.h(aVar, 0.0f, 1, null), m.c(0, interfaceC2425mG, 0, 1), false, null, false, 14, null), 0.0f, 1, null), 1.0f, false, 2, null);
                e.a aVar2 = l0.e.f52304a;
                B bA = AbstractC1136g.a(C1131b.f2093a.b(), aVar2.g(), interfaceC2425mG, 54);
                int iA = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF = c.f(interfaceC2425mG, eVarC);
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
                m2.e(interfaceC2425mB, bA, aVar3.e());
                m2.e(interfaceC2425mB, iR, aVar3.g());
                Function2 function2B = aVar3.b();
                if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                    interfaceC2425mB.u(Integer.valueOf(iA));
                    interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                }
                m2.e(interfaceC2425mB, eVarF, aVar3.f());
                C1139j c1139j = C1139j.f2142a;
                HeaderImage(legacy.getTemplateConfiguration().getImages().getHeaderUri(), zShouldUseLandscapeLayout, interfaceC2425mG, 0);
                K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425mG, 0);
                String title = selectedLocalization.getTitle();
                D d10 = D.f17597a;
                int i14 = D.f17598b;
                Y0 y0G = d10.c(interfaceC2425mG, i14).g();
                L.a aVar4 = Y0.L.f22613b;
                Y0.L lA = aVar4.a();
                C4830j.a aVar5 = C4830j.f47278b;
                int iA2 = aVar5.a();
                long jM786getText10d7_KjU = currentColors.m786getText10d7_KjU();
                UIConstant uIConstant = UIConstant.INSTANCE;
                colors = null;
                MarkdownKt.m594MarkdownDkhmgE0(title, p.j(aVar, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM()), jM786getText10d7_KjU, y0G, 0L, lA, null, null, C4830j.h(iA2), false, true, false, interfaceC2425mG, 196608, 54, 720);
                androidx.compose.ui.e eVarK = p.k(aVar, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
                B bH = f.h(aVar2.o(), false);
                int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
                I iR2 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarK);
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
                if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA3))) {
                    interfaceC2425mB2.u(Integer.valueOf(iA3));
                    interfaceC2425mB2.m(Integer.valueOf(iA3), function2B2);
                }
                m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
                h hVar = h.f26161a;
                String subtitle = selectedLocalization.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                MarkdownKt.m594MarkdownDkhmgE0(subtitle, p.j(aVar, uIConstant.m386getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m389getDefaultVerticalSpacingD9Ej5fM()), currentColors.m786getText10d7_KjU(), d10.c(interfaceC2425mG, i14).b(), 0L, aVar4.g(), null, null, C4830j.h(aVar5.a()), false, true, false, interfaceC2425mG, 196608, 54, 720);
                interfaceC2425mG = interfaceC2425mG;
                interfaceC2425mG.x();
                i12 = 2;
                i13 = i13;
                interfaceC1138i2 = interfaceC1138i;
                K.a(InterfaceC1138i.c(c1139j, aVar, 2.0f, false, 2, null), interfaceC2425mG, 0);
                interfaceC2425mG.x();
                interfaceC2425mG.O();
            } else {
                interfaceC1138i2 = interfaceC1138i;
                colors = null;
                i12 = 2;
                interfaceC2425mG.V(910488166);
                K.a(s.i(androidx.compose.ui.e.f26613a, UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM()), interfaceC2425mG, 0);
                interfaceC2425mG.O();
            }
            OfferDetailsKt.OfferDetails(legacy, colors, interfaceC2425mG, i13, i12);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44482(interfaceC1138i2, legacy, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1NoFooterPaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(363342818);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(363342818, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1NoFooterPaywallPreview (Template1.kt:223)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44491.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate1OfferingNoFooter(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44502(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1PaywallPreview(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(854103102);
        if (i10 == 0 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(854103102, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1PaywallPreview (Template1.kt:214)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C44511.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate1Offering(), null, false, false, 29, null), interfaceC2425mG, 0, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new C44522(i10));
        }
    }
}
