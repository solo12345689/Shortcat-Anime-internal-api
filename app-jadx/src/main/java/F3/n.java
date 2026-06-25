package F3;

import F3.c;
import F3.q;
import F3.v;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f6441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F3.j f6442b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends b {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface c {
        void D(int i10);

        void a();

        boolean b();

        void c(int i10);

        j d();

        void e(String str, Bundle bundle);

        void f(CharSequence charSequence);

        void g(int i10);

        void h(List list);

        void i(b bVar, Handler handler);

        String j();

        void k(PendingIntent pendingIntent);

        void l(v vVar);

        void m(int i10);

        b n();

        void o(PendingIntent pendingIntent);

        v p();

        void q(q.b bVar);

        void r(x xVar);

        void s(boolean z10);

        void setExtras(Bundle bundle);

        Object t();

        void u(m mVar);

        void v(int i10);

        q.b w();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e extends d {
        e(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // F3.n.c
        public void g(int i10) {
            this.f6451a.setRatingType(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g extends f {
        g(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // F3.n.d
        public MediaSession x(Context context, String str, Bundle bundle) {
            return p.a(context, str, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Parcelable {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f6468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f6469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaSession.QueueItem f6470c;

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

        public h(l lVar, long j10) {
            this(null, lVar, j10);
        }

        public static h a(MediaSession.QueueItem queueItem) {
            return new h(queueItem, l.a(queueItem.getDescription()), queueItem.getQueueId());
        }

        public static List b(List list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((MediaSession.QueueItem) it.next()));
            }
            return arrayList;
        }

        public l c() {
            return this.f6468a;
        }

        public long d() {
            return this.f6469b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaSession.QueueItem e() {
            MediaSession.QueueItem queueItem = this.f6470c;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(this.f6468a.f(), this.f6469b);
            this.f6470c = queueItem2;
            return queueItem2;
        }

        public String toString() {
            return "MediaSession.QueueItem { Description=" + this.f6468a + ", Id=" + this.f6469b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f6468a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f6469b);
        }

        private h(MediaSession.QueueItem queueItem, l lVar, long j10) {
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f6468a = lVar;
            this.f6469b = j10;
            this.f6470c = queueItem;
        }

        h(Parcel parcel) {
            this.f6468a = l.CREATOR.createFromParcel(parcel);
            this.f6469b = parcel.readLong();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i implements Parcelable {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ResultReceiver f6471a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel) {
            this.f6471a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f6471a.writeToParcel(parcel, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaSession.Token f6473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private F3.c f6474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Y3.b f6475d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(Parcel parcel) {
                return new j((MediaSession.Token) AbstractC6614a.e((MediaSession.Token) parcel.readParcelable(null)));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public j[] newArray(int i10) {
                return new j[i10];
            }
        }

        j(MediaSession.Token token) {
            this(token, null);
        }

        public static j a(MediaSession.Token token) {
            return b(token, null);
        }

        static j b(MediaSession.Token token, F3.c cVar) {
            return new j(token, cVar);
        }

        F3.c c() {
            F3.c cVar;
            synchronized (this.f6472a) {
                cVar = this.f6474c;
            }
            return cVar;
        }

        public Y3.b d() {
            Y3.b bVar;
            synchronized (this.f6472a) {
                bVar = this.f6475d;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaSession.Token e() {
            return this.f6473b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                return this.f6473b.equals(((j) obj).f6473b);
            }
            return false;
        }

        void f(F3.c cVar) {
            synchronized (this.f6472a) {
                this.f6474c = cVar;
            }
        }

        public void g(Y3.b bVar) {
            synchronized (this.f6472a) {
                this.f6475d = bVar;
            }
        }

        public int hashCode() {
            return this.f6473b.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f6473b, i10);
        }

        j(MediaSession.Token token, F3.c cVar) {
            this(token, cVar, null);
        }

        j(MediaSession.Token token, F3.c cVar, Y3.b bVar) {
            this.f6472a = new Object();
            this.f6473b = token;
            this.f6474c = cVar;
            this.f6475d = bVar;
        }
    }

    public n(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = F3.i.a(context)) == null) {
            Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f6441a = new g(context, str, bundle);
        } else if (i10 >= 28) {
            this.f6441a = new f(context, str, bundle);
        } else {
            this.f6441a = new e(context, str, bundle);
        }
        Looper looperMyLooper = Looper.myLooper();
        k(new a(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        this.f6441a.o(pendingIntent);
        this.f6442b = new F3.j(context, this);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC6614a.e(n.class.getClassLoader()));
        }
    }

    static v f(v vVar, m mVar) {
        if (vVar == null) {
            return vVar;
        }
        long jE = -1;
        if (vVar.m() == -1) {
            return vVar;
        }
        if (vVar.o() != 3 && vVar.o() != 4 && vVar.o() != 5) {
            return vVar;
        }
        if (vVar.j() <= 0) {
            return vVar;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jK = ((long) (vVar.k() * (jElapsedRealtime - r0))) + vVar.m();
        if (mVar != null && mVar.a("android.media.metadata.DURATION")) {
            jE = mVar.e("android.media.metadata.DURATION");
        }
        return new v.c(vVar).h(vVar.o(), (jE < 0 || jK <= jE) ? jK < 0 ? 0L : jK : jE, vVar.k(), jElapsedRealtime).b();
    }

    public static Bundle y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public F3.j b() {
        return this.f6442b;
    }

    public final q.b c() {
        return this.f6441a.w();
    }

    public Object d() {
        return this.f6441a.t();
    }

    public j e() {
        return this.f6441a.d();
    }

    public boolean g() {
        return this.f6441a.b();
    }

    public void h() {
        this.f6441a.a();
    }

    public void i(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f6441a.e(str, bundle);
    }

    public void j(boolean z10) {
        this.f6441a.s(z10);
    }

    public void k(b bVar, Handler handler) {
        this.f6441a.i(bVar, handler);
    }

    public void l(Bundle bundle) {
        this.f6441a.setExtras(bundle);
    }

    public void m(int i10) {
        this.f6441a.c(i10);
    }

    public void n(PendingIntent pendingIntent) {
        this.f6441a.o(pendingIntent);
    }

    public void o(m mVar) {
        this.f6441a.u(mVar);
    }

    public void p(v vVar) {
        this.f6441a.l(vVar);
    }

    public void q(int i10) {
        this.f6441a.m(i10);
    }

    public void r(x xVar) {
        this.f6441a.r(xVar);
    }

    public void s(List list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (hashSet.contains(Long.valueOf(hVar.d()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + hVar.d(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(hVar.d()));
            }
        }
        this.f6441a.h(list);
    }

    public void t(CharSequence charSequence) {
        this.f6441a.f(charSequence);
    }

    public void u(int i10) {
        this.f6441a.g(i10);
    }

    public void v(int i10) {
        this.f6441a.v(i10);
    }

    public void w(PendingIntent pendingIntent) {
        this.f6441a.k(pendingIntent);
    }

    public void x(int i10) {
        this.f6441a.D(i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6446c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        a f6448e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f6444a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MediaSession.Callback f6445b = new C0084b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WeakReference f6447d = new WeakReference(null);

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f6444a) {
                        cVar = (c) b.this.f6447d.get();
                        bVar = b.this;
                        aVar = bVar.f6448e;
                    }
                    if (cVar == null || bVar != cVar.n() || aVar == null) {
                        return;
                    }
                    cVar.q((q.b) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.q(null);
                }
            }
        }

        /* JADX INFO: renamed from: F3.n$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private class C0084b extends MediaSession.Callback {
            C0084b() {
            }

            private void a(c cVar) {
                cVar.q(null);
            }

            private d b() {
                d dVar;
                synchronized (b.this.f6444a) {
                    dVar = (d) b.this.f6447d.get();
                }
                if (dVar == null || b.this != dVar.n()) {
                    return null;
                }
                return dVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String strJ = cVar.j();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "android.media.session.MediaController";
                }
                cVar.q(new q.b(strJ, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                try {
                    h hVar = null;
                    IBinder iBinderAsBinder = null;
                    hVar = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        if (resultReceiver != null) {
                            Bundle bundle2 = new Bundle();
                            j jVarD = dVarB.d();
                            F3.c cVarC = jVarD.c();
                            if (cVarC != null) {
                                iBinderAsBinder = cVarC.asBinder();
                            }
                            bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                            Y3.a.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", jVarD.d());
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        if (bundle != null) {
                            b.this.b((l) F3.d.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        if (bundle != null) {
                            b.this.c((l) F3.d.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        if (bundle != null) {
                            b.this.q((l) F3.d.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), l.CREATOR));
                        }
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        List list = dVarB.f6459i;
                        if (list != null && bundle != null) {
                            int i10 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i10 >= 0 && i10 < list.size()) {
                                hVar = (h) list.get(i10);
                            }
                            if (hVar != null) {
                                b.this.q(hVar.c());
                            }
                        }
                    } else {
                        b.this.d(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        if (bundle != null) {
                            Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            n.a(bundle2);
                            b.this.l(uri, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        if (bundle != null) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            n.a(bundle3);
                            b.this.n(string, bundle3);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        if (bundle != null) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            n.a(bundle4);
                            b.this.o(string2, bundle4);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        if (bundle != null) {
                            Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            n.a(bundle5);
                            b.this.p(uri2, bundle5);
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        if (bundle != null) {
                            b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        if (bundle != null) {
                            b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        if (bundle != null) {
                            b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        if (bundle != null) {
                            w wVar = (w) F3.d.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), w.CREATOR);
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            n.a(bundle6);
                            b.this.w(wVar, bundle6);
                        }
                    } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.e(str, bundle);
                    } else if (bundle != null) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.f();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                d dVarB = b();
                if (dVarB == null) {
                    return false;
                }
                c(dVarB);
                boolean zG = b.this.g(intent);
                a(dVarB);
                return zG || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.h();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.i();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                b.this.j(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                b.this.k(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                b.this.l(uri, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.m();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                b.this.n(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                b.this.o(str, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                n.a(bundle);
                c(dVarB);
                b.this.p(uri, bundle);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.r();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j10) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.s(j10);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f10) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.u(f10);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.v(w.a(rating));
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.z();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.A();
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j10) {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.B(j10);
                a(dVarB);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                d dVarB = b();
                if (dVarB == null) {
                    return;
                }
                c(dVarB);
                b.this.C();
                a(dVarB);
            }
        }

        void D(c cVar, Handler handler) {
            synchronized (this.f6444a) {
                try {
                    this.f6447d = new WeakReference(cVar);
                    a aVar = this.f6448e;
                    a aVar2 = null;
                    if (aVar != null) {
                        aVar.removeCallbacksAndMessages(null);
                    }
                    if (handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                    this.f6448e = aVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void a(c cVar, Handler handler) {
            if (this.f6446c) {
                this.f6446c = false;
                handler.removeMessages(1);
                v vVarP = cVar.p();
                long jB = vVarP == null ? 0L : vVarP.b();
                boolean z10 = vVarP != null && vVarP.o() == 3;
                boolean z11 = (516 & jB) != 0;
                boolean z12 = (jB & 514) != 0;
                if (z10 && z12) {
                    h();
                } else {
                    if (z10 || !z11) {
                        return;
                    }
                    i();
                }
            }
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f6444a) {
                cVar = (c) this.f6447d.get();
                aVar = this.f6448e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            q.b bVarW = cVar.w();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(cVar, aVar);
            } else if (this.f6446c) {
                aVar.removeMessages(1);
                this.f6446c = false;
                v vVarP = cVar.p();
                if (((vVarP == null ? 0L : vVarP.b()) & 32) != 0) {
                    z();
                }
            } else {
                this.f6446c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, bVarW), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void A() {
        }

        public void C() {
        }

        public void f() {
        }

        public void h() {
        }

        public void i() {
        }

        public void m() {
        }

        public void r() {
        }

        public void z() {
        }

        public void B(long j10) {
        }

        public void b(l lVar) {
        }

        public void q(l lVar) {
        }

        public void s(long j10) {
        }

        public void t(boolean z10) {
        }

        public void u(float f10) {
        }

        public void v(w wVar) {
        }

        public void x(int i10) {
        }

        public void y(int i10) {
        }

        public void c(l lVar, int i10) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void w(w wVar, Bundle bundle) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MediaSession f6451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a f6452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f6453c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f6455e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        v f6458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        List f6459i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        m f6460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f6461k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f6462l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f6463m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6464n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        b f6465o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        q.b f6466p;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object f6454d = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f6456f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final RemoteCallbackList f6457g = new RemoteCallbackList();

        d(Context context, String str, Bundle bundle) {
            MediaSession mediaSessionX = x(context, str, bundle);
            this.f6451a = mediaSessionX;
            a aVar = new a(this);
            this.f6452b = aVar;
            this.f6453c = new j(mediaSessionX.getSessionToken(), aVar);
            this.f6455e = bundle;
            c(3);
        }

        @Override // F3.n.c
        public void D(int i10) {
            if (this.f6464n != i10) {
                this.f6464n = i10;
                synchronized (this.f6454d) {
                    for (int iBeginBroadcast = this.f6457g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((F3.b) this.f6457g.getBroadcastItem(iBeginBroadcast)).e1(i10);
                        } catch (RemoteException | SecurityException e10) {
                            Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                        }
                    }
                    this.f6457g.finishBroadcast();
                }
            }
        }

        @Override // F3.n.c
        public void a() {
            this.f6456f = true;
            this.f6457g.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f6451a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f6451a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e10) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                }
            }
            this.f6451a.setCallback(null);
            this.f6452b.H3();
            this.f6451a.release();
        }

        @Override // F3.n.c
        public boolean b() {
            return this.f6451a.isActive();
        }

        @Override // F3.n.c
        public void c(int i10) {
            this.f6451a.setFlags(i10 | 3);
        }

        @Override // F3.n.c
        public j d() {
            return this.f6453c;
        }

        @Override // F3.n.c
        public void e(String str, Bundle bundle) {
            this.f6451a.sendSessionEvent(str, bundle);
        }

        @Override // F3.n.c
        public void f(CharSequence charSequence) {
            this.f6451a.setQueueTitle(charSequence);
        }

        @Override // F3.n.c
        public void h(List list) {
            this.f6459i = list;
            if (list == null) {
                this.f6451a.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).e());
            }
            this.f6451a.setQueue(arrayList);
        }

        @Override // F3.n.c
        public void i(b bVar, Handler handler) {
            synchronized (this.f6454d) {
                try {
                    this.f6465o = bVar;
                    this.f6451a.setCallback(bVar == null ? null : bVar.f6445b, handler);
                    if (bVar != null) {
                        bVar.D(this, handler);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // F3.n.c
        public String j() {
            try {
                return (String) this.f6451a.getClass().getMethod("getCallingPackage", null).invoke(this.f6451a, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        @Override // F3.n.c
        public void k(PendingIntent pendingIntent) {
            this.f6451a.setSessionActivity(pendingIntent);
        }

        @Override // F3.n.c
        public void l(v vVar) {
            this.f6458h = vVar;
            synchronized (this.f6454d) {
                for (int iBeginBroadcast = this.f6457g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((F3.b) this.f6457g.getBroadcastItem(iBeginBroadcast)).K1(vVar);
                    } catch (RemoteException | SecurityException e10) {
                        Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                    }
                }
                this.f6457g.finishBroadcast();
            }
            this.f6451a.setPlaybackState(vVar.l());
        }

        @Override // F3.n.c
        public void m(int i10) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            this.f6451a.setPlaybackToLocal(builder.build());
        }

        @Override // F3.n.c
        public b n() {
            b bVar;
            synchronized (this.f6454d) {
                bVar = this.f6465o;
            }
            return bVar;
        }

        @Override // F3.n.c
        public void o(PendingIntent pendingIntent) {
            this.f6451a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // F3.n.c
        public v p() {
            return this.f6458h;
        }

        @Override // F3.n.c
        public void q(q.b bVar) {
            synchronized (this.f6454d) {
                this.f6466p = bVar;
            }
        }

        @Override // F3.n.c
        public void r(x xVar) {
            this.f6451a.setPlaybackToRemote((VolumeProvider) xVar.a());
        }

        @Override // F3.n.c
        public void s(boolean z10) {
            this.f6451a.setActive(z10);
        }

        @Override // F3.n.c
        public void setExtras(Bundle bundle) {
            this.f6451a.setExtras(bundle);
        }

        @Override // F3.n.c
        public Object t() {
            return this.f6451a;
        }

        @Override // F3.n.c
        public void u(m mVar) {
            this.f6460j = mVar;
            this.f6451a.setMetadata(mVar == null ? null : mVar.f());
        }

        @Override // F3.n.c
        public void v(int i10) {
            if (this.f6463m != i10) {
                this.f6463m = i10;
                synchronized (this.f6454d) {
                    for (int iBeginBroadcast = this.f6457g.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((F3.b) this.f6457g.getBroadcastItem(iBeginBroadcast)).F(i10);
                        } catch (RemoteException | SecurityException e10) {
                            Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                        }
                    }
                    this.f6457g.finishBroadcast();
                }
            }
        }

        @Override // F3.n.c
        public q.b w() {
            q.b bVar;
            synchronized (this.f6454d) {
                bVar = this.f6466p;
            }
            return bVar;
        }

        public MediaSession x(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a extends c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference f6467a;

            a(d dVar) {
                this.f6467a = new WeakReference(dVar);
            }

            @Override // F3.c
            public int A() {
                d dVar = (d) this.f6467a.get();
                if (dVar != null) {
                    return dVar.f6464n;
                }
                return -1;
            }

            @Override // F3.c
            public boolean B() {
                d dVar = (d) this.f6467a.get();
                return dVar != null && dVar.f6462l;
            }

            @Override // F3.c
            public void C() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void D(int i10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public boolean D0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // F3.c
            public CharSequence E() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void E3(w wVar, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void F1(l lVar, int i10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public List G() {
                return null;
            }

            @Override // F3.c
            public void H(l lVar) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void H2(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public void H3() {
                this.f6467a.clear();
            }

            @Override // F3.c
            public void J(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void M0(F3.b bVar) {
                d dVar = (d) this.f6467a.get();
                if (dVar == null || bVar == null) {
                    return;
                }
                dVar.f6457g.unregister(bVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (dVar.f6454d) {
                }
            }

            @Override // F3.c
            public void M2(boolean z10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void N1(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // F3.c
            public boolean O() {
                return false;
            }

            @Override // F3.c
            public void P1(l lVar) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void T(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public boolean U1() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void W0(int i10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public PendingIntent X() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void Y1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // F3.c
            public m getMetadata() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void k1(String str, Bundle bundle, i iVar) {
                throw new AssertionError();
            }

            @Override // F3.c
            public u k3() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void m2() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void n0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void n1(F3.b bVar) {
                d dVar = (d) this.f6467a.get();
                if (dVar == null || bVar == null) {
                    return;
                }
                dVar.f6457g.register(bVar, new q.b("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (dVar.f6454d) {
                }
            }

            @Override // F3.c
            public void next() {
                throw new AssertionError();
            }

            @Override // F3.c
            public Bundle o0() {
                d dVar = (d) this.f6467a.get();
                if (dVar == null || dVar.f6455e == null) {
                    return null;
                }
                return new Bundle(dVar.f6455e);
            }

            @Override // F3.c
            public v p() {
                d dVar = (d) this.f6467a.get();
                if (dVar != null) {
                    return n.f(dVar.f6458h, dVar.f6460j);
                }
                return null;
            }

            @Override // F3.c
            public void pause() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void previous() {
                throw new AssertionError();
            }

            @Override // F3.c
            public String q() {
                throw new AssertionError();
            }

            @Override // F3.c
            public String r() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void r0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void s() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void s0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void s1(long j10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void stop() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void t(float f10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void u() {
                throw new AssertionError();
            }

            @Override // F3.c
            public void v(int i10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void v0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // F3.c
            public long w() {
                throw new AssertionError();
            }

            @Override // F3.c
            public int x() {
                d dVar = (d) this.f6467a.get();
                if (dVar != null) {
                    return dVar.f6463m;
                }
                return -1;
            }

            @Override // F3.c
            public int y() {
                d dVar = (d) this.f6467a.get();
                if (dVar != null) {
                    return dVar.f6461k;
                }
                return 0;
            }

            @Override // F3.c
            public void y3(w wVar) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void z(long j10) {
                throw new AssertionError();
            }

            @Override // F3.c
            public void u1(boolean z10) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class f extends e {
        f(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // F3.n.d, F3.n.c
        public final q.b w() {
            return new q.b(this.f6451a.getCurrentControllerInfo());
        }

        @Override // F3.n.d, F3.n.c
        public void q(q.b bVar) {
        }
    }
}
