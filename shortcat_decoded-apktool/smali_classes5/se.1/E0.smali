.class public Lse/E0;
.super Lse/K0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lpe/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lse/E0$a;
    }
.end annotation


# instance fields
.field private final o:Lkotlin/Lazy;

.field private final p:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lse/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lse/K0;-><init>(Lse/d0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    sget-object p1, LTd/q;->b:LTd/q;

    new-instance p2, Lse/C0;

    invoke-direct {p2, p0}, Lse/C0;-><init>(Lse/E0;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lse/E0;->o:Lkotlin/Lazy;

    .line 3
    new-instance p2, Lse/D0;

    invoke-direct {p2, p0}, Lse/D0;-><init>(Lse/E0;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lse/E0;->p:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Lse/d0;Lye/Z;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2}, Lse/K0;-><init>(Lse/d0;Lye/Z;)V

    .line 5
    sget-object p1, LTd/q;->b:LTd/q;

    new-instance p2, Lse/C0;

    invoke-direct {p2, p0}, Lse/C0;-><init>(Lse/E0;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lse/E0;->o:Lkotlin/Lazy;

    .line 6
    new-instance p2, Lse/D0;

    invoke-direct {p2, p0}, Lse/D0;-><init>(Lse/E0;)V

    invoke-static {p1, p2}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lse/E0;->p:Lkotlin/Lazy;

    return-void
.end method

.method private static final m0(Lse/E0;)Lse/E0$a;
    .locals 1

    .line 1
    new-instance v0, Lse/E0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lse/E0$a;-><init>(Lse/E0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static synthetic n0(Lse/E0;)Lse/E0$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/E0;->m0(Lse/E0;)Lse/E0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic o0(Lse/E0;)Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    invoke-static {p0}, Lse/E0;->p0(Lse/E0;)Ljava/lang/reflect/Member;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final p0(Lse/E0;)Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lse/K0;->f0()Ljava/lang/reflect/Member;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public bridge synthetic d()Lpe/m$b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/E0;->q0()Lse/E0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lpe/o$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lse/E0;->q0()Lse/E0$a;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/E0;->q0()Lse/E0$a;

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
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lse/E0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic j0()Lse/K0$c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lse/E0;->q0()Lse/E0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public q0()Lse/E0$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lse/E0;->o:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lse/E0$a;

    .line 8
    .line 9
    return-object v0
.end method
