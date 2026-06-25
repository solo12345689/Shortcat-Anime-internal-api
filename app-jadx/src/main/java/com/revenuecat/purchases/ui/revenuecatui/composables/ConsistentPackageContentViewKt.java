package com.revenuecat.purchases.ui.revenuecatui.composables;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import p0.AbstractC5906a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;", "state", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "LTd/L;", "creator", "ConsistentPackageContentView", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Legacy;Lie/o;LY/m;I)V", "", "packages", "selected", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;Lie/o;LY/m;I)V", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConsistentPackageContentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt$ConsistentPackageContentView$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ InterfaceC5096o $creator;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, InterfaceC5096o interfaceC5096o, int i10) {
            super(2);
            this.$state = legacy;
            this.$creator = interfaceC5096o;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ConsistentPackageContentViewKt.ConsistentPackageContentView(this.$state, this.$creator, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt$ConsistentPackageContentView$3 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends AbstractC5506u implements Function2 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ InterfaceC5096o $creator;
        final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
        final /* synthetic */ TemplateConfiguration.PackageInfo $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.PackageInfo packageInfo, InterfaceC5096o interfaceC5096o, int i10) {
            super(2);
            this.$packages = list;
            this.$selected = packageInfo;
            this.$creator = interfaceC5096o;
            this.$$changed = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            ConsistentPackageContentViewKt.ConsistentPackageContentView(this.$packages, this.$selected, this.$creator, interfaceC2425m, AbstractC2409g1.a(this.$$changed | 1));
        }
    }

    public static final void ConsistentPackageContentView(PaywallState.Loaded.Legacy state, InterfaceC5096o creator, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(creator, "creator");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-499614075);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(creator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-499614075, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:14)");
            }
            ConsistentPackageContentView(state.getTemplateConfiguration().getPackages().getAll(), (TemplateConfiguration.PackageInfo) state.getSelectedPackage().getValue(), creator, interfaceC2425mG, (i11 << 3) & 896);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass1(state, creator, i10));
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    public static final void ConsistentPackageContentView(List<TemplateConfiguration.PackageInfo> packages, TemplateConfiguration.PackageInfo selected, InterfaceC5096o creator, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(packages, "packages");
        AbstractC5504s.h(selected, "selected");
        AbstractC5504s.h(creator, "creator");
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1899321464);
        int i11 = (i10 & 6) == 0 ? (interfaceC2425mG.F(packages) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(selected) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(creator) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1899321464, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentView (ConsistentPackageContentView.kt:31)");
            }
            e.a aVar = e.f26613a;
            ?? r82 = 0;
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
            interfaceC2425mG.V(533206241);
            for (TemplateConfiguration.PackageInfo packageInfo : packages) {
                e eVarA = AbstractC5906a.a(e.f26613a, 0.0f);
                e.a aVar3 = l0.e.f52304a;
                androidx.compose.ui.e eVarB = hVar.b(eVarA, aVar3.e());
                B bH2 = f.h(aVar3.o(), r82);
                int iA2 = AbstractC2410h.a(interfaceC2425mG, r82);
                I iR2 = interfaceC2425mG.r();
                androidx.compose.ui.e eVarF2 = c.f(interfaceC2425mG, eVarB);
                InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
                InterfaceC5082a interfaceC5082aA2 = aVar4.a();
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
                m2.e(interfaceC2425mB2, bH2, aVar4.e());
                m2.e(interfaceC2425mB2, iR2, aVar4.g());
                Function2 function2B2 = aVar4.b();
                if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
                    interfaceC2425mB2.u(Integer.valueOf(iA2));
                    interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
                }
                m2.e(interfaceC2425mB2, eVarF2, aVar4.f());
                h hVar2 = h.f26161a;
                creator.invoke(packageInfo, interfaceC2425mG, Integer.valueOf((i11 >> 3) & 112));
                interfaceC2425mG.x();
                r82 = 0;
            }
            interfaceC2425mG.O();
            e.a aVar5 = androidx.compose.ui.e.f26613a;
            e.a aVar6 = l0.e.f52304a;
            androidx.compose.ui.e eVarB2 = hVar.b(aVar5, aVar6.e());
            B bH3 = f.h(aVar6.o(), false);
            int iA3 = AbstractC2410h.a(interfaceC2425mG, 0);
            I iR3 = interfaceC2425mG.r();
            androidx.compose.ui.e eVarF3 = c.f(interfaceC2425mG, eVarB2);
            InterfaceC1788g.a aVar7 = InterfaceC1788g.f10745M;
            InterfaceC5082a interfaceC5082aA3 = aVar7.a();
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
            m2.e(interfaceC2425mB3, bH3, aVar7.e());
            m2.e(interfaceC2425mB3, iR3, aVar7.g());
            Function2 function2B3 = aVar7.b();
            if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
                interfaceC2425mB3.u(Integer.valueOf(iA3));
                interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
            }
            m2.e(interfaceC2425mB3, eVarF3, aVar7.f());
            h hVar3 = h.f26161a;
            creator.invoke(selected, interfaceC2425mG, Integer.valueOf((i11 >> 3) & 126));
            interfaceC2425mG.x();
            interfaceC2425mG.x();
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new AnonymousClass3(packages, selected, creator, i10));
        }
    }
}
