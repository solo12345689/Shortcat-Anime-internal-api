package Xf;

import Td.C2160k;
import Wf.AbstractC2358b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Xf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2386x extends Uf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2364a f22010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yf.e f22011b;

    public C2386x(AbstractC2364a lexer, AbstractC2358b json) {
        AbstractC5504s.h(lexer, "lexer");
        AbstractC5504s.h(json, "json");
        this.f22010a = lexer;
        this.f22011b = json.a();
    }

    @Override // Uf.a, Uf.e
    public byte E() {
        AbstractC2364a abstractC2364a = this.f22010a;
        String strQ = abstractC2364a.q();
        try {
            return Df.L.a(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2364a.x(abstractC2364a, "Failed to parse type 'UByte' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C2160k();
        }
    }

    @Override // Uf.c
    public Yf.e a() {
        return this.f22011b;
    }

    @Override // Uf.a, Uf.e
    public int h() {
        AbstractC2364a abstractC2364a = this.f22010a;
        String strQ = abstractC2364a.q();
        try {
            return Df.L.d(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2364a.x(abstractC2364a, "Failed to parse type 'UInt' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C2160k();
        }
    }

    @Override // Uf.c
    public int i(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // Uf.a, Uf.e
    public long n() {
        AbstractC2364a abstractC2364a = this.f22010a;
        String strQ = abstractC2364a.q();
        try {
            return Df.L.g(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2364a.x(abstractC2364a, "Failed to parse type 'ULong' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C2160k();
        }
    }

    @Override // Uf.a, Uf.e
    public short q() {
        AbstractC2364a abstractC2364a = this.f22010a;
        String strQ = abstractC2364a.q();
        try {
            return Df.L.j(strQ);
        } catch (IllegalArgumentException unused) {
            AbstractC2364a.x(abstractC2364a, "Failed to parse type 'UShort' for input '" + strQ + '\'', 0, null, 6, null);
            throw new C2160k();
        }
    }
}
