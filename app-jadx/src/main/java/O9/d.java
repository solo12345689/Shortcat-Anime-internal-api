package O9;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class a extends d {
        a() {
        }

        @Override // O9.o
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.b((Character) obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f13078a;

        b(char c10) {
            this.f13078a = c10;
        }

        @Override // O9.d
        public boolean e(char c10) {
            return c10 == this.f13078a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.g(this.f13078a) + "')";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13079a;

        c(String str) {
            this.f13079a = (String) n.j(str);
        }

        public final String toString() {
            return this.f13079a;
        }
    }

    /* JADX INFO: renamed from: O9.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0207d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f13080b = new C0207d();

        private C0207d() {
            super("CharMatcher.none()");
        }

        @Override // O9.d
        public int c(CharSequence charSequence, int i10) {
            n.m(i10, charSequence.length());
            return -1;
        }

        @Override // O9.d
        public boolean e(char c10) {
            return false;
        }
    }

    protected d() {
    }

    public static d d(char c10) {
        return new b(c10);
    }

    public static d f() {
        return C0207d.f13080b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public boolean b(Character ch2) {
        return e(ch2.charValue());
    }

    public int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        n.m(i10, length);
        while (i10 < length) {
            if (e(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean e(char c10);
}
