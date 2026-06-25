package io.sentry.featureflags;

import io.sentry.C5322z3;
import io.sentry.protocol.C5257g;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile CopyOnWriteArrayList f50685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5288a f50686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50687c;

    private a(int i10) {
        this.f50686b = new C5288a();
        this.f50687c = i10;
        this.f50685a = new CopyOnWriteArrayList();
    }

    public static b a(C5322z3 c5322z3) {
        int maxFeatureFlags = c5322z3.getMaxFeatureFlags();
        return maxFeatureFlags > 0 ? new a(maxFeatureFlags) : c.a();
    }

    private static b b(int i10, a aVar, a aVar2, a aVar3) {
        CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.f50685a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f50685a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 != null ? aVar3.f50685a : null;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return c.a();
        }
        int i11 = size - 1;
        int i12 = size2 - 1;
        int i13 = size3 - 1;
        if (copyOnWriteArrayList != null && i11 >= 0) {
            android.support.v4.media.session.b.a(copyOnWriteArrayList.get(i11));
        }
        if (copyOnWriteArrayList2 != null && i12 >= 0) {
            android.support.v4.media.session.b.a(copyOnWriteArrayList2.get(i12));
        }
        if (copyOnWriteArrayList3 != null && i13 >= 0) {
            android.support.v4.media.session.b.a(copyOnWriteArrayList3.get(i13));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        linkedHashMap.size();
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        return new a(i10, new CopyOnWriteArrayList(arrayList));
    }

    public static b c(C5322z3 c5322z3, b bVar, b bVar2, b bVar3) {
        int maxFeatureFlags = c5322z3.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return c.a();
        }
        return b(maxFeatureFlags, bVar instanceof a ? (a) bVar : null, bVar2 instanceof a ? (a) bVar2 : null, bVar3 instanceof a ? (a) bVar3 : null);
    }

    @Override // io.sentry.featureflags.b
    public C5257g n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f50685a.iterator();
        if (!it.hasNext()) {
            return new C5257g(arrayList);
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    @Override // io.sentry.featureflags.b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m959clone() {
        return new a(this);
    }

    private a(int i10, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f50686b = new C5288a();
        this.f50687c = i10;
        this.f50685a = copyOnWriteArrayList;
    }

    private a(a aVar) {
        this.f50686b = new C5288a();
        this.f50687c = aVar.f50687c;
        this.f50685a = new CopyOnWriteArrayList(aVar.f50685a);
    }
}
