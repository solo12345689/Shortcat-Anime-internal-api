package a1;

import b1.AbstractC2968a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.K */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2518K {

    /* JADX INFO: renamed from: e */
    public static final a f23521e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f23522f = 8;

    /* JADX INFO: renamed from: a */
    private String f23523a;

    /* JADX INFO: renamed from: b */
    private C2548p f23524b;

    /* JADX INFO: renamed from: c */
    private int f23525c = -1;

    /* JADX INFO: renamed from: d */
    private int f23526d = -1;

    /* JADX INFO: renamed from: a1.K$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2518K(String str) {
        this.f23523a = str;
    }

    public final char a(int i10) {
        C2548p c2548p = this.f23524b;
        if (c2548p == null) {
            return this.f23523a.charAt(i10);
        }
        if (i10 < this.f23525c) {
            return this.f23523a.charAt(i10);
        }
        int iE = c2548p.e();
        int i11 = this.f23525c;
        return i10 < iE + i11 ? c2548p.d(i10 - i11) : this.f23523a.charAt(i10 - ((iE - this.f23526d) + i11));
    }

    public final int b() {
        C2548p c2548p = this.f23524b;
        return c2548p == null ? this.f23523a.length() : (this.f23523a.length() - (this.f23526d - this.f23525c)) + c2548p.e();
    }

    public final void c(int i10, int i11, String str) {
        if (!(i10 <= i11)) {
            AbstractC2968a.a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (!(i10 >= 0)) {
            AbstractC2968a.a("start must be non-negative, but was " + i10);
        }
        C2548p c2548p = this.f23524b;
        if (c2548p != null) {
            int i12 = this.f23525c;
            int i13 = i10 - i12;
            int i14 = i11 - i12;
            if (i13 >= 0 && i14 <= c2548p.e()) {
                c2548p.g(i13, i14, str);
                return;
            }
            this.f23523a = toString();
            this.f23524b = null;
            this.f23525c = -1;
            this.f23526d = -1;
            c(i10, i11, str);
            return;
        }
        int iMax = Math.max(255, str.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(i10, 64);
        int iMin2 = Math.min(this.f23523a.length() - i11, 64);
        int i15 = i10 - iMin;
        AbstractC2550r.a(this.f23523a, cArr, 0, i15, i10);
        int i16 = iMax - iMin2;
        int i17 = iMin2 + i11;
        AbstractC2550r.a(this.f23523a, cArr, i16, i11, i17);
        AbstractC2549q.b(str, cArr, iMin);
        this.f23524b = new C2548p(cArr, iMin + str.length(), i16);
        this.f23525c = i15;
        this.f23526d = i17;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public String toString() {
        C2548p c2548p = this.f23524b;
        if (c2548p == null) {
            return this.f23523a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f23523a, 0, this.f23525c);
        c2548p.a(sb2);
        String str = this.f23523a;
        sb2.append((CharSequence) str, this.f23526d, str.length());
        return sb2.toString();
    }
}
