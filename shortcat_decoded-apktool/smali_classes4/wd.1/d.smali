.class final Lwd/d;
.super Ldg/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Ldg/F;

.field private final c:Lwd/b;

.field private final d:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Ldg/F;Lwd/b;)V
    .locals 1

    .line 1
    const-string v0, "responseBody"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "progressListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ldg/F;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lwd/d;->b:Ldg/F;

    .line 15
    .line 16
    iput-object p2, p0, Lwd/d;->c:Lwd/b;

    .line 17
    .line 18
    new-instance p1, Lwd/c;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lwd/c;-><init>(Lwd/d;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LTd/n;->b(Lie/a;)Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lwd/d;->d:Lkotlin/Lazy;

    .line 28
    .line 29
    return-void
.end method

.method private final C(Ltg/Z;)Ltg/Z;
    .locals 1

    .line 1
    new-instance v0, Lwd/d$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Lwd/d$a;-><init>(Ltg/Z;Lwd/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic m(Lwd/d;)Ltg/j;
    .locals 0

    .line 1
    invoke-static {p0}, Lwd/d;->w(Lwd/d;)Ltg/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lwd/d;)Lwd/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/d;->c:Lwd/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lwd/d;)Ldg/F;
    .locals 0

    .line 1
    iget-object p0, p0, Lwd/d;->b:Ldg/F;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final w(Lwd/d;)Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/d;->b:Ldg/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/F;->k()Ltg/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lwd/d;->C(Ltg/Z;)Ltg/Z;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private final z()Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/d;->d:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ltg/j;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public h()J
    .locals 2

    .line 1
    iget-object v0, p0, Lwd/d;->b:Ldg/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/F;->h()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public j()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lwd/d;->b:Ldg/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public k()Ltg/j;
    .locals 1

    .line 1
    invoke-direct {p0}, Lwd/d;->z()Ltg/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
