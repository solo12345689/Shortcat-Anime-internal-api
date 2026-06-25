package kotlin.jvm.internal;

import java.io.Serializable;
import pe.InterfaceC6017g;

/* JADX INFO: renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5487a implements InterfaceC5500n, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public C5487a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, AbstractC5492f.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5487a)) {
            return false;
        }
        C5487a c5487a = (C5487a) obj;
        return this.isTopLevel == c5487a.isTopLevel && this.arity == c5487a.arity && this.flags == c5487a.flags && AbstractC5504s.c(this.receiver, c5487a.receiver) && AbstractC5504s.c(this.owner, c5487a.owner) && this.name.equals(c5487a.name) && this.signature.equals(c5487a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC5500n
    public int getArity() {
        return this.arity;
    }

    public InterfaceC6017g getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? O.c(cls) : O.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return O.m(this);
    }

    public C5487a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i11 & 1) == 1;
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
