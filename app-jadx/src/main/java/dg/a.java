package Dg;

import zg.AbstractC7387B;
import zg.AbstractC7432y;
import zg.C7402f;
import zg.C7427t;
import zg.InterfaceC7400e;
import zg.r;
import zg.r0;

/* JADX INFO: loaded from: classes5.dex */
public class a extends r {

    /* JADX INFO: renamed from: a */
    private C7427t f3789a;

    /* JADX INFO: renamed from: b */
    private InterfaceC7400e f3790b;

    public a(C7427t c7427t) {
        this.f3789a = c7427t;
    }

    public static a n(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(AbstractC7387B.A(obj));
        }
        return null;
    }

    @Override // zg.r, zg.InterfaceC7400e
    public AbstractC7432y e() {
        C7402f c7402f = new C7402f(2);
        c7402f.a(this.f3789a);
        InterfaceC7400e interfaceC7400e = this.f3790b;
        if (interfaceC7400e != null) {
            c7402f.a(interfaceC7400e);
        }
        return new r0(c7402f);
    }

    public C7427t l() {
        return this.f3789a;
    }

    public InterfaceC7400e p() {
        return this.f3790b;
    }

    public a(C7427t c7427t, InterfaceC7400e interfaceC7400e) {
        this.f3789a = c7427t;
        this.f3790b = interfaceC7400e;
    }

    private a(AbstractC7387B abstractC7387B) {
        if (abstractC7387B.size() >= 1 && abstractC7387B.size() <= 2) {
            this.f3789a = C7427t.F(abstractC7387B.B(0));
            this.f3790b = abstractC7387B.size() == 2 ? abstractC7387B.B(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC7387B.size());
        }
    }
}
