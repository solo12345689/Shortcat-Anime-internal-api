.class public final LKe/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LKe/d;

.field private final b:LKe/p;

.field private final c:Lkotlin/Lazy;

.field private final d:LMe/e;


# direct methods
.method public constructor <init>(LKe/d;LKe/p;Lkotlin/Lazy;)V
    .locals 1

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "delegateForDefaultTypeQualifiers"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LKe/k;->a:LKe/d;

    .line 20
    .line 21
    iput-object p2, p0, LKe/k;->b:LKe/p;

    .line 22
    .line 23
    iput-object p3, p0, LKe/k;->c:Lkotlin/Lazy;

    .line 24
    .line 25
    new-instance p1, LMe/e;

    .line 26
    .line 27
    invoke-direct {p1, p0, p2}, LMe/e;-><init>(LKe/k;LKe/p;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LKe/k;->d:LMe/e;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()LKe/d;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->a:LKe/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LHe/E;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LHe/E;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c()Lkotlin/Lazy;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lye/H;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->a:LKe/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/d;->m()Lye/H;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Lpf/n;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->a:LKe/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LKe/d;->u()Lpf/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final f()LKe/p;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->b:LKe/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LMe/e;
    .locals 1

    .line 1
    iget-object v0, p0, LKe/k;->d:LMe/e;

    .line 2
    .line 3
    return-object v0
.end method
