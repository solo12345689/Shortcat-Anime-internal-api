.class final Ly/k$e$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/k$e;->invoke(LY/m;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/functions/Function1;

.field final synthetic b:Ly/b;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Ly/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly/k$e$a;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iput-object p2, p0, Ly/k$e$a;->b:Ly/b;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LC/i;

    check-cast p2, LY/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ly/k$e$a;->invoke(LC/i;LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LC/i;LY/m;I)V
    .locals 2

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    .line 2
    invoke-interface {p2}, LY/m;->i()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p2}, LY/m;->K()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)"

    const v1, 0x44f1a924

    invoke-static {v1, p3, p1, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 5
    :cond_2
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    move-result-object p1

    .line 6
    sget-object p3, LY/m;->a:LY/m$a;

    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_3

    .line 7
    new-instance p1, Ly/g;

    invoke-direct {p1}, Ly/g;-><init>()V

    .line 8
    invoke-interface {p2, p1}, LY/m;->u(Ljava/lang/Object;)V

    .line 9
    :cond_3
    check-cast p1, Ly/g;

    .line 10
    iget-object p3, p0, Ly/k$e$a;->a:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ly/k$e$a;->b:Ly/b;

    .line 11
    invoke-virtual {p1}, Ly/g;->b()V

    .line 12
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p3, 0x0

    .line 13
    invoke-virtual {p1, v0, p2, p3}, Ly/g;->a(Ly/b;LY/m;I)V

    .line 14
    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LY/w;->T()V

    :cond_4
    return-void
.end method
