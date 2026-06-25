package bf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import qf.J0;
import qf.S;
import qf.W;
import qf.v0;
import rf.InterfaceC6315e;
import ye.AbstractC7241t;
import ye.AbstractC7242u;
import ye.E;
import ye.EnumC7228f;
import ye.H;
import ye.InterfaceC7223a;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;
import ye.InterfaceC7235m;
import ye.InterfaceC7238p;
import ye.InterfaceC7239q;
import ye.N;
import ye.V;
import ye.b0;
import ye.c0;
import ye.i0;
import ye.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i {

    /* JADX INFO: renamed from: a */
    public static final Xe.c f33299a = new Xe.c("kotlin.jvm.JvmName");

    public static boolean A(InterfaceC7235m interfaceC7235m) {
        return D(interfaceC7235m, EnumC7228f.f65099d);
    }

    public static boolean B(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(36);
        }
        return D(interfaceC7235m, EnumC7228f.f65100e);
    }

    public static boolean C(InterfaceC7235m interfaceC7235m) {
        return D(interfaceC7235m, EnumC7228f.f65098c);
    }

    private static boolean D(InterfaceC7235m interfaceC7235m, EnumC7228f enumC7228f) {
        if (enumC7228f == null) {
            a(37);
        }
        return (interfaceC7235m instanceof InterfaceC7227e) && ((InterfaceC7227e) interfaceC7235m).h() == enumC7228f;
    }

    public static boolean E(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(1);
        }
        while (interfaceC7235m != null) {
            if (u(interfaceC7235m) || y(interfaceC7235m)) {
                return true;
            }
            interfaceC7235m = interfaceC7235m.b();
        }
        return false;
    }

    private static boolean F(S s10, InterfaceC7235m interfaceC7235m) {
        if (s10 == null) {
            a(30);
        }
        if (interfaceC7235m == null) {
            a(31);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP == null) {
            return false;
        }
        InterfaceC7235m interfaceC7235mA = interfaceC7230hP.a();
        return (interfaceC7235mA instanceof InterfaceC7230h) && (interfaceC7235m instanceof InterfaceC7230h) && ((InterfaceC7230h) interfaceC7235m).l().equals(((InterfaceC7230h) interfaceC7235mA).l());
    }

    public static boolean G(InterfaceC7235m interfaceC7235m) {
        return (D(interfaceC7235m, EnumC7228f.f65097b) || D(interfaceC7235m, EnumC7228f.f65098c)) && ((InterfaceC7227e) interfaceC7235m).r() == E.f65061c;
    }

    public static boolean H(InterfaceC7227e interfaceC7227e, InterfaceC7227e interfaceC7227e2) {
        if (interfaceC7227e == null) {
            a(28);
        }
        if (interfaceC7227e2 == null) {
            a(29);
        }
        return I(interfaceC7227e.p(), interfaceC7227e2.a());
    }

    public static boolean I(S s10, InterfaceC7235m interfaceC7235m) {
        if (s10 == null) {
            a(32);
        }
        if (interfaceC7235m == null) {
            a(33);
        }
        if (F(s10, interfaceC7235m)) {
            return true;
        }
        Iterator it = s10.N0().k().iterator();
        while (it.hasNext()) {
            if (I((S) it.next(), interfaceC7235m)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(InterfaceC7235m interfaceC7235m) {
        return interfaceC7235m != null && (interfaceC7235m.b() instanceof N);
    }

    public static boolean K(u0 u0Var, S s10) {
        if (u0Var == null) {
            a(65);
        }
        if (s10 == null) {
            a(66);
        }
        if (u0Var.N() || W.a(s10)) {
            return false;
        }
        if (J0.b(s10)) {
            return true;
        }
        ve.i iVarM = ff.e.m(u0Var);
        if (!ve.i.t0(s10)) {
            InterfaceC6315e interfaceC6315e = InterfaceC6315e.f58773a;
            if (!interfaceC6315e.c(iVarM.X(), s10) && !interfaceC6315e.c(iVarM.L().p(), s10) && !interfaceC6315e.c(iVarM.i(), s10) && !ve.s.d(s10)) {
                return false;
            }
        }
        return true;
    }

    public static InterfaceC7224b L(InterfaceC7224b interfaceC7224b) {
        if (interfaceC7224b == null) {
            a(58);
        }
        while (interfaceC7224b.h() == InterfaceC7224b.a.FAKE_OVERRIDE) {
            Collection collectionE = interfaceC7224b.e();
            if (collectionE.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC7224b);
            }
            interfaceC7224b = (InterfaceC7224b) collectionE.iterator().next();
        }
        return interfaceC7224b;
    }

    public static InterfaceC7239q M(InterfaceC7239q interfaceC7239q) {
        if (interfaceC7239q == null) {
            a(63);
        }
        if (interfaceC7239q instanceof InterfaceC7224b) {
            return L((InterfaceC7224b) interfaceC7239q);
        }
        if (interfaceC7239q == null) {
            a(64);
        }
        return interfaceC7239q;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(InterfaceC7235m interfaceC7235m, InterfaceC7235m interfaceC7235m2) {
        if (interfaceC7235m == null) {
            a(16);
        }
        if (interfaceC7235m2 == null) {
            a(17);
        }
        return g(interfaceC7235m).equals(g(interfaceC7235m2));
    }

    private static void c(InterfaceC7223a interfaceC7223a, Set set) {
        if (interfaceC7223a == null) {
            a(72);
        }
        if (set == null) {
            a(73);
        }
        if (set.contains(interfaceC7223a)) {
            return;
        }
        Iterator it = interfaceC7223a.a().e().iterator();
        while (it.hasNext()) {
            InterfaceC7223a interfaceC7223aA = ((InterfaceC7223a) it.next()).a();
            c(interfaceC7223aA, set);
            set.add(interfaceC7223aA);
        }
    }

    public static Set d(InterfaceC7223a interfaceC7223a) {
        if (interfaceC7223a == null) {
            a(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(interfaceC7223a.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static InterfaceC7227e e(S s10) {
        if (s10 == null) {
            a(45);
        }
        return f(s10.N0());
    }

    public static InterfaceC7227e f(v0 v0Var) {
        if (v0Var == null) {
            a(46);
        }
        InterfaceC7227e interfaceC7227e = (InterfaceC7227e) v0Var.p();
        if (interfaceC7227e == null) {
            a(47);
        }
        return interfaceC7227e;
    }

    public static H g(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(21);
        }
        H hI = i(interfaceC7235m);
        if (hI == null) {
            a(22);
        }
        return hI;
    }

    public static H h(S s10) {
        if (s10 == null) {
            a(20);
        }
        InterfaceC7230h interfaceC7230hP = s10.N0().p();
        if (interfaceC7230hP == null) {
            return null;
        }
        return i(interfaceC7230hP);
    }

    public static H i(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(23);
        }
        while (interfaceC7235m != null) {
            if (interfaceC7235m instanceof H) {
                return (H) interfaceC7235m;
            }
            if (interfaceC7235m instanceof V) {
                return ((V) interfaceC7235m).C0();
            }
            interfaceC7235m = interfaceC7235m.b();
        }
        return null;
    }

    public static i0 j(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(81);
        }
        if (interfaceC7235m instanceof b0) {
            interfaceC7235m = ((b0) interfaceC7235m).W();
        }
        if (interfaceC7235m instanceof InterfaceC7238p) {
            i0 i0VarB = ((InterfaceC7238p) interfaceC7235m).k().b();
            if (i0VarB == null) {
                a(82);
            }
            return i0VarB;
        }
        i0 i0Var = i0.f65113a;
        if (i0Var == null) {
            a(83);
        }
        return i0Var;
    }

    public static AbstractC7242u k(InterfaceC7227e interfaceC7227e, boolean z10) {
        if (interfaceC7227e == null) {
            a(48);
        }
        EnumC7228f enumC7228fH = interfaceC7227e.h();
        if (enumC7228fH == EnumC7228f.f65099d || enumC7228fH.b()) {
            AbstractC7242u abstractC7242u = AbstractC7241t.f65120a;
            if (abstractC7242u == null) {
                a(49);
            }
            return abstractC7242u;
        }
        if (G(interfaceC7227e)) {
            if (z10) {
                AbstractC7242u abstractC7242u2 = AbstractC7241t.f65122c;
                if (abstractC7242u2 == null) {
                    a(50);
                }
                return abstractC7242u2;
            }
            AbstractC7242u abstractC7242u3 = AbstractC7241t.f65120a;
            if (abstractC7242u3 == null) {
                a(51);
            }
            return abstractC7242u3;
        }
        if (u(interfaceC7227e)) {
            AbstractC7242u abstractC7242u4 = AbstractC7241t.f65131l;
            if (abstractC7242u4 == null) {
                a(52);
            }
            return abstractC7242u4;
        }
        AbstractC7242u abstractC7242u5 = AbstractC7241t.f65124e;
        if (abstractC7242u5 == null) {
            a(53);
        }
        return abstractC7242u5;
    }

    public static c0 l(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(0);
        }
        if (interfaceC7235m instanceof InterfaceC7227e) {
            return ((InterfaceC7227e) interfaceC7235m).J0();
        }
        return null;
    }

    public static Xe.d m(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(2);
        }
        Xe.c cVarO = o(interfaceC7235m);
        return cVarO != null ? cVarO.i() : p(interfaceC7235m);
    }

    public static Xe.c n(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(3);
        }
        Xe.c cVarO = o(interfaceC7235m);
        if (cVarO == null) {
            cVarO = p(interfaceC7235m).m();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static Xe.c o(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(5);
        }
        if ((interfaceC7235m instanceof H) || sf.l.m(interfaceC7235m)) {
            return Xe.c.f21764d;
        }
        if (interfaceC7235m instanceof V) {
            return ((V) interfaceC7235m).f();
        }
        if (interfaceC7235m instanceof N) {
            return ((N) interfaceC7235m).f();
        }
        return null;
    }

    private static Xe.d p(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(6);
        }
        Xe.d dVarB = m(interfaceC7235m.b()).b(interfaceC7235m.getName());
        if (dVarB == null) {
            a(7);
        }
        return dVarB;
    }

    public static InterfaceC7235m q(InterfaceC7235m interfaceC7235m, Class cls) {
        if (cls == null) {
            a(18);
        }
        return r(interfaceC7235m, cls, true);
    }

    public static InterfaceC7235m r(InterfaceC7235m interfaceC7235m, Class cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (interfaceC7235m == null) {
            return null;
        }
        if (z10) {
            interfaceC7235m = interfaceC7235m.b();
        }
        while (interfaceC7235m != null) {
            if (cls.isInstance(interfaceC7235m)) {
                return interfaceC7235m;
            }
            interfaceC7235m = interfaceC7235m.b();
        }
        return null;
    }

    public static InterfaceC7227e s(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e == null) {
            a(44);
        }
        Iterator it = interfaceC7227e.l().k().iterator();
        while (it.hasNext()) {
            InterfaceC7227e interfaceC7227eE = e((S) it.next());
            if (interfaceC7227eE.h() != EnumC7228f.f65098c) {
                return interfaceC7227eE;
            }
        }
        return null;
    }

    public static boolean t(InterfaceC7235m interfaceC7235m) {
        return D(interfaceC7235m, EnumC7228f.f65101f);
    }

    public static boolean u(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            a(34);
        }
        return v(interfaceC7235m) && interfaceC7235m.getName().equals(Xe.h.f21781b);
    }

    public static boolean v(InterfaceC7235m interfaceC7235m) {
        return D(interfaceC7235m, EnumC7228f.f65097b);
    }

    public static boolean w(InterfaceC7235m interfaceC7235m) {
        return v(interfaceC7235m) || A(interfaceC7235m);
    }

    public static boolean x(InterfaceC7235m interfaceC7235m) {
        return D(interfaceC7235m, EnumC7228f.f65102g) && ((InterfaceC7227e) interfaceC7235m).c0();
    }

    public static boolean y(InterfaceC7235m interfaceC7235m) {
        return (interfaceC7235m instanceof InterfaceC7239q) && ((InterfaceC7239q) interfaceC7235m).getVisibility() == AbstractC7241t.f65125f;
    }

    public static boolean z(InterfaceC7227e interfaceC7227e, InterfaceC7227e interfaceC7227e2) {
        if (interfaceC7227e == null) {
            a(26);
        }
        if (interfaceC7227e2 == null) {
            a(27);
        }
        Iterator it = interfaceC7227e.l().k().iterator();
        while (it.hasNext()) {
            if (F((S) it.next(), interfaceC7227e2.a())) {
                return true;
            }
        }
        return false;
    }
}
