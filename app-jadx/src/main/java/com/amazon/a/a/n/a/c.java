package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteException f34496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f34497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.h f34498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.amazon.d.a.f f34499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.amazon.d.a.g f34500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34501g = Binder.getCallingUid();

    public c(j jVar) {
        this.f34497c = jVar;
        try {
            this.f34495a = jVar.a();
        } catch (RemoteException e10) {
            this.f34496b = e10;
        }
    }

    public String a() throws RemoteException {
        RemoteException remoteException = this.f34496b;
        if (remoteException == null) {
            return this.f34495a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f34497c;
    }

    public com.amazon.d.a.h c() {
        return this.f34498d;
    }

    public com.amazon.d.a.f d() {
        return this.f34499e;
    }

    public com.amazon.d.a.g e() {
        return this.f34500f;
    }

    public int f() {
        return this.f34501g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f34501g + ", SuccessResult: " + this.f34497c + ", FailureResult: " + this.f34498d + ", DecisionResult: " + this.f34499e + ", ExceptionResult: " + this.f34500f + "]";
    }

    public c(com.amazon.d.a.h hVar) {
        this.f34498d = hVar;
        try {
            this.f34495a = hVar.a();
        } catch (RemoteException e10) {
            this.f34496b = e10;
        }
    }

    public c(com.amazon.d.a.f fVar) {
        this.f34499e = fVar;
        try {
            this.f34495a = fVar.a();
        } catch (RemoteException e10) {
            this.f34496b = e10;
        }
    }

    public c(com.amazon.d.a.g gVar) {
        this.f34500f = gVar;
    }
}
