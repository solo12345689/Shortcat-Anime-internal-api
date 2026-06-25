package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class A4 extends C3526n {

    /* JADX INFO: renamed from: b */
    private final C3427c f39324b;

    public A4(C3427c c3427c) {
        this.f39324b = c3427c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.C3526n, com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    AbstractC3633z2.a("getEventName", 0, list);
                    return new C3588u(this.f39324b.c().b());
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    AbstractC3633z2.a("getTimestamp", 0, list);
                    return new C3490j(Double.valueOf(this.f39324b.c().a()));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    AbstractC3633z2.a("getParamValue", 1, list);
                    return AbstractC3413a3.a(this.f39324b.c().e(y12.a((InterfaceC3553q) list.get(0)).k()));
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    AbstractC3633z2.a("getParams", 0, list);
                    Map mapF = this.f39324b.c().f();
                    C3526n c3526n = new C3526n();
                    for (String str2 : mapF.keySet()) {
                        c3526n.d(str2, AbstractC3413a3.a(mapF.get(str2)));
                    }
                    return c3526n;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    AbstractC3633z2.a("setParamValue", 2, list);
                    String strK = y12.a((InterfaceC3553q) list.get(0)).k();
                    InterfaceC3553q interfaceC3553qA = y12.a((InterfaceC3553q) list.get(1));
                    this.f39324b.c().d(strK, AbstractC3633z2.j(interfaceC3553qA));
                    return interfaceC3553qA;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    AbstractC3633z2.a("setEventName", 1, list);
                    InterfaceC3553q interfaceC3553qA2 = y12.a((InterfaceC3553q) list.get(0));
                    if (InterfaceC3553q.f39929W.equals(interfaceC3553qA2) || InterfaceC3553q.f39930a0.equals(interfaceC3553qA2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.f39324b.c().c(interfaceC3553qA2.k());
                    return new C3588u(interfaceC3553qA2.k());
                }
                break;
        }
        return super.r(str, y12, list);
    }
}
