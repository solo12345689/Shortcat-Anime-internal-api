package com.google.firebase.messaging;

import aa.C2591D;
import aa.C2595c;
import aa.InterfaceC2596d;
import com.google.firebase.components.ComponentRegistrar;
import da.InterfaceC4573b;
import ja.InterfaceC5359d;
import java.util.Arrays;
import java.util.List;
import la.InterfaceC5583a;
import na.InterfaceC5769e;
import p8.InterfaceC5944i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(C2591D c2591d, InterfaceC2596d interfaceC2596d) {
        X9.e eVar = (X9.e) interfaceC2596d.a(X9.e.class);
        android.support.v4.media.session.b.a(interfaceC2596d.a(InterfaceC5583a.class));
        return new FirebaseMessaging(eVar, null, interfaceC2596d.e(ua.i.class), interfaceC2596d.e(ka.j.class), (InterfaceC5769e) interfaceC2596d.a(InterfaceC5769e.class), interfaceC2596d.b(c2591d), (InterfaceC5359d) interfaceC2596d.a(InterfaceC5359d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2595c> getComponents() {
        final C2591D c2591dA = C2591D.a(InterfaceC4573b.class, InterfaceC5944i.class);
        return Arrays.asList(C2595c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(aa.q.k(X9.e.class)).b(aa.q.g(InterfaceC5583a.class)).b(aa.q.i(ua.i.class)).b(aa.q.i(ka.j.class)).b(aa.q.k(InterfaceC5769e.class)).b(aa.q.h(c2591dA)).b(aa.q.k(InterfaceC5359d.class)).f(new aa.g() { // from class: com.google.firebase.messaging.F
            @Override // aa.g
            public final Object a(InterfaceC2596d interfaceC2596d) {
                return FirebaseMessagingRegistrar.a(c2591dA, interfaceC2596d);
            }
        }).c().d(), ua.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
