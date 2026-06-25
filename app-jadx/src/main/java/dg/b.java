package Dg;

import java.util.Enumeration;
import zg.AbstractC7387B;
import zg.AbstractC7394b;
import zg.AbstractC7432y;
import zg.C7401e0;
import zg.InterfaceC7400e;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f3791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AbstractC7394b f3792b;

    public b(a aVar, InterfaceC7400e interfaceC7400e) {
        this.f3792b = new C7401e0(interfaceC7400e);
        this.f3791a = aVar;
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        return new r0(this.f3791a, this.f3792b);
    }

    public a l() {
        return this.f3791a;
    }

    public AbstractC7394b p() {
        return this.f3792b;
    }

    public AbstractC7432y r() {
        return AbstractC7432y.v(this.f3792b.D());
    }

    public b(a aVar, byte[] bArr) {
        this.f3792b = new C7401e0(bArr);
        this.f3791a = aVar;
    }

    public b(AbstractC7387B abstractC7387B) {
        if (abstractC7387B.size() == 2) {
            Enumeration enumerationD = abstractC7387B.D();
            this.f3791a = a.n(enumerationD.nextElement());
            this.f3792b = AbstractC7394b.A(enumerationD.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC7387B.size());
        }
    }
}
