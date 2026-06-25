package com.facebook.imagepipeline.producers;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import s5.InterfaceC6433d;
import u4.C6736f;
import u4.InterfaceC6734d;
import z5.AbstractC7283a;
import z6.InterfaceC7289c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Y implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y5.n f36127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x6.k f36128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B5.i f36129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B5.a f36130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f36131e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC6734d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f36132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f36133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3194n f36134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6433d f36135d;

        a(g0 g0Var, e0 e0Var, InterfaceC3194n interfaceC3194n, InterfaceC6433d interfaceC6433d) {
            this.f36132a = g0Var;
            this.f36133b = e0Var;
            this.f36134c = interfaceC3194n;
            this.f36135d = interfaceC6433d;
        }

        @Override // u4.InterfaceC6734d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(C6736f c6736f) {
            if (Y.g(c6736f)) {
                this.f36132a.c(this.f36133b, "PartialDiskCacheProducer", null);
                this.f36134c.b();
            } else if (c6736f.n()) {
                this.f36132a.k(this.f36133b, "PartialDiskCacheProducer", c6736f.i(), null);
                Y.this.i(this.f36134c, this.f36133b, this.f36135d, null);
            } else {
                E6.k kVar = (E6.k) c6736f.j();
                if (kVar != null) {
                    g0 g0Var = this.f36132a;
                    e0 e0Var = this.f36133b;
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, true, kVar.C()));
                    y6.b bVarG = y6.b.g(kVar.C() - 1);
                    kVar.F0(bVarG);
                    int iC = kVar.C();
                    K6.b bVarQ = this.f36133b.q();
                    if (bVarG.c(bVarQ.b())) {
                        this.f36133b.h("disk", "partial");
                        this.f36132a.b(this.f36133b, "PartialDiskCacheProducer", true);
                        this.f36134c.c(kVar, 9);
                    } else {
                        this.f36134c.c(kVar, 8);
                        Y.this.i(this.f36134c, new l0(K6.c.b(bVarQ).z(y6.b.d(iC - 1)).a(), this.f36133b), this.f36135d, kVar);
                    }
                } else {
                    g0 g0Var2 = this.f36132a;
                    e0 e0Var2 = this.f36133b;
                    g0Var2.j(e0Var2, "PartialDiskCacheProducer", Y.f(g0Var2, e0Var2, false, 0));
                    Y.this.i(this.f36134c, this.f36133b, this.f36135d, kVar);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f36137a;

        b(AtomicBoolean atomicBoolean) {
            this.f36137a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36137a.set(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y5.n f36139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC6433d f36140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final B5.i f36141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final B5.a f36142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final E6.k f36143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f36144h;

        private void q(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
            byte[] bArr = (byte[]) this.f36142f.get(16384);
            int i11 = i10;
            while (i11 > 0) {
                try {
                    int i12 = inputStream.read(bArr, 0, Math.min(16384, i11));
                    if (i12 < 0) {
                        break;
                    } else if (i12 > 0) {
                        outputStream.write(bArr, 0, i12);
                        i11 -= i12;
                    }
                } finally {
                    this.f36142f.a(bArr);
                }
            }
            if (i11 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }

        private B5.k r(E6.k kVar, E6.k kVar2) throws IOException {
            int i10 = ((y6.b) y5.k.g(kVar2.k())).f64834a;
            B5.k kVarE = this.f36141e.e(kVar2.C() + i10);
            q(kVar.w(), kVarE, i10);
            q(kVar2.w(), kVarE, kVar2.C());
            return kVarE;
        }

        private void t(B5.k kVar) throws Throwable {
            E6.k kVar2;
            Throwable th2;
            C5.a aVarJ = C5.a.J(kVar.a());
            try {
                kVar2 = new E6.k(aVarJ);
            } catch (Throwable th3) {
                kVar2 = null;
                th2 = th3;
            }
            try {
                kVar2.h0();
                p().c(kVar2, 1);
                E6.k.g(kVar2);
                C5.a.m(aVarJ);
            } catch (Throwable th4) {
                th2 = th4;
                E6.k.g(kVar2);
                C5.a.m(aVarJ);
                throw th2;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            if (AbstractC3183c.f(i10)) {
                return;
            }
            if (this.f36143g != null && kVar != null && kVar.k() != null) {
                try {
                    try {
                        t(r(this.f36143g, kVar));
                    } catch (IOException e10) {
                        AbstractC7283a.n("PartialDiskCacheProducer", "Error while merging image data", e10);
                        p().a(e10);
                    }
                    ((InterfaceC7289c) this.f36139c.get()).b().s(this.f36140d);
                    return;
                } finally {
                    kVar.close();
                    this.f36143g.close();
                }
            }
            if (!this.f36144h || !AbstractC3183c.n(i10, 8) || !AbstractC3183c.e(i10) || kVar == null || kVar.o() == q6.c.f57672d) {
                p().c(kVar, i10);
            } else {
                ((InterfaceC7289c) this.f36139c.get()).b().p(this.f36140d, kVar);
                p().c(kVar, i10);
            }
        }

        private c(InterfaceC3194n interfaceC3194n, y5.n nVar, InterfaceC6433d interfaceC6433d, B5.i iVar, B5.a aVar, E6.k kVar, boolean z10) {
            super(interfaceC3194n);
            this.f36139c = nVar;
            this.f36140d = interfaceC6433d;
            this.f36141e = iVar;
            this.f36142f = aVar;
            this.f36143g = kVar;
            this.f36144h = z10;
        }
    }

    public Y(y5.n nVar, x6.k kVar, B5.i iVar, B5.a aVar, d0 d0Var) {
        this.f36127a = nVar;
        this.f36128b = kVar;
        this.f36129c = iVar;
        this.f36130d = aVar;
        this.f36131e = d0Var;
    }

    private static Uri e(K6.b bVar) {
        return bVar.v().buildUpon().appendQueryParameter("fresco_partial", com.amazon.a.a.o.b.f34640af).build();
    }

    static Map f(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (g0Var.f(e0Var, "PartialDiskCacheProducer")) {
            return z10 ? y5.g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10)) : y5.g.of("cached_value_found", String.valueOf(z10));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(C6736f c6736f) {
        if (c6736f.l()) {
            return true;
        }
        return c6736f.n() && (c6736f.i() instanceof CancellationException);
    }

    private InterfaceC6734d h(InterfaceC3194n interfaceC3194n, e0 e0Var, InterfaceC6433d interfaceC6433d) {
        return new a(e0Var.m(), e0Var, interfaceC3194n, interfaceC6433d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(InterfaceC3194n interfaceC3194n, e0 e0Var, InterfaceC6433d interfaceC6433d, E6.k kVar) {
        this.f36131e.a(new c(interfaceC3194n, this.f36127a, interfaceC6433d, this.f36129c, this.f36130d, kVar, e0Var.q().y(32)), e0Var);
    }

    private void j(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.b(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        K6.b bVarQ = e0Var.q();
        boolean zY = e0Var.q().y(16);
        boolean zY2 = e0Var.q().y(32);
        if (!zY && !zY2) {
            this.f36131e.a(interfaceC3194n, e0Var);
            return;
        }
        g0 g0VarM = e0Var.m();
        g0VarM.d(e0Var, "PartialDiskCacheProducer");
        InterfaceC6433d interfaceC6433dC = this.f36128b.c(bVarQ, e(bVarQ), e0Var.a());
        if (!zY) {
            g0VarM.j(e0Var, "PartialDiskCacheProducer", f(g0VarM, e0Var, false, 0));
            i(interfaceC3194n, e0Var, interfaceC6433dC, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((InterfaceC7289c) this.f36127a.get()).b().m(interfaceC6433dC, atomicBoolean).e(h(interfaceC3194n, e0Var, interfaceC6433dC));
            j(atomicBoolean, e0Var);
        }
    }
}
