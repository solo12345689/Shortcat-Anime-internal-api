.class public final LY/y0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LY/Q;

.field private final c:LY/E1;

.field private final d:LY/b;

.field private e:Ljava/util/List;

.field private final f:LY/U0;

.field private final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/w0;Ljava/lang/Object;LY/Q;LY/E1;LY/b;Ljava/util/List;LY/U0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LY/y0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, LY/y0;->b:LY/Q;

    .line 7
    .line 8
    iput-object p4, p0, LY/y0;->c:LY/E1;

    .line 9
    .line 10
    iput-object p5, p0, LY/y0;->d:LY/b;

    .line 11
    .line 12
    iput-object p6, p0, LY/y0;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-object p7, p0, LY/y0;->f:LY/U0;

    .line 15
    .line 16
    iput-object p8, p0, LY/y0;->g:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()LY/b;
    .locals 1

    .line 1
    iget-object v0, p0, LY/y0;->d:LY/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LY/Q;
    .locals 1

    .line 1
    iget-object v0, p0, LY/y0;->b:LY/Q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LY/w0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LY/y0;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LY/U0;
    .locals 1

    .line 1
    iget-object v0, p0, LY/y0;->f:LY/U0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LY/y0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LY/E1;
    .locals 1

    .line 1
    iget-object v0, p0, LY/y0;->c:LY/E1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, LY/y0;->e:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, LY/y0;->b:LY/Q;

    .line 4
    .line 5
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v1, LY/B;

    .line 11
    .line 12
    iget-object v2, p0, LY/y0;->d:LY/b;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, LY/B;->M(LY/b;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v0, v1}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, LY/y0;->e:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method
