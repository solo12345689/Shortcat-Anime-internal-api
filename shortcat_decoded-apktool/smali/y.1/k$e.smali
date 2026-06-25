.class final Ly/k$e;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/k;->d(Landroidx/compose/ui/window/s;Lie/a;Landroidx/compose/ui/e;Ly/b;Lkotlin/jvm/functions/Function1;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly/b;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Ly/b;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly/k$e;->a:Ly/b;

    .line 2
    .line 3
    iput-object p2, p0, Ly/k$e;->b:Landroidx/compose/ui/e;

    .line 4
    .line 5
    iput-object p3, p0, Ly/k$e;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
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

    invoke-virtual {p0, p1, p2}, Ly/k$e;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 2
    invoke-interface {p1}, LY/m;->i()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)"

    const v2, 0x2f709e7d

    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, Ly/k$e;->a:Ly/b;

    iget-object v4, p0, Ly/k$e;->b:Landroidx/compose/ui/e;

    new-instance p2, Ly/k$e$a;

    iget-object v0, p0, Ly/k$e;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p2, v0, v3}, Ly/k$e$a;-><init>(Lkotlin/jvm/functions/Function1;Ly/b;)V

    const/16 v0, 0x36

    const v1, 0x44f1a924

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v5

    const/16 v7, 0x180

    const/4 v8, 0x0

    move-object v6, p1

    invoke-static/range {v3 .. v8}, Ly/k;->a(Ly/b;Landroidx/compose/ui/e;Lie/o;LY/m;II)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LY/w;->T()V

    :cond_3
    return-void
.end method
