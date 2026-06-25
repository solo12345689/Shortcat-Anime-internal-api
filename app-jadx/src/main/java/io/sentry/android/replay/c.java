package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f50138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f50140c;

    public c(File video, int i10, long j10) {
        AbstractC5504s.h(video, "video");
        this.f50138a = video;
        this.f50139b = i10;
        this.f50140c = j10;
    }

    public final File a() {
        return this.f50138a;
    }

    public final int b() {
        return this.f50139b;
    }

    public final long c() {
        return this.f50140c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC5504s.c(this.f50138a, cVar.f50138a) && this.f50139b == cVar.f50139b && this.f50140c == cVar.f50140c;
    }

    public int hashCode() {
        return (((this.f50138a.hashCode() * 31) + Integer.hashCode(this.f50139b)) * 31) + Long.hashCode(this.f50140c);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.f50138a + ", frameCount=" + this.f50139b + ", duration=" + this.f50140c + ')';
    }
}
