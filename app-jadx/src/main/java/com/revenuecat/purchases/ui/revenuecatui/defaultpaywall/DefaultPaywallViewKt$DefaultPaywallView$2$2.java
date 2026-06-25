package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import C.A;
import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.InterfaceC1138i;
import C.K;
import D.AbstractC1230b;
import I.a;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.D;
import U.j0;
import U0.Y0;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import g1.C4830j;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC/A;", "paddingValues", "LTd/L;", "invoke", "(LC/A;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DefaultPaywallViewKt$DefaultPaywallView$2$2 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ C0 $appIconBitmap$delegate;
    final /* synthetic */ String $appName;
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ Function1 $onSelectPackage;
    final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;
    final /* synthetic */ boolean $shouldShowWarning;
    final /* synthetic */ PaywallWarning $warningToShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaywallViewKt$DefaultPaywallView$2$2(List<TemplateConfiguration.PackageInfo> list, long j10, long j11, TemplateConfiguration.PackageInfo packageInfo, Function1 function1, boolean z10, PaywallWarning paywallWarning, String str, C0 c02) {
        super(3);
        this.$packages = list;
        this.$mainColor = j10;
        this.$foregroundOnAccentColor = j11;
        this.$selectedPackage = packageInfo;
        this.$onSelectPackage = function1;
        this.$shouldShowWarning = z10;
        this.$warningToShow = paywallWarning;
        this.$appName = str;
        this.$appIconBitmap$delegate = c02;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((A) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(A paddingValues, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        e.a aVar;
        C1131b c1131b;
        List<TemplateConfiguration.PackageInfo> list;
        int i12;
        String str;
        long j10;
        TemplateConfiguration.PackageInfo packageInfo;
        Function1 function1;
        long j11;
        PaywallWarning paywallWarning;
        C0 c02;
        long j12;
        InterfaceC2425m interfaceC2425m2;
        InterfaceC2425m interfaceC2425m3 = interfaceC2425m;
        AbstractC5504s.h(paddingValues, "paddingValues");
        if ((i10 & 6) == 0) {
            i11 = i10 | (interfaceC2425m3.U(paddingValues) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 19) == 18 && interfaceC2425m3.i()) {
            interfaceC2425m3.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-291497059, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallView.<anonymous>.<anonymous> (DefaultPaywallView.kt:164)");
        }
        e.a aVar2 = e.f26613a;
        e eVarF = s.f(aVar2, 0.0f, 1, null);
        e.a aVar3 = l0.e.f52304a;
        l0.e eVarM = aVar3.m();
        List<TemplateConfiguration.PackageInfo> list2 = this.$packages;
        long j13 = this.$mainColor;
        long j14 = this.$foregroundOnAccentColor;
        TemplateConfiguration.PackageInfo packageInfo2 = this.$selectedPackage;
        Function1 function12 = this.$onSelectPackage;
        boolean z10 = this.$shouldShowWarning;
        PaywallWarning paywallWarning2 = this.$warningToShow;
        String str2 = this.$appName;
        C0 c03 = this.$appIconBitmap$delegate;
        B bH = f.h(eVarM, false);
        int iA = AbstractC2410h.a(interfaceC2425m3, 0);
        I iR = interfaceC2425m3.r();
        androidx.compose.ui.e eVarF2 = c.f(interfaceC2425m3, eVarF);
        InterfaceC1788g.a aVar4 = InterfaceC1788g.f10745M;
        InterfaceC5082a interfaceC5082aA = aVar4.a();
        if (interfaceC2425m3.j() == null) {
            AbstractC2410h.d();
        }
        interfaceC2425m3.I();
        if (interfaceC2425m3.e()) {
            interfaceC2425m3.h(interfaceC5082aA);
        } else {
            interfaceC2425m3.s();
        }
        InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m3);
        m2.e(interfaceC2425mB, bH, aVar4.e());
        m2.e(interfaceC2425mB, iR, aVar4.g());
        Function2 function2B = aVar4.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        m2.e(interfaceC2425mB, eVarF2, aVar4.f());
        h hVar = h.f26161a;
        androidx.compose.ui.e eVarX = s.x(s.d(aVar2, 0.0f, 1, null), 0.0f, ReadableContentWidth.INSTANCE.m808getDpD9Ej5fM(), 1, null);
        C1131b c1131b2 = C1131b.f2093a;
        B bA = AbstractC1136g.a(c1131b2.h(), aVar3.k(), interfaceC2425m3, 0);
        int iA2 = AbstractC2410h.a(interfaceC2425m3, 0);
        I iR2 = interfaceC2425m3.r();
        androidx.compose.ui.e eVarF3 = c.f(interfaceC2425m3, eVarX);
        InterfaceC5082a interfaceC5082aA2 = aVar4.a();
        if (interfaceC2425m3.j() == null) {
            AbstractC2410h.d();
        }
        interfaceC2425m3.I();
        if (interfaceC2425m3.e()) {
            interfaceC2425m3.h(interfaceC5082aA2);
        } else {
            interfaceC2425m3.s();
        }
        InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425m3);
        m2.e(interfaceC2425mB2, bA, aVar4.e());
        m2.e(interfaceC2425mB2, iR2, aVar4.g());
        Function2 function2B2 = aVar4.b();
        if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
            interfaceC2425mB2.u(Integer.valueOf(iA2));
            interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
        }
        m2.e(interfaceC2425mB2, eVarF3, aVar4.f());
        C1139j c1139j = C1139j.f2142a;
        androidx.compose.ui.e eVarH = s.h(aVar2, 0.0f, 1, null);
        B bA2 = AbstractC1136g.a(c1131b2.o(C5015h.n(24)), aVar3.g(), interfaceC2425m3, 54);
        int iA3 = AbstractC2410h.a(interfaceC2425m3, 0);
        I iR3 = interfaceC2425m3.r();
        androidx.compose.ui.e eVarF4 = c.f(interfaceC2425m3, eVarH);
        InterfaceC5082a interfaceC5082aA3 = aVar4.a();
        if (interfaceC2425m3.j() == null) {
            AbstractC2410h.d();
        }
        interfaceC2425m3.I();
        if (interfaceC2425m3.e()) {
            interfaceC2425m3.h(interfaceC5082aA3);
        } else {
            interfaceC2425m3.s();
        }
        InterfaceC2425m interfaceC2425mB3 = m2.b(interfaceC2425m3);
        m2.e(interfaceC2425mB3, bA2, aVar4.e());
        m2.e(interfaceC2425mB3, iR3, aVar4.g());
        Function2 function2B3 = aVar4.b();
        if (interfaceC2425mB3.e() || !AbstractC5504s.c(interfaceC2425mB3.D(), Integer.valueOf(iA3))) {
            interfaceC2425mB3.u(Integer.valueOf(iA3));
            interfaceC2425mB3.m(Integer.valueOf(iA3), function2B3);
        }
        m2.e(interfaceC2425mB3, eVarF4, aVar4.f());
        K.a(s.i(aVar2, C5015h.n(paddingValues.d() + C5015h.n(32))), interfaceC2425m3, 0);
        interfaceC2425m3.V(1177952101);
        if (z10) {
            D d10 = D.f17597a;
            int i13 = D.f17598b;
            Y0 y0O = d10.c(interfaceC2425m3, i13).o();
            j11 = j13;
            paywallWarning = paywallWarning2;
            c02 = c03;
            aVar = aVar2;
            str = str2;
            j10 = j14;
            function1 = function12;
            packageInfo = packageInfo2;
            list = list2;
            c1131b = c1131b2;
            i12 = 0;
            j0.b("RevenueCat Paywalls", s.h(aVar2, 0.0f, 1, null), d10.a(interfaceC2425m3, i13).w(), 0L, null, Y0.L.f22613b.b(), null, 0L, null, C4830j.h(C4830j.f47278b.a()), 0L, 0, false, 0, 0, null, y0O, interfaceC2425m, 196662, 0, 64984);
            interfaceC2425m3 = interfaceC2425m;
        } else {
            aVar = aVar2;
            c1131b = c1131b2;
            list = list2;
            i12 = 0;
            str = str2;
            j10 = j14;
            packageInfo = packageInfo2;
            function1 = function12;
            j11 = j13;
            paywallWarning = paywallWarning2;
            c02 = c03;
        }
        interfaceC2425m3.O();
        if (paywallWarning != null) {
            interfaceC2425m3.V(-2137487916);
            DefaultPaywallWarningKt.m804DefaultPaywallWarning3IgeMak(paywallWarning, DefaultPaywallViewKt.RevenueCatBrandRed, null, interfaceC2425m3, 48, 4);
            interfaceC2425m3.O();
            interfaceC2425m2 = interfaceC2425m3;
            j12 = j11;
        } else {
            interfaceC2425m3.V(-2137342092);
            j12 = j11;
            DefaultPaywallViewKt.m799AppIconSectioncf5BqRc(DefaultPaywallViewKt.DefaultPaywallView$lambda$3(c02), str, j12, null, interfaceC2425m, 0, 8);
            interfaceC2425m2 = interfaceC2425m;
            interfaceC2425m2.O();
        }
        interfaceC2425m2.x();
        K.a(InterfaceC1138i.c(c1139j, aVar, 1.0f, false, 2, null), interfaceC2425m2, i12);
        androidx.compose.ui.e eVarM2 = p.m(a.a(aVar), 0.0f, 0.0f, 0.0f, paddingValues.c(), 7, null);
        A a10 = p.a(C5015h.n(16));
        e.b bVarG = aVar3.g();
        C1131b.f fVarO = c1131b.o(C5015h.n(8));
        interfaceC2425m2.V(1936762612);
        List<TemplateConfiguration.PackageInfo> list3 = list;
        long j15 = j10;
        TemplateConfiguration.PackageInfo packageInfo3 = packageInfo;
        Function1 function13 = function1;
        boolean zF = interfaceC2425m2.F(list3) | interfaceC2425m2.d(j12) | interfaceC2425m2.d(j15) | interfaceC2425m2.U(packageInfo3) | interfaceC2425m2.U(function13);
        Object objD = interfaceC2425m2.D();
        if (zF || objD == InterfaceC2425m.f22370a.a()) {
            objD = new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1(list3, j12, j15, packageInfo3, function13);
            interfaceC2425m2.u(objD);
        }
        interfaceC2425m2.O();
        AbstractC1230b.a(eVarM2, null, a10, false, fVarO, bVarG, null, false, (Function1) objD, interfaceC2425m, 221568, 202);
        interfaceC2425m.x();
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
