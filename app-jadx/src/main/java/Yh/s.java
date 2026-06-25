package Yh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f23015a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f23016b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s f23017c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s f23018d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s f23019e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f23020f = null;

    public void a(x xVar) {
        if (this.f23020f == null) {
            this.f23020f = new ArrayList();
        }
        this.f23020f.add(xVar);
    }

    public void b(s sVar) {
        sVar.m();
        sVar.j(this);
        s sVar2 = this.f23017c;
        if (sVar2 == null) {
            this.f23016b = sVar;
            this.f23017c = sVar;
        } else {
            sVar2.f23019e = sVar;
            sVar.f23018d = sVar2;
            this.f23017c = sVar;
        }
    }

    public s c() {
        return this.f23016b;
    }

    public s d() {
        return this.f23017c;
    }

    public s e() {
        return this.f23019e;
    }

    public s f() {
        return this.f23015a;
    }

    public List g() {
        List list = this.f23020f;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    public void h(s sVar) {
        sVar.m();
        s sVar2 = this.f23019e;
        sVar.f23019e = sVar2;
        if (sVar2 != null) {
            sVar2.f23018d = sVar;
        }
        sVar.f23018d = this;
        this.f23019e = sVar;
        s sVar3 = this.f23015a;
        sVar.f23015a = sVar3;
        if (sVar.f23019e == null) {
            sVar3.f23017c = sVar;
        }
    }

    public void i(s sVar) {
        sVar.m();
        s sVar2 = this.f23018d;
        sVar.f23018d = sVar2;
        if (sVar2 != null) {
            sVar2.f23019e = sVar;
        }
        sVar.f23019e = this;
        this.f23018d = sVar;
        s sVar3 = this.f23015a;
        sVar.f23015a = sVar3;
        if (sVar.f23018d == null) {
            sVar3.f23016b = sVar;
        }
    }

    protected void j(s sVar) {
        this.f23015a = sVar;
    }

    public void k(List list) {
        if (list.isEmpty()) {
            this.f23020f = null;
        } else {
            this.f23020f = new ArrayList(list);
        }
    }

    protected String l() {
        return "";
    }

    public void m() {
        s sVar = this.f23018d;
        if (sVar != null) {
            sVar.f23019e = this.f23019e;
        } else {
            s sVar2 = this.f23015a;
            if (sVar2 != null) {
                sVar2.f23016b = this.f23019e;
            }
        }
        s sVar3 = this.f23019e;
        if (sVar3 != null) {
            sVar3.f23018d = sVar;
        } else {
            s sVar4 = this.f23015a;
            if (sVar4 != null) {
                sVar4.f23017c = sVar;
            }
        }
        this.f23015a = null;
        this.f23019e = null;
        this.f23018d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + l() + "}";
    }
}
