package n4;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: n4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5738n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53929b;

    public C5738n(String name, String workSpecId) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(workSpecId, "workSpecId");
        this.f53928a = name;
        this.f53929b = workSpecId;
    }

    public final String a() {
        return this.f53928a;
    }

    public final String b() {
        return this.f53929b;
    }
}
