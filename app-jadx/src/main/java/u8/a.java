package U8;

import R8.C2108i;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2108i f19397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19398d;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(f.f34694a);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f19396b = string;
        this.f19395a = str;
        this.f19397c = new C2108i(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f19395a, i10)) {
            i10++;
        }
        this.f19398d = i10;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f19395a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f19395a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f19396b.concat(str);
    }

    public boolean d(int i10) {
        return this.f19398d <= i10;
    }

    public void e(String str, Object... objArr) {
        Log.w(this.f19395a, c(str, objArr));
    }
}
