package k2;

import G1.c;
import Jf.u;
import P3.f;
import P3.j;
import Td.z;
import Ud.S;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5439b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f52005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f52006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f52007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f52008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f.b f52009e;

    public C5439b(Map initialState) {
        AbstractC5504s.h(initialState, "initialState");
        this.f52005a = S.B(initialState);
        this.f52006b = new LinkedHashMap();
        this.f52007c = new LinkedHashMap();
        this.f52008d = new LinkedHashMap();
        this.f52009e = new f.b() { // from class: k2.a
            @Override // P3.f.b
            public final Bundle a() {
                return C5439b.c(this.f52004a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle c(C5439b c5439b) {
        Pair[] pairArr;
        for (Map.Entry entry : S.y(c5439b.f52008d).entrySet()) {
            c5439b.d((String) entry.getKey(), ((u) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : S.y(c5439b.f52006b).entrySet()) {
            c5439b.d((String) entry2.getKey(), ((f.b) entry2.getValue()).a());
        }
        Map map = c5439b.f52005a;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(z.a((String) entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleA = c.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        j.a(bundleA);
        return bundleA;
    }

    public final f.b b() {
        return this.f52009e;
    }

    public final void d(String key, Object obj) {
        AbstractC5504s.h(key, "key");
        this.f52005a.put(key, obj);
        u uVar = (u) this.f52007c.get(key);
        if (uVar != null) {
            uVar.setValue(obj);
        }
        u uVar2 = (u) this.f52008d.get(key);
        if (uVar2 != null) {
            uVar2.setValue(obj);
        }
    }

    public /* synthetic */ C5439b(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? S.i() : map);
    }
}
