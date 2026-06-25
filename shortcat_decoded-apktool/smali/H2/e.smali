.class public final LH2/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LH2/l;


# instance fields
.field private final a:LH2/l;

.field private final b:Ljava/util/List;


# direct methods
.method public constructor <init>(LH2/l;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH2/e;->a:LH2/l;

    .line 5
    .line 6
    iput-object p2, p0, LH2/e;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LH2/i;LH2/f;)LQ2/o$a;
    .locals 2

    .line 1
    new-instance v0, LL2/b;

    .line 2
    .line 3
    iget-object v1, p0, LH2/e;->a:LH2/l;

    .line 4
    .line 5
    invoke-interface {v1, p1, p2}, LH2/l;->a(LH2/i;LH2/f;)LQ2/o$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, LH2/e;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2}, LL2/b;-><init>(LQ2/o$a;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public b()LQ2/o$a;
    .locals 3

    .line 1
    new-instance v0, LL2/b;

    .line 2
    .line 3
    iget-object v1, p0, LH2/e;->a:LH2/l;

    .line 4
    .line 5
    invoke-interface {v1}, LH2/l;->b()LQ2/o$a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, LH2/e;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, LL2/b;-><init>(LQ2/o$a;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
