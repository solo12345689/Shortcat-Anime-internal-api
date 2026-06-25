package x2;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f63749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f63750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f63751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63752f;

    public i(String str, long j10, long j11, long j12, File file) {
        this.f63747a = str;
        this.f63748b = j10;
        this.f63749c = j11;
        this.f63750d = file != null;
        this.f63751e = file;
        this.f63752f = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        if (!this.f63747a.equals(iVar.f63747a)) {
            return this.f63747a.compareTo(iVar.f63747a);
        }
        long j10 = this.f63748b - iVar.f63748b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f63750d;
    }

    public boolean c() {
        return this.f63749c == -1;
    }

    public String toString() {
        return "[" + this.f63748b + ", " + this.f63749c + "]";
    }
}
