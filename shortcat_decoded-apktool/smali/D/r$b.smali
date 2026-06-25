.class final LD/r$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/r;->e(ILD/u;IIIIIIFJZLjava/util/List;LC/b$m;LC/b$e;ZLi1/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLD/q;LGf/O;LY/C0;Ls0/Z0;Lie/o;)LD/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LD/t;

.field final synthetic c:Z

.field final synthetic d:LY/C0;


# direct methods
.method constructor <init>(Ljava/util/List;LD/t;ZLY/C0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/r$b;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, LD/r$b;->b:LD/t;

    .line 4
    .line 5
    iput-boolean p3, p0, LD/r$b;->c:Z

    .line 6
    .line 7
    iput-object p4, p0, LD/r$b;->d:LY/C0;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LD/r$b;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 6

    .line 2
    iget-object v0, p0, LD/r$b;->a:Ljava/util/List;

    iget-object v1, p0, LD/r$b;->b:LD/t;

    iget-boolean v2, p0, LD/r$b;->c:Z

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    .line 4
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 5
    check-cast v5, LD/t;

    if-eq v5, v1, :cond_0

    .line 6
    invoke-virtual {v5, p1, v2}, LD/t;->p(Landroidx/compose/ui/layout/s$a;Z)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, LD/r$b;->b:LD/t;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, LD/r$b;->c:Z

    invoke-virtual {v0, p1, v1}, LD/t;->p(Landroidx/compose/ui/layout/s$a;Z)V

    .line 8
    :cond_2
    iget-object p1, p0, LD/r$b;->d:LY/C0;

    invoke-static {p1}, LF/J;->a(LY/C0;)V

    return-void
.end method
