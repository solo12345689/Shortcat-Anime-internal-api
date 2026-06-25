package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t.C6551a;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382q implements InterfaceC3393u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f39281h = new C6551a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f39282i = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f39283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f39284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f39285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f39286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f39287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map f39288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f39289g;

    private C3382q(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C3379p c3379p = new C3379p(this, null);
        this.f39286d = c3379p;
        this.f39287e = new Object();
        this.f39289g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f39283a = contentResolver;
        this.f39284b = uri;
        this.f39285c = runnable;
        contentResolver.registerContentObserver(uri, false, c3379p);
    }

    public static C3382q b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C3382q c3382q;
        synchronized (C3382q.class) {
            Map map = f39281h;
            c3382q = (C3382q) map.get(uri);
            if (c3382q == null) {
                try {
                    C3382q c3382q2 = new C3382q(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c3382q2);
                    } catch (SecurityException unused) {
                    }
                    c3382q = c3382q2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c3382q;
    }

    static synchronized void d() {
        try {
            for (C3382q c3382q : f39281h.values()) {
                c3382q.f39283a.unregisterContentObserver(c3382q.f39286d);
            }
            f39281h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.google.android.gms.internal.auth.InterfaceC3393u
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        ?? r02;
        Map map2 = this.f39288f;
        Map map3 = map2;
        if (map2 == null) {
            synchronized (this.f39287e) {
                Map map4 = this.f39288f;
                if (map4 != null) {
                    r02 = map4;
                } else {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) AbstractC3387s.a(new InterfaceC3390t() { // from class: com.google.android.gms.internal.auth.o
                                @Override // com.google.android.gms.internal.auth.InterfaceC3390t
                                public final Object zza() {
                                    return this.f39279a.c();
                                }
                            });
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f39288f = map;
                        threadPolicyAllowThreadDiskReads = map;
                        r02 = threadPolicyAllowThreadDiskReads;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
            }
            map3 = r02;
        }
        if (map3 == 0) {
            map3 = Collections.EMPTY_MAP;
        }
        return (String) map3.get(str);
    }

    final /* synthetic */ Map c() {
        Cursor cursorQuery = this.f39283a.query(this.f39284b, f39282i, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map c6551a = count <= 256 ? new C6551a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                c6551a.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return c6551a;
        } finally {
            cursorQuery.close();
        }
    }

    public final void e() {
        synchronized (this.f39287e) {
            this.f39288f = null;
            M.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f39289g.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
