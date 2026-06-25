package id;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class o implements InterfaceC5075g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5079k f48878b;

    private o(String str, C5079k c5079k) {
        Objects.requireNonNull(str, "value must not be null");
        this.f48877a = d(str);
        Objects.requireNonNull(c5079k, "params must not be null");
        this.f48878b = c5079k;
    }

    private static String d(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format("Invalid character in String at position %d: '%c' (0x%04x)", Integer.valueOf(i10), Character.valueOf(cCharAt), Integer.valueOf(cCharAt)));
            }
        }
        return str;
    }

    public static o f(String str) {
        return new o(str, C5079k.f48870b);
    }

    @Override // id.InterfaceC5080l
    public C5079k a() {
        return this.f48878b;
    }

    @Override // id.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append('\"');
        for (int i10 = 0; i10 < this.f48877a.length(); i10++) {
            char cCharAt = this.f48877a.charAt(i10);
            if (cCharAt == '\\' || cCharAt == '\"') {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        sb2.append('\"');
        this.f48878b.o(sb2);
        return sb2;
    }

    @Override // K1.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get() {
        return this.f48877a;
    }

    @Override // id.InterfaceC5075g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public o b(C5079k c5079k) {
        Objects.requireNonNull(c5079k, "params must not be null");
        return c5079k.isEmpty() ? this : new o(this.f48877a, c5079k);
    }
}
