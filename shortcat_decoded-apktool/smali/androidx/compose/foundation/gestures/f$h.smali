.class final Landroidx/compose/foundation/gestures/f$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;->m2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/gestures/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$h;->a:Landroidx/compose/foundation/gestures/f;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/f$h;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$h;->a:Landroidx/compose/foundation/gestures/f;

    invoke-static {}, Landroidx/compose/ui/platform/w0;->e()LY/b1;

    move-result-object v1

    invoke-static {v0, v1}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/d;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$h;->a:Landroidx/compose/foundation/gestures/f;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/f;->g2(Landroidx/compose/foundation/gestures/f;)Lz/h;

    move-result-object v1

    invoke-static {v0}, Lv/y;->c(Li1/d;)Lw/z;

    move-result-object v0

    invoke-virtual {v1, v0}, Lz/h;->f(Lw/z;)V

    return-void
.end method
