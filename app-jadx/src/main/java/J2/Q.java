package J2;

import android.media.MediaCodec;
import android.os.Bundle;
import z2.C7278c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class Q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f9341a;

    public Q(MediaCodec mediaCodec) {
        this.f9341a = mediaCodec;
    }

    @Override // J2.r
    public void b(int i10, int i11, C7278c c7278c, long j10, int i12) {
        this.f9341a.queueSecureInputBuffer(i10, i11, c7278c.a(), j10, i12);
    }

    @Override // J2.r
    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f9341a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // J2.r
    public void d(Bundle bundle) {
        this.f9341a.setParameters(bundle);
    }

    @Override // J2.r
    public void a() {
    }

    @Override // J2.r
    public void flush() {
    }

    @Override // J2.r
    public void shutdown() {
    }

    @Override // J2.r
    public void start() {
    }
}
