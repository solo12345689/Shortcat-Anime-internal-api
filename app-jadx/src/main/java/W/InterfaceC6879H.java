package w;

/* JADX INFO: renamed from: w.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6879H extends InterfaceC6904i {
    default float b(float f10, float f11, float f12) {
        return d(e(f10, f11, f12), f10, f11, f12);
    }

    float c(long j10, float f10, float f11, float f12);

    float d(long j10, float f10, float f11, float f12);

    long e(float f10, float f11, float f12);

    @Override // w.InterfaceC6904i
    default A0 a(s0 s0Var) {
        return new A0(this);
    }
}
