package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b5 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3424b5 extends AbstractC3584t4 {

    /* JADX INFO: renamed from: a */
    private final AbstractC3442d5 f39715a;

    /* JADX INFO: renamed from: b */
    protected AbstractC3442d5 f39716b;

    protected AbstractC3424b5(AbstractC3442d5 abstractC3442d5) {
        this.f39715a = abstractC3442d5;
        if (abstractC3442d5.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f39716b = abstractC3442d5.l();
    }

    private static void j(Object obj, Object obj2) {
        M5.a().b(obj.getClass()).e(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3584t4
    public final /* bridge */ /* synthetic */ AbstractC3584t4 g(byte[] bArr, int i10, int i11) throws C3523m5 {
        R4 r42 = R4.f39561c;
        int i12 = M5.f39422d;
        s(bArr, 0, i11, R4.f39561c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3584t4
    public final /* bridge */ /* synthetic */ AbstractC3584t4 h(byte[] bArr, int i10, int i11, R4 r42) throws C3523m5 {
        s(bArr, 0, i11, r42);
        return this;
    }

    protected final void k() {
        if (this.f39716b.j()) {
            return;
        }
        m();
    }

    protected void m() {
        AbstractC3442d5 abstractC3442d5L = this.f39715a.l();
        j(abstractC3442d5L, this.f39716b);
        this.f39716b = abstractC3442d5L;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC3424b5 clone() {
        AbstractC3424b5 abstractC3424b5 = (AbstractC3424b5) this.f39715a.B(5, null, null);
        abstractC3424b5.f39716b = D1();
        return abstractC3424b5;
    }

    @Override // com.google.android.gms.internal.measurement.D5
    /* JADX INFO: renamed from: p */
    public AbstractC3442d5 D1() {
        if (!this.f39716b.j()) {
            return this.f39716b;
        }
        this.f39716b.n();
        return this.f39716b;
    }

    public final AbstractC3442d5 q() {
        AbstractC3442d5 abstractC3442d5D1 = D1();
        if (abstractC3442d5D1.i()) {
            return abstractC3442d5D1;
        }
        throw new Z5(abstractC3442d5D1);
    }

    public final AbstractC3424b5 r(AbstractC3442d5 abstractC3442d5) {
        if (!this.f39715a.equals(abstractC3442d5)) {
            if (!this.f39716b.j()) {
                m();
            }
            j(this.f39716b, abstractC3442d5);
        }
        return this;
    }

    public final AbstractC3424b5 s(byte[] bArr, int i10, int i11, R4 r42) throws C3523m5 {
        if (!this.f39716b.j()) {
            m();
        }
        try {
            M5.a().b(this.f39716b.getClass()).g(this.f39716b, bArr, 0, i11, new C3619x4(r42));
            return this;
        } catch (C3523m5 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3523m5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
