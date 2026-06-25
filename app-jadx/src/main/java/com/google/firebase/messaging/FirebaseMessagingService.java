package com.google.firebase.messaging;

import N8.C1972a;
import N8.C1974c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC3971i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Queue f43329g = new ArrayDeque(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1974c f43330f;

    private boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = f43329g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (N.t(extras)) {
            N n10 = new N(extras);
            ExecutorService executorServiceE = AbstractC3977o.e();
            try {
                if (new C3968f(this, n10, executorServiceE).a()) {
                    return;
                }
                executorServiceE.shutdown();
                if (L.E(intent)) {
                    L.w(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        p(new W(extras));
    }

    private String l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C1974c m(Context context) {
        if (this.f43330f == null) {
            this.f43330f = new C1974c(context.getApplicationContext());
        }
        return this.f43330f;
    }

    private void n(Intent intent) {
        if (!j(intent.getStringExtra("google.message_id"))) {
            t(intent);
        }
        m(this).b(new C1972a(intent));
    }

    private void t(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                o();
                break;
            case "gcm":
                L.y(intent);
                k(intent);
                break;
            case "send_error":
                s(l(intent), new a0(intent.getStringExtra(LogEvent.LEVEL_ERROR)));
                break;
            case "send_event":
                q(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3971i
    protected Intent e(Intent intent) {
        return b0.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC3971i
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            n(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            r(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void o() {
    }

    public void p(W w10) {
    }

    public void q(String str) {
    }

    public void r(String str) {
    }

    public void s(String str, Exception exc) {
    }
}
