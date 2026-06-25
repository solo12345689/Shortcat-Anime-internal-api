package com.facebook.imagepipeline.memory;

import B5.k;
import H6.v;
import H6.x;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f35986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C5.a f35987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35988c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends RuntimeException {
        public a() {
            super("OutputStream no longer valid");
        }
    }

    public /* synthetic */ g(f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? fVar.D() : i10);
    }

    private final void b() {
        if (!C5.a.H(this.f35987b)) {
            throw new a();
        }
    }

    @Override // B5.k, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        C5.a.m(this.f35987b);
        this.f35987b = null;
        this.f35988c = -1;
        super.close();
    }

    public final void g(int i10) throws Throwable {
        b();
        C5.a aVar = this.f35987b;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractC5504s.e(aVar);
        if (i10 <= ((v) aVar.C()).getSize()) {
            return;
        }
        Object obj = this.f35986a.get(i10);
        AbstractC5504s.g(obj, "get(...)");
        v vVar = (v) obj;
        C5.a aVar2 = this.f35987b;
        if (aVar2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AbstractC5504s.e(aVar2);
        ((v) aVar2.C()).b(0, vVar, 0, this.f35988c);
        C5.a aVar3 = this.f35987b;
        AbstractC5504s.e(aVar3);
        aVar3.close();
        this.f35987b = C5.a.S(vVar, this.f35986a);
    }

    @Override // B5.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x a() {
        b();
        C5.a aVar = this.f35987b;
        if (aVar != null) {
            return new x(aVar, this.f35988c);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // B5.k
    public int size() {
        return this.f35988c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    public g(f pool, int i10) {
        AbstractC5504s.h(pool, "pool");
        if (i10 > 0) {
            this.f35986a = pool;
            this.f35988c = 0;
            this.f35987b = C5.a.S(pool.get(i10), pool);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) throws Throwable {
        AbstractC5504s.h(buffer, "buffer");
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= buffer.length) {
            b();
            g(this.f35988c + i11);
            C5.a aVar = this.f35987b;
            if (aVar != null) {
                ((v) aVar.C()).g(this.f35988c, buffer, i10, i11);
                this.f35988c += i11;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new ArrayIndexOutOfBoundsException("length=" + buffer.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
