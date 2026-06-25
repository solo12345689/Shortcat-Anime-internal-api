package com.amazon.a.a.c;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34317a = new com.amazon.a.a.o.c("EventManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<b, e<?>> f34318b = new HashMap();

    @Override // com.amazon.a.a.c.f
    public <T extends a> void a(c<T> cVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "listener");
        com.amazon.a.a.o.a.a.a();
        b bVarA = cVar.a();
        f34317a.a("Registering listener for event: " + bVarA + ", " + cVar);
        e<?> eVar = this.f34318b.get(bVarA);
        if (eVar == null) {
            eVar = new e<>();
            this.f34318b.put(bVarA, eVar);
        }
        eVar.a(cVar);
    }

    @Override // com.amazon.a.a.c.f
    public void a(a aVar) {
        b bVarA = aVar.a();
        if (com.amazon.a.a.o.c.f34699a) {
            f34317a.a("Posting event: " + bVarA);
        }
        if (!this.f34318b.containsKey(bVarA)) {
            if (com.amazon.a.a.o.c.f34699a) {
                f34317a.a("No registered listeners, returning");
                return;
            }
            return;
        }
        this.f34318b.get(bVarA).a(aVar);
    }
}
