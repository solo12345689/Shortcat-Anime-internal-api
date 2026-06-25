.class final Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->Q1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;


# direct methods
.method constructor <init>(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;->a:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

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
    invoke-virtual {p0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;->a:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    invoke-static {}, Landroidx/compose/material3/a;->a()LY/b1;

    move-result-object v1

    invoke-static {v0, v1}, LK0/i;->a(LK0/h;LY/D;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LU/M;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;->a:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    invoke-static {v0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->N1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;->a:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    invoke-static {v0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->M1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)LK0/j;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/material3/DelegatingThemeAwareRippleNode$c;->a:Landroidx/compose/material3/DelegatingThemeAwareRippleNode;

    invoke-static {v0}, Landroidx/compose/material3/DelegatingThemeAwareRippleNode;->K1(Landroidx/compose/material3/DelegatingThemeAwareRippleNode;)V

    :cond_1
    return-void
.end method
