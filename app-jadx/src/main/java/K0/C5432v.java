package k0;

import Td.C2160k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: k0.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C5432v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51994b;

    public C5432v(String str) {
        this.f51993a = str;
    }

    public static /* synthetic */ void b(C5432v c5432v, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        c5432v.a(i10);
    }

    public final void a(int i10) {
        this.f51994b += i10;
    }

    public final boolean c() {
        return this.f51994b >= this.f51993a.length();
    }

    public final char d() {
        return this.f51993a.charAt(this.f51994b);
    }

    public final void e(char c10) throws C5430t {
        if (h(c10)) {
            return;
        }
        m("expected " + c10);
        throw new C2160k();
    }

    public final String f() {
        return this.f51993a;
    }

    public final int g() {
        return this.f51994b;
    }

    public final boolean h(char c10) {
        return this.f51994b < this.f51993a.length() && this.f51993a.charAt(this.f51994b) == c10;
    }

    public final void i(String str) {
        while (this.f51994b < this.f51993a.length() && !Df.r.V(str, this.f51993a.charAt(this.f51994b), false, 2, null)) {
            this.f51994b++;
        }
    }

    public final int j(String str) throws C5430t {
        Integer numR = Df.r.r(k(str));
        if (numR != null) {
            return numR.intValue();
        }
        m("expected int");
        throw new C2160k();
    }

    public final String k(String str) {
        int i10 = this.f51994b;
        i(str);
        int i11 = this.f51994b;
        if (i11 <= i10) {
            return "";
        }
        String strSubstring = this.f51993a.substring(i10, i11);
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String l() {
        String str = this.f51993a;
        String strSubstring = str.substring(this.f51994b, str.length());
        AbstractC5504s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final Void m(String str) throws C5430t {
        int iMin = Math.min(this.f51994b, this.f51993a.length());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while parsing source information: ");
        sb2.append(str);
        sb2.append(" at ");
        String strSubstring = this.f51993a.substring(0, iMin);
        AbstractC5504s.g(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append('|');
        String strSubstring2 = this.f51993a.substring(iMin);
        AbstractC5504s.g(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        throw new C5430t(sb2.toString());
    }
}
