package id;

import android.util.Base64;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: c */
    private static char f48874c = 65535;

    /* JADX INFO: renamed from: a */
    private final CharBuffer f48875a;

    /* JADX INFO: renamed from: b */
    private final List f48876b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str) {
        this(Collections.singletonList(str));
        Objects.requireNonNull(str, "input must not be null");
    }

    private int A() {
        return this.f48875a.length();
    }

    private char C() {
        return l() ? this.f48875a.charAt(0) : f48874c;
    }

    private int D() {
        return this.f48875a.position();
    }

    private void E() {
        while (f(" \t")) {
            a();
        }
    }

    private void F() {
        while (e(' ')) {
            a();
        }
    }

    private void a() {
        CharBuffer charBuffer = this.f48875a;
        charBuffer.position(charBuffer.position() + 1);
    }

    private void b(String str) {
        if (l()) {
            throw g(String.format(str, Integer.valueOf(D()), this.f48875a));
        }
    }

    private void c() {
        this.f48875a.position(r0.position() - 1);
    }

    private static String d(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 0 || cCharAt > 127) {
                throw new C5081m(String.format("Invalid character in field line at position %d: '%c' (0x%04x) (input: %s)", Integer.valueOf(i10), Character.valueOf(cCharAt), Integer.valueOf(cCharAt), str), str, i10);
            }
        }
        return str;
    }

    private boolean e(char c10) {
        return l() && this.f48875a.charAt(0) == c10;
    }

    private boolean f(String str) {
        return l() && str.indexOf(this.f48875a.charAt(0)) >= 0;
    }

    private C5081m g(String str) {
        return new C5081m(str, this.f48875a);
    }

    private C5081m h(String str, Throwable th2) {
        return new C5081m(str, this.f48875a, th2);
    }

    private static String i(char c10) {
        String str;
        if (c10 == '\t') {
            str = "HTAB";
        } else {
            str = "'" + c10 + "'";
        }
        return String.format("%s (\\u%04x)", str, Integer.valueOf(c10));
    }

    private char j() {
        return this.f48875a.get();
    }

    private char k() {
        return l() ? j() : f48874c;
    }

    private boolean l() {
        return this.f48875a.hasRemaining();
    }

    private C5069a m() {
        char cK = k();
        if (cK == f48874c) {
            throw g("Missing data in Boolean");
        }
        if (cK != '?') {
            c();
            throw g(String.format("Boolean must start with question mark, got '%c'", Character.valueOf(cK)));
        }
        char cK2 = k();
        if (cK2 == f48874c) {
            throw g("Missing data in Boolean");
        }
        if (cK2 == '0' || cK2 == '1') {
            return C5069a.e(cK2 == '1');
        }
        c();
        throw g(String.format("Expected '0' or '1' in Boolean, found '%c'", Character.valueOf(cK2)));
    }

    private C5070b n() {
        if (k() != ':') {
            throw g("Byte Sequence must start with colon: " + ((Object) this.f48875a));
        }
        StringBuilder sb2 = new StringBuilder(A());
        boolean z10 = false;
        while (l() && !z10) {
            char cJ = j();
            if (cJ == ':') {
                z10 = true;
            } else {
                if (!z(cJ)) {
                    throw g("Invalid Byte Sequence Character '" + cJ + "' at position " + D());
                }
                sb2.append(cJ);
            }
        }
        if (z10) {
            try {
                return C5070b.e(Base64.decode(sb2.toString(), 0));
            } catch (IllegalArgumentException e10) {
                throw h(e10.getMessage(), e10);
            }
        }
        throw g("Byte Sequence must end with COLON: '" + ((Object) sb2) + "'");
    }

    private List o() {
        if (k() != '(') {
            throw g("Inner List must start with '(': " + ((Object) this.f48875a));
        }
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (l() && !z10) {
            F();
            if (C() == ')') {
                a();
                z10 = true;
            } else {
                arrayList.add(v());
                char C10 = C();
                if (C10 == f48874c) {
                    throw g("Missing data in Inner List");
                }
                if (C10 != ' ' && C10 != ')') {
                    throw g("Expected SP or ')' in Inner List, got: " + i(C10));
                }
            }
        }
        if (z10) {
            return arrayList;
        }
        throw g("Inner List must end with ')': " + ((Object) this.f48875a));
    }

    private InterfaceC5077i p() {
        int i10;
        StringBuilder sb2 = new StringBuilder(20);
        if (e('-')) {
            a();
            i10 = -1;
        } else {
            i10 = 1;
        }
        if (!f("0123456789")) {
            throw g("Illegal start for Integer or Decimal: '" + ((Object) this.f48875a) + "'");
        }
        boolean z10 = false;
        boolean z11 = false;
        while (l() && !z10) {
            char C10 = C();
            if (r.d(C10)) {
                sb2.append(C10);
                a();
            } else if (z11 || C10 != '.') {
                z10 = true;
            } else {
                if (sb2.length() > 12) {
                    throw g("Illegal position for decimal point in Decimal after '" + ((Object) sb2) + "'");
                }
                sb2.append(C10);
                a();
                z11 = true;
            }
            if (sb2.length() > (z11 ? 16 : 15)) {
                c();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(z11 ? "Decimal" : "Integer");
                sb3.append(" too long: ");
                sb3.append(sb2.length());
                sb3.append(" characters");
                throw g(sb3.toString());
            }
        }
        if (!z11) {
            return C5074f.e(((long) i10) * Long.parseLong(sb2.toString()));
        }
        int iIndexOf = sb2.indexOf(".");
        int length = (sb2.length() - iIndexOf) - 1;
        if (length < 1) {
            c();
            throw g("Decimal must not end in '.'");
        }
        if (length == 1) {
            sb2.append("00");
        } else if (length == 2) {
            sb2.append("0");
        } else if (length > 3) {
            c();
            throw g("Maximum number of fractional digits is 3, found: " + length + ", in: " + ((Object) sb2));
        }
        sb2.deleteCharAt(iIndexOf);
        return C5071c.e(((long) i10) * Long.parseLong(sb2.toString()));
    }

    private InterfaceC5075g q() {
        if (!l()) {
            throw g("Empty string found when parsing Bare Item");
        }
        char C10 = C();
        if (r.d(C10) || C10 == '-') {
            return p();
        }
        if (C10 == '\"') {
            return r();
        }
        if (C10 == '?') {
            return m();
        }
        if (C10 == '*' || r.c(C10)) {
            return s();
        }
        if (C10 == ':') {
            return n();
        }
        throw g("Unexpected start character in Bare Item: " + i(C10));
    }

    private o r() {
        if (k() != '\"') {
            throw g("String must start with double quote: '" + ((Object) this.f48875a) + "'");
        }
        StringBuilder sb2 = new StringBuilder(A());
        while (l()) {
            if (this.f48876b.contains(Integer.valueOf(D()))) {
                throw g("String crosses field line boundary at position " + D());
            }
            char cJ = j();
            if (cJ == '\\') {
                char cK = k();
                if (cK == f48874c) {
                    throw g("Incomplete escape sequence at position " + D());
                }
                if (cK != '\"' && cK != '\\') {
                    c();
                    throw g("Invalid escape sequence character '" + cK + "' at position " + D());
                }
                sb2.append(cK);
            } else {
                if (cJ == '\"') {
                    return o.f(sb2.toString());
                }
                if (cJ < ' ' || cJ >= 127) {
                    throw g("Invalid character in String at position " + D());
                }
                sb2.append(cJ);
            }
        }
        throw g("Closing DQUOTE missing");
    }

    private p s() {
        char cK = k();
        if (cK != '*' && !r.c(cK)) {
            throw g("Token must start with ALPHA or *: '" + ((Object) this.f48875a) + "'");
        }
        StringBuilder sb2 = new StringBuilder(A());
        sb2.append(cK);
        boolean z10 = false;
        while (l() && !z10) {
            char C10 = C();
            if (C10 <= ' ' || C10 >= 127 || "\"(),;<=>?@[\\]{}".indexOf(C10) >= 0) {
                z10 = true;
            } else {
                a();
                sb2.append(C10);
            }
        }
        return p.f(sb2.toString());
    }

    private C5072d t() {
        InterfaceC5076h interfaceC5076hB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = false;
        while (l() && !z10) {
            String strX = x();
            if (C() == '=') {
                a();
                interfaceC5076hB = w();
            } else {
                interfaceC5076hB = C5069a.e(true).b(y());
            }
            linkedHashMap.put(strX, interfaceC5076hB);
            E();
            if (l()) {
                char cJ = j();
                if (cJ != ',') {
                    c();
                    throw g("Expected COMMA in Dictionary, found: " + i(cJ));
                }
                E();
                if (!l()) {
                    throw g("Found trailing COMMA in Dictionary");
                }
            } else {
                z10 = true;
            }
        }
        return C5072d.f(linkedHashMap);
    }

    private C5073e u() {
        List listO = o();
        return C5073e.e(listO).f(y());
    }

    private InterfaceC5075g v() {
        return q().b(y());
    }

    private InterfaceC5076h w() {
        return C() == '(' ? u() : v();
    }

    private String x() {
        char cK = k();
        if (cK == f48874c) {
            throw g("Missing data in Key");
        }
        if (cK != '*' && !r.e(cK)) {
            c();
            throw g("Key must start with LCALPHA or '*': " + i(cK));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cK);
        boolean z10 = false;
        while (l() && !z10) {
            char C10 = C();
            if (r.e(C10) || r.d(C10) || C10 == '_' || C10 == '-' || C10 == '.' || C10 == '*') {
                sb2.append(C10);
                a();
            } else {
                z10 = true;
            }
        }
        return sb2.toString();
    }

    private C5079k y() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = false;
        while (l() && !z10) {
            if (C() != ';') {
                z10 = true;
            } else {
                a();
                F();
                String strX = x();
                InterfaceC5075g interfaceC5075gE = C5069a.e(true);
                if (C() == '=') {
                    a();
                    interfaceC5075gE = q();
                }
                linkedHashMap.put(strX, interfaceC5075gE);
            }
        }
        return C5079k.p(linkedHashMap);
    }

    private static boolean z(char c10) {
        return r.c(c10) || r.d(c10) || c10 == '+' || c10 == '/' || c10 == '=';
    }

    public C5072d B() {
        F();
        C5072d c5072dT = t();
        F();
        b("Extra characters in string parsed as Dictionary");
        return c5072dT;
    }

    public n(Iterable iterable) {
        List arrayList = Collections.EMPTY_LIST;
        Objects.requireNonNull(iterable, "fieldLines must not be null");
        Iterator it = iterable.iterator();
        String strD = null;
        StringBuilder sb2 = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (strD == null) {
                strD = d(str);
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                    sb2.append(strD);
                }
                arrayList = arrayList.size() == 0 ? new ArrayList() : arrayList;
                arrayList.add(Integer.valueOf(sb2.length()));
                sb2.append(com.amazon.a.a.o.b.f.f34694a);
                sb2.append(d(str));
            }
        }
        if (strD == null && sb2 == null) {
            throw new C5081m("Empty input", "", 0);
        }
        this.f48875a = CharBuffer.wrap(sb2 != null ? sb2 : strD);
        this.f48876b = arrayList;
    }
}
