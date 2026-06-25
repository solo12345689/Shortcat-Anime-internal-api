package F3;

import F3.e;
import F3.n;
import F3.q;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import android.util.Log;
import d.C4549b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t.C6551a;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f6307i = Log.isLoggable("MBServiceCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0080g f6308a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    f f6313f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    n.j f6315h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f6309b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final f f6310c = new f("android.media.session.MediaController", -1, -1, null, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayList f6311d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final C6551a f6312e = new C6551a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final q f6314g = new q(this);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f6316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f6317g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Bundle f6318h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f6319i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f6316f = fVar;
            this.f6317g = str;
            this.f6318h = bundle;
            this.f6319i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F3.g.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(List list) {
            if (g.this.f6312e.get(((o) AbstractC6614a.e(this.f6316f.f6334f)).asBinder()) != this.f6316f) {
                if (g.f6307i) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f6316f.f6329a + " id=" + this.f6317g);
                    return;
                }
                return;
            }
            if ((a() & 1) != 0) {
                list = g.this.b(list, this.f6318h);
            }
            try {
                this.f6316f.f6334f.a(this.f6317g, list, this.f6318h, this.f6319i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f6317g + " package=" + this.f6316f.f6329a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4549b f6321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, C4549b c4549b) {
            super(obj);
            this.f6321f = c4549b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F3.g.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(e.h hVar) {
            if ((a() & 2) != 0) {
                this.f6321f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", F3.d.a(hVar, MediaBrowserCompat$MediaItem.CREATOR));
            this.f6321f.b(0, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4549b f6323f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, C4549b c4549b) {
            super(obj);
            this.f6323f = c4549b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F3.g.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(List list) {
            if ((a() & 4) != 0 || list == null) {
                this.f6323f.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) F3.d.b(list, MediaBrowserCompat$MediaItem.CREATOR).toArray(new MediaBrowserCompat$MediaItem[0]));
            this.f6323f.b(0, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ C4549b f6325f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, C4549b c4549b) {
            super(obj);
            this.f6325f = c4549b;
        }

        @Override // F3.g.l
        void c(Bundle bundle) {
            this.f6325f.b(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // F3.g.l
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(Bundle bundle) {
            this.f6325f.b(0, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f6328b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f6327a = str;
            this.f6328b = bundle;
        }

        public Bundle c() {
            return this.f6328b;
        }

        public String d() {
            return this.f6327a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q.b f6332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f6333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o f6334f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap f6335g = new HashMap();

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                g.this.f6312e.remove(((o) AbstractC6614a.e(fVar.f6334f)).asBinder());
            }
        }

        f(String str, int i10, int i11, Bundle bundle, o oVar) {
            this.f6329a = str;
            this.f6330b = i10;
            this.f6331c = i11;
            this.f6332d = new q.b(str, i10, i11);
            this.f6333e = bundle;
            this.f6334f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            g.this.f6314g.post(new a());
        }
    }

    /* JADX INFO: renamed from: F3.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC0080g {
        void a();

        q.b b();

        IBinder c(Intent intent);

        void d(n.j jVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements InterfaceC0080g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f6338a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MediaBrowserService f6339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Messenger f6340c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n.j f6342a;

            a(n.j jVar) {
                this.f6342a = jVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.g(this.f6342a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b extends l {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f6344f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, m mVar) {
                super(obj);
                this.f6344f = mVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // F3.g.l
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(List list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        e.h hVar = (e.h) it.next();
                        Parcel parcelObtain = Parcel.obtain();
                        hVar.writeToParcel(parcelObtain, 0);
                        arrayList2.add(parcelObtain);
                    }
                    arrayList = arrayList2;
                }
                this.f6344f.b(arrayList);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class c extends MediaBrowserService {
            c(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
                F3.n.a(bundle);
                e eVarE = h.this.e(str, i10, bundle == null ? null : new Bundle(bundle));
                if (eVarE == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(eVarE.f6327a, eVarE.f6328b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result) {
                h.this.f(str, new m(result));
            }
        }

        h() {
        }

        @Override // F3.g.InterfaceC0080g
        public q.b b() {
            f fVar = g.this.f6313f;
            if (fVar != null) {
                return fVar.f6332d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // F3.g.InterfaceC0080g
        public IBinder c(Intent intent) {
            return ((MediaBrowserService) AbstractC6614a.e(this.f6339b)).onBind(intent);
        }

        @Override // F3.g.InterfaceC0080g
        public void d(n.j jVar) {
            g.this.f6314g.a(new a(jVar));
        }

        public e e(String str, int i10, Bundle bundle) {
            Bundle bundle2;
            int i11 = -1;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.f6340c = new Messenger(g.this.f6314g);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                bundle2.putBinder("extra_messenger", this.f6340c.getBinder());
                n.j jVar = g.this.f6315h;
                if (jVar != null) {
                    F3.c cVarC = jVar.c();
                    bundle2.putBinder("extra_session_binder", cVarC == null ? null : cVarC.asBinder());
                } else {
                    this.f6338a.add(bundle2);
                }
                i11 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
            }
            f fVar = g.this.new f(str, i11, i10, bundle, null);
            g gVar = g.this;
            gVar.f6313f = fVar;
            e eVarG = gVar.g(str, i10, bundle);
            g gVar2 = g.this;
            gVar2.f6313f = null;
            if (eVarG == null) {
                return null;
            }
            if (this.f6340c != null) {
                gVar2.f6311d.add(fVar);
            }
            Bundle bundleC = eVarG.c();
            if (bundle2 == null) {
                bundle2 = bundleC;
            } else if (bundleC != null) {
                bundle2.putAll(bundleC);
            }
            return new e(eVarG.d(), bundle2);
        }

        public void f(String str, m mVar) {
            b bVar = new b(str, mVar);
            g gVar = g.this;
            gVar.f6313f = gVar.f6310c;
            gVar.h(str, bVar);
            g.this.f6313f = null;
        }

        void g(n.j jVar) {
            if (!this.f6338a.isEmpty()) {
                F3.c cVarC = jVar.c();
                if (cVarC != null) {
                    Iterator it = this.f6338a.iterator();
                    while (it.hasNext()) {
                        ((Bundle) it.next()).putBinder("extra_session_binder", cVarC.asBinder());
                    }
                }
                this.f6338a.clear();
            }
            ((MediaBrowserService) AbstractC6614a.e(this.f6339b)).setSessionToken(jVar.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i extends h {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends l {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f6348f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar) {
                super(obj);
                this.f6348f = mVar;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // F3.g.l
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(e.h hVar) {
                if (hVar == null) {
                    this.f6348f.b(null);
                    return;
                }
                Parcel parcelObtain = Parcel.obtain();
                hVar.writeToParcel(parcelObtain, 0);
                this.f6348f.b(parcelObtain);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b extends h.c {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result result) {
                i.this.h(str, new m(result));
            }
        }

        i() {
            super();
        }

        @Override // F3.g.InterfaceC0080g
        public void a() {
            b bVar = new b(g.this);
            this.f6339b = bVar;
            bVar.onCreate();
        }

        public void h(String str, m mVar) {
            a aVar = new a(str, mVar);
            g gVar = g.this;
            gVar.f6313f = gVar.f6310c;
            gVar.j(str, aVar);
            g.this.f6313f = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j extends i {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends l {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f6352f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f6353g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, m mVar, Bundle bundle) {
                super(obj);
                this.f6352f = mVar;
                this.f6353g = bundle;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // F3.g.l
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public void d(List list) {
                if (list == null) {
                    this.f6352f.b(null);
                    return;
                }
                if ((a() & 1) != 0) {
                    list = g.this.b(list, this.f6353g);
                }
                ArrayList arrayList = new ArrayList(list == null ? 0 : list.size());
                if (list != null) {
                    for (e.h hVar : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        hVar.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                }
                this.f6352f.b(arrayList);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b extends i.b {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
                F3.n.a(bundle);
                j jVar = j.this;
                g gVar = g.this;
                gVar.f6313f = gVar.f6310c;
                jVar.i(str, new m(result), bundle);
                g.this.f6313f = null;
            }
        }

        j() {
            super();
        }

        @Override // F3.g.i, F3.g.InterfaceC0080g
        public void a() {
            b bVar = new b(g.this);
            this.f6339b = bVar;
            bVar.onCreate();
        }

        public void i(String str, m mVar, Bundle bundle) {
            a aVar = new a(str, mVar, bundle);
            g gVar = g.this;
            gVar.f6313f = gVar.f6310c;
            gVar.i(str, aVar, bundle);
            g.this.f6313f = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k extends j {
        k() {
            super();
        }

        @Override // F3.g.h, F3.g.InterfaceC0080g
        public q.b b() {
            g gVar = g.this;
            f fVar = gVar.f6313f;
            if (fVar != null) {
                return fVar == gVar.f6310c ? new q.b(((MediaBrowserService) AbstractC6614a.e(this.f6339b)).getCurrentBrowserInfo()) : fVar.f6332d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6361e;

        l(Object obj) {
            this.f6357a = obj;
        }

        int a() {
            return this.f6361e;
        }

        boolean b() {
            return this.f6358b || this.f6359c || this.f6360d;
        }

        void c(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f6357a);
        }

        abstract void d(Object obj);

        public void e(Bundle bundle) {
            if (!this.f6359c && !this.f6360d) {
                this.f6360d = true;
                c(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f6357a);
            }
        }

        public void f(Object obj) {
            if (!this.f6359c && !this.f6360d) {
                this.f6359c = true;
                d(obj);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f6357a);
            }
        }

        void g(int i10) {
            this.f6361e = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f6362a;

        m(MediaBrowserService.Result result) {
            this.f6362a = result;
        }

        List a(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Parcel parcel = (Parcel) it.next();
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        public void b(Object obj) {
            if (obj instanceof List) {
                this.f6362a.sendResult(a((List) obj));
                return;
            }
            if (!(obj instanceof Parcel)) {
                this.f6362a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            this.f6362a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class n {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6365b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IBinder f6366c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f6367d;

            a(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f6364a = oVar;
                this.f6365b = str;
                this.f6366c = iBinder;
                this.f6367d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) g.this.f6312e.get(this.f6364a.asBinder());
                if (fVar != null) {
                    g.this.a(this.f6365b, fVar, this.f6366c, this.f6367d);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f6365b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6369a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IBinder f6371c;

            b(o oVar, String str, IBinder iBinder) {
                this.f6369a = oVar;
                this.f6370b = str;
                this.f6371c = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) g.this.f6312e.get(this.f6369a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f6370b);
                    return;
                }
                if (g.this.r(this.f6370b, fVar, this.f6371c)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.f6370b + " which is not subscribed");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6374b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C4549b f6375c;

            c(o oVar, String str, C4549b c4549b) {
                this.f6373a = oVar;
                this.f6374b = str;
                this.f6375c = c4549b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) g.this.f6312e.get(this.f6373a.asBinder());
                if (fVar != null) {
                    g.this.p(this.f6374b, fVar, this.f6375c);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f6374b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6377a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f6378b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f6379c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f6380d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Bundle f6381e;

            d(o oVar, int i10, String str, int i11, Bundle bundle) {
                this.f6377a = oVar;
                this.f6378b = i10;
                this.f6379c = str;
                this.f6380d = i11;
                this.f6381e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder iBinderAsBinder = this.f6377a.asBinder();
                g.this.f6312e.remove(iBinderAsBinder);
                Iterator it = g.this.f6311d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar2 = (f) it.next();
                    if (fVar2.f6331c == this.f6378b) {
                        fVar = (TextUtils.isEmpty(this.f6379c) || this.f6380d <= 0) ? g.this.new f(fVar2.f6329a, fVar2.f6330b, fVar2.f6331c, this.f6381e, this.f6377a) : null;
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = g.this.new f(this.f6379c, this.f6380d, this.f6378b, this.f6381e, this.f6377a);
                }
                g.this.f6312e.put(iBinderAsBinder, fVar);
                try {
                    iBinderAsBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6383a;

            e(o oVar) {
                this.f6383a = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinderAsBinder = this.f6383a.asBinder();
                f fVar = (f) g.this.f6312e.remove(iBinderAsBinder);
                if (fVar != null) {
                    iBinderAsBinder.unlinkToDeath(fVar, 0);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6385a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6386b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f6387c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4549b f6388d;

            f(o oVar, String str, Bundle bundle, C4549b c4549b) {
                this.f6385a = oVar;
                this.f6386b = str;
                this.f6387c = bundle;
                this.f6388d = c4549b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) g.this.f6312e.get(this.f6385a.asBinder());
                if (fVar != null) {
                    g.this.q(this.f6386b, this.f6387c, fVar, this.f6388d);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f6386b);
            }
        }

        /* JADX INFO: renamed from: F3.g$n$g, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class RunnableC0081g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f6390a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f6391b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f6392c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ C4549b f6393d;

            RunnableC0081g(o oVar, String str, Bundle bundle, C4549b c4549b) {
                this.f6390a = oVar;
                this.f6391b = str;
                this.f6392c = bundle;
                this.f6393d = c4549b;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = (f) g.this.f6312e.get(this.f6390a.asBinder());
                if (fVar != null) {
                    g.this.n(this.f6391b, this.f6392c, fVar, this.f6393d);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f6391b + ", extras=" + this.f6392c);
            }
        }

        n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            g.this.f6314g.a(new a(oVar, str, iBinder, bundle));
        }

        public void b(String str, C4549b c4549b, o oVar) {
            if (TextUtils.isEmpty(str) || c4549b == null) {
                return;
            }
            g.this.f6314g.a(new c(oVar, str, c4549b));
        }

        public void c(o oVar, String str, int i10, int i11, Bundle bundle) {
            g.this.f6314g.a(new d(oVar, i11, str, i10, bundle));
        }

        public void d(String str, IBinder iBinder, o oVar) {
            g.this.f6314g.a(new b(oVar, str, iBinder));
        }

        public void e(String str, Bundle bundle, C4549b c4549b, o oVar) {
            if (TextUtils.isEmpty(str) || c4549b == null) {
                return;
            }
            g.this.f6314g.a(new f(oVar, str, bundle, c4549b));
        }

        public void f(String str, Bundle bundle, C4549b c4549b, o oVar) {
            if (TextUtils.isEmpty(str) || c4549b == null) {
                return;
            }
            g.this.f6314g.a(new RunnableC0081g(oVar, str, bundle, c4549b));
        }

        public void g(o oVar) {
            g.this.f6314g.a(new e(oVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private interface o {
        void a(String str, List list, Bundle bundle, Bundle bundle2);

        IBinder asBinder();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Messenger f6395a;

        p(Messenger messenger) {
            this.f6395a = messenger;
        }

        private void b(int i10, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.arg1 = 2;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            this.f6395a.send(messageObtain);
        }

        @Override // F3.g.o
        public void a(String str, List list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", F3.d.b(list, MediaBrowserCompat$MediaItem.CREATOR));
            }
            b(3, bundle3);
        }

        @Override // F3.g.o
        public IBinder asBinder() {
            return this.f6395a.getBinder();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class q extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f6396a;

        q(g gVar) {
            this.f6396a = gVar;
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void b() {
            this.f6396a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g gVar = this.f6396a;
            if (gVar != null) {
                gVar.e(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader((ClassLoader) AbstractC6614a.e(F3.e.class.getClassLoader()));
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j10);
        }
    }

    void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<K1.c> arrayList = (List) fVar.f6335g.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (K1.c cVar : arrayList) {
            if (iBinder == cVar.f10842a && F3.f.a(bundle, (Bundle) cVar.f10843b)) {
                return;
            }
        }
        arrayList.add(new K1.c(iBinder, bundle));
        fVar.f6335g.put(str, arrayList);
        o(str, fVar, bundle, null);
        this.f6313f = fVar;
        l(str, bundle);
        this.f6313f = null;
    }

    List b(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        if (bundle != null) {
            int i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
            int i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
            if (i10 != -1 || i11 != -1) {
                int i12 = i11 * i10;
                int size = i12 + i11;
                if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i12, size);
            }
        }
        return list;
    }

    public void c(Context context) {
        attachBaseContext(context);
    }

    public final q.b d() {
        return ((InterfaceC0080g) AbstractC6614a.e(this.f6308a)).b();
    }

    void e(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 3:
                Bundle bundle = data.getBundle("data_options");
                F3.n.a(bundle);
                this.f6309b.a(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle, new p(message.replyTo));
                break;
            case 4:
                this.f6309b.d(data.getString("data_media_item_id"), data.getBinder("data_callback_token"), new p(message.replyTo));
                break;
            case 5:
                this.f6309b.b(data.getString("data_media_item_id"), (C4549b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 6:
                Bundle bundle2 = data.getBundle("data_root_hints");
                F3.n.a(bundle2);
                this.f6309b.c(new p(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle2);
                break;
            case 7:
                this.f6309b.g(new p(message.replyTo));
                break;
            case 8:
                Bundle bundle3 = data.getBundle("data_search_extras");
                F3.n.a(bundle3);
                this.f6309b.e(data.getString("data_search_query"), bundle3, (C4549b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            case 9:
                Bundle bundle4 = data.getBundle("data_custom_action_extras");
                F3.n.a(bundle4);
                this.f6309b.f(data.getString("data_custom_action"), bundle4, (C4549b) data.getParcelable("data_result_receiver"), new p(message.replyTo));
                break;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                break;
        }
    }

    public void f(String str, Bundle bundle, l lVar) {
        lVar.e(null);
    }

    public abstract e g(String str, int i10, Bundle bundle);

    public abstract void h(String str, l lVar);

    public void i(String str, l lVar, Bundle bundle) {
        lVar.g(1);
        h(str, lVar);
    }

    public void j(String str, l lVar) {
        lVar.g(2);
        lVar.f(null);
    }

    public void k(String str, Bundle bundle, l lVar) {
        lVar.g(4);
        lVar.f(null);
    }

    void n(String str, Bundle bundle, f fVar, C4549b c4549b) {
        d dVar = new d(str, c4549b);
        this.f6313f = fVar;
        f(str, bundle == null ? Bundle.EMPTY : bundle, dVar);
        this.f6313f = null;
        if (dVar.b()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void o(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f6313f = fVar;
        if (bundle == null) {
            h(str, aVar);
        } else {
            i(str, aVar, bundle);
        }
        this.f6313f = null;
        if (aVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f6329a + " id=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return ((InterfaceC0080g) AbstractC6614a.e(this.f6308a)).c(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f6308a = new k();
        } else if (i10 >= 26) {
            this.f6308a = new j();
        } else {
            this.f6308a = new i();
        }
        this.f6308a.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f6314g.b();
    }

    void p(String str, f fVar, C4549b c4549b) {
        b bVar = new b(str, c4549b);
        this.f6313f = fVar;
        j(str, bVar);
        this.f6313f = null;
        if (bVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void q(String str, Bundle bundle, f fVar, C4549b c4549b) {
        c cVar = new c(str, c4549b);
        this.f6313f = fVar;
        k(str, bundle, cVar);
        this.f6313f = null;
        if (cVar.b()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean r(String str, f fVar, IBinder iBinder) {
        boolean z10 = false;
        try {
            if (iBinder != null) {
                List list = (List) fVar.f6335g.get(str);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == ((K1.c) it.next()).f10842a) {
                            it.remove();
                            z10 = true;
                        }
                    }
                    if (list.isEmpty()) {
                        fVar.f6335g.remove(str);
                    }
                }
            } else if (fVar.f6335g.remove(str) != null) {
                z10 = true;
            }
            return z10;
        } finally {
            this.f6313f = fVar;
            m(str);
            this.f6313f = null;
        }
    }

    public void s(n.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f6315h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f6315h = jVar;
        ((InterfaceC0080g) AbstractC6614a.e(this.f6308a)).d(jVar);
    }

    public void m(String str) {
    }

    public void l(String str, Bundle bundle) {
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
