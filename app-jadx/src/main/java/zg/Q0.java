package zg;

/* JADX INFO: loaded from: classes5.dex */
public class Q0 {

    /* JADX INFO: renamed from: a */
    private String f66368a;

    /* JADX INFO: renamed from: b */
    private int f66369b = 0;

    public Q0(String str) {
        this.f66368a = str;
    }

    public boolean a() {
        return this.f66369b != -1;
    }

    public String b() {
        int i10 = this.f66369b;
        if (i10 == -1) {
            return null;
        }
        int iIndexOf = this.f66368a.indexOf(46, i10);
        if (iIndexOf == -1) {
            String strSubstring = this.f66368a.substring(this.f66369b);
            this.f66369b = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f66368a.substring(this.f66369b, iIndexOf);
        this.f66369b = iIndexOf + 1;
        return strSubstring2;
    }
}
