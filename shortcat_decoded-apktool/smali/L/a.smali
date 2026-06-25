.class public abstract LL/a;
.super LK0/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/v0;
.implements Lq0/d;


# instance fields
.field private c:Lie/a;

.field private d:Z

.field private final e:LE0/X;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lie/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LK0/m;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LL/a;->c:Lie/a;

    .line 5
    .line 6
    new-instance p1, LL/a$a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p0, v0}, LL/a$a;-><init>(LL/a;LZd/e;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, LE0/V;->a(Lkotlin/jvm/functions/Function2;)LE0/X;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, LK0/m;->E1(LK0/j;)LK0/j;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, LE0/X;

    .line 21
    .line 22
    iput-object p1, p0, LL/a;->e:LE0/X;

    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic K1(LL/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LL/a;->d:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final L1()Lie/a;
    .locals 1

    .line 1
    iget-object v0, p0, LL/a;->c:Lie/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M1(Lie/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL/a;->c:Lie/a;

    .line 2
    .line 3
    return-void
.end method

.method public S(LE0/q;LE0/s;J)V
    .locals 1

    .line 1
    iget-object v0, p0, LL/a;->e:LE0/X;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LK0/v0;->S(LE0/q;LE0/s;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public W0(Lq0/n;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lq0/n;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, LL/a;->d:Z

    .line 6
    .line 7
    return-void
.end method

.method public a1()V
    .locals 1

    .line 1
    iget-object v0, p0, LL/a;->e:LE0/X;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/v0;->a1()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
