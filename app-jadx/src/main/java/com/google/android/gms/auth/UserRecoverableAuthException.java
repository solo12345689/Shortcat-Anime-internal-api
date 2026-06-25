package com.google.android.gms.auth;

import R8.AbstractC2115p;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class UserRecoverableAuthException extends G8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f38850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PendingIntent f38851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f38852c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, b.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        AbstractC2115p.l(intent);
        AbstractC2115p.l(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        Intent intent = this.f38850a;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.f38852c.ordinal();
        if (iOrdinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (iOrdinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (iOrdinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.f38851b = pendingIntent;
        this.f38850a = intent;
        this.f38852c = (b) AbstractC2115p.l(bVar);
    }
}
