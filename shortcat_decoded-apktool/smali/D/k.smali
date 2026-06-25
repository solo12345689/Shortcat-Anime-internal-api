.class public final LD/k;
.super LF/m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LD/y;


# instance fields
.field private final a:LF/G;

.field private b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LF/m;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF/G;

    .line 5
    .line 6
    invoke-direct {v0}, LF/G;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD/k;->a:LF/G;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Ljava/lang/Object;Lie/o;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LD/k;->k()LF/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LD/j;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v2, LD/k$a;

    .line 10
    .line 11
    invoke-direct {v2, p1}, LD/k$a;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    :goto_0
    new-instance p1, LD/k$b;

    .line 17
    .line 18
    invoke-direct {p1, p2}, LD/k$b;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p2, LD/k$c;

    .line 22
    .line 23
    invoke-direct {p2, p3}, LD/k$c;-><init>(Lie/o;)V

    .line 24
    .line 25
    .line 26
    const p3, -0x3c36593a

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-static {p3, v3, p2}, Lg0/i;->b(IZLjava/lang/Object;)Lg0/b;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-direct {v1, v2, p1, p2}, LD/j;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lie/p;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3, v1}, LF/G;->b(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public d(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lie/p;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LD/k;->k()LF/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LD/j;

    .line 6
    .line 7
    invoke-direct {v1, p2, p3, p4}, LD/j;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lie/p;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, v1}, LF/G;->b(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public bridge synthetic g()LF/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD/k;->k()LF/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LD/k;->b:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public k()LF/G;
    .locals 1

    .line 1
    iget-object v0, p0, LD/k;->a:LF/G;

    .line 2
    .line 3
    return-object v0
.end method
