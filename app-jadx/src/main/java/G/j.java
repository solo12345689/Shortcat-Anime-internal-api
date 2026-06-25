package G;

import oe.AbstractC5874j;
import w.InterfaceC6904i;
import z.InterfaceC7262d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j implements InterfaceC7262d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f6849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7262d f6850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6904i f6851d;

    public j(C c10, InterfaceC7262d interfaceC7262d) {
        this.f6849b = c10;
        this.f6850c = interfaceC7262d;
        this.f6851d = interfaceC7262d.b();
    }

    private final float c(float f10) {
        float fZ = this.f6849b.z() * (-1);
        while (f10 > 0.0f && fZ < f10) {
            fZ += this.f6849b.H();
        }
        while (f10 < 0.0f && fZ > f10) {
            fZ -= this.f6849b.H();
        }
        return fZ;
    }

    @Override // z.InterfaceC7262d
    public float a(float f10, float f11, float f12) {
        float fA = this.f6850c.a(f10, f11, f12);
        if (fA != 0.0f) {
            return c(fA);
        }
        if (this.f6849b.z() == 0) {
            return 0.0f;
        }
        float fZ = this.f6849b.z() * (-1.0f);
        if (this.f6849b.B()) {
            fZ += this.f6849b.H();
        }
        return AbstractC5874j.l(fZ, -f12, f12);
    }

    @Override // z.InterfaceC7262d
    public InterfaceC6904i b() {
        return this.f6851d;
    }
}
