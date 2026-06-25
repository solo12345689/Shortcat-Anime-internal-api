.class final Landroidx/compose/ui/platform/L1$a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/L1$a;->a(Landroidx/compose/ui/platform/AndroidComposeView$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/L1;

.field final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/L1;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/L1$a$a;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
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

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/L1$a$a;->invoke(LY/m;I)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LY/m;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, LY/m;->p(ZI)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LY/w;->L()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)"

    const v4, 0x4f523a4f

    invoke-static {v4, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 2
    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/L1;->F()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object p2

    sget v0, Ll0/l;->K:I

    invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/V;->o(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Ljava/util/Set;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_6

    .line 3
    iget-object p2, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/L1;->F()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    instance-of v0, p2, Landroid/view/View;

    if-eqz v0, :cond_3

    check-cast p2, Landroid/view/View;

    goto :goto_2

    :cond_3
    move-object p2, v1

    :goto_2
    if-eqz p2, :cond_4

    sget v0, Ll0/l;->K:I

    invoke-virtual {p2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    goto :goto_3

    :cond_4
    move-object p2, v1

    :goto_3
    invoke-static {p2}, Lkotlin/jvm/internal/V;->o(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    check-cast p2, Ljava/util/Set;

    goto :goto_4

    :cond_5
    move-object p2, v1

    :cond_6
    :goto_4
    if-eqz p2, :cond_7

    .line 4
    invoke-interface {p1}, LY/m;->E()Lk0/e;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-interface {p1}, LY/m;->z()V

    .line 6
    :cond_7
    iget-object v0, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/L1;->F()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object v0

    iget-object v4, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    invoke-interface {p1, v4}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    .line 7
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_8

    .line 8
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_9

    .line 9
    :cond_8
    new-instance v6, Landroidx/compose/ui/platform/L1$a$a$a;

    invoke-direct {v6, v5, v1}, Landroidx/compose/ui/platform/L1$a$a$a;-><init>(Landroidx/compose/ui/platform/L1;LZd/e;)V

    .line 10
    invoke-interface {p1, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 11
    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v6, p1, v2}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 12
    iget-object v0, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/L1;->F()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object v0

    iget-object v4, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    invoke-interface {p1, v4}, LY/m;->F(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    .line 13
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_a

    .line 14
    sget-object v4, LY/m;->a:LY/m$a;

    invoke-virtual {v4}, LY/m$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_b

    .line 15
    :cond_a
    new-instance v6, Landroidx/compose/ui/platform/L1$a$a$b;

    invoke-direct {v6, v5, v1}, Landroidx/compose/ui/platform/L1$a$a$b;-><init>(Landroidx/compose/ui/platform/L1;LZd/e;)V

    .line 16
    invoke-interface {p1, v6}, LY/m;->u(Ljava/lang/Object;)V

    .line 17
    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v6, p1, v2}, LY/b0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LY/m;I)V

    .line 18
    invoke-static {}, Lk0/o;->c()LY/b1;

    move-result-object v0

    invoke-virtual {v0, p2}, LY/b1;->d(Ljava/lang/Object;)LY/c1;

    move-result-object p2

    new-instance v0, Landroidx/compose/ui/platform/L1$a$a$c;

    iget-object v1, p0, Landroidx/compose/ui/platform/L1$a$a;->a:Landroidx/compose/ui/platform/L1;

    iget-object v2, p0, Landroidx/compose/ui/platform/L1$a$a;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/L1$a$a$c;-><init>(Landroidx/compose/ui/platform/L1;Lkotlin/jvm/functions/Function2;)V

    const/16 v1, 0x36

    const v2, -0x10b420f1

    invoke-static {v2, v3, v0, p1, v1}, Lg0/i;->d(IZLjava/lang/Object;LY/m;I)Lg0/b;

    move-result-object v0

    sget v1, LY/c1;->i:I

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v0, p1, v1}, LY/H;->c(LY/c1;Lkotlin/jvm/functions/Function2;LY/m;I)V

    invoke-static {}, LY/w;->L()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LY/w;->T()V

    :cond_c
    return-void

    .line 19
    :cond_d
    invoke-interface {p1}, LY/m;->K()V

    return-void
.end method
