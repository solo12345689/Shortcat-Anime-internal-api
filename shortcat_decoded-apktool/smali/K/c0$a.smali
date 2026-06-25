.class final LK/c0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK/c0;->b(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK/c0;

.field final synthetic b:LU0/e$d;

.field final synthetic c:Landroidx/compose/ui/platform/v1;


# direct methods
.method constructor <init>(LK/c0;LU0/e$d;Landroidx/compose/ui/platform/v1;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/c0$a;->a:LK/c0;

    .line 2
    .line 3
    iput-object p2, p0, LK/c0$a;->b:LU0/e$d;

    .line 4
    .line 5
    iput-object p3, p0, LK/c0$a;->c:Landroidx/compose/ui/platform/v1;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK/c0$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, LK/c0$a;->a:LK/c0;

    iget-object v1, p0, LK/c0$a;->b:LU0/e$d;

    invoke-virtual {v1}, LU0/e$d;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LU0/j;

    iget-object v2, p0, LK/c0$a;->c:Landroidx/compose/ui/platform/v1;

    invoke-static {v0, v1, v2}, LK/c0;->l(LK/c0;LU0/j;Landroidx/compose/ui/platform/v1;)V

    return-void
.end method
