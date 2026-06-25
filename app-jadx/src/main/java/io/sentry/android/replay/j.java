package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f50321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f50322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50323c;

    public j(File screenshot, long j10, String str) {
        AbstractC5504s.h(screenshot, "screenshot");
        this.f50321a = screenshot;
        this.f50322b = j10;
        this.f50323c = str;
    }

    public final String a() {
        return this.f50323c;
    }

    public final File b() {
        return this.f50321a;
    }

    public final long c() {
        return this.f50322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return AbstractC5504s.c(this.f50321a, jVar.f50321a) && this.f50322b == jVar.f50322b && AbstractC5504s.c(this.f50323c, jVar.f50323c);
    }

    public int hashCode() {
        int iHashCode = ((this.f50321a.hashCode() * 31) + Long.hashCode(this.f50322b)) * 31;
        String str = this.f50323c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.f50321a + ", timestamp=" + this.f50322b + ", screen=" + this.f50323c + ')';
    }
}
