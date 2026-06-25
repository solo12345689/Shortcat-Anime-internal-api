.class public final Lse/o0;
.super Lse/H0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpe/p;
.implements Lpe/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/o0$a;
    }
.end annotation


# instance fields
.field private final q:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lse/d0;Lye/Z;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "descriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lse/H0;-><init>(Lse/d0;Lye/Z;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, LTd/q;->b:LTd/q;

    .line 15
    .line 16
    new-instance p2, Lse/n0;

    .line 17
    .line 18
    invoke-direct {p2, p0}, Lse/n0;-><init>(Lse/o0;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lse/o0;->q:Lkotlin/Lazy;

    .line 26
    .line 27
    return-void
.end method

.method private static final r0(Lse/o0;)Lse/o0$a;
    .locals 1

    .line 1
    new-instance v0, Lse/o0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lse/o0$a;-><init>(Lse/o0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static synthetic s0(Lse/o0;)Lse/o0$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/o0;->r0(Lse/o0;)Lse/o0$a;

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
    invoke-virtual {p0}, Lse/o0;->t0()Lse/o0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public t0()Lse/o0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/o0;->q:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lse/o0$a;

    .line 8
    .line 9
    return-object v0
.end method

.method public u0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/o0;->t0()Lse/o0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

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
