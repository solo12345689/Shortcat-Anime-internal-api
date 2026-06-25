package com.facebook.imagepipeline.memory;

import H6.E;
import H6.F;
import H6.z;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5.h f35981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f35982b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements C5.h {
        a() {
        }

        @Override // C5.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr) {
            d.this.b(bArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends e {
        public b(B5.d dVar, E e10, F f10) {
            super(dVar, e10, f10);
        }

        @Override // com.facebook.imagepipeline.memory.a
        com.facebook.imagepipeline.memory.b y(int i10) {
            return new h(q(i10), this.f35966c.f7974g, 0);
        }
    }

    public d(B5.d dVar, E e10) {
        k.b(Boolean.valueOf(e10.f7974g > 0));
        this.f35982b = new b(dVar, e10, z.h());
        this.f35981a = new a();
    }

    public C5.a a(int i10) {
        return C5.a.S((byte[]) this.f35982b.get(i10), this.f35981a);
    }

    public void b(byte[] bArr) {
        this.f35982b.a(bArr);
    }
}
