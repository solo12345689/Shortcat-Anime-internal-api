package t0;

import s0.AbstractC6387s0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC6580c {
    public J(String str, int i10) {
        super(str, AbstractC6579b.f60193a.c(), i10, null);
    }

    @Override // t0.AbstractC6580c
    public float c(int i10) {
        return 2.0f;
    }

    @Override // t0.AbstractC6580c
    public float d(int i10) {
        return -2.0f;
    }

    @Override // t0.AbstractC6580c
    public long h(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
    }

    @Override // t0.AbstractC6580c
    public float i(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // t0.AbstractC6580c
    public long j(float f10, float f11, float f12, float f13, AbstractC6580c abstractC6580c) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return AbstractC6387s0.a(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC6580c);
    }
}
