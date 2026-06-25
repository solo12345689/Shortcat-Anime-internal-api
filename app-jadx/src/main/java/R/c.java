package r;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f58206b;

    c(int i10, CharSequence charSequence) {
        this.f58205a = i10;
        this.f58206b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f58206b);
        String strA2 = a(charSequence);
        if (strA == null && strA2 == null) {
            return true;
        }
        return strA != null && strA.equals(strA2);
    }

    int b() {
        return this.f58205a;
    }

    CharSequence c() {
        return this.f58206b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f58205a == cVar.f58205a && d(cVar.f58206b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f58205a), a(this.f58206b)});
    }
}
