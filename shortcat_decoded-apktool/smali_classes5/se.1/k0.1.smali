.class public final Lse/k0;
.super Lse/B0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpe/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/k0$a;
    }
.end annotation


# instance fields
.field private final q:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lse/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lse/B0;-><init>(Lse/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    sget-object p1, LTd/q;->b:LTd/q;

    new-instance p2, Lse/j0;

    invoke-direct {p2, p0}, Lse/j0;-><init>(Lse/k0;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lse/k0;->q:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Lse/d0;Lye/Z;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lse/B0;-><init>(Lse/d0;Lye/Z;)V

    .line 2
    sget-object p1, LTd/q;->b:LTd/q;

    new-instance p2, Lse/j0;

    invoke-direct {p2, p0}, Lse/j0;-><init>(Lse/k0;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lse/k0;->q:Lkotlin/Lazy;

    return-void
.end method

.method private static final r0(Lse/k0;)Lse/k0$a;
    .locals 1

    .line 1
    new-instance v0, Lse/k0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lse/k0$a;-><init>(Lse/k0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static synthetic s0(Lse/k0;)Lse/k0$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/k0;->r0(Lse/k0;)Lse/k0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public bridge synthetic g()Lpe/i$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/k0;->t0()Lse/k0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lpe/j$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lse/k0;->t0()Lse/k0$a;

    move-result-object v0

    return-object v0
.end method

.method public t0()Lse/k0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/k0;->q:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lse/k0$a;

    .line 8
    .line 9
    return-object v0
.end method

.method public u0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/k0;->t0()Lse/k0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lse/A;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method
