package com.google.firebase.messaging;

import ga.InterfaceC4870a;
import ga.InterfaceC4871b;
import ia.C5046a;
import sa.C6444a;
import sa.C6445b;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3963a implements InterfaceC4870a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4870a f43390a = new C3963a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0650a implements fa.d {

        /* JADX INFO: renamed from: a */
        static final C0650a f43391a = new C0650a();

        /* JADX INFO: renamed from: b */
        private static final fa.c f43392b = fa.c.a("projectNumber").b(C5046a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c */
        private static final fa.c f43393c = fa.c.a("messageId").b(C5046a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d */
        private static final fa.c f43394d = fa.c.a("instanceId").b(C5046a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e */
        private static final fa.c f43395e = fa.c.a("messageType").b(C5046a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f */
        private static final fa.c f43396f = fa.c.a("sdkPlatform").b(C5046a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g */
        private static final fa.c f43397g = fa.c.a("packageName").b(C5046a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h */
        private static final fa.c f43398h = fa.c.a("collapseKey").b(C5046a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i */
        private static final fa.c f43399i = fa.c.a("priority").b(C5046a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j */
        private static final fa.c f43400j = fa.c.a("ttl").b(C5046a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k */
        private static final fa.c f43401k = fa.c.a("topic").b(C5046a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l */
        private static final fa.c f43402l = fa.c.a("bulkId").b(C5046a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m */
        private static final fa.c f43403m = fa.c.a("event").b(C5046a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n */
        private static final fa.c f43404n = fa.c.a("analyticsLabel").b(C5046a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o */
        private static final fa.c f43405o = fa.c.a("campaignId").b(C5046a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p */
        private static final fa.c f43406p = fa.c.a("composerLabel").b(C5046a.b().c(15).a()).a();

        private C0650a() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b */
        public void a(C6444a c6444a, fa.e eVar) {
            eVar.d(f43392b, c6444a.l());
            eVar.b(f43393c, c6444a.h());
            eVar.b(f43394d, c6444a.g());
            eVar.b(f43395e, c6444a.i());
            eVar.b(f43396f, c6444a.m());
            eVar.b(f43397g, c6444a.j());
            eVar.b(f43398h, c6444a.d());
            eVar.c(f43399i, c6444a.k());
            eVar.c(f43400j, c6444a.o());
            eVar.b(f43401k, c6444a.n());
            eVar.d(f43402l, c6444a.b());
            eVar.b(f43403m, c6444a.f());
            eVar.b(f43404n, c6444a.a());
            eVar.d(f43405o, c6444a.c());
            eVar.b(f43406p, c6444a.e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements fa.d {

        /* JADX INFO: renamed from: a */
        static final b f43407a = new b();

        /* JADX INFO: renamed from: b */
        private static final fa.c f43408b = fa.c.a("messagingClientEvent").b(C5046a.b().c(1).a()).a();

        private b() {
        }

        @Override // fa.d
        /* JADX INFO: renamed from: b */
        public void a(C6445b c6445b, fa.e eVar) {
            eVar.b(f43408b, c6445b.a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements fa.d {

        /* JADX INFO: renamed from: a */
        static final c f43409a = new c();

        /* JADX INFO: renamed from: b */
        private static final fa.c f43410b = fa.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // fa.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (fa.e) obj2);
        }

        public void b(O o10, fa.e eVar) {
            throw null;
        }
    }

    private C3963a() {
    }

    @Override // ga.InterfaceC4870a
    public void a(InterfaceC4871b interfaceC4871b) {
        interfaceC4871b.a(O.class, c.f43409a);
        interfaceC4871b.a(C6445b.class, b.f43407a);
        interfaceC4871b.a(C6444a.class, C0650a.f43391a);
    }
}
