package Pg;

import Oh.i;
import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes5.dex */
public class b extends BasicPermission {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13976b;

    public b(String str, String str2) {
        super(str, str2);
        this.f13975a = str2;
        this.f13976b = a(str2);
    }

    private int a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(i.f(str), " ,");
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i10 |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i10 |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i10 |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i10 |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i10 |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i10 |= 32;
            } else if (strNextToken.equals("all")) {
                i10 = 63;
            }
        }
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f13976b == bVar.f13976b && getName().equals(bVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f13975a;
    }

    public int hashCode() {
        return getName().hashCode() + this.f13976b;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof b) || !getName().equals(permission.getName())) {
            return false;
        }
        int i10 = this.f13976b;
        int i11 = ((b) permission).f13976b;
        return (i10 & i11) == i11;
    }
}
