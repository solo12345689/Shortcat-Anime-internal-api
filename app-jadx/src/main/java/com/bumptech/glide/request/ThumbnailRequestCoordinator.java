package com.bumptech.glide.request;

import com.bumptech.glide.request.b;
import k5.InterfaceC5451c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ThumbnailRequestCoordinator implements b, InterfaceC5451c {
    private volatile InterfaceC5451c full;
    private b.a fullState;
    private boolean isRunningDuringBegin;
    private final b parent;
    private final Object requestLock;
    private volatile InterfaceC5451c thumb;
    private b.a thumbState;

    public ThumbnailRequestCoordinator(Object obj, b bVar) {
        b.a aVar = b.a.CLEARED;
        this.fullState = aVar;
        this.thumbState = aVar;
        this.requestLock = obj;
        this.parent = bVar;
    }

    private boolean parentCanNotifyCleared() {
        b bVar = this.parent;
        return bVar == null || bVar.canNotifyCleared(this);
    }

    private boolean parentCanNotifyStatusChanged() {
        b bVar = this.parent;
        return bVar == null || bVar.canNotifyStatusChanged(this);
    }

    private boolean parentCanSetImage() {
        b bVar = this.parent;
        return bVar == null || bVar.canSetImage(this);
    }

    @Override // k5.InterfaceC5451c
    public void begin() {
        synchronized (this.requestLock) {
            try {
                this.isRunningDuringBegin = true;
                try {
                    if (this.fullState != b.a.SUCCESS) {
                        b.a aVar = this.thumbState;
                        b.a aVar2 = b.a.RUNNING;
                        if (aVar != aVar2) {
                            this.thumbState = aVar2;
                            this.thumb.begin();
                        }
                    }
                    if (this.isRunningDuringBegin) {
                        b.a aVar3 = this.fullState;
                        b.a aVar4 = b.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.fullState = aVar4;
                            this.full.begin();
                        }
                    }
                    this.isRunningDuringBegin = false;
                } catch (Throwable th2) {
                    this.isRunningDuringBegin = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyCleared(InterfaceC5451c interfaceC5451c) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanNotifyCleared() && interfaceC5451c.equals(this.full) && this.fullState != b.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canNotifyStatusChanged(InterfaceC5451c interfaceC5451c) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanNotifyStatusChanged() && interfaceC5451c.equals(this.full) && !isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public boolean canSetImage(InterfaceC5451c interfaceC5451c) {
        boolean z10;
        synchronized (this.requestLock) {
            try {
                z10 = parentCanSetImage() && (interfaceC5451c.equals(this.full) || this.fullState != b.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public void clear() {
        synchronized (this.requestLock) {
            this.isRunningDuringBegin = false;
            b.a aVar = b.a.CLEARED;
            this.fullState = aVar;
            this.thumbState = aVar;
            this.thumb.clear();
            this.full.clear();
        }
    }

    @Override // com.bumptech.glide.request.b
    public b getRoot() {
        b root;
        synchronized (this.requestLock) {
            try {
                b bVar = this.parent;
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
        synchronized (this.requestLock) {
            try {
                z10 = this.thumb.isAnyResourceSet() || this.full.isAnyResourceSet();
            } finally {
            }
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isCleared() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == b.a.CLEARED;
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isComplete() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == b.a.SUCCESS;
        }
        return z10;
    }

    @Override // k5.InterfaceC5451c
    public boolean isEquivalentTo(InterfaceC5451c interfaceC5451c) {
        if (interfaceC5451c instanceof ThumbnailRequestCoordinator) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) interfaceC5451c;
            if (this.full != null ? this.full.isEquivalentTo(thumbnailRequestCoordinator.full) : thumbnailRequestCoordinator.full == null) {
                if (this.thumb == null) {
                    if (thumbnailRequestCoordinator.thumb == null) {
                        return true;
                    }
                } else if (this.thumb.isEquivalentTo(thumbnailRequestCoordinator.thumb)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k5.InterfaceC5451c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.requestLock) {
            z10 = this.fullState == b.a.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestFailed(InterfaceC5451c interfaceC5451c) {
        synchronized (this.requestLock) {
            try {
                if (!interfaceC5451c.equals(this.full)) {
                    this.thumbState = b.a.FAILED;
                    return;
                }
                this.fullState = b.a.FAILED;
                b bVar = this.parent;
                if (bVar != null) {
                    bVar.onRequestFailed(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.b
    public void onRequestSuccess(InterfaceC5451c interfaceC5451c) {
        synchronized (this.requestLock) {
            try {
                if (interfaceC5451c.equals(this.thumb)) {
                    this.thumbState = b.a.SUCCESS;
                    return;
                }
                this.fullState = b.a.SUCCESS;
                b bVar = this.parent;
                if (bVar != null) {
                    bVar.onRequestSuccess(this);
                }
                if (!this.thumbState.b()) {
                    this.thumb.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k5.InterfaceC5451c
    public void pause() {
        synchronized (this.requestLock) {
            try {
                if (!this.thumbState.b()) {
                    this.thumbState = b.a.PAUSED;
                    this.thumb.pause();
                }
                if (!this.fullState.b()) {
                    this.fullState = b.a.PAUSED;
                    this.full.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(InterfaceC5451c interfaceC5451c, InterfaceC5451c interfaceC5451c2) {
        this.full = interfaceC5451c;
        this.thumb = interfaceC5451c2;
    }
}
