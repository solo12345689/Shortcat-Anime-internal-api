package io.sentry.android.core.performance;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f49970a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f49971b = new i();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f49970a.r(), cVar.f49970a.r());
        return iCompare == 0 ? Long.compare(this.f49971b.r(), cVar.f49971b.r()) : iCompare;
    }

    public final i b() {
        return this.f49970a;
    }

    public final i c() {
        return this.f49971b;
    }
}
