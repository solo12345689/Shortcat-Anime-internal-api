package qf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ye.InterfaceC7227e;
import ye.k0;

/* JADX INFO: renamed from: qf.u */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6210u extends AbstractC6178b {

    /* JADX INFO: renamed from: d */
    private final InterfaceC7227e f58094d;

    /* JADX INFO: renamed from: e */
    private final List f58095e;

    /* JADX INFO: renamed from: f */
    private final Collection f58096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6210u(InterfaceC7227e interfaceC7227e, List list, Collection collection, pf.n nVar) {
        super(nVar);
        if (interfaceC7227e == null) {
            H(0);
        }
        if (list == null) {
            H(1);
        }
        if (collection == null) {
            H(2);
        }
        if (nVar == null) {
            H(3);
        }
        this.f58094d = interfaceC7227e;
        this.f58095e = Collections.unmodifiableList(new ArrayList(list));
        this.f58096f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // qf.AbstractC6211v, qf.v0
    /* JADX INFO: renamed from: I */
    public InterfaceC7227e p() {
        InterfaceC7227e interfaceC7227e = this.f58094d;
        if (interfaceC7227e == null) {
            H(5);
        }
        return interfaceC7227e;
    }

    @Override // qf.v0
    public List getParameters() {
        List list = this.f58095e;
        if (list == null) {
            H(4);
        }
        return list;
    }

    @Override // qf.v0
    public boolean q() {
        return true;
    }

    @Override // qf.AbstractC6206p
    protected Collection r() {
        Collection collection = this.f58096f;
        if (collection == null) {
            H(6);
        }
        return collection;
    }

    public String toString() {
        return bf.i.m(this.f58094d).a();
    }

    @Override // qf.AbstractC6206p
    protected ye.k0 v() {
        k0.a aVar = k0.a.f65115a;
        if (aVar == null) {
            H(7);
        }
        return aVar;
    }
}
