package com.bumptech.glide.integration.okhttp3;

import Y4.h;
import Y4.n;
import Y4.o;
import Y4.r;
import dg.C4618A;
import dg.InterfaceC4624e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4624e.a f35633a;

    /* JADX INFO: renamed from: com.bumptech.glide.integration.okhttp3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0598a implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static volatile InterfaceC4624e.a f35634b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4624e.a f35635a;

        public C0598a() {
            this(a());
        }

        private static InterfaceC4624e.a a() {
            if (f35634b == null) {
                synchronized (C0598a.class) {
                    try {
                        if (f35634b == null) {
                            f35634b = new C4618A();
                        }
                    } finally {
                    }
                }
            }
            return f35634b;
        }

        @Override // Y4.o
        public n d(r rVar) {
            return new a(this.f35635a);
        }

        public C0598a(InterfaceC4624e.a aVar) {
            this.f35635a = aVar;
        }

        @Override // Y4.o
        public void teardown() {
        }
    }

    public a(InterfaceC4624e.a aVar) {
        this.f35633a = aVar;
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, S4.h hVar2) {
        return new n.a(hVar, new R4.a(this.f35633a, hVar));
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }
}
