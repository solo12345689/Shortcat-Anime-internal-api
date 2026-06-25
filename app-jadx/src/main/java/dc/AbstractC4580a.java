package dc;

import Td.L;
import Ud.AbstractC2273n;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.InvalidArgsNumberException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;
import rb.AbstractC6300a;

/* JADX INFO: renamed from: dc.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4580a {

    /* JADX INFO: renamed from: a */
    private final String f45092a;

    /* JADX INFO: renamed from: b */
    private final C5972b[] f45093b;

    /* JADX INFO: renamed from: c */
    private boolean f45094c;

    /* JADX INFO: renamed from: d */
    private InterfaceC6027q f45095d;

    /* JADX INFO: renamed from: e */
    private boolean f45096e;

    /* JADX INFO: renamed from: f */
    private final int f45097f;

    public AbstractC4580a(String name, C5972b[] desiredArgsTypes) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(desiredArgsTypes, "desiredArgsTypes");
        this.f45092a = name;
        this.f45093b = desiredArgsTypes;
        this.f45096e = true;
        Iterator it = AbstractC2273n.F0(desiredArgsTypes).iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (!((C5972b) it.next()).g().b()) {
                break;
            } else {
                i10++;
            }
        }
        this.f45097f = i10 >= 0 ? this.f45093b.length - i10 : 0;
    }

    public static /* synthetic */ Object[] c(AbstractC4580a abstractC4580a, Object[] objArr, Ub.d dVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertArgs");
        }
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return abstractC4580a.b(objArr, dVar, z10);
    }

    public abstract void a(Ub.d dVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str);

    protected final Object[] b(Object[] args, Ub.d dVar, boolean z10) throws expo.modules.kotlin.exception.a, InvalidArgsNumberException {
        CodedException unexpectedException;
        CodedException codedException;
        AbstractC5504s.h(args, "args");
        if (this.f45097f <= args.length) {
            int length = args.length;
            C5972b[] c5972bArr = this.f45093b;
            if (length <= c5972bArr.length) {
                Object[] objArr = c5972bArr.length == args.length ? args : new Object[c5972bArr.length];
                int length2 = args.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    Object obj = args[i10];
                    C5972b c5972b = this.f45093b[i10];
                    try {
                        objArr[i10] = c5972b.b(obj, dVar, z10);
                        L l10 = L.f17438a;
                    } catch (Throwable th2) {
                        if (th2 instanceof CodedException) {
                            codedException = (CodedException) th2;
                        } else {
                            if (th2 instanceof AbstractC6300a) {
                                AbstractC6300a abstractC6300a = (AbstractC6300a) th2;
                                String strA = abstractC6300a.a();
                                AbstractC5504s.g(strA, "getCode(...)");
                                unexpectedException = new CodedException(strA, abstractC6300a.getMessage(), abstractC6300a.getCause());
                            } else {
                                unexpectedException = new UnexpectedException(th2);
                            }
                            codedException = unexpectedException;
                        }
                        throw new expo.modules.kotlin.exception.a(c5972b.g(), i10, String.valueOf(obj != null ? obj.getClass() : null), codedException);
                    }
                }
                return objArr;
            }
        }
        throw new InvalidArgsNumberException(args.length, this.f45093b.length, this.f45097f);
    }

    public final AbstractC4580a d(boolean z10) {
        this.f45096e = z10;
        return this;
    }

    public final List e() {
        C5972b[] c5972bArr = this.f45093b;
        ArrayList arrayList = new ArrayList(c5972bArr.length);
        for (C5972b c5972b : c5972bArr) {
            arrayList.add(c5972b.f());
        }
        return arrayList;
    }

    protected final C5972b[] f() {
        return this.f45093b;
    }

    protected final String g() {
        return this.f45092a;
    }

    public final InterfaceC6027q h() {
        return this.f45095d;
    }

    public final boolean i() {
        InterfaceC6027q interfaceC6027qG;
        if (!this.f45094c) {
            return false;
        }
        C5972b c5972b = (C5972b) AbstractC2273n.Y(this.f45093b);
        InterfaceC6016f interfaceC6016fC = (c5972b == null || (interfaceC6027qG = c5972b.g()) == null) ? null : interfaceC6027qG.c();
        InterfaceC6014d interfaceC6014d = interfaceC6016fC instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC : null;
        if (interfaceC6014d == null) {
            return false;
        }
        if (AbstractC5504s.c(interfaceC6014d, O.b(JavaScriptObject.class))) {
            return true;
        }
        InterfaceC6027q interfaceC6027q = this.f45095d;
        InterfaceC6016f interfaceC6016fC2 = interfaceC6027q != null ? interfaceC6027q.c() : null;
        InterfaceC6014d interfaceC6014d2 = interfaceC6016fC2 instanceof InterfaceC6014d ? (InterfaceC6014d) interfaceC6016fC2 : null;
        if (interfaceC6014d2 == null) {
            return false;
        }
        return AbstractC5504s.c(interfaceC6014d, interfaceC6014d2);
    }

    public final boolean j() {
        return this.f45096e;
    }

    public final void k(boolean z10) {
        this.f45094c = z10;
    }

    public final void l(InterfaceC6027q interfaceC6027q) {
        this.f45095d = interfaceC6027q;
    }
}
