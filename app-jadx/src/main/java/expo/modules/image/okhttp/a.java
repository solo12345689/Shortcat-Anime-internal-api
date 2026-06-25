package expo.modules.image.okhttp;

import S4.h;
import Y4.n;
import Y4.o;
import Y4.r;
import dg.C4618A;
import dg.E;
import dg.F;
import dg.v;
import kotlin.jvm.internal.AbstractC5504s;
import v7.g;
import v7.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4618A f46105a;

    public a(C4618A commonClient) {
        AbstractC5504s.h(commonClient, "commonClient");
        this.f46105a = commonClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E f(final Ob.b bVar, v.a chain) {
        AbstractC5504s.h(chain, "chain");
        E eA = chain.a(chain.z());
        E.a aVarY = eA.Y();
        F fJ = eA.j();
        if (fJ != null) {
            return aVarY.b(new i(fJ, new g() { // from class: Ob.d
                @Override // v7.g
                public final void a(long j10, long j11, boolean z10) {
                    expo.modules.image.okhttp.a.g(bVar, j10, j11, z10);
                }
            })).c();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Ob.b bVar, long j10, long j11, boolean z10) {
        Nb.b bVarB = bVar.b();
        if (bVarB != null) {
            bVarB.a(j10, j11, z10);
        }
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n.a b(final Ob.b model, int i10, int i11, h options) {
        AbstractC5504s.h(model, "model");
        AbstractC5504s.h(options, "options");
        return new com.bumptech.glide.integration.okhttp3.a(this.f46105a.F().a(new v() { // from class: Ob.c
            @Override // dg.v
            public final E a(v.a aVar) {
                return expo.modules.image.okhttp.a.f(model, aVar);
            }
        }).c()).b(model.a(), i10, i11, options);
    }

    @Override // Y4.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(Ob.b model) {
        AbstractC5504s.h(model, "model");
        return true;
    }

    /* JADX INFO: renamed from: expo.modules.image.okhttp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0731a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4618A f46106a;

        public C0731a(C4618A commonClient) {
            AbstractC5504s.h(commonClient, "commonClient");
            this.f46106a = commonClient;
        }

        @Override // Y4.o
        public n d(r multiFactory) {
            AbstractC5504s.h(multiFactory, "multiFactory");
            return new a(this.f46106a);
        }

        @Override // Y4.o
        public void teardown() {
        }
    }
}
