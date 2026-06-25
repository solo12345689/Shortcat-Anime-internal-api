package l6;

import Td.L;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.InterfaceC5557b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends C5556a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f52563d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f52564c = new ArrayList(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void a(String id2, Object obj) {
        AbstractC5504s.h(id2, "id");
        int size = this.f52564c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5557b) this.f52564c.get(i10)).a(id2, obj);
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void b(String id2, InterfaceC5557b.a aVar) {
        AbstractC5504s.h(id2, "id");
        int size = this.f52564c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5557b) this.f52564c.get(i10)).b(id2, aVar);
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void g(String id2, Object obj, InterfaceC5557b.a aVar) {
        AbstractC5504s.h(id2, "id");
        int size = this.f52564c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5557b) this.f52564c.get(i10)).g(id2, obj, aVar);
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void h(String id2, Throwable th2, InterfaceC5557b.a aVar) {
        AbstractC5504s.h(id2, "id");
        int size = this.f52564c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5557b) this.f52564c.get(i10)).h(id2, th2, aVar);
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void j(String id2, Object obj, InterfaceC5557b.a aVar) {
        AbstractC5504s.h(id2, "id");
        int size = this.f52564c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5557b) this.f52564c.get(i10)).j(id2, obj, aVar);
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // l6.C5556a, l6.InterfaceC5557b
    public void k(String id2) {
        AbstractC5504s.h(id2, "id");
        int size = this.f52564c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5557b) this.f52564c.get(i10)).k(id2);
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void m(InterfaceC5557b listener) {
        AbstractC5504s.h(listener, "listener");
        this.f52564c.add(listener);
    }

    public final synchronized void o(InterfaceC5557b listener) {
        AbstractC5504s.h(listener, "listener");
        this.f52564c.remove(listener);
    }
}
