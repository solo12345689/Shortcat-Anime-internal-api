package com.amazon.a.a.n.a.a;

import android.os.DeadObjectException;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends com.amazon.a.a.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f34482a = 1;

    public d(RemoteException remoteException) {
        super(a(remoteException));
    }

    private static String a(RemoteException remoteException) {
        return remoteException instanceof DeadObjectException ? "COMMAND_SERVICE_DEAD_OBJECT_EXCEPTION" : "COMMAND_SERVICE_REMOTE_EXCEPTION";
    }
}
