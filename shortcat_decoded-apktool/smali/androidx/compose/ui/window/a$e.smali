.class final Landroidx/compose/ui/window/a$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a;->a(Lie/a;Landroidx/compose/ui/window/k;Lkotlin/jvm/functions/Function2;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LY/h2;


# direct methods
.method constructor <init>(LY/h2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/a$e;->a:LY/h2;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/a$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 5

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, LY/m;->p(ZI)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:211)"

    const v4, 0x14ae31cc

    invoke-static {v4, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 2
    :cond_1
    sget-object p2, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 3
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v0

    .line 4
    sget-object v1, LY/m;->a:LY/m$a;

    invoke-virtual {v1}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 5
    sget-object v0, Landroidx/compose/ui/window/a$e$a;->a:Landroidx/compose/ui/window/a$e$a;

    .line 6
    invoke-interface {p1, v0}, LY/m;->u(Ljava/lang/Object;)V

    .line 7
    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {p2, v3, v0, v2, v1}, LR0/r;->f(Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, Landroidx/compose/ui/window/a$e;->a:LY/h2;

    invoke-static {v0}, Landroidx/compose/ui/window/a;->d(LY/h2;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {p2, v0, p1, v3, v3}, Landroidx/compose/ui/window/a;->e(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void

    .line 8
    :cond_4
    invoke-interface {p1}, LY/m;->K()V

    return-void
.end method
