package tg;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: tg.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6691p extends AbstractC6690o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC6690o f61071e;

    public AbstractC6691p(AbstractC6690o delegate) {
        AbstractC5504s.h(delegate, "delegate");
        this.f61071e = delegate;
    }

    @Override // tg.AbstractC6690o
    public X b(P file, boolean z10) {
        AbstractC5504s.h(file, "file");
        return this.f61071e.b(r(file, "appendingSink", "file"), z10);
    }

    @Override // tg.AbstractC6690o
    public void c(P source, P target) {
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(target, "target");
        this.f61071e.c(r(source, "atomicMove", "source"), r(target, "atomicMove", "target"));
    }

    @Override // tg.AbstractC6690o
    public void g(P dir, boolean z10) {
        AbstractC5504s.h(dir, "dir");
        this.f61071e.g(r(dir, "createDirectory", "dir"), z10);
    }

    @Override // tg.AbstractC6690o
    public void i(P path, boolean z10) {
        AbstractC5504s.h(path, "path");
        this.f61071e.i(r(path, "delete", "path"), z10);
    }

    @Override // tg.AbstractC6690o
    public List k(P dir) {
        AbstractC5504s.h(dir, "dir");
        List listK = this.f61071e.k(r(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(s((P) it.next(), "list"));
        }
        AbstractC2279u.A(arrayList);
        return arrayList;
    }

    @Override // tg.AbstractC6690o
    public C6689n m(P path) {
        AbstractC5504s.h(path, "path");
        C6689n c6689nM = this.f61071e.m(r(path, "metadataOrNull", "path"));
        if (c6689nM == null) {
            return null;
        }
        return c6689nM.e() == null ? c6689nM : C6689n.b(c6689nM, false, false, s(c6689nM.e(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    @Override // tg.AbstractC6690o
    public AbstractC6688m n(P file) {
        AbstractC5504s.h(file, "file");
        return this.f61071e.n(r(file, "openReadOnly", "file"));
    }

    @Override // tg.AbstractC6690o
    public X p(P file, boolean z10) {
        AbstractC5504s.h(file, "file");
        return this.f61071e.p(r(file, "sink", "file"), z10);
    }

    @Override // tg.AbstractC6690o
    public Z q(P file) {
        AbstractC5504s.h(file, "file");
        return this.f61071e.q(r(file, "source", "file"));
    }

    public P r(P path, String functionName, String parameterName) {
        AbstractC5504s.h(path, "path");
        AbstractC5504s.h(functionName, "functionName");
        AbstractC5504s.h(parameterName, "parameterName");
        return path;
    }

    public P s(P path, String functionName) {
        AbstractC5504s.h(path, "path");
        AbstractC5504s.h(functionName, "functionName");
        return path;
    }

    public String toString() {
        return kotlin.jvm.internal.O.b(getClass()).v() + '(' + this.f61071e + ')';
    }
}
