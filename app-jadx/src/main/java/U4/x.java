package U4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o5.C5831h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class x implements S4.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C5831h f19335j = new C5831h(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V4.b f19336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S4.f f19337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S4.f f19338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f19341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S4.h f19342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final S4.l f19343i;

    x(V4.b bVar, S4.f fVar, S4.f fVar2, int i10, int i11, S4.l lVar, Class cls, S4.h hVar) {
        this.f19336b = bVar;
        this.f19337c = fVar;
        this.f19338d = fVar2;
        this.f19339e = i10;
        this.f19340f = i11;
        this.f19343i = lVar;
        this.f19341g = cls;
        this.f19342h = hVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private byte[] c() {
        C5831h c5831h = f19335j;
        byte[] bArr = (byte[]) c5831h.g(this.f19341g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f19341g.getName().getBytes(S4.f.f15942a);
        c5831h.k(this.f19341g, bytes);
        return bytes;
    }

    @Override // S4.f
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f19336b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f19339e).putInt(this.f19340f).array();
        this.f19338d.b(messageDigest);
        this.f19337c.b(messageDigest);
        messageDigest.update(bArr);
        S4.l lVar = this.f19343i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f19342h.b(messageDigest);
        messageDigest.update(c());
        this.f19336b.put(bArr);
    }

    @Override // S4.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f19340f == xVar.f19340f && this.f19339e == xVar.f19339e && o5.l.e(this.f19343i, xVar.f19343i) && this.f19341g.equals(xVar.f19341g) && this.f19337c.equals(xVar.f19337c) && this.f19338d.equals(xVar.f19338d) && this.f19342h.equals(xVar.f19342h)) {
                return true;
            }
        }
        return false;
    }

    @Override // S4.f
    public int hashCode() {
        int iHashCode = (((((this.f19337c.hashCode() * 31) + this.f19338d.hashCode()) * 31) + this.f19339e) * 31) + this.f19340f;
        S4.l lVar = this.f19343i;
        if (lVar != null) {
            iHashCode = (iHashCode * 31) + lVar.hashCode();
        }
        return (((iHashCode * 31) + this.f19341g.hashCode()) * 31) + this.f19342h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f19337c + ", signature=" + this.f19338d + ", width=" + this.f19339e + ", height=" + this.f19340f + ", decodedResourceClass=" + this.f19341g + ", transformation='" + this.f19343i + "', options=" + this.f19342h + '}';
    }
}
