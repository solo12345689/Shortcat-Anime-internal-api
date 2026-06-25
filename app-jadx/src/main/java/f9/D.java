package f9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class D extends s {

    /* JADX INFO: renamed from: c */
    final CharSequence f46955c;

    /* JADX INFO: renamed from: d */
    final x f46956d;

    /* JADX INFO: renamed from: e */
    final boolean f46957e;

    /* JADX INFO: renamed from: f */
    int f46958f = 0;

    /* JADX INFO: renamed from: g */
    int f46959g = Integer.MAX_VALUE;

    D(E e10, CharSequence charSequence) {
        this.f46956d = e10.f();
        this.f46957e = e10.g();
        this.f46955c = charSequence;
    }

    @Override // f9.s
    protected final /* bridge */ /* synthetic */ Object b() {
        int iD;
        int iE;
        int i10 = this.f46958f;
        while (true) {
            int i11 = this.f46958f;
            if (i11 == -1) {
                c();
                return null;
            }
            iD = d(i11);
            if (iD == -1) {
                iD = this.f46955c.length();
                this.f46958f = -1;
                iE = -1;
            } else {
                iE = e(iD);
                this.f46958f = iE;
            }
            if (iE == i10) {
                int i12 = iE + 1;
                this.f46958f = i12;
                if (i12 > this.f46955c.length()) {
                    this.f46958f = -1;
                }
            } else {
                if (i10 < iD) {
                    this.f46955c.charAt(i10);
                }
                if (i10 < iD) {
                    this.f46955c.charAt(iD - 1);
                }
                if (!this.f46957e || i10 != iD) {
                    break;
                }
                i10 = this.f46958f;
            }
        }
        int i13 = this.f46959g;
        if (i13 == 1) {
            CharSequence charSequence = this.f46955c;
            int length = charSequence.length();
            this.f46958f = -1;
            if (length > i10) {
                charSequence.charAt(length - 1);
            }
            iD = length;
        } else {
            this.f46959g = i13 - 1;
        }
        return this.f46955c.subSequence(i10, iD).toString();
    }

    abstract int d(int i10);

    abstract int e(int i10);
}
