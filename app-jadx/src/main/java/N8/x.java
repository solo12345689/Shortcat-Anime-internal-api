package N8;

import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import e9.HandlerC4663f;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    y f12753c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ D f12756f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f12751a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Messenger f12752b = new Messenger(new HandlerC4663f(Looper.getMainLooper(), new Handler.Callback() { // from class: N8.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            x xVar = this.f12748a;
            synchronized (xVar) {
                try {
                    A a10 = (A) xVar.f12755e.get(i10);
                    if (a10 == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    xVar.f12755e.remove(i10);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        a10.c(new B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    a10.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Queue f12754d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final SparseArray f12755e = new SparseArray();

    /* synthetic */ x(D d10, w wVar) {
        this.f12756f = d10;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f12751a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f12751a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f12751a = 4;
            V8.a.b().c(this.f12756f.f12700a, this);
            B b10 = new B(i10, str, th2);
            Iterator it = this.f12754d.iterator();
            while (it.hasNext()) {
                ((A) it.next()).c(b10);
            }
            this.f12754d.clear();
            for (int i12 = 0; i12 < this.f12755e.size(); i12++) {
                ((A) this.f12755e.valueAt(i12)).c(b10);
            }
            this.f12755e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    final void c() {
        this.f12756f.f12701b.execute(new Runnable() { // from class: N8.r
            @Override // java.lang.Runnable
            public final void run() {
                final A a10;
                while (true) {
                    final x xVar = this.f12745a;
                    synchronized (xVar) {
                        try {
                            if (xVar.f12751a != 2) {
                                return;
                            }
                            if (xVar.f12754d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                a10 = (A) xVar.f12754d.poll();
                                xVar.f12755e.put(a10.f12695a, a10);
                                xVar.f12756f.f12701b.schedule(new Runnable() { // from class: N8.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xVar.e(a10.f12695a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a10)));
                    }
                    D d10 = xVar.f12756f;
                    Messenger messenger = xVar.f12752b;
                    int i10 = a10.f12697c;
                    Context context = d10.f12700a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = a10.f12695a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a10.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", a10.f12698d);
                    messageObtain.setData(bundle);
                    try {
                        xVar.f12753c.a(messageObtain);
                    } catch (RemoteException e10) {
                        xVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f12751a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        A a10 = (A) this.f12755e.get(i10);
        if (a10 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f12755e.remove(i10);
            a10.c(new B(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f12751a == 2 && this.f12754d.isEmpty() && this.f12755e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f12751a = 3;
                V8.a.b().c(this.f12756f.f12700a, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized boolean g(A a10) {
        int i10 = this.f12751a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f12754d.add(a10);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f12754d.add(a10);
            c();
            return true;
        }
        this.f12754d.add(a10);
        AbstractC2115p.o(this.f12751a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f12751a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (V8.a.b().a(this.f12756f.f12700a, intent, this, 1)) {
                this.f12756f.f12701b.schedule(new Runnable() { // from class: N8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12746a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f12756f.f12701b.execute(new Runnable() { // from class: N8.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = this.f12743a;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f12753c = new y(iBinder2);
                        xVar.f12751a = 2;
                        xVar.c();
                    } catch (RemoteException e10) {
                        xVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f12756f.f12701b.execute(new Runnable() { // from class: N8.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f12747a.a(2, "Service disconnected");
            }
        });
    }
}
