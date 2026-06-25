package u2;

import q2.C6078J;

/* JADX INFO: renamed from: u2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6725g implements C6078J.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f61233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f61235c;

    public C6725g(long j10, long j11, long j12) {
        this.f61233a = j10;
        this.f61234b = j11;
        this.f61235c = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6725g)) {
            return false;
        }
        C6725g c6725g = (C6725g) obj;
        return this.f61233a == c6725g.f61233a && this.f61234b == c6725g.f61234b && this.f61235c == c6725g.f61235c;
    }

    public int hashCode() {
        return ((((527 + S9.h.c(this.f61233a)) * 31) + S9.h.c(this.f61234b)) * 31) + S9.h.c(this.f61235c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f61233a + ", modification time=" + this.f61234b + ", timescale=" + this.f61235c;
    }
}
