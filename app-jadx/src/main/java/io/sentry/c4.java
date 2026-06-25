package io.sentry;

import io.sentry.util.C5288a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
abstract class c4 implements Collection, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f50544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C5288a f50545b;

    c4(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f50544a = collection;
        this.f50545b = new C5288a();
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zAdd = b().add(obj);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zAdd;
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
    public boolean addAll(Collection collection) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zAddAll = b().addAll(collection);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zAddAll;
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

    protected Collection b() {
        return this.f50544a;
    }

    @Override // java.util.Collection
    public void clear() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            b().clear();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
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
    public boolean contains(Object obj) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zContains = b().contains(obj);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zContains;
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
    public boolean containsAll(Collection collection) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zContainsAll = b().containsAll(collection);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zContainsAll;
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
    public boolean isEmpty() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zIsEmpty = b().isEmpty();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zIsEmpty;
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

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return b().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zRemove = b().remove(obj);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zRemove;
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
    public boolean removeAll(Collection collection) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zRemoveAll = b().removeAll(collection);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zRemoveAll;
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
    public boolean retainAll(Collection collection) {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            boolean zRetainAll = b().retainAll(collection);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return zRetainAll;
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
    public int size() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            int size = b().size();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return size;
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

    public String toString() {
        InterfaceC5192e0 interfaceC5192e0A = this.f50545b.a();
        try {
            String string = b().toString();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return string;
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
