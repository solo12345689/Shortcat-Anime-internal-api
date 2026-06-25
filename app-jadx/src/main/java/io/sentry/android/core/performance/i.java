package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.AbstractC5226l;
import io.sentry.AbstractC5244o2;
import io.sentry.C5245o3;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f49995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49996d;

    public void A() {
        this.f49996d = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return Long.compare(this.f49994b, iVar.f49994b);
    }

    public String b() {
        return this.f49993a;
    }

    public long c() {
        if (v()) {
            return this.f49996d - this.f49995c;
        }
        return 0L;
    }

    public AbstractC5244o2 h() {
        if (v()) {
            return new C5245o3(AbstractC5226l.i(k()));
        }
        return null;
    }

    public long k() {
        if (u()) {
            return this.f49994b + c();
        }
        return 0L;
    }

    public double m() {
        return AbstractC5226l.j(k());
    }

    public AbstractC5244o2 n() {
        if (u()) {
            return new C5245o3(AbstractC5226l.i(p()));
        }
        return null;
    }

    public long p() {
        return this.f49994b;
    }

    public double q() {
        return AbstractC5226l.j(this.f49994b);
    }

    public long r() {
        return this.f49995c;
    }

    public boolean s() {
        return this.f49995c == 0;
    }

    public boolean t() {
        return this.f49996d == 0;
    }

    public boolean u() {
        return this.f49995c != 0;
    }

    public boolean v() {
        return this.f49996d != 0;
    }

    public void w() {
        this.f49993a = null;
        this.f49995c = 0L;
        this.f49996d = 0L;
        this.f49994b = 0L;
    }

    public void x(long j10) {
        this.f49995c = j10;
        this.f49994b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f49995c);
    }

    public void y(String str, long j10, long j11, long j12) {
        this.f49993a = str;
        this.f49994b = j10;
        this.f49995c = j11;
        this.f49996d = j12;
    }

    public void z() {
        this.f49995c = SystemClock.uptimeMillis();
        this.f49994b = System.currentTimeMillis();
    }
}
