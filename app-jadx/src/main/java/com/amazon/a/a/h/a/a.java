package com.amazon.a.a.h.a;

import com.amazon.a.a.h.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f34347b = new c("SubmitMetricsTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f34348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f34349d;

    @Override // com.amazon.a.a.n.a.a
    protected void a(h hVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "submit_metrics";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(this.f34349d.c());
        Iterator<com.amazon.a.a.h.a> it = this.f34349d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        map.put("metrics", arrayList);
        return map;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return !this.f34349d.a();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        this.f34349d = this.f34348c.a();
        if (c.f34699a) {
            c cVar = f34347b;
            cVar.a("--------------- SUBMIT METRICS -------------------");
            cVar.a("Size: " + this.f34349d.c());
            cVar.a("--------------------------------------------------");
        }
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
    }
}
