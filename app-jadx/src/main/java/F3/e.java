package F3;

import F3.c;
import F3.n;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import t.C6551a;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f6287b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f6288a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f6289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference f6290b;

        a(g gVar) {
            this.f6289a = new WeakReference(gVar);
        }

        void a(Messenger messenger) {
            this.f6290b = new WeakReference(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference = this.f6290b;
            if (weakReference == null) {
                return;
            }
            Messenger messenger = (Messenger) weakReference.get();
            g gVar = (g) this.f6289a.get();
            if (messenger == null || gVar == null) {
                return;
            }
            Bundle data = message.getData();
            n.a(data);
            try {
                if (message.what == 3) {
                    Bundle bundle = data.getBundle("data_options");
                    n.a(bundle);
                    Bundle bundle2 = data.getBundle("data_notify_children_changed_options");
                    n.a(bundle2);
                    gVar.a(messenger, data.getString("data_media_item_id"), F3.d.b(data.getParcelableArrayList("data_media_item_list"), h.CREATOR), bundle, bundle2);
                    return;
                }
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaBrowser.ConnectionCallback f6291a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC0078b f6292b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                InterfaceC0078b interfaceC0078b = b.this.f6292b;
                if (interfaceC0078b != null) {
                    interfaceC0078b.onConnected();
                }
                b.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                InterfaceC0078b interfaceC0078b = b.this.f6292b;
                if (interfaceC0078b != null) {
                    interfaceC0078b.b();
                }
                b.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                InterfaceC0078b interfaceC0078b = b.this.f6292b;
                if (interfaceC0078b != null) {
                    interfaceC0078b.c();
                }
                b.this.c();
            }
        }

        /* JADX INFO: renamed from: F3.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        interface InterfaceC0078b {
            void b();

            void c();

            void onConnected();
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        void d(InterfaceC0078b interfaceC0078b) {
            this.f6292b = interfaceC0078b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        void S();

        n.j d();

        void disconnect();
    }

    /* JADX INFO: renamed from: F3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class C0079e extends d {
        C0079e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f extends C0079e {
        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface g {
        void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class h implements Parcelable {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l f6304b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcel parcel) {
            this.f6303a = parcel.readInt();
            this.f6304b = l.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f6303a + ", mDescription=" + this.f6304b + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6303a);
            this.f6304b.writeToParcel(parcel, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Messenger f6305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f6306b;

        public i(IBinder iBinder, Bundle bundle) {
            this.f6305a = new Messenger(iBinder);
            this.f6306b = bundle;
        }

        private void b(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.arg1 = 1;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            messageObtain.replyTo = messenger;
            this.f6305a.send(messageObtain);
        }

        void a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f6306b);
            b(6, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            b(7, null, messenger);
        }
    }

    public e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6288a = new f(context, componentName, bVar, bundle);
        } else {
            this.f6288a = new C0079e(context, componentName, bVar, bundle);
        }
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f6288a.S();
    }

    public void b() {
        this.f6288a.disconnect();
    }

    public n.j c() {
        return this.f6288a.d();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements c, g, b.InterfaceC0078b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f6294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final MediaBrowser f6295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Bundle f6296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final a f6297d = new a(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C6551a f6298e = new C6551a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f6299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected i f6300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected Messenger f6301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n.j f6302i;

        d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f6294a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f6296c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            bVar.d(this);
            this.f6295b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) AbstractC6614a.e(bVar.f6291a), bundle2);
        }

        @Override // F3.e.c
        public void S() {
            this.f6295b.connect();
        }

        @Override // F3.e.g
        public void a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f6301h != messenger) {
                return;
            }
            if (str != null) {
                android.support.v4.media.session.b.a(this.f6298e.get(str));
            }
            if (e.f6287b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // F3.e.b.InterfaceC0078b
        public void c() {
            this.f6300g = null;
            this.f6301h = null;
            this.f6302i = null;
            this.f6297d.a(null);
        }

        @Override // F3.e.c
        public n.j d() {
            if (this.f6302i == null) {
                this.f6302i = n.j.a(this.f6295b.getSessionToken());
            }
            return this.f6302i;
        }

        @Override // F3.e.c
        public void disconnect() {
            Messenger messenger;
            i iVar = this.f6300g;
            if (iVar != null && (messenger = this.f6301h) != null) {
                try {
                    iVar.c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f6295b.disconnect();
        }

        @Override // F3.e.b.InterfaceC0078b
        public void onConnected() {
            try {
                Bundle extras = this.f6295b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f6299f = extras.getInt("extra_service_version", 0);
                IBinder binder = extras.getBinder("extra_messenger");
                if (binder != null) {
                    i iVar = new i(binder, this.f6296c);
                    this.f6300g = iVar;
                    Messenger messenger = new Messenger(this.f6297d);
                    this.f6301h = messenger;
                    this.f6297d.a(messenger);
                    try {
                        iVar.a(this.f6294a, messenger);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                F3.c cVarC = c.a.c(extras.getBinder("extra_session_binder"));
                if (cVarC != null) {
                    this.f6302i = n.j.b(this.f6295b.getSessionToken(), cVarC);
                }
            } catch (IllegalStateException e10) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
            }
        }

        @Override // F3.e.b.InterfaceC0078b
        public void b() {
        }
    }
}
