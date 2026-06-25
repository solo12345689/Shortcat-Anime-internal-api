package com.bumptech.glide.request;

import com.bumptech.glide.request.b;
import k5.InterfaceC5451c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, InterfaceC5451c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f35721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f35722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile InterfaceC5451c f35723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile InterfaceC5451c f35724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f35725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b.a f35726f;

    public a(Object obj, b bVar) {
        b.a aVar = b.a.CLEARED;
        this.f35725e = aVar;
        this.f35726f = aVar;
        this.f35721a = obj;
        this.f35722b = bVar;
    }

    private boolean a(InterfaceC5451c interfaceC5451c) {
        b.a aVar = this.f35725e;
        b.a aVar2 = b.a.FAILED;
        if (aVar != aVar2) {
            return interfaceC5451c.equals(this.f35723c);
        }
        if (!interfaceC5451c.equals(this.f35724d)) {
            return false;
        }
        b.a aVar3 = this.f35726f;
        return aVar3 == b.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean b() {
        b bVar = this.f35722b;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean c() {
        b bVar = this.f35722b;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean d() {
        b bVar = this.f35722b;
        return bVar == null || bVar.canSetImage(this);
    }

    @Override // k5.InterfaceC5451c
    public void begin() {
        synchronized (this.f35721a) {
            try {
                b.a aVar = this.f35725e;
                b.a aVar2 = b.a.RUNNING;
                if (aVar != aVar2) {
                    this.f35725e = aVar2;
                    this.f35723c.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyCleared(InterfaceC5451c interfaceC5451c) {
        boolean z10;
        synchronized (this.f35721a) {
            try {
                z10 = b() && interfaceC5451c.equals(this.f35723c);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyStatusChanged(InterfaceC5451c interfaceC5451c) {
        boolean z10;
        synchronized (this.f35721a) {
            try {
                z10 = c() && a(interfaceC5451c);
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canSetImage(InterfaceC5451c interfaceC5451c) {
        boolean zD;
        synchronized (this.f35721a) {
            zD = d();
        }
        return zD;
    }

    @Override // k5.InterfaceC5451c
    public void clear() {
        synchronized (this.f35721a) {
            try {
                b.a aVar = b.a.CLEARED;
                this.f35725e = aVar;
                this.f35723c.clear();
                if (this.f35726f != aVar) {
                    this.f35726f = aVar;
                    this.f35724d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(InterfaceC5451c interfaceC5451c, InterfaceC5451c interfaceC5451c2) {
        this.f35723c = interfaceC5451c;
        this.f35724d = interfaceC5451c2;
    }

    @Override // com.bumptech.glide.request.b
    public b getRoot() {
        b root;
        synchronized (this.f35721a) {
            try {
                b bVar = this.f35722b;
                root = bVar != null ? bVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.b, k5.InterfaceC5451c
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f35721a) {
            try {
                z10 = this.f35723c.isAnyResourceSet() || this.f35724d.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f35721a) {
            try {
                b.a aVar = this.f35725e;
                b.a aVar2 = b.a.CLEARED;
                z10 = aVar == aVar2 && this.f35726f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f35721a) {
            try {
                b.a aVar = this.f35725e;
                b.a aVar2 = b.a.SUCCESS;
                z10 = aVar == aVar2 || this.f35726f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isEquivalentTo(InterfaceC5451c interfaceC5451c) {
        if (interfaceC5451c instanceof a) {
            a aVar = (a) interfaceC5451c;
            if (this.f35723c.isEquivalentTo(aVar.f35723c) && this.f35724d.isEquivalentTo(aVar.f35724d)) {
                return true;
            }
        }
        return false;
    }

    @Override // k5.InterfaceC5451c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f35721a) {
            try {
                b.a aVar = this.f35725e;
                b.a aVar2 = b.a.RUNNING;
                z10 = aVar == aVar2 || this.f35726f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestFailed(InterfaceC5451c interfaceC5451c) {
        synchronized (this.f35721a) {
            try {
                if (interfaceC5451c.equals(this.f35724d)) {
                    this.f35726f = b.a.FAILED;
                    b bVar = this.f35722b;
                    if (bVar != null) {
                        bVar.onRequestFailed(this);
                    }
                    return;
                }
                this.f35725e = b.a.FAILED;
                b.a aVar = this.f35726f;
                b.a aVar2 = b.a.RUNNING;
                if (aVar != aVar2) {
                    this.f35726f = aVar2;
                    this.f35724d.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestSuccess(InterfaceC5451c interfaceC5451c) {
        synchronized (this.f35721a) {
            try {
                if (interfaceC5451c.equals(this.f35723c)) {
                    this.f35725e = b.a.SUCCESS;
                } else if (interfaceC5451c.equals(this.f35724d)) {
                    this.f35726f = b.a.SUCCESS;
                }
                b bVar = this.f35722b;
                if (bVar != null) {
                    bVar.onRequestSuccess(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k5.InterfaceC5451c
    public void pause() {
        synchronized (this.f35721a) {
            try {
                b.a aVar = this.f35725e;
                b.a aVar2 = b.a.RUNNING;
                if (aVar == aVar2) {
                    this.f35725e = b.a.PAUSED;
                    this.f35723c.pause();
                }
                if (this.f35726f == aVar2) {
                    this.f35726f = b.a.PAUSED;
                    this.f35724d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
