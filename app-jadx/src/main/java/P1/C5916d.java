package p1;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: p1.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5916d extends AbstractC5914b {

    /* JADX INFO: renamed from: g */
    private static ArrayList f55696g;

    static {
        ArrayList arrayList = new ArrayList();
        f55696g = arrayList;
        arrayList.add("ConstraintSets");
        f55696g.add("Variables");
        f55696g.add("Generate");
        f55696g.add("Transitions");
        f55696g.add("KeyFrames");
        f55696g.add("KeyAttributes");
        f55696g.add("KeyPositions");
        f55696g.add("KeyCycles");
    }

    public C5916d(char[] cArr) {
        super(cArr);
    }

    public static AbstractC5915c Z(String str, AbstractC5915c abstractC5915c) {
        C5916d c5916d = new C5916d(str.toCharArray());
        c5916d.t(0L);
        c5916d.s(str.length() - 1);
        c5916d.c0(abstractC5915c);
        return c5916d;
    }

    public String a0() {
        return d();
    }

    public AbstractC5915c b0() {
        if (this.f55690f.size() > 0) {
            return (AbstractC5915c) this.f55690f.get(0);
        }
        return null;
    }

    public void c0(AbstractC5915c abstractC5915c) {
        if (this.f55690f.size() > 0) {
            this.f55690f.set(0, abstractC5915c);
        } else {
            this.f55690f.add(abstractC5915c);
        }
    }

    @Override // p1.AbstractC5914b, p1.AbstractC5915c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5916d) || Objects.equals(a0(), ((C5916d) obj).a0())) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // p1.AbstractC5914b, p1.AbstractC5915c
    public int hashCode() {
        return super.hashCode();
    }
}
