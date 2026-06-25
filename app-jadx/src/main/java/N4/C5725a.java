package n4;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5725a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53907b;

    public C5725a(String workSpecId, String prerequisiteId) {
        AbstractC5504s.h(workSpecId, "workSpecId");
        AbstractC5504s.h(prerequisiteId, "prerequisiteId");
        this.f53906a = workSpecId;
        this.f53907b = prerequisiteId;
    }

    public final String a() {
        return this.f53907b;
    }

    public final String b() {
        return this.f53906a;
    }
}
