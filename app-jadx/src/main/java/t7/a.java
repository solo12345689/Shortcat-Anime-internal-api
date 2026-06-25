package T7;

import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f17319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17320b;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f17319a = new String[i10];
        this.f17320b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f17319a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append("\n");
        b(sb2);
        p.g("SoLoader", sb2.toString());
        String[] strArr = this.f17319a;
        int i10 = this.f17320b;
        strArr[i10 % strArr.length] = str;
        this.f17320b = i10 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f17320b);
            sb2.append(" base apk paths.");
            if (this.f17320b > 0) {
                sb2.append(" Most recent ones:");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = this.f17319a;
                if (i10 < strArr.length) {
                    int i11 = (this.f17320b - i10) - 1;
                    if (i11 >= 0) {
                        String str = strArr[i11 % strArr.length];
                        sb2.append("\n");
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int c() {
        return this.f17320b;
    }
}
