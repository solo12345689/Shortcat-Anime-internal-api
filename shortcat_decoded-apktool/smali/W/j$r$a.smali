.class final LW/j$r$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW/j$r;->invoke(Lp0/f;)Lp0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/i1;

.field final synthetic b:Ls0/t0;


# direct methods
.method constructor <init>(Ls0/i1;Ls0/t0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW/j$r$a;->a:Ls0/i1;

    .line 2
    .line 3
    iput-object p2, p0, LW/j$r$a;->b:Ls0/t0;

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
    check-cast p1, Lu0/f;

    invoke-virtual {p0, p1}, LW/j$r$a;->invoke(Lu0/f;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Lu0/f;)V
    .locals 10

    .line 2
    iget-object v1, p0, LW/j$r$a;->a:Ls0/i1;

    iget-object v0, p0, LW/j$r$a;->b:Ls0/t0;

    invoke-interface {v0}, Ls0/t0;->a()J

    move-result-wide v2

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Ls0/j1;->e(Lu0/f;Ls0/i1;JFLu0/g;Landroidx/compose/ui/graphics/d;IILjava/lang/Object;)V

    return-void
.end method
