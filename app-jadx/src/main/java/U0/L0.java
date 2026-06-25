package U0;

import U0.C2197e;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class L0 implements C2197e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18753a;

    private /* synthetic */ L0(String str) {
        this.f18753a = str;
    }

    public static final /* synthetic */ L0 a(String str) {
        return new L0(str);
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof L0) && AbstractC5504s.c(str, ((L0) obj).f());
    }

    public static int d(String str) {
        return str.hashCode();
    }

    public static String e(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f18753a, obj);
    }

    public final /* synthetic */ String f() {
        return this.f18753a;
    }

    public int hashCode() {
        return d(this.f18753a);
    }

    public String toString() {
        return e(this.f18753a);
    }

    public static String b(String str) {
        return str;
    }
}
