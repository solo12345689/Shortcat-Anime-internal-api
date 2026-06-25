package io.sentry;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class d4 extends c4 implements Queue {
    private d4(Queue queue) {
        super(queue);
    }

    static d4 d(Queue queue) {
        return new d4(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.c4
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Queue b() {
        return (Queue) super.b();
    }

    @Override // java.util.Queue
    public Object element() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            Object objElement = b().element();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return objElement;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zEquals = b().equals(obj);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zEquals;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            int iHashCode = b().hashCode();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return iHashCode;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zOffer = b().offer(obj);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zOffer;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public Object peek() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            Object objPeek = b().peek();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return objPeek;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public Object poll() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            Object objPoll = b().poll();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return objPoll;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public Object remove() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            Object objRemove = b().remove();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return objRemove;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            Object[] array = b().toArray();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return array;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            Object[] array = b().toArray(objArr);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return array;
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
