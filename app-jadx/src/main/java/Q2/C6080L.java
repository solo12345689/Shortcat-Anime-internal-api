package q2;

import java.io.IOException;

/* JADX INFO: renamed from: q2.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6080L extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56586b;

    protected C6080L(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f56585a = z10;
        this.f56586b = i10;
    }

    public static C6080L a(String str, Throwable th2) {
        return new C6080L(str, th2, true, 1);
    }

    public static C6080L b(String str, Throwable th2) {
        return new C6080L(str, th2, true, 0);
    }

    public static C6080L c(String str, Throwable th2) {
        return new C6080L(str, th2, true, 4);
    }

    public static C6080L d(String str) {
        return new C6080L(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f56585a);
        sb2.append(", dataType=");
        sb2.append(this.f56586b);
        sb2.append("}");
        return sb2.toString();
    }
}
