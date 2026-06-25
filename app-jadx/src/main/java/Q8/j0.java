package Q8;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14498a = Collections.synchronizedMap(new C6551a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14499b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f14500c;

    j0() {
    }

    final AbstractC2060h a(String str, Class cls) {
        return (AbstractC2060h) cls.cast(this.f14498a.get(str));
    }

    final void b(String str, AbstractC2060h abstractC2060h) {
        Map map = this.f14498a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, abstractC2060h);
        if (this.f14499b > 0) {
            new f9.p(Looper.getMainLooper()).post(new i0(this, abstractC2060h, str));
        }
    }

    final void c(Bundle bundle) {
        this.f14499b = 1;
        this.f14500c = bundle;
        for (Map.Entry entry : this.f14498a.entrySet()) {
            ((AbstractC2060h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void d() {
        this.f14499b = 2;
        Iterator it = this.f14498a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2060h) it.next()).j();
        }
    }

    final void e() {
        this.f14499b = 3;
        Iterator it = this.f14498a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2060h) it.next()).h();
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f14498a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2060h) it.next()).e(i10, i11, intent);
        }
    }

    final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f14498a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC2060h) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void h() {
        this.f14499b = 4;
        Iterator it = this.f14498a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2060h) it.next()).k();
        }
    }

    final void i() {
        this.f14499b = 5;
        Iterator it = this.f14498a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2060h) it.next()).g();
        }
    }

    final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f14498a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2060h) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int k() {
        return this.f14499b;
    }

    final /* synthetic */ Bundle l() {
        return this.f14500c;
    }
}
