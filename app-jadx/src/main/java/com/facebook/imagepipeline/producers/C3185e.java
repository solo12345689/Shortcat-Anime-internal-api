package com.facebook.imagepipeline.producers;

import K6.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z6.InterfaceC7307v;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3185e implements e0 {

    /* JADX INFO: renamed from: n */
    public static final Set f36170n = y5.h.c(DiagnosticsEntry.ID_KEY, "uri_source");

    /* JADX INFO: renamed from: o */
    public static final Object f36171o = new Object();

    /* JADX INFO: renamed from: a */
    private final K6.b f36172a;

    /* JADX INFO: renamed from: b */
    private final String f36173b;

    /* JADX INFO: renamed from: c */
    private final String f36174c;

    /* JADX INFO: renamed from: d */
    private final g0 f36175d;

    /* JADX INFO: renamed from: e */
    private final Object f36176e;

    /* JADX INFO: renamed from: f */
    private final b.c f36177f;

    /* JADX INFO: renamed from: g */
    private final Map f36178g;

    /* JADX INFO: renamed from: h */
    private boolean f36179h;

    /* JADX INFO: renamed from: i */
    private y6.f f36180i;

    /* JADX INFO: renamed from: j */
    private boolean f36181j;

    /* JADX INFO: renamed from: k */
    private boolean f36182k;

    /* JADX INFO: renamed from: l */
    private final List f36183l;

    /* JADX INFO: renamed from: m */
    private final InterfaceC7307v f36184m;

    public C3185e(K6.b bVar, String str, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, y6.f fVar, InterfaceC7307v interfaceC7307v) {
        this(bVar, str, null, null, g0Var, obj, cVar, z10, z11, fVar, interfaceC7307v);
    }

    public static void c(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    public static void d(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public static void e(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public static void f(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    @Override // k6.InterfaceC5452a
    public Object C(String str) {
        return this.f36178g.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized y6.f D() {
        return this.f36180i;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public b.c E() {
        return this.f36177f;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public Object a() {
        return this.f36176e;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void b(f0 f0Var) {
        boolean z10;
        synchronized (this) {
            this.f36183l.add(f0Var);
            z10 = this.f36182k;
        }
        if (z10) {
            f0Var.b();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public InterfaceC7307v g() {
        return this.f36184m;
    }

    @Override // k6.InterfaceC5452a
    public Map getExtras() {
        return this.f36178g;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String getId() {
        return this.f36173b;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void h(String str, String str2) {
        this.f36178g.put("origin", str);
        this.f36178g.put("origin_sub", str2);
    }

    public void i() {
        c(n());
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String j() {
        return this.f36174c;
    }

    @Override // k6.InterfaceC5452a
    public void k(String str, Object obj) {
        if (f36170n.contains(str)) {
            return;
        }
        this.f36178g.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void l(String str) {
        h(str, "default");
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public g0 m() {
        return this.f36175d;
    }

    public synchronized List n() {
        if (this.f36182k) {
            return null;
        }
        this.f36182k = true;
        return new ArrayList(this.f36183l);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean o() {
        return this.f36181j;
    }

    public synchronized List p(boolean z10) {
        if (z10 == this.f36181j) {
            return null;
        }
        this.f36181j = z10;
        return new ArrayList(this.f36183l);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public K6.b q() {
        return this.f36172a;
    }

    public synchronized List r(boolean z10) {
        if (z10 == this.f36179h) {
            return null;
        }
        this.f36179h = z10;
        return new ArrayList(this.f36183l);
    }

    public synchronized List s(y6.f fVar) {
        if (fVar == this.f36180i) {
            return null;
        }
        this.f36180i = fVar;
        return new ArrayList(this.f36183l);
    }

    @Override // k6.InterfaceC5452a
    public void w(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            k((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean z() {
        return this.f36179h;
    }

    public C3185e(K6.b bVar, String str, String str2, Map map, g0 g0Var, Object obj, b.c cVar, boolean z10, boolean z11, y6.f fVar, InterfaceC7307v interfaceC7307v) {
        this.f36172a = bVar;
        this.f36173b = str;
        HashMap map2 = new HashMap();
        this.f36178g = map2;
        map2.put(DiagnosticsEntry.ID_KEY, str);
        map2.put("uri_source", bVar == null ? "null-request" : bVar.v());
        w(map);
        this.f36174c = str2;
        this.f36175d = g0Var;
        this.f36176e = obj == null ? f36171o : obj;
        this.f36177f = cVar;
        this.f36179h = z10;
        this.f36180i = fVar;
        this.f36181j = z11;
        this.f36182k = false;
        this.f36183l = new ArrayList();
        this.f36184m = interfaceC7307v;
    }
}
