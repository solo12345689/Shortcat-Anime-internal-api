package com.revenuecat.purchases.ui.revenuecatui.icons;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.C5015h;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import s0.AbstractC6380o1;
import s0.C6385r0;
import s0.F1;
import s0.G1;
import s0.H1;
import x0.AbstractC7043o;
import x0.C7032d;
import x0.C7034f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lx0/d;", "_Universal_currency_alt", "Lx0/d;", "getUniversalCurrencyAlt", "()Lx0/d;", "UniversalCurrencyAlt", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UniversalCurrencyAltKt {
    private static C7032d _Universal_currency_alt;

    public static final C7032d getUniversalCurrencyAlt() {
        C7032d c7032d = _Universal_currency_alt;
        if (c7032d != null) {
            AbstractC5504s.e(c7032d);
            return c7032d;
        }
        float f10 = 24;
        C7032d.a aVar = new C7032d.a("UniversalCurrencyAlt", C5015h.n(f10), C5015h.n(f10), 960.0f, 960.0f, 0L, 0, false, 224, null);
        F1 f12 = new F1(C6385r0.f58985b.a(), null);
        int iA = G1.f58877a.a();
        int iB = H1.f58881a.b();
        int iB2 = AbstractC6380o1.f58972a.b();
        C7034f c7034f = new C7034f();
        c7034f.i(600.0f, 640.0f);
        c7034f.f(160.0f);
        c7034f.p(-160.0f);
        c7034f.f(-60.0f);
        c7034f.p(100.0f);
        c7034f.e(600.0f);
        c7034f.a();
        c7034f.j(-120.0f, -40.0f);
        c7034f.k(50.0f, 0.0f, 85.0f, -35.0f);
        c7034f.o(35.0f, -85.0f);
        c7034f.o(-35.0f, -85.0f);
        c7034f.o(-85.0f, -35.0f);
        c7034f.o(-85.0f, 35.0f);
        c7034f.o(-35.0f, 85.0f);
        c7034f.o(35.0f, 85.0f);
        c7034f.o(85.0f, 35.0f);
        c7034f.i(200.0f, 480.0f);
        c7034f.f(60.0f);
        c7034f.p(-100.0f);
        c7034f.f(100.0f);
        c7034f.p(-60.0f);
        c7034f.e(200.0f);
        c7034f.a();
        c7034f.i(80.0f, 760.0f);
        c7034f.p(-560.0f);
        c7034f.f(800.0f);
        c7034f.p(560.0f);
        c7034f.a();
        c7034f.j(80.0f, -80.0f);
        c7034f.f(640.0f);
        c7034f.p(-400.0f);
        c7034f.e(160.0f);
        c7034f.a();
        c7034f.j(0.0f, 0.0f);
        c7034f.p(-400.0f);
        c7034f.a();
        aVar.c(c7034f.d(), (14336 & 2) != 0 ? AbstractC7043o.a() : iB2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : f12, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? AbstractC7043o.b() : iA, (14336 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AbstractC7043o.c() : iB, (14336 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        C7032d c7032dF = aVar.f();
        _Universal_currency_alt = c7032dF;
        AbstractC5504s.e(c7032dF);
        return c7032dF;
    }
}
