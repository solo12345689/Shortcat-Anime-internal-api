package io.invertase.firebase.common;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f48952a = new a(b());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f48953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48954c;

    public b(Context context, String str) {
        this.f48953b = context;
        this.f48954c = str;
    }

    public Context a() {
        return this.f48953b;
    }

    public String b() {
        return "Universal" + this.f48954c + "Module";
    }
}
