.class final LT1/k$u;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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
    iput-object p1, p0, LT1/k$u;->a:LT1/k;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LT1/k$u;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, LT1/k$u;->a:LT1/k;

    .line 3
    invoke-static {v0}, LT1/k;->d(LT1/k;)LT1/l;

    move-result-object v0

    new-instance v1, LT1/r;

    invoke-direct {v1, p1}, LT1/r;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LT1/l;->c(LT1/D;)LT1/D;

    .line 4
    :cond_0
    iget-object p1, p0, LT1/k$u;->a:LT1/k;

    invoke-static {p1}, LT1/k;->h(LT1/k;)Lkotlin/Lazy;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/Lazy;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, LT1/k$u;->a:LT1/k;

    invoke-virtual {p1}, LT1/k;->t()LT1/F;

    move-result-object p1

    invoke-interface {p1}, LT1/c;->close()V

    :cond_1
    return-void
.end method
