.class final LE/t$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/t;->d(ILE/y;LE/w;IIIIIIFJZLC/b$m;LC/b$e;ZLi1/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;LGf/O;LY/C0;Ls0/Z0;Lkotlin/jvm/functions/Function1;Lie/o;)LE/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:LY/C0;


# direct methods
.method constructor <init>(Ljava/util/List;LY/C0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/t$b;->a:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, LE/t$b;->b:LY/C0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LE/t$b;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 4

    .line 2
    iget-object v0, p0, LE/t$b;->a:Ljava/util/List;

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 5
    check-cast v3, LE/v;

    .line 6
    invoke-virtual {v3, p1}, LE/v;->s(Landroidx/compose/ui/layout/s$a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, LE/t$b;->b:LY/C0;

    invoke-static {p1}, LF/J;->a(LY/C0;)V

    return-void
.end method
