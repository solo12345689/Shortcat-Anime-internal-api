package com.facebook.react.devsupport.inspector;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameTimingSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f36752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f36753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f36754e;

    public FrameTimingSequence(int i10, int i11, long j10, long j11, byte[] bArr) {
        this.f36750a = i10;
        this.f36751b = i11;
        this.f36752c = j10;
        this.f36753d = j11;
        this.f36754e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameTimingSequence)) {
            return false;
        }
        FrameTimingSequence frameTimingSequence = (FrameTimingSequence) obj;
        return this.f36750a == frameTimingSequence.f36750a && this.f36751b == frameTimingSequence.f36751b && this.f36752c == frameTimingSequence.f36752c && this.f36753d == frameTimingSequence.f36753d && AbstractC5504s.c(this.f36754e, frameTimingSequence.f36754e);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f36750a) * 31) + Integer.hashCode(this.f36751b)) * 31) + Long.hashCode(this.f36752c)) * 31) + Long.hashCode(this.f36753d)) * 31;
        byte[] bArr = this.f36754e;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "FrameTimingSequence(id=" + this.f36750a + ", threadId=" + this.f36751b + ", beginTimestamp=" + this.f36752c + ", endTimestamp=" + this.f36753d + ", screenshot=" + Arrays.toString(this.f36754e) + ")";
    }
}
