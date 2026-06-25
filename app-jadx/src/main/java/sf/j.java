package sf;

import Ud.AbstractC2279u;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import qf.v0;
import rf.AbstractC6317g;
import ye.InterfaceC7230h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements v0 {

    /* JADX INFO: renamed from: a */
    private final k f59634a;

    /* JADX INFO: renamed from: b */
    private final String[] f59635b;

    /* JADX INFO: renamed from: c */
    private final String f59636c;

    public j(k kind, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
        this.f59634a = kind;
        this.f59635b = formatParams;
        String strB = b.f59598g.b();
        String strB2 = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC5504s.g(str, "format(...)");
        String str2 = String.format(strB, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC5504s.g(str2, "format(...)");
        this.f59636c = str2;
    }

    public final k b() {
        return this.f59634a;
    }

    public final String c(int i10) {
        return this.f59635b[i10];
    }

    @Override // qf.v0
    public List getParameters() {
        return AbstractC2279u.m();
    }

    @Override // qf.v0
    public Collection k() {
        return AbstractC2279u.m();
    }

    @Override // qf.v0
    public ve.i n() {
        return ve.g.f62098h.a();
    }

    @Override // qf.v0
    public v0 o(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // qf.v0
    public InterfaceC7230h p() {
        return l.f59724a.h();
    }

    @Override // qf.v0
    public boolean q() {
        return false;
    }

    public String toString() {
        return this.f59636c;
    }
}
