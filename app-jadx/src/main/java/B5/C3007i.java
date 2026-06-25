package b5;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: b5.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3007i implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f33165a;

    public C3007i(r rVar) {
        this.f33165a = rVar;
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U4.v a(ByteBuffer byteBuffer, int i10, int i11, S4.h hVar) {
        return this.f33165a.g(byteBuffer, i10, i11, hVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, S4.h hVar) {
        return this.f33165a.q(byteBuffer);
    }
}
