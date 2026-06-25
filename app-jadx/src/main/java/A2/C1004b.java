package A2;

import t2.a0;

/* JADX INFO: renamed from: A2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1004b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f192l;

    private void b(long j10, int i10) {
        this.f191k += j10;
        this.f192l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return a0.I("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f181a), Integer.valueOf(this.f182b), Integer.valueOf(this.f183c), Integer.valueOf(this.f184d), Integer.valueOf(this.f185e), Integer.valueOf(this.f186f), Integer.valueOf(this.f187g), Integer.valueOf(this.f188h), Integer.valueOf(this.f189i), Integer.valueOf(this.f190j), Long.valueOf(this.f191k), Integer.valueOf(this.f192l));
    }
}
