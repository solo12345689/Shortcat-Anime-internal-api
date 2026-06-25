package M3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f12137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f12138b;

    public k(q database) {
        AbstractC5504s.h(database, "database");
        this.f12137a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC5504s.g(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f12138b = setNewSetFromMap;
    }
}
