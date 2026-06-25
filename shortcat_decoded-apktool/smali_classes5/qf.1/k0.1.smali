.class public final Lqf/k0;
.super Lqf/C0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lye/m0;

.field private final b:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lye/m0;)V
    .locals 1

    .line 1
    const-string v0, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lqf/C0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lqf/k0;->a:Lye/m0;

    .line 10
    .line 11
    sget-object p1, LTd/q;->b:LTd/q;

    .line 12
    .line 13
    new-instance v0, Lqf/j0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lqf/j0;-><init>(Lqf/k0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lqf/k0;->b:Lkotlin/Lazy;

    .line 23
    .line 24
    return-void
.end method

.method private static final c(Lqf/k0;)Lqf/S;
    .locals 0

    .line 1
    iget-object p0, p0, Lqf/k0;->a:Lye/m0;

    .line 2
    .line 3
    invoke-static {p0}, Lqf/l0;->b(Lye/m0;)Lqf/S;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method static synthetic d(Lqf/k0;)Lqf/S;
    .locals 0

    .line 1
    invoke-static {p0}, Lqf/k0;->c(Lqf/k0;)Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e()Lqf/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lqf/k0;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lqf/S;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public b()Lqf/N0;
    .locals 1

    .line 1
    sget-object v0, Lqf/N0;->g:Lqf/N0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getType()Lqf/S;
    .locals 1

    .line 1
    invoke-direct {p0}, Lqf/k0;->e()Lqf/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public o(Lrf/g;)Lqf/B0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
