package com.adjust.sdk.sig;

import android.content.Context;
import android.os.Build;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Signer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34186a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f34187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f34189d;

    public static String getVersion() {
        return "3.67.0";
    }

    public final synchronized void a() {
        if (this.f34186a) {
            return;
        }
        this.f34187b = new d();
        this.f34189d = new c(Build.VERSION.SDK_INT);
        this.f34188c = new NativeLibHelper();
        this.f34186a = true;
    }

    public synchronized void onResume() {
        a();
        d dVar = this.f34187b;
        a aVar = this.f34188c;
        dVar.getClass();
        if (!d.f34191a) {
            ((NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(Context context, Map<String, String> map, String str, String str2) {
        a();
        d dVar = this.f34187b;
        c cVar = this.f34189d;
        a aVar = this.f34188c;
        dVar.getClass();
        d.a(context, cVar, aVar, map, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0191 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:3:0x0001, B:5:0x000f, B:10:0x001b, B:12:0x0032, B:15:0x0057, B:17:0x0083, B:19:0x008f, B:21:0x0097, B:23:0x009f, B:25:0x00a7, B:28:0x00b1, B:29:0x016c, B:30:0x0174, B:32:0x0191, B:33:0x01b2), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void sign(android.content.Context r10, java.util.Map<java.lang.String, java.lang.String> r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.sig.Signer.sign(android.content.Context, java.util.Map, java.util.Map, java.util.Map):void");
    }
}
