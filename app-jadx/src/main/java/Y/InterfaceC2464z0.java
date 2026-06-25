package Y;

/* JADX INFO: renamed from: Y.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2464z0 extends InterfaceC2396c0, C0 {
    @Override // Y.InterfaceC2396c0
    float c();

    default void j(float f10) {
        k(f10);
    }

    void k(float f10);

    @Override // Y.C0
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        j(((Number) obj).floatValue());
    }

    @Override // Y.h2
    default Float getValue() {
        return Float.valueOf(c());
    }
}
