package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class T3 implements W3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f39575i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f39576j = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f39577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f39578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f39579c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Map f39583g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentObserver f39580d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f39581e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f39582f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f39584h = new ArrayList();

    private T3(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        O9.n.j(contentResolver);
        O9.n.j(uri);
        this.f39577a = contentResolver;
        this.f39578b = uri;
        this.f39579c = runnable;
    }

    public static T3 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        T3 t32 = (T3) f39575i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.S3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return T3.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!t32.f39581e) {
                return t32;
            }
            synchronized (t32) {
                try {
                    if (t32.f39581e) {
                        Q3 q32 = new Q3(t32, null);
                        t32.f39577a.registerContentObserver(t32.f39578b, false, q32);
                        t32.f39580d = q32;
                        t32.f39581e = false;
                    }
                } finally {
                }
            }
            return t32;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void f() {
        Iterator it = f39575i.values().iterator();
        while (it.hasNext()) {
            T3 t32 = (T3) it.next();
            synchronized (t32) {
                try {
                    if (t32.f39581e) {
                        t32.f39581e = false;
                    } else {
                        ContentObserver contentObserver = t32.f39580d;
                        if (contentObserver != null) {
                            t32.f39577a.unregisterContentObserver(contentObserver);
                            t32.f39580d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ T3 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new T3(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.W3
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f39583g;
        if (map2 == null) {
            synchronized (this.f39582f) {
                map2 = this.f39583g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) W3.a(new V3() { // from class: com.google.android.gms.internal.measurement.R3
                                @Override // com.google.android.gms.internal.measurement.V3
                                public final /* synthetic */ Object zza() {
                                    return this.f39559a.h();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException e10) {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e10);
                            map = Collections.EMPTY_MAP;
                        }
                        this.f39583g = map;
                        map2 = map;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f39582f) {
            this.f39583g = null;
            this.f39579c.run();
        }
        synchronized (this) {
            try {
                Iterator it = this.f39584h.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f39577a;
        Uri uri = this.f39578b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f39576j, null, null, null);
            try {
                if (cursorQuery == null) {
                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = cursorQuery.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                Map c6551a = count <= 256 ? new C6551a(count) : new HashMap(count, 1.0f);
                while (cursorQuery.moveToNext()) {
                    c6551a.put(cursorQuery.getString(0), cursorQuery.getString(1));
                }
                if (cursorQuery.isAfterLast()) {
                    cursorQuery.close();
                    return c6551a;
                }
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e10) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e10);
            return Collections.EMPTY_MAP;
        } finally {
            contentProviderClientAcquireUnstableContentProviderClient.release();
        }
    }
}
