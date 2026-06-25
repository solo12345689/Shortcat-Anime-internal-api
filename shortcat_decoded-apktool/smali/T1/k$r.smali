.class final LT1/k$r;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT1/k;-><init>(LT1/E;Ljava/util/List;LT1/e;LGf/O;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT1/k;


# direct methods
.method constructor <init>(LT1/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT1/k$r;->a:LT1/k;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()LT1/F;
    .locals 1

    .line 1
    iget-object v0, p0, LT1/k$r;->a:LT1/k;

    .line 2
    .line 3
    invoke-static {v0}, LT1/k;->g(LT1/k;)LT1/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LT1/E;->a()LT1/F;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LT1/k$r;->a()LT1/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
