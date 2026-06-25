.class final LK0/J$j;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/J;->B()Landroidx/compose/ui/semantics/SemanticsConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LK0/J;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(LK0/J;Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/J$j;->a:LK0/J;

    .line 2
    .line 3
    iput-object p2, p0, LK0/J$j;->b:Lkotlin/jvm/internal/N;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK0/J$j;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 11

    .line 2
    iget-object v0, p0, LK0/J$j;->a:LK0/J;

    invoke-virtual {v0}, LK0/J;->t0()LK0/c0;

    move-result-object v0

    const/16 v1, 0x8

    .line 3
    invoke-static {v1}, LK0/g0;->a(I)I

    move-result v1

    .line 4
    iget-object v2, p0, LK0/J$j;->b:Lkotlin/jvm/internal/N;

    .line 5
    invoke-static {v0}, LK0/c0;->c(LK0/c0;)I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_a

    .line 6
    invoke-virtual {v0}, LK0/c0;->p()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_9

    .line 8
    instance-of v6, v4, LK0/A0;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    .line 9
    check-cast v4, LK0/A0;

    .line 10
    invoke-interface {v4}, LK0/A0;->Z()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 11
    new-instance v6, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    invoke-direct {v6}, Landroidx/compose/ui/semantics/SemanticsConfiguration;-><init>()V

    iput-object v6, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 12
    invoke-virtual {v6, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->y(Z)V

    .line 13
    :cond_0
    invoke-interface {v4}, LK0/A0;->z1()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 14
    iget-object v6, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v6, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    invoke-virtual {v6, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->z(Z)V

    .line 15
    :cond_1
    iget-object v6, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v6, LR0/C;

    invoke-interface {v4, v6}, LK0/A0;->Y(LR0/C;)V

    goto :goto_4

    .line 16
    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    .line 17
    instance-of v6, v4, LK0/m;

    if-eqz v6, :cond_8

    .line 18
    move-object v6, v4

    check-cast v6, LK0/m;

    .line 19
    invoke-virtual {v6}, LK0/m;->F1()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    if-eqz v6, :cond_7

    .line 20
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_3

    move-object v4, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    .line 21
    new-instance v5, La0/c;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v10, v8}, La0/c;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    .line 22
    invoke-virtual {v5, v4}, La0/c;->c(Ljava/lang/Object;)Z

    move-object v4, v3

    .line 23
    :cond_5
    invoke-virtual {v5, v6}, La0/c;->c(Ljava/lang/Object;)Z

    .line 24
    :cond_6
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->getChild$ui_release()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_2

    :cond_7
    if-ne v9, v7, :cond_8

    goto :goto_1

    .line 25
    :cond_8
    :goto_4
    invoke-static {v5}, LK0/k;->b(La0/c;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_1

    .line 26
    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->getParent$ui_release()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    return-void
.end method
