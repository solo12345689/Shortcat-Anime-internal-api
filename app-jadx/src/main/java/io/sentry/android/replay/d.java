package io.sentry.android.replay;

import io.sentry.A3;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final s f50279a;

    /* JADX INFO: renamed from: b */
    private final i f50280b;

    /* JADX INFO: renamed from: c */
    private final Date f50281c;

    /* JADX INFO: renamed from: d */
    private final int f50282d;

    /* JADX INFO: renamed from: e */
    private final long f50283e;

    /* JADX INFO: renamed from: f */
    private final A3.b f50284f;

    /* JADX INFO: renamed from: g */
    private final String f50285g;

    /* JADX INFO: renamed from: h */
    private final List f50286h;

    public d(s recorderConfig, i cache, Date timestamp, int i10, long j10, A3.b replayType, String str, List events) {
        AbstractC5504s.h(recorderConfig, "recorderConfig");
        AbstractC5504s.h(cache, "cache");
        AbstractC5504s.h(timestamp, "timestamp");
        AbstractC5504s.h(replayType, "replayType");
        AbstractC5504s.h(events, "events");
        this.f50279a = recorderConfig;
        this.f50280b = cache;
        this.f50281c = timestamp;
        this.f50282d = i10;
        this.f50283e = j10;
        this.f50284f = replayType;
        this.f50285g = str;
        this.f50286h = events;
    }

    public final i a() {
        return this.f50280b;
    }

    public final long b() {
        return this.f50283e;
    }

    public final List c() {
        return this.f50286h;
    }

    public final int d() {
        return this.f50282d;
    }

    public final s e() {
        return this.f50279a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC5504s.c(this.f50279a, dVar.f50279a) && AbstractC5504s.c(this.f50280b, dVar.f50280b) && AbstractC5504s.c(this.f50281c, dVar.f50281c) && this.f50282d == dVar.f50282d && this.f50283e == dVar.f50283e && this.f50284f == dVar.f50284f && AbstractC5504s.c(this.f50285g, dVar.f50285g) && AbstractC5504s.c(this.f50286h, dVar.f50286h);
    }

    public final A3.b f() {
        return this.f50284f;
    }

    public final String g() {
        return this.f50285g;
    }

    public final Date h() {
        return this.f50281c;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.f50279a.hashCode() * 31) + this.f50280b.hashCode()) * 31) + this.f50281c.hashCode()) * 31) + Integer.hashCode(this.f50282d)) * 31) + Long.hashCode(this.f50283e)) * 31) + this.f50284f.hashCode()) * 31;
        String str = this.f50285g;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f50286h.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.f50279a + ", cache=" + this.f50280b + ", timestamp=" + this.f50281c + ", id=" + this.f50282d + ", duration=" + this.f50283e + ", replayType=" + this.f50284f + ", screenAtStart=" + this.f50285g + ", events=" + this.f50286h + ')';
    }
}
