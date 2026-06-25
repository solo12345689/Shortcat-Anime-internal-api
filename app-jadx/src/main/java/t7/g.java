package T7;

import android.content.Context;
import com.facebook.soloader.E;
import com.facebook.soloader.p;
import com.facebook.soloader.w;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f17330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17331c;

    public g(Context context, a aVar) {
        this.f17329a = context;
        this.f17330b = aVar;
        this.f17331c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f17330b.a(strC);
    }

    private String c() {
        return this.f17329a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            Object[] objArr = eArr[i10];
            if (objArr instanceof w) {
                eArr[i10] = ((w) objArr).b(this.f17329a);
            }
        }
    }

    @Override // T7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (b()) {
            d(eArr);
            return true;
        }
        if (this.f17331c == this.f17330b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
