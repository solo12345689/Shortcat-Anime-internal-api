package com.amazon.a.a.b.b;

import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f34273b = new c("SubmitCrashReportsTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.b.a f34274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.amazon.a.a.b.c> f34275d;

    @Override // com.amazon.a.a.n.a.a
    protected void a(h hVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "submit_crash_reports";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<com.amazon.a.a.b.c> it = this.f34275d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        map.put("reports", arrayList);
        return map;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return !this.f34275d.isEmpty();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        this.f34275d = this.f34274c.a();
        if (c.f34699a) {
            c cVar = f34273b;
            cVar.a("--------------- Crash Reports -------------------");
            cVar.a("Size: " + this.f34275d.size());
            cVar.a("--------------------------------------------------");
        }
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        this.f34274c.a(this.f34275d);
    }
}
