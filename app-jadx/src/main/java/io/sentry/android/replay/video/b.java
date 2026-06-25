package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f50455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaMuxer f50456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f50460f;

    public b(String path, float f10) {
        AbstractC5504s.h(path, "path");
        this.f50455a = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.f50456b = new MediaMuxer(path, 0);
    }

    public long a() {
        if (this.f50459e == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.f50460f + this.f50455a, TimeUnit.MICROSECONDS);
    }

    public boolean b() {
        return this.f50457c;
    }

    public void c(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        AbstractC5504s.h(encodedData, "encodedData");
        AbstractC5504s.h(bufferInfo, "bufferInfo");
        long j10 = this.f50455a;
        int i10 = this.f50459e;
        this.f50459e = i10 + 1;
        long j11 = j10 * ((long) i10);
        this.f50460f = j11;
        bufferInfo.presentationTimeUs = j11;
        this.f50456b.writeSampleData(this.f50458d, encodedData, bufferInfo);
    }

    public void d() {
        this.f50456b.stop();
        this.f50456b.release();
    }

    public void e(MediaFormat videoFormat) {
        AbstractC5504s.h(videoFormat, "videoFormat");
        this.f50458d = this.f50456b.addTrack(videoFormat);
        this.f50456b.start();
        this.f50457c = true;
    }
}
