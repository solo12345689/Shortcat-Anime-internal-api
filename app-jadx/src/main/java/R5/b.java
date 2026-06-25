package R5;

import R5.a;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class b extends R5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f15161b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f15165f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f15163d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f15164e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f15162c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f15161b) {
                ArrayList arrayList = b.this.f15164e;
                b bVar = b.this;
                bVar.f15164e = bVar.f15163d;
                b.this.f15163d = arrayList;
            }
            int size = b.this.f15164e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a.InterfaceC0262a) b.this.f15164e.get(i10)).a();
            }
            b.this.f15164e.clear();
        }
    }

    @Override // R5.a
    public void a(a.InterfaceC0262a interfaceC0262a) {
        synchronized (this.f15161b) {
            this.f15163d.remove(interfaceC0262a);
        }
    }

    @Override // R5.a
    public void d(a.InterfaceC0262a interfaceC0262a) {
        if (!R5.a.c()) {
            interfaceC0262a.a();
            return;
        }
        synchronized (this.f15161b) {
            try {
                if (this.f15163d.contains(interfaceC0262a)) {
                    return;
                }
                this.f15163d.add(interfaceC0262a);
                boolean z10 = true;
                if (this.f15163d.size() != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f15162c.post(this.f15165f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
