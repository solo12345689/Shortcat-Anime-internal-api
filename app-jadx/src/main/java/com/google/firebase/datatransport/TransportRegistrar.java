package com.google.firebase.datatransport;

import aa.C2591D;
import aa.C2595c;
import aa.InterfaceC2596d;
import aa.g;
import aa.q;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import da.InterfaceC4572a;
import da.InterfaceC4573b;
import java.util.Arrays;
import java.util.List;
import p8.InterfaceC5944i;
import r8.C6294t;
import ua.h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ InterfaceC5944i a(InterfaceC2596d interfaceC2596d) {
        C6294t.f((Context) interfaceC2596d.a(Context.class));
        return C6294t.c().g(a.f38808g);
    }

    public static /* synthetic */ InterfaceC5944i b(InterfaceC2596d interfaceC2596d) {
        C6294t.f((Context) interfaceC2596d.a(Context.class));
        return C6294t.c().g(a.f38809h);
    }

    public static /* synthetic */ InterfaceC5944i c(InterfaceC2596d interfaceC2596d) {
        C6294t.f((Context) interfaceC2596d.a(Context.class));
        return C6294t.c().g(a.f38809h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2595c> getComponents() {
        return Arrays.asList(C2595c.e(InterfaceC5944i.class).h(LIBRARY_NAME).b(q.k(Context.class)).f(new g() { // from class: da.c
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return TransportRegistrar.c(interfaceC2596d);
            }
        }).d(), C2595c.c(C2591D.a(InterfaceC4572a.class, InterfaceC5944i.class)).b(q.k(Context.class)).f(new g() { // from class: da.d
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return TransportRegistrar.b(interfaceC2596d);
            }
        }).d(), C2595c.c(C2591D.a(InterfaceC4573b.class, InterfaceC5944i.class)).b(q.k(Context.class)).f(new g() { // from class: da.e
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return TransportRegistrar.a(interfaceC2596d);
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
