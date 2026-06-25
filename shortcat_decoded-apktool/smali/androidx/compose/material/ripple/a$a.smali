.class final Landroidx/compose/material/ripple/a$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/ripple/a;-><init>(ZFLY/h2;LY/h2;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/material/ripple/a;


# direct methods
.method constructor <init>(Landroidx/compose/material/ripple/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/material/ripple/a$a;->a:Landroidx/compose/material/ripple/a;

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
    invoke-virtual {p0}, Landroidx/compose/material/ripple/a$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/material/ripple/a$a;->a:Landroidx/compose/material/ripple/a;

    invoke-static {v0}, Landroidx/compose/material/ripple/a;->i(Landroidx/compose/material/ripple/a;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Landroidx/compose/material/ripple/a;->j(Landroidx/compose/material/ripple/a;Z)V

    return-void
.end method
