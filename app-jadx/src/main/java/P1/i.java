package p1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class i extends AbstractC5915c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static i u(String str) {
        i iVar = new i(str.toCharArray());
        iVar.t(0L);
        iVar.s(str.length() - 1);
        return iVar;
    }

    @Override // p1.AbstractC5915c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && d().equals(((i) obj).d())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // p1.AbstractC5915c
    public int hashCode() {
        return super.hashCode();
    }
}
