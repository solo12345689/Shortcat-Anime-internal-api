package Fg;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class f extends Permission {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f6673a;

    public f(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f6673a = hashSet;
        hashSet.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f6673a.equals(((f) obj).f6673a);
    }

    @Override // java.security.Permission
    public String getActions() {
        return this.f6673a.toString();
    }

    public int hashCode() {
        return this.f6673a.hashCode();
    }

    @Override // java.security.Permission
    public boolean implies(Permission permission) {
        if (!(permission instanceof f)) {
            return false;
        }
        f fVar = (f) permission;
        return getName().equals(fVar.getName()) || this.f6673a.containsAll(fVar.f6673a);
    }
}
