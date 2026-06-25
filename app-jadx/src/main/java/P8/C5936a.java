package p8;

/* JADX INFO: renamed from: p8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5936a extends AbstractC5939d {

    /* JADX INFO: renamed from: a */
    private final Integer f55816a;

    /* JADX INFO: renamed from: b */
    private final Object f55817b;

    /* JADX INFO: renamed from: c */
    private final EnumC5940e f55818c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5941f f55819d;

    C5936a(Integer num, Object obj, EnumC5940e enumC5940e, AbstractC5941f abstractC5941f) {
        this.f55816a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f55817b = obj;
        if (enumC5940e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f55818c = enumC5940e;
        this.f55819d = abstractC5941f;
    }

    @Override // p8.AbstractC5939d
    public Integer a() {
        return this.f55816a;
    }

    @Override // p8.AbstractC5939d
    public Object b() {
        return this.f55817b;
    }

    @Override // p8.AbstractC5939d
    public EnumC5940e c() {
        return this.f55818c;
    }

    @Override // p8.AbstractC5939d
    public AbstractC5941f d() {
        return this.f55819d;
    }

    public boolean equals(Object obj) {
        AbstractC5941f abstractC5941f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5939d) {
            AbstractC5939d abstractC5939d = (AbstractC5939d) obj;
            Integer num = this.f55816a;
            if (num != null ? num.equals(abstractC5939d.a()) : abstractC5939d.a() == null) {
                if (this.f55817b.equals(abstractC5939d.b()) && this.f55818c.equals(abstractC5939d.c()) && ((abstractC5941f = this.f55819d) != null ? abstractC5941f.equals(abstractC5939d.d()) : abstractC5939d.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f55816a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f55817b.hashCode()) * 1000003) ^ this.f55818c.hashCode()) * 1000003;
        AbstractC5941f abstractC5941f = this.f55819d;
        return iHashCode ^ (abstractC5941f != null ? abstractC5941f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f55816a + ", payload=" + this.f55817b + ", priority=" + this.f55818c + ", productData=" + this.f55819d + "}";
    }
}
