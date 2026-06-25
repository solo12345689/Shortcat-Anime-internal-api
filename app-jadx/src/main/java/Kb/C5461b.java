package kb;

import android.app.Activity;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import sb.InterfaceC6446a;
import sb.d;
import sb.e;
import sb.f;
import tb.InterfaceC6659b;

/* JADX INFO: renamed from: kb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5461b implements InterfaceC6446a, d, e, InterfaceC6659b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactContext f52183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f52184b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f52185c = new WeakHashMap();

    /* JADX INFO: renamed from: kb.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements LifecycleEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f52186a;

        a(WeakReference weakReference) {
            this.f52186a = weakReference;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            f fVar = (f) this.f52186a.get();
            if (fVar != null) {
                fVar.onHostDestroy();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            f fVar = (f) this.f52186a.get();
            if (fVar != null) {
                fVar.onHostPause();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            f fVar = (f) this.f52186a.get();
            if (fVar != null) {
                fVar.onHostResume();
            }
        }
    }

    public C5461b(ReactContext reactContext) {
        this.f52183a = reactContext;
    }

    @Override // sb.InterfaceC6446a
    public Activity a() {
        return e().getCurrentActivity();
    }

    @Override // tb.InterfaceC6659b
    public void b(f fVar) {
        this.f52184b.put(fVar, new a(new WeakReference(fVar)));
        this.f52183a.addLifecycleEventListener((LifecycleEventListener) this.f52184b.get(fVar));
    }

    @Override // sb.d
    public List c() {
        return Arrays.asList(InterfaceC6446a.class, e.class, InterfaceC6659b.class);
    }

    @Override // sb.k
    public void d() {
        Iterator it = new ArrayList(this.f52184b.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        Iterator it2 = this.f52184b.values().iterator();
        while (it2.hasNext()) {
            this.f52183a.removeLifecycleEventListener((LifecycleEventListener) it2.next());
        }
        this.f52184b.clear();
    }

    protected ReactContext e() {
        return this.f52183a;
    }
}
