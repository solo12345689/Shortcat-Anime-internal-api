.class public abstract LBe/H;
.super LBe/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lye/N;


# instance fields
.field private final e:LXe/c;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lye/H;LXe/c;)V
    .locals 3

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lze/h;->k0:Lze/h$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lze/h$a;->b()Lze/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2}, LXe/c;->g()LXe/f;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Lye/h0;->a:Lye/h0;

    .line 22
    .line 23
    invoke-direct {p0, p1, v0, v1, v2}, LBe/n;-><init>(Lye/m;Lze/h;LXe/f;Lye/h0;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, LBe/H;->e:LXe/c;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "package "

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p2, " of "

    .line 42
    .line 43
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, LBe/H;->f:Ljava/lang/String;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public b()Lye/H;
    .locals 2

    .line 2
    invoke-super {p0}, LBe/n;->b()Lye/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lye/H;

    return-object v0
.end method

.method public bridge synthetic b()Lye/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/H;->b()Lye/H;

    move-result-object v0

    return-object v0
.end method

.method public b0(Lye/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "visitor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, Lye/o;->d(Lye/N;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final f()LXe/c;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/H;->e:LXe/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lye/h0;
    .locals 2

    .line 1
    sget-object v0, Lye/h0;->a:Lye/h0;

    .line 2
    .line 3
    const-string v1, "NO_SOURCE"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/H;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
