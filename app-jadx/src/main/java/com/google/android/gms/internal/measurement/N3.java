package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class N3 implements J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f39501a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f39502b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f39503c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f39504d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f39505e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f39506f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f39507g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39508h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String[] f39509i = new String[0];

    @Override // com.google.android.gms.internal.measurement.J3
    public final String a(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f39502b == null) {
                    this.f39501a.set(false);
                    this.f39502b = new HashMap(16, 1.0f);
                    this.f39507g = new Object();
                    contentResolver.registerContentObserver(I3.f39382a, true, new L3(this, null));
                } else if (this.f39501a.getAndSet(false)) {
                    this.f39502b.clear();
                    this.f39503c.clear();
                    this.f39504d.clear();
                    this.f39505e.clear();
                    this.f39506f.clear();
                    this.f39507g = new Object();
                    this.f39508h = false;
                }
                Object obj = this.f39507g;
                if (this.f39502b.containsKey(str)) {
                    String str4 = (String) this.f39502b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = I3.f39382a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new M3("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new M3("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f39507g) {
                                            this.f39502b.put(str, string);
                                        }
                                    } finally {
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e10) {
                            throw new M3("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th2) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th2;
                    }
                } catch (M3 unused) {
                    return null;
                }
            } finally {
            }
        }
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f39501a;
    }
}
