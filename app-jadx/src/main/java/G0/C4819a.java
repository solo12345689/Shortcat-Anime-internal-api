package g0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4819a extends AtomicInteger {
    public C4819a(int i10) {
        super(i10);
    }

    public final int a(int i10) {
        return addAndGet(i10);
    }

    public byte b() {
        return (byte) intValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return b();
    }

    public /* bridge */ double c() {
        return super.doubleValue();
    }

    public /* bridge */ float d() {
        return super.floatValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return c();
    }

    public /* bridge */ int e() {
        return super.intValue();
    }

    public /* bridge */ long f() {
        return super.longValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return d();
    }

    public short g() {
        return (short) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return e();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return f();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return g();
    }
}
