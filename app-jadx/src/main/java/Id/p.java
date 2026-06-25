package id;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class p implements InterfaceC5075g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48880b;

    private p(String str, C5079k c5079k) {
        Objects.requireNonNull(str, "value must not be null");
        this.f48879a = d(str);
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48880b = c5079k;
    }

    private static String d(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("Token can not be empty");
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ((i10 == 0 && cCharAt != '*' && !r.c(cCharAt)) || cCharAt <= ' ' || cCharAt >= 127 || "\"(),;<=>?@[\\]{}".indexOf(cCharAt) >= 0) {
                throw new IllegalArgumentException(String.format("Invalid character in Token at position %d: '%c' (0x%04x)", Integer.valueOf(i10), Character.valueOf(cCharAt), Integer.valueOf(cCharAt)));
            }
        }
        return str;
    }

    public static p f(String str) {
        return new p(str, C5079k.f48870b);
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48880b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(this.f48879a);
        this.f48880b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get() {
        return this.f48879a;
    }

    @Override // id.InterfaceC5075g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p b(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new p(this.f48879a, c5079k);
    }
}
